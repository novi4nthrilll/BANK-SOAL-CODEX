package A0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22c;

    public h(Context context, e eVar) {
        g gVar = new g(context, 0);
        this.f22c = new HashMap();
        this.f20a = gVar;
        this.f21b = eVar;
    }

    public final synchronized i a(String str) {
        if (this.f22c.containsKey(str)) {
            return (i) this.f22c.get(str);
        }
        CctBackendFactory cctBackendFactoryR = this.f20a.r(str);
        if (cctBackendFactoryR == null) {
            return null;
        }
        e eVar = this.f21b;
        i iVarCreate = cctBackendFactoryR.create(new b(eVar.f12a, eVar.f13b, eVar.f14c, str));
        this.f22c.put(str, iVarCreate);
        return iVarCreate;
    }
}
