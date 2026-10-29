package E0;

import B.C0006g;
import I2.C0041l;
import I2.C0049u;
import I2.InterfaceC0050v;
import I2.N;
import I2.S;
import I2.b0;
import J.C0057c;
import J.C0063i;
import J.C0066l;
import J.K;
import J.M;
import J.P;
import J.U;
import J.Z;
import O.r;
import S1.s;
import android.graphics.Typeface;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class n implements B0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f236d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f238g;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f236d = obj;
        this.e = obj2;
        this.f238g = obj3;
        this.f237f = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(u2.b bVar) {
        C0063i c0063i;
        n nVar;
        C0057c c0057c;
        if (bVar instanceof C0063i) {
            c0063i = (C0063i) bVar;
            int i3 = c0063i.f632j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0063i.f632j = i3 - Integer.MIN_VALUE;
            } else {
                c0063i = new C0063i(this, bVar);
            }
        } else {
            c0063i = new C0063i(this, bVar);
        }
        Object objG = c0063i.f630h;
        t2.a aVar = t2.a.f5737d;
        int i4 = c0063i.f632j;
        if (i4 == 0) {
            AbstractC0449g3.b(objG);
            List list = (List) this.f237f;
            P p3 = (P) this.f238g;
            if (list == null || list.isEmpty()) {
                c0063i.f629g = this;
                c0063i.f632j = 1;
                objG = P.g(p3, false, c0063i);
                if (objG == aVar) {
                    return aVar;
                }
                nVar = this;
                c0057c = (C0057c) objG;
            } else {
                Z zH = p3.h();
                C0066l c0066l = new C0066l(p3, this, null);
                c0063i.f629g = this;
                c0063i.f632j = 2;
                objG = zH.b(c0066l, c0063i);
                if (objG == aVar) {
                    return aVar;
                }
                nVar = this;
                c0057c = (C0057c) objG;
            }
        } else if (i4 == 1) {
            nVar = c0063i.f629g;
            AbstractC0449g3.b(objG);
            c0057c = (C0057c) objG;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = c0063i.f629g;
            AbstractC0449g3.b(objG);
            c0057c = (C0057c) objG;
        }
        ((P) nVar.f238g).f577k.s(c0057c);
        return p055q2.g.f5603a;
    }

    public void b(String str, Object obj, R1.i iVar) {
        ((S1.f) this.f236d).h((String) this.e, ((S1.n) this.f237f).d(new A0.g(26, str, obj)), iVar == null ? null : new S1.a(1, this, iVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(u2.b bVar) throws Throwable {
        U u3;
        n nVar;
        Q2.a aVar;
        Q2.a aVar2;
        Throwable th;
        n nVar2;
        if (bVar instanceof U) {
            u3 = (U) bVar;
            int i3 = u3.f592k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u3.f592k = i3 - Integer.MIN_VALUE;
            } else {
                u3 = new U(this, bVar);
            }
        } else {
            u3 = new U(this, bVar);
        }
        Object obj = u3.f590i;
        t2.a aVar3 = t2.a.f5737d;
        int i4 = u3.f592k;
        p055q2.g gVar = p055q2.g.f5603a;
        try {
            if (i4 == 0) {
                AbstractC0449g3.b(obj);
                if (!(((C0041l) this.e).E() instanceof N)) {
                    return gVar;
                }
                u3.f588g = this;
                Q2.d dVar = (Q2.d) this.f236d;
                u3.f589h = dVar;
                u3.f592k = 1;
                if (dVar.c(u3) == aVar3) {
                    return aVar3;
                }
                nVar = this;
                aVar = dVar;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = u3.f589h;
                    nVar2 = u3.f588g;
                    try {
                        AbstractC0449g3.b(obj);
                        aVar2 = aVar2;
                        ((C0041l) nVar2.e).K(gVar);
                        ((Q2.d) aVar2).e(null);
                        return gVar;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Q2.d) aVar2).e(null);
                        throw th;
                    }
                }
                Q2.a aVar4 = u3.f589h;
                nVar = u3.f588g;
                AbstractC0449g3.b(obj);
                aVar = aVar4;
            }
            if (!(((C0041l) nVar.e).E() instanceof N)) {
                ((Q2.d) aVar).e(null);
                return gVar;
            }
            u3.f588g = nVar;
            u3.f589h = aVar;
            u3.f592k = 2;
            if (nVar.a(u3) == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            nVar2 = nVar;
            ((C0041l) nVar2.e).K(gVar);
            ((Q2.d) aVar2).e(null);
            return gVar;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            ((Q2.d) aVar2).e(null);
            throw th;
        }
    }

    public void d(Serializable serializable, S1.c cVar) {
        ((S1.f) this.f236d).h((String) this.e, ((S1.l) this.f237f).b(serializable), cVar == null ? null : new S1.a(0, this, cVar));
    }

    public void e(S1.b bVar) {
        String str = (String) this.e;
        S1.f fVar = (S1.f) this.f236d;
        p074x1.a aVar = (p074x1.a) this.f238g;
        if (aVar != null) {
            fVar.c(str, bVar != null ? new A0.g(this, bVar, 25, false) : null, aVar);
        } else {
            fVar.e(str, bVar != null ? new A0.g(this, bVar, 25, false) : null);
        }
    }

    public void f(S1.m mVar) {
        String str = (String) this.e;
        S1.f fVar = (S1.f) this.f236d;
        p074x1.a aVar = (p074x1.a) this.f238g;
        if (aVar != null) {
            fVar.c(str, mVar != null ? new A0.g(this, mVar, 27, false) : null, aVar);
        } else {
            fVar.e(str, mVar != null ? new A0.g(this, mVar, 27, false) : null);
        }
    }

    @Override // p053p2.a
    public Object get() {
        return new m((Executor) ((p053p2.a) this.f236d).get(), (F0.c) ((p053p2.a) this.e).get(), (d) ((D0.b) this.f238g).get(), (G0.c) ((p053p2.a) this.f237f).get());
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, boolean z2) {
        this.f236d = obj;
        this.e = obj2;
        this.f237f = obj3;
        this.f238g = obj4;
    }

    public n(InterfaceC0050v interfaceC0050v, K k3, M m3) {
        this.f236d = interfaceC0050v;
        this.e = m3;
        this.f237f = K2.i.a(Integer.MAX_VALUE, 0, 6);
        this.f238g = new C0006g(5);
        S s3 = (S) interfaceC0050v.j().f(C0049u.e);
        if (s3 != null) {
            ((b0) s3).I(false, true, new Q2.b(2, k3, this));
        }
    }

    public n(S1.f fVar, String str) {
        this(fVar, str, s.f1597a, null, false);
    }

    public n(Typeface typeface, P.b bVar) {
        int i3;
        int i4;
        this.f238g = typeface;
        this.f236d = bVar;
        this.f237f = new r(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i5 = iA + bVar.f97a;
            i3 = ((ByteBuffer) bVar.f100d).getInt(((ByteBuffer) bVar.f100d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        this.e = new char[i3 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + bVar.f97a;
            i4 = ((ByteBuffer) bVar.f100d).getInt(((ByteBuffer) bVar.f100d).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            O.n nVar = new O.n(this, i7);
            P.a aVarC = nVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f100d).getInt(iA3 + aVarC.f97a) : 0, (char[]) this.e, i7 * 2);
            if (nVar.b() > 0) {
                ((r) this.f237f).a(nVar, 0, nVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public n(P p3, List list) {
        this.f238g = p3;
        this.f236d = Q2.e.a();
        C0041l c0041l = new C0041l(true);
        c0041l.H(null);
        this.e = c0041l;
        this.f237f = p059r2.d.g(list);
    }
}
