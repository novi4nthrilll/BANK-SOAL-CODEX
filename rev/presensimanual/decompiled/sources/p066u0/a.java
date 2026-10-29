package p066u0;

import E1.b;
import I1.AbstractActivityC0028d;
import M.j;
import S1.p;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p013d1.AbstractC0419b3;
import p013d1.AbstractC0526t3;
import p054q.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f5749d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractActivityC0028d f5750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f5752c;

    public static int b(Context context) throws p061s0.b {
        ArrayList arrayListC = c(context);
        if (Build.VERSION.SDK_INT < 23) {
            return 4;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            if (AbstractC0419b3.a(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                return (AbstractC0526t3.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && AbstractC0419b3.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    public static ArrayList c(Context context) throws p061s0.b {
        boolean zA = AbstractC0526t3.a(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean zA2 = AbstractC0526t3.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zA && !zA2) {
            throw new p061s0.b();
        }
        ArrayList arrayList = new ArrayList();
        if (zA) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (zA2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    public static boolean d(Context context) throws p061s0.b {
        int iB = b(context);
        return iB == 3 || iB == 4;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    @Override // S1.p
    public final boolean a(int i3, String[] strArr, int[] iArr) {
        boolean zC;
        int i4 = 0;
        if (i3 != 109) {
            return false;
        }
        AbstractActivityC0028d abstractActivityC0028d = this.f5750a;
        if (abstractActivityC0028d == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            b bVar = this.f5751b;
            if (bVar != null) {
                bVar.c(1);
            }
            return false;
        }
        int i5 = 4;
        try {
            ArrayList<String> arrayListC = c(abstractActivityC0028d);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            byte b3 = -1;
            boolean z2 = false;
            boolean z3 = false;
            for (String str : arrayListC) {
                int iIndexOf = Arrays.asList(strArr).indexOf(str);
                if (iIndexOf >= 0) {
                    z2 = true;
                }
                if (iArr[iIndexOf] == 0) {
                    b3 = 0;
                }
                AbstractActivityC0028d abstractActivityC0028d2 = this.f5750a;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                    zC = false;
                } else if (i6 >= 32) {
                    zC = c.a(abstractActivityC0028d2, str);
                } else if (i6 == 31) {
                    zC = p054q.b.b(abstractActivityC0028d2, str);
                } else if (i6 >= 23) {
                    zC = p054q.a.c(abstractActivityC0028d2, str);
                } else {
                    zC = false;
                }
                if (zC) {
                    z3 = true;
                }
            }
            if (!z2) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (b3 != 0) {
                i5 = !z3 ? 2 : 1;
            } else if (Build.VERSION.SDK_INT >= 29) {
                int iIndexOf2 = Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION");
                if (!(iIndexOf2 >= 0 && iArr[iIndexOf2] == 0)) {
                    i5 = 3;
                }
            }
            b bVar2 = this.f5752c;
            if (bVar2 != null) {
                int iB = j.b(i5);
                if (iB != 0) {
                    if (iB == 1) {
                        i4 = 1;
                    } else if (iB == 2) {
                        i4 = 2;
                    } else {
                        if (iB != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i4 = 3;
                    }
                }
                bVar2.e.c(Integer.valueOf(i4));
            }
            return true;
        } catch (p061s0.b unused) {
            b bVar3 = this.f5751b;
            if (bVar3 != null) {
                bVar3.c(4);
            }
            return false;
        }
    }

    public final void e(AbstractActivityC0028d abstractActivityC0028d, b bVar, b bVar2) {
        int i3 = 1;
        if (abstractActivityC0028d == null) {
            bVar2.c(1);
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            ArrayList arrayListC = c(abstractActivityC0028d);
            if (i4 >= 29 && AbstractC0526t3.a(abstractActivityC0028d, "android.permission.ACCESS_BACKGROUND_LOCATION") && b(abstractActivityC0028d) == 3) {
                arrayListC.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            this.f5751b = bVar2;
            this.f5752c = bVar;
            this.f5750a = abstractActivityC0028d;
            AbstractC0419b3.b(abstractActivityC0028d, (String[]) arrayListC.toArray(new String[0]), 109);
            return;
        }
        int iB = j.b(4);
        if (iB == 0) {
            i3 = 0;
        } else if (iB != 1) {
            i3 = 2;
            if (iB != 2) {
                if (iB != 3) {
                    throw new IndexOutOfBoundsException();
                }
                i3 = 3;
            }
        }
        bVar.e.c(Integer.valueOf(i3));
    }
}
