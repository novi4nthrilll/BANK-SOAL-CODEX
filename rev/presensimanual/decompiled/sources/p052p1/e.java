package p052p1;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n1.b;
import n1.c;
import n1.d;
import n1.f;
import n1.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n1.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5553a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f5554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f5556d;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5557f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z2) {
        this.f5554b = new JsonWriter(writer);
        this.f5555c = map;
        this.f5556d = map2;
        this.e = aVar;
        this.f5557f = z2;
    }

    @Override // n1.g
    public final g a(String str) throws IOException {
        g();
        this.f5554b.value(str);
        return this;
    }

    @Override // n1.g
    public final g b(boolean z2) throws IOException {
        g();
        this.f5554b.value(z2);
        return this;
    }

    @Override // n1.e
    public final n1.e c(c cVar, Object obj) throws IOException {
        f(obj, cVar.f5393a);
        return this;
    }

    @Override // n1.e
    public final n1.e d(c cVar, long j3) throws IOException {
        String str = cVar.f5393a;
        g();
        JsonWriter jsonWriter = this.f5554b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j3);
        return this;
    }

    public final e e(Object obj) throws IOException {
        int i3 = 0;
        JsonWriter jsonWriter = this.f5554b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            d dVar = (d) this.f5555c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f5556d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i3 < length) {
                jsonWriter.value(iArr[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                long j3 = jArr[i3];
                g();
                jsonWriter.value(j3);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                jsonWriter.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                jsonWriter.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                e(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) throws IOException {
        boolean z2 = this.f5557f;
        JsonWriter jsonWriter = this.f5554b;
        if (z2) {
            if (obj != null) {
                g();
                jsonWriter.name(str);
                e(obj);
            }
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            e(obj);
        }
        return this;
    }

    public final void g() {
        if (!this.f5553a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
