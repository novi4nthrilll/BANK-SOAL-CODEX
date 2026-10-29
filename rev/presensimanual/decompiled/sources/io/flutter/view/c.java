package io.flutter.view;

import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p013d1.AbstractC0413a3;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class c implements J1.j, J1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4749a;

    public /* synthetic */ c(Object obj) {
        this.f4749a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.f fVar;
        ArrayList arrayList;
        i iVar;
        int i3;
        int i4;
        i iVar2;
        String str;
        String str2;
        float f3;
        float f4;
        Integer num;
        boolean z2;
        WindowInsets rootWindowInsets;
        Activity activityB;
        int i5;
        m mVar;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        m mVar2 = (m) this.f4749a;
        mVar2.getClass();
        ArrayList<i> arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            fVar = mVar2.e;
            if (!zHasRemaining) {
                break;
            }
            i iVarB = mVar2.b(byteBuffer.getInt());
            iVarB.f4782C = true;
            iVarB.f4788I = iVarB.f4820r;
            iVarB.f4789J = iVarB.f4818p;
            iVarB.f4783D = iVarB.f4806c;
            iVarB.f4784E = iVarB.f4807d;
            iVarB.f4785F = iVarB.f4809g;
            iVarB.f4786G = iVarB.f4810h;
            iVarB.f4787H = iVarB.f4814l;
            iVarB.f4806c = byteBuffer.getInt();
            iVarB.f4807d = byteBuffer.getInt();
            iVarB.e = byteBuffer.getInt();
            iVarB.f4808f = byteBuffer.getInt();
            iVarB.f4809g = byteBuffer.getInt();
            iVarB.f4810h = byteBuffer.getInt();
            iVarB.f4811i = byteBuffer.getInt();
            iVarB.f4812j = byteBuffer.getInt();
            iVarB.f4813k = byteBuffer.getInt();
            iVarB.f4814l = byteBuffer.getFloat();
            iVarB.f4815m = byteBuffer.getFloat();
            iVarB.f4816n = byteBuffer.getFloat();
            int i6 = byteBuffer.getInt();
            iVarB.f4817o = i6 == -1 ? null : strArr[i6];
            int i7 = byteBuffer.getInt();
            iVarB.f4818p = i7 == -1 ? null : strArr[i7];
            iVarB.f4819q = i.h(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            iVarB.f4820r = i8 == -1 ? null : strArr[i8];
            iVarB.f4821s = i.h(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            iVarB.f4822t = i9 == -1 ? null : strArr[i9];
            iVarB.f4823u = i.h(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            iVarB.v = i10 == -1 ? null : strArr[i10];
            iVarB.f4824w = i.h(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            iVarB.f4825x = i11 == -1 ? null : strArr[i11];
            iVarB.f4826y = i.h(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            iVarB.f4827z = i12 == -1 ? null : strArr[i12];
            int i13 = byteBuffer.getInt();
            iVarB.f4780A = i13 == -1 ? null : strArr[i13];
            byteBuffer.getInt();
            iVarB.K = byteBuffer.getFloat();
            iVarB.f4790L = byteBuffer.getFloat();
            iVarB.f4791M = byteBuffer.getFloat();
            iVarB.f4792N = byteBuffer.getFloat();
            if (iVarB.f4793O == null) {
                iVarB.f4793O = new float[16];
            }
            for (int i14 = 0; i14 < 16; i14++) {
                iVarB.f4793O[i14] = byteBuffer.getFloat();
            }
            iVarB.f4799V = true;
            iVarB.f4801X = true;
            int i15 = byteBuffer.getInt();
            ArrayList arrayList3 = iVarB.f4795Q;
            arrayList3.clear();
            ArrayList arrayList4 = iVarB.f4796R;
            arrayList4.clear();
            int i16 = 0;
            while (true) {
                mVar = iVarB.f4804a;
                if (i16 >= i15) {
                    break;
                }
                i iVarB2 = mVar.b(byteBuffer.getInt());
                iVarB2.f4794P = iVarB;
                arrayList3.add(iVarB2);
                i16++;
            }
            for (int i17 = 0; i17 < i15; i17++) {
                i iVarB3 = mVar.b(byteBuffer.getInt());
                iVarB3.f4794P = iVarB;
                arrayList4.add(iVarB3);
            }
            int i18 = byteBuffer.getInt();
            if (i18 == 0) {
                iVarB.f4797S = null;
            } else {
                ArrayList arrayList5 = iVarB.f4797S;
                if (arrayList5 == null) {
                    iVarB.f4797S = new ArrayList(i18);
                } else {
                    arrayList5.clear();
                }
                for (int i19 = 0; i19 < i18; i19++) {
                    g gVarA = mVar.a(byteBuffer.getInt());
                    int i20 = gVarA.f4777c;
                    if (i20 == 1) {
                        iVarB.f4798T = gVarA;
                    } else if (i20 == 2) {
                        iVarB.U = gVarA;
                    } else {
                        iVarB.f4797S.add(gVarA);
                    }
                    iVarB.f4797S.add(gVarA);
                }
            }
            if (!iVarB.i(14)) {
                if (iVarB.i(6)) {
                    mVar2.f4843l = iVarB;
                }
                if (iVarB.f4782C) {
                    arrayList2.add(iVarB);
                }
                int i21 = iVarB.f4811i;
                if (i21 != -1 && !fVar.c(i21)) {
                    fVar.d(iVarB.f4811i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = mVar2.f4838g;
        i iVar3 = (i) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = mVar2.f4833a;
        if (iVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i22 = Build.VERSION.SDK_INT;
            if (i22 < 23 || ((i22 >= 28 && ((activityB = AbstractC0413a3.b(view.getContext())) == null || activityB.getWindow() == null || !((i5 = activityB.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i5 == 0))) || (rootWindowInsets = view.getRootWindowInsets()) == null)) {
                z2 = false;
            } else {
                if (!mVar2.f4848q.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    iVar3.f4801X = true;
                    iVar3.f4799V = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                mVar2.f4848q = Integer.valueOf(systemWindowInsetLeft);
                z2 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            }
            iVar3.m(fArr, hashSet, z2);
            iVar3.d(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        i iVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = mVar2.f4846o;
            if (!zHasNext) {
                break;
            }
            i iVar5 = (i) it.next();
            if (!arrayList.contains(Integer.valueOf(iVar5.f4805b))) {
                iVar4 = iVar5;
            }
        }
        if (iVar4 == null && arrayList6.size() > 0) {
            iVar4 = (i) arrayList6.get(arrayList6.size() - 1);
        }
        if (iVar4 != null && (iVar4.f4805b != mVar2.f4847p || arrayList6.size() != arrayList.size())) {
            mVar2.f4847p = iVar4.f4805b;
            String strG = iVar4.g();
            if (strG == null) {
                strG = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                view.setAccessibilityPaneTitle(strG);
            } else {
                AccessibilityEvent accessibilityEventC = mVar2.c(iVar4.f4805b, 32);
                accessibilityEventC.getText().add(strG);
                mVar2.g(accessibilityEventC);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((i) it2.next()).f4805b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            i iVar6 = (i) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(iVar6)) {
                iVar6.f4794P = null;
                if (iVar6.f4811i != -1 && (num = mVar2.f4841j) != null) {
                    View viewPlatformViewOfNode = mVar2.f4836d.platformViewOfNode(num.intValue());
                    fVar.d(iVar6.f4811i);
                    if (viewPlatformViewOfNode == null) {
                        mVar2.f(mVar2.f4841j.intValue(), 65536);
                        mVar2.f4841j = null;
                    }
                }
                int i23 = iVar6.f4811i;
                if (i23 != -1) {
                    fVar.d(i23);
                }
                i iVar7 = mVar2.f4840i;
                if (iVar7 == iVar6) {
                    mVar2.f(iVar7.f4805b, 65536);
                    mVar2.f4840i = null;
                }
                if (mVar2.f4843l == iVar6) {
                    mVar2.f4843l = null;
                }
                if (mVar2.f4845n == iVar6) {
                    mVar2.f4845n = null;
                }
                it3.remove();
            }
        }
        int i24 = 2048;
        AccessibilityEvent accessibilityEventC2 = mVar2.c(0, 2048);
        accessibilityEventC2.setContentChangeTypes(1);
        mVar2.g(accessibilityEventC2);
        for (i iVar8 : arrayList2) {
            if (!Float.isNaN(iVar8.f4814l) && !Float.isNaN(iVar8.f4787H) && iVar8.f4787H != iVar8.f4814l) {
                AccessibilityEvent accessibilityEventC3 = mVar2.c(iVar8.f4805b, 4096);
                float f5 = iVar8.f4814l;
                float f6 = iVar8.f4815m;
                if (Float.isInfinite(f6)) {
                    if (f5 > 70000.0f) {
                        f5 = 70000.0f;
                    }
                    f6 = 100000.0f;
                }
                if (Float.isInfinite(iVar8.f4816n)) {
                    f3 = f6 + 100000.0f;
                    if (f5 < -70000.0f) {
                        f5 = -70000.0f;
                    }
                    f4 = f5 + 100000.0f;
                } else {
                    float f7 = iVar8.f4816n;
                    f3 = f6 - f7;
                    f4 = f5 - f7;
                }
                if (i.c(iVar8, f.SCROLL_UP) || i.c(iVar8, f.SCROLL_DOWN)) {
                    accessibilityEventC3.setScrollY((int) f4);
                    accessibilityEventC3.setMaxScrollY((int) f3);
                } else if (i.c(iVar8, f.SCROLL_LEFT) || i.c(iVar8, f.SCROLL_RIGHT)) {
                    accessibilityEventC3.setScrollX((int) f4);
                    accessibilityEventC3.setMaxScrollX((int) f3);
                }
                int i25 = iVar8.f4812j;
                if (i25 > 0) {
                    accessibilityEventC3.setItemCount(i25);
                    accessibilityEventC3.setFromIndex(iVar8.f4813k);
                    Iterator it4 = iVar8.f4796R.iterator();
                    int i26 = 0;
                    while (it4.hasNext()) {
                        if (!((i) it4.next()).i(14)) {
                            i26++;
                        }
                    }
                    accessibilityEventC3.setToIndex((iVar8.f4813k + i26) - 1);
                }
                mVar2.g(accessibilityEventC3);
            }
            if (iVar8.i(16) && (((str = iVar8.f4818p) != null || iVar8.f4789J != null) && (str == null || (str2 = iVar8.f4789J) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventC4 = mVar2.c(iVar8.f4805b, i24);
                accessibilityEventC4.setContentChangeTypes(1);
                mVar2.g(accessibilityEventC4);
            }
            i iVar9 = mVar2.f4840i;
            if (iVar9 != null && iVar9.f4805b == iVar8.f4805b && (iVar8.f4783D & I.d(3)) == 0 && iVar8.i(3)) {
                AccessibilityEvent accessibilityEventC5 = mVar2.c(iVar8.f4805b, 4);
                accessibilityEventC5.getText().add(iVar8.f4818p);
                mVar2.g(accessibilityEventC5);
            }
            i iVar10 = mVar2.f4843l;
            if (iVar10 != null && (i3 = iVar10.f4805b) == (i4 = iVar8.f4805b) && ((iVar2 = mVar2.f4844m) == null || iVar2.f4805b != i3)) {
                mVar2.f4844m = iVar10;
                mVar2.g(mVar2.c(i4, 8));
            } else if (iVar10 == null) {
                mVar2.f4844m = null;
            }
            i iVar11 = mVar2.f4843l;
            if (iVar11 != null && iVar11.f4805b == iVar8.f4805b && (iVar8.f4783D & I.d(5)) != 0 && iVar8.i(5) && ((iVar = mVar2.f4840i) == null || iVar.f4805b == mVar2.f4843l.f4805b)) {
                String str3 = iVar8.f4788I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = iVar8.f4820r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventC6 = mVar2.c(iVar8.f4805b, 16);
                accessibilityEventC6.setBeforeText(str3);
                accessibilityEventC6.getText().add(str5);
                int i27 = 0;
                while (i27 < str3.length() && i27 < str5.length() && str3.charAt(i27) == str5.charAt(i27)) {
                    i27++;
                }
                if (i27 < str3.length() || i27 < str5.length()) {
                    accessibilityEventC6.setFromIndex(i27);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i27 && length2 >= i27 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventC6.setRemovedCount((length - i27) + 1);
                    accessibilityEventC6.setAddedCount((length2 - i27) + 1);
                } else {
                    accessibilityEventC6 = null;
                }
                if (accessibilityEventC6 != null) {
                    mVar2.g(accessibilityEventC6);
                }
                if (iVar8.f4785F != iVar8.f4809g || iVar8.f4786G != iVar8.f4810h) {
                    AccessibilityEvent accessibilityEventC7 = mVar2.c(iVar8.f4805b, 8192);
                    accessibilityEventC7.getText().add(str5);
                    accessibilityEventC7.setFromIndex(iVar8.f4809g);
                    accessibilityEventC7.setToIndex(iVar8.f4810h);
                    accessibilityEventC7.setItemCount(str5.length());
                    mVar2.g(accessibilityEventC7);
                }
            }
            i24 = 2048;
        }
    }
}
