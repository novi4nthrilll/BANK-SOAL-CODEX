package C1;

import org.tensorflow.lite.nnapi.NnApiDelegate;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p040l1.c {
    public static final /* synthetic */ j e = new j(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j f166f = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f167d;

    public /* synthetic */ j(int i3) {
        this.f167d = i3;
    }

    @Override // p040l1.c
    public final Object h(s sVar) {
        switch (this.f167d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new e((p071w1.f) sVar.a(p071w1.f.class));
            default:
                return new d((e) sVar.a(e.class), (p071w1.d) sVar.a(p071w1.d.class));
        }
    }
}
