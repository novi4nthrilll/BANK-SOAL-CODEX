package W1;

import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements S1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1788d;
    public final /* synthetic */ String e;

    public /* synthetic */ t(p065t0.e eVar, String str, int i3) {
        this.f1788d = i3;
        this.e = str;
    }

    @Override // S1.c
    public final void e(Object obj) {
        switch (this.f1788d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!(obj instanceof List)) {
                    p013d1.D.a(this.e);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        new u((String) list.get(0), (String) list.get(1), list.get(2));
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    p013d1.D.a(this.e);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        new u((String) list2.get(0), (String) list2.get(1), list2.get(2));
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    p013d1.D.a(this.e);
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        new u((String) list3.get(0), (String) list3.get(1), list3.get(2));
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    p013d1.D.a(this.e);
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        new u((String) list4.get(0), (String) list4.get(1), list4.get(2));
                    }
                }
                break;
        }
    }
}
