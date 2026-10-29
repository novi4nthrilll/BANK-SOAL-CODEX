package B;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import id.go.bangkalankab.simpeg.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: B.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0001b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f70c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f71a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0000a f72b;

    public C0001b() {
        this(f70c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f71a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, C.l lVar) {
        this.f71a.onInitializeAccessibilityNodeInfo(view, lVar.f139a);
    }

    public boolean c(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i4 = 0; i4 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C.g) listEmptyList.get(i4)).f136a).getId() != i3; i4++) {
        }
        boolean zPerformAccessibilityAction = this.f71a.performAccessibilityAction(view, i3, bundle);
        if (zPerformAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i6 = 0; clickableSpanArr != null && i6 < clickableSpanArr.length; i6++) {
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }

    public C0001b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f71a = accessibilityDelegate;
        this.f72b = new C0000a(this);
    }
}
