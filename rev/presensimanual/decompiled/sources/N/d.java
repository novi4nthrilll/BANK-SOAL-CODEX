package N;

import I1.B;
import M.k;
import R2.l;
import R2.p;
import R2.u;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p009c1.v;
import p013d1.AbstractC0552y;
import p013d1.AbstractC0556y3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends B2.i implements A2.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj) {
        super(0);
        this.e = i3;
        this.f1031f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    @Override // A2.a
    public final Object a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, IOException, InvocationTargetException {
        ArrayList arrayList;
        p055q2.b bVar;
        p055q2.b bVar2;
        p055q2.b bVar3;
        p055q2.b bVar4 = null;
        Object obj = this.f1031f;
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                File file = (File) ((M.b) obj).a();
                String name = file.getName();
                B2.h.d(name, "getName(...)");
                if (H2.i.j(name, "").equals("preferences_pb")) {
                    String str = l.e;
                    File absoluteFile = file.getAbsoluteFile();
                    B2.h.d(absoluteFile, "file.absoluteFile");
                    return p065t0.e.f(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 1:
                l lVar = S2.c.f1605c;
                ClassLoader classLoader = (ClassLoader) obj;
                Enumeration<URL> resources = classLoader.getResources("");
                B2.h.d(resources, "getResources(\"\")");
                ArrayList<URL> list = Collections.list(resources);
                B2.h.d(list, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url : list) {
                    l lVar2 = S2.c.f1605c;
                    B2.h.d(url, "it");
                    if (B2.h.a(url.getProtocol(), "file")) {
                        R2.i iVar = R2.f.f1525a;
                        String str2 = l.e;
                        bVar3 = new p055q2.b(iVar, p065t0.e.f(new File(url.toURI())));
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 != null) {
                        arrayList2.add(bVar3);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                B2.h.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                ArrayList<URL> list2 = Collections.list(resources2);
                B2.h.d(list2, "list(this)");
                ArrayList arrayList3 = new ArrayList();
                for (URL url2 : list2) {
                    l lVar3 = S2.c.f1605c;
                    B2.h.d(url2, "it");
                    String string = url2.toString();
                    B2.h.d(string, "toString()");
                    if (H2.i.h(string, "jar:file:")) {
                        int iA = H2.i.a(string);
                        B2.h.e(string, "<this>");
                        int iLastIndexOf = string.lastIndexOf("!", iA);
                        if (iLastIndexOf == -1) {
                            bVar2 = bVar4;
                            bVar = bVar2;
                            arrayList = arrayList3;
                        } else {
                            String str3 = l.e;
                            String strSubstring = string.substring(4, iLastIndexOf);
                            B2.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            l lVarF = p065t0.e.f(new File(URI.create(strSubstring)));
                            R2.i iVar2 = R2.f.f1525a;
                            B2.h.e(iVar2, "fileSystem");
                            R2.h hVarE = iVar2.e(lVarF);
                            try {
                                long jC = hVarE.c() - ((long) 22);
                                if (jC < 0) {
                                    throw new IOException("not a zip: size=" + hVarE.c());
                                }
                                arrayList = arrayList3;
                                long jMax = Math.max(jC - 65536, 0L);
                                while (true) {
                                    p pVarA = AbstractC0552y.a(hVarE.d(jC));
                                    try {
                                        if (pVarA.a() == 101010256) {
                                            int iC = pVarA.c() & 65535;
                                            int iC2 = pVarA.c() & 65535;
                                            long jC2 = pVarA.c() & 65535;
                                            if (jC2 != (pVarA.c() & 65535) || iC != 0 || iC2 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            pVarA.g(4L);
                                            long jA = ((long) pVarA.a()) & 4294967295L;
                                            int iC3 = pVarA.c() & 65535;
                                            B b3 = new B(iC3, jC2, jA);
                                            pVarA.d(iC3);
                                            pVarA.close();
                                            long j3 = jC - ((long) 20);
                                            if (j3 > 0) {
                                                p pVarA2 = AbstractC0552y.a(hVarE.d(j3));
                                                try {
                                                    if (pVarA2.a() == 117853008) {
                                                        int iA2 = pVarA2.a();
                                                        long jB = pVarA2.b();
                                                        if (pVarA2.a() != 1 || iA2 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        p pVarA3 = AbstractC0552y.a(hVarE.d(jB));
                                                        try {
                                                            int iA3 = pVarA3.a();
                                                            if (iA3 != 101075792) {
                                                                throw new IOException("bad zip: expected " + S2.a.b(101075792) + " but was " + S2.a.b(iA3));
                                                            }
                                                            pVarA3.g(12L);
                                                            int iA4 = pVarA3.a();
                                                            int iA5 = pVarA3.a();
                                                            long jB2 = pVarA3.b();
                                                            if (jB2 != pVarA3.b() || iA4 != 0 || iA5 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            pVarA3.g(8L);
                                                            B b4 = new B(iC3, jB2, pVarA3.b());
                                                            AbstractC0556y3.a(pVarA3, null);
                                                            b3 = b4;
                                                        } catch (Throwable th) {
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                AbstractC0556y3.a(pVarA3, th);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                    AbstractC0556y3.a(pVarA2, null);
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        AbstractC0556y3.a(pVarA2, th3);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                            long j4 = b3.f341b;
                                            ArrayList arrayList4 = new ArrayList();
                                            p pVarA4 = AbstractC0552y.a(hVarE.d(j4));
                                            try {
                                                long j5 = b3.f340a;
                                                long j6 = 0;
                                                while (j6 < j5) {
                                                    S2.d dVarC = S2.a.c(pVarA4);
                                                    long j7 = j5;
                                                    if (dVarC.e >= j4) {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                    l lVar4 = S2.c.f1605c;
                                                    if (v.c(dVarC.f1607a)) {
                                                        arrayList4.add(dVarC);
                                                    }
                                                    j6++;
                                                    j5 = j7;
                                                }
                                                bVar = null;
                                                AbstractC0556y3.a(pVarA4, null);
                                                u uVar = new u(lVarF, iVar2, S2.a.a(arrayList4));
                                                AbstractC0556y3.a(hVarE, null);
                                                bVar2 = new p055q2.b(uVar, S2.c.f1605c);
                                            } catch (Throwable th5) {
                                                try {
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    AbstractC0556y3.a(pVarA4, th5);
                                                    throw th6;
                                                }
                                            }
                                            try {
                                                throw th;
                                            } catch (Throwable th7) {
                                                AbstractC0556y3.a(hVarE, th);
                                                throw th7;
                                            }
                                        }
                                        ArrayList arrayList5 = arrayList;
                                        pVarA.close();
                                        jC--;
                                        if (jC < jMax) {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                        arrayList = arrayList5;
                                    } catch (Throwable th8) {
                                        pVarA.close();
                                        throw th8;
                                    }
                                }
                            } catch (Throwable th9) {
                                throw th9;
                            }
                        }
                    } else {
                        bVar2 = bVar4;
                        bVar = bVar2;
                        arrayList = arrayList3;
                    }
                    ArrayList arrayList6 = arrayList;
                    if (bVar2 != null) {
                        arrayList6.add(bVar2);
                    }
                    bVar4 = bVar;
                    arrayList3 = arrayList6;
                }
                ArrayList arrayList7 = arrayList3;
                ArrayList arrayList8 = new ArrayList(arrayList7.size() + arrayList2.size());
                arrayList8.addAll(arrayList2);
                arrayList8.addAll(arrayList7);
                return arrayList8;
            case 2:
                ((S.d) obj).getClass();
                throw new IllegalStateException("Can't access ViewModels from detached fragment");
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                p015e0.a aVar = (p015e0.a) obj;
                Class<?> clsLoadClass = aVar.f3925a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                B2.h.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = aVar.f3925a.loadClass("androidx.window.extensions.WindowExtensions");
                B2.h.d(clsLoadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                B2.h.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                p019f0.i iVar3 = (p019f0.i) obj;
                return BigInteger.valueOf(iVar3.f4467d).shiftLeft(32).or(BigInteger.valueOf(iVar3.e)).shiftLeft(32).or(BigInteger.valueOf(iVar3.f4468f));
        }
    }
}
