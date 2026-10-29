package k;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: k.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0733h0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0735i0 f5163d;

    public ViewOnTouchListenerC0733h0(AbstractC0735i0 abstractC0735i0) {
        this.f5163d = abstractC0735i0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0753s c0753s;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        AbstractC0735i0 abstractC0735i0 = this.f5163d;
        if (action == 0 && (c0753s = abstractC0735i0.f5206y) != null && c0753s.isShowing() && x3 >= 0 && x3 < abstractC0735i0.f5206y.getWidth() && y2 >= 0 && y2 < abstractC0735i0.f5206y.getHeight()) {
            abstractC0735i0.f5203u.postDelayed(abstractC0735i0.f5199q, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0735i0.f5203u.removeCallbacks(abstractC0735i0.f5199q);
        return false;
    }
}
