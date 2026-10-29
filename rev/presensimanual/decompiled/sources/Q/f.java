package Q;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p013d1.AbstractC0528u;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0528u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1373c = true;

    public f(TextView textView) {
        this.f1371a = textView;
        this.f1372b = new d(textView);
    }

    @Override // p013d1.AbstractC0528u
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f1373c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            d dVar = this.f1372b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == dVar) {
                return inputFilterArr;
            }
            i6++;
        }
    }

    @Override // p013d1.AbstractC0528u
    public final boolean b() {
        return this.f1373c;
    }

    @Override // p013d1.AbstractC0528u
    public final void c(boolean z2) {
        if (z2) {
            TextView textView = this.f1371a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
        }
    }

    @Override // p013d1.AbstractC0528u
    public final void d(boolean z2) {
        this.f1373c = z2;
        TextView textView = this.f1371a;
        textView.setTransformationMethod(e(textView.getTransformationMethod()));
        textView.setFilters(a(textView.getFilters()));
    }

    @Override // p013d1.AbstractC0528u
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        if (this.f1373c) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f1379a : transformationMethod;
    }
}
