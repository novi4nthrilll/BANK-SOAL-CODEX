package Y0;

import I1.w;
import O0.u;
import Y.C0112g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f1922d = null;
    public static String e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1923f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f1924g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f1925h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static j f1929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static k f1930m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1931a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f1926i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2.b f1927j = new C2.b(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p071w1.b f1928k = new p071w1.b(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p074x1.a f1920b = new p074x1.a(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L0.g f1921c = new L0.g(8);

    public e(Context context) {
        this.f1931a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (u.i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0212 A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x026e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0276  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:132:0x0299 A[Catch: all -> 0x0297, TryCatch #4 {all -> 0x0297, blocks: (B:132:0x0299, B:133:0x02b0, B:128:0x028f, B:129:0x0296, B:134:0x02b1, B:135:0x02dd, B:27:0x00b1, B:105:0x021c, B:106:0x0223, B:109:0x0226, B:110:0x0227, B:111:0x022e), top: B:156:0x007c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x009d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #9 {all -> 0x008d, blocks: (B:9:0x0053, B:13:0x0081, B:21:0x0097, B:24:0x009d, B:27:0x00b1, B:105:0x021c, B:106:0x0223, B:109:0x0226, B:110:0x0227, B:111:0x022e, B:112:0x022f, B:114:0x024d, B:116:0x025a), top: B:160:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x0210, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01be A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0200 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0208 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {b -> 0x012a, RemoteException -> 0x012d, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x0299, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0173, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y0.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static e c(Context context, d dVar, String str) throws Throwable {
        ?? r3;
        ?? r10;
        e eVar;
        int i3;
        Boolean bool;
        j jVarH;
        int i4;
        X0.a aVarM;
        Object objO;
        e eVar2;
        i iVar;
        k kVar;
        i iVar2;
        boolean z2;
        X0.a aVarM2;
        Cursor cursor;
        int i5;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f1926i;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i();
        threadLocal.set(iVar4);
        C2.b bVar = f1927j;
        Long l3 = (Long) bVar.get();
        long jLongValue = l3.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0112g c0112gC = dVar.c(context2, str, f1928k);
            int i6 = c0112gC.f1881a;
            try {
                int i7 = c0112gC.f1882b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i6 + " and remote module " + str + ":" + i7);
                    int i8 = c0112gC.f1883c;
                    try {
                        if (i8 != 0) {
                            if (i8 != -1) {
                                i7 = i7;
                                if (i8 == 1 || (i5 = c0112gC.f1882b) != 0) {
                                    if (i8 == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                        eVar = new e(applicationContext);
                                    } else {
                                        if (i8 == 1) {
                                            throw new b("VersionPolicy returned invalid code:" + i8);
                                        }
                                        try {
                                            i3 = c0112gC.f1882b;
                                            try {
                                                synchronized (e.class) {
                                                    if (g(context)) {
                                                        throw new b("Remote loading disabled");
                                                    }
                                                    bool = f1922d;
                                                }
                                                if (bool != null) {
                                                    throw new b("Failed to determine which loading route to use.");
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                                    synchronized (e.class) {
                                                        kVar = f1930m;
                                                    }
                                                    if (kVar != null) {
                                                        throw new b("DynamiteLoaderV2 was not cached.");
                                                    }
                                                    iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null || iVar2.f1934a == null) {
                                                        throw new b("No result cursor");
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = iVar2.f1934a;
                                                    new X0.b(null);
                                                    synchronized (e.class) {
                                                        z2 = f1924g >= 2;
                                                    }
                                                    if (z2) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        aVarM2 = kVar.n(new X0.b(applicationContext2), str, i3, new X0.b(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        aVarM2 = kVar.m(new X0.b(applicationContext2), str, i3, new X0.b(cursor2));
                                                    }
                                                    Context context3 = (Context) X0.b.o(aVarM2);
                                                    if (context3 == null) {
                                                        throw new b("Failed to get module context");
                                                    }
                                                    eVar2 = new e(context3);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                                    jVarH = h(context);
                                                    if (jVarH != null) {
                                                        throw new b("Failed to create IDynamiteLoader.");
                                                    }
                                                    Parcel parcelF = jVarH.f(jVarH.g(), 6);
                                                    i4 = parcelF.readInt();
                                                    parcelF.recycle();
                                                    if (i4 >= 3) {
                                                        iVar = (i) threadLocal.get();
                                                        if (iVar != null) {
                                                            throw new b("No cached result cursor holder");
                                                        }
                                                        aVarM = jVarH.n(new X0.b(context2), str, i3, new X0.b(iVar.f1934a));
                                                    } else if (i4 == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        aVarM = jVarH.o(new X0.b(context2), str, i3);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        aVarM = jVarH.m(new X0.b(context2), str, i3);
                                                    }
                                                    objO = X0.b.o(aVarM);
                                                    if (objO != null) {
                                                        throw new b("Failed to load remote module.");
                                                    }
                                                    eVar2 = new e((Context) objO);
                                                }
                                                eVar = eVar2;
                                            } catch (b e3) {
                                                throw e3;
                                            } catch (RemoteException e4) {
                                                throw new b("Failed to load remote module.", e4);
                                            } catch (Throwable th) {
                                                throw new b("Failed to load remote module.", th);
                                            }
                                        } catch (b e5) {
                                            Log.w("DynamiteModule", "Failed to load remote module: " + e5.getMessage());
                                            int i9 = c0112gC.f1881a;
                                            if (i9 == 0 || dVar.c(context2, str, new w(i9)).f1883c != -1) {
                                                throw new b("Remote load failed. No local fallback found.", e5);
                                            }
                                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                            eVar = new e(applicationContext);
                                        }
                                    }
                                    if (jLongValue == 0) {
                                        f1927j.remove();
                                    } else {
                                        f1927j.set(l3);
                                    }
                                    cursor = iVar4.f1934a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f1926i.set(iVar3);
                                    return eVar;
                                }
                            } else if (c0112gC.f1881a != 0) {
                                i8 = -1;
                                i7 = i7;
                                if (i8 == 1) {
                                }
                                if (i8 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    eVar = new e(applicationContext);
                                } else {
                                    if (i8 == 1) {
                                        throw new b("VersionPolicy returned invalid code:" + i8);
                                    }
                                    i3 = c0112gC.f1882b;
                                    synchronized (e.class) {
                                        if (g(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        bool = f1922d;
                                        if (bool != null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                            synchronized (e.class) {
                                                kVar = f1930m;
                                                if (kVar != null) {
                                                    throw new b("DynamiteLoaderV2 was not cached.");
                                                }
                                                iVar2 = (i) threadLocal.get();
                                                if (iVar2 != null) {
                                                }
                                                throw new b("No result cursor");
                                            }
                                        }
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        jVarH = h(context);
                                        if (jVarH != null) {
                                            throw new b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelF2 = jVarH.f(jVarH.g(), 6);
                                        i4 = parcelF2.readInt();
                                        parcelF2.recycle();
                                        if (i4 >= 3) {
                                            iVar = (i) threadLocal.get();
                                            if (iVar != null) {
                                                throw new b("No cached result cursor holder");
                                            }
                                            aVarM = jVarH.n(new X0.b(context2), str, i3, new X0.b(iVar.f1934a));
                                        } else if (i4 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarM = jVarH.o(new X0.b(context2), str, i3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarM = jVarH.m(new X0.b(context2), str, i3);
                                        }
                                        objO = X0.b.o(aVarM);
                                        if (objO != null) {
                                            throw new b("Failed to load remote module.");
                                        }
                                        eVar2 = new e((Context) objO);
                                        eVar = eVar2;
                                    }
                                }
                                if (jLongValue == 0) {
                                    f1927j.remove();
                                } else {
                                    f1927j.set(l3);
                                }
                                cursor = iVar4.f1934a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f1926i.set(iVar3);
                                return eVar;
                            }
                        }
                        i7 = i5;
                        throw new b("No acceptable module " + str + " found. Local version is " + c0112gC.f1881a + " and remote version is " + c0112gC.f1882b + ".");
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = context2;
                        r10 = i7;
                        if (jLongValue == 0) {
                            f1927j.remove();
                        } else {
                            f1927j.set(l3);
                        }
                        Cursor cursor3 = r3.f1934a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        f1926i.set(r10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = iVar3;
                    r3 = iVar4;
                }
            } catch (Throwable th4) {
                th = th4;
                r3 = iVar4;
                r10 = iVar3;
            }
        } catch (Throwable th5) {
            th = th5;
            r3 = iVar4;
            r10 = iVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #11 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:147:0x0027, inners: #0 }] */
    public static int d(Context context, String str, boolean z2) {
        Throwable th;
        RemoteException e3;
        int i3;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = f1922d;
                boolean z3 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f1923f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z2, true);
                                                String str2 = e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = g.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = e;
                                                            u.f(str3);
                                                            classLoaderA = a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = e;
                                                            u.f(str4);
                                                            classLoaderA = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f1922d = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f1922d = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e4.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z2, false);
                    } catch (b e5) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e5.getMessage());
                        return 0;
                    }
                }
                j jVarH = h(context);
                try {
                    if (jVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelF = jVarH.f(jVarH.g(), 6);
                        int i4 = parcelF.readInt();
                        parcelF.recycle();
                        if (i4 >= 3) {
                            ThreadLocal threadLocal = f1926i;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.f1934a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) X0.b.o(jVarH.p(new X0.b(context), str, z2, ((Long) f1927j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i3 = cursor3.getInt(0);
                                        if (i3 > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.f1934a != null) {
                                                z3 = false;
                                            } else {
                                                iVar2.f1934a = cursor3;
                                            }
                                            cursor2 = z3 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e6) {
                                    e3 = e6;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            X0.b bVar = new X0.b(context);
                            Parcel parcelG = jVarH.g();
                            p002a1.a.c(parcelG, bVar);
                            parcelG.writeString(str);
                            parcelG.writeInt(z2 ? 1 : 0);
                            Parcel parcelF2 = jVarH.f(parcelG, 5);
                            i3 = parcelF2.readInt();
                            parcelF2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            X0.b bVar2 = new X0.b(context);
                            Parcel parcelG2 = jVarH.g();
                            p002a1.a.c(parcelG2, bVar2);
                            parcelG2.writeString(str);
                            parcelG2.writeInt(z2 ? 1 : 0);
                            Parcel parcelF3 = jVarH.f(parcelG2, 3);
                            i3 = parcelF3.readInt();
                            parcelF3.recycle();
                        }
                        return i3;
                    } catch (RemoteException e7) {
                        e3 = e7;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                u.f(context);
            } catch (Exception e8) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e8);
            }
            throw th5;
        }
    }

    public static int e(Context context, String str, boolean z2, boolean z3) throws Throwable {
        boolean z4;
        Cursor cursor = null;
        try {
            try {
                boolean z5 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z2 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f1927j.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z6 = false;
                            int i3 = cursorQuery.getInt(0);
                            if (i3 > 0) {
                                synchronized (e.class) {
                                    try {
                                        e = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f1924g = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z4 = cursorQuery.getInt(columnIndex2) != 0;
                                            f1923f = z4;
                                        } else {
                                            z4 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                i iVar = (i) f1926i.get();
                                if (iVar == null || iVar.f1934a != null) {
                                    z5 = false;
                                } else {
                                    iVar.f1934a = cursorQuery;
                                }
                                cursor = z5 ? null : cursorQuery;
                                z6 = z4;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z3 && z6) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i3;
                            if (e instanceof b) {
                                throw e;
                            }
                            throw new b("V2 version check failed: " + e.getMessage(), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f1930m = kVar;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new b("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f1925h)) {
            return true;
        }
        boolean z2 = false;
        if (f1925h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (L0.e.f872b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z2 = true;
            }
            f1925h = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f1923f = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f1929l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (jVar != null) {
                    f1929l = jVar;
                    return jVar;
                }
            } catch (Exception e3) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e3.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f1931a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new b("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}
