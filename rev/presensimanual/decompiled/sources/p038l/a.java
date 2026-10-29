package p038l;

import java.util.concurrent.Executors;
import p013d1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f5284b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5285a;

    public a(int i3) {
        switch (i3) {
            case 1:
                this.f5285a = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f5285a = new a(1);
                break;
        }
    }
}
