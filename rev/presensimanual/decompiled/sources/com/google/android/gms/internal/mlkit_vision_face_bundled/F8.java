package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class F8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2785a;

    static {
        char[] cArr = new char[80];
        f2785a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(J.a(new C0159a8(((String) obj).getBytes(AbstractC0348t8.f3460a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0169b8) {
            sb.append(": \"");
            sb.append(J.a((AbstractC0169b8) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0299o8) {
            sb.append(" {");
            c((AbstractC0299o8) obj, sb, i3 + 2);
            sb.append("\n");
            b(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i5 = i3 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i5, "key", entry.getKey());
        a(sb, i5, "value", entry.getValue());
        sb.append("\n");
        b(i3, sb);
        sb.append("}");
    }

    public static void b(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f2785a, 0, i4);
            i3 -= i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0200  */
    public static void c(AbstractC0299o8 abstractC0299o8, StringBuilder sb, int i3) {
        int i4;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0299o8.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i4 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i4);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0299o8.d(method2, abstractC0299o8, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0299o8.d(method, abstractC0299o8, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objD = AbstractC0299o8.d(method4, abstractC0299o8, new Object[0]);
                    if (method5 == null) {
                        if (objD instanceof Boolean) {
                            if (((Boolean) objD).booleanValue()) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objD).floatValue()) != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (!(objD instanceof Double)) {
                            if (objD instanceof String) {
                                zEquals = objD.equals("");
                            } else if (objD instanceof AbstractC0169b8) {
                                zEquals = objD.equals(AbstractC0169b8.e);
                            } else if (objD instanceof U7) {
                                if (objD != ((AbstractC0299o8) ((AbstractC0299o8) ((U7) objD)).k(6, null))) {
                                    a(sb, i3, strSubstring, objD);
                                }
                            } else if (!(objD instanceof Enum) || ((Enum) objD).ordinal() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                            if (!zEquals) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objD).doubleValue()) != 0) {
                            a(sb, i3, strSubstring, objD);
                        }
                    } else if (((Boolean) AbstractC0299o8.d(method5, abstractC0299o8, new Object[0])).booleanValue()) {
                        a(sb, i3, strSubstring, objD);
                    }
                }
            }
            i4 = 3;
        }
        if (abstractC0299o8 instanceof AbstractC0269l8) {
            Iterator itC = ((AbstractC0269l8) abstractC0299o8).zzb.c();
            while (itC.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itC.next();
                a(sb, i3, "[202056002]", entry2.getValue());
            }
        }
        S8 s8 = abstractC0299o8.zzc;
        if (s8 != null) {
            for (int i6 = 0; i6 < s8.f2909a; i6++) {
                a(sb, i3, String.valueOf(s8.f2910b[i6] >>> 3), s8.f2911c[i6]);
            }
        }
    }
}
