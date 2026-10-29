package c0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013d1.AbstractC0520s3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f2579g = new b(this);
    public final c e = new c();

    public e(Context context) {
        this.f2578f = context;
    }

    @Override // c0.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return u.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.e;
        cVar.f2573a.draw(canvas);
        if (cVar.f2574b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getAlpha() : this.e.f2573a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.e.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2582d;
        return drawable != null ? u.a.c(drawable) : this.e.f2573a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2582d == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f2582d.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.e.f2573a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.e.f2573a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getOpacity() : this.e.f2573a.getOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        c cVar;
        XmlResourceParser xmlResourceParser;
        Animator animatorA;
        q qVar;
        int next;
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.e;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayH = p060s.b.h(resources, theme, attributeSet, a.e);
                    int resourceId = typedArrayH.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = q.f2633m;
                        if (Build.VERSION.SDK_INT >= 24) {
                            qVar = new q();
                            ThreadLocal threadLocal = p060s.m.f5652a;
                            qVar.f2582d = p060s.i.a(resources, resourceId, theme);
                            new p(qVar.f2582d.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
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
                                qVar = new q();
                                qVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                qVar = null;
                            } catch (XmlPullParserException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                qVar = null;
                            }
                        }
                        qVar.f2637i = false;
                        qVar.setCallback(this.f2579g);
                        q qVar2 = cVar.f2573a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        cVar.f2573a = qVar;
                    }
                    typedArrayH.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f2566f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2578f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e4) {
                                        e = e4;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e5) {
                                        e = e5;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = context;
                                }
                            } catch (IOException e6) {
                                e = e6;
                            } catch (XmlPullParserException e7) {
                                e = e7;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = 0;
                            }
                        }
                        animatorA.setTarget(cVar.f2573a.e.f2622b.f2620o.getOrDefault(string, null));
                        if (cVar.f2575c == null) {
                            cVar.f2575c = new ArrayList();
                            cVar.f2576d = new p045n.b();
                        }
                        cVar.f2575c.add(animatorA);
                        cVar.f2576d.put(animatorA, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f2574b == null) {
            cVar.f2574b = new AnimatorSet();
        }
        cVar.f2574b.playTogether(cVar.f2575c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.isAutoMirrored() : this.e.f2573a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2582d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.e.f2574b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.isStateful() : this.e.f2573a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.e.f2573a.setBounds(rect);
        }
    }

    @Override // c0.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.setLevel(i3) : this.e.f2573a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.setState(iArr) : this.e.f2573a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.e.f2573a.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.e.f2573a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e.f2573a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            AbstractC0520s3.c(drawable, i3);
        } else {
            this.e.f2573a.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.h(drawable, colorStateList);
        } else {
            this.e.f2573a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.i(drawable, mode);
        } else {
            this.e.f2573a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.e.f2573a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.e;
        if (cVar.f2574b.isStarted()) {
            return;
        }
        cVar.f2574b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.e.f2574b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
