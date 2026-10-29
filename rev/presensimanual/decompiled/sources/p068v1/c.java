package p068v1;

import D0.b;
import F0.g;
import F0.h;
import F0.i;
import I1.AbstractActivityC0028d;
import I1.m;
import M.j;
import W1.C0104l;
import W1.J;
import android.database.Cursor;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.util.Size;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p067u1.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5762d;

    public c(HashMap map) {
        this.f5762d = map;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00af  */
    public static c g(a aVar, C0104l c0104l, AbstractActivityC0028d abstractActivityC0028d, b bVar, int i3) {
        Size size;
        EncoderProfiles.VideoProfile videoProfileF;
        c cVar = new c();
        aVar.getClass();
        Y1.a aVar2 = new Y1.a(c0104l, false);
        HashMap map = cVar.f5762d;
        map.put("AUTO_FOCUS", aVar2);
        Z1.a aVar3 = new Z1.a(c0104l);
        aVar3.f1953b = 1;
        map.put("EXPOSURE_LOCK", aVar3);
        p003a2.a aVar4 = new p003a2.a(c0104l);
        aVar4.f1959b = 0.0d;
        map.put("EXPOSURE_OFFSET", aVar4);
        p027h2.c cVar2 = new p027h2.c(c0104l, abstractActivityC0028d, bVar);
        map.put("SENSOR_ORIENTATION", cVar2);
        map.put("EXPOSURE_POINT", new p007b2.a(c0104l, cVar2));
        p010c2.a aVar5 = new p010c2.a(c0104l);
        aVar5.f2679b = 2;
        map.put("FLASH", aVar5);
        map.put("FOCUS_POINT", new p014d2.a(c0104l, cVar2));
        map.put("FPS_RANGE", new p017e2.a(c0104l));
        map.put("NOISE_REDUCTION", new p020f2.a(c0104l));
        String str = (String) c0104l.f1774d;
        p024g2.a aVar6 = new p024g2.a(c0104l);
        try {
            int i4 = Integer.parseInt(str, 10);
            aVar6.f4512f = i4;
            if (i4 >= 0) {
                if (J.a()) {
                    aVar6.f4511d = null;
                    EncoderProfiles encoderProfilesB = p024g2.a.b(i4, i3);
                    aVar6.e = encoderProfilesB;
                    EncoderProfiles.VideoProfile videoProfileF2 = m.f(encoderProfilesB.getVideoProfiles().get(0));
                    if (videoProfileF2 != null) {
                        aVar6.f4509b = new Size(videoProfileF2.getWidth(), videoProfileF2.getHeight());
                    } else {
                        aVar6.e = null;
                        aVar6.f4511d = p024g2.a.c(i4, i3);
                        CamcorderProfile camcorderProfile = aVar6.f4511d;
                        aVar6.f4509b = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                    }
                } else {
                    aVar6.e = null;
                    aVar6.f4511d = p024g2.a.c(i4, i3);
                    CamcorderProfile camcorderProfile2 = aVar6.f4511d;
                    aVar6.f4509b = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
                }
                if (j.b(i3) > 2) {
                    i3 = 3;
                }
                if (!J.a() || (videoProfileF = m.f(p024g2.a.b(i4, i3).getVideoProfiles().get(0))) == null) {
                    CamcorderProfile camcorderProfileC = p024g2.a.c(i4, i3);
                    size = new Size(camcorderProfileC.videoFrameWidth, camcorderProfileC.videoFrameHeight);
                } else {
                    size = new Size(videoProfileF.getWidth(), videoProfileF.getHeight());
                }
                aVar6.f4510c = size;
            }
        } catch (NumberFormatException unused) {
            aVar6.f4512f = -1;
        }
        map.put("RESOLUTION", aVar6);
        map.put("ZOOM_LEVEL", new p031i2.a(c0104l));
        return cVar;
    }

    public p003a2.a a() {
        X1.a aVar = (X1.a) this.f5762d.get("EXPOSURE_OFFSET");
        Objects.requireNonNull(aVar);
        return (p003a2.a) aVar;
    }

    @Override // F0.g
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        p070w0.b bVar = i.f262h;
        while (cursor.moveToNext()) {
            long j3 = cursor.getLong(0);
            Long lValueOf = Long.valueOf(j3);
            HashMap map = this.f5762d;
            Set hashSet = (Set) map.get(lValueOf);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j3), hashSet);
            }
            hashSet.add(new h(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public p007b2.a b() {
        X1.a aVar = (X1.a) this.f5762d.get("EXPOSURE_POINT");
        Objects.requireNonNull(aVar);
        return (p007b2.a) aVar;
    }

    public p014d2.a c() {
        X1.a aVar = (X1.a) this.f5762d.get("FOCUS_POINT");
        Objects.requireNonNull(aVar);
        return (p014d2.a) aVar;
    }

    public p024g2.a d() {
        X1.a aVar = (X1.a) this.f5762d.get("RESOLUTION");
        Objects.requireNonNull(aVar);
        return (p024g2.a) aVar;
    }

    public p027h2.c e() {
        X1.a aVar = (X1.a) this.f5762d.get("SENSOR_ORIENTATION");
        Objects.requireNonNull(aVar);
        return (p027h2.c) aVar;
    }

    public p031i2.a f() {
        X1.a aVar = (X1.a) this.f5762d.get("ZOOM_LEVEL");
        Objects.requireNonNull(aVar);
        return (p031i2.a) aVar;
    }

    public c(Set set) {
        this.f5762d = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap map = this.f5762d;
            bVar.getClass();
            map.put(a.class, bVar.f5761a);
        }
    }

    public c() {
        this.f5762d = new HashMap();
    }
}
