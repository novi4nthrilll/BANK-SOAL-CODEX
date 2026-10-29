package L;

import R2.l;
import R2.n;
import java.io.RandomAccessFile;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {
    /* JADX WARN: Code duplicated, block: B:77:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, u2.b bVar) throws Throwable {
        j jVar;
        R2.h hVar;
        R2.h hVar2;
        n nVar;
        R2.h hVar3;
        p055q2.g gVar;
        Throwable th;
        R2.h hVar4;
        p055q2.g gVar2;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i3 = jVar.f859l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f859l = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, bVar);
            }
        } else {
            jVar = new j(this, bVar);
        }
        Object obj2 = jVar.f857j;
        t2.a aVar = t2.a.f5737d;
        int i4 = jVar.f859l;
        p055q2.g gVar3 = p055q2.g.f5603a;
        Throwable th2 = null;
        if (i4 == 0) {
            AbstractC0449g3.b(obj2);
            if (this.f829c.f821a.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            this.f827a.getClass();
            l lVar = this.f828b;
            B2.h.e(lVar, "file");
            hVar = new R2.h(true, new RandomAccessFile(lVar.e(), "rw"));
            try {
                n nVar2 = new n(R2.h.b(hVar));
                try {
                    N.i iVar = N.i.f1037a;
                    jVar.f854g = hVar;
                    jVar.f855h = hVar;
                    jVar.f856i = nVar2;
                    jVar.f859l = 1;
                    iVar.b(obj, nVar2);
                    if (gVar3 == aVar) {
                        return aVar;
                    }
                    hVar2 = hVar;
                    hVar3 = hVar2;
                    nVar = nVar2;
                } catch (Throwable th3) {
                    th = th3;
                    hVar2 = hVar;
                    nVar = nVar2;
                    if (nVar != null) {
                        nVar.close();
                    }
                    th = th;
                    hVar4 = hVar2;
                    gVar2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (hVar != null) {
                    hVar.close();
                }
                th2 = th;
                gVar = null;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = jVar.f856i;
            hVar3 = jVar.f855h;
            hVar2 = jVar.f854g;
            try {
                AbstractC0449g3.b(obj2);
            } catch (Throwable th5) {
                th = th5;
                if (nVar != null) {
                    try {
                        nVar.close();
                    } catch (Throwable th6) {
                        try {
                            AbstractC0443f3.a(th, th6);
                        } catch (Throwable th7) {
                            th = th7;
                            hVar = hVar2;
                            if (hVar != null) {
                                try {
                                    hVar.close();
                                } catch (Throwable th8) {
                                    AbstractC0443f3.a(th, th8);
                                }
                            }
                            th2 = th;
                            gVar = null;
                        }
                    }
                }
                th = th;
                hVar4 = hVar2;
                gVar2 = null;
            }
        }
        hVar3.a();
        if (nVar != null) {
            try {
                nVar.close();
            } catch (Throwable th9) {
                th = th9;
            }
        }
        th = null;
        hVar4 = hVar2;
        gVar2 = gVar3;
        if (th != null) {
            throw th;
        }
        B2.h.b(gVar2);
        if (hVar4 != null) {
            try {
                hVar4.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        gVar = gVar3;
        if (th2 != null) {
            throw th2;
        }
        B2.h.b(gVar);
        return gVar3;
    }
}
