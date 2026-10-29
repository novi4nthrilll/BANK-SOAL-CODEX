package p060s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5652a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f5653b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5654c = new Object();

    public static void a(l lVar, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f5654c) {
            try {
                WeakHashMap weakHashMap = f5653b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(lVar, sparseArray);
                }
                sparseArray.append(i3, new k(colorStateList, lVar.f5650a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
