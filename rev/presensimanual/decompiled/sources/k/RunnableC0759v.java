package k;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: k.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0759v implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f5256d;
    public final /* synthetic */ Typeface e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5257f;

    public RunnableC0759v(TextView textView, Typeface typeface, int i3) {
        this.f5256d = textView;
        this.e = typeface;
        this.f5257f = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5256d.setTypeface(this.e, this.f5257f);
    }
}
