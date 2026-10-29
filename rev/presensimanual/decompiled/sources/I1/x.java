package I1;

import android.util.Log;
import android.view.KeyEvent;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f431d;
    public Object e;

    public /* synthetic */ x() {
        this.f428a = 1;
    }

    public x a() {
        O0.u.a("execute parameter required", ((N0.m) this.f431d) != null);
        return new x(this, (L0.c[]) this.e, this.f429b, this.f430c);
    }

    public int b(boolean z2) {
        String str;
        if (this.f429b) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new S.j());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f430c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f429b);
            ArrayList arrayList = (ArrayList) this.f431d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    S.i iVar = (S.i) arrayList.get(i3);
                    switch (iVar.f1573a) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "REMOVE";
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            str = "HIDE";
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + iVar.f1573a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(iVar.f1574b);
                    if (iVar.f1575c != 0 || iVar.f1576d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(iVar.f1575c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(iVar.f1576d));
                    }
                    if (iVar.e != 0 || iVar.f1577f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(iVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(iVar.f1577f));
                    }
                }
            }
            printWriter.close();
        }
        this.f429b = true;
        E0.h hVar = (E0.h) this.e;
        this.f430c = -1;
        if (!z2) {
            hVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) hVar.f213f)) {
            try {
                if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f430c;
    }

    public String toString() {
        switch (this.f428a) {
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f430c >= 0) {
                    sb.append(" #");
                    sb.append(this.f430c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public x(x xVar, L0.c[] cVarArr, boolean z2, int i3) {
        this.f428a = 2;
        this.e = xVar;
        this.f431d = cVarArr;
        boolean z3 = false;
        if (cVarArr != null && z2) {
            z3 = true;
        }
        this.f429b = z3;
        this.f430c = i3;
    }

    public x(E0.h hVar) {
        this.f428a = 3;
        hVar.getClass();
        this.f431d = new ArrayList();
        this.f430c = -1;
        this.e = hVar;
    }

    public x(D0.b bVar, KeyEvent keyEvent) {
        this.f428a = 0;
        this.e = bVar;
        this.f430c = ((y[]) bVar.e).length;
        this.f429b = false;
        this.f431d = keyEvent;
    }
}
