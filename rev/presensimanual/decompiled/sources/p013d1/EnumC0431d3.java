package p013d1;

/* JADX INFO: renamed from: d1.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0431d3 implements InterfaceC0415b {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3709d;

    EnumC0431d3(int i3) {
        this.f3709d = i3;
    }

    @Override // p013d1.InterfaceC0415b
    public final int a() {
        return this.f3709d;
    }
}
