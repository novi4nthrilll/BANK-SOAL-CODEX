package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0751q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5233a;

    public /* synthetic */ C0751q0(int i3) {
        this.f5233a = i3;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f5233a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C0751q0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    p021g.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return p018f.e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e3) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    c0.e eVar = new c0.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e4) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    c0.q qVar = new c0.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e5) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                    return null;
                }
        }
    }
}
