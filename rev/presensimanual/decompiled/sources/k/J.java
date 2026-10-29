package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class J extends I {
    @Override // k.I, k.K
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // k.K
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
