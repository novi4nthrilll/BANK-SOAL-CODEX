package L0;

import O0.u;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlertDialog f864d;
    public DialogInterface.OnCancelListener e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertDialog f865f;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f864d;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f865f == null) {
            Activity activity = getActivity();
            u.f(activity);
            this.f865f = new AlertDialog.Builder(activity).create();
        }
        return this.f865f;
    }
}
