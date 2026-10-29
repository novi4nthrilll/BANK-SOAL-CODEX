package p013d1;

import android.location.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: d1.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425c3 {
    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Address address = (Address) it.next();
            HashMap map = new HashMap();
            String addressLine = address.getAddressLine(0);
            String strNextToken = null;
            if (addressLine != null && !addressLine.isEmpty()) {
                StringTokenizer stringTokenizer = new StringTokenizer(addressLine, ",", false);
                if (stringTokenizer.hasMoreTokens()) {
                    strNextToken = stringTokenizer.nextToken();
                }
            }
            map.put("name", address.getFeatureName());
            map.put("street", strNextToken);
            map.put("isoCountryCode", address.getCountryCode());
            map.put("country", address.getCountryName());
            map.put("thoroughfare", address.getThoroughfare());
            map.put("subThoroughfare", address.getSubThoroughfare());
            map.put("postalCode", address.getPostalCode());
            map.put("administrativeArea", address.getAdminArea());
            map.put("subAdministrativeArea", address.getSubAdminArea());
            map.put("locality", address.getLocality());
            map.put("subLocality", address.getSubLocality());
            arrayList.add(map);
        }
        return arrayList;
    }
}
