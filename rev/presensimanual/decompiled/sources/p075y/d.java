package p075y;

import android.content.Context;
import java.util.concurrent.Callable;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D0.d f5843d;
    public final /* synthetic */ int e;

    public /* synthetic */ d(String str, Context context, D0.d dVar, int i3, int i4) {
        this.f5840a = i4;
        this.f5841b = str;
        this.f5842c = context;
        this.f5843d = dVar;
        this.e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5840a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return g.a(this.f5841b, this.f5842c, this.f5843d, this.e);
            default:
                try {
                    return g.a(this.f5841b, this.f5842c, this.f5843d, this.e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
