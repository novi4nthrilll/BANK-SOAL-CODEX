package p032j;

import B.D;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4965d;
    public View e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f4968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f4969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f4970j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4966f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f4971k = new l(this);

    public n(int i3, Context context, View view, i iVar, boolean z2) {
        this.f4962a = context;
        this.f4963b = iVar;
        this.e = view;
        this.f4964c = z2;
        this.f4965d = i3;
    }

    public final k a() {
        k sVar;
        if (this.f4969i == null) {
            Context context = this.f4962a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            m.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new f(context, this.e, this.f4965d, this.f4964c);
            } else {
                View view = this.e;
                Context context2 = this.f4962a;
                boolean z2 = this.f4964c;
                sVar = new s(this.f4965d, context2, view, this.f4963b, z2);
            }
            sVar.l(this.f4963b);
            sVar.r(this.f4971k);
            sVar.n(this.e);
            sVar.j(this.f4968h);
            sVar.o(this.f4967g);
            sVar.p(this.f4966f);
            this.f4969i = sVar;
        }
        return this.f4969i;
    }

    public final boolean b() {
        k kVar = this.f4969i;
        return kVar != null && kVar.g();
    }

    public void c() {
        this.f4969i = null;
        l lVar = this.f4970j;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z2, boolean z3) {
        k kVarA = a();
        kVarA.s(z3);
        if (z2) {
            int i5 = this.f4966f;
            View view = this.e;
            Field field = D.f41a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.e.getWidth();
            }
            kVarA.q(i3);
            kVarA.t(i4);
            int i6 = (int) ((this.f4962a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarA.f4960d = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        kVarA.b();
    }
}
