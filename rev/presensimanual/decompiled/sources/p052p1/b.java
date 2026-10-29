package p052p1;

import n1.f;
import n1.g;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5545b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5546c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5547a;

    public /* synthetic */ b(int i3) {
        this.f5547a = i3;
    }

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f5547a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                c cVar = d.e;
                ((g) obj2).a((String) obj);
                break;
            default:
                c cVar2 = d.e;
                ((g) obj2).b(((Boolean) obj).booleanValue());
                break;
        }
    }
}
