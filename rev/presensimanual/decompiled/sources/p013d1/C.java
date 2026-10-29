package p013d1;

import I1.AbstractActivityC0028d;
import W1.w;
import W1.x;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static ArrayList a(AbstractActivityC0028d abstractActivityC0028d) throws CameraAccessException {
        int i3;
        CameraManager cameraManager = (CameraManager) abstractActivityC0028d.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            try {
                i3 = Integer.parseInt(str, 10);
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            if (i3 >= 0) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                int iIntValue2 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                x xVar = x.FRONT;
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        xVar = x.BACK;
                    } else if (iIntValue2 == 2) {
                        xVar = x.EXTERNAL;
                    }
                }
                Long lValueOf = Long.valueOf(iIntValue);
                w wVar = new w();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                wVar.f1791a = str;
                wVar.f1792b = xVar;
                wVar.f1793c = lValueOf;
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }
}
