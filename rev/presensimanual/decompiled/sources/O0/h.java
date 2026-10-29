package O0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0092f f1271b = new C0092f("LibraryVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f1272c = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f1273a = new ConcurrentHashMap();

    public final String a(String str) throws Throwable {
        IOException e;
        String str2;
        InputStream resourceAsStream;
        C0092f c0092f = f1271b;
        u.e(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f1273a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = h.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        String strConcat = str + " version is " + property;
                        if (Log.isLoggable(c0092f.f1269a, 2)) {
                            String str3 = c0092f.f1270b;
                            if (str3 != null) {
                                strConcat = str3.concat(strConcat);
                            }
                            Log.v("LibraryVersion", strConcat);
                        }
                    } else {
                        String strConcat2 = "Failed to get app version for libraryName: " + str;
                        if (Log.isLoggable(c0092f.f1269a, 5)) {
                            String str4 = c0092f.f1270b;
                            if (str4 != null) {
                                strConcat2 = str4.concat(strConcat2);
                            }
                            Log.w("LibraryVersion", strConcat2);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStream = resourceAsStream;
                    str2 = null;
                    c0092f.a("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    InputStream inputStream2 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                str2 = null;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            }
            if (property == null) {
                if (Log.isLoggable(c0092f.f1269a, 3)) {
                    String str5 = c0092f.f1270b;
                    Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                property = "UNKNOWN";
            }
            concurrentHashMap.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
