package io.flutter.view;

import B.C0006g;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4752b;

    public e(m mVar, AccessibilityManager accessibilityManager) {
        this.f4752b = mVar;
        this.f4751a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        m mVar = this.f4752b;
        if (mVar.f4851t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            mVar.h(false);
            i iVar = mVar.f4845n;
            if (iVar != null) {
                mVar.f(iVar.f4805b, 256);
                mVar.f4845n = null;
            }
        }
        C0006g c0006g = mVar.f4849r;
        if (c0006g != null) {
            boolean zIsEnabled = this.f4751a.isEnabled();
            I1.p pVar = (I1.p) c0006g.e;
            if (pVar.f398k.f696b.f4647a.getIsSoftwareRenderingEnabled()) {
                pVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z2) {
                z3 = true;
            }
            pVar.setWillNotDraw(z3);
        }
    }
}
