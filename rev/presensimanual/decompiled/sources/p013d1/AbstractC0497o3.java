package p013d1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p060s.f;
import p071w1.b;
import p075y.h;

/* JADX INFO: renamed from: d1.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497o3 {
    public AbstractC0497o3() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, f fVar, Resources resources, int i3);

    public abstract Typeface b(Context context, h[] hVarArr, int i3);

    public Typeface c(Context context, InputStream inputStream) {
        File fileD = AbstractC0503p3.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (AbstractC0503p3.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i3, String str, int i4) {
        File fileD = AbstractC0503p3.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (AbstractC0503p3.b(fileD, resources, i3)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public h e(h[] hVarArr, int i3) {
        new b(9);
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z2 = (i3 & 2) != 0;
        h hVar = null;
        int i5 = Integer.MAX_VALUE;
        for (h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f5854c - i4) * 2) + (hVar2.f5855d == z2 ? 0 : 1);
            if (hVar == null || i5 > iAbs) {
                hVar = hVar2;
                i5 = iAbs;
            }
        }
        return hVar;
    }
}
