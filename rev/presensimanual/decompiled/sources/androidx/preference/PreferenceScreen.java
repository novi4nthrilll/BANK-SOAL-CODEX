package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import id.go.bangkalankab.simpeg.R;
import p060s.b;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
