package F0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f270f = Arrays.asList(j.f266b, j.f267c, j.f268d, j.e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f271d;
    public boolean e;

    public l(int i3, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.e = false;
        this.f271d = i3;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        List list = f270f;
        if (i4 <= list.size()) {
            while (i3 < i4) {
                ((k) list.get(i3)).a(sQLiteDatabase);
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i3 + " to " + i4 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f271d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.e) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        if (!this.e) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i3, i4);
    }
}
