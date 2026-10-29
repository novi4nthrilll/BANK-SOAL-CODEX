package I1;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: I1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f348f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.g f350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f352d = new HashMap();
    public int e;

    public C0025a(io.flutter.embedding.engine.renderer.l lVar, boolean z2) {
        this.f349a = lVar;
        if (A0.g.f16g == null) {
            A0.g.f16g = new A0.g(6);
        }
        this.f350b = A0.g.f16g;
        this.f351c = z2;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        return i3 == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i6;
        int i7;
        long buttonState;
        int i8;
        long jIncrementAndGet;
        double min;
        double max;
        MotionEvent motionEvent2;
        double d3;
        double d4;
        double scaledVerticalScrollFactor;
        C0025a c0025a;
        float fC;
        InputDevice.MotionRange motionRange;
        if (i4 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i3);
        int toolType = motionEvent.getToolType(i3);
        if (toolType == 1) {
            i6 = 0;
        } else if (toolType != 2) {
            i6 = 3;
            if (toolType == 3) {
                i6 = 1;
            } else if (toolType != 4) {
                i6 = 5;
            }
        } else {
            i6 = 2;
        }
        float[] fArr = {motionEvent.getX(i3), motionEvent.getY(i3)};
        matrix.mapPoints(fArr);
        HashMap map = this.f352d;
        if (i6 == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194) {
                i7 = 4;
                if (i4 == 4) {
                    map.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 4;
            buttonState = i6 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = map.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            if (i4 == i7) {
                i8 = 7;
            } else if (i4 == 5) {
                i8 = 8;
            } else {
                i8 = (i4 == 6 || i4 == 0) ? 9 : -1;
            }
            if (i8 == -1) {
                return;
            }
        } else {
            i8 = -1;
        }
        if (this.f351c) {
            A0.g gVar = this.f350b;
            gVar.getClass();
            jIncrementAndGet = E.f346b.incrementAndGet();
            ((LongSparseArray) gVar.e).put(jIncrementAndGet, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) gVar.f19f).add(Long.valueOf(jIncrementAndGet));
        } else {
            jIncrementAndGet = 0;
        }
        int i9 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long j3 = buttonState;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jIncrementAndGet);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i4);
            byteBuffer.putLong(i6);
        }
        byteBuffer.putLong(i9);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j3);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i3));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (i6 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i3));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i3));
        byteBuffer.putDouble(motionEvent.getToolMajor(i3));
        byteBuffer.putDouble(motionEvent.getToolMinor(i3));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i3));
        if (i6 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i3));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i5);
        if (i9 == 1) {
            if (context != null) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    fC = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c0025a = this;
                } else {
                    c0025a = this;
                    fC = c0025a.c(context);
                }
                d4 = fC;
                scaledVerticalScrollFactor = i10 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0025a.c(context);
            } else {
                d4 = 48.0d;
                scaledVerticalScrollFactor = 48.0d;
            }
            double d5 = d4 * ((double) (-motionEvent2.getAxisValue(10, i3)));
            double d6 = scaledVerticalScrollFactor * ((double) (-motionEvent2.getAxisValue(9, i3)));
            byteBuffer.putDouble(d5);
            byteBuffer.putDouble(d6);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) map.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d3 = 0.0d;
        } else {
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d3);
        byteBuffer.putLong(0L);
        if (zContainsKey && i8 == 9) {
            map.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }
}
