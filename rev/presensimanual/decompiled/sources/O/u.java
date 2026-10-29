package O;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1220b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1219a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1221c = 1.0f;

    public u(n nVar) {
        A.d.b(nVar, "metadata cannot be null");
        this.f1220b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        h.a().getClass();
        n nVar = this.f1220b;
        E0.n nVar2 = nVar.f1197b;
        Typeface typeface = (Typeface) nVar2.f238g;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) nVar2.e, nVar.f1196a * 2, 2, f3, i6, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1219a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f1220b;
        P.a aVarC = nVar.c();
        int iA = aVarC.a(14);
        this.f1221c = fAbs / (iA != 0 ? ((ByteBuffer) aVarC.f100d).getShort(iA + aVarC.f97a) : (short) 0);
        P.a aVarC2 = nVar.c();
        int iA2 = aVarC2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarC2.f100d).getShort(iA2 + aVarC2.f97a);
        }
        P.a aVarC3 = nVar.c();
        int iA3 = aVarC3.a(12);
        short s3 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarC3.f100d).getShort(iA3 + aVarC3.f97a) : (short) 0) * this.f1221c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
