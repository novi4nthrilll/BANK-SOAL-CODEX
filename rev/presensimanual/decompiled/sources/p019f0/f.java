package p019f0;

import A0.c;
import B2.h;
import I2.C0045p;
import M.j;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p013d1.AbstractC0473k3;
import p059r2.a;
import p059r2.l;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f4462d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r2.l] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i3) {
        h.e(obj, "value");
        c.p("verificationMode", i3);
        this.f4459a = obj;
        this.f4460b = str;
        this.f4461c = i3;
        String strB = g.b(obj, str);
        h.e(strB, "message");
        j jVar = new j(strB);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        ?? arrayList = l.f5624d;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    arrayList = length3 != 1 ? new ArrayList(new a(stackTrace, false)) : AbstractC0473k3.a(stackTrace[0]);
                }
            } else if (length == 1) {
                arrayList = AbstractC0473k3.a(stackTrace[length2 - 1]);
            } else {
                arrayList = new ArrayList(length);
                for (int i4 = length2 - length; i4 < length2; i4++) {
                    arrayList.add(stackTrace[i4]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) ((Collection) arrayList).toArray(new StackTraceElement[0]));
        this.f4462d = jVar;
    }

    @Override // p019f0.g
    public final Object a() throws j {
        int iB = j.b(this.f4461c);
        if (iB == 0) {
            throw this.f4462d;
        }
        if (iB != 1) {
            if (iB == 2) {
                return null;
            }
            throw new C0045p();
        }
        String strB = g.b(this.f4459a, this.f4460b);
        h.e(strB, "message");
        Log.d("f", strB);
        return null;
    }

    @Override // p019f0.g
    public final g d(String str, A2.l lVar) {
        return this;
    }
}
