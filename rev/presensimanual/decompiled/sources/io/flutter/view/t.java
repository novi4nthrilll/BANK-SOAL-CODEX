package io.flutter.view;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class t implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f4862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f4863b;

    public t(v vVar, DisplayManager displayManager) {
        this.f4863b = vVar;
        this.f4862a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        if (i3 == 0) {
            float refreshRate = this.f4862a.getDisplay(0).getRefreshRate();
            v vVar = this.f4863b;
            vVar.f4867a = (long) (1.0E9d / ((double) refreshRate));
            vVar.f4868b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
    }
}
