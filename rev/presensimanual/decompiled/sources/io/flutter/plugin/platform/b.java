package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I1.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f4707j;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f4707j;
        if (aVar != null) {
            io.flutter.view.m mVar = aVar.f4706a;
            if (mVar == null ? false : mVar.d(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
