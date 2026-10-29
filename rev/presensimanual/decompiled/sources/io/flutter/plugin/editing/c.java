package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseInputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f4668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, e eVar) {
        super(view, true);
        this.f4668a = eVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f4668a;
    }
}
