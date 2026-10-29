package androidx.preference;

import V.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import id.go.bangkalankab.simpeg.R;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2426l;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1638i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f2425k) {
            this.f2425k = i4;
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f2426l) {
            this.f2426l = Math.min(this.f2425k - i3, Math.abs(i5));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
