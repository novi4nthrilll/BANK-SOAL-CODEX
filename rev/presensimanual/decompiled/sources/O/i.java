package O;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.l f1187d;
    public final /* synthetic */ EmojiCompatInitializer e;

    public i(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.l lVar) {
        this.e = emojiCompatInitializer;
        this.f1187d = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a() {
        this.e.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(0), 500L);
        this.f1187d.a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void b(androidx.lifecycle.q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void c(androidx.lifecycle.q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void g(androidx.lifecycle.q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void h(androidx.lifecycle.q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void i(androidx.lifecycle.q qVar) {
    }
}
