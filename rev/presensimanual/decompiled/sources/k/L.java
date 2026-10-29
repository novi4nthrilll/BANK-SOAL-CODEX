package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f5054l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f5055m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5056a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5057b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5058c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5059d = -1.0f;
    public float e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f5060f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5061g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f5062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f5063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f5064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K f5065k;

    static {
        new ConcurrentHashMap();
    }

    public L(TextView textView) {
        this.f5063i = textView;
        this.f5064j = textView.getContext();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.f5065k = new J();
        } else if (i3 >= 23) {
            this.f5065k = new I();
        } else {
            this.f5065k = new K();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f5055m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final void a() {
        if (this.f5056a != 0) {
            if (this.f5057b) {
                if (this.f5063i.getMeasuredHeight() <= 0 || this.f5063i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5065k.b(this.f5063i) ? 1048576 : (this.f5063i.getMeasuredWidth() - this.f5063i.getTotalPaddingLeft()) - this.f5063i.getTotalPaddingRight();
                int height = (this.f5063i.getHeight() - this.f5063i.getCompoundPaddingBottom()) - this.f5063i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5054l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f5063i.getTextSize()) {
                            f(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f5057b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f5060f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f5060f[i6];
            TextView textView = this.f5063i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int i8 = Build.VERSION.SDK_INT;
            int iB = F.b(textView);
            TextPaint textPaint = this.f5062h;
            if (textPaint == null) {
                this.f5062h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f5062h.set(textView.getPaint());
            this.f5062h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            StaticLayout staticLayoutA = i8 >= 23 ? H.a(charSequence, alignment, iRound, iB, textView, this.f5062h, this.f5065k) : F.a(charSequence, alignment, iRound, textView, this.f5062h);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i9 = i6 + 1;
                i5 = i4;
                i4 = i9;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f5060f[i5];
    }

    public final void f(int i3, float f3) {
        Context context = this.f5064j;
        float fApplyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f5063i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = G.a(textView);
            if (textView.getLayout() != null) {
                this.f5057b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f5056a == 1) {
            if (!this.f5061g || this.f5060f.length == 0) {
                int iFloor = ((int) Math.floor((this.e - this.f5059d) / this.f5058c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f5058c) + this.f5059d);
                }
                this.f5060f = b(iArr);
            }
            this.f5057b = true;
        } else {
            this.f5057b = false;
        }
        return this.f5057b;
    }

    public final boolean h() {
        int[] iArr = this.f5060f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f5061g = z2;
        if (z2) {
            this.f5056a = 1;
            this.f5059d = iArr[0];
            this.e = iArr[length - 1];
            this.f5058c = -1.0f;
        }
        return z2;
    }

    public final void i(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f5056a = 1;
        this.f5059d = f3;
        this.e = f4;
        this.f5058c = f5;
        this.f5061g = false;
    }
}
