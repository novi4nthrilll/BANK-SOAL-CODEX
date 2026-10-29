package M0;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class d extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Status f964d;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Status status) {
        int i3 = status.f2707a;
        String str = status.f2708b;
        super(i3 + ": " + (str == null ? "" : str));
        this.f964d = status;
    }
}
