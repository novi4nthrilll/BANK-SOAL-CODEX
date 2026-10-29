package io.flutter.view;

import B.C0006g;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f4750a;

    public d(m mVar) {
        this.f4750a = mVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        m mVar = this.f4750a;
        if (mVar.f4851t) {
            return;
        }
        boolean z3 = false;
        D0.b bVar = mVar.f4834b;
        if (z2) {
            c cVar = mVar.f4852u;
            bVar.f183g = cVar;
            ((FlutterJNI) bVar.f182f).setAccessibilityDelegate(cVar);
            ((FlutterJNI) bVar.f182f).setSemanticsEnabled(true);
        } else {
            mVar.h(false);
            bVar.f183g = null;
            ((FlutterJNI) bVar.f182f).setAccessibilityDelegate(null);
            ((FlutterJNI) bVar.f182f).setSemanticsEnabled(false);
        }
        C0006g c0006g = mVar.f4849r;
        if (c0006g != null) {
            boolean zIsTouchExplorationEnabled = mVar.f4835c.isTouchExplorationEnabled();
            I1.p pVar = (I1.p) c0006g.e;
            if (pVar.f398k.f696b.f4647a.getIsSoftwareRenderingEnabled()) {
                pVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !zIsTouchExplorationEnabled) {
                z3 = true;
            }
            pVar.setWillNotDraw(z3);
        }
    }
}
