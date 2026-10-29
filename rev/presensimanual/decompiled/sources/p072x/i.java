package p072x;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f5819a;

    public i(Object obj) {
        this.f5819a = h.c(obj);
    }

    @Override // p072x.g
    public final Object a() {
        return this.f5819a;
    }

    public final boolean equals(Object obj) {
        return this.f5819a.equals(((g) obj).a());
    }

    @Override // p072x.g
    public final Locale get(int i3) {
        return this.f5819a.get(i3);
    }

    public final int hashCode() {
        return this.f5819a.hashCode();
    }

    @Override // p072x.g
    public final int size() {
        return this.f5819a.size();
    }

    public final String toString() {
        return this.f5819a.toString();
    }
}
