package A1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33b;

    public b(int i3, ArrayList arrayList) {
        this.f32a = i3;
        this.f33b = arrayList;
    }

    public final String toString() {
        D0.b bVar = new D0.b("FaceContour");
        bVar.T("type", this.f32a);
        bVar.U(this.f33b.toArray(), "points");
        return bVar.toString();
    }
}
