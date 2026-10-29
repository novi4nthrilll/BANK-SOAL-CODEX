package L0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f882d;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f882d = bArr;
    }

    @Override // L0.k
    public final byte[] o() {
        return this.f882d;
    }
}
