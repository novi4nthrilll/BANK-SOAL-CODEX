package W1;

import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class s implements I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1786d;
    public final /* synthetic */ ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A0.g f1787f;

    public /* synthetic */ s(ArrayList arrayList, A0.g gVar, int i3) {
        this.f1786d = i3;
        this.e = arrayList;
        this.f1787f = gVar;
    }

    public void a() {
        switch (this.f1786d) {
            case 2:
                ArrayList arrayList = this.e;
                arrayList.add(0, null);
                this.f1787f.e(arrayList);
                break;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                ArrayList arrayList2 = this.e;
                arrayList2.add(0, null);
                this.f1787f.e(arrayList2);
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                ArrayList arrayList3 = this.e;
                arrayList3.add(0, null);
                this.f1787f.e(arrayList3);
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
            default:
                ArrayList arrayList4 = this.e;
                arrayList4.add(0, null);
                this.f1787f.e(arrayList4);
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ArrayList arrayList5 = this.e;
                arrayList5.add(0, null);
                this.f1787f.e(arrayList5);
                break;
        }
    }

    public void b(Object obj) {
        switch (this.f1786d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ArrayList arrayList = this.e;
                arrayList.add(0, (Long) obj);
                this.f1787f.e(arrayList);
                break;
            case 1:
                ArrayList arrayList2 = this.e;
                arrayList2.add(0, (String) obj);
                this.f1787f.e(arrayList2);
                break;
            default:
                ArrayList arrayList3 = this.e;
                arrayList3.add(0, (Double) obj);
                this.f1787f.e(arrayList3);
                break;
        }
    }

    @Override // W1.I
    public final void c(u uVar) {
        switch (this.f1786d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case 1:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case 2:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
            default:
                this.f1787f.e(p013d1.D.b(uVar));
                break;
        }
    }
}
