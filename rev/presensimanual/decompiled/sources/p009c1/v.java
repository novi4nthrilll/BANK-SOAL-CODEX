package p009c1;

import A0.g;
import D0.b;
import H0.a;
import H2.i;
import R2.l;
import S1.m;
import W1.C0104l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p040l1.c;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public class v implements a, m, N0.m, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static v f2678d;
    public static final /* synthetic */ v e = new v();

    public static final boolean c(l lVar) {
        l lVar2 = S2.c.f1605c;
        String strB = lVar.b();
        return !i.f(strB.length() - ".class".length(), 0, ".class".length(), strB, ".class", true);
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0104l f(Context context, String[] strArr, String str, b bVar) {
        String[] strArrJ = j(context);
        int length = strArrJ.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = strArrJ[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    for (String str3 : strArr) {
                        StringBuilder sb = new StringBuilder("lib");
                        char c3 = File.separatorChar;
                        sb.append(c3);
                        sb.append(str3);
                        sb.append(c3);
                        sb.append(str);
                        String string = sb.toString();
                        bVar.getClass();
                        b.K("Looking for %s in APK %s...", string, str2);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            C0104l c0104l = new C0104l();
                            c0104l.e = zipFile;
                            c0104l.f1774d = entry;
                            return c0104l;
                        }
                    }
                    i6 = i7;
                }
            }
            i3++;
        }
    }

    public static String[] g(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : j(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // S1.m
    public void a(g gVar, R1.i iVar) {
        iVar.c(null);
    }

    @Override // H0.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public String e(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        return new p068v1.c(sVar.c(p068v1.b.class));
    }

    public boolean i(CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cd */
    @Override // N0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009c1.v.r(java.lang.Object, java.lang.Object):void");
    }
}
