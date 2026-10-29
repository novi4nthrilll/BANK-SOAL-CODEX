package com.google.android.gms.internal.mlkit_vision_face_bundled;

import O0.C0092f;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0544w3;
import p016e1.AbstractC0563a;
import p016e1.AbstractC0682u;
import p016e1.C0670s;
import p016e1.C0687u4;
import p016e1.C0712z;
import p016e1.EnumC0710y3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2754d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2757h;

    public /* synthetic */ C7(Object obj, Object obj2, Enum r3, String str, int i3) {
        this.f2754d = i3;
        this.f2755f = obj;
        this.f2756g = obj2;
        this.f2757h = r3;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    private final void a() {
        String str;
        C0712z c0712z;
        p016e1.S4 s4 = (p016e1.S4) this.f2755f;
        E0.i iVar = (E0.i) this.f2756g;
        EnumC0710y3 enumC0710y3 = (EnumC0710y3) this.f2757h;
        String str2 = (String) this.e;
        s4.getClass();
        E0.k kVar = (E0.k) iVar.f218f;
        kVar.e = enumC0710y3;
        C0687u4 c0687u4 = (C0687u4) kVar.f226d;
        if (c0687u4 != null) {
            int i3 = AbstractC0563a.f4171a;
            str = c0687u4.f4330d;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        C0198e7 c0198e7 = new C0198e7();
        c0198e7.f3039a = s4.f4119a;
        c0198e7.f3040b = s4.f4120b;
        synchronized (p016e1.S4.class) {
            c0712z = p016e1.S4.f4117k;
            if (c0712z == null) {
                p072x.e eVarA = AbstractC0544w3.a(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i4 = 0;
                int i5 = 0;
                while (i4 < eVarA.f5816a.size()) {
                    Locale locale = eVarA.f5816a.get(i4);
                    C0092f c0092f = p071w1.c.f5780a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i6 = i5 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i6) {
                        int i7 = length + (length >> 1) + 1;
                        if (i7 < i6) {
                            int iHighestOneBit = Integer.highestOneBit(i5);
                            i7 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i7 < 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                    }
                    objArrCopyOf[i5] = languageTag;
                    i4++;
                    i5 = i6;
                }
                C0670s c0670s = AbstractC0682u.e;
                c0712z = i5 == 0 ? C0712z.f4368h : new C0712z(i5, objArrCopyOf);
                p016e1.S4.f4117k = c0712z;
            }
        }
        c0198e7.f3048k = c0712z;
        c0198e7.f3044g = Boolean.TRUE;
        c0198e7.f3042d = str;
        c0198e7.f3041c = str2;
        c0198e7.e = s4.f4123f.f() ? (String) s4.f4123f.d() : s4.f4122d.a();
        c0198e7.f3046i = 10;
        c0198e7.f3047j = Integer.valueOf(s4.f4125h);
        iVar.f219g = c0198e7;
        s4.f4121c.a(iVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C0260l c0260l;
        int i3 = 0;
        switch (this.f2754d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                E7 e7 = (E7) this.f2755f;
                E0.i iVar = (E0.i) this.f2756g;
                EnumC0316q5 enumC0316q5 = (EnumC0316q5) this.f2757h;
                String str2 = (String) this.e;
                C0399z c0399z = (C0399z) iVar.f218f;
                c0399z.f3505b = enumC0316q5;
                C0208f7 c0208f7 = (C0208f7) c0399z.f3504a;
                if (c0208f7 == null || (str = c0208f7.f3059d) == null || str.isEmpty()) {
                    str = "NA";
                }
                C0198e7 c0198e7 = new C0198e7();
                c0198e7.f3039a = e7.f2771a;
                c0198e7.f3040b = e7.f2772b;
                synchronized (E7.class) {
                    c0260l = E7.f2769j;
                    if (c0260l == null) {
                        p072x.e eVarA = AbstractC0544w3.a(Resources.getSystem().getConfiguration());
                        Object[] objArrCopyOf = new Object[4];
                        int i4 = 0;
                        while (i3 < eVarA.f5816a.size()) {
                            Locale locale = eVarA.f5816a.get(i3);
                            C0092f c0092f = p071w1.c.f5780a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i5 = i4 + 1;
                            int length = objArrCopyOf.length;
                            if (length < i5) {
                                int i6 = length + (length >> 1) + 1;
                                if (i6 < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i6 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i6 < 0) {
                                    i6 = Integer.MAX_VALUE;
                                }
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                            }
                            objArrCopyOf[i4] = languageTag;
                            i3++;
                            i4 = i5;
                        }
                        C0220h c0220h = AbstractC0240j.e;
                        c0260l = i4 == 0 ? C0260l.f3219h : new C0260l(i4, objArrCopyOf);
                        E7.f2769j = c0260l;
                    }
                }
                c0198e7.f3048k = c0260l;
                c0198e7.f3044g = Boolean.TRUE;
                c0198e7.f3042d = str;
                c0198e7.f3041c = str2;
                c0198e7.e = e7.f2775f.f() ? (String) e7.f2775f.d() : e7.f2774d.a();
                c0198e7.f3046i = 10;
                c0198e7.f3047j = Integer.valueOf(e7.f2777h);
                iVar.f219g = c0198e7;
                e7.f2773c.a(iVar);
                return;
            case 1:
                a();
                return;
            default:
                p032j.e eVar = (p032j.e) this.f2755f;
                if (eVar != null) {
                    androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.e;
                    ((p032j.f) yVar.e).f4888C = true;
                    eVar.f4884b.c(false);
                    ((p032j.f) yVar.e).f4888C = false;
                }
                p032j.j jVar = (p032j.j) this.f2756g;
                if (jVar.isEnabled() && jVar.hasSubMenu()) {
                    ((p032j.i) this.f2757h).p(jVar, null, 4);
                    return;
                }
                return;
        }
    }

    public C7(androidx.lifecycle.y yVar, p032j.e eVar, p032j.j jVar, p032j.i iVar) {
        this.f2754d = 2;
        this.e = yVar;
        this.f2755f = eVar;
        this.f2756g = jVar;
        this.f2757h = iVar;
    }
}
