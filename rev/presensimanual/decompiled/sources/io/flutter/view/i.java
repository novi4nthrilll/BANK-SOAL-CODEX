package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f4780A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4783D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4784E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f4785F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f4786G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f4787H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f4788I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f4789J;
    public float K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f4790L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f4791M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f4792N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float[] f4793O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public i f4794P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f4797S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public g f4798T;
    public g U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float[] f4800W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float[] f4802Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Rect f4803Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4804a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4807d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f4817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f4819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f4820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f4821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f4822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f4823u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f4824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f4825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f4826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f4827z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4805b = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4781B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4782C = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f4795Q = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ArrayList f4796R = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f4799V = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f4801X = true;

    public i(m mVar) {
        this.f4804a = mVar;
    }

    public static boolean a(i iVar, f fVar) {
        return (iVar.f4807d & fVar.f4774d) != 0;
    }

    public static CharSequence b(i iVar) {
        CharSequence[] charSequenceArr = {e(iVar.f4820r, iVar.f4821s), iVar.f(), e(iVar.f4825x, iVar.f4826y)};
        CharSequence charSequenceConcat = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence = charSequenceArr[i3];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static boolean c(i iVar, f fVar) {
        return (iVar.f4784E & fVar.f4774d) != 0;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                int iB = M.j.b(kVar.f4830c);
                if (iB == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f4828a, kVar.f4829b, 0);
                } else if (iB == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((h) kVar).f4779d)), kVar.f4828a, kVar.f4829b, 0);
                } else if (iB == 2) {
                    spannableString.setSpan(new URLSpan(((l) kVar).f4831d), kVar.f4828a, kVar.f4829b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList h(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = M.j.c(3)[byteBuffer.getInt()];
            int iB = M.j.b(i7);
            if (iB == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f4828a = i5;
                jVar.f4829b = i6;
                jVar.f4830c = i7;
                arrayList.add(jVar);
            } else if (iB == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                h hVar = new h();
                hVar.f4828a = i5;
                hVar.f4829b = i6;
                hVar.f4830c = i7;
                hVar.f4779d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static void l(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f3 = fArr[3];
        fArr[0] = fArr[0] / f3;
        fArr[1] = fArr[1] / f3;
        fArr[2] = fArr[2] / f3;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (i(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f4795Q.iterator();
        while (it.hasNext()) {
            ((i) it.next()).d(arrayList);
        }
    }

    public final SpannableString f() {
        ArrayList arrayList = this.f4819q;
        String str = this.f4780A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            l lVar = new l();
            lVar.f4828a = 0;
            lVar.f4829b = this.f4818p.length();
            lVar.f4831d = this.f4780A;
            lVar.f4830c = 3;
            arrayList.add(lVar);
        }
        return e(this.f4818p, arrayList);
    }

    public final String g() {
        String str;
        if (i(13) && (str = this.f4818p) != null && !str.isEmpty()) {
            return this.f4818p;
        }
        Iterator it = this.f4795Q.iterator();
        while (it.hasNext()) {
            String strG = ((i) it.next()).g();
            if (strG != null && !strG.isEmpty()) {
                return strG;
            }
        }
        return null;
    }

    public final boolean i(int i3) {
        return (I.d(i3) & this.f4806c) != 0;
    }

    public final i j(float[] fArr, boolean z2) {
        float f3 = fArr[3];
        boolean z3 = false;
        float f4 = fArr[0] / f3;
        float f5 = fArr[1] / f3;
        if (f4 < this.K || f4 >= this.f4791M || f5 < this.f4790L || f5 >= this.f4792N) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (i iVar : this.f4796R) {
            if (!iVar.i(14)) {
                if (iVar.f4799V) {
                    iVar.f4799V = false;
                    if (iVar.f4800W == null) {
                        iVar.f4800W = new float[16];
                    }
                    if (!Matrix.invertM(iVar.f4800W, 0, iVar.f4793O, 0)) {
                        Arrays.fill(iVar.f4800W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, iVar.f4800W, 0, fArr, 0);
                i iVarJ = iVar.j(fArr2, z2);
                if (iVarJ != null) {
                    return iVarJ;
                }
            }
        }
        if (z2 && this.f4811i != -1) {
            z3 = true;
        }
        if (k() || z3) {
            return this;
        }
        return null;
    }

    public final boolean k() {
        String str;
        String str2;
        String str3;
        if (i(12)) {
            return false;
        }
        if (i(22)) {
            return true;
        }
        int i3 = this.f4807d;
        int i4 = m.f4832y;
        return ((i3 & (-61)) == 0 && (this.f4806c & 10682871) == 0 && ((str = this.f4818p) == null || str.isEmpty()) && (((str2 = this.f4820r) == null || str2.isEmpty()) && ((str3 = this.f4825x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f4801X) {
            z2 = true;
        }
        if (z2) {
            if (this.f4802Y == null) {
                this.f4802Y = new float[16];
            }
            if (this.f4793O == null) {
                this.f4793O = new float[16];
            }
            Matrix.multiplyMM(this.f4802Y, 0, fArr, 0, this.f4793O, 0);
            float[] fArr2 = {this.K, this.f4790L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f4802Y, fArr2);
            fArr2[0] = this.f4791M;
            fArr2[1] = this.f4790L;
            l(fArr4, this.f4802Y, fArr2);
            fArr2[0] = this.f4791M;
            fArr2[1] = this.f4792N;
            l(fArr5, this.f4802Y, fArr2);
            fArr2[0] = this.K;
            fArr2[1] = this.f4792N;
            l(fArr6, this.f4802Y, fArr2);
            if (this.f4803Z == null) {
                this.f4803Z = new Rect();
            }
            this.f4803Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f4801X = false;
        }
        int i3 = -1;
        for (i iVar : this.f4795Q) {
            iVar.f4781B = i3;
            i3 = iVar.f4805b;
            iVar.m(this.f4802Y, hashSet, z2);
        }
    }
}
