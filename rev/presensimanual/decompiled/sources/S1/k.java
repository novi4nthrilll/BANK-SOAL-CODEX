package S1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p013d1.AbstractC0558z;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f1593a = new k();

    @Override // S1.n
    public ByteBuffer a(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(AbstractC0558z.a(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC0558z.a(jSONArrayPut);
        if (objA instanceof String) {
            t tVar = t.f1599b;
            String strQuote = JSONObject.quote((String) objA);
            tVar.getClass();
            return t.d(strQuote);
        }
        t tVar2 = t.f1599b;
        String string = objA.toString();
        tVar2.getClass();
        return t.d(string);
    }

    @Override // S1.n
    public A0.g b(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    t.f1599b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Invalid JSON", e);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (objNextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objNextValue;
            Object obj2 = jSONObject.get("method");
            Object objOpt = jSONObject.opt("args");
            if (objOpt != JSONObject.NULL) {
                obj = objOpt;
            }
            if (obj2 instanceof String) {
                return new A0.g(26, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + objNextValue);
    }

    @Override // S1.n
    public Object c(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    t.f1599b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Invalid JSON", e);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (objNextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objNextValue;
            if (jSONArray.length() == 1) {
                Object objOpt = jSONArray.opt(0);
                if (objOpt == JSONObject.NULL) {
                    return null;
                }
                return objOpt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object objOpt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (objOpt2 == obj3) {
                    objOpt2 = null;
                }
                Object objOpt3 = jSONArray.opt(2);
                if (objOpt3 != obj3) {
                    obj = objOpt3;
                }
                if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                    throw new i((String) obj2, (String) objOpt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
    }

    @Override // S1.n
    public ByteBuffer d(A0.g gVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) gVar.e);
            jSONObject.put("args", AbstractC0558z.a(gVar.f19f));
            Object objA = AbstractC0558z.a(jSONObject);
            if (objA instanceof String) {
                t tVar = t.f1599b;
                String strQuote = JSONObject.quote((String) objA);
                tVar.getClass();
                return t.d(strQuote);
            }
            t tVar2 = t.f1599b;
            String string = objA.toString();
            tVar2.getClass();
            return t.d(string);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // S1.n
    public ByteBuffer e(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(AbstractC0558z.a(str)).put(JSONObject.NULL).put(AbstractC0558z.a(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC0558z.a(jSONArrayPut);
        if (objA instanceof String) {
            t tVar = t.f1599b;
            String strQuote = JSONObject.quote((String) objA);
            tVar.getClass();
            return t.d(strQuote);
        }
        t tVar2 = t.f1599b;
        String string = objA.toString();
        tVar2.getClass();
        return t.d(string);
    }

    @Override // S1.n
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(AbstractC0558z.a(str2)).put(AbstractC0558z.a(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC0558z.a(jSONArrayPut);
        if (objA instanceof String) {
            t tVar = t.f1599b;
            String strQuote = JSONObject.quote((String) objA);
            tVar.getClass();
            return t.d(strQuote);
        }
        t tVar2 = t.f1599b;
        String string = objA.toString();
        tVar2.getClass();
        return t.d(string);
    }
}
