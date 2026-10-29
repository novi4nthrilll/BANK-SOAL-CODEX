package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final n reflectionAccessors = new n();
    private final SparseArray<o> flutterIdToOrigin = new SparseArray<>();
    private final Map<o, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l3;
        int iIntValue;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            n nVar = this.reflectionAccessors;
            Method method = nVar.f4859f;
            Long l4 = null;
            Field field = nVar.e;
            Method method2 = nVar.f4858d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l3 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i3));
                    } catch (IllegalAccessException e) {
                        Log.w(TAG, "Failed to access getChildId method.", e);
                    } catch (InvocationTargetException e3) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e3);
                    }
                } else {
                    try {
                        l3 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i3));
                        l3.getClass();
                    } catch (ArrayIndexOutOfBoundsException e4) {
                        e = e4;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    } catch (IllegalAccessException e5) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e5);
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    }
                }
                l4 = l3;
            }
            if (l4 != null) {
                int iLongValue = (int) (l4.longValue() >> 32);
                o oVar = new o(view, iLongValue);
                if (this.originToFlutterId.containsKey(oVar)) {
                    iIntValue = this.originToFlutterId.get(oVar).intValue();
                } else {
                    iIntValue = this.nextFlutterId;
                    this.nextFlutterId = iIntValue + 1;
                    cacheVirtualIdMappings(view, iLongValue, iIntValue);
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i3, int i4) {
        o oVar = new o(view, i3);
        this.originToFlutterId.put(oVar, Integer.valueOf(i4));
        this.flutterIdToOrigin.put(i4, oVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i3);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (i3 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i3 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l3;
        Parcel parcelObtain;
        long j3;
        Method method = this.reflectionAccessors.f4856b;
        Long lValueOf = null;
        if (method != null) {
            try {
                l3 = (Long) method.invoke(accessibilityNodeInfo, null);
                l3.getClass();
            } catch (IllegalAccessException e) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e);
                if (Build.VERSION.SDK_INT < 26) {
                    Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    parcelObtain = Parcel.obtain();
                    parcelObtain.setDataPosition(0);
                    accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    j3 = parcelObtain.readLong();
                    if (n.b(j3, 0)) {
                        parcelObtain.readInt();
                    }
                    if (n.b(j3, 1)) {
                        parcelObtain.readLong();
                    }
                    if (n.b(j3, 2)) {
                        parcelObtain.readInt();
                    }
                    lValueOf = n.b(j3, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
                    parcelObtain.recycle();
                }
                l3 = lValueOf;
            } catch (InvocationTargetException e3) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e3);
                if (Build.VERSION.SDK_INT < 26) {
                    Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    parcelObtain = Parcel.obtain();
                    parcelObtain.setDataPosition(0);
                    accessibilityNodeInfoObtain2.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    j3 = parcelObtain.readLong();
                    if (n.b(j3, 0)) {
                        parcelObtain.readInt();
                    }
                    if (n.b(j3, 1)) {
                        parcelObtain.readLong();
                    }
                    if (n.b(j3, 2)) {
                        parcelObtain.readInt();
                    }
                    if (n.b(j3, 3)) {
                    }
                    parcelObtain.recycle();
                }
                l3 = lValueOf;
            }
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain3 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                parcelObtain = Parcel.obtain();
                parcelObtain.setDataPosition(0);
                accessibilityNodeInfoObtain3.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                j3 = parcelObtain.readLong();
                if (n.b(j3, 0)) {
                    parcelObtain.readInt();
                }
                if (n.b(j3, 1)) {
                    parcelObtain.readLong();
                }
                if (n.b(j3, 2)) {
                    parcelObtain.readInt();
                }
                if (n.b(j3, 3)) {
                }
                parcelObtain.recycle();
            }
            l3 = lValueOf;
        }
        if (l3 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new o(view, (int) (l3.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        o oVar = this.flutterIdToOrigin.get(i3);
        if (oVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = oVar.f4860a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(oVar.f4861b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i3, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lA = n.a(this.reflectionAccessors, accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new o(view, (int) (lA.longValue() >> 32)));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i3, Rect rect) {
        Long l3;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f4855a;
        if (method == null) {
            l3 = null;
        } else {
            try {
                l3 = (Long) method.invoke(accessibilityNodeInfoCreateAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e);
                l3 = null;
            } catch (InvocationTargetException e3) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e3);
                l3 = null;
            }
        }
        if (l3 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, (int) (l3.longValue() >> 32), i3);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i3, view);
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        o oVar = this.flutterIdToOrigin.get(i3);
        if (oVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = oVar.f4860a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i4] = pointerProperties;
            motionEvent.getPointerProperties(i4, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i4, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i4] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        o oVar = this.flutterIdToOrigin.get(i3);
        if (oVar == null || (accessibilityNodeProvider = oVar.f4860a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(oVar.f4861b, i4, bundle);
    }

    public View platformViewOfNode(int i3) {
        o oVar = this.flutterIdToOrigin.get(i3);
        if (oVar == null) {
            return null;
        }
        return oVar.f4860a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = n.a(this.reflectionAccessors, accessibilityEvent);
        if (lA == null) {
            return false;
        }
        int iLongValue = (int) (lA.longValue() >> 32);
        Integer num = this.originToFlutterId.get(new o(view, iLongValue));
        if (num == null) {
            int i3 = this.nextFlutterId;
            this.nextFlutterId = i3 + 1;
            Integer numValueOf = Integer.valueOf(i3);
            cacheVirtualIdMappings(view, iLongValue, i3);
            num = numValueOf;
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i4 = 0; i4 < accessibilityEventObtain.getRecordCount(); i4++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i4);
            Long lA2 = n.a(this.reflectionAccessors, record);
            if (lA2 == null) {
                return false;
            }
            o oVar = new o(view, (int) (lA2.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(oVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(oVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
