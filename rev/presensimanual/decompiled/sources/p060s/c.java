package p060s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import id.go.bangkalankab.simpeg.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p050p.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5636a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i3;
        int iF;
        float f3;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = a.f5531a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i4, i4);
                int resourceId = typedArrayObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f5636a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i4, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i4, -65281);
                }
                float f4 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f5 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i7 = 0;
                for (int i8 = 0; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i7);
                boolean z2 = f5 >= 0.0f && f5 <= 100.0f;
                if (f4 != 1.0f || z2) {
                    int iAlpha = (int) ((Color.alpha(color) * f4) + 0.5f);
                    if (iAlpha < 0) {
                        i3 = 0;
                    } else {
                        i3 = 255;
                        if (iAlpha <= 255) {
                            i3 = iAlpha;
                        }
                    }
                    if (z2) {
                        a aVarA = a.a(color);
                        n nVar = n.f5655k;
                        float f6 = aVarA.f5628b;
                        if (f6 >= 1.0d && Math.round(f5) > 0.0d && Math.round(f5) < 100.0d) {
                            float f7 = aVarA.f5627a;
                            float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
                            float f8 = f6;
                            a aVar = null;
                            boolean z3 = true;
                            float f9 = 0.0f;
                            while (true) {
                                if (Math.abs(f9 - f6) < 0.4f) {
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iF = aVar.c(nVar);
                                        break;
                                    }
                                    iF = b.f(f5);
                                    break;
                                }
                                float f10 = 1000.0f;
                                float f11 = 1000.0f;
                                float f12 = 0.0f;
                                float f13 = 100.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f12 - f13) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        break;
                                    }
                                    float f14 = ((f13 - f12) / 2.0f) + f12;
                                    int iC = a.b(f14, f8, fMin).c(n.f5655k);
                                    float fG = b.g(Color.red(iC));
                                    float fG2 = b.g(Color.green(iC));
                                    float fG3 = b.g(Color.blue(iC));
                                    float[] fArr = b.f5635d[1];
                                    float f15 = ((fG3 * fArr[2]) + ((fG2 * fArr[1]) + (fG * fArr[0]))) / 100.0f;
                                    float fCbrt = f15 <= 0.008856452f ? f15 * 903.2963f : (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f5 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f5629c, aVarA2.f5628b, fMin);
                                        f3 = f14;
                                        float f16 = aVarA2.f5630d - aVarB.f5630d;
                                        fMin = fMin;
                                        float f17 = aVarA2.e - aVarB.e;
                                        float f18 = aVarA2.f5631f - aVarB.f5631f;
                                        float fPow = (float) (Math.pow(Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            aVar2 = aVarA2;
                                            f11 = fPow;
                                            f10 = fAbs;
                                        }
                                    } else {
                                        f3 = f14;
                                        fMin = fMin;
                                    }
                                    if (f10 == 0.0f && f11 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f5) {
                                        f12 = f3;
                                    } else {
                                        f13 = f3;
                                    }
                                    depth2 = depth2;
                                    fMin = fMin;
                                }
                                a aVar3 = aVar2;
                                if (!z3) {
                                    if (aVar3 == null) {
                                        f6 = f8;
                                    } else {
                                        aVar = aVar3;
                                        f9 = f8;
                                    }
                                    f8 = ((f6 - f9) / 2.0f) + f9;
                                } else {
                                    if (aVar3 != null) {
                                        iF = aVar3.c(nVar);
                                        break;
                                    }
                                    f8 = ((f6 - f9) / 2.0f) + f9;
                                    z3 = false;
                                }
                            }
                        } else {
                            depth2 = depth2;
                            iF = b.f(f5);
                        }
                        color = iF;
                    } else {
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i3 << 24);
                } else {
                    depth2 = depth2;
                }
                int i10 = i5 + 1;
                if (i10 > iArr.length) {
                    int[] iArr4 = new int[i5 <= 4 ? 8 : i5 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i5);
                    iArr = iArr4;
                }
                iArr[i5] = color;
                if (i10 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i5);
                    objArr = objArr2;
                }
                objArr[i5] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i5 = i10;
                depth2 = depth2;
                r4 = 1;
                i4 = 0;
            } else {
                depth2 = depth2;
                r4 = 1;
                i4 = 0;
            }
        }
        int[] iArr5 = new int[i5];
        int[][] iArr6 = new int[i5][];
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        System.arraycopy(objArr, 0, iArr6, 0, i5);
        return new ColorStateList(iArr6, iArr5);
    }
}
