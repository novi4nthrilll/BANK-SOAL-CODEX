package K1;

import B.C0006g;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p013d1.AbstractC0549x2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements S1.f, k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlutterJNI f766d;
    public final HashMap e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakHashMap f773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0006g f774m;

    public j(FlutterJNI flutterJNI) {
        C0006g c0006g = new C0006g(8);
        c0006g.e = (ExecutorService) D0.b.J().f183g;
        this.e = new HashMap();
        this.f767f = new HashMap();
        this.f768g = new Object();
        this.f769h = new AtomicBoolean(false);
        this.f770i = new HashMap();
        this.f771j = 1;
        this.f772k = new l();
        this.f773l = new WeakHashMap();
        this.f766d = flutterJNI;
        this.f774m = c0006g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [K1.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        e eVar = fVar != null ? fVar.f758b : null;
        String strA = o2.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            p005b0.a.a(AbstractC0549x2.b(strA), i3);
        } else {
            String strB = AbstractC0549x2.b(strA);
            try {
                if (AbstractC0549x2.f3916c == null) {
                    AbstractC0549x2.f3916c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0549x2.f3916c.invoke(null, Long.valueOf(AbstractC0549x2.f3914a), strB, Integer.valueOf(i3));
            } catch (Exception e) {
                AbstractC0549x2.a("asyncTraceBegin", e);
            }
        }
        ?? r3 = new Runnable() { // from class: K1.c
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = this.f749d.f766d;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strA2 = o2.a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    p005b0.a.b(AbstractC0549x2.b(strA2), i5);
                } else {
                    String strB2 = AbstractC0549x2.b(strA2);
                    try {
                        if (AbstractC0549x2.f3917d == null) {
                            AbstractC0549x2.f3917d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0549x2.f3917d.invoke(null, Long.valueOf(AbstractC0549x2.f3914a), strB2, Integer.valueOf(i5));
                    } catch (Exception e3) {
                        AbstractC0549x2.a("asyncTraceEnd", e3);
                    }
                }
                try {
                    o2.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f757a.l(byteBuffer2, new g(flutterJNI, i5));
                                } catch (Error e4) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                        throw e4;
                                    }
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e4);
                                }
                            } catch (Exception e5) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j4);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    flutterJNI.cleanupMessageData(j4);
                    throw th3;
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f772k;
        }
        eVar2.a(r3);
    }

    public final p074x1.a b(S1.k kVar) {
        C0006g c0006g = this.f774m;
        c0006g.getClass();
        i iVar = new i((ExecutorService) c0006g.e);
        p074x1.a aVar = new p074x1.a(1);
        this.f773l.put(aVar, iVar);
        return aVar;
    }

    @Override // S1.f
    public final void c(String str, S1.d dVar, p074x1.a aVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f768g) {
                this.e.remove(str);
            }
            return;
        }
        if (aVar != null) {
            eVar = (e) this.f773l.get(aVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f768g) {
            try {
                this.e.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f767f.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.e.get(str), dVar2.f754a, dVar2.f755b, dVar2.f756c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S1.f
    public final void e(String str, S1.d dVar) {
        c(str, dVar, null);
    }

    @Override // S1.f
    public final void f(String str, ByteBuffer byteBuffer) {
        h(str, byteBuffer, null);
    }

    @Override // S1.f
    public final void h(String str, ByteBuffer byteBuffer, S1.e eVar) {
        o2.a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f771j;
            this.f771j = i3 + 1;
            if (eVar != null) {
                this.f770i.put(Integer.valueOf(i3), eVar);
            }
            FlutterJNI flutterJNI = this.f766d;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // S1.f
    public final p074x1.a l() {
        C0006g c0006g = this.f774m;
        c0006g.getClass();
        i iVar = new i((ExecutorService) c0006g.e);
        p074x1.a aVar = new p074x1.a(1);
        this.f773l.put(aVar, iVar);
        return aVar;
    }
}
