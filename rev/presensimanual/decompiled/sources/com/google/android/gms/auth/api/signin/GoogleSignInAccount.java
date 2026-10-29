package com.google.android.gms.auth.api.signin;

import G.i;
import O0.u;
import P0.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2695d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f2696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f2703m = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2692a = i3;
        this.f2693b = str;
        this.f2694c = str2;
        this.f2695d = str3;
        this.e = str4;
        this.f2696f = uri;
        this.f2697g = str5;
        this.f2698h = j3;
        this.f2699i = str6;
        this.f2700j = arrayList;
        this.f2701k = str7;
        this.f2702l = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j3 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        u.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j3, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2697g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f2699i.equals(this.f2699i)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f2700j);
            hashSet.addAll(googleSignInAccount.f2703m);
            HashSet hashSet2 = new HashSet(this.f2700j);
            hashSet2.addAll(this.f2703m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2699i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2700j);
        hashSet.addAll(this.f2703m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2692a);
        AbstractC0522t.c(parcel, 2, this.f2693b);
        AbstractC0522t.c(parcel, 3, this.f2694c);
        AbstractC0522t.c(parcel, 4, this.f2695d);
        AbstractC0522t.c(parcel, 5, this.e);
        AbstractC0522t.b(parcel, 6, this.f2696f, i3);
        AbstractC0522t.c(parcel, 7, this.f2697g);
        AbstractC0522t.h(parcel, 8, 8);
        parcel.writeLong(this.f2698h);
        AbstractC0522t.c(parcel, 9, this.f2699i);
        AbstractC0522t.e(parcel, 10, this.f2700j);
        AbstractC0522t.c(parcel, 11, this.f2701k);
        AbstractC0522t.c(parcel, 12, this.f2702l);
        AbstractC0522t.g(parcel, iF);
    }
}
