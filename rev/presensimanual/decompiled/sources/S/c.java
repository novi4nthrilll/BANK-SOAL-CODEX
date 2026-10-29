package S;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f1555d;

    public c(d dVar) {
        this.f1555d = dVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1555d.getClass();
    }
}
