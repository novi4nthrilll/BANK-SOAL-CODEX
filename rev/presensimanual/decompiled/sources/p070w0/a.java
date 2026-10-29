package p070w0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5772b;

    public a(Object obj, c cVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f5771a = (byte[]) obj;
        this.f5772b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f5771a.equals(aVar.f5771a) && this.f5772b.equals(aVar.f5772b);
    }

    public final int hashCode() {
        return this.f5772b.hashCode() ^ (((1000003 * 1000003) ^ this.f5771a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f5771a + ", priority=" + this.f5772b + "}";
    }
}
