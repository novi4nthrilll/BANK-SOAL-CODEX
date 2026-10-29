package p023g1;

import L0.c;
import O0.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f4507a = {new c(1, "name_ulr_private"), new c(1, "name_sleep_segment_request"), new c(1, "get_last_activity_feature_id"), new c(1, "support_context_feature_id"), new c(2, "get_current_location"), new c(1, "get_last_location_with_request"), new c(1, "set_mock_mode_with_callback"), new c(1, "set_mock_location_with_callback"), new c(1, "inject_location_with_callback"), new c(1, "location_updates_with_callback"), new c(1, "use_safe_parcelable_in_intents"), new c(1, "flp_debug_updates"), new c(1, "google_location_accuracy_enabled"), new c(1, "geofences_with_callback"), new c(1, "location_enabled")};

    public static void a(int i3) {
        boolean z2;
        if (i3 == 100 || i3 == 102 || i3 == 104) {
            z2 = true;
        } else if (i3 == 105) {
            i3 = 105;
            z2 = true;
        } else {
            z2 = false;
        }
        u.b(z2, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i3));
    }

    public static String b(int i3) {
        if (i3 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i3 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i3 == 104) {
            return "LOW_POWER";
        }
        if (i3 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
