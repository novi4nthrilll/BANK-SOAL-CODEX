package M;

import I1.n;
import android.content.Context;
import java.io.File;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b extends B2.i implements A2.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(0);
        this.e = i3;
        this.f955f = obj;
        this.f956g = obj2;
    }

    @Override // A2.a
    public final Object a() {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Context context = (Context) this.f955f;
                ((c) this.f956g).getClass();
                String strConcat = "FlutterSharedPreferences".concat(".preferences_pb");
                B2.h.e(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
            default:
                ((j0.a) ((p029i0.b) this.f955f).e).a((n) this.f956g);
                return p055q2.g.f5603a;
        }
    }
}
