package O;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f1178i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile h f1179j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p045n.c f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1183d;
    public final N0.j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f1184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f1186h;

    public h(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1180a = reentrantReadWriteLock;
        this.f1182c = 3;
        g gVar = qVar.f1212a;
        this.f1184f = gVar;
        int i3 = qVar.f1213b;
        this.f1185g = i3;
        this.f1186h = qVar.f1214c;
        this.f1183d = new Handler(Looper.getMainLooper());
        this.f1181b = new p045n.c(0);
        N0.j jVar = new N0.j(this);
        this.e = jVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f1182c = 0;
            } catch (Throwable th) {
                this.f1180a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new e(jVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (f1178i) {
            try {
                hVar = f1179j;
                if (!(hVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final int b() {
        this.f1180a.readLock().lock();
        try {
            return this.f1182c;
        } finally {
            this.f1180a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1185g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1180a.writeLock().lock();
        try {
            if (this.f1182c == 0) {
                this.f1180a.writeLock().unlock();
                return;
            }
            this.f1182c = 0;
            this.f1180a.writeLock().unlock();
            N0.j jVar = this.e;
            h hVar = (h) jVar.f1084a;
            try {
                hVar.f1184f.a(new e(jVar));
            } catch (Throwable th) {
                hVar.d(th);
            }
        } catch (Throwable th2) {
            this.f1180a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1180a.writeLock().lock();
        try {
            this.f1182c = 2;
            arrayList.addAll(this.f1181b);
            this.f1181b.clear();
            this.f1180a.writeLock().unlock();
            this.f1183d.post(new N0.q(arrayList, this.f1182c, th));
        } catch (Throwable th2) {
            this.f1180a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i3, int i4) {
        int iCharCount;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i3 <= i4)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        w wVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i4 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i3 == i4) {
            return charSequence;
        }
        A0.g gVar = (A0.g) this.e.f1085b;
        gVar.getClass();
        boolean z2 = charSequence instanceof t;
        if (z2) {
            ((t) charSequence).a();
        }
        if (z2) {
            wVar = new w((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    wVar = new w((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i4 + 1, u.class) <= i4) {
                    wVar = new w(charSequence);
                }
            } finally {
                if (z2) {
                    ((t) charSequence).b();
                }
            }
        }
        if (wVar != null && (uVarArr = (u[]) wVar.e.getSpans(i3, i4, u.class)) != null && uVarArr.length > 0) {
            for (u uVar : uVarArr) {
                int spanStart = wVar.e.getSpanStart(uVar);
                int spanEnd = wVar.e.getSpanEnd(uVar);
                if (spanStart != i4) {
                    wVar.removeSpan(uVar);
                }
                i3 = Math.min(spanStart, i3);
                i4 = Math.max(spanEnd, i4);
            }
        }
        if (i3 != i4 && i3 < charSequence.length()) {
            o oVar = new o((r) ((E0.n) gVar.e).f237f);
            w wVar2 = wVar;
            int iCodePointAt = Character.codePointAt(charSequence, i3);
            int i5 = 0;
            loop1: while (true) {
                iCharCount = i3;
                while (true) {
                    if (i3 >= i4 || i5 >= Integer.MAX_VALUE) {
                        break loop1;
                    }
                    int iA = oVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i4) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i3 = iCharCount;
                    } else if (iA == 2) {
                        i3 += Character.charCount(iCodePointAt);
                        if (i3 < i4) {
                            iCodePointAt = Character.codePointAt(charSequence, i3);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (!gVar.s(charSequence, iCharCount, i3, oVar.f1202d.f1216b)) {
                    if (wVar2 == null) {
                        wVar2 = new w((Spannable) new SpannableString(charSequence));
                    }
                    wVar2.setSpan(new u(oVar.f1202d.f1216b), iCharCount, i3, 33);
                    i5++;
                }
            }
            if (oVar.f1199a == 2 && oVar.f1201c.f1216b != null && ((oVar.f1203f > 1 || oVar.c()) && i5 < Integer.MAX_VALUE && !gVar.s(charSequence, iCharCount, i3, oVar.f1201c.f1216b))) {
                if (wVar2 == null) {
                    wVar2 = new w(charSequence);
                }
                wVar2.setSpan(new u(oVar.f1201c.f1216b), iCharCount, i3, 33);
            }
            if (wVar2 != null) {
                return wVar2.e;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(f fVar) {
        A.d.b(fVar, "initCallback cannot be null");
        this.f1180a.writeLock().lock();
        try {
            if (this.f1182c == 1 || this.f1182c == 2) {
                this.f1183d.post(new N0.q(Arrays.asList(fVar), this.f1182c, null));
            } else {
                this.f1181b.add(fVar);
            }
        } finally {
            this.f1180a.writeLock().unlock();
        }
    }
}
