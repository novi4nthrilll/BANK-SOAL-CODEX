package D0;

import A0.h;
import M.k;
import android.util.Base64;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements B0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f189d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f193i;

    @Override // p053p2.a
    public Object get() {
        return new c((Executor) ((p053p2.a) this.e).get(), (h) ((p053p2.a) this.f190f).get(), (E0.d) ((b) this.f193i).get(), (F0.c) ((p053p2.a) this.f191g).get(), (G0.c) ((p053p2.a) this.f192h).get());
    }

    public String toString() {
        switch (this.f189d) {
            case k.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.e) + ", mProviderPackage: " + ((String) this.f190f) + ", mQuery: " + ((String) this.f191g) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f192h;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public d(p053p2.a aVar, p053p2.a aVar2, b bVar, p053p2.a aVar3, p053p2.a aVar4) {
        this.f189d = 0;
        this.e = aVar;
        this.f190f = aVar2;
        this.f193i = bVar;
        this.f191g = aVar3;
        this.f192h = aVar4;
    }

    public d(String str, String str2, String str3, List list) {
        this.f189d = 4;
        str.getClass();
        this.e = str;
        str2.getClass();
        this.f190f = str2;
        this.f191g = str3;
        list.getClass();
        this.f192h = list;
        this.f193i = str + "-" + str2 + "-" + str3;
    }
}
