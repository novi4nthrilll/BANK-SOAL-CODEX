package p018f;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import c0.q;
import k.C0752r0;
import org.xmlpull.v1.XmlPullParserException;
import p013d1.N2;
import p021g.c;
import p060s.b;
import u.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f4431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f4433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N2 f4434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4435u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4436w;

    public e(b bVar, Resources resources) {
        this.f4441h = 255;
        this.f4443j = -1;
        this.f4435u = -1;
        this.v = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayH = b.h(resources2, theme, attributeSet, c.f4478a);
        int i3 = 1;
        eVar.setVisible(typedArrayH.getBoolean(1, true), true);
        b bVar = eVar.f4433s;
        bVar.f4405d |= p021g.b.b(typedArrayH);
        int i4 = 2;
        bVar.f4409i = typedArrayH.getBoolean(2, bVar.f4409i);
        int i5 = 3;
        bVar.f4412l = typedArrayH.getBoolean(3, bVar.f4412l);
        bVar.f4424y = typedArrayH.getInt(4, bVar.f4424y);
        bVar.f4425z = typedArrayH.getInt(5, bVar.f4425z);
        boolean z2 = false;
        eVar.setDither(typedArrayH.getBoolean(0, bVar.f4422w));
        b bVar2 = eVar.f4438d;
        if (resources2 != null) {
            bVar2.f4403b = resources2;
            int i6 = resources.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = bVar2.f4404c;
            bVar2.f4404c = i6;
            if (i7 != i6) {
                bVar2.f4413m = false;
                bVar2.f4410j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayH.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i5)) {
                break;
            }
            if (next3 == i4 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayH2 = b.h(resources2, theme, attributeSet, c.f4479b);
                    int resourceId = typedArrayH2.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                    int resourceId2 = typedArrayH2.getResourceId(i3, -1);
                    Drawable drawableF = resourceId2 > 0 ? C0752r0.d().f(context2, resourceId2) : null;
                    typedArrayH2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i8 = 0;
                    for (int i9 = 0; i9 < attributeCount; i9++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i10 = i8 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i9, z2)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i8] = attributeNameResource;
                            i8 = i10;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i8);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new q();
                            drawableF.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableF = p021g.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f4433s;
                    int iA = bVar3.a(drawableF);
                    bVar3.f4399H[iA] = iArrTrimStateSet;
                    bVar3.f4401J.d(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayH3 = b.h(resources2, theme, attributeSet, c.f4480c);
                        int resourceId3 = typedArrayH3.getResourceId(2, -1);
                        int resourceId4 = typedArrayH3.getResourceId(1, -1);
                        int resourceId5 = typedArrayH3.getResourceId(z2 ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? C0752r0.d().f(context2, resourceId5) : null;
                        boolean z3 = typedArrayH3.getBoolean(3, z2);
                        typedArrayH3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new c0.e(context2);
                                drawableF2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                            } else {
                                drawableF2 = p021g.b.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.f4433s;
                        int iA2 = bVar4.a(drawableF2);
                        long j3 = resourceId3;
                        long j4 = resourceId4;
                        long j5 = (j3 << 32) | j4;
                        long j6 = z3 ? 8589934592L : 0L;
                        long j7 = iA2;
                        bVar4.f4400I.a(j5, Long.valueOf(j7 | j6));
                        if (z3) {
                            bVar4.f4400I.a((j4 << 32) | j3, Long.valueOf(j7 | 4294967296L | j6));
                        }
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                        i3 = 1;
                        z2 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                    }
                    i4 = 2;
                    i5 = 3;
                }
                i3 = 1;
                i4 = 2;
                i5 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    @Override // p018f.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p018f.f
    public final void d(b bVar) {
        this.f4438d = bVar;
        int i3 = this.f4443j;
        if (i3 >= 0) {
            Drawable drawableD = bVar.d(i3);
            this.f4439f = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.f4440g = null;
        this.f4431q = bVar;
        this.f4433s = bVar;
    }

    public final Drawable f() {
        if (!this.f4432r) {
            super.mutate();
            b bVar = this.f4431q;
            bVar.f4400I = bVar.f4400I.clone();
            bVar.f4401J = bVar.f4401J.clone();
            this.f4432r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // p018f.f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        N2 n3 = this.f4434t;
        if (n3 != null) {
            n3.d();
            this.f4434t = null;
            c(this.f4435u);
            this.f4435u = -1;
            this.v = -1;
        }
    }

    @Override // p018f.f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f4436w) {
            f();
            b bVar = this.f4433s;
            bVar.f4400I = bVar.f4400I.clone();
            bVar.f4401J = bVar.f4401J.clone();
            this.f4436w = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar;
        int iIntValue;
        int iIntValue2;
        N2 aVar;
        b bVar2 = this.f4433s;
        int iE = bVar2.e(iArr);
        if (iE < 0) {
            iE = bVar2.e(StateSet.WILD_CARD);
        }
        int i3 = this.f4443j;
        boolean z2 = false;
        if (iE != i3) {
            N2 n3 = this.f4434t;
            if (n3 == null) {
                this.f4434t = null;
                this.v = -1;
                this.f4435u = -1;
                bVar = this.f4433s;
                if (i3 < 0) {
                    bVar.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) bVar.f4401J.c(i3, 0)).intValue();
                }
                if (iE < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) bVar.f4401J.c(iE, 0)).intValue();
                }
                if (iIntValue2 == 0 && iIntValue != 0) {
                    long j3 = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    int iLongValue = (int) ((Long) bVar.f4400I.d(j3, -1L)).longValue();
                    if (iLongValue >= 0) {
                        boolean z3 = (((Long) bVar.f4400I.d(j3, -1L)).longValue() & 8589934592L) != 0;
                        c(iLongValue);
                        Object obj = this.f4439f;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar.f4400I.d(j3, -1L)).longValue() & 4294967296L) != 0, z3);
                        } else if (obj instanceof c0.e) {
                            aVar = new a((c0.e) obj, 1);
                        } else if (obj instanceof Animatable) {
                            aVar = new a((Animatable) obj, 0);
                        } else if (c(iE)) {
                            z2 = true;
                        }
                        aVar.c();
                        this.f4434t = aVar;
                        this.v = i3;
                        this.f4435u = iE;
                        z2 = true;
                    } else if (c(iE)) {
                        z2 = true;
                    }
                } else if (c(iE)) {
                    z2 = true;
                }
            } else {
                if (iE != this.f4435u) {
                    if (iE == this.v && n3.a()) {
                        n3.b();
                        this.f4435u = this.v;
                        this.v = iE;
                    } else {
                        i3 = this.f4435u;
                        n3.d();
                        this.f4434t = null;
                        this.v = -1;
                        this.f4435u = -1;
                        bVar = this.f4433s;
                        if (i3 < 0) {
                            bVar.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = ((Integer) bVar.f4401J.c(i3, 0)).intValue();
                        }
                        if (iE < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = ((Integer) bVar.f4401J.c(iE, 0)).intValue();
                        }
                        if (iIntValue2 == 0) {
                            if (c(iE)) {
                            }
                        } else if (c(iE)) {
                        }
                    }
                }
                z2 = true;
            }
        }
        Drawable drawable = this.f4439f;
        return drawable != null ? z2 | drawable.setState(iArr) : z2;
    }

    @Override // p018f.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        N2 n3 = this.f4434t;
        if (n3 != null && (visible || z3)) {
            if (z2) {
                n3.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
