package K2;

import I2.InterfaceC0034e;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f789a = new j(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f790b = N2.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f791c = N2.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0.f f792d;
    public static final A0.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A0.f f793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A0.f f794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A0.f f795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A0.f f796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final A0.f f797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final A0.f f798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final A0.f f799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final A0.f f800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final A0.f f801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final A0.f f802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final A0.f f803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A0.f f804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A0.f f805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A0.f f806s;

    static {
        int i3 = 10;
        f792d = new A0.f(i3, "BUFFERED");
        e = new A0.f(i3, "SHOULD_BUFFER");
        f793f = new A0.f(i3, "S_RESUMING_BY_RCV");
        f794g = new A0.f(i3, "RESUMING_BY_EB");
        f795h = new A0.f(i3, "POISONED");
        f796i = new A0.f(i3, "DONE_RCV");
        f797j = new A0.f(i3, "INTERRUPTED_SEND");
        f798k = new A0.f(i3, "INTERRUPTED_RCV");
        f799l = new A0.f(i3, "CHANNEL_CLOSED");
        f800m = new A0.f(i3, "SUSPEND");
        f801n = new A0.f(i3, "SUSPEND_NO_WAITER");
        f802o = new A0.f(i3, "FAILED");
        f803p = new A0.f(i3, "NO_RECEIVE_RESULT");
        f804q = new A0.f(i3, "CLOSE_HANDLER_CLOSED");
        f805r = new A0.f(i3, "CLOSE_HANDLER_INVOKED");
        f806s = new A0.f(i3, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0034e interfaceC0034e, Object obj, A2.l lVar) {
        A0.f fVarM = interfaceC0034e.m(obj, lVar);
        if (fVarM == null) {
            return false;
        }
        interfaceC0034e.o(fVarM);
        return true;
    }
}
