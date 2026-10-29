package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.l;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class HiddenLifecycleReference {
    private final l lifecycle;

    public HiddenLifecycleReference(l lVar) {
        this.lifecycle = lVar;
    }

    public l getLifecycle() {
        return this.lifecycle;
    }
}
