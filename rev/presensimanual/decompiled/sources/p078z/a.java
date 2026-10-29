package p078z;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import p043m0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f5927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f5928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5930d;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i4).setTextDirection(textDirectionHeuristic).build();
        }
        this.f5927a = textPaint;
        this.f5928b = textDirectionHeuristic;
        this.f5929c = i3;
        this.f5930d = i4;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public final boolean equals(Object obj) {
        TextPaint textPaint;
        float textScaleX;
        TextPaint textPaint2;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            if (this.f5929c == aVar.f5929c && this.f5930d == aVar.f5930d) {
                textPaint = this.f5927a;
                if (textPaint.getTextSize() != aVar.f5927a.getTextSize()) {
                    z2 = false;
                } else {
                    textScaleX = textPaint.getTextScaleX();
                    textPaint2 = aVar.f5927a;
                    if (textScaleX != textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i3 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
        } else {
            textPaint = this.f5927a;
            if (textPaint.getTextSize() != aVar.f5927a.getTextSize()) {
                z2 = false;
            } else {
                textScaleX = textPaint.getTextScaleX();
                textPaint2 = aVar.f5927a;
                if (textScaleX != textPaint2.getTextScaleX()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        }
        return z2 && this.f5928b == aVar.f5928b;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f5928b;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.f5930d;
        int i5 = this.f5929c;
        TextPaint textPaint = this.f5927a;
        return i3 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i5), Integer.valueOf(i4)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i5), Integer.valueOf(i4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f5927a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i3 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i3 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i3 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f5928b);
        sb.append(", breakStrategy=" + this.f5929c);
        sb.append(", hyphenationFrequency=" + this.f5930d);
        sb.append("}");
        return sb.toString();
    }

    public a(PrecomputedText.Params params) {
        this.f5927a = params.getTextPaint();
        this.f5928b = params.getTextDirection();
        this.f5929c = params.getBreakStrategy();
        this.f5930d = params.getHyphenationFrequency();
    }
}
