package p024g2;

import M.j;
import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Size f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Size f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CamcorderProfile f4511d;
    public EncoderProfiles e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4512f;

    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    public static EncoderProfiles b(int i3, int i4) {
        if (i3 < 0) {
            throw new AssertionError("getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers.");
        }
        String string = Integer.toString(i3);
        int iB = j.b(i4);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB != 4) {
                            if (iB == 5) {
                                if (CamcorderProfile.hasProfile(i3, 1)) {
                                    return CamcorderProfile.getAll(string, 1);
                                }
                            }
                        }
                        if (CamcorderProfile.hasProfile(i3, 8)) {
                            return CamcorderProfile.getAll(string, 8);
                        }
                    }
                    if (CamcorderProfile.hasProfile(i3, 6)) {
                        return CamcorderProfile.getAll(string, 6);
                    }
                }
                if (CamcorderProfile.hasProfile(i3, 5)) {
                    return CamcorderProfile.getAll(string, 5);
                }
            }
            if (CamcorderProfile.hasProfile(i3, 4)) {
                return CamcorderProfile.getAll(string, 4);
            }
            if (CamcorderProfile.hasProfile(i3, 7)) {
                return CamcorderProfile.getAll(string, 7);
            }
        } else if (CamcorderProfile.hasProfile(i3, 7)) {
            return CamcorderProfile.getAll(string, 7);
        }
        if (CamcorderProfile.hasProfile(i3, 0)) {
            return CamcorderProfile.getAll(string, 0);
        }
        throw new IllegalArgumentException("No capture session available for current capture session.");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    public static CamcorderProfile c(int i3, int i4) {
        if (i3 < 0) {
            throw new AssertionError("getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers.");
        }
        int iB = j.b(i4);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB != 4) {
                            if (iB == 5) {
                                if (CamcorderProfile.hasProfile(i3, 1)) {
                                    return CamcorderProfile.get(i3, 1);
                                }
                            }
                        }
                        if (CamcorderProfile.hasProfile(i3, 8)) {
                            return CamcorderProfile.get(i3, 8);
                        }
                    }
                    if (CamcorderProfile.hasProfile(i3, 6)) {
                        return CamcorderProfile.get(i3, 6);
                    }
                }
                if (CamcorderProfile.hasProfile(i3, 5)) {
                    return CamcorderProfile.get(i3, 5);
                }
            }
            if (CamcorderProfile.hasProfile(i3, 4)) {
                return CamcorderProfile.get(i3, 4);
            }
            if (CamcorderProfile.hasProfile(i3, 7)) {
                return CamcorderProfile.get(i3, 7);
            }
        } else if (CamcorderProfile.hasProfile(i3, 7)) {
            return CamcorderProfile.get(i3, 7);
        }
        if (CamcorderProfile.hasProfile(i3, 0)) {
            return CamcorderProfile.get(i3, 0);
        }
        throw new IllegalArgumentException("No capture session available for current capture session.");
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
    }
}
