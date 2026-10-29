package W1;

/* JADX INFO: renamed from: W1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101i implements S1.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1770a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E1.a f1771b;

    public C0101i(E1.a aVar) {
        this.f1771b = aVar;
    }

    @Override // S1.p
    public final boolean a(int i3, String[] strArr, int[] iArr) {
        if (this.f1770a || i3 != 9796) {
            return false;
        }
        this.f1770a = true;
        int length = iArr.length;
        E1.a aVar = this.f1771b;
        if (length == 0 || iArr[0] != 0) {
            aVar.a("CameraAccessDenied", "Camera access permission was denied.");
        } else if (iArr.length <= 1 || iArr[1] == 0) {
            aVar.a(null, null);
        } else {
            aVar.a("AudioAccessDenied", "Audio access permission was denied.");
        }
        return true;
    }
}
