package F0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.mlkit_vision_face_bundled.F7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements g, p033j1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f256d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f257f;

    public e(long j3, p079z0.b bVar) {
        this.f256d = 0;
        this.e = j3;
        this.f257f = bVar;
    }

    public int a(int i3) {
        e eVar = (e) this.f257f;
        if (eVar == null) {
            return i3 >= 64 ? Long.bitCount(this.e) : Long.bitCount(this.e & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.e & ((1 << i3) - 1));
        }
        return Long.bitCount(this.e) + eVar.a(i3 - 64);
    }

    @Override // F0.g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        p070w0.b bVar = i.f262h;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.e));
        p079z0.b bVar2 = (p079z0.b) this.f257f;
        String str = bVar2.f5936a;
        p070w0.c cVar = bVar2.f5938c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(I0.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", bVar2.f5936a);
            contentValues.put("priority", Integer.valueOf(I0.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // p033j1.b
    public void b(Exception exc) {
        switch (this.f256d) {
            case 2:
                ((F7) this.f257f).f2784b.set(this.e);
                break;
            default:
                ((F7) this.f257f).f2784b.set(this.e);
                break;
        }
    }

    public boolean c(int i3) {
        if (i3 < 64) {
            return (this.e & (1 << i3)) != 0;
        }
        if (((e) this.f257f) == null) {
            this.f257f = new e();
        }
        return ((e) this.f257f).c(i3 - 64);
    }

    public void d() {
        this.e = 0L;
        e eVar = (e) this.f257f;
        if (eVar != null) {
            eVar.d();
        }
    }

    public String toString() {
        switch (this.f256d) {
            case 1:
                if (((e) this.f257f) == null) {
                    return Long.toBinaryString(this.e);
                }
                return ((e) this.f257f).toString() + "xx" + Long.toBinaryString(this.e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(Object obj, long j3, int i3) {
        this.f256d = i3;
        this.f257f = obj;
        this.e = j3;
    }

    public e() {
        this.f256d = 1;
        this.e = 0L;
    }
}
