package p075y;

import D0.d;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p013d1.I;
import p060s.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5839a = new a();

    public static A.c a(Context context, d dVar) throws PackageManager.NameNotFoundException {
        Cursor cursorD;
        b yVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) dVar.e;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(I.g("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) dVar.f190f;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        a aVar = f5839a;
        Collections.sort(arrayList, aVar);
        List listJ = (List) dVar.f192h;
        if (listJ == null) {
            listJ = b.j(resources, 0);
        }
        int i3 = 0;
        loop1: while (true) {
            cursorD = null;
            if (i3 >= listJ.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listJ.get(i3));
            Collections.sort(arrayList2, aVar);
            if (arrayList.size() == arrayList2.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                    i4++;
                }
            }
            i3++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new A.c(1, (Object[]) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        if (Build.VERSION.SDK_INT < 24) {
            p006b1.c cVar = new p006b1.c();
            cVar.f2515d = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            yVar = cVar;
        } else {
            yVar = new y(context, uriBuild);
        }
        try {
            cursorD = yVar.d(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) dVar.f191g});
            if (cursorD != null && cursorD.getCount() > 0) {
                int columnIndex = cursorD.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorD.getColumnIndex("_id");
                int columnIndex3 = cursorD.getColumnIndex("file_id");
                int columnIndex4 = cursorD.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorD.getColumnIndex("font_weight");
                int columnIndex6 = cursorD.getColumnIndex("font_italic");
                while (cursorD.moveToNext()) {
                    arrayList3.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorD.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorD.getLong(columnIndex3)), columnIndex4 != -1 ? cursorD.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorD.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorD.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorD.getInt(columnIndex) : 0));
                }
            }
            return new A.c(0, (h[]) arrayList3.toArray(new h[0]));
        } finally {
            if (cursorD != null) {
                cursorD.close();
            }
            yVar.close();
        }
    }
}
