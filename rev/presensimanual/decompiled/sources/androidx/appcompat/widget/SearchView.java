package androidx.appcompat.widget;

import B.D;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.A0;
import k.AbstractC0721b0;
import k.AbstractC0742m;
import k.B0;
import k.C0;
import k.C0723c0;
import k.C0760v0;
import k.C0768z0;
import k.D0;
import k.E0;
import k.F0;
import k.G0;
import k.I0;
import k.RunnableC0762w0;
import k.ViewOnFocusChangeListenerC0764x0;
import k.ViewOnLayoutChangeListenerC0766y0;
import p013d1.O2;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0721b0 implements p028i.a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final E0 f2048j0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f2049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public G0 f2050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f2051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f2052D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f2053E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f2054F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageView f2055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Drawable f2056H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f2057I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f2058J;
    public final Intent K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Intent f2059L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final CharSequence f2060M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public View.OnFocusChangeListener f2061N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public View.OnClickListener f2062O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f2063P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f2064Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public H.c f2065R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f2066S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f2067T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f2068V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f2069W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f2070a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public CharSequence f2071b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f2072c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f2073d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public SearchableInfo f2074e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Bundle f2075f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final RunnableC0762w0 f2076g0;
    public final RunnableC0762w0 h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final WeakHashMap f2077i0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SearchAutoComplete f2078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f2079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f2080u;
    public final View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f2081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f2082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f2083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f2084z;

    public static class SearchAutoComplete extends AbstractC0742m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public SearchView f2086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final d f2088k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2088k = new d(this);
            this.f2085h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            E0 e3 = SearchView.f2048j0;
            e3.getClass();
            E0.a();
            Method method = e3.f5027c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2085h <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC0742m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2087j) {
                d dVar = this.f2088k;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i3, Rect rect) {
            super.onFocusChanged(z2, i3, rect);
            SearchView searchView = this.f2086i;
            searchView.u(searchView.f2064Q);
            searchView.post(searchView.f2076g0);
            if (searchView.f2078s.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2086i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f2086i.hasFocus() && getVisibility() == 0) {
                this.f2087j = true;
                Context context = getContext();
                E0 e3 = SearchView.f2048j0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f2088k;
            if (!z2) {
                this.f2087j = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2087j = true;
                    return;
                }
                this.f2087j = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2086i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f2085h = i3;
        }
    }

    static {
        E0 e3 = null;
        if (Build.VERSION.SDK_INT < 29) {
            E0 e4 = new E0();
            e4.f5025a = null;
            e4.f5026b = null;
            e4.f5027c = null;
            E0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                e4.f5025a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                e4.f5026b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                e4.f5027c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            e3 = e4;
        }
        f2048j0 = e3;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f2078s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2068V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2078s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2068V = false;
    }

    public int getImeOptions() {
        return this.f2078s.getImeOptions();
    }

    public int getInputType() {
        return this.f2078s.getInputType();
    }

    public int getMaxWidth() {
        return this.f2069W;
    }

    public CharSequence getQuery() {
        return this.f2078s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2067T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2074e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2060M : getContext().getText(this.f2074e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2058J;
    }

    public int getSuggestionRowLayout() {
        return this.f2057I;
    }

    public H.c getSuggestionsAdapter() {
        return this.f2065R;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2071b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2075f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2074e0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2075f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2078s;
        if (i3 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        E0 e3 = f2048j0;
        e3.getClass();
        E0.a();
        Method method = e3.f5025a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        e3.getClass();
        E0.a();
        Method method2 = e3.f5026b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f2078s;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2063P) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i3) {
        int position;
        String strH;
        Cursor cursor = this.f2065R.f323f;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intentH = null;
            try {
                int i4 = I0.f5038A;
                String strH2 = I0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f2074e0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = I0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f2074e0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = I0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), I0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), I0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentH, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2078s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i3) {
        Editable text = this.f2078s.getText();
        Cursor cursor = this.f2065R.f323f;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String strC = this.f2065R.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f2078s;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2074e0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2076g0);
        post(this.h0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        if (z2) {
            int[] iArr = this.f2053E;
            SearchAutoComplete searchAutoComplete = this.f2078s;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2054F;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i8;
            int height = searchAutoComplete.getHeight() + i7;
            Rect rect = this.f2051C;
            rect.set(i8, i7, width, height);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f2052D;
            rect2.set(i9, 0, i10, i11);
            G0 g3 = this.f2050B;
            if (g3 == null) {
                G0 g4 = new G0(rect2, rect, searchAutoComplete);
                this.f2050B = g4;
                setTouchDelegate(g4);
            } else {
                g3.f5030b.set(rect2);
                Rect rect3 = g3.f5032d;
                rect3.set(rect2);
                int i12 = -g3.e;
                rect3.inset(i12, i12);
                g3.f5031c.set(rect);
            }
        }
    }

    @Override // k.AbstractC0721b0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f2064Q) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f2069W;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2069W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f2069W) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F0 f1 = (F0) parcelable;
        super.onRestoreInstanceState(f1.f337a);
        u(f1.f5028c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F0 f1 = new F0(super.onSaveInstanceState());
        f1.f5028c = this.f2064Q;
        return f1;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f2076g0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f2078s.getText());
        int i3 = (!zIsEmpty || (this.f2063P && !this.f2072c0)) ? 0 : 8;
        ImageView imageView = this.f2083y;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f2078s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2080u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z2 = this.f2063P;
        SearchAutoComplete searchAutoComplete = this.f2078s;
        CharSequence charSequence2 = charSequence;
        if (z2 && (drawable = this.f2056H) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f2068V || !isFocusable()) {
            return false;
        }
        if (this.f2064Q) {
            return super.requestFocus(i3, rect);
        }
        boolean zRequestFocus = this.f2078s.requestFocus(i3, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.v.setVisibility(((this.f2066S || this.f2070a0) && !this.f2064Q && (this.f2082x.getVisibility() == 0 || this.f2084z.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2075f0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f2078s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2062O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f2063P == z2) {
            return;
        }
        this.f2063P = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i3) {
        this.f2078s.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f2078s.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f2069W = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2061N = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2062O = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2067T = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.U = z2;
        H.c cVar = this.f2065R;
        if (cVar instanceof I0) {
            ((I0) cVar).f5047s = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2074e0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f2078s;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f2074e0.getImeOptions());
            int inputType = this.f2074e0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f2074e0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            H.c cVar = this.f2065R;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f2074e0.getSuggestAuthority() != null) {
                I0 i3 = new I0(getContext(), this, this.f2074e0, this.f2077i0);
                this.f2065R = i3;
                searchAutoComplete.setAdapter(i3);
                ((I0) this.f2065R).f5047s = this.U ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f2074e0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f2074e0.getVoiceSearchLaunchWebSearch()) {
                intent = this.K;
            } else if (this.f2074e0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2059L;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f2070a0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2064Q);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f2066S = z2;
        u(this.f2064Q);
    }

    public void setSuggestionsAdapter(H.c cVar) {
        this.f2065R = cVar;
        this.f2078s.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f2066S;
        this.f2082x.setVisibility((!z3 || !(z3 || this.f2070a0) || this.f2064Q || !hasFocus() || (!z2 && this.f2070a0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f2064Q = z2;
        int i3 = 8;
        int i4 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f2078s.getText());
        this.f2081w.setVisibility(i4);
        t(!zIsEmpty);
        this.f2079t.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f2055G;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2063P) ? 8 : 0);
        p();
        if (this.f2070a0 && !this.f2064Q && zIsEmpty) {
            this.f2082x.setVisibility(8);
            i3 = 0;
        }
        this.f2084z.setVisibility(i3);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f2051C = new Rect();
        this.f2052D = new Rect();
        this.f2053E = new int[2];
        this.f2054F = new int[2];
        this.f2076g0 = new RunnableC0762w0(this, 0);
        this.h0 = new RunnableC0762w0(this, 1);
        this.f2077i0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C0768z0 c0768z0 = new C0768z0(this);
        A0 a3 = new A0(this);
        C0723c0 c0723c0 = new C0723c0(1, this);
        C0760v0 c0760v0 = new C0760v0(this);
        int[] iArr = p011d.a.f3546q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        D0.b bVar2 = new D0.b(context, typedArrayObtainStyledAttributes);
        D.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i3);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2078s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2079t = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f2080u = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.v = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2081w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2082x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2083y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2084z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2055G = imageView5;
        viewFindViewById.setBackground(bVar2.C(10));
        viewFindViewById2.setBackground(bVar2.C(14));
        imageView.setImageDrawable(bVar2.C(13));
        imageView2.setImageDrawable(bVar2.C(7));
        imageView3.setImageDrawable(bVar2.C(4));
        imageView4.setImageDrawable(bVar2.C(16));
        imageView5.setImageDrawable(bVar2.C(13));
        this.f2056H = bVar2.C(12);
        O2.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2057I = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2058J = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c0760v0);
        searchAutoComplete.setOnEditorActionListener(c0768z0);
        searchAutoComplete.setOnItemClickListener(a3);
        searchAutoComplete.setOnItemSelectedListener(c0723c0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0764x0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2060M = typedArrayObtainStyledAttributes.getText(6);
        this.f2067T = typedArrayObtainStyledAttributes.getText(11);
        int i4 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        bVar2.O();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2059L = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2049A = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0766y0(this));
        }
        u(this.f2063P);
        r();
    }

    public void setOnCloseListener(B0 b3) {
    }

    public void setOnQueryTextListener(C0 c3) {
    }

    public void setOnSuggestionListener(D0 d3) {
    }
}
