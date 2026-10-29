package k;

/* JADX INFO: loaded from: classes.dex */
public final class D extends androidx.lifecycle.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f5018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e) {
        super(11, e);
        this.f5018f = e;
    }

    @Override // androidx.lifecycle.y, k.C
    public final void e(int i3) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i3);
    }

    @Override // androidx.lifecycle.y, k.C
    public final void f(int i3) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i3);
    }
}
