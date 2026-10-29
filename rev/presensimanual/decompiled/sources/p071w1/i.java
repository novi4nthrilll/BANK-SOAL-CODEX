package p071w1;

import E0.h;
import android.content.Context;
import java.util.UUID;
import p040l1.a;
import p040l1.j;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5792b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5793a;

    static {
        h hVarA = a.a(i.class);
        hVarA.a(new j(1, 0, f.class));
        hVarA.a(new j(1, 0, Context.class));
        hVarA.f215h = new b(11);
        f5792b = hVarA.b();
    }

    public i(Context context) {
        this.f5793a = context;
    }

    public final synchronized String a() {
        String string = this.f5793a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f5793a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
