package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class m extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f4744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4745c;

    public m(Context context, p pVar, Context context2) {
        super(context);
        this.f4743a = pVar;
        this.f4745c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
            if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                return this.f4745c.getSystemService(str);
            }
        }
        if (this.f4744b == null) {
            this.f4744b = this.f4743a;
        }
        return this.f4744b;
    }
}
