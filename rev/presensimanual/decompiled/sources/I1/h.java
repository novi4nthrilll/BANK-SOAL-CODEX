package I1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class h extends View implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageReader f373d;
    public Image e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f377i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i3, int i4, int i5) {
        super(context, null);
        ImageReader imageReaderF = f(i3, i4);
        this.f377i = false;
        this.f373d = imageReaderF;
        this.f376h = i5;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i3, int i4) {
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i3 + ", set width=1");
            i3 = 1;
        }
        if (i4 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i4 + ", set height=1");
            i4 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i3, i4, 1, 3, 768L) : ImageReader.newInstance(i3, i4, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        if (M.j.b(this.f376h) == 0) {
            Surface surface = this.f373d.getSurface();
            lVar.f4649c = surface;
            lVar.f4647a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f375g = lVar;
        this.f377i = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f377i) {
            setAlpha(0.0f);
            e();
            this.f374f = null;
            Image image = this.e;
            if (image != null) {
                image.close();
                this.e = null;
            }
            invalidate();
            this.f377i = false;
        }
    }

    public final boolean e() {
        if (!this.f377i) {
            return false;
        }
        Image imageAcquireLatestImage = this.f373d.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.e;
            if (image != null) {
                image.close();
                this.e = null;
            }
            this.e = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void g(int i3, int i4) {
        if (this.f375g == null) {
            return;
        }
        if (i3 == this.f373d.getWidth() && i4 == this.f373d.getHeight()) {
            return;
        }
        Image image = this.e;
        if (image != null) {
            image.close();
            this.e = null;
        }
        this.f373d.close();
        this.f373d = f(i3, i4);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f375g;
    }

    public ImageReader getImageReader() {
        return this.f373d;
    }

    public Surface getSurface() {
        return this.f373d.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.e;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                this.f374f = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.e.getHeight();
                    Bitmap bitmap = this.f374f;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f374f.getHeight() != height) {
                        this.f374f = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f374f.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f374f;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f373d.getWidth() && i4 == this.f373d.getHeight()) && this.f376h == 1 && this.f377i) {
            g(i3, i4);
            io.flutter.embedding.engine.renderer.l lVar = this.f375g;
            Surface surface = this.f373d.getSurface();
            lVar.f4649c = surface;
            lVar.f4647a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }
}
