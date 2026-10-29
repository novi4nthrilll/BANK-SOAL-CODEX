package p013d1;

import java.nio.charset.Charset;
import java.util.Map;
import n1.b;
import n1.d;
import n1.e;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: d1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0433e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0433e f3710b = new C0433e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0433e f3711c = new C0433e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3712a;

    public /* synthetic */ C0433e(int i3) {
        this.f3712a = i3;
    }

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3712a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                Charset charset = C0439f.f3722f;
                eVar.c(C0439f.f3723g, entry.getKey());
                eVar.c(C0439f.f3724h, entry.getValue());
                return;
            default:
                throw new b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
