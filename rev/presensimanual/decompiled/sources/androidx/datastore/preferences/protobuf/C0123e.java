package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0123e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2278d = 0;
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2280g;

    public C0123e(AbstractC0169b8 abstractC0169b8) {
        this.f2280g = abstractC0169b8;
        this.f2279f = abstractC0169b8.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2278d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return this.e < this.f2279f;
            default:
                return this.e < this.f2279f;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2278d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i3 = this.e;
                if (i3 >= this.f2279f) {
                    throw new NoSuchElementException();
                }
                this.e = i3 + 1;
                return Byte.valueOf(((C0126h) this.f2280g).h(i3));
            default:
                int i4 = this.e;
                if (i4 >= this.f2279f) {
                    throw new NoSuchElementException();
                }
                this.e = i4 + 1;
                return Byte.valueOf(((AbstractC0169b8) this.f2280g).d(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2278d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0123e(C0126h c0126h) {
        this.f2280g = c0126h;
        this.f2279f = c0126h.size();
    }
}
