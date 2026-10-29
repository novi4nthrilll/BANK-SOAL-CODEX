package I1;

import android.content.Context;
import android.view.KeyCharacterMap;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Y0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f427d;

    @Override // Y0.c
    public int a(Context context, String str) {
        return this.f427d;
    }

    @Override // Y0.c
    public int b(Context context, String str, boolean z2) {
        return 0;
    }

    public Character c(int i3) {
        char c3 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i4 = i3 & Integer.MAX_VALUE;
            int i5 = this.f427d;
            if (i5 != 0) {
                this.f427d = KeyCharacterMap.getDeadChar(i5, i4);
            } else {
                this.f427d = i4;
            }
        } else {
            int i6 = this.f427d;
            if (i6 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f427d = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public w() {
        this.f427d = 0;
    }
}
