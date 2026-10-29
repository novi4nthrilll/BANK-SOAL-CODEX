package E1;

import A0.g;
import R1.i;
import W1.C0099g;
import W1.C0102j;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p033j1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f239d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f239d = obj;
        this.e = obj2;
    }

    public void a(String str, String str2) {
        ((C0102j) this.f239d).f1772a = false;
        ((C0099g) this.e).a(str, str2);
    }

    @Override // p033j1.c
    public void g(Object obj) {
        List<A1.a> list = (List) obj;
        ((g) this.f239d).getClass();
        ArrayList arrayList = new ArrayList(list.size());
        for (A1.a aVar : list) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Rect rect = aVar.f23a;
            map2.put("left", Integer.valueOf(rect.left));
            map2.put("top", Integer.valueOf(rect.top));
            map2.put("right", Integer.valueOf(rect.right));
            map2.put("bottom", Integer.valueOf(rect.bottom));
            map.put("rect", map2);
            map.put("headEulerAngleX", Float.valueOf(aVar.f27f));
            map.put("headEulerAngleY", Float.valueOf(aVar.f28g));
            map.put("headEulerAngleZ", Float.valueOf(aVar.f29h));
            float f3 = aVar.e;
            if (((f3 < 0.0f || f3 > 1.0f) ? null : Float.valueOf(f3)) != null) {
                map.put("smilingProbability", (f3 < 0.0f || f3 > 1.0f) ? null : Float.valueOf(f3));
            }
            float f4 = aVar.f26d;
            if (((f3 < 0.0f || f3 > 1.0f) ? null : Float.valueOf(f4)) != null) {
                map.put("leftEyeOpenProbability", (f3 < 0.0f || f3 > 1.0f) ? null : Float.valueOf(f4));
            }
            float f5 = aVar.f25c;
            if (((f5 < 0.0f || f5 > 1.0f) ? null : Float.valueOf(f5)) != null) {
                map.put("rightEyeOpenProbability", (f5 < 0.0f || f5 > 1.0f) ? null : Float.valueOf(f5));
            }
            int i3 = aVar.f24b;
            if ((i3 == -1 ? null : Integer.valueOf(i3)) != null) {
                int i4 = aVar.f24b;
                map.put("trackingId", i4 != -1 ? Integer.valueOf(i4) : null);
            }
            HashMap map3 = new HashMap();
            map3.put("bottomMouth", g.t(aVar, 0));
            map3.put("rightMouth", g.t(aVar, 11));
            map3.put("leftMouth", g.t(aVar, 5));
            map3.put("rightEye", g.t(aVar, 10));
            map3.put("leftEye", g.t(aVar, 4));
            map3.put("rightEar", g.t(aVar, 9));
            map3.put("leftEar", g.t(aVar, 3));
            map3.put("rightCheek", g.t(aVar, 7));
            map3.put("leftCheek", g.t(aVar, 1));
            map3.put("noseBase", g.t(aVar, 6));
            map.put("landmarks", map3);
            HashMap map4 = new HashMap();
            map4.put("face", g.m(aVar, 1));
            map4.put("leftEyebrowTop", g.m(aVar, 2));
            map4.put("leftEyebrowBottom", g.m(aVar, 3));
            map4.put("rightEyebrowTop", g.m(aVar, 4));
            map4.put("rightEyebrowBottom", g.m(aVar, 5));
            map4.put("leftEye", g.m(aVar, 6));
            map4.put("rightEye", g.m(aVar, 7));
            map4.put("upperLipTop", g.m(aVar, 8));
            map4.put("upperLipBottom", g.m(aVar, 9));
            map4.put("lowerLipTop", g.m(aVar, 10));
            map4.put("lowerLipBottom", g.m(aVar, 11));
            map4.put("noseBridge", g.m(aVar, 12));
            map4.put("noseBottom", g.m(aVar, 13));
            map4.put("leftCheek", g.m(aVar, 14));
            map4.put("rightCheek", g.m(aVar, 15));
            map.put("contours", map4);
            arrayList.add(map);
        }
        ((i) this.e).c(arrayList);
    }
}
