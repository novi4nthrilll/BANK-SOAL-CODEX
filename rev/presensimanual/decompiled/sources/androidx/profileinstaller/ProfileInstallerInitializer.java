package androidx.profileinstaller;

import L0.g;
import W.j;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p001a0.b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // p001a0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // p001a0.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new g(6);
        }
        j.a(new W.g(0, this, context.getApplicationContext()));
        return new g(6);
    }
}
