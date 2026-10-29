package Y;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Y.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0114i implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f1888h = new ThreadLocal();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S2.e f1889i = new S2.e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1890d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1892g;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2483p && this.e == 0) {
            this.e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0112g c0112g = recyclerView.f2462W;
        c0112g.f1881a = i3;
        c0112g.f1882b = i4;
    }

    public final void b(long j3) {
        C0113h c0113h;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1890d;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0112g c0112g = recyclerView2.f2462W;
                c0112g.f1883c = 0;
                i3 += c0112g.f1883c;
            }
        }
        ArrayList arrayList2 = this.f1892g;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0112g c0112g2 = recyclerView3.f2462W;
                Math.abs(c0112g2.f1881a);
                Math.abs(c0112g2.f1882b);
                if (c0112g2.f1883c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0113h());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f1889i);
        if (arrayList2.size() <= 0 || (recyclerView = (c0113h = (C0113h) arrayList2.get(0)).f1887d) == null) {
            return;
        }
        int i6 = c0113h.e;
        if (recyclerView.f2471g.G() > 0) {
            RecyclerView.j(recyclerView.f2471g.F(0));
            throw null;
        }
        y yVar = recyclerView.f2466d;
        try {
            recyclerView.f2492z++;
            yVar.b(i6);
            throw null;
        } catch (Throwable th) {
            int i7 = recyclerView.f2492z - 1;
            recyclerView.f2492z = i7;
            if (i7 < 1) {
                recyclerView.f2492z = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = p072x.j.f5820a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1890d;
            if (arrayList.isEmpty()) {
                this.e = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.e = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1891f);
                this.e = 0L;
            }
        } finally {
            this.e = 0L;
            int i5 = p072x.j.f5820a;
            Trace.endSection();
        }
    }
}
