package K0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f737c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f738d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f739a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f740b;

    public a(Context context) {
        this.f740b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f739a;
        reentrantLock.lock();
        try {
            return this.f740b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
