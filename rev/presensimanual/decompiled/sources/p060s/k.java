package p060s;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f5647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f5648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5649c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f5647a = colorStateList;
        this.f5648b = configuration;
        this.f5649c = theme == null ? 0 : theme.hashCode();
    }
}
