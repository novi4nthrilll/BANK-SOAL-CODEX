package S1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p013d1.AbstractC0558z;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1592a = new j();

    @Override // S1.l
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            t.f1599b.getClass();
            JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // S1.l
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objA = AbstractC0558z.a(obj);
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
