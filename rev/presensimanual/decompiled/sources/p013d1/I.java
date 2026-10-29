package p013d1;

import A0.g;
import E0.n;
import M.j;
import M.k;
import S1.f;
import android.content.Context;
import android.location.LocationManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.T2;
import p013d1.V2;
import p013d1.Z2;
import p016e1.F;
import p044m2.b;
import p044m2.d;
import p046n2.C0769a;
import p046n2.C0770b;
import p074x1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class I {
    public static boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static final String b(int i3) {
        int iB = j.b(i3);
        if (iB == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
        }
        if (iB == 1) {
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        if (iB == 2) {
            return "Location services are disabled. To receive location updates the location services should be enabled.";
        }
        if (iB == 3) {
            return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
        }
        if (iB == 4) {
            return "User denied permissions to access the device's location.";
        }
        if (iB == 5) {
            return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String c(int i3) {
        int iB = j.b(i3);
        if (iB == 0) {
            return "ACTIVITY_MISSING";
        }
        if (iB == 1) {
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        if (iB == 2) {
            return "LOCATION_SERVICES_DISABLED";
        }
        if (iB == 3) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (iB == 4) {
            return "PERMISSION_DENIED";
        }
        if (iB == 5) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ int d(int i3) {
        switch (i3) {
            case 1:
                return 1;
            case 2:
                return 2;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static F e(HashMap map, int i3) {
        Collections.unmodifiableMap(new HashMap(map));
        return new F(i3);
    }

    public static String f(String str, int i3) {
        return str + i3;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashMap i(Class cls, F f3) {
        HashMap map = new HashMap();
        map.put(cls, f3);
        return map;
    }

    public static void j(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static void k(f fVar, final d dVar) {
        a aVarL = fVar.l();
        b bVar = b.f5348d;
        n nVar = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, aVarL, false);
        if (dVar != null) {
            final int i3 = 0;
            nVar.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i3) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar.e(null);
        }
        n nVar2 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, fVar.l(), false);
        if (dVar != null) {
            final int i4 = 1;
            nVar2.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i4) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar2.e(null);
        }
        n nVar3 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, fVar.l(), false);
        if (dVar != null) {
            final int i5 = 2;
            nVar3.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i5) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar3.e(null);
        }
        n nVar4 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, fVar.l(), false);
        if (dVar != null) {
            final int i6 = 3;
            nVar4.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i6) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar4.e(null);
        }
        n nVar5 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, fVar.l(), false);
        if (dVar != null) {
            final int i7 = 4;
            nVar5.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i7) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar5.e(null);
        }
        n nVar6 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, fVar.l(), false);
        if (dVar != null) {
            final int i8 = 5;
            nVar6.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i8) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        } else {
            nVar6.e(null);
        }
        n nVar7 = new n(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, fVar.l(), false);
        if (dVar == null) {
            nVar7.e(null);
        } else {
            final int i9 = 6;
            nVar7.e(new S1.b() { // from class: m2.a
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i9) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f5350d.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = T2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f5350d;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(Z2.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = T2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f5350d;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(Z2.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = T2.a(th3);
                            }
                            gVar.e(arrayList3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f5350d.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = T2.a(th4);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f5350d.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = T2.a(th5);
                            }
                            gVar.e(arrayList5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f5350d.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = T2.a(th6);
                            }
                            gVar.e(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = T2.a(th7);
                            }
                            gVar.e(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public static void l(f fVar, final C0769a c0769a) {
        a aVarL = fVar.l();
        C0770b c0770b = C0770b.e;
        n nVar = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i3 = 0;
            nVar.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i3) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar.e(null);
        }
        n nVar2 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i4 = 1;
            nVar2.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i4) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar2.e(null);
        }
        n nVar3 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i5 = 2;
            nVar3.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i5) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar3.e(null);
        }
        n nVar4 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i6 = 3;
            nVar4.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i6) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar4.e(null);
        }
        n nVar5 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i7 = 4;
            nVar5.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i7) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar5.e(null);
        }
        n nVar6 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i8 = 5;
            nVar6.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i8) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar6.e(null);
        }
        n nVar7 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i9 = 6;
            nVar7.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i9) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar7.e(null);
        }
        n nVar8 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0770b, aVarL, false);
        if (c0769a != null) {
            final int i10 = 7;
            nVar8.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i10) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            nVar8.e(null);
        }
        n nVar9 = new n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0770b, aVarL, false);
        if (c0769a == null) {
            nVar9.e(null);
        } else {
            final int i11 = 8;
            nVar9.e(new S1.b() { // from class: n2.c
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    switch (i11) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            C0769a c0769a2 = c0769a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0769a2.f5439d.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = V2.a(th);
                            }
                            gVar.e(arrayList);
                            break;
                        case 1:
                            C0769a c0769a3 = c0769a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0769a3.f5439d.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = V2.a(th2);
                            }
                            gVar.e(arrayList2);
                            break;
                        case 2:
                            C0769a c0769a4 = c0769a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0769a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = V2.a(th3);
                            }
                            gVar.e(arrayList4);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0769a c0769a5 = c0769a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0769a5.f5439d.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = V2.a(th4);
                            }
                            gVar.e(arrayList6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0769a c0769a6 = c0769a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0769a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0769a6.f5439d.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = V2.a(th5);
                            }
                            gVar.e(arrayList8);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0769a c0769a7 = c0769a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0769a7.f5439d.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = V2.a(th6);
                            }
                            gVar.e(arrayList10);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0769a c0769a8 = c0769a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0769a8.f5439d.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0769a8.e.e(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = V2.a(th7);
                            }
                            gVar.e(arrayList12);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0769a c0769a9 = c0769a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0769a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = V2.a(th8);
                            }
                            gVar.e(arrayList14);
                            break;
                        default:
                            C0769a c0769a10 = c0769a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0769a10.c((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = V2.a(th9);
                            }
                            gVar.e(arrayList16);
                            break;
                    }
                }
            });
        }
    }
}
