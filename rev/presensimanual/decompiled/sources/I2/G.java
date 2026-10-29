package I2;

/* JADX INFO: loaded from: classes.dex */
public final class G implements N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f437d;

    public G(boolean z2) {
        this.f437d = z2;
    }

    @Override // I2.N
    public final boolean b() {
        return this.f437d;
    }

    @Override // I2.N
    public final c0 f() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f437d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
