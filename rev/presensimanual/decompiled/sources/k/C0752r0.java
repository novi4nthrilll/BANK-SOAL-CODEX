package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import id.go.bangkalankab.simpeg.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p013d1.AbstractC0520s3;

/* JADX INFO: renamed from: k.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C0752r0 f5237i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f5239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p045n.l f5240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p045n.m f5241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f5242d = new WeakHashMap(0);
    public TypedValue e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E0.k f5244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f5236h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0749p0 f5238j = new C0749p0(6);

    public static synchronized C0752r0 d() {
        try {
            if (f5237i == null) {
                C0752r0 c0752r0 = new C0752r0();
                f5237i = c0752r0;
                j(c0752r0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5237i;
    }

    public static synchronized PorterDuffColorFilter h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0749p0 c0749p0 = f5238j;
        c0749p0.getClass();
        int i4 = (31 + i3) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0749p0.a(Integer.valueOf(mode.hashCode() + i4));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(C0752r0 c0752r0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0752r0.a("vector", new C0751q0(3));
            c0752r0.a("animated-vector", new C0751q0(2));
            c0752r0.a("animated-selector", new C0751q0(1));
            c0752r0.a("drawable", new C0751q0(0));
        }
    }

    public final void a(String str, C0751q0 c0751q0) {
        if (this.f5240b == null) {
            this.f5240b = new p045n.l();
        }
        this.f5240b.put(str, c0751q0);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                p045n.e eVar = (p045n.e) this.f5242d.get(context);
                if (eVar == null) {
                    eVar = new p045n.e();
                    this.f5242d.put(context, eVar);
                }
                eVar.e(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i3) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j3);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableE = null;
        if (this.f5244g != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawableE = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawableE = E0.k.e(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableE = E0.k.e(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableE = E0.k.e(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableE != null) {
            layerDrawableE.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawableE);
        }
        return layerDrawableE;
    }

    public final synchronized Drawable e(Context context, long j3) {
        p045n.e eVar = (p045n.e) this.f5242d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = p045n.d.b(eVar.e, eVar.f5367g, j3);
            if (iB >= 0) {
                Object[] objArr = eVar.f5366f;
                Object obj = objArr[iB];
                Object obj2 = p045n.e.f5364h;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    eVar.f5365d = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i3) {
        return g(context, i3);
    }

    public final synchronized Drawable g(Context context, int i3) {
        Drawable drawableK;
        try {
            if (!this.f5243f) {
                this.f5243f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof c0.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f5243f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i3);
            if (drawableK == null) {
                drawableK = c(context, i3);
            }
            if (drawableK == null) {
                drawableK = p056r.a.b(context, i3);
            }
            if (drawableK != null) {
                drawableK = m(context, i3, drawableK);
            }
            if (drawableK != null) {
                Q.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i3) {
        ColorStateList colorStateList;
        p045n.m mVar;
        WeakHashMap weakHashMap = this.f5239a;
        ColorStateList colorStateListF = null;
        colorStateList = (weakHashMap == null || (mVar = (p045n.m) weakHashMap.get(context)) == null) ? null : (ColorStateList) mVar.c(i3, null);
        if (colorStateList == null) {
            E0.k kVar = this.f5244g;
            if (kVar != null) {
                colorStateListF = kVar.f(context, i3);
            }
            if (colorStateListF != null) {
                if (this.f5239a == null) {
                    this.f5239a = new WeakHashMap();
                }
                p045n.m mVar2 = (p045n.m) this.f5239a.get(context);
                if (mVar2 == null) {
                    mVar2 = new p045n.m();
                    this.f5239a.put(context, mVar2);
                }
                mVar2.a(i3, colorStateListF);
            }
            colorStateList = colorStateListF;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i3) {
        int next;
        p045n.l lVar = this.f5240b;
        if (lVar == null || lVar.isEmpty()) {
            return null;
        }
        p045n.m mVar = this.f5241c;
        if (mVar != null) {
            String str = (String) mVar.c(i3, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f5240b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f5241c = new p045n.m();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long j3 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j3);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f5241c.a(i3, name);
                C0751q0 c0751q0 = (C0751q0) this.f5240b.getOrDefault(name, null);
                if (c0751q0 != null) {
                    drawableE = c0751q0.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j3, drawableE);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableE == null) {
            this.f5241c.a(i3, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(E0.k kVar) {
        this.f5244g = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Drawable m(Context context, int i3, Drawable drawable) {
        E0.k kVar;
        boolean z2;
        PorterDuff.Mode mode;
        int iRound;
        Drawable drawableMutate;
        int iC;
        int i4 = R.attr.colorControlNormal;
        ColorStateList colorStateListI = i(context, i3);
        if (colorStateListI != null) {
            int[] iArr = Q.f5080a;
            drawable = AbstractC0520s3.d(drawable.mutate());
            u.a.h(drawable, colorStateListI);
            PorterDuff.Mode mode2 = null;
            if (this.f5244g != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode2 = PorterDuff.Mode.MULTIPLY;
            }
            if (mode2 != null) {
                u.a.i(drawable, mode2);
            }
        } else if (this.f5244g == null) {
            kVar = this.f5244g;
            z2 = false;
            if (kVar != null) {
                mode = C0746o.f5224b;
                if (E0.k.b((int[]) kVar.f226d, i3)) {
                    iRound = -1;
                } else if (E0.k.b((int[]) kVar.f227f, i3)) {
                    iRound = -1;
                    i4 = R.attr.colorControlActivated;
                } else {
                    if (E0.k.b((int[]) kVar.f228g, i3)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                            iRound = Math.round(40.8f);
                            i4 = android.R.attr.colorForeground;
                        } else if (i3 == R.drawable.abc_dialog_material_background) {
                            iRound = -1;
                            i4 = 0;
                        }
                        if (z2) {
                            int[] iArr2 = Q.f5080a;
                            drawableMutate = drawable.mutate();
                            iC = L0.c(context, i4);
                            synchronized (C0746o.class) {
                                PorterDuffColorFilter porterDuffColorFilterH = h(iC, mode);
                            }
                            drawableMutate.setColorFilter(porterDuffColorFilterH);
                            if (iRound != -1) {
                                drawableMutate.setAlpha(iRound);
                            }
                        }
                    }
                    iRound = -1;
                    i4 = android.R.attr.colorBackground;
                }
                z2 = true;
                if (z2) {
                    int[] iArr3 = Q.f5080a;
                    drawableMutate = drawable.mutate();
                    iC = L0.c(context, i4);
                    synchronized (C0746o.class) {
                        PorterDuffColorFilter porterDuffColorFilterH2 = h(iC, mode);
                        drawableMutate.setColorFilter(porterDuffColorFilterH2);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
            }
        } else if (i3 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int iC2 = L0.c(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode3 = C0746o.f5224b;
            E0.k.g(drawableFindDrawableByLayerId, iC2, mode3);
            E0.k.g(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), L0.c(context, R.attr.colorControlNormal), mode3);
            E0.k.g(layerDrawable.findDrawableByLayerId(android.R.id.progress), L0.c(context, R.attr.colorControlActivated), mode3);
        } else if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
            int iB = L0.b(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode4 = C0746o.f5224b;
            E0.k.g(drawableFindDrawableByLayerId2, iB, mode4);
            E0.k.g(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), L0.c(context, R.attr.colorControlActivated), mode4);
            E0.k.g(layerDrawable2.findDrawableByLayerId(android.R.id.progress), L0.c(context, R.attr.colorControlActivated), mode4);
        } else {
            kVar = this.f5244g;
            z2 = false;
            if (kVar != null) {
                mode = C0746o.f5224b;
                if (E0.k.b((int[]) kVar.f226d, i3)) {
                    iRound = -1;
                } else if (E0.k.b((int[]) kVar.f227f, i3)) {
                    iRound = -1;
                    i4 = R.attr.colorControlActivated;
                } else {
                    if (E0.k.b((int[]) kVar.f228g, i3)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                            iRound = Math.round(40.8f);
                            i4 = android.R.attr.colorForeground;
                        } else if (i3 == R.drawable.abc_dialog_material_background) {
                            iRound = -1;
                            i4 = 0;
                        }
                        if (z2) {
                            int[] iArr4 = Q.f5080a;
                            drawableMutate = drawable.mutate();
                            iC = L0.c(context, i4);
                            synchronized (C0746o.class) {
                                PorterDuffColorFilter porterDuffColorFilterH3 = h(iC, mode);
                                drawableMutate.setColorFilter(porterDuffColorFilterH3);
                                if (iRound != -1) {
                                    drawableMutate.setAlpha(iRound);
                                }
                            }
                        }
                    }
                    iRound = -1;
                    i4 = android.R.attr.colorBackground;
                }
                z2 = true;
                if (z2) {
                    int[] iArr5 = Q.f5080a;
                    drawableMutate = drawable.mutate();
                    iC = L0.c(context, i4);
                    synchronized (C0746o.class) {
                        PorterDuffColorFilter porterDuffColorFilterH4 = h(iC, mode);
                        drawableMutate.setColorFilter(porterDuffColorFilterH4);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
            }
        }
        return drawable;
    }
}
