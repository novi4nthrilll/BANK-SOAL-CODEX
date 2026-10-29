package k;

import android.widget.TextView;

/* JADX INFO: renamed from: k.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0767z {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i3, int i4, int i5, int i6) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
    }

    public static void c(TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
