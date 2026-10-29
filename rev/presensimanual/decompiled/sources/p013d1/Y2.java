package p013d1;

/* JADX INFO: loaded from: classes.dex */
public enum Y2 implements InterfaceC0415b {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3677d;

    Y2(int i3) {
        this.f3677d = i3;
    }

    @Override // p013d1.InterfaceC0415b
    public final int a() {
        return this.f3677d;
    }
}
