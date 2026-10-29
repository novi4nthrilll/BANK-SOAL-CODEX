package k;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747o0 extends AbstractC0735i0 implements InterfaceC0737j0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Method f5227D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.lifecycle.y f5228C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f5227D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.InterfaceC0737j0
    public final void a(p032j.i iVar, p032j.j jVar) {
        androidx.lifecycle.y yVar = this.f5228C;
        if (yVar != null) {
            yVar.a(iVar, jVar);
        }
    }

    @Override // k.InterfaceC0737j0
    public final void i(p032j.i iVar, p032j.j jVar) {
        androidx.lifecycle.y yVar = this.f5228C;
        if (yVar != null) {
            yVar.i(iVar, jVar);
        }
    }
}
