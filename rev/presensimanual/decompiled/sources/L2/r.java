package L2;

import J.C0071q;
import J.C0078y;
import java.lang.reflect.InvocationTargetException;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0.f f949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A0.f f950b;

    static {
        int i3 = 10;
        f949a = new A0.f(i3, "NONE");
        f950b = new A0.f(i3, "PENDING");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t tVar, C0071q c0071q, Throwable th, u2.b bVar) throws IllegalAccessException, InvocationTargetException {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i3 = gVar.f905i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f905i = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f904h;
        Object obj2 = t2.a.f5737d;
        int i4 = gVar.f905i;
        try {
            if (i4 == 0) {
                AbstractC0449g3.b(obj);
                gVar.f903g = th;
                gVar.f905i = 1;
                if (c0071q.p(tVar, th, gVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = gVar.f903g;
                AbstractC0449g3.b(obj);
            }
            return p055q2.g.f5603a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0443f3.a(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(L2.e r8, K2.o r9, boolean r10, u2.b r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.r.b(L2.e, K2.o, boolean, u2.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(d dVar, u2.b bVar) {
        o oVar;
        B2.p pVar;
        M2.a e;
        C0078y c0078y;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i3 = oVar.f938j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.f938j = i3 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar);
            }
        } else {
            oVar = new o(bVar);
        }
        Object obj = oVar.f937i;
        Object obj2 = t2.a.f5737d;
        int i4 = oVar.f938j;
        if (i4 == 0) {
            AbstractC0449g3.b(obj);
            B2.p pVar2 = new B2.p();
            C0078y c0078y2 = new C0078y(1, pVar2);
            try {
                oVar.f935g = pVar2;
                oVar.f936h = c0078y2;
                oVar.f938j = 1;
                if (dVar.q(c0078y2, oVar) == obj2) {
                    return obj2;
                }
                pVar = pVar2;
            } catch (M2.a e3) {
                pVar = pVar2;
                e = e3;
                c0078y = c0078y2;
                if (e.f995d != c0078y) {
                    throw e;
                }
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0078y = oVar.f936h;
            pVar = oVar.f935g;
            try {
                AbstractC0449g3.b(obj);
            } catch (M2.a e4) {
                e = e4;
                if (e.f995d != c0078y) {
                    throw e;
                }
            }
        }
        return pVar.f128d;
    }
}
