package S2;

import R2.l;
import Y.C0113h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1612a;

    public /* synthetic */ e(int i3) {
        this.f1612a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1612a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                l lVar = ((d) obj).f1607a;
                l lVar2 = ((d) obj2).f1607a;
                if (lVar == lVar2) {
                    return 0;
                }
                if (lVar == null) {
                    return -1;
                }
                if (lVar2 == null) {
                    return 1;
                }
                return lVar.compareTo(lVar2);
            default:
                C0113h c0113h = (C0113h) obj;
                C0113h c0113h2 = (C0113h) obj2;
                RecyclerView recyclerView = c0113h.f1887d;
                if ((recyclerView == null) != (c0113h2.f1887d == null)) {
                    if (recyclerView == null) {
                        return 1;
                    }
                    return -1;
                }
                boolean z2 = c0113h.f1884a;
                if (z2 != c0113h2.f1884a) {
                    if (z2) {
                        return -1;
                    }
                    return 1;
                }
                int i3 = c0113h2.f1885b - c0113h.f1885b;
                if (i3 != 0) {
                    return i3;
                }
                int i4 = c0113h.f1886c - c0113h2.f1886c;
                if (i4 != 0) {
                    return i4;
                }
                return 0;
        }
    }
}
