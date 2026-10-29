package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import id.go.bangkalankab.simpeg.R;

/* JADX INFO: renamed from: k.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f5224b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0746o f5225c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0752r0 f5226a;

    public static synchronized void b() {
        if (f5225c == null) {
            C0746o c0746o = new C0746o();
            f5225c = c0746o;
            c0746o.f5226a = C0752r0.d();
            C0752r0 c0752r0 = f5225c.f5226a;
            E0.k kVar = new E0.k();
            kVar.f226d = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            kVar.e = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            kVar.f227f = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            kVar.f228g = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            kVar.f229h = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            kVar.f230i = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            c0752r0.l(kVar);
        }
    }

    public static void c(Drawable drawable, Z.d dVar, int[] iArr) {
        PorterDuff.Mode mode = C0752r0.f5236h;
        int[] state = drawable.getState();
        int[] iArr2 = Q.f5080a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = dVar.f1940b;
        if (z2 || dVar.f1939a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z2 ? (ColorStateList) dVar.f1941c : null;
            PorterDuff.Mode mode2 = dVar.f1939a ? (PorterDuff.Mode) dVar.f1942d : C0752r0.f5236h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = C0752r0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f5226a.f(context, i3);
    }
}
