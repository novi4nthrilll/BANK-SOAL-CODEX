package H;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.I0;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f322d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Cursor f323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f327j;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f323f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f325h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f326i;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f323f = cursor;
            if (cursor != null) {
                a aVar2 = this.f325h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f326i;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f324g = cursor.getColumnIndexOrThrow("_id");
                this.f322d = true;
                notifyDataSetChanged();
            } else {
                this.f324g = -1;
                this.f322d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f322d || (cursor = this.f323f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f322d) {
            return null;
        }
        this.f323f.moveToPosition(i3);
        if (view == null) {
            I0 i4 = (I0) this;
            view = i4.f5041m.inflate(i4.f5040l, viewGroup, false);
        }
        a(view, this.f323f);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f327j == null) {
            d dVar = new d();
            dVar.f328a = this;
            this.f327j = dVar;
        }
        return this.f327j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f322d || (cursor = this.f323f) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f323f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f322d && (cursor = this.f323f) != null && cursor.moveToPosition(i3)) {
            return this.f323f.getLong(this.f324g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f322d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f323f.moveToPosition(i3)) {
            throw new IllegalStateException(I.f("couldn't move cursor to position ", i3));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f323f);
        return view;
    }
}
