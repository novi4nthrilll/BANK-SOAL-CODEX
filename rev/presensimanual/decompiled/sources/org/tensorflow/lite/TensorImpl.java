package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
final class TensorImpl implements Tensor {
    private final DataType dtype;
    private long nativeHandle;
    private final Tensor.QuantizationParams quantizationParamsCopy;
    private int[] shapeCopy;
    private final int[] shapeSignatureCopy;

    private TensorImpl(long j3) {
        this.nativeHandle = j3;
        this.dtype = DataTypeUtils.fromC(dtype(j3));
        this.shapeCopy = shape(j3);
        this.shapeSignatureCopy = shapeSignature(j3);
        this.quantizationParamsCopy = new Tensor.QuantizationParams(quantizationScale(j3), quantizationZeroPoint(j3));
    }

    private ByteBuffer buffer() {
        return buffer(this.nativeHandle).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer buffer(long j3);

    public static int computeNumDimensions(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return computeNumDimensions(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    public static int computeNumElements(int[] iArr) {
        int i3 = 1;
        for (int i4 : iArr) {
            i3 *= i4;
        }
        return i3;
    }

    private int[] computeShapeOf(Object obj) {
        int iComputeNumDimensions = computeNumDimensions(obj);
        if (this.dtype == DataType.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iComputeNumDimensions--;
                }
            }
        }
        int[] iArr = new int[iComputeNumDimensions];
        fillShape(obj, 0, iArr);
        return iArr;
    }

    private static native long create(long j3, int i3, int i4);

    private static native long createSignatureInputTensor(long j3, String str);

    private static native long createSignatureOutputTensor(long j3, String str);

    private static native void delete(long j3);

    private static native int dtype(long j3);

    public static void fillShape(Object obj, int i3, int[] iArr) {
        if (iArr == null || i3 == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i4 = iArr[i3];
        if (i4 == 0) {
            iArr[i3] = length;
        } else if (i4 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i3]), Integer.valueOf(length), Integer.valueOf(i3)));
        }
        int i5 = i3 + 1;
        if (i5 == iArr.length) {
            return;
        }
        for (int i6 = 0; i6 < length; i6++) {
            fillShape(Array.get(obj, i6), i5, iArr);
        }
    }

    public static TensorImpl fromIndex(long j3, int i3) {
        return new TensorImpl(create(j3, i3, 0));
    }

    public static TensorImpl fromSignatureInput(long j3, String str) {
        return new TensorImpl(createSignatureInputTensor(j3, str));
    }

    public static TensorImpl fromSignatureOutput(long j3, String str) {
        return new TensorImpl(createSignatureOutputTensor(j3, str));
    }

    private static native boolean hasDelegateBufferHandle(long j3);

    private static native int index(long j3);

    private static boolean isBuffer(Object obj) {
        return obj instanceof Buffer;
    }

    private static boolean isByteBuffer(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private static native String name(long j3);

    private static native int numBytes(long j3);

    private static native float quantizationScale(long j3);

    private static native int quantizationZeroPoint(long j3);

    private static native void readMultiDimensionalArray(long j3, Object obj);

    private static native int[] shape(long j3);

    private static native int[] shapeSignature(long j3);

    private void throwIfDstShapeIsIncompatible(Object obj) {
        if (isBuffer(obj)) {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            return;
        }
        String strName = name();
        String string = Arrays.toString(this.shapeCopy);
        String string2 = Arrays.toString(iArrComputeShapeOf);
        StringBuilder sb = new StringBuilder("Cannot copy from a TensorFlowLite tensor (");
        sb.append(strName);
        sb.append(") with shape ");
        sb.append(string);
        sb.append(" to a Java object with shape ");
        throw new IllegalArgumentException(I.h(sb, string2, "."));
    }

    private void throwIfSrcShapeIsIncompatible(Object obj) {
        if (isBuffer(obj)) {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            return;
        }
        String strName = name();
        String string = Arrays.toString(this.shapeCopy);
        String string2 = Arrays.toString(iArrComputeShapeOf);
        StringBuilder sb = new StringBuilder("Cannot copy to a TensorFlowLite tensor (");
        sb.append(strName);
        sb.append(") with shape ");
        sb.append(string);
        sb.append(" from a Java object with shape ");
        throw new IllegalArgumentException(I.h(sb, string2, "."));
    }

    private void throwIfTypeIsIncompatible(Object obj) {
        DataType dataTypeDataTypeOf;
        if (isByteBuffer(obj) || (dataTypeDataTypeOf = dataTypeOf(obj)) == this.dtype || DataTypeUtils.toStringName(dataTypeDataTypeOf).equals(DataTypeUtils.toStringName(this.dtype))) {
            return;
        }
        throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + this.dtype + " and a Java object of type " + obj.getClass().getName() + " (which is compatible with the TensorFlowLite type " + dataTypeDataTypeOf + ").");
    }

    private static native void writeDirectBuffer(long j3, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j3, Object obj);

    private static native void writeScalar(long j3, Object obj);

    @Override // org.tensorflow.lite.Tensor
    public ByteBuffer asReadOnlyBuffer() {
        return buffer().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    public void close() {
        delete(this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public void copyTo(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj);
        throwIfDstShapeIsIncompatible(obj);
        if (isBuffer(obj)) {
            copyTo((Buffer) obj);
        } else {
            readMultiDimensionalArray(this.nativeHandle, obj);
        }
    }

    @Override // org.tensorflow.lite.Tensor
    public DataType dataType() {
        return this.dtype;
    }

    public DataType dataTypeOf(Object obj) {
        Class<?> componentType = obj.getClass();
        if (componentType.isArray()) {
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (Float.TYPE.equals(componentType)) {
                return DataType.FLOAT32;
            }
            if (Integer.TYPE.equals(componentType)) {
                return DataType.INT32;
            }
            if (Short.TYPE.equals(componentType)) {
                return DataType.INT16;
            }
            if (Byte.TYPE.equals(componentType)) {
                DataType dataType = this.dtype;
                DataType dataType2 = DataType.STRING;
                return dataType == dataType2 ? dataType2 : DataType.UINT8;
            }
            if (Long.TYPE.equals(componentType)) {
                return DataType.INT64;
            }
            if (Boolean.TYPE.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        } else {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                return DataType.FLOAT32;
            }
            if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                return DataType.INT32;
            }
            if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                return DataType.INT16;
            }
            if (Byte.class.equals(componentType)) {
                return DataType.UINT8;
            }
            if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                return DataType.INT64;
            }
            if (Boolean.class.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }

    public int[] getInputShapeIfDifferent(Object obj) {
        if (obj == null || isBuffer(obj)) {
            return null;
        }
        throwIfTypeIsIncompatible(obj);
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (Arrays.equals(this.shapeCopy, iArrComputeShapeOf)) {
            return null;
        }
        return iArrComputeShapeOf;
    }

    @Override // org.tensorflow.lite.Tensor
    public int index() {
        return index(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public String name() {
        return name(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public int numBytes() {
        return numBytes(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public int numDimensions() {
        return this.shapeCopy.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public int numElements() {
        return computeNumElements(this.shapeCopy);
    }

    @Override // org.tensorflow.lite.Tensor
    public Tensor.QuantizationParams quantizationParams() {
        return this.quantizationParamsCopy;
    }

    public void refreshShape() {
        this.shapeCopy = shape(this.nativeHandle);
    }

    public void setTo(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj);
        throwIfSrcShapeIsIncompatible(obj);
        if (isBuffer(obj)) {
            setTo((Buffer) obj);
            return;
        }
        if (this.dtype == DataType.STRING && this.shapeCopy.length == 0) {
            writeScalar(this.nativeHandle, obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.nativeHandle, obj);
        } else {
            writeScalar(this.nativeHandle, obj);
        }
    }

    @Override // org.tensorflow.lite.Tensor
    public int[] shape() {
        return this.shapeCopy;
    }

    @Override // org.tensorflow.lite.Tensor
    public int[] shapeSignature() {
        return this.shapeSignatureCopy;
    }

    private void copyTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(buffer());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(buffer().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(buffer().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(buffer().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(buffer().asShortBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    private void setTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (buffer instanceof ShortBuffer) {
            ShortBuffer shortBuffer = (ShortBuffer) buffer;
            if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asShortBuffer().put(shortBuffer);
                return;
            }
        }
        throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
    }
}
