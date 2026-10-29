package A0;

import B.AbstractC0004e;
import B.C0006g;
import B.C0011l;
import E0.n;
import F0.l;
import I1.AbstractActivityC0028d;
import J.C0072s;
import M.k;
import N0.m;
import R1.j;
import R1.o;
import Y.L;
import Y.s;
import Y.t;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.window.BackEvent;
import androidx.lifecycle.y;
import androidx.profileinstaller.ProfileInstallReceiver;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k.AbstractC0742m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p009c1.v;

/* JADX INFO: loaded from: classes.dex */
public final class f implements B0.b, G0.b, L2.d, S1.f, m, S1.m, W.e, L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15d;
    public Object e;

    public /* synthetic */ f(int i3, Object obj) {
        this.f15d = i3;
        this.e = obj;
    }

    public static HashMap p(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    public static int s(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final void u(g gVar, R1.i iVar) {
        byte b3;
        int i3;
        R1.c cVarA;
        ClipDescription primaryClipDescription;
        g gVar2 = (g) this.e;
        if (((y) gVar2.f19f) == null) {
            return;
        }
        String str = (String) gVar.e;
        try {
            boolean zHasMimeType = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (!str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        b3 = -1;
                    } else {
                        b3 = 9;
                    }
                    break;
                case -931781241:
                    if (!str.equals("Share.invoke")) {
                        b3 = -1;
                    } else {
                        b3 = 14;
                    }
                    break;
                case -766342101:
                    if (!str.equals("SystemNavigator.pop")) {
                        b3 = -1;
                    } else {
                        b3 = 10;
                    }
                    break;
                case -720677196:
                    if (!str.equals("Clipboard.setData")) {
                        b3 = -1;
                    } else {
                        b3 = 12;
                    }
                    break;
                case -577225884:
                    if (!str.equals("SystemChrome.setSystemUIChangeListener")) {
                        b3 = -1;
                    } else {
                        b3 = 6;
                    }
                    break;
                case -548468504:
                    if (!str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        b3 = -1;
                    } else {
                        b3 = 3;
                    }
                    break;
                case -247230243:
                    if (!str.equals("HapticFeedback.vibrate")) {
                        b3 = -1;
                    } else {
                        b3 = 1;
                    }
                    break;
                case -215273374:
                    if (!str.equals("SystemSound.play")) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case 241845679:
                    if (!str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        b3 = -1;
                    } else {
                        b3 = 7;
                    }
                    break;
                case 875995648:
                    if (!str.equals("Clipboard.hasStrings")) {
                        b3 = -1;
                    } else {
                        b3 = 13;
                    }
                    break;
                case 1128339786:
                    if (!str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        b3 = -1;
                    } else {
                        b3 = 5;
                    }
                    break;
                case 1390477857:
                    if (!str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        b3 = -1;
                    } else {
                        b3 = 8;
                    }
                    break;
                case 1514180520:
                    if (!str.equals("Clipboard.getData")) {
                        b3 = -1;
                    } else {
                        b3 = 11;
                    }
                    break;
                case 1674312266:
                    if (!str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        b3 = -1;
                    } else {
                        b3 = 4;
                    }
                    break;
                case 2119655719:
                    if (!str.equals("SystemChrome.setPreferredOrientations")) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            Object obj = gVar.f19f;
            switch (b3) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    try {
                        int iC = c.c((String) obj);
                        E0.h hVar = (E0.h) ((y) gVar2.f19f).e;
                        if (iC == 1) {
                            ((AbstractActivityC0028d) hVar.f213f).getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            hVar.getClass();
                        }
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException e) {
                        iVar.a("error", e.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((y) gVar2.f19f).x(c.b((String) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        iVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((AbstractActivityC0028d) ((E0.h) ((y) gVar2.f19f).e).f213f).setRequestedOrientation(g.f(gVar2, (JSONArray) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        iVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i4 = jSONObject.getInt("primaryColor");
                        if (i4 != 0) {
                            i4 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        y yVar = (y) gVar2.f19f;
                        int i5 = Build.VERSION.SDK_INT;
                        AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) ((E0.h) yVar.e).f213f;
                        if (i5 < 28) {
                            abstractActivityC0028d.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i4));
                        } else {
                            abstractActivityC0028d.setTaskDescription(AbstractC0004e.c(string, i4));
                        }
                        iVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        iVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case k.LONG_FIELD_NUMBER /* 4 */:
                    try {
                        ((y) gVar2.f19f).w(g.g(gVar2, (JSONArray) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        iVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case k.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        int iH = g.h(gVar2, (String) obj);
                        E0.h hVar2 = (E0.h) ((y) gVar2.f19f).e;
                        hVar2.getClass();
                        if (iH == 1) {
                            i3 = 1798;
                        } else if (iH == 2) {
                            i3 = 3846;
                        } else {
                            if (iH != 3) {
                                if (iH == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i3 = 1792;
                                }
                                iVar.c(null);
                                return;
                            }
                            i3 = 5894;
                        }
                        hVar2.e = i3;
                        hVar2.j();
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        iVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    E0.h hVar3 = (E0.h) ((y) gVar2.f19f).e;
                    View decorView = ((AbstractActivityC0028d) hVar3.f213f).getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.c(hVar3, decorView));
                    iVar.c(null);
                    return;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((E0.h) ((y) gVar2.f19f).e).j();
                    iVar.c(null);
                    return;
                case k.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((E0.h) ((y) gVar2.f19f).e).i(g.i(gVar2, (JSONObject) obj));
                        iVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        iVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case 9:
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) ((E0.h) ((y) gVar2.f19f).e).f215h;
                    if (abstractActivityC0028d2 != null) {
                        abstractActivityC0028d2.i(zBooleanValue);
                    }
                    iVar.c(null);
                    return;
                case 10:
                    E0.h hVar4 = (E0.h) ((y) gVar2.f19f).e;
                    Object obj2 = hVar4.f215h;
                    AbstractActivityC0028d abstractActivityC0028d3 = (AbstractActivityC0028d) hVar4.f213f;
                    if (abstractActivityC0028d3 instanceof p008c.b) {
                        ((p008c.a) ((p008c.b) abstractActivityC0028d3)).getClass();
                        throw null;
                    }
                    abstractActivityC0028d3.finish();
                    iVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            cVarA = R1.c.a(str2);
                        } catch (NoSuchFieldException unused) {
                            iVar.a("error", "No such clipboard content format: ".concat(str2), null);
                            cVarA = null;
                        }
                        break;
                    } else {
                        cVarA = null;
                    }
                    CharSequence charSequenceN = ((y) gVar2.f19f).n(cVarA);
                    if (charSequenceN == null) {
                        iVar.c(null);
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("text", charSequenceN);
                    iVar.c(jSONObject2);
                    return;
                case 12:
                    ((ClipboardManager) ((AbstractActivityC0028d) ((E0.h) ((y) gVar2.f19f).e).f213f).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    iVar.c(null);
                    return;
                case 13:
                    ClipboardManager clipboardManager = (ClipboardManager) ((AbstractActivityC0028d) ((E0.h) ((y) gVar2.f19f).e).f213f).getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", zHasMimeType);
                    iVar.c(jSONObject3);
                    return;
                case 14:
                    E0.h hVar5 = (E0.h) ((y) gVar2.f19f).e;
                    hVar5.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    ((AbstractActivityC0028d) hVar5.f213f).startActivity(Intent.createChooser(intent, null));
                    iVar.c(null);
                    return;
                default:
                    iVar.b();
                    return;
            }
        } catch (JSONException e9) {
            iVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        iVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x0301  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // S1.m
    public void a(g gVar, R1.i iVar) {
        Bundle bundle;
        switch (this.f15d) {
            case 15:
                g gVar2 = (g) this.e;
                if (((f) gVar2.f19f) == null) {
                    return;
                }
                String str = (String) gVar.e;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    iVar.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) gVar.f19f;
                try {
                    iVar.c(((f) gVar2.f19f).t(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e) {
                    iVar.a("error", e.getMessage(), null);
                    return;
                }
            case 16:
            case 19:
            default:
                g gVar3 = (g) this.e;
                if (((p006b1.c) gVar3.f19f) == null) {
                    return;
                }
                String str2 = (String) gVar.e;
                str2.getClass();
                Object obj = gVar.f19f;
                switch (str2) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            int i3 = jSONObject2.getInt("platformViewId");
                            boolean zOptBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.h hVar = (io.flutter.plugin.editing.h) ((p006b1.c) gVar3.f19f).f2515d;
                            if (zOptBoolean) {
                                View view = hVar.f4691a;
                                view.requestFocus();
                                hVar.e = new C0011l(3, i3);
                                hVar.f4692b.restartInput(view);
                                hVar.f4698i = false;
                            } else {
                                hVar.getClass();
                                hVar.e = new C0011l(4, i3);
                                hVar.f4699j = null;
                            }
                            iVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            iVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditingState":
                        try {
                            ((p006b1.c) gVar3.f19f).j(o.a((JSONObject) obj));
                            iVar.c(null);
                            return;
                        } catch (JSONException e4) {
                            iVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((p006b1.c) gVar3.f19f).h(jSONArray.getInt(0), R1.m.a(jSONArray.getJSONObject(1)));
                            iVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e5) {
                            iVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case "TextInput.hide":
                        io.flutter.plugin.editing.h hVar2 = (io.flutter.plugin.editing.h) ((p006b1.c) gVar3.f19f).f2515d;
                        if (hVar2.e.f89b == 4) {
                            hVar2.c();
                        } else {
                            hVar2.c();
                            hVar2.f4692b.hideSoftInputFromWindow(hVar2.f4691a.getApplicationWindowToken(), 0);
                        }
                        iVar.c(null);
                        return;
                    case "TextInput.show":
                        io.flutter.plugin.editing.h hVar3 = (io.flutter.plugin.editing.h) ((p006b1.c) gVar3.f19f).f2515d;
                        View view2 = hVar3.f4691a;
                        R1.m mVar = hVar3.f4695f;
                        InputMethodManager inputMethodManager = hVar3.f4692b;
                        if (mVar == null || mVar.f1498g.f1504a != 11) {
                            view2.requestFocus();
                            inputMethodManager.showSoftInput(view2, 0);
                        } else {
                            hVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                        }
                        iVar.c(null);
                        return;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            String string = jSONObject3.getString("action");
                            String string2 = jSONObject3.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.h hVar4 = (io.flutter.plugin.editing.h) ((p006b1.c) gVar3.f19f).f2515d;
                            hVar4.f4692b.sendAppPrivateCommand(hVar4.f4691a, string, bundle);
                            iVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            iVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            double d3 = jSONObject4.getDouble("width");
                            double d4 = jSONObject4.getDouble("height");
                            JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i4 = 0; i4 < 16; i4++) {
                                dArr[i4] = jSONArray2.getDouble(i4);
                            }
                            ((p006b1.c) gVar3.f19f).i(d3, d4, dArr);
                            iVar.c(null);
                            return;
                        } catch (JSONException e7) {
                            iVar.a("error", e7.getMessage(), null);
                            return;
                        }
                    case "TextInput.finishAutofillContext":
                        p006b1.c cVar = (p006b1.c) gVar3.f19f;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = ((io.flutter.plugin.editing.h) cVar.f2515d).f4693c;
                            if (autofillManager != null) {
                                if (zBooleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            cVar.getClass();
                        }
                        iVar.c(null);
                        return;
                    case "TextInput.clearClient":
                        io.flutter.plugin.editing.h hVar5 = (io.flutter.plugin.editing.h) ((p006b1.c) gVar3.f19f).f2515d;
                        if (hVar5.e.f89b != 3) {
                            hVar5.f4697h.e(hVar5);
                            hVar5.c();
                            hVar5.f4695f = null;
                            hVar5.d(null);
                            hVar5.e = new C0011l(1, 0);
                            hVar5.f4702m = null;
                        }
                        iVar.c(null);
                        return;
                    case "TextInput.requestAutofill":
                        p006b1.c cVar2 = (p006b1.c) gVar3.f19f;
                        int i5 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.h hVar6 = (io.flutter.plugin.editing.h) cVar2.f2515d;
                        if (i5 < 26) {
                            hVar6.getClass();
                        } else if (hVar6.f4693c != null && hVar6.f4696g != null) {
                            String str3 = (String) hVar6.f4695f.f1501j.f236d;
                            int[] iArr = new int[2];
                            View view3 = hVar6.f4691a;
                            view3.getLocationOnScreen(iArr);
                            Rect rect = new Rect(hVar6.f4702m);
                            rect.offset(iArr[0], iArr[1]);
                            hVar6.f4693c.notifyViewEntered(view3, str3.hashCode(), rect);
                        }
                        iVar.c(null);
                        return;
                    default:
                        iVar.b();
                        return;
                }
            case 17:
                u(gVar, iVar);
                return;
            case 18:
                C0006g c0006g = (C0006g) this.e;
                if (((p006b1.c) c0006g.e) == null) {
                    return;
                }
                String str4 = (String) gVar.e;
                str4.getClass();
                Object obj2 = gVar.f19f;
                switch (str4) {
                    case "create":
                        Map map = (Map) obj2;
                        if (map.containsKey("params")) {
                            ByteBuffer.wrap((byte[]) map.get("params"));
                        }
                        try {
                            ((Integer) map.get("id")).getClass();
                            String str5 = (String) map.get("viewType");
                            ((Integer) map.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.h) ((p006b1.c) c0006g.e).f2515d).f4710a.f731a.get(str5) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str5);
                        } catch (IllegalStateException e8) {
                            iVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case "clearFocus":
                        int iIntValue = ((Integer) obj2).intValue();
                        try {
                            if (((io.flutter.plugin.platform.h) ((p006b1.c) c0006g.e).f2515d).f4715g.get(iIntValue) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + iIntValue);
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e9) {
                            iVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj2;
                        int iIntValue2 = ((Integer) list.get(0)).intValue();
                        ((Integer) list.get(3)).getClass();
                        ((Integer) list.get(4)).getClass();
                        list.get(5);
                        list.get(6);
                        ((Integer) list.get(7)).getClass();
                        ((Integer) list.get(8)).getClass();
                        ((Double) list.get(9)).getClass();
                        ((Double) list.get(10)).getClass();
                        ((Integer) list.get(11)).getClass();
                        ((Integer) list.get(12)).getClass();
                        ((Integer) list.get(13)).getClass();
                        ((Integer) list.get(14)).getClass();
                        ((Number) list.get(15)).longValue();
                        try {
                            p006b1.c cVar3 = (p006b1.c) c0006g.e;
                            cVar3.getClass();
                            io.flutter.plugin.platform.h hVar7 = (io.flutter.plugin.platform.h) cVar3.f2515d;
                            float f3 = hVar7.f4711b.getResources().getDisplayMetrics().density;
                            if (hVar7.f4715g.get(iIntValue2) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + iIntValue2);
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e10) {
                            iVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "setDirection":
                        Map map2 = (Map) obj2;
                        int iIntValue3 = ((Integer) map2.get("id")).intValue();
                        ((Integer) map2.get("direction")).getClass();
                        try {
                            if (((io.flutter.plugin.platform.h) ((p006b1.c) c0006g.e).f2515d).f4715g.get(iIntValue3) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + iIntValue3);
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            iVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "isSurfaceControlEnabled":
                        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.h) ((p006b1.c) c0006g.e).f2515d).f4713d;
                        iVar.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                        return;
                    case "dispose":
                        try {
                            ((p006b1.c) c0006g.e).f(((Integer) ((Map) obj2).get("id")).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e12) {
                            iVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    default:
                        iVar.b();
                        return;
                }
            case 20:
                String str6 = (String) gVar.e;
                str6.getClass();
                j jVar = (j) this.e;
                if (!str6.equals("get")) {
                    if (!str6.equals("put")) {
                        iVar.b();
                        return;
                    } else {
                        jVar.f1484b = (byte[]) gVar.f19f;
                        iVar.c(null);
                        return;
                    }
                }
                jVar.f1487f = true;
                if (jVar.e || !jVar.f1483a) {
                    iVar.c(j.a(jVar.f1484b));
                    return;
                } else {
                    jVar.f1486d = iVar;
                    return;
                }
        }
    }

    @Override // S1.f
    public void c(String str, S1.d dVar, p074x1.a aVar) {
        ((K1.j) this.e).c(str, dVar, aVar);
    }

    @Override // W.e
    public void d(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i3);
    }

    @Override // S1.f
    public void e(String str, S1.d dVar) {
        ((K1.j) this.e).c(str, dVar, null);
    }

    @Override // S1.f
    public void f(String str, ByteBuffer byteBuffer) {
        ((K1.j) this.e).h(str, byteBuffer, null);
    }

    @Override // W.e
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p053p2.a
    public Object get() {
        switch (this.f15d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new e((Context) ((f) this.e).e, new p065t0.e(), new v());
            case 1:
                return this.e;
            default:
                return new F0.i(new p065t0.e(), new v(), F0.a.f247f, (l) ((C0006g) this.e).get());
        }
    }

    @Override // S1.f
    public void h(String str, ByteBuffer byteBuffer, S1.e eVar) {
        ((K1.j) this.e).h(str, byteBuffer, eVar);
    }

    @Override // Y.L
    public View i(int i3) {
        return ((s) this.e).o(i3);
    }

    @Override // Y.L
    public int j() {
        s sVar = (s) this.e;
        return sVar.f1909f - sVar.t();
    }

    @Override // Y.L
    public int k() {
        return ((s) this.e).s();
    }

    @Override // S1.f
    public p074x1.a l() {
        return ((K1.j) this.e).b(new S1.k());
    }

    @Override // Y.L
    public int m(View view) {
        t tVar = (t) view.getLayoutParams();
        ((s) this.e).getClass();
        return view.getRight() + ((t) view.getLayoutParams()).f1911a.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
    }

    @Override // G0.b
    public Object n() {
        E0.m mVar = (E0.m) this.e;
        SQLiteDatabase sQLiteDatabaseA = ((F0.i) mVar.f233b).a();
        sQLiteDatabaseA.beginTransaction();
        try {
            List list = (List) F0.i.g(sQLiteDatabaseA.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), F0.f.f258f);
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mVar.f234c.a((p079z0.b) it.next(), 1, false);
            }
            return null;
        } catch (Throwable th) {
            sQLiteDatabaseA.endTransaction();
            throw th;
        }
    }

    @Override // Y.L
    public int o(View view) {
        t tVar = (t) view.getLayoutParams();
        ((s) this.e).getClass();
        return (view.getLeft() - ((t) view.getLayoutParams()).f1911a.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
    }

    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) throws Throwable {
        Object objQ = ((g) this.e).q(new C0072s(eVar, 0), dVar);
        return objQ == t2.a.f5737d ? objQ : p055q2.g.f5603a;
    }

    @Override // N0.m
    public void r(Object obj, Object obj2) {
        p033j1.e eVar = (p033j1.e) obj2;
        Q0.a aVar = (Q0.a) ((Q0.d) obj).q();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f1945d);
        int i3 = Z0.c.f1947a;
        O0.l lVar = (O0.l) this.e;
        if (lVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            lVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f1944c.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            eVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public String t(String str, String str2) {
        T1.a aVar = (T1.a) this.e;
        Context contextCreateConfigurationContext = aVar.f1626b;
        AbstractActivityC0028d abstractActivityC0028d = aVar.f1626b;
        if (str2 != null) {
            Locale localeA = T1.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0028d.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = abstractActivityC0028d.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", abstractActivityC0028d.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    public String toString() {
        switch (this.f15d) {
            case 10:
                return "<" + ((String) this.e) + '>';
            default:
                return super.toString();
        }
    }

    public f(K1.b bVar, int i3) {
        this.f15d = i3;
        switch (i3) {
            case 16:
                new n(bVar, "flutter/mousecursor", S1.s.f1597a, null, false).f(new C0006g(16, this));
                break;
            case 17:
            case 18:
            case 20:
            default:
                p074x1.a aVar = new p074x1.a(3);
                n nVar = new n(bVar, "flutter/backgesture", S1.s.f1597a, null, false);
                this.e = nVar;
                nVar.f(aVar);
                break;
            case 19:
                new n(bVar, "flutter/platform_views", S1.s.f1597a, null, false).f(new C0006g(18, this));
                break;
            case 21:
                new n(bVar, "flutter/scribe", S1.k.f1593a, null, false).f(new C0006g(21, this));
                break;
            case 22:
                new n(bVar, "flutter/spellcheck", S1.s.f1597a, null, false).f(new C0006g(22, this));
                break;
        }
    }

    public f(S1.f fVar) {
        this.f15d = 14;
        this.e = new n(fVar, "flutter/keyevent", S1.j.f1592a, null, false);
    }

    public f(AbstractC0742m abstractC0742m) {
        this.f15d = 11;
        this.e = new g(abstractC0742m);
    }

    public f() {
        this.f15d = 28;
        this.e = new SparseIntArray();
    }
}
