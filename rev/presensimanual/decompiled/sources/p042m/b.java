package p042m;

import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5336d;
    public c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5337f;

    public b(c cVar, c cVar2, int i3) {
        this.f5337f = i3;
        this.f5336d = cVar2;
        this.e = cVar;
    }

    @Override // p042m.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f5336d == cVar && cVar == this.e) {
            this.e = null;
            this.f5336d = null;
        }
        c cVar3 = this.f5336d;
        if (cVar3 == cVar) {
            switch (this.f5337f) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    cVar2 = cVar3.f5340g;
                    break;
                default:
                    cVar2 = cVar3.f5339f;
                    break;
            }
            this.f5336d = cVar2;
        }
        c cVar4 = this.e;
        if (cVar4 == cVar) {
            c cVar5 = this.f5336d;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.e = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f5337f) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return cVar.f5339f;
            default:
                return cVar.f5340g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.e;
        c cVar2 = this.f5336d;
        this.e = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
