package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import id.go.bangkalankab.simpeg.R;
import p060s.b;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
