package p016e1;

/* JADX INFO: renamed from: e1.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0609h3 implements G {
    UNKNOWN_CLASSIFICATIONS(0),
    NO_CLASSIFICATIONS(1),
    ALL_CLASSIFICATIONS(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4213d;

    EnumC0609h3(int i3) {
        this.f4213d = i3;
    }

    @Override // p016e1.G
    public final int a() {
        return this.f4213d;
    }
}
