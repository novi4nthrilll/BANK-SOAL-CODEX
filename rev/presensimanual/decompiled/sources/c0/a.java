package c0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p013d1.AbstractC0491n3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2562a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2563b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f2564c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2565d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f2566f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f2567g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f2568h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2569i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f2570j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f2571k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i3) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i4;
        int i5;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        Animator animatorD = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            boolean z2 = false;
            int i6 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i7 = 1;
            if (next == 1) {
                break;
            }
            int i8 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorD = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorD = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayH = p060s.b.h(resources2, theme2, attributeSet, f2568h);
                    a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !p060s.b.e(xmlResourceParser2, "ordering") ? 0 : typedArrayH.getInt(0, 0));
                    typedArrayH.recycle();
                    animatorD = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i6 || eventType == i7) {
                            break;
                        }
                        if (eventType != i8) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str2)) {
                                TypedArray typedArrayH2 = p060s.b.h(resources2, theme2, attributeSetAsAttributeSet, f2569i);
                                String strC = p060s.b.c(typedArrayH2, xmlResourceParser2, "propertyName", i6);
                                int i9 = !p060s.b.e(xmlResourceParser2, "valueType") ? 4 : typedArrayH2.getInt(i8, 4);
                                int i10 = i9;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    if (next2 == i6 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = f2570j;
                                        i5 = i10;
                                        if (i5 == 4) {
                                            TypedArray typedArrayH3 = p060s.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue typedValuePeekValue = !p060s.b.e(xmlResourceParser2, "value") ? null : typedArrayH3.peekValue(0);
                                            int i11 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                            typedArrayH3.recycle();
                                            i5 = i11;
                                        }
                                        TypedArray typedArrayH4 = p060s.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f3 = p060s.b.e(xmlResourceParser2, "fraction") ? typedArrayH4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !p060s.b.e(xmlResourceParser2, "value") ? null : typedArrayH4.peekValue(0);
                                        boolean z3 = typedValuePeekValue2 != null;
                                        int i12 = i5 == 4 ? (z3 && c(typedValuePeekValue2.type)) ? 3 : 0 : i5;
                                        if (!z3) {
                                            keyframeOfFloat = i12 == 0 ? Keyframe.ofFloat(f3) : Keyframe.ofInt(f3);
                                        } else if (i12 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f3, !p060s.b.e(xmlResourceParser2, "value") ? 0.0f : typedArrayH4.getFloat(0, 0.0f));
                                        } else if (i12 == 1 || i12 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f3, !p060s.b.e(xmlResourceParser2, "value") ? 0 : typedArrayH4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !p060s.b.e(xmlResourceParser2, "interpolator") ? 0 : typedArrayH4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayH4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i5 = i10;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str2 = str2;
                                    attributeSetAsAttributeSet = attributeSet2;
                                    i10 = i5;
                                    i6 = 3;
                                }
                                int i13 = i10;
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    propertyValuesHolderB = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i14 = 0;
                                    while (i14 < size) {
                                        Keyframe keyframe3 = keyframeArr[i14];
                                        if (keyframe3.getFraction() >= 0.0f) {
                                            i4 = size;
                                        } else {
                                            if (i14 == 0) {
                                                keyframe3.setFraction(0.0f);
                                            } else {
                                                int i15 = size - 1;
                                                if (i14 == i15) {
                                                    keyframe3.setFraction(1.0f);
                                                } else {
                                                    int i16 = i14;
                                                    for (int i17 = i14 + 1; i17 < i15 && keyframeArr[i17].getFraction() < 0.0f; i17++) {
                                                        i16 = i17;
                                                    }
                                                    float fraction3 = (keyframeArr[i16 + 1].getFraction() - keyframeArr[i14 - 1].getFraction()) / ((i16 - i14) + 2);
                                                    int i18 = i14;
                                                    while (i18 <= i16) {
                                                        keyframeArr[i18].setFraction(keyframeArr[i18 - 1].getFraction() + fraction3);
                                                        i18++;
                                                        size = size;
                                                    }
                                                    i4 = size;
                                                }
                                            }
                                            i4 = size;
                                        }
                                        i14++;
                                        size = i4;
                                    }
                                    propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strC, keyframeArr);
                                    if (i13 == 3) {
                                        propertyValuesHolderB.setEvaluator(g.f2581a);
                                    }
                                }
                                if (propertyValuesHolderB == null) {
                                    propertyValuesHolderB = b(typedArrayH2, i9, 0, 1, strC);
                                }
                                if (propertyValuesHolderB != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderB);
                                }
                                typedArrayH2.recycle();
                            } else {
                                attributeSet2 = attributeSetAsAttributeSet;
                                str = str2;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            str2 = str;
                            attributeSetAsAttributeSet = attributeSet2;
                            i6 = 3;
                            i7 = 1;
                            i8 = 2;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i19 = 0; i19 < size2; i19++) {
                            propertyValuesHolderArr[i19] = (PropertyValuesHolder) arrayList2.get(i19);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (animatorD instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorD).setValues(propertyValuesHolderArr);
                    }
                    z2 = true;
                }
                if (animatorSet != null && !z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorD);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i20 = 0;
            while (it.hasNext()) {
                animatorArr[i20] = (Animator) it.next();
                i20++;
            }
            if (i3 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorD;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i3, int i4, int i5, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        boolean z2 = typedValuePeekValue != null;
        int i6 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i5);
        boolean z3 = typedValuePeekValue2 != null;
        int i7 = z3 ? typedValuePeekValue2.type : 0;
        if (i3 == 4) {
            i3 = ((z2 && c(i6)) || (z3 && c(i7))) ? 3 : 0;
        }
        boolean z4 = i3 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i3 == 2) {
            String string = typedArray.getString(i4);
            String string2 = typedArray.getString(i5);
            p064t.f[] fVarArrC = AbstractC0491n3.c(string);
            p064t.f[] fVarArrC2 = AbstractC0491n3.c(string2);
            if (fVarArrC == null && fVarArrC2 == null) {
                return null;
            }
            if (fVarArrC == null) {
                if (fVarArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), fVarArrC2);
                }
                return null;
            }
            f fVar = new f();
            if (fVarArrC2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, fVarArrC);
            } else {
                if (!AbstractC0491n3.a(fVarArrC, fVarArrC2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, fVarArrC, fVarArrC2);
            }
            return propertyValuesHolderOfObject;
        }
        g gVar = i3 == 3 ? g.f2581a : null;
        if (z4) {
            if (z2) {
                float dimension = i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f);
                if (z3) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i7 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z2) {
            if (i6 == 5) {
                color2 = (int) typedArray.getDimension(i4, 0.0f);
            } else {
                color2 = c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0);
            }
            if (z3) {
                if (i7 == 5) {
                    color3 = (int) typedArray.getDimension(i5, 0.0f);
                } else {
                    color3 = c(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z3) {
            if (i7 == 5) {
                color = (int) typedArray.getDimension(i5, 0.0f);
            } else {
                color = c(i7) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || gVar == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(gVar);
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i3) {
        return i3 >= 28 && i3 <= 31;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0217  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        int i3;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator2;
        int i4 = 1;
        TypedArray typedArrayH = p060s.b.h(resources, theme, attributeSet, f2567g);
        TypedArray typedArrayH2 = p060s.b.h(resources, theme, attributeSet, f2571k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j3 = p060s.b.e(xmlResourceParser, "duration") ? typedArrayH.getInt(1, 300) : 300;
        long j4 = !p060s.b.e(xmlResourceParser, "startOffset") ? 0 : typedArrayH.getInt(2, 0);
        int i5 = !p060s.b.e(xmlResourceParser, "valueType") ? 4 : typedArrayH.getInt(7, 4);
        if (p060s.b.e(xmlResourceParser, "valueFrom") && p060s.b.e(xmlResourceParser, "valueTo")) {
            if (i5 == 4) {
                TypedValue typedValuePeekValue = typedArrayH.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i6 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayH.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i5 = ((z2 && c(i6)) || (z3 && c(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayH, i5, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j3);
        valueAnimator3.setStartDelay(j4);
        valueAnimator3.setRepeatCount(!p060s.b.e(xmlResourceParser, "repeatCount") ? 0 : typedArrayH.getInt(3, 0));
        valueAnimator3.setRepeatMode(!p060s.b.e(xmlResourceParser, "repeatMode") ? 1 : typedArrayH.getInt(4, 1));
        if (typedArrayH2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strC = p060s.b.c(typedArrayH2, xmlResourceParser, "pathData", 1);
            if (strC != null) {
                String strC2 = p060s.b.c(typedArrayH2, xmlResourceParser, "propertyXName", 2);
                String strC3 = p060s.b.c(typedArrayH2, xmlResourceParser, "propertyYName", 3);
                if (strC2 == null && strC3 == null) {
                    throw new InflateException(typedArrayH2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    p064t.f.b(AbstractC0491n3.c(strC), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    while (true) {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        valueAnimator3 = valueAnimator3;
                        i4 = 1;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + i4);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f3 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    typedArray = typedArrayH;
                    int i7 = 0;
                    int i8 = 0;
                    float f4 = 0.0f;
                    while (true) {
                        if (i8 >= iMin) {
                            break;
                        }
                        int i9 = iMin;
                        pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i7)).floatValue(), fArr3, null);
                        fArr[i8] = fArr3[0];
                        fArr2[i8] = fArr3[1];
                        f4 += f3;
                        int i10 = i7 + 1;
                        if (i10 < arrayList.size() && f4 > ((Float) arrayList.get(i10)).floatValue()) {
                            pathMeasure2.nextContour();
                            i7 = i10;
                        }
                        i8++;
                        iMin = i9;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strC2 != null ? PropertyValuesHolder.ofFloat(strC2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strC3 != null ? PropertyValuesHolder.ofFloat(strC3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                } catch (RuntimeException e3) {
                    throw new RuntimeException("Error in parsing ".concat(strC), e3);
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayH;
                i3 = 0;
                objectAnimator2.setPropertyName(p060s.b.c(typedArrayH2, xmlResourceParser, "propertyName", 0));
            }
            if (p060s.b.e(xmlResourceParser, "interpolator")) {
                typedArray2 = typedArray;
                resourceId = typedArray2.getResourceId(i3, i3);
            } else {
                typedArray2 = typedArray;
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArray2.recycle();
            if (typedArrayH2 != null) {
                typedArrayH2.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        typedArray = typedArrayH;
        i3 = 0;
        if (p060s.b.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = 0;
        } else {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i3, i3);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayH2 != null) {
            typedArrayH2.recycle();
        }
        return valueAnimator2;
    }
}
