package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4861b;

    public o(View view, int i3) {
        this.f4860a = view;
        this.f4861b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4861b == oVar.f4861b && this.f4860a.equals(oVar.f4860a);
    }

    public final int hashCode() {
        return ((this.f4860a.hashCode() + 31) * 31) + this.f4861b;
    }
}
