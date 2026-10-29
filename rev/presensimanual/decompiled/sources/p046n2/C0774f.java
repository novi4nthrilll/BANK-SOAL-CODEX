package p046n2;

import A0.g;
import B2.h;
import E0.n;
import M.k;
import S1.b;
import S1.f;
import S1.l;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0473k3;
import p013d1.I;
import p013d1.W2;
import p055q2.e;
import p074x1.a;

/* JADX INFO: renamed from: n2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0774f f5443a = new C0774f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5444b = new e(new C0772d());

    public static l a() {
        return (l) f5444b.a();
    }

    public static void b(f fVar, final InterfaceC0775g interfaceC0775g, String str) {
        h.e(fVar, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        a aVarL = fVar.l();
        n nVar = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i3 = 6;
            nVar.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i3) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar.e(null);
        }
        n nVar2 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i4 = 12;
            nVar2.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i4) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar2.e(null);
        }
        n nVar3 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i5 = 13;
            nVar3.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i5) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar3.e(null);
        }
        n nVar4 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i6 = 14;
            nVar4.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i6) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar4.e(null);
        }
        n nVar5 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i7 = 0;
            nVar5.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i7) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar5.e(null);
        }
        n nVar6 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i8 = 1;
            nVar6.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i8) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar6.e(null);
        }
        n nVar7 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i9 = 2;
            nVar7.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i9) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar7.e(null);
        }
        n nVar8 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i10 = 3;
            nVar8.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i10) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar8.e(null);
        }
        n nVar9 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i11 = 4;
            nVar9.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i11) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar9.e(null);
        }
        n nVar10 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i12 = 5;
            nVar10.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i12) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar10.e(null);
        }
        n nVar11 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i13 = 7;
            nVar11.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i13) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar11.e(null);
        }
        n nVar12 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i14 = 8;
            nVar12.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i14) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar12.e(null);
        }
        n nVar13 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i15 = 9;
            nVar13.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i15) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar13.e(null);
        }
        n nVar14 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), aVarL, false);
        if (interfaceC0775g != null) {
            final int i16 = 10;
            nVar14.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i16) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        } else {
            nVar14.e(null);
        }
        n nVar15 = new n(fVar, I.g("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), aVarL, false);
        if (interfaceC0775g == null) {
            nVar15.e(null);
        } else {
            final int i17 = 11;
            nVar15.e(new b() { // from class: n2.e
                @Override // S1.b
                public final void d(Object obj, g gVar) {
                    List listA;
                    List listA2;
                    List listA3;
                    List listA4;
                    List listA5;
                    List listA6;
                    List listA7;
                    List listA8;
                    List listA9;
                    List listA10;
                    List listA11;
                    List listA12;
                    List listA13;
                    List listA14;
                    List listA15;
                    switch (i17) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            InterfaceC0775g interfaceC0775g2 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g2.e(str2, str3, (C0776h) obj4);
                                listA = AbstractC0473k3.a(null);
                            } catch (Throwable th) {
                                listA = W2.a(th);
                            }
                            gVar.e(listA);
                            break;
                        case 1:
                            InterfaceC0775g interfaceC0775g3 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g3.m(str4, list3, (C0776h) obj7);
                                listA2 = AbstractC0473k3.a(null);
                            } catch (Throwable th2) {
                                listA2 = W2.a(th2);
                            }
                            gVar.e(listA2);
                            break;
                        case 2:
                            InterfaceC0775g interfaceC0775g4 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA3 = AbstractC0473k3.a(interfaceC0775g4.d(str5, (C0776h) obj9));
                            } catch (Throwable th3) {
                                listA3 = W2.a(th3);
                            }
                            gVar.e(listA3);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0775g interfaceC0775g5 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA4 = AbstractC0473k3.a(interfaceC0775g5.a(str6, (C0776h) obj11));
                            } catch (Throwable th4) {
                                listA4 = W2.a(th4);
                            }
                            gVar.e(listA4);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0775g interfaceC0775g6 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA5 = AbstractC0473k3.a(interfaceC0775g6.o(str7, (C0776h) obj13));
                            } catch (Throwable th5) {
                                listA5 = W2.a(th5);
                            }
                            gVar.e(listA5);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0775g interfaceC0775g7 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA6 = AbstractC0473k3.a(interfaceC0775g7.s(str8, (C0776h) obj15));
                            } catch (Throwable th6) {
                                listA6 = W2.a(th6);
                            }
                            gVar.e(listA6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0775g interfaceC0775g8 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g8.t(str9, zBooleanValue, (C0776h) obj18);
                                listA7 = AbstractC0473k3.a(null);
                            } catch (Throwable th7) {
                                listA7 = W2.a(th7);
                            }
                            gVar.e(listA7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0775g interfaceC0775g9 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA8 = AbstractC0473k3.a(interfaceC0775g9.h(str10, (C0776h) obj20));
                            } catch (Throwable th8) {
                                listA8 = W2.a(th8);
                            }
                            gVar.e(listA8);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0775g interfaceC0775g10 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA9 = AbstractC0473k3.a(interfaceC0775g10.r(str11, (C0776h) obj22));
                            } catch (Throwable th9) {
                                listA9 = W2.a(th9);
                            }
                            gVar.e(listA9);
                            break;
                        case 9:
                            InterfaceC0775g interfaceC0775g11 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g11.g(list12, (C0776h) obj23);
                                listA10 = AbstractC0473k3.a(null);
                            } catch (Throwable th10) {
                                listA10 = W2.a(th10);
                            }
                            gVar.e(listA10);
                            break;
                        case 10:
                            InterfaceC0775g interfaceC0775g12 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA11 = AbstractC0473k3.a(interfaceC0775g12.i(list14, (C0776h) obj24));
                            } catch (Throwable th11) {
                                listA11 = W2.a(th11);
                            }
                            gVar.e(listA11);
                            break;
                        case 11:
                            InterfaceC0775g interfaceC0775g13 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listA12 = AbstractC0473k3.a(interfaceC0775g13.u(list16, (C0776h) obj25));
                            } catch (Throwable th12) {
                                listA12 = W2.a(th12);
                            }
                            gVar.e(listA12);
                            break;
                        case 12:
                            InterfaceC0775g interfaceC0775g14 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g14.v(str12, str13, (C0776h) obj28);
                                listA13 = AbstractC0473k3.a(null);
                            } catch (Throwable th13) {
                                listA13 = W2.a(th13);
                            }
                            gVar.e(listA13);
                            break;
                        case 13:
                            InterfaceC0775g interfaceC0775g15 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g15.j(str14, jLongValue, (C0776h) obj31);
                                listA14 = AbstractC0473k3.a(null);
                            } catch (Throwable th14) {
                                listA14 = W2.a(th14);
                            }
                            gVar.e(listA14);
                            break;
                        default:
                            InterfaceC0775g interfaceC0775g16 = interfaceC0775g;
                            h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0775g16.f(str15, dDoubleValue, (C0776h) obj34);
                                listA15 = AbstractC0473k3.a(null);
                            } catch (Throwable th15) {
                                listA15 = W2.a(th15);
                            }
                            gVar.e(listA15);
                            break;
                    }
                }
            });
        }
    }
}
