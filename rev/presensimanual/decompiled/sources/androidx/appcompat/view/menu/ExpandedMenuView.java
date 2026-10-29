package androidx.appcompat.view.menu;

import D0.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p032j.h;
import p032j.j;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1971d = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b bVarL = b.L(context, attributeSet, f1971d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(bVarL.C(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(bVarL.C(1));
        }
        bVarL.O();
    }

    @Override // p032j.h
    public final boolean a(j jVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        throw null;
    }
}
