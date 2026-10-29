package p013d1;

import J1.c;
import android.util.Log;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* JADX INFO: renamed from: d1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0534v {
    public static void a(c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", c.class).invoke(null, cVar);
        } catch (Exception e) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e);
        }
    }
}
