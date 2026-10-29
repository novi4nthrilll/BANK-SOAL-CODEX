package C;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f132c;

    public a(int i3, l lVar, int i4) {
        this.f130a = i3;
        this.f131b = lVar;
        this.f132c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f130a);
        this.f131b.f139a.performAction(this.f132c, bundle);
    }
}
