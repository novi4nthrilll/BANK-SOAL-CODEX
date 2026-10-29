package R1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1510d;
    public final int e;

    public o(String str, int i3, int i4, int i5, int i6) {
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
        }
        if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
        }
        if (i6 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
        }
        this.f1507a = str;
        this.f1508b = i3;
        this.f1509c = i4;
        this.f1510d = i5;
        this.e = i6;
    }

    public static o a(JSONObject jSONObject) {
        return new o(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
