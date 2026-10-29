package D0;

import B.C0006g;
import E0.n;
import F0.g;
import F0.i;
import I1.p;
import I1.x;
import I1.y;
import I1.z;
import L2.l;
import M1.f;
import S1.h;
import S1.r;
import S1.s;
import Y.AbstractC0106a;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k.C0757u;
import org.xmlpull.v1.XmlPullParserException;
import p009c1.v;
import p013d1.G2;
import p016e1.d5;
import p029i0.j;
import p039l0.k;
import p046n2.C0774f;
import p046n2.C0776h;
import p046n2.InterfaceC0775g;
import p046n2.J;
import p046n2.K;
import p046n2.L;
import p046n2.N;
import p060s.m;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class b implements G0.b, B0.b, g, S1.d, InterfaceC0775g, L2.d, h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f180h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f183g;

    public /* synthetic */ b(int i3, boolean z2) {
        this.f181d = i3;
    }

    public static b J() {
        if (f180h == null) {
            p067u1.a aVar = new p067u1.a();
            H1.a aVar2 = new H1.a();
            aVar2.f329a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(aVar2);
            FlutterJNI flutterJNI = new FlutterJNI();
            f fVar = new f();
            fVar.f989a = false;
            fVar.e = flutterJNI;
            fVar.f993f = executorServiceNewCachedThreadPool;
            b bVar = new b(4, false);
            bVar.e = fVar;
            bVar.f182f = aVar;
            bVar.f183g = executorServiceNewCachedThreadPool;
            f180h = bVar;
        }
        return f180h;
    }

    public static void K(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static b L(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new b(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public int A(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f183g;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0106a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList B(int i3) {
        int resourceId;
        ColorStateList colorStateListA;
        TypedArray typedArray = (TypedArray) this.f182f;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (colorStateListA = G2.a((Context) this.e, resourceId)) == null) ? typedArray.getColorStateList(i3) : colorStateListA;
    }

    public Drawable C(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f182f;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : G2.b((Context) this.e, resourceId);
    }

    public Typeface D(int i3, int i4, C0757u c0757u) {
        int i5 = 7;
        int resourceId = ((TypedArray) this.f182f).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f183g) == null) {
            this.f183g = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f183g;
        ThreadLocal threadLocal = m.f5652a;
        Context context = (Context) this.e;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            c0757u.a();
            return null;
        }
        int i6 = typedValue.assetCookie;
        p045n.f fVar = p064t.g.f5680b;
        Typeface typeface = (Typeface) fVar.a(p064t.g.b(resources, resourceId, string, i6, i4));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new W.g(i5, c0757u, typeface));
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                p060s.e eVarI = p060s.b.i(resources.getXml(resourceId), resources);
                if (eVarI != null) {
                    return p064t.g.a(context, eVarI, resources, resourceId, string, typedValue.assetCookie, i4, c0757u);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                c0757u.a();
                return null;
            }
            int i7 = typedValue.assetCookie;
            Typeface typefaceD = p064t.g.f5679a.d(context, resources, resourceId, string, i4);
            if (typefaceD != null) {
                fVar.b(p064t.g.b(resources, resourceId, string, i7, i4), typefaceD);
            }
            if (typefaceD != null) {
                new Handler(Looper.getMainLooper()).post(new W.g(i5, c0757u, typefaceD));
            } else {
                c0757u.a();
            }
            return typefaceD;
        } catch (IOException e) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
            c0757u.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
            c0757u.a();
            return null;
        }
    }

    public p079z0.g E(p070w0.b bVar, p070w0.d dVar) {
        Set set = (Set) this.e;
        if (set.contains(bVar)) {
            return new p079z0.g((p079z0.b) this.f182f, bVar, dVar, (p079z0.h) this.f183g);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }

    public View F(int i3) {
        return ((RecyclerView) ((C0006g) this.e).e).getChildAt(i3);
    }

    public int G() {
        return ((RecyclerView) ((C0006g) this.e).e).getChildCount();
    }

    public File H(Context context) {
        ((p065t0.e) this.f182f).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public boolean I(KeyEvent keyEvent) {
        if (((HashSet) this.f182f).remove(keyEvent)) {
            return false;
        }
        y[] yVarArr = (y[]) this.e;
        if (yVarArr.length <= 0) {
            M(keyEvent);
            return true;
        }
        x xVar = new x(this, keyEvent);
        for (y yVar : yVarArr) {
            yVar.c(keyEvent, new C1.h(xVar));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    public void M(KeyEvent keyEvent) {
        io.flutter.plugin.editing.b bVar;
        io.flutter.plugin.editing.e eVar;
        int selectionStart;
        int selectionEnd;
        int unicodeChar;
        int iMin;
        int iMax;
        z zVar = (z) this.f183g;
        if (zVar != null) {
            p pVar = (p) zVar;
            io.flutter.plugin.editing.h hVar = pVar.f401n;
            boolean zE = false;
            if (hVar.f4692b.isAcceptingText() && (bVar = hVar.f4699j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    zE = bVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    zE = bVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    zE = bVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    zE = bVar.e(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                    EditorInfo editorInfo = bVar.e;
                    if ((editorInfo.inputType & 131072) == 0) {
                        bVar.performEditorAction(editorInfo.imeOptions & 255);
                    } else {
                        eVar = bVar.f4658d;
                        selectionStart = Selection.getSelectionStart(eVar);
                        selectionEnd = Selection.getSelectionEnd(eVar);
                        unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            iMin = Math.min(selectionStart, selectionEnd);
                            iMax = Math.max(selectionStart, selectionEnd);
                            bVar.beginBatchEdit();
                            if (iMin != iMax) {
                                eVar.delete(iMin, iMax);
                            }
                            eVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                            int i3 = iMin + 1;
                            bVar.setSelection(i3, i3);
                            bVar.endBatchEdit();
                        }
                    }
                    zE = true;
                } else {
                    eVar = bVar.f4658d;
                    selectionStart = Selection.getSelectionStart(eVar);
                    selectionEnd = Selection.getSelectionEnd(eVar);
                    unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0) {
                        iMin = Math.min(selectionStart, selectionEnd);
                        iMax = Math.max(selectionStart, selectionEnd);
                        bVar.beginBatchEdit();
                        if (iMin != iMax) {
                            eVar.delete(iMin, iMax);
                        }
                        eVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                        int i4 = iMin + 1;
                        bVar.setSelection(i4, i4);
                        bVar.endBatchEdit();
                        zE = true;
                    }
                }
            }
            if (zE) {
                return;
            }
            HashSet hashSet = (HashSet) this.f182f;
            hashSet.add(keyEvent);
            pVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void N(Activity activity, j jVar) {
        B2.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f182f;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f183g;
        try {
            if (jVar.equals((j) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (p039l0.j jVar2 : ((k) ((p006b1.c) this.e).f2515d).f5299b) {
                if (jVar2.f5293a.equals(activity)) {
                    jVar2.f5295c = jVar;
                    jVar2.f5294b.accept(jVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void O() {
        ((TypedArray) this.f182f).recycle();
    }

    public void P(ArrayList arrayList) {
        Object[] objArr;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0106a abstractC0106a = (AbstractC0106a) arrayList.get(i3);
            abstractC0106a.getClass();
            A.c cVar = (A.c) this.e;
            cVar.getClass();
            B2.h.e(abstractC0106a, "instance");
            int i4 = cVar.f2a;
            int i5 = 0;
            while (true) {
                objArr = (Object[]) cVar.f3b;
                if (i5 < i4) {
                    if (objArr[i5] == abstractC0106a) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i5++;
                }
            }
            int i6 = cVar.f2a;
            if (i6 < objArr.length) {
                objArr[i6] = abstractC0106a;
                cVar.f2a = i6 + 1;
            }
        }
        arrayList.clear();
    }

    public void Q(String str) {
        ((Handler) this.e).post(new W.g(4, this, str));
    }

    public void R(h hVar) {
        ((S1.f) this.e).e((String) this.f182f, hVar == null ? null : new b(this, hVar));
    }

    public void S(String str, float f3) {
        String strValueOf = String.valueOf(f3);
        d5 d5Var = new d5(18, false);
        ((b) this.f183g).f183g = d5Var;
        this.f183g = d5Var;
        d5Var.f182f = strValueOf;
        d5Var.e = str;
    }

    public void T(String str, int i3) {
        String strValueOf = String.valueOf(i3);
        d5 d5Var = new d5(18, false);
        ((b) this.f183g).f183g = d5Var;
        this.f183g = d5Var;
        d5Var.f182f = strValueOf;
        d5Var.e = str;
    }

    public void U(Object obj, String str) {
        b bVar = new b(18, false);
        ((b) this.f183g).f183g = bVar;
        this.f183g = bVar;
        bVar.f182f = obj;
        bVar.e = str;
    }

    @Override // p046n2.InterfaceC0775g
    public Boolean a(String str, C0776h c0776h) {
        SharedPreferences sharedPreferencesW = w(c0776h);
        if (sharedPreferencesW.contains(str)) {
            return Boolean.valueOf(sharedPreferencesW.getBoolean(str, true));
        }
        return null;
    }

    @Override // F0.g
    public Object apply(Object obj) {
        long jInsert;
        switch (this.f181d) {
            case 2:
                Cursor cursor = (Cursor) obj;
                p070w0.b bVar = i.f262h;
                while (cursor.moveToNext()) {
                    long j3 = cursor.getLong(0);
                    boolean z2 = cursor.getInt(7) != 0;
                    E0.k kVar = new E0.k();
                    kVar.f230i = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    kVar.f226d = string;
                    kVar.f228g = Long.valueOf(cursor.getLong(2));
                    kVar.f229h = Long.valueOf(cursor.getLong(3));
                    if (z2) {
                        String string2 = cursor.getString(4);
                        kVar.f227f = new p079z0.e(string2 == null ? i.f262h : new p070w0.b(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        kVar.f227f = new p079z0.e(string3 == null ? i.f262h : new p070w0.b(string3), (byte[]) i.g(((i) this.e).a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num"), F0.f.e));
                    }
                    if (!cursor.isNull(6)) {
                        kVar.e = Integer.valueOf(cursor.getInt(6));
                    }
                    ((ArrayList) this.f183g).add(new F0.b(j3, (p079z0.b) this.f182f, kVar.c()));
                }
                return null;
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                p070w0.b bVar2 = i.f262h;
                i iVar = (i) this.e;
                long jSimpleQueryForLong = iVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                F0.a aVar = iVar.f265g;
                if (jSimpleQueryForLong >= aVar.f248a) {
                    return -1L;
                }
                p079z0.b bVar3 = (p079z0.b) this.f182f;
                Long lB = i.b(sQLiteDatabase, bVar3);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", bVar3.f5936a);
                    contentValues.put("priority", Integer.valueOf(I0.a.a(bVar3.f5938c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = bVar3.f5937b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                p079z0.a aVar2 = (p079z0.a) this.f183g;
                p079z0.e eVar = aVar2.f5933c;
                byte[] bArr2 = eVar.f5944b;
                int length = bArr2.length;
                int i3 = aVar.e;
                boolean z3 = length <= i3;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", aVar2.f5931a);
                contentValues2.put("timestamp_ms", Long.valueOf(aVar2.f5934d));
                contentValues2.put("uptime_ms", Long.valueOf(aVar2.e));
                contentValues2.put("payload_encoding", eVar.f5943a.f5773a);
                contentValues2.put("code", aVar2.f5932b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i3));
                    for (int i4 = 1; i4 <= iCeil; i4++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i4 - 1) * i3, Math.min(i4 * i3, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i4));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(aVar2.f5935f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
        }
    }

    @Override // S1.h
    public void c(Object obj, S1.g gVar) {
        if (((Context) this.f182f) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        p065t0.i iVar = new p065t0.i(gVar);
        this.f183g = iVar;
        Context context = (Context) this.f182f;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            p056r.d.a(context, iVar, intentFilter, null, null, 2);
        } else if (i3 >= 26) {
            p056r.b.a(context, iVar, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(iVar, intentFilter, null, null);
        }
    }

    @Override // p046n2.InterfaceC0775g
    public String d(String str, C0776h c0776h) {
        SharedPreferences sharedPreferencesW = w(c0776h);
        if (sharedPreferencesW.contains(str)) {
            return sharedPreferencesW.getString(str, "");
        }
        return null;
    }

    @Override // p046n2.InterfaceC0775g
    public void e(String str, String str2, C0776h c0776h) {
        w(c0776h).edit().putString(str, str2).apply();
    }

    @Override // p046n2.InterfaceC0775g
    public void f(String str, double d3, C0776h c0776h) {
        w(c0776h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // p046n2.InterfaceC0775g
    public void g(List list, C0776h c0776h) {
        SharedPreferences sharedPreferencesW = w(c0776h);
        SharedPreferences.Editor editorEdit = sharedPreferencesW.edit();
        B2.h.d(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesW.getAll();
        B2.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (K.b(str, all.get(str), list != null ? p059r2.d.i(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        B2.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            B2.h.d(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    @Override // p053p2.a
    public Object get() {
        switch (this.f181d) {
            case 1:
                return new E0.d((Context) ((A0.f) this.e).e, (F0.c) ((p053p2.a) this.f182f).get(), (E0.b) ((L0.g) this.f183g).get());
            default:
                return new p079z0.h(new p065t0.e(), new v(), (e) ((d) this.e).get(), (E0.j) ((E0.k) this.f182f).get(), (E0.m) ((n) this.f183g).get());
        }
    }

    @Override // p046n2.InterfaceC0775g
    public ArrayList h(String str, C0776h c0776h) {
        List list;
        SharedPreferences sharedPreferencesW = w(c0776h);
        ArrayList arrayList = null;
        if (sharedPreferencesW.contains(str)) {
            String string = sharedPreferencesW.getString(str, "");
            B2.h.b(string);
            if (H2.i.h(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !H2.i.h(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) K.c(sharedPreferencesW.getString(str, ""), (p065t0.e) this.f183g)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // p046n2.InterfaceC0775g
    public Map i(List list, C0776h c0776h) {
        Object value;
        Map<String, ?> all = w(c0776h).getAll();
        B2.h.d(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (K.b(entry.getKey(), entry.getValue(), list != null ? p059r2.d.i(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = K.c(value, (p065t0.e) this.f183g);
                B2.h.c(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // p046n2.InterfaceC0775g
    public void j(String str, long j3, C0776h c0776h) {
        w(c0776h).edit().putLong(str, j3).apply();
    }

    public void k(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f182f;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f183g).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // S1.d
    public void l(ByteBuffer byteBuffer, K1.g gVar) {
        b bVar = (b) this.f183g;
        A0.g gVarB = ((s) bVar.f183g).b(byteBuffer);
        String str = (String) gVarB.e;
        boolean zEquals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f182f;
        Object obj = gVarB.f19f;
        String str2 = (String) bVar.f182f;
        s sVar = (s) bVar.f183g;
        h hVar = (h) this.e;
        if (!zEquals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((S1.g) atomicReference.getAndSet(null)) == null) {
                gVar.a(sVar.f("error", "No active stream to cancel", null));
                return;
            }
            try {
                hVar.p();
                gVar.a(sVar.a(null));
                return;
            } catch (RuntimeException e) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e);
                gVar.a(sVar.f("error", e.getMessage(), null));
                return;
            }
        }
        S1.g gVar2 = new S1.g(this);
        if (((S1.g) atomicReference.getAndSet(gVar2)) != null) {
            try {
                hVar.p();
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e3);
            }
        }
        try {
            hVar.c(obj, gVar2);
            gVar.a(sVar.a(null));
        } catch (RuntimeException e4) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e4);
            gVar.a(sVar.f("error", e4.getMessage(), null));
        }
    }

    @Override // p046n2.InterfaceC0775g
    public void m(String str, List list, C0776h c0776h) {
        w(c0776h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((p065t0.e) this.f183g).d(list))).apply();
    }

    @Override // G0.b
    public Object n() {
        c cVar = (c) this.e;
        i iVar = (i) cVar.f188d;
        iVar.getClass();
        p079z0.b bVar = (p079z0.b) this.f182f;
        p079z0.a aVar = (p079z0.a) this.f183g;
        Log.d("TransportRuntime.".concat("SQLiteEventStore"), "Storing event with priority=" + bVar.f5938c + ", name=" + aVar.f5931a + " for destination " + bVar.f5936a);
        ((Long) iVar.c(new b(iVar, bVar, aVar, 3))).getClass();
        cVar.f185a.a(bVar, 1, false);
        return null;
    }

    @Override // p046n2.InterfaceC0775g
    public Double o(String str, C0776h c0776h) {
        SharedPreferences sharedPreferencesW = w(c0776h);
        if (!sharedPreferencesW.contains(str)) {
            return null;
        }
        Object objC = K.c(sharedPreferencesW.getString(str, ""), (p065t0.e) this.f183g);
        B2.h.c(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
    }

    @Override // S1.h
    public void p() {
        p065t0.i iVar;
        Context context = (Context) this.f182f;
        if (context == null || (iVar = (p065t0.i) this.f183g) == null) {
            return;
        }
        context.unregisterReceiver(iVar);
    }

    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) {
        Object objQ = ((L2.d) this.e).q(new l(eVar, (N.e) this.f182f, (J) this.f183g), dVar);
        return objQ == t2.a.f5737d ? objQ : p055q2.g.f5603a;
    }

    @Override // p046n2.InterfaceC0775g
    public N r(String str, C0776h c0776h) {
        SharedPreferences sharedPreferencesW = w(c0776h);
        if (!sharedPreferencesW.contains(str)) {
            return null;
        }
        String string = sharedPreferencesW.getString(str, "");
        B2.h.b(string);
        if (H2.i.h(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(string, L.JSON_ENCODED);
        }
        return H2.i.h(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.PLATFORM_ENCODED) : new N(null, L.UNEXPECTED_STRING);
    }

    @Override // p046n2.InterfaceC0775g
    public Long s(String str, C0776h c0776h) {
        long j3;
        SharedPreferences sharedPreferencesW = w(c0776h);
        if (!sharedPreferencesW.contains(str)) {
            return null;
        }
        try {
            j3 = sharedPreferencesW.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j3 = sharedPreferencesW.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    @Override // p046n2.InterfaceC0775g
    public void t(String str, boolean z2, C0776h c0776h) {
        w(c0776h).edit().putBoolean(str, z2).apply();
    }

    public String toString() {
        switch (this.f181d) {
            case 15:
                return ((F0.e) this.f182f).toString() + ", hidden list:" + ((ArrayList) this.f183g).size();
            case 19:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.e);
                sb.append('{');
                b bVar = (b) ((b) this.f182f).f183g;
                String str = "";
                while (bVar != null) {
                    Object obj = bVar.f182f;
                    sb.append(str);
                    String str2 = (String) bVar.e;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    bVar = (b) bVar.f183g;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p046n2.InterfaceC0775g
    public List u(List list, C0776h c0776h) {
        Map<String, ?> all = w(c0776h).getAll();
        B2.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            B2.h.d(key, "<get-key>(...)");
            if (K.b(key, entry.getValue(), list != null ? p059r2.d.i(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return p059r2.d.g(linkedHashMap.keySet());
    }

    @Override // p046n2.InterfaceC0775g
    public void v(String str, String str2, C0776h c0776h) {
        w(c0776h).edit().putString(str, str2).apply();
    }

    public SharedPreferences w(C0776h c0776h) {
        String str = c0776h.f5446a;
        Context context = (Context) this.f182f;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            B2.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        B2.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void x(int i3, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f182f).dispatchSemanticsAction(i3, fVar);
    }

    public void y(int i3, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f182f).dispatchSemanticsAction(i3, fVar, serializable);
    }

    public void z(W1.s sVar, String str, String str2) {
        ((Handler) this.e).post(new O.j(sVar, str, str2, 1));
    }

    public b(i iVar, ArrayList arrayList, p079z0.b bVar) {
        this.f181d = 2;
        this.e = iVar;
        this.f183g = arrayList;
        this.f182f = bVar;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i3) {
        this.f181d = i3;
        this.e = obj;
        this.f182f = obj2;
        this.f183g = obj3;
    }

    public /* synthetic */ b(String str) {
        this.f181d = 19;
        b bVar = new b(18, false);
        this.f182f = bVar;
        this.f183g = bVar;
        this.e = str;
    }

    public b(C0006g c0006g) {
        this.f181d = 15;
        this.e = c0006g;
        this.f182f = new F0.e();
        this.f183g = new ArrayList();
    }

    public b(S1.f fVar, String str) {
        this.f181d = 12;
        s sVar = s.f1597a;
        this.e = fVar;
        this.f182f = str;
        this.f183g = sVar;
    }

    public b(Context context, TypedArray typedArray) {
        this.f181d = 20;
        this.e = context;
        this.f182f = typedArray;
    }

    public b(L0.g gVar) {
        this.f181d = 14;
        this.e = new A.c(30);
        this.f182f = new ArrayList();
        this.f183g = new ArrayList();
        new p074x1.a(this);
    }

    public b(K1.b bVar, FlutterJNI flutterJNI) {
        this.f181d = 8;
        C0006g c0006g = new C0006g(13, this);
        n nVar = new n(bVar, "flutter/accessibility", r.f1594a, null, false);
        this.e = nVar;
        nVar.e(c0006g);
        this.f182f = flutterJNI;
    }

    public b(z zVar) {
        this.f181d = 5;
        this.f182f = new HashSet();
        this.f183g = zVar;
        p pVar = (p) zVar;
        this.e = new y[]{new I1.v(pVar.getBinaryMessenger()), new A0.g(new A0.f(pVar.getBinaryMessenger()))};
        new C0006g(pVar.getBinaryMessenger()).e = this;
    }

    public b(int i3) {
        this.f181d = i3;
        switch (i3) {
            case 26:
                p065t0.e eVar = new p065t0.e();
                v vVar = new v();
                this.e = new HashSet();
                this.f182f = eVar;
                this.f183g = vVar;
                break;
            default:
                this.e = new ConcurrentLinkedQueue();
                break;
        }
    }

    public b(b bVar, h hVar) {
        this.f181d = 11;
        this.f183g = bVar;
        this.f182f = new AtomicReference(null);
        this.e = hVar;
    }

    public b(S1.f fVar, Context context, p065t0.e eVar) {
        this.f181d = 23;
        B2.h.e(fVar, "messenger");
        B2.h.e(context, "context");
        this.e = fVar;
        this.f182f = context;
        this.f183g = eVar;
        try {
            InterfaceC0775g.f5445c.getClass();
            C0774f.b(fVar, this, "shared_preferences");
        } catch (Exception e) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e);
        }
    }

    public b(p006b1.c cVar) {
        this.f181d = 22;
        this.e = cVar;
        this.f182f = new ReentrantLock();
        this.f183g = new WeakHashMap();
    }
}
