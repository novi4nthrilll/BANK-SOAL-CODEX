package p016e1;

/* JADX INFO: renamed from: e1.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0633l3 implements G {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4242d;

    EnumC0633l3(int i3) {
        this.f4242d = i3;
    }

    @Override // p016e1.G
    public final int a() {
        return this.f4242d;
    }
}
