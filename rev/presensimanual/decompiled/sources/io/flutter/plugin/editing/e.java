package io.flutter.plugin.editing;

import R1.o;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends SpannableStringBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4669d = 0;
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4670f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4671g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4672h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f4679o;

    public e(o oVar, View view) {
        this.f4679o = new c(view, this);
        if (oVar != null) {
            f(oVar);
        }
    }

    public final void a(d dVar) {
        if (this.e > 0) {
            Log.e("ListenableEditingState", "adding a listener " + dVar.toString() + " in a listener callback");
        }
        if (this.f4669d <= 0) {
            this.f4670f.add(dVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f4671g.add(dVar);
        }
    }

    public final void b() {
        this.f4669d++;
        if (this.e > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f4669d != 1 || this.f4670f.isEmpty()) {
            return;
        }
        this.f4674j = toString();
        this.f4675k = Selection.getSelectionStart(this);
        this.f4676l = Selection.getSelectionEnd(this);
        this.f4677m = BaseInputConnection.getComposingSpanStart(this);
        this.f4678n = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i3 = this.f4669d;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f4670f;
        ArrayList<d> arrayList2 = this.f4671g;
        if (i3 == 1) {
            for (d dVar : arrayList2) {
                this.e++;
                dVar.a(true);
                this.e--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f4674j), (this.f4675k == Selection.getSelectionStart(this) && this.f4676l == Selection.getSelectionEnd(this)) ? false : true, (this.f4677m == BaseInputConnection.getComposingSpanStart(this) && this.f4678n == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f4669d--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            for (d dVar : this.f4670f) {
                this.e++;
                dVar.a(z2);
                this.e--;
            }
        }
    }

    public final void e(d dVar) {
        if (this.e > 0) {
            Log.e("ListenableEditingState", "removing a listener " + dVar.toString() + " in a listener callback");
        }
        this.f4670f.remove(dVar);
        if (this.f4669d > 0) {
            this.f4671g.remove(dVar);
        }
    }

    public final void f(o oVar) {
        int i3;
        b();
        replace(0, length(), (CharSequence) oVar.f1507a);
        int i4 = oVar.f1508b;
        if (i4 >= 0) {
            Selection.setSelection(this, i4, oVar.f1509c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = oVar.f1510d;
        if (i5 < 0 || i5 >= (i3 = oVar.e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f4679o.setComposingRegion(i5, i3);
        }
        this.f4672h.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        ArrayList arrayList = this.f4672h;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        g gVar = new g();
        gVar.e = selectionStart;
        gVar.f4688f = selectionEnd;
        gVar.f4689g = composingSpanStart;
        gVar.f4690h = composingSpanEnd;
        gVar.f4684a = string;
        gVar.f4685b = "";
        gVar.f4686c = -1;
        gVar.f4687d = -1;
        arrayList.add(gVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f4673i;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f4673i = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.e > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i7 = i4 - i3;
        boolean z2 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z2; i8++) {
            z2 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z2) {
            this.f4673i = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i3, i4, charSequence, i5, i6);
        ArrayList arrayList = this.f4672h;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        g gVar = new g();
        gVar.e = selectionStart2;
        gVar.f4688f = selectionEnd2;
        gVar.f4689g = composingSpanStart2;
        gVar.f4690h = composingSpanEnd2;
        String string2 = charSequence.toString();
        gVar.f4684a = string;
        gVar.f4685b = string2;
        gVar.f4686c = i3;
        gVar.f4687d = i4;
        arrayList.add(gVar);
        if (this.f4669d > 0) {
            return spannableStringBuilderReplace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
