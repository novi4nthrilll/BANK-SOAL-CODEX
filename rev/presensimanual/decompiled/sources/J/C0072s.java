package J;

import I2.C0045p;
import java.util.Set;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072s implements L2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f666d;
    public final /* synthetic */ L2.e e;

    public /* synthetic */ C0072s(L2.e eVar, int i3) {
        this.f666d = i3;
        this.e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // L2.e
    public final Object c(Object obj, p063s2.d dVar) throws Throwable {
        r rVar;
        p046n2.z zVar;
        switch (this.f666d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (dVar instanceof r) {
                    rVar = (r) dVar;
                    int i3 = rVar.f664h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rVar.f664h = i3 - Integer.MIN_VALUE;
                    } else {
                        rVar = new r(this, dVar);
                    }
                } else {
                    rVar = new r(this, dVar);
                }
                Object obj2 = rVar.f663g;
                t2.a aVar = t2.a.f5737d;
                int i4 = rVar.f664h;
                if (i4 == 0) {
                    AbstractC0449g3.b(obj2);
                    a0 a0Var = (a0) obj;
                    if (a0Var instanceof T) {
                        throw ((T) a0Var).f587b;
                    }
                    if (!(a0Var instanceof C0057c)) {
                        if (a0Var instanceof Q ? true : a0Var instanceof b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new C0045p();
                    }
                    Object obj3 = ((C0057c) a0Var).f611b;
                    rVar.f664h = 1;
                    if (this.e.c(obj3, rVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj2);
                }
                return p055q2.g.f5603a;
            default:
                if (dVar instanceof p046n2.z) {
                    zVar = (p046n2.z) dVar;
                    int i5 = zVar.f5510h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zVar.f5510h = i5 - Integer.MIN_VALUE;
                    } else {
                        zVar = new p046n2.z(this, dVar);
                    }
                } else {
                    zVar = new p046n2.z(this, dVar);
                }
                Object obj4 = zVar.f5509g;
                t2.a aVar2 = t2.a.f5737d;
                int i6 = zVar.f5510h;
                if (i6 == 0) {
                    AbstractC0449g3.b(obj4);
                    Set setKeySet = ((N.b) obj).a().keySet();
                    zVar.f5510h = 1;
                    if (this.e.c(setKeySet, zVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj4);
                }
                return p055q2.g.f5603a;
        }
    }
}
