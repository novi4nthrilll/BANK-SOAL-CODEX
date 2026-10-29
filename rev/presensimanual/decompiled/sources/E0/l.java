package E0;

import B.D;
import N0.r;
import Y.C0107b;
import Y.C0111f;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0734i;
import k.X;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231d;
    public final Object e;

    public /* synthetic */ l(int i3, Object obj) {
        this.f231d = i3;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0734i c0734i;
        int i3 = 3;
        Object obj = this.e;
        switch (this.f231d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                m mVar = (m) obj;
                ((F0.i) mVar.f235d).d(new A0.f(i3, mVar));
                return;
            case 1:
                G.e eVar = (G.e) obj;
                if (eVar.f305r) {
                    boolean z2 = eVar.f303p;
                    G.a aVar = eVar.f292d;
                    if (z2) {
                        eVar.f303p = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = jCurrentAnimationTimeMillis;
                        aVar.f288g = -1L;
                        aVar.f287f = jCurrentAnimationTimeMillis;
                        aVar.f289h = 0.5f;
                    }
                    if ((aVar.f288g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f288g + ((long) aVar.f290i)) || !eVar.e()) {
                        eVar.f305r = false;
                        return;
                    }
                    boolean z3 = eVar.f304q;
                    ListView listView = eVar.f293f;
                    if (z3) {
                        eVar.f304q = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f287f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - aVar.f287f;
                    aVar.f287f = jCurrentAnimationTimeMillis2;
                    eVar.f307t.scrollListBy((int) (j3 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f286d));
                    Field field = D.f41a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((r) obj).h();
                return;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                M0.c cVar = ((r) ((A0.f) obj).e).f1096c;
                cVar.j(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                ((N0.D) obj).f1049i.b(new L0.a(4));
                return;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                throw null;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((h) obj).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                C0111f c0111f = (C0111f) obj;
                int i4 = c0111f.v;
                ValueAnimator valueAnimator = c0111f.f1879u;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c0111f.v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                Y.r rVar = ((RecyclerView) obj).f2448G;
                if (rVar != null) {
                    C0107b c0107b = (C0107b) rVar;
                    ArrayList arrayList = c0107b.e;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0107b.f1846g;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0107b.f1847h;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0107b.f1845f;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0107b.f1849j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!zIsEmpty) {
                            A0.c.o(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            A0.c.o(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0107b.f1850k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!zIsEmpty) {
                            A0.c.o(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            A0.c.o(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0107b.f1848i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? c0107b.f1903c : 0L, zIsEmpty3 ? 0L : c0107b.f1904d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 9:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case 10:
                p018f.e eVar2 = (p018f.e) obj;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 11:
                X x3 = (X) obj;
                x3.f5117o = null;
                x3.drawableStateChanged();
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) obj).f2148d;
                if (actionMenuView == null || (c0734i = actionMenuView.v) == null) {
                    return;
                }
                c0734i.h();
                return;
            case 13:
                Object obj2 = ((y) obj).e;
                return;
            default:
                try {
                    ((Runnable) obj).run();
                    return;
                } catch (Exception e) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e);
                    return;
                }
        }
    }

    public l(N0.n nVar, A.c cVar) {
        this.f231d = 5;
        this.e = cVar;
    }

    public l(y yVar, int i3) {
        this.f231d = 13;
        this.e = yVar;
    }
}
