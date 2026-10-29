package F1;

import B.D;
import S1.g;
import S1.h;
import Z.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.widget.ImageView;
import java.io.IOException;
import k.C0746o;
import k.Q;
import p013d1.G2;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f280d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f282g;

    public c(SensorManager sensorManager, int i3) {
        this.e = sensorManager;
        this.f280d = i3;
    }

    public void a() {
        ImageView imageView = (ImageView) this.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Q.a(drawable);
        }
        if (drawable != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 && i3 == 21) {
                if (((d) this.f282g) == null) {
                    this.f282g = new d();
                }
                d dVar = (d) this.f282g;
                dVar.f1941c = null;
                dVar.f1940b = false;
                dVar.f1942d = null;
                dVar.f1939a = false;
                ColorStateList colorStateListA = G.d.a(imageView);
                if (colorStateListA != null) {
                    dVar.f1940b = true;
                    dVar.f1941c = colorStateListA;
                }
                PorterDuff.Mode modeB = G.d.b(imageView);
                if (modeB != null) {
                    dVar.f1939a = true;
                    dVar.f1942d = modeB;
                }
                if (dVar.f1940b || dVar.f1939a) {
                    C0746o.c(drawable, dVar, imageView.getDrawableState());
                    return;
                }
            }
            d dVar2 = (d) this.f281f;
            if (dVar2 != null) {
                C0746o.c(drawable, dVar2, imageView.getDrawableState());
            }
        }
    }

    public void b(int i3) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.e;
        Context context = imageView.getContext();
        int[] iArr = p011d.a.e;
        D0.b bVarL = D0.b.L(context, null, iArr, i3);
        D.c(imageView, imageView.getContext(), iArr, null, (TypedArray) bVarL.f182f, i3);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) bVarL.f182f;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = G2.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                Q.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListB = bVarL.B(2);
                int i4 = Build.VERSION.SDK_INT;
                G.d.c(imageView, colorStateListB);
                if (i4 == 21 && (drawable2 = imageView.getDrawable()) != null && G.d.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeC = Q.c(typedArray.getInt(3, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                G.d.d(imageView, modeC);
                if (i5 == 21 && (drawable = imageView.getDrawable()) != null && G.d.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            bVarL.O();
        }
    }

    @Override // S1.h
    public void c(Object obj, g gVar) throws IOException {
        String str;
        SensorManager sensorManager = (SensorManager) this.e;
        int i3 = this.f280d;
        Sensor defaultSensor = sensorManager.getDefaultSensor(i3);
        this.f282g = defaultSensor;
        if (defaultSensor != null) {
            b bVar = new b(gVar);
            this.f281f = bVar;
            sensorManager.registerListener(bVar, defaultSensor, 3);
            return;
        }
        StringBuilder sb = new StringBuilder("It seems that your device has no ");
        if (i3 == 1) {
            str = "Accelerometer";
        } else if (i3 == 2) {
            str = "Magnetometer";
        } else if (i3 != 4) {
            str = i3 != 10 ? "Undefined" : "User Accelerometer";
        } else {
            str = "Gyroscope";
        }
        gVar.a("NO_SENSOR", "Sensor not found", I.h(sb, str, " sensor"));
    }

    @Override // S1.h
    public void p() {
        if (((Sensor) this.f282g) != null) {
            ((SensorManager) this.e).unregisterListener((b) this.f281f);
        }
    }

    public c(ImageView imageView) {
        this.f280d = 0;
        this.e = imageView;
    }
}
