package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0.h f4709b;

    public c(E0.h hVar, View view) {
        this.f4709b = hVar;
        this.f4708a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i3) {
        this.f4708a.post(new W1.n(this, i3, 1));
    }
}
