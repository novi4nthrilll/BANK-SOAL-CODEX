package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.mlkit_vision_face_bundled.P8;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends AbstractSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2298d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ h0(AbstractMap abstractMap, int i3) {
        this.f2298d = i3;
        this.e = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((e0) this.e).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((P8) this.e).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((e0) this.e).clear();
                break;
            default:
                ((P8) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((e0) this.e).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((P8) this.e).get(entry2.getKey());
                Object value2 = entry2.getValue();
                boolean z2 = true;
                if (obj3 != value2) {
                    if (obj3 == null) {
                        z2 = false;
                    } else if (!obj3.equals(value2)) {
                        return false;
                    }
                }
                return z2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new g0((e0) this.e, 0);
            default:
                return new g0((P8) this.e, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((e0) this.e).remove(entry.getKey());
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((P8) this.e).remove(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2298d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((e0) this.e).size();
            default:
                return ((P8) this.e).size();
        }
    }
}
