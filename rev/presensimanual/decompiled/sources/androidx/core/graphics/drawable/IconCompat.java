package androidx.core.graphics.drawable;

import M.k;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import u.c;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2180k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2182b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2189j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2181a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f2183c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f2184d = null;
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2185f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2186g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2187h = f2180k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2188i = null;

    public static Bitmap a(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z2) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2183c = null;
        iconCompat.f2184d = null;
        iconCompat.f2185f = 0;
        iconCompat.f2186g = null;
        iconCompat.f2187h = f2180k;
        iconCompat.f2188i = null;
        iconCompat.f2181a = 2;
        iconCompat.e = i3;
        iconCompat.f2182b = "";
        iconCompat.f2189j = "";
        return iconCompat;
    }

    public final int c() {
        int i3;
        int i4 = this.f2181a;
        if (i4 != -1 || (i3 = Build.VERSION.SDK_INT) < 23) {
            if (i4 == 2) {
                return this.e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f2182b;
        if (i3 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public final Uri d() {
        int i3 = this.f2181a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return c.a(this.f2182b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f2182b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2181a == -1) {
            return String.valueOf(this.f2182b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2181a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2181a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2182b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2182b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2189j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f2185f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2185f);
                }
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f2182b);
                break;
        }
        if (this.f2186g != null) {
            sb.append(" tint=");
            sb.append(this.f2186g);
        }
        if (this.f2187h != f2180k) {
            sb.append(" mode=");
            sb.append(this.f2187h);
        }
        sb.append(")");
        return sb.toString();
    }
}
