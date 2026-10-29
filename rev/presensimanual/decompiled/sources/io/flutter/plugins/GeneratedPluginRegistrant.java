package io.flutter.plugins;

import J1.c;
import W1.C0103k;
import android.util.Log;
import androidx.annotation.Keep;
import p041l2.a;
import p046n2.J;
import p057r0.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f698d.a(new C0103k());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e);
        }
        try {
            cVar.f698d.a(new a());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e3);
        }
        try {
            cVar.f698d.a(new p051p0.c());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin geocoding_android, com.baseflow.geocoding.GeocodingPlugin", e4);
        }
        try {
            cVar.f698d.a(new d());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e5);
        }
        try {
            cVar.f698d.a(new D1.a());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin google_mlkit_commons, com.google_mlkit_commons.GoogleMlKitCommonsPlugin", e6);
        }
        try {
            cVar.f698d.a(new E1.c());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin google_mlkit_face_detection, com.google_mlkit_face_detection.GoogleMlKitFaceDetectionPlugin", e7);
        }
        try {
            cVar.f698d.a(new p044m2.d());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e8);
        }
        try {
            cVar.f698d.a(new p048o0.a());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin rive_common, app.rive.rive.RivePlugin", e9);
        }
        try {
            cVar.f698d.a(new F1.a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin sensors_plus, dev.fluttercommunity.plus.sensors.SensorsPlugin", e10);
        }
        try {
            cVar.f698d.a(new J());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e11);
        }
    }
}
