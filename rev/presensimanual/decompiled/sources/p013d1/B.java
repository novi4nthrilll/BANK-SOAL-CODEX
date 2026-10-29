package p013d1;

import M.j;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static MeteringRectangle a(Size size, double d3, double d4, int i3) {
        double d5;
        double d6;
        int iB = j.b(i3);
        if (iB == 0) {
            d5 = 1.0d - d3;
            d6 = d4;
        } else if (iB == 1) {
            d6 = 1.0d - d4;
            d5 = d3;
        } else if (iB != 3) {
            d6 = d3;
            d5 = d4;
        } else {
            d6 = 1.0d - d3;
            d5 = 1.0d - d4;
        }
        int iRound = (int) Math.round(d6 * ((double) (size.getWidth() - 1)));
        int iRound2 = (int) Math.round(d5 * ((double) (size.getHeight() - 1)));
        int iRound3 = (int) Math.round(((double) size.getWidth()) / 10.0d);
        int iRound4 = (int) Math.round(((double) size.getHeight()) / 10.0d);
        int i4 = iRound - (iRound3 / 2);
        int i5 = iRound2 - (iRound4 / 2);
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int width = (size.getWidth() - 1) - iRound3;
        int height = (size.getHeight() - 1) - iRound4;
        if (i4 > width) {
            i4 = width;
        }
        if (i5 > height) {
            i5 = height;
        }
        return new MeteringRectangle(i4, i5, iRound3, iRound4, 1);
    }
}
