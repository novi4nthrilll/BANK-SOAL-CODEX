package p062s1;

import O0.u;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i3) {
        super(str);
        u.e(str, "Provided message must not be empty.");
        this.f5665d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i3, Exception exc) {
        super(str, exc);
        u.e(str, "Provided message must not be empty.");
        this.f5665d = i3;
    }
}
