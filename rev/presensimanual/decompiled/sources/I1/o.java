package I1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.l f388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1.c f389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f390c;

    public o(p pVar, io.flutter.embedding.engine.renderer.l lVar, M1.c cVar) {
        this.f390c = pVar;
        this.f388a = lVar;
        this.f389b = cVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        h hVar;
        this.f388a.f4647a.removeIsDisplayingFlutterUiListener(this);
        this.f389b.run();
        p pVar = this.f390c;
        if ((pVar.f394g instanceof h) || (hVar = pVar.f393f) == null) {
            return;
        }
        hVar.c();
        h hVar2 = pVar.f393f;
        if (hVar2 != null) {
            hVar2.f373d.close();
            pVar.removeView(pVar.f393f);
            pVar.f393f = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }
}
