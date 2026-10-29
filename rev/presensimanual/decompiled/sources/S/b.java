package S;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f1554d;

    public b(d dVar) {
        this.f1554d = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1554d.getClass();
    }
}
