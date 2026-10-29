package F0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c, G0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p070w0.b f262h = new p070w0.b("proto");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f263d;
    public final H0.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0.a f264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f265g;

    public i(H0.a aVar, H0.a aVar2, a aVar3, l lVar) {
        this.f263d = lVar;
        this.e = aVar;
        this.f264f = aVar2;
        this.f265g = aVar3;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, p079z0.b bVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(bVar.f5936a, String.valueOf(I0.a.a(bVar.f5938c))));
        byte[] bArr = bVar.f5937b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String f(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f252a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object g(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        l lVar = this.f263d;
        lVar.getClass();
        H0.a aVar = this.f264f;
        long jB = aVar.b();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.b() >= ((long) this.f265g.f250c) + jB) {
                    throw new G0.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(g gVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = gVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f263d.close();
    }

    public final Object d(G0.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        H0.a aVar = this.f264f;
        long jB = aVar.b();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objN = bVar.n();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objN;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.b() >= ((long) this.f265g.f250c) + jB) {
                    throw new G0.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
