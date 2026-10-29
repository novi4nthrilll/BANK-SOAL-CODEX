package p027h2;

import I1.AbstractActivityC0028d;
import M.j;
import android.content.IntentFilter;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final IntentFilter f4517g = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0028d f4518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.b f4519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4521d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f4522f;

    public b(AbstractActivityC0028d abstractActivityC0028d, D0.b bVar, boolean z2, int i3) {
        this.f4518a = abstractActivityC0028d;
        this.f4519b = bVar;
        this.f4520c = z2;
        this.f4521d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    public final int a(int i3) {
        int i4;
        if (i3 == 0) {
            i3 = b();
        }
        int iB = j.b(i3);
        if (iB == 0) {
            i4 = 90;
        } else if (iB != 1) {
            int i5 = 180;
            boolean z2 = this.f4520c;
            i4 = 0;
            if (iB == 2) {
                if (!z2) {
                    i5 = 0;
                }
                i4 = i5;
            } else if (iB == 3) {
                if (z2) {
                    i5 = 0;
                }
                i4 = i5;
            }
        } else {
            i4 = 270;
        }
        return ((i4 + this.f4521d) + 270) % 360;
    }

    public final int b() {
        AbstractActivityC0028d abstractActivityC0028d = this.f4518a;
        int rotation = ((WindowManager) abstractActivityC0028d.getSystemService("window")).getDefaultDisplay().getRotation();
        int i3 = abstractActivityC0028d.getResources().getConfiguration().orientation;
        if (i3 == 1) {
            return (rotation == 0 || rotation == 1) ? 1 : 2;
        }
        if (i3 != 2) {
            return 1;
        }
        return (rotation == 0 || rotation == 1) ? 3 : 4;
    }

    public final int c(int i3) {
        if (i3 == 0) {
            i3 = b();
        }
        int iB = j.b(i3);
        int i4 = 0;
        if (iB != 0) {
            if (iB == 1) {
                i4 = 180;
            } else if (iB == 2) {
                i4 = 270;
            } else if (iB == 3) {
                i4 = 90;
            }
        }
        if (this.f4520c) {
            i4 *= -1;
        }
        return ((i4 + this.f4521d) + 360) % 360;
    }
}
