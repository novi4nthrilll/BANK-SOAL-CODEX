package L;

import J.InterfaceC0055a;
import R2.l;
import R2.p;
import java.io.Closeable;
import java.io.FileNotFoundException;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0552y;

/* JADX INFO: loaded from: classes.dex */
public class c implements InterfaceC0055a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R2.i f827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f829c;

    public c(R2.i iVar, l lVar) {
        B2.h.e(iVar, "fileSystem");
        B2.h.e(lVar, "path");
        this.f827a = iVar;
        this.f828b = lVar;
        this.f829c = new a();
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [L.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [L.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4, types: [L.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
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
    public static Object a(c cVar, u2.b bVar) {
        b bVar2;
        ?? r8;
        p pVar;
        Throwable th;
        Throwable th2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i3 = bVar2.f826k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar2.f826k = i3 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(cVar, bVar);
            }
        } else {
            bVar2 = new b(cVar, bVar);
        }
        Object objA = bVar2.f824i;
        t2.a aVar = t2.a.f5737d;
        ?? r3 = bVar2.f826k;
        N.i iVar = N.i.f1037a;
        Throwable th3 = null;
        try {
            try {
                if (r3 == 0) {
                    AbstractC0449g3.b(objA);
                    if (cVar.f829c.f821a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        p pVarA = AbstractC0552y.a(cVar.f827a.f(cVar.f828b));
                        try {
                            bVar2.f822g = cVar;
                            bVar2.f823h = pVarA;
                            bVar2.f826k = 1;
                            N.b bVarA = iVar.a(pVarA);
                            if (bVarA == aVar) {
                                return aVar;
                            }
                            pVar = pVarA;
                            objA = bVarA;
                            if (pVar != null) {
                                pVar.close();
                            }
                            th2 = null;
                        } catch (Throwable th4) {
                            r3 = cVar;
                            pVar = pVarA;
                            th = th4;
                            if (pVar != null) {
                                pVar.close();
                            }
                            th2 = th;
                            objA = null;
                        }
                    } catch (FileNotFoundException unused) {
                        r8 = cVar;
                        R2.i iVar2 = r8.f827a;
                        l lVar = r8.f828b;
                        if (!iVar2.a(lVar)) {
                            return new N.b(true);
                        }
                        p pVarA2 = AbstractC0552y.a(r8.f827a.f(lVar));
                        bVar2.f822g = pVarA2;
                        bVar2.f823h = null;
                        bVar2.f826k = 2;
                        objA = iVar.a(pVarA2);
                        cVar = pVarA2;
                        if (objA == aVar) {
                            return aVar;
                        }
                        if (cVar != 0) {
                            cVar.close();
                        }
                        if (th3 == null) {
                            throw th3;
                        }
                        B2.h.b(objA);
                        return objA;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Closeable closeable = (Closeable) bVar2.f822g;
                        AbstractC0449g3.b(objA);
                        cVar = closeable;
                        if (cVar != 0) {
                            try {
                                cVar.close();
                            } catch (Throwable th5) {
                                th3 = th5;
                            }
                        }
                        if (th3 == null) {
                            throw th3;
                        }
                        B2.h.b(objA);
                        return objA;
                    }
                    pVar = bVar2.f823h;
                    r3 = (c) bVar2.f822g;
                    try {
                        AbstractC0449g3.b(objA);
                        if (pVar != null) {
                            try {
                                pVar.close();
                            } catch (Throwable th6) {
                                th2 = th6;
                            }
                        }
                        th2 = null;
                    } catch (Throwable th7) {
                        th = th7;
                        if (pVar != null) {
                            try {
                                pVar.close();
                            } catch (Throwable th8) {
                                AbstractC0443f3.a(th, th8);
                            }
                        }
                        th2 = th;
                        objA = null;
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
                B2.h.b(objA);
                return objA;
            } catch (Throwable th9) {
                if (cVar != 0) {
                    try {
                        cVar.close();
                    } catch (Throwable th10) {
                        AbstractC0443f3.a(th9, th10);
                    }
                }
                th3 = th9;
                objA = null;
            }
        } catch (FileNotFoundException unused2) {
            r8 = r3;
        }
    }

    @Override // J.InterfaceC0055a
    public final void close() {
        this.f829c.f821a.set(true);
    }
}
