package io.flutter.view;

import B.C0006g;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4832y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.b f4834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f4835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f4836d;
    public final io.flutter.plugin.platform.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f4837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f4838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f4839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f4840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f4841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f4843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f4844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f4845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f4846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f4848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0006g f4849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f4852u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f4853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final H.a f4854x;

    public m(View view, D0.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.f fVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f4838g = new HashMap();
        this.f4839h = new HashMap();
        this.f4842k = 0;
        this.f4846o = new ArrayList();
        this.f4847p = 0;
        this.f4848q = 0;
        this.f4850s = false;
        this.f4851t = false;
        this.f4852u = new c(this);
        d dVar = new d(this);
        this.v = dVar;
        H.a aVar = new H.a(this, new Handler(), 2);
        this.f4854x = aVar;
        this.f4833a = view;
        this.f4834b = bVar;
        this.f4835c = accessibilityManager;
        this.f4837f = contentResolver;
        this.f4836d = accessibilityViewEmbedder;
        this.e = fVar;
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        e eVar = new e(this, accessibilityManager);
        this.f4853w = eVar;
        eVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(eVar);
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i3 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i3 == Integer.MAX_VALUE || i3 < 300) {
                this.f4842k &= -9;
            } else {
                this.f4842k |= 8;
            }
            ((FlutterJNI) bVar.f182f).setAccessibilityFeatures(this.f4842k);
        }
        fVar.b(this);
    }

    public final g a(int i3) {
        HashMap map = this.f4839h;
        g gVar = (g) map.get(Integer.valueOf(i3));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        gVar2.f4777c = -1;
        gVar2.f4776b = i3;
        gVar2.f4775a = 267386881 + i3;
        map.put(Integer.valueOf(i3), gVar2);
        return gVar2;
    }

    public final i b(int i3) {
        HashMap map = this.f4838g;
        i iVar = (i) map.get(Integer.valueOf(i3));
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        iVar2.f4805b = i3;
        map.put(Integer.valueOf(i3), iVar2);
        return iVar2;
    }

    public final AccessibilityEvent c(int i3, int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        View view = this.f4833a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i3);
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        String str;
        int i4;
        int i5;
        int i6;
        h(true);
        if (i3 >= 65536) {
            return this.f4836d.createAccessibilityNodeInfo(i3);
        }
        HashMap map = this.f4838g;
        View view = this.f4833a;
        if (i3 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            }
            return accessibilityNodeInfoObtain;
        }
        i iVar = (i) map.get(Integer.valueOf(i3));
        if (iVar == null) {
            return null;
        }
        int i7 = iVar.f4811i;
        io.flutter.plugin.platform.f fVar = this.e;
        if (i7 != -1 && fVar.c(i7)) {
            fVar.d(iVar.f4811i);
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i3);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            accessibilityNodeInfoObtain2.setImportantForAccessibility((iVar.i(12) || (i.b(iVar) == null && iVar.f4807d == 0)) ? false : true);
        }
        accessibilityNodeInfoObtain2.setViewIdResourceName("");
        String str2 = iVar.f4817o;
        if (str2 != null) {
            accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
        }
        accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoObtain2.setClassName("android.view.View");
        accessibilityNodeInfoObtain2.setSource(view, i3);
        accessibilityNodeInfoObtain2.setFocusable(iVar.k());
        i iVar2 = this.f4843l;
        if (iVar2 != null) {
            accessibilityNodeInfoObtain2.setFocused(iVar2.f4805b == i3);
        }
        i iVar3 = this.f4840i;
        if (iVar3 != null) {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(iVar3.f4805b == i3);
        }
        if (iVar.i(5)) {
            accessibilityNodeInfoObtain2.setPassword(iVar.i(11));
            if (!iVar.i(21)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoObtain2.setEditable(!iVar.i(21));
            int i9 = iVar.f4809g;
            if (i9 != -1 && (i6 = iVar.f4810h) != -1) {
                accessibilityNodeInfoObtain2.setTextSelection(i9, i6);
            }
            i iVar4 = this.f4840i;
            if (iVar4 != null && iVar4.f4805b == i3) {
                accessibilityNodeInfoObtain2.setLiveRegion(1);
            }
            if (i.a(iVar, f.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i.a(iVar, f.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i5 = 1;
            }
            if (i.a(iVar, f.MOVE_CURSOR_FORWARD_BY_WORD)) {
                accessibilityNodeInfoObtain2.addAction(256);
                i5 |= 2;
            }
            if (i.a(iVar, f.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                accessibilityNodeInfoObtain2.addAction(512);
                i5 |= 2;
            }
            accessibilityNodeInfoObtain2.setMovementGranularities(i5);
            if (iVar.e >= 0) {
                String str3 = iVar.f4820r;
                accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - iVar.f4808f) + iVar.e);
            }
        }
        if (i.a(iVar, f.SET_SELECTION)) {
            accessibilityNodeInfoObtain2.addAction(131072);
        }
        if (i.a(iVar, f.COPY)) {
            accessibilityNodeInfoObtain2.addAction(16384);
        }
        if (i.a(iVar, f.CUT)) {
            accessibilityNodeInfoObtain2.addAction(65536);
        }
        if (i.a(iVar, f.PASTE)) {
            accessibilityNodeInfoObtain2.addAction(32768);
        }
        if (i.a(iVar, f.SET_TEXT)) {
            accessibilityNodeInfoObtain2.addAction(2097152);
        }
        if (iVar.i(4)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
        }
        if (iVar.i(15)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
        }
        if (i.a(iVar, f.DISMISS)) {
            accessibilityNodeInfoObtain2.setDismissable(true);
            accessibilityNodeInfoObtain2.addAction(1048576);
        }
        i iVar5 = iVar.f4794P;
        if (iVar5 != null) {
            accessibilityNodeInfoObtain2.setParent(view, iVar5.f4805b);
        } else {
            accessibilityNodeInfoObtain2.setParent(view);
        }
        int i10 = iVar.f4781B;
        if (i10 != -1 && i8 >= 22) {
            accessibilityNodeInfoObtain2.setTraversalAfter(view, i10);
        }
        Rect rect = iVar.f4803Z;
        i iVar6 = iVar.f4794P;
        if (iVar6 != null) {
            Rect rect2 = iVar6.f4803Z;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
        } else {
            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
        accessibilityNodeInfoObtain2.setVisibleToUser(true);
        accessibilityNodeInfoObtain2.setEnabled(!iVar.i(7) || iVar.i(8));
        if (i.a(iVar, f.TAP)) {
            if (iVar.f4798T != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iVar.f4798T.e));
                accessibilityNodeInfoObtain2.setClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(16);
                accessibilityNodeInfoObtain2.setClickable(true);
            }
        } else if (iVar.i(24)) {
            accessibilityNodeInfoObtain2.addAction(16);
            accessibilityNodeInfoObtain2.setClickable(true);
        }
        if (i.a(iVar, f.LONG_PRESS)) {
            if (iVar.U != null) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, iVar.U.e));
                accessibilityNodeInfoObtain2.setLongClickable(true);
            } else {
                accessibilityNodeInfoObtain2.addAction(32);
                accessibilityNodeInfoObtain2.setLongClickable(true);
            }
        }
        f fVar2 = f.SCROLL_LEFT;
        boolean zA = i.a(iVar, fVar2);
        f fVar3 = f.SCROLL_DOWN;
        f fVar4 = f.SCROLL_UP;
        f fVar5 = f.SCROLL_RIGHT;
        if (zA || i.a(iVar, fVar4) || i.a(iVar, fVar5) || i.a(iVar, fVar3)) {
            accessibilityNodeInfoObtain2.setScrollable(true);
            if (iVar.i(19)) {
                if (i.a(iVar, fVar2) || i.a(iVar, fVar5)) {
                    if (i(iVar)) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, iVar.f4812j, false));
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (i(iVar)) {
                    accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iVar.f4812j, 0, false));
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                }
            }
            if (i.a(iVar, fVar2) || i.a(iVar, fVar4)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (i.a(iVar, fVar5) || i.a(iVar, fVar3)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        f fVar6 = f.INCREASE;
        boolean zA2 = i.a(iVar, fVar6);
        f fVar7 = f.DECREASE;
        if (zA2 || i.a(iVar, fVar7)) {
            accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
            if (i.a(iVar, fVar6)) {
                accessibilityNodeInfoObtain2.addAction(4096);
            }
            if (i.a(iVar, fVar7)) {
                accessibilityNodeInfoObtain2.addAction(8192);
            }
        }
        if (iVar.i(16)) {
            accessibilityNodeInfoObtain2.setLiveRegion(1);
        }
        if (iVar.i(5)) {
            accessibilityNodeInfoObtain2.setText(i.e(iVar.f4820r, iVar.f4821s));
            if (i8 >= 28) {
                CharSequence[] charSequenceArr = {iVar.f(), i.e(iVar.f4825x, iVar.f4826y)};
                int i11 = 0;
                CharSequence charSequenceConcat = null;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    CharSequence charSequence = charSequenceArr[i11];
                    if (charSequence == null || charSequence.length() <= 0) {
                        i4 = 1;
                    } else if (charSequenceConcat == null || charSequenceConcat.length() == 0) {
                        i4 = 1;
                        charSequenceConcat = charSequence;
                    } else {
                        i4 = 1;
                        charSequenceConcat = TextUtils.concat(charSequenceConcat, ", ", charSequence);
                    }
                    i11 += i4;
                }
                accessibilityNodeInfoObtain2.setHintText(charSequenceConcat);
            }
        } else if (!iVar.i(12)) {
            CharSequence charSequenceB = i.b(iVar);
            if (i8 < 28 && iVar.f4827z != null) {
                charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + iVar.f4827z;
            }
            if (charSequenceB != null) {
                accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28 && (str = iVar.f4827z) != null) {
            accessibilityNodeInfoObtain2.setTooltipText(str);
        }
        boolean z2 = true;
        boolean zI = iVar.i(1);
        boolean zI2 = iVar.i(17);
        if (!zI && !zI2) {
            z2 = false;
        }
        accessibilityNodeInfoObtain2.setCheckable(z2);
        if (zI) {
            accessibilityNodeInfoObtain2.setChecked(iVar.i(2));
            if (iVar.i(9)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
            }
        } else if (zI2) {
            accessibilityNodeInfoObtain2.setChecked(iVar.i(18));
            accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoObtain2.setSelected(iVar.i(3));
        if (i13 >= 28) {
            accessibilityNodeInfoObtain2.setHeading(iVar.i(10));
        }
        i iVar7 = this.f4840i;
        if (iVar7 == null || iVar7.f4805b != i3) {
            accessibilityNodeInfoObtain2.addAction(64);
        } else {
            accessibilityNodeInfoObtain2.addAction(128);
        }
        ArrayList<g> arrayList = iVar.f4797S;
        if (arrayList != null) {
            for (g gVar : arrayList) {
                accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(gVar.f4775a, gVar.f4778d));
            }
        }
        for (i iVar8 : iVar.f4795Q) {
            if (!iVar8.i(14)) {
                int i14 = iVar8.f4811i;
                if (i14 != -1) {
                    fVar.d(i14);
                    if (!fVar.c(iVar8.f4811i)) {
                        accessibilityNodeInfoObtain2.addChild(null);
                    }
                }
                accessibilityNodeInfoObtain2.addChild(view, iVar8.f4805b);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    public final boolean d(MotionEvent motionEvent, boolean z2) {
        i iVarJ;
        if (!this.f4835c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap map = this.f4838g;
        if (map.isEmpty()) {
            return false;
        }
        i iVarJ2 = ((i) map.get(0)).j(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (iVarJ2 != null && iVarJ2.f4811i != -1) {
            if (z2) {
                return false;
            }
            return this.f4836d.onAccessibilityHoverEvent(iVarJ2.f4805b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!map.isEmpty() && (iVarJ = ((i) map.get(0)).j(new float[]{x3, y2, 0.0f, 1.0f}, z2)) != this.f4845n) {
                if (iVarJ != null) {
                    f(iVarJ.f4805b, 128);
                }
                i iVar = this.f4845n;
                if (iVar != null) {
                    f(iVar.f4805b, 256);
                }
                this.f4845n = iVarJ;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            i iVar2 = this.f4845n;
            if (iVar2 != null) {
                f(iVar2.f4805b, 256);
                this.f4845n = null;
            }
        }
        return true;
    }

    public final boolean e(i iVar, int i3, Bundle bundle, boolean z2) {
        int i4;
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = iVar.f4809g;
        int i7 = iVar.f4810h;
        if (i7 >= 0 && i6 >= 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8 || i5 == 16) {
                            if (z2) {
                                iVar.f4810h = iVar.f4820r.length();
                            } else {
                                iVar.f4810h = 0;
                            }
                        }
                    } else if (z2 && i7 < iVar.f4820r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(iVar.f4820r.substring(iVar.f4810h));
                        if (matcher.find()) {
                            iVar.f4810h += matcher.start(1);
                        } else {
                            iVar.f4810h = iVar.f4820r.length();
                        }
                    } else if (!z2 && iVar.f4810h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(iVar.f4820r.substring(0, iVar.f4810h));
                        if (matcher2.find()) {
                            iVar.f4810h = matcher2.start(1);
                        } else {
                            iVar.f4810h = 0;
                        }
                    }
                } else if (z2 && i7 < iVar.f4820r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(iVar.f4820r.substring(iVar.f4810h));
                    matcher3.find();
                    if (matcher3.find()) {
                        iVar.f4810h += matcher3.start(1);
                    } else {
                        iVar.f4810h = iVar.f4820r.length();
                    }
                } else if (!z2 && iVar.f4810h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(iVar.f4820r.substring(0, iVar.f4810h));
                    if (matcher4.find()) {
                        iVar.f4810h = matcher4.start(1);
                    }
                }
            } else if (z2 && i7 < iVar.f4820r.length()) {
                iVar.f4810h++;
            } else if (!z2 && (i4 = iVar.f4810h) > 0) {
                iVar.f4810h = i4 - 1;
            }
            if (!z3) {
                iVar.f4809g = iVar.f4810h;
            }
        }
        if (i6 != iVar.f4809g || i7 != iVar.f4810h) {
            String str = iVar.f4820r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventC = c(iVar.f4805b, 8192);
            accessibilityEventC.getText().add(str);
            accessibilityEventC.setFromIndex(iVar.f4809g);
            accessibilityEventC.setToIndex(iVar.f4810h);
            accessibilityEventC.setItemCount(str.length());
            g(accessibilityEventC);
        }
        D0.b bVar = this.f4834b;
        if (i5 == 1) {
            if (z2) {
                f fVar = f.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (i.a(iVar, fVar)) {
                    bVar.y(i3, fVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar2 = f.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (i.a(iVar, fVar2)) {
                    bVar.y(i3, fVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i5 == 2) {
            if (z2) {
                f fVar3 = f.MOVE_CURSOR_FORWARD_BY_WORD;
                if (i.a(iVar, fVar3)) {
                    bVar.y(i3, fVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                f fVar4 = f.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (i.a(iVar, fVar4)) {
                    bVar.y(i3, fVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i5 == 4 || i5 == 8 || i5 == 16) {
            return true;
        }
        return false;
    }

    public final void f(int i3, int i4) {
        if (this.f4835c.isEnabled()) {
            g(c(i3, i4));
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            i iVar = this.f4843l;
            if (iVar != null) {
                return createAccessibilityNodeInfo(iVar.f4805b);
            }
        } else if (i3 != 2) {
            return null;
        }
        i iVar2 = this.f4840i;
        if (iVar2 != null) {
            return createAccessibilityNodeInfo(iVar2.f4805b);
        }
        Integer num = this.f4841j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(AccessibilityEvent accessibilityEvent) {
        if (this.f4835c.isEnabled()) {
            View view = this.f4833a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void h(boolean z2) {
        if (this.f4850s == z2) {
            return;
        }
        this.f4850s = z2;
        if (z2) {
            this.f4842k |= 1;
        } else {
            this.f4842k &= -2;
        }
        ((FlutterJNI) this.f4834b.f182f).setAccessibilityFeatures(this.f4842k);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:16:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x001f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0029 A[LOOP:1: B:17:0x001d->B:21:0x0029, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0027 A[SYNTHETIC] */
    public final boolean i(i iVar) {
        i iVar2;
        i iVar3;
        if (iVar.f4812j > 0) {
            i iVar4 = this.f4840i;
            i iVar5 = null;
            if (iVar4 != null) {
                i iVar6 = iVar4.f4794P;
                while (true) {
                    if (iVar6 == null) {
                        iVar6 = null;
                        break;
                    }
                    if (iVar6 == iVar) {
                        break;
                    }
                    iVar6 = iVar6.f4794P;
                }
                if (iVar6 == null) {
                    iVar2 = this.f4840i;
                    if (iVar2 != null) {
                        for (iVar3 = iVar2.f4794P; iVar3 != null; iVar3 = iVar3.f4794P) {
                            if (iVar3.i(19)) {
                                iVar5 = iVar3;
                                break;
                            }
                        }
                        if (iVar5 != null) {
                        }
                    }
                }
            } else {
                iVar2 = this.f4840i;
                if (iVar2 != null) {
                    while (iVar3 != null) {
                        if (iVar3.i(19)) {
                            iVar5 = iVar3;
                            break;
                        }
                    }
                    if (iVar5 != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i4, Bundle bundle) {
        if (i3 >= 65536) {
            boolean zPerformAction = this.f4836d.performAction(i3, i4, bundle);
            if (zPerformAction && i4 == 128) {
                this.f4841j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f4838g;
        i iVar = (i) map.get(Integer.valueOf(i3));
        if (iVar == null) {
            return false;
        }
        f fVar = f.INCREASE;
        f fVar2 = f.DECREASE;
        D0.b bVar = this.f4834b;
        switch (i4) {
            case 16:
                bVar.x(i3, f.TAP);
                return true;
            case 32:
                bVar.x(i3, f.LONG_PRESS);
                return true;
            case 64:
                if (this.f4840i == null) {
                    this.f4833a.invalidate();
                }
                this.f4840i = iVar;
                bVar.x(i3, f.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map2 = new HashMap();
                map2.put("type", "didGainFocus");
                map2.put("nodeId", Integer.valueOf(iVar.f4805b));
                ((E0.n) bVar.e).d(map2, null);
                f(i3, 32768);
                if (i.a(iVar, fVar) || i.a(iVar, fVar2)) {
                    f(i3, 4);
                }
                return true;
            case 128:
                i iVar2 = this.f4840i;
                if (iVar2 != null && iVar2.f4805b == i3) {
                    this.f4840i = null;
                }
                Integer num = this.f4841j;
                if (num != null && num.intValue() == i3) {
                    this.f4841j = null;
                }
                bVar.x(i3, f.DID_LOSE_ACCESSIBILITY_FOCUS);
                f(i3, 65536);
                return true;
            case 256:
                return e(iVar, i3, bundle, true);
            case 512:
                return e(iVar, i3, bundle, false);
            case 4096:
                f fVar3 = f.SCROLL_UP;
                if (i.a(iVar, fVar3)) {
                    bVar.x(i3, fVar3);
                } else {
                    f fVar4 = f.SCROLL_LEFT;
                    if (i.a(iVar, fVar4)) {
                        bVar.x(i3, fVar4);
                    } else {
                        if (!i.a(iVar, fVar)) {
                            return false;
                        }
                        iVar.f4820r = iVar.f4822t;
                        iVar.f4821s = iVar.f4823u;
                        f(i3, 4);
                        bVar.x(i3, fVar);
                    }
                }
                return true;
            case 8192:
                f fVar5 = f.SCROLL_DOWN;
                if (i.a(iVar, fVar5)) {
                    bVar.x(i3, fVar5);
                } else {
                    f fVar6 = f.SCROLL_RIGHT;
                    if (i.a(iVar, fVar6)) {
                        bVar.x(i3, fVar6);
                    } else {
                        if (!i.a(iVar, fVar2)) {
                            return false;
                        }
                        iVar.f4820r = iVar.v;
                        iVar.f4821s = iVar.f4824w;
                        f(i3, 4);
                        bVar.x(i3, fVar2);
                    }
                }
                return true;
            case 16384:
                bVar.x(i3, f.COPY);
                return true;
            case 32768:
                bVar.x(i3, f.PASTE);
                return true;
            case 65536:
                bVar.x(i3, f.CUT);
                return true;
            case 131072:
                HashMap map3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map3.put("base", Integer.valueOf(iVar.f4810h));
                    map3.put("extent", Integer.valueOf(iVar.f4810h));
                }
                bVar.y(i3, f.SET_SELECTION, map3);
                i iVar3 = (i) map.get(Integer.valueOf(i3));
                iVar3.f4809g = ((Integer) map3.get("base")).intValue();
                iVar3.f4810h = ((Integer) map3.get("extent")).intValue();
                return true;
            case 1048576:
                bVar.x(i3, f.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                bVar.y(i3, f.SET_TEXT, string);
                iVar.f4820r = string;
                iVar.f4821s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                bVar.x(i3, f.SHOW_ON_SCREEN);
                return true;
            default:
                g gVar = (g) this.f4839h.get(Integer.valueOf(i4 - 267386881));
                if (gVar == null) {
                    return false;
                }
                bVar.y(i3, f.CUSTOM_ACTION, Integer.valueOf(gVar.f4776b));
                return true;
        }
    }
}
