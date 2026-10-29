package O;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1222d = false;
    public Spannable e;

    public w(Spannable spannable) {
        this.e = spannable;
    }

    public final void a() {
        Spannable spannable = this.e;
        if (!this.f1222d) {
            if ((Build.VERSION.SDK_INT < 28 ? new p009c1.v() : new v()).i(spannable)) {
                this.e = new SpannableString(spannable);
            }
        }
        this.f1222d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.e.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.e.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.e.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.e.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.e.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e.toString();
    }

    public w(CharSequence charSequence) {
        this.e = new SpannableString(charSequence);
    }
}
