package E0;

import W1.C0104l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.media.Image;
import android.media.ImageReader;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0198e7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0208f7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0325r5;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0379x;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0399z;
import com.google.android.gms.internal.mlkit_vision_face_bundled.H7;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p016e1.C0687u4;
import p016e1.C0716z3;
import p016e1.L;
import p016e1.U4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements G0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f217d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f219g;

    public i() {
        this.f217d = 1;
        this.f218f = new Object[8];
        this.e = 0;
    }

    public static i a(Resources resources, int i3, Resources.Theme theme) {
        int next;
        float f3;
        float f4;
        C0104l c0104l;
        int i4;
        Object radialGradient;
        int i5 = 5;
        XmlResourceParser xml = resources.getXml(i3);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = p060s.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new i(colorStateListB.getDefaultColor(), i5, obj, colorStateListB);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = p060s.b.h(resources, theme, attributeSetAsAttributeSet, p050p.a.f5534d);
        float f5 = !p060s.b.e(xml, "startX") ? 0.0f : typedArrayH.getFloat(8, 0.0f);
        float f6 = !p060s.b.e(xml, "startY") ? 0.0f : typedArrayH.getFloat(9, 0.0f);
        float f7 = !p060s.b.e(xml, "endX") ? 0.0f : typedArrayH.getFloat(10, 0.0f);
        float f8 = !p060s.b.e(xml, "endY") ? 0.0f : typedArrayH.getFloat(11, 0.0f);
        float f9 = !p060s.b.e(xml, "centerX") ? 0.0f : typedArrayH.getFloat(3, 0.0f);
        float f10 = !p060s.b.e(xml, "centerY") ? 0.0f : typedArrayH.getFloat(4, 0.0f);
        int i6 = !p060s.b.e(xml, "type") ? 0 : typedArrayH.getInt(2, 0);
        int color = !p060s.b.e(xml, "startColor") ? 0 : typedArrayH.getColor(0, 0);
        boolean zE = p060s.b.e(xml, "centerColor");
        int color2 = !p060s.b.e(xml, "centerColor") ? 0 : typedArrayH.getColor(7, 0);
        int color3 = !p060s.b.e(xml, "endColor") ? 0 : typedArrayH.getColor(1, 0);
        int i7 = !p060s.b.e(xml, "tileMode") ? 0 : typedArrayH.getInt(6, 0);
        float f11 = !p060s.b.e(xml, "gradientRadius") ? 0.0f : typedArrayH.getFloat(5, 0.0f);
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f3 = f10;
            if (next2 == 1) {
                f4 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f4 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayH2 = p060s.b.h(resources, theme, attributeSetAsAttributeSet, p050p.a.e);
                boolean zHasValue = typedArrayH2.hasValue(0);
                boolean zHasValue2 = typedArrayH2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayH2.getColor(0, 0);
                float f13 = typedArrayH2.getFloat(1, 0.0f);
                typedArrayH2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f10 = f3;
            f6 = f4;
        }
        if (arrayList2.size() > 0) {
            c0104l = new C0104l();
            int size = arrayList2.size();
            c0104l.e = new int[size];
            c0104l.f1774d = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                ((int[]) c0104l.e)[i8] = ((Integer) arrayList2.get(i8)).intValue();
                ((float[]) c0104l.f1774d)[i8] = ((Float) arrayList.get(i8)).floatValue();
            }
        } else {
            c0104l = null;
        }
        if (c0104l != null) {
            i4 = 2;
        } else if (zE) {
            c0104l = new C0104l();
            c0104l.e = new int[]{color, color2, color3};
            c0104l.f1774d = new float[]{0.0f, 0.5f, 1.0f};
            i4 = 2;
        } else {
            c0104l = new C0104l();
            c0104l.e = new int[]{color, color3};
            i4 = 2;
            c0104l.f1774d = new float[]{0.0f, 1.0f};
        }
        if (i6 == 1) {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f12, f3, f11, (int[]) c0104l.e, (float[]) c0104l.f1774d, i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != i4) {
            radialGradient = new LinearGradient(f5, f4, f7, f8, (int[]) c0104l.e, (float[]) c0104l.f1774d, i7 != 1 ? i7 != i4 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            radialGradient = new SweepGradient(f12, f3, (int[]) c0104l.e, (float[]) c0104l.f1774d);
        }
        return new i(0, 5, radialGradient, null);
    }

    public static ArrayList d(Image image) {
        ArrayList arrayList = new ArrayList();
        for (Image.Plane plane : image.getPlanes()) {
            ByteBuffer buffer = plane.getBuffer();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr, 0, iRemaining);
            HashMap map = new HashMap();
            map.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
            map.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
            map.put("bytes", bArr);
            arrayList.add(map);
        }
        return arrayList;
    }

    public boolean b() {
        ColorStateList colorStateList;
        return ((Shader) this.f218f) == null && (colorStateList = (ColorStateList) this.f219g) != null && colorStateList.isStateful();
    }

    public ArrayList c(Image image) {
        ArrayList arrayList = new ArrayList();
        Image.Plane[] planes = image.getPlanes();
        int width = image.getWidth();
        int height = image.getHeight();
        ((p071w1.b) this.f219g).getClass();
        int i3 = width * height;
        byte[] bArr = new byte[((i3 / 4) * 2) + i3];
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i4 = (i3 * 2) / 4;
        boolean z2 = buffer2.remaining() == i4 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z2) {
            planes[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planes[1].getBuffer();
            planes[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i4 - 1);
        } else {
            p071w1.b.e(planes[0], width, height, bArr, 0, 1);
            p071w1.b.e(planes[1], width, height, bArr, i3 + 1, 2);
            p071w1.b.e(planes[2], width, height, bArr, i3, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        HashMap map = new HashMap();
        map.put("bytesPerRow", Integer.valueOf(image.getWidth()));
        map.put("bytesPerPixel", 1);
        map.put("bytes", byteBufferWrap.array());
        arrayList.add(map);
        return arrayList;
    }

    public void e(String str, L0.c cVar) {
        int i3 = this.e + 1;
        Object[] objArr = (Object[]) this.f218f;
        int length = objArr.length;
        int i4 = i3 + i3;
        if (i4 > length) {
            if (i4 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i5 = length + (length >> 1) + 1;
            if (i5 < i4) {
                int iHighestOneBit = Integer.highestOneBit(i4 - 1);
                i5 = iHighestOneBit + iHighestOneBit;
            }
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            this.f218f = Arrays.copyOf(objArr, i5);
        }
        Object[] objArr2 = (Object[]) this.f218f;
        int i6 = this.e;
        int i7 = i6 + i6;
        objArr2[i7] = str;
        objArr2[i7 + 1] = cVar;
        this.e = i6 + 1;
    }

    public byte[] f() {
        switch (this.f217d) {
            case 2:
                ((C0198e7) this.f219g).f3045h = false;
                C0198e7 c0198e7 = (C0198e7) this.f219g;
                c0198e7.f3043f = Boolean.FALSE;
                C0208f7 c0208f7 = new C0208f7(c0198e7);
                C0399z c0399z = (C0399z) this.f218f;
                c0399z.f3504a = c0208f7;
                try {
                    H7.e();
                    H7 h7 = H7.f2809c;
                    C0325r5 c0325r5 = new C0325r5(c0399z);
                    C0399z c0399z2 = new C0399z();
                    c0399z2.f3504a = new HashMap();
                    c0399z2.f3505b = new HashMap();
                    c0399z2.f3506c = C0399z.f3503d;
                    h7.c(c0399z2);
                    HashMap map = new HashMap((HashMap) c0399z2.f3504a);
                    HashMap map2 = new HashMap((HashMap) c0399z2.f3505b);
                    C0379x c0379x = (C0379x) c0399z2.f3506c;
                    C0399z c0399z3 = new C0399z();
                    c0399z3.f3504a = map;
                    c0399z3.f3505b = map2;
                    c0399z3.f3506c = c0379x;
                    return c0399z3.b(c0325r5);
                } catch (UnsupportedEncodingException e) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                }
            default:
                ((C0198e7) this.f219g).f3045h = false;
                C0198e7 c0198e8 = (C0198e7) this.f219g;
                c0198e8.f3043f = Boolean.FALSE;
                C0687u4 c0687u4 = new C0687u4(c0198e8);
                k kVar = (k) this.f218f;
                kVar.f226d = c0687u4;
                try {
                    U4.b();
                    U4 u4 = U4.f4134c;
                    C0716z3 c0716z3 = new C0716z3(kVar);
                    L l3 = new L();
                    u4.a(l3);
                    return new L(new HashMap(l3.f4075a), new HashMap(l3.f4076b), l3.f4077c).b(c0716z3);
                } catch (UnsupportedEncodingException e3) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                }
        }
    }

    @Override // G0.b
    public Object n() {
        ((j) this.f218f).f223d.a((p079z0.b) this.f219g, this.e + 1, false);
        return null;
    }

    public /* synthetic */ i(int i3, int i4, Object obj, Object obj2) {
        this.f217d = i4;
        this.f218f = obj;
        this.f219g = obj2;
        this.e = i3;
    }

    public i(k kVar, int i3) {
        this.f217d = 3;
        this.f219g = new C0198e7();
        this.f218f = kVar;
        U4.b();
        this.e = i3;
    }

    public i(C0399z c0399z, int i3) {
        this.f217d = 2;
        this.f219g = new C0198e7();
        this.f218f = c0399z;
        H7.e();
        this.e = i3;
    }

    public i(int i3, int i4, int i5) {
        this.f217d = 4;
        this.e = i5;
        this.f218f = ImageReader.newInstance(i3, i4, i5 == 17 ? 35 : i5, 1);
        this.f219g = new p071w1.b(8);
    }
}
