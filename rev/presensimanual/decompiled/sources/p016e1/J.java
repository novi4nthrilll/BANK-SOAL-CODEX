package p016e1;

import java.nio.charset.Charset;
import java.util.Map;
import n1.b;
import n1.d;
import n1.e;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J f4047b = new J(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J f4048c = new J(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4049a;

    public /* synthetic */ J(int i3) {
        this.f4049a = i3;
    }

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f4049a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                Charset charset = K.f4052f;
                eVar.c(K.f4053g, entry.getKey());
                eVar.c(K.f4054h, entry.getValue());
                return;
            default:
                throw new b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
