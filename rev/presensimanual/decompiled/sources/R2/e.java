package R2;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f1521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f1522d;
    public final Long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f1523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f1524g;

    public e(boolean z2, boolean z3, Long l3, Long l4, Long l5, Long l6) {
        p059r2.m mVar = p059r2.m.f5625d;
        this.f1519a = z2;
        this.f1520b = z3;
        this.f1521c = l3;
        this.f1522d = l4;
        this.e = l5;
        this.f1523f = l6;
        this.f1524g = mVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f1519a) {
            arrayList.add("isRegularFile");
        }
        if (this.f1520b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f1521c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f1522d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f1523f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f1524g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p059r2.d.e(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
