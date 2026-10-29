package H;

import I1.p;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.m;
import k.I0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i3) {
        super(handler);
        this.f318a = i3;
        this.f319b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f318a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f318a) {
            case 2:
                m mVar = (m) this.f319b;
                if (!mVar.f4851t) {
                    if (Settings.Global.getFloat(mVar.f4837f, "transition_animation_scale", 1.0f) == 0.0f) {
                        mVar.f4842k |= 4;
                    } else {
                        mVar.f4842k &= -5;
                    }
                    ((FlutterJNI) mVar.f4834b.f182f).setAccessibilityFeatures(mVar.f4842k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0 i3) {
        super(new Handler());
        this.f318a = 0;
        this.f319b = i3;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f318a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                I0 i3 = (I0) this.f319b;
                if (i3.e && (cursor = i3.f323f) != null && !cursor.isClosed()) {
                    i3.f322d = i3.f323f.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z2);
                p pVar = (p) this.f319b;
                if (pVar.f398k != null) {
                    pVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
