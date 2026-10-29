package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private k rootView;
    private boolean startFocused;
    private final n state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, d dVar, a aVar, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new l(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new n();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public n detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public d getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        n nVar = this.state;
        if (nVar.f4747b == null) {
            nVar.f4747b = new j(getContext());
        }
        if (this.state.f4746a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            n nVar2 = this.state;
            nVar2.f4746a = new p(windowManager, nVar2.f4747b);
        }
        this.container = new FrameLayout(getContext());
        new m(getContext(), this.state.f4746a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, n nVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new l(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = nVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
