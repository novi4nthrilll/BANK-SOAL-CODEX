package k;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f5036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f5037d;
    public final ImageView e;

    public H0(View view) {
        this.f5034a = (TextView) view.findViewById(R.id.text1);
        this.f5035b = (TextView) view.findViewById(R.id.text2);
        this.f5036c = (ImageView) view.findViewById(R.id.icon1);
        this.f5037d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(id.go.bangkalankab.simpeg.R.id.edit_query);
    }
}
