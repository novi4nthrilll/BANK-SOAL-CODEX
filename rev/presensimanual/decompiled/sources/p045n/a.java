package p045n;

import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5351d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f5351d = i3;
        this.e = obj;
    }

    @Override // p045n.k
    public final void b() {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((b) this.e).clear();
                break;
            default:
                ((c) this.e).clear();
                break;
        }
    }

    @Override // p045n.k
    public final Object c(int i3, int i4) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((b) this.e).e[(i3 << 1) + i4];
            default:
                return ((c) this.e).e[i3];
        }
    }

    @Override // p045n.k
    public final Map d() {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return (b) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // p045n.k
    public final int e() {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((b) this.e).f5389f;
            default:
                return ((c) this.e).f5360f;
        }
    }

    @Override // p045n.k
    public final int f(Object obj) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((b) this.e).d(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    @Override // p045n.k
    public final int g(Object obj) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((b) this.e).f(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    @Override // p045n.k
    public final void h(Object obj, Object obj2) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((b) this.e).put(obj, obj2);
                break;
            default:
                ((c) this.e).add(obj);
                break;
        }
    }

    @Override // p045n.k
    public final void i(int i3) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((b) this.e).h(i3);
                break;
            default:
                ((c) this.e).g(i3);
                break;
        }
    }

    @Override // p045n.k
    public final Object j(int i3, Object obj) {
        switch (this.f5351d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i4 = (i3 << 1) + 1;
                Object[] objArr = ((b) this.e).e;
                Object obj2 = objArr[i4];
                objArr[i4] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
