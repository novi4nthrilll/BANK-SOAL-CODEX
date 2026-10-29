package B;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class S extends Q {
    public S(X x3, WindowInsets windowInsets) {
        super(x3, windowInsets);
    }

    @Override // B.W
    public X a() {
        return X.c(this.f60c.consumeDisplayCutout(), null);
    }

    @Override // B.W
    public C0005f e() {
        DisplayCutout displayCutout = this.f60c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0005f(displayCutout);
    }

    @Override // B.P, B.W
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s3 = (S) obj;
        return Objects.equals(this.f60c, s3.f60c) && Objects.equals(this.e, s3.e);
    }

    @Override // B.W
    public int hashCode() {
        return this.f60c.hashCode();
    }
}
