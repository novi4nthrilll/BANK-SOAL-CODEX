package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class X extends ListView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f5107d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public V f5112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public G.e f5116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E0.l f5117o;

    public X(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f5107d = new Rect();
        this.e = 0;
        this.f5108f = 0;
        this.f5109g = 0;
        this.f5110h = 0;
        this.f5114l = z2;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i3, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return i4;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0182  */
    /* JADX WARN: Code duplicated, block: B:94:0x0186  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(int i3, MotionEvent motionEvent) {
        boolean z2;
        boolean zA;
        View childAt;
        View childAt2;
        G.e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || z3) {
                    this.f5115m = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f5111i - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    if (this.f5116n == null) {
                        this.f5116n = new G.e(this);
                    }
                    G.e eVar2 = this.f5116n;
                    boolean z4 = eVar2.f306s;
                    eVar2.f306s = true;
                    eVar2.onTouch(this, motionEvent);
                } else {
                    eVar = this.f5116n;
                    if (eVar != null) {
                        if (eVar.f306s) {
                            eVar.d();
                        }
                        eVar.f306s = false;
                    }
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
        if (iFindPointerIndex < 0) {
            z2 = false;
        } else {
            int x3 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x3, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f3 = x3;
                float f4 = y2;
                this.f5115m = true;
                S.a(this, f3, f4);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f5111i;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f5111i = iPointToPosition;
                S.a(childAt3, f3 - childAt3.getLeft(), f4 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f5107d;
                rect.set(left, top, right, bottom);
                rect.left -= this.e;
                rect.top -= this.f5108f;
                rect.right += this.f5109g;
                rect.bottom += this.f5110h;
                if (p072x.b.a()) {
                    zA = U.a(this);
                } else {
                    Field field = W.f5106a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z6 = !zA;
                    if (p072x.b.a()) {
                        U.b(this, z6);
                    } else {
                        Field field2 = W.f5106a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    u.a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    u.a.e(selector2, f3, f4);
                }
                V v = this.f5112j;
                if (v != null) {
                    v.e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z3 = false;
                z2 = true;
            }
        }
        if (z2) {
            this.f5115m = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5111i - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f5115m = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5111i - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z2) {
            if (this.f5116n == null) {
                this.f5116n = new G.e(this);
            }
            G.e eVar3 = this.f5116n;
            boolean z7 = eVar3.f306s;
            eVar3.f306s = true;
            eVar3.onTouch(this, motionEvent);
        } else {
            eVar = this.f5116n;
            if (eVar != null) {
                if (eVar.f306s) {
                    eVar.d();
                }
                eVar.f306s = false;
            }
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f5107d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f5117o != null) {
            return;
        }
        super.drawableStateChanged();
        V v = this.f5112j;
        if (v != null) {
            v.e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f5115m && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f5114l || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f5114l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f5114l || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f5114l && this.f5113k) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5117o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5117o == null) {
            E0.l lVar = new E0.l(11, this);
            this.f5117o = lVar;
            post(lVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i3 < 30 || !T.f5090d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            T.f5087a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            T.f5088b.invoke(this, Integer.valueOf(iPointToPosition));
                            T.f5089c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f5115m && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5111i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        E0.l lVar = this.f5117o;
        if (lVar != null) {
            X x3 = (X) lVar.e;
            x3.f5117o = null;
            x3.removeCallbacks(lVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f5113k = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        V v = null;
        if (drawable != null) {
            V v3 = new V();
            Drawable drawable2 = v3.f5093d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            v3.f5093d = drawable;
            drawable.setCallback(v3);
            v3.e = true;
            v = v3;
        }
        this.f5112j = v;
        super.setSelector(v);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.e = rect.left;
        this.f5108f = rect.top;
        this.f5109g = rect.right;
        this.f5110h = rect.bottom;
    }
}
