package E0;

import B.Y;
import B.Z;
import B.a0;
import B.b0;
import I1.AbstractActivityC0028d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.view.Window;
import androidx.lifecycle.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.S2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements G0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f216i;

    public h(j jVar, A0.a aVar, Iterable iterable, p079z0.b bVar, int i3) {
        this.f212d = 0;
        this.f213f = jVar;
        this.f214g = aVar;
        this.f215h = iterable;
        this.f216i = bVar;
        this.e = i3;
    }

    public static boolean h(S.d dVar) {
        if (dVar == null) {
            return true;
        }
        return dVar.f1559g;
    }

    public void a(p040l1.j jVar) {
        if (((HashSet) this.f213f).contains(jVar.f5319a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f214g).add(jVar);
    }

    public p040l1.a b() {
        if (((p040l1.c) this.f215h) != null) {
            return new p040l1.a(new HashSet((HashSet) this.f213f), new HashSet((HashSet) this.f214g), this.e, (p040l1.c) this.f215h, (HashSet) this.f216i);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(boolean z2) {
        for (S.d dVar : ((S.h) this.f214g).a()) {
            if (dVar != null && z2) {
                dVar.f1558f.c(true);
            }
        }
    }

    public boolean d() {
        if (this.e < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (S.d dVar : ((S.h) this.f214g).a()) {
            if (dVar != null && h(dVar) && dVar.f1558f.d()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dVar);
                z2 = true;
            }
        }
        if (((ArrayList) this.f215h) != null) {
            for (int i3 = 0; i3 < ((ArrayList) this.f215h).size(); i3++) {
                S.d dVar2 = (S.d) ((ArrayList) this.f215h).get(i3);
                if (arrayList == null || !arrayList.contains(dVar2)) {
                    dVar2.getClass();
                }
            }
        }
        this.f215h = arrayList;
        return z2;
    }

    public void e(boolean z2) {
        for (S.d dVar : ((S.h) this.f214g).a()) {
            if (dVar != null && z2) {
                dVar.f1558f.e(true);
            }
        }
    }

    public boolean f() {
        if (this.e < 1) {
            return false;
        }
        for (S.d dVar : ((S.h) this.f214g).a()) {
            if (dVar != null && dVar.f1558f.f()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        boolean z2 = false;
        if (this.e < 1) {
            return false;
        }
        for (S.d dVar : ((S.h) this.f214g).a()) {
            if (dVar != null && h(dVar) && dVar.f1558f.g()) {
                z2 = true;
            }
        }
        return z2;
    }

    public void i(R1.d dVar) {
        W0.a z2;
        Window window = ((AbstractActivityC0028d) this.f213f).getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            z2 = new b0(window);
        } else if (i3 >= 26) {
            z2 = new a0(window);
        } else {
            z2 = i3 >= 23 ? new Z(window) : new Y(window);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i4 >= 23) {
            int i5 = dVar.f1451b;
            if (i5 != 0) {
                int iB = M.j.b(i5);
                if (iB == 0) {
                    z2.b(false);
                } else if (iB == 1) {
                    z2.b(true);
                }
            }
            Integer num = dVar.f1450a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = dVar.f1452c;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = dVar.e;
            if (i6 != 0) {
                int iB2 = M.j.b(i6);
                if (iB2 == 0) {
                    z2.a(false);
                } else if (iB2 == 1) {
                    z2.a(true);
                }
            }
            Integer num2 = dVar.f1453d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = dVar.f1454f;
        if (num3 != null && i4 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = dVar.f1455g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f216i = dVar;
    }

    public void j() {
        ((AbstractActivityC0028d) this.f213f).getWindow().getDecorView().setSystemUiVisibility(this.e);
        R1.d dVar = (R1.d) this.f216i;
        if (dVar != null) {
            i(dVar);
        }
    }

    @Override // G0.b
    public Object n() {
        Boolean bool;
        A0.a aVar = (A0.a) this.f214g;
        Iterable iterable = (Iterable) this.f215h;
        p079z0.b bVar = (p079z0.b) this.f216i;
        int i3 = aVar.f6a;
        j jVar = (j) this.f213f;
        if (i3 == 2) {
            F0.i iVar = (F0.i) jVar.f222c;
            iVar.getClass();
            if (iterable.iterator().hasNext()) {
                String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + F0.i.f(iterable);
                SQLiteDatabase sQLiteDatabaseA = iVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement(str).execute();
                    sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabaseA.endTransaction();
                    throw th;
                }
            }
            jVar.f223d.a(bVar, this.e + 1, false);
            return null;
        }
        F0.i iVar2 = (F0.i) jVar.f222c;
        iVar2.getClass();
        if (iterable.iterator().hasNext()) {
            iVar2.a().compileStatement("DELETE FROM events WHERE _id in " + F0.i.f(iterable)).execute();
        }
        F0.c cVar = jVar.f222c;
        if (i3 == 1) {
            long jB = jVar.f225g.b() + aVar.f7b;
            F0.i iVar3 = (F0.i) cVar;
            iVar3.getClass();
            iVar3.c(new F0.e(jB, bVar));
        }
        F0.i iVar4 = (F0.i) cVar;
        SQLiteDatabase sQLiteDatabaseA2 = iVar4.a();
        sQLiteDatabaseA2.beginTransaction();
        try {
            Long lB = F0.i.b(sQLiteDatabaseA2, bVar);
            if (lB == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = iVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            sQLiteDatabaseA2.setTransactionSuccessful();
            sQLiteDatabaseA2.endTransaction();
            if (!bool.booleanValue()) {
                return null;
            }
            jVar.f223d.a(bVar, 1, true);
            return null;
        } catch (Throwable th3) {
            sQLiteDatabaseA2.endTransaction();
            throw th3;
        }
    }

    public String toString() {
        switch (this.f212d) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public h() {
        this.f212d = 1;
        this.f213f = new ArrayList();
        S.h hVar = new S.h();
        hVar.f1572a = new ArrayList();
        new HashMap();
        new HashMap();
        this.f214g = hVar;
        new ArrayList();
        new p074x1.a(this);
        this.f216i = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new ArrayList();
        new p071w1.b(this);
        new CopyOnWriteArrayList();
        final int i3 = 0;
        new A.a(this) { // from class: S.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0.h f1571b;

            {
                this.f1571b = this;
            }

            @Override // A.a
            public final void accept(Object obj) {
                switch (i3) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E0.h hVar2 = this.f1571b;
                        hVar2.getClass();
                        hVar2.c(false);
                        return;
                    case 1:
                        E0.h hVar3 = this.f1571b;
                        hVar3.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            hVar3.e(false);
                            return;
                        }
                        return;
                    case 2:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                }
            }
        };
        final int i4 = 1;
        new A.a(this) { // from class: S.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0.h f1571b;

            {
                this.f1571b = this;
            }

            @Override // A.a
            public final void accept(Object obj) {
                switch (i4) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E0.h hVar2 = this.f1571b;
                        hVar2.getClass();
                        hVar2.c(false);
                        return;
                    case 1:
                        E0.h hVar3 = this.f1571b;
                        hVar3.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            hVar3.e(false);
                            return;
                        }
                        return;
                    case 2:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                }
            }
        };
        final int i5 = 2;
        new A.a(this) { // from class: S.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0.h f1571b;

            {
                this.f1571b = this;
            }

            @Override // A.a
            public final void accept(Object obj) {
                switch (i5) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E0.h hVar2 = this.f1571b;
                        hVar2.getClass();
                        hVar2.c(false);
                        return;
                    case 1:
                        E0.h hVar3 = this.f1571b;
                        hVar3.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            hVar3.e(false);
                            return;
                        }
                        return;
                    case 2:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                }
            }
        };
        final int i6 = 3;
        new A.a(this) { // from class: S.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E0.h f1571b;

            {
                this.f1571b = this;
            }

            @Override // A.a
            public final void accept(Object obj) {
                switch (i6) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E0.h hVar2 = this.f1571b;
                        hVar2.getClass();
                        hVar2.c(false);
                        return;
                    case 1:
                        E0.h hVar3 = this.f1571b;
                        hVar3.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            hVar3.e(false);
                            return;
                        }
                        return;
                    case 2:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        this.f1571b.getClass();
                        throw null;
                }
            }
        };
        this.e = -1;
        new ArrayDeque();
        new l(6, this);
    }

    public h(AbstractActivityC0028d abstractActivityC0028d, A0.g gVar, AbstractActivityC0028d abstractActivityC0028d2) {
        this.f212d = 2;
        y yVar = new y(5, this);
        this.f213f = abstractActivityC0028d;
        this.f214g = gVar;
        gVar.f19f = yVar;
        this.f215h = abstractActivityC0028d2;
        this.e = 1280;
    }

    public h(Class cls, Class[] clsArr) {
        this.f212d = 3;
        HashSet hashSet = new HashSet();
        this.f213f = hashSet;
        this.f214g = new HashSet();
        this.e = 0;
        this.f216i = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            S2.a(cls2, "Null interface");
        }
        Collections.addAll((HashSet) this.f213f, clsArr);
    }
}
