package androidx.datastore.preferences.protobuf;

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
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2243a;

    static {
        char[] cArr = new char[80];
        f2243a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f2243a, 0, i4);
            i3 -= i4;
        }
    }

    public static void b(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i3, sb);
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
            C0126h c0126h = C0126h.f2295f;
            sb.append(p013d1.G.a(new C0126h(((String) obj).getBytes(C.f2218a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0126h) {
            sb.append(": \"");
            sb.append(p013d1.G.a((C0126h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0143z) {
            sb.append(" {");
            c((AbstractC0143z) obj, sb, i3 + 2);
            sb.append("\n");
            a(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i3 + 2;
        b(sb, i5, "key", entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        a(i3, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    public static void c(AbstractC0143z abstractC0143z, StringBuilder sb, int i3) {
        int i4;
        Method method;
        Method method2;
        Object objG;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0143z.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i4 = 3;
            if (i5 >= length) {
                break;
            }
            Method method5 = declaredMethods[i5];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i4);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i3, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0143z.g(method4, abstractC0143z, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i3, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0143z.g(method3, abstractC0143z, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objG = AbstractC0143z.g(method, abstractC0143z, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objG instanceof Boolean) {
                                    zEquals = !((Boolean) objG).booleanValue();
                                } else if (objG instanceof Integer) {
                                    if (((Integer) objG).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objG).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objG).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objG instanceof String) {
                                    zEquals = objG.equals("");
                                } else if (objG instanceof C0126h) {
                                    zEquals = objG.equals(C0126h.f2295f);
                                } else if ((objG instanceof AbstractC0119a) ? !((objG instanceof Enum) && ((Enum) objG).ordinal() == 0) : objG != ((AbstractC0143z) ((AbstractC0143z) ((AbstractC0119a) objG)).e(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0143z.g(method2, abstractC0143z, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i3, strSubstring, objG);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objG = AbstractC0143z.g(method, abstractC0143z, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objG instanceof Boolean) {
                                zEquals = !((Boolean) objG).booleanValue();
                            } else if (objG instanceof Integer) {
                                if (((Integer) objG).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objG).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objG).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objG instanceof String) {
                                zEquals = objG.equals("");
                            } else if (objG instanceof C0126h) {
                                zEquals = objG.equals(C0126h.f2295f);
                            } else if (objG instanceof AbstractC0119a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0143z.g(method2, abstractC0143z, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i3, strSubstring, objG);
                        }
                    }
                }
            }
            i4 = 3;
        }
        j0 j0Var = abstractC0143z.unknownFields;
        if (j0Var != null) {
            for (int i6 = 0; i6 < j0Var.f2313a; i6++) {
                b(sb, i3, String.valueOf(j0Var.f2314b[i6] >>> 3), j0Var.f2315c[i6]);
            }
        }
    }
}
