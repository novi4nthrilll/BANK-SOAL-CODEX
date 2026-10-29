package E0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import id.go.bangkalankab.simpeg.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k.C0746o;
import k.C0752r0;
import k.L0;
import k.Q;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
public final class k implements B0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f226d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f230i;

    public k(Set set, String str, String str2) {
        p026h1.a aVar = p026h1.a.f4514b;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f226d = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f227f = str;
        this.f228g = str2;
        this.f229h = aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.e = Collections.unmodifiableSet(hashSet);
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i3) {
        int iC = L0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{L0.f5067b, L0.f5069d, L0.f5068c, L0.f5070f}, new int[]{L0.b(context, R.attr.colorButtonNormal), p064t.a.b(iC, i3), p064t.a.b(iC, i3), i3});
    }

    public static LayerDrawable e(C0752r0 c0752r0, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable drawableF = c0752r0.f(context, R.drawable.abc_star_black_48dp);
        Drawable drawableF2 = c0752r0.f(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterH;
        int[] iArr = Q.f5080a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0746o.f5224b;
        }
        PorterDuff.Mode mode2 = C0746o.f5224b;
        synchronized (C0746o.class) {
            porterDuffColorFilterH = C0752r0.h(i3, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterH);
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f230i;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public p079z0.a c() {
        String strConcat = ((String) this.f226d) == null ? " transportName" : "";
        if (((p079z0.e) this.f227f) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f228g) == null) {
            strConcat = strConcat + " eventMillis";
        }
        if (((Long) this.f229h) == null) {
            strConcat = strConcat + " uptimeMillis";
        }
        if (((HashMap) this.f230i) == null) {
            strConcat = strConcat + " autoMetadata";
        }
        if (strConcat.isEmpty()) {
            return new p079z0.a((String) this.f226d, (Integer) this.e, (p079z0.e) this.f227f, ((Long) this.f228g).longValue(), ((Long) this.f229h).longValue(), (HashMap) this.f230i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public ColorStateList f(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return G2.a(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return G2.a(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, L0.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return d(context, L0.c(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return G2.a(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.e, i3)) {
                return L0.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f229h, i3)) {
                return G2.a(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f230i, i3)) {
                return G2.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return G2.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = L0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = L0.f5067b;
            iArr2[0] = L0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = L0.e;
            iArr2[1] = L0.c(context, R.attr.colorControlActivated);
            iArr[2] = L0.f5070f;
            iArr2[2] = L0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = L0.f5067b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = L0.e;
            iArr2[1] = L0.c(context, R.attr.colorControlActivated);
            iArr[2] = L0.f5070f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // p053p2.a
    public Object get() {
        return new j((Context) ((A0.f) this.f226d).e, (A0.h) ((p053p2.a) this.e).get(), (F0.c) ((p053p2.a) this.f227f).get(), (d) ((D0.b) this.f230i).get(), (Executor) ((p053p2.a) this.f228g).get(), (G0.c) ((p053p2.a) this.f229h).get(), new p065t0.e());
    }
}
