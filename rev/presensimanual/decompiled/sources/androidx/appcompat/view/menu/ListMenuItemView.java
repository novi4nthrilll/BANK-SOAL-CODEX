package androidx.appcompat.view.menu;

import B.D;
import D0.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import p011d.a;
import p032j.i;
import p032j.j;
import p032j.q;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f1972d;
    public ImageView e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RadioButton f1973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f1974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CheckBox f1975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f1976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f1977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f1978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f1979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Drawable f1980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f1982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Drawable f1984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayoutInflater f1986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1987t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVarL = b.L(getContext(), attributeSet, a.f3543n, R.attr.listMenuViewStyle);
        this.f1980m = bVarL.C(5);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        this.f1981n = typedArray.getResourceId(1, -1);
        this.f1983p = typedArray.getBoolean(7, false);
        this.f1982o = context;
        this.f1984q = bVarL.C(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1985r = typedArrayObtainStyledAttributes.hasValue(0);
        bVarL.O();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1986s == null) {
            this.f1986s = LayoutInflater.from(getContext());
        }
        return this.f1986s;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1977j;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1978k;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1978k.getLayoutParams();
        rect.top = this.f1978k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // p032j.q
    public final void c(j jVar) {
        boolean z2;
        int i3;
        String string;
        boolean z3;
        this.f1972d = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.e);
        setCheckable(jVar.isCheckable());
        if (jVar.f4948n.n()) {
            if ((jVar.f4948n.m() ? jVar.f4944j : jVar.f4942h) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        jVar.f4948n.m();
        if (z2) {
            j jVar2 = this.f1972d;
            if (jVar2.f4948n.n()) {
                if ((jVar2.f4948n.m() ? jVar2.f4944j : jVar2.f4942h) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            i3 = z3 ? 0 : 8;
        }
        if (i3 == 0) {
            TextView textView = this.f1976i;
            j jVar3 = this.f1972d;
            char c3 = jVar3.f4948n.m() ? jVar3.f4944j : jVar3.f4942h;
            if (c3 == 0) {
                string = "";
            } else {
                i iVar = jVar3.f4948n;
                Resources resources = iVar.f4915a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.f4915a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = iVar.m() ? jVar3.f4945k : jVar3.f4943i;
                j.a(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                j.a(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                j.a(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                j.a(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                j.a(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                j.a(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c3 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c3 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c3 != ' ') {
                    sb.append(c3);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1976i.getVisibility() != i3) {
            this.f1976i.setVisibility(i3);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.f4951q);
    }

    @Override // p032j.q
    public j getItemData() {
        return this.f1972d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = D.f41a;
        setBackground(this.f1980m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1974g = textView;
        int i3 = this.f1981n;
        if (i3 != -1) {
            textView.setTextAppearance(this.f1982o, i3);
        }
        this.f1976i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1977j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1984q);
        }
        this.f1978k = (ImageView) findViewById(R.id.group_divider);
        this.f1979l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.e != null && this.f1983p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1973f == null && this.f1975h == null) {
            return;
        }
        if ((this.f1972d.f4957x & 4) != 0) {
            if (this.f1973f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1973f = radioButton;
                LinearLayout linearLayout = this.f1979l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1973f;
            view = this.f1975h;
        } else {
            if (this.f1975h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1975h = checkBox;
                LinearLayout linearLayout2 = this.f1979l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1975h;
            view = this.f1973f;
        }
        if (z2) {
            compoundButton.setChecked(this.f1972d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1975h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1973f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1972d.f4957x & 4) != 0) {
            if (this.f1973f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1973f = radioButton;
                LinearLayout linearLayout = this.f1979l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1973f;
        } else {
            if (this.f1975h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1975h = checkBox;
                LinearLayout linearLayout2 = this.f1979l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1975h;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1987t = z2;
        this.f1983p = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1978k;
        if (imageView != null) {
            imageView.setVisibility((this.f1985r || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1972d.f4948n.getClass();
        boolean z2 = this.f1987t;
        if (z2 || this.f1983p) {
            ImageView imageView = this.e;
            if (imageView == null && drawable == null && !this.f1983p) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.e = imageView2;
                LinearLayout linearLayout = this.f1979l;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1983p) {
                this.e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.e;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1974g.getVisibility() != 8) {
                this.f1974g.setVisibility(8);
            }
        } else {
            this.f1974g.setText(charSequence);
            if (this.f1974g.getVisibility() != 0) {
                this.f1974g.setVisibility(0);
            }
        }
    }
}
