package L;

import A2.p;
import J.C0071q;
import J.InterfaceC0055a;
import J.O;
import J.Z;
import R2.l;
import java.io.IOException;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0055a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R2.i f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f852d;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q2.d f853f;

    public i(R2.i iVar, l lVar, Z z2, e eVar) {
        B2.h.e(iVar, "fileSystem");
        B2.h.e(lVar, "path");
        B2.h.e(z2, "coordinator");
        this.f849a = iVar;
        this.f850b = lVar;
        this.f851c = z2;
        this.f852d = eVar;
        this.e = new a();
        this.f853f = Q2.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:33:0x007c, B:43:0x008f, B:42:0x008c, B:39:0x0087), top: B:60:0x0020, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [L.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [L.g, u2.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [L.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [L.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [J.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final Object a(C0071q c0071q, u2.b bVar) throws Throwable {
        ?? gVar;
        c cVar;
        Throwable th;
        ?? r3;
        ?? r9;
        if (bVar instanceof g) {
            g gVar2 = (g) bVar;
            int i3 = gVar2.f841l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar2.f841l = i3 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(this, bVar);
            }
        } else {
            gVar = new g(this, bVar);
        }
        Object obj = gVar.f839j;
        t2.a aVar = t2.a.f5737d;
        int i4 = gVar.f841l;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0071q = gVar.f838i;
                cVar = gVar.f837h;
                gVar = gVar.f836g;
                try {
                    AbstractC0449g3.b(obj);
                    r3 = gVar;
                    r9 = c0071q;
                    try {
                        cVar.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r3.f853f.e(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        cVar.close();
                    } catch (Throwable th4) {
                        AbstractC0443f3.a(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC0449g3.b(obj);
            if (this.e.f821a.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zD = this.f853f.d(null);
            try {
                c cVar2 = new c(this.f849a, this.f850b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zD);
                    gVar.f836g = this;
                    gVar.f837h = cVar2;
                    gVar.f838i = zD;
                    gVar.f841l = 1;
                    Object objP = c0071q.p(cVar2, boolValueOf, gVar);
                    if (objP == aVar) {
                        return aVar;
                    }
                    r3 = this;
                    cVar = cVar2;
                    obj = objP;
                    r9 = zD;
                    cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r3.f853f.e(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    gVar = this;
                    cVar = cVar2;
                    th = th5;
                    c0071q = zD;
                    cVar.close();
                    throw th;
                }
            } catch (Throwable th6) {
                gVar = this;
                th = th6;
                c0071q = zD;
                if (c0071q != 0) {
                    gVar.f853f.e(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0071q != 0) {
                gVar.f853f.e(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:73:0x0146, B:70:0x0141), top: B:95:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:73:0x0146, B:70:0x0141), top: B:95:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:73:0x0146, B:70:0x0141), top: B:95:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:98:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [L.i] */
    /* JADX WARN: Type inference failed for: r0v12, types: [L.i] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [L.h, java.lang.Object, u2.b] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [R2.f, R2.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [R2.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v20, types: [R2.f, R2.i] */
    /* JADX WARN: Type inference failed for: r10v23, types: [R2.i] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [A2.p] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [Q2.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t2.a] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [R2.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [R2.l] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15, types: [Q2.a] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [R2.l] */
    /* JADX WARN: Type inference failed for: r2v7, types: [R2.l] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [L.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [L.i] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v6, types: [R2.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(O o3, u2.b bVar) throws Throwable {
        ?? hVar;
        ?? r6;
        ?? D3;
        l lVarC;
        R2.e eVarB;
        ?? r11;
        ?? r10;
        ?? r8;
        k kVar;
        Throwable th;
        InterfaceC0055a interfaceC0055a;
        ?? r3;
        ?? r4;
        ?? r5;
        if (bVar instanceof h) {
            h hVar2 = (h) bVar;
            int i3 = hVar2.f848m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar2.f848m = i3 - Integer.MIN_VALUE;
                hVar = hVar2;
            } else {
                hVar = new h(this, bVar);
            }
        } else {
            hVar = new h(this, bVar);
        }
        ?? r12 = hVar.f846k;
        ?? r7 = t2.a.f5737d;
        ?? r9 = hVar.f848m;
        try {
            try {
                try {
                    try {
                        if (r9 == 0) {
                            AbstractC0449g3.b(r12);
                            if (this.e.f821a.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            lVarC = this.f850b.c();
                            if (lVarC == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            R2.i iVar = this.f849a;
                            iVar.getClass();
                            p059r2.b<l> bVar2 = new p059r2.b();
                            for (l lVarC2 = lVarC; lVarC2 != null && !iVar.a(lVarC2); lVarC2 = lVarC2.c()) {
                                bVar2.addFirst(lVarC2);
                            }
                            for (l lVar : bVar2) {
                                B2.h.e(lVar, "dir");
                                if (!lVar.e().mkdir() && ((eVarB = iVar.b(lVar)) == null || !eVarB.f1520b)) {
                                    throw new IOException("failed to create directory: " + lVar);
                                }
                            }
                            hVar.f842g = this;
                            hVar.f843h = o3;
                            hVar.f844i = lVarC;
                            ?? r13 = this.f853f;
                            hVar.f845j = r13;
                            hVar.f848m = 1;
                            if (r13.c(hVar) == r7) {
                                return r7;
                            }
                            r6 = this;
                            r10 = o3;
                            r11 = r13;
                        } else {
                            if (r9 != 1) {
                                if (r9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0055a = (InterfaceC0055a) hVar.f845j;
                                r7 = hVar.f844i;
                                r9 = (Q2.a) hVar.f843h;
                                hVar = hVar.f842g;
                                try {
                                    AbstractC0449g3.b(r12);
                                    r4 = hVar;
                                    r3 = r7;
                                    r5 = r9;
                                    try {
                                        interfaceC0055a.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r4.f849a.a(r3)) {
                                        r4.f849a.c(r3, r4.f850b);
                                    }
                                    ((Q2.d) r5).e(null);
                                    return p055q2.g.f5603a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        interfaceC0055a.close();
                                    } catch (Throwable th4) {
                                        AbstractC0443f3.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            Q2.a aVar = (Q2.a) hVar.f845j;
                            lVarC = hVar.f844i;
                            p pVar = (p) hVar.f843h;
                            i iVar2 = hVar.f842g;
                            AbstractC0449g3.b(r12);
                            r11 = aVar;
                            r10 = pVar;
                            r6 = iVar2;
                        }
                        hVar.f842g = r6;
                        hVar.f843h = r11;
                        hVar.f844i = D3;
                        hVar.f845j = kVar;
                        hVar.f848m = 2;
                        if (r10.h(kVar, hVar) == r7) {
                            return r7;
                        }
                        r3 = D3;
                        interfaceC0055a = kVar;
                        r4 = r6;
                        r5 = r11;
                        interfaceC0055a.close();
                        th = null;
                        if (th == null) {
                            throw th;
                        }
                        if (r4.f849a.a(r3)) {
                            r4.f849a.c(r3, r4.f850b);
                        }
                        ((Q2.d) r5).e(null);
                        return p055q2.g.f5603a;
                    } catch (Throwable th5) {
                        r7 = D3;
                        hVar = r6;
                        r9 = r11;
                        th = th5;
                        interfaceC0055a = kVar;
                        interfaceC0055a.close();
                        throw th;
                    }
                    r8.d(D3);
                    kVar = new k(r8, D3);
                } catch (IOException e) {
                    e = e;
                    if (r6.f849a.a(D3)) {
                        try {
                            ?? r14 = r6.f849a;
                            r14.getClass();
                            r14.d(D3);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                StringBuilder sb = new StringBuilder();
                l lVar2 = r6.f850b;
                r8 = r6.f849a;
                sb.append(lVar2.b());
                sb.append(".tmp");
                D3 = lVarC.d(sb.toString());
            } catch (Throwable th6) {
                th = th6;
                ((Q2.d) r12).e(null);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            r6 = hVar;
            D3 = r7;
            if (r6.f849a.a(D3)) {
                ?? r15 = r6.f849a;
                r15.getClass();
                r15.d(D3);
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r12 = r9;
            ((Q2.d) r12).e(null);
            throw th;
        }
    }

    @Override // J.InterfaceC0055a
    public final void close() {
        this.e.f821a.set(true);
        this.f852d.a();
    }
}
