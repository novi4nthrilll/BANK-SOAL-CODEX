package O;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p013d1.AbstractC0493o;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1193a;

    public l(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f1193a = context;
                break;
            default:
                this.f1193a = context.getApplicationContext();
                break;
        }
    }

    @Override // O.g
    public void a(AbstractC0493o abstractC0493o) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new j(this, abstractC0493o, threadPoolExecutor, 0));
    }
}
