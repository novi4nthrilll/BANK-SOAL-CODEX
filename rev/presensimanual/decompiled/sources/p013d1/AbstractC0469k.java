package p013d1;

import E2.c;

/* JADX INFO: renamed from: d1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0469k {
    public static void a(int i3) {
        if (2 > i3 || i3 >= 37) {
            throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new c(2, 36, 1));
        }
    }
}
