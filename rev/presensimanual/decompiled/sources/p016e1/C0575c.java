package p016e1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: e1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0575c implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4178d = 0;
    public final Iterator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4180g;

    public C0575c(C0587e c0587e, Iterator it) {
        this.f4180g = c0587e;
        this.e = it;
    }

    public void a() {
        C0605h c0605h = (C0605h) this.f4180g;
        c0605h.d();
        if (c0605h.e != ((Collection) this.f4179f)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4178d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4178d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) this.e.next();
                this.f4179f = (Collection) entry.getValue();
                Object key = entry.getKey();
                C0623k c0623k = ((C0581d) this.f4180g).f4187g;
                List list = (List) ((Collection) entry.getValue());
                return new r(key, list instanceof RandomAccess ? new C0593f(c0623k, key, list, null) : new C0605h(c0623k, key, list, null));
            case 1:
                Map.Entry entry2 = (Map.Entry) this.e.next();
                this.f4179f = entry2;
                return entry2.getKey();
            default:
                a();
                return this.e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4178d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!(((Collection) this.f4179f) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.e.remove();
                ((C0581d) this.f4180g).f4187g.f4225g -= ((Collection) this.f4179f).size();
                ((Collection) this.f4179f).clear();
                this.f4179f = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f4179f;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.e.remove();
                ((C0587e) this.f4180g).e.f4225g -= collection.size();
                collection.clear();
                this.f4179f = null;
                return;
            default:
                this.e.remove();
                C0605h c0605h = (C0605h) this.f4180g;
                c0605h.f4206h.f4225g--;
                c0605h.e();
                return;
        }
    }

    public C0575c(C0605h c0605h, ListIterator listIterator) {
        this.f4180g = c0605h;
        this.f4179f = c0605h.e;
        this.e = listIterator;
    }

    public C0575c(C0581d c0581d) {
        this.f4180g = c0581d;
        this.e = c0581d.f4186f.entrySet().iterator();
    }

    public C0575c(C0605h c0605h) {
        Iterator it;
        this.f4180g = c0605h;
        Collection collection = c0605h.e;
        this.f4179f = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.e = it;
    }
}
