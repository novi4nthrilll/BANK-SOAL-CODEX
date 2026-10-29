package B;

import W1.C0095c;
import android.app.ActivityManager;
import android.hardware.camera2.params.SessionConfiguration;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: B.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0004e {
    public static /* bridge */ /* synthetic */ boolean A(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* synthetic */ ActivityManager.TaskDescription c(String str, int i3) {
        return new ActivityManager.TaskDescription(str, 0, i3);
    }

    public static /* synthetic */ SessionConfiguration i(ArrayList arrayList, ExecutorService executorService, C0095c c0095c) {
        return new SessionConfiguration(0, arrayList, executorService, c0095c);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout m(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ void r() {
    }
}
