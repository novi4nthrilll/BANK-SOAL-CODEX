package F0;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g, B0.b {
    public static final f e = new f(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f258f = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f259d;

    public /* synthetic */ f(int i3) {
        this.f259d = i3;
    }

    @Override // F0.g
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f259d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                p070w0.b bVar = i.f262h;
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i3);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
            default:
                p070w0.b bVar2 = i.f262h;
                ArrayList arrayList2 = new ArrayList();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    p070w0.c cVarB = I0.a.b(cursor.getInt(2));
                    String string2 = cursor.getString(3);
                    arrayList2.add(new p079z0.b(string, string2 == null ? null : Base64.decode(string2, 0), cVarB));
                }
                return arrayList2;
        }
    }

    @Override // p053p2.a
    public Object get() {
        List list = l.f270f;
        return 4;
    }
}
