package I1;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class v implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1.f f424d;
    public final HashMap e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f426g;

    public v(S1.f fVar) {
        HashMap map = new HashMap();
        this.f425f = map;
        this.f426g = new w();
        this.f424d = fVar;
        A a3 = D.f343a;
        C c3 = new C();
        c3.f342a = false;
        C c4 = new C[]{c3}[0];
        c4.getClass();
        map.put(4294967556L, c4);
    }

    public final void a(s sVar, final C1.h hVar) {
        long j3;
        long j4;
        byte[] bytes = null;
        S1.e eVar = hVar == null ? null : new S1.e() { // from class: I1.t
            @Override // S1.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                hVar.b(boolValueOf.booleanValue());
            }
        };
        try {
            String str = sVar.f418g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(sVar.f413a);
            int i3 = sVar.f414b;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                j3 = 2;
            }
            byteBufferAllocateDirect.putLong(j3);
            byteBufferAllocateDirect.putLong(sVar.f415c);
            byteBufferAllocateDirect.putLong(sVar.f416d);
            byteBufferAllocateDirect.putLong(sVar.e ? 1L : 0L);
            int i4 = sVar.f417f;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else if (i4 == 3) {
                j4 = 2;
            } else if (i4 == 4) {
                j4 = 3;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                j4 = 4;
            }
            byteBufferAllocateDirect.putLong(j4);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f424d.h("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l3, Long l4, long j3) {
        s sVar = new s();
        sVar.f413a = j3;
        sVar.f414b = z2 ? 1 : 2;
        sVar.f416d = l3.longValue();
        sVar.f415c = l4.longValue();
        sVar.f418g = null;
        sVar.e = true;
        sVar.f417f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z2) {
                l3 = null;
            }
            d(l4, l3);
        }
        a(sVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I1.y
    public final void c(final KeyEvent keyEvent, C1.h hVar) {
        Long lValueOf;
        boolean z2;
        int i3;
        String str;
        int i4;
        C c3;
        long j3;
        HashMap map;
        HashMap map2;
        int i5;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j3 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                lValueOf = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            } else {
                lValueOf = (Long) D.f343a.get(Long.valueOf(scanCode));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf((((long) keyEvent.getScanCode()) & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = lValueOf;
            Long lValueOf2 = (Long) D.f344b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            }
            Long l4 = lValueOf2;
            ArrayList arrayList = new ArrayList();
            A.c[] cVarArr = D.f345c;
            int length = cVarArr.length;
            int i6 = 0;
            while (true) {
                HashMap map3 = this.e;
                if (i6 >= length) {
                    HashMap map4 = map3;
                    HashMap map5 = this.f425f;
                    for (C c4 : map5.values()) {
                        int metaState = keyEvent.getMetaState();
                        c4.getClass();
                        boolean z3 = (metaState & 1048576) != 0;
                        if (4294967556L == l4.longValue() || c4.f342a == z3) {
                            map = map4;
                        } else {
                            HashMap map6 = map4;
                            boolean zContainsKey = map6.containsKey(458809L);
                            boolean z4 = !zContainsKey;
                            if (!zContainsKey) {
                                c4.f342a = !c4.f342a;
                            }
                            map = map6;
                            b(z4, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (zContainsKey) {
                                c4.f342a = !c4.f342a;
                            }
                            b(zContainsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        map4 = map;
                    }
                    HashMap map7 = map4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j3 = 0;
                        break;
                    }
                    Long l5 = (Long) map7.get(l3);
                    if (!z2) {
                        if (l5 != null) {
                            i3 = 1;
                            str = null;
                            i4 = 2;
                        }
                        j3 = 0;
                        break;
                    }
                    if (l5 == null) {
                        i4 = 1;
                    } else if (keyEvent.getRepeatCount() > 0) {
                        i4 = 3;
                    } else {
                        b(false, l5, l3, keyEvent.getEventTime());
                        i4 = 1;
                    }
                    char cCharValue = this.f426g.c(keyEvent.getUnicodeChar()).charValue();
                    str = cCharValue != 0 ? "" + cCharValue : null;
                    i3 = 1;
                    if (i4 != 3) {
                        d(l3, z2 ? l4 : null);
                    }
                    if (i4 == i3 && (c3 = (C) map5.get(l4)) != null) {
                        c3.f342a = (c3.f342a ? 1 : 0) ^ i3;
                    }
                    s sVar = new s();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        sVar.f417f = 2;
                    } else if (source == 1025) {
                        sVar.f417f = 3;
                    } else if (source == 16777232) {
                        sVar.f417f = 4;
                    } else if (source != 33554433) {
                        sVar.f417f = 1;
                    } else {
                        sVar.f417f = 5;
                    }
                    sVar.f413a = keyEvent.getEventTime();
                    sVar.f414b = i4;
                    sVar.f416d = l4.longValue();
                    sVar.f415c = l3.longValue();
                    sVar.f418g = str;
                    sVar.e = false;
                    a(sVar, hVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                A.c cVar = cVarArr[i6];
                boolean z5 = (keyEvent.getMetaState() & cVar.f2a) != 0;
                long jLongValue = l4.longValue();
                final long jLongValue2 = l3.longValue();
                B[] bArr = (B[]) cVar.f3b;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i7 = 0;
                boolean z6 = false;
                for (int i8 = 2; i7 < i8; i8 = 2) {
                    final B b3 = bArr[i7];
                    boolean[] zArr2 = zArr;
                    boolean zContainsKey2 = map3.containsKey(Long.valueOf(b3.f340a));
                    zArr2[i7] = zContainsKey2;
                    int i9 = i7;
                    if (b3.f341b == jLongValue) {
                        boolean z7 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i5 = z7 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i5 = 2;
                        }
                        int iB = M.j.b(i5);
                        if (iB == 0) {
                            boolArr = boolArr;
                            map2 = map3;
                            length = length;
                            cVarArr = cVarArr;
                            zArr2 = zArr2;
                            i6 = i6;
                            boolArr[i9] = Boolean.FALSE;
                            if (!z5) {
                                final int i10 = 0;
                                arrayList.add(new Runnable(this) { // from class: I1.u
                                    public final /* synthetic */ v e;

                                    {
                                        this.e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                                v vVar = this.e;
                                                vVar.getClass();
                                                vVar.b(false, Long.valueOf(b3.f341b), Long.valueOf(jLongValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                v vVar2 = this.e;
                                                vVar2.getClass();
                                                vVar2.b(false, Long.valueOf(b3.f341b), Long.valueOf(jLongValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (iB == 1) {
                            boolArr = boolArr;
                            map2 = map3;
                            length = length;
                            cVarArr = cVarArr;
                            zArr2 = zArr2;
                            i6 = i6;
                            boolArr[i9] = Boolean.valueOf(zArr2[i9]);
                        } else if (iB != 2) {
                            boolArr = boolArr;
                            map2 = map3;
                            length = length;
                            cVarArr = cVarArr;
                            zArr2 = zArr2;
                            i6 = i6;
                        } else {
                            if (z5) {
                                map2 = map3;
                            } else {
                                final int i11 = 1;
                                map2 = map3;
                                arrayList.add(new Runnable(this) { // from class: I1.u
                                    public final /* synthetic */ v e;

                                    {
                                        this.e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                                v vVar = this.e;
                                                vVar.getClass();
                                                vVar.b(false, Long.valueOf(b3.f341b), Long.valueOf(jLongValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                v vVar2 = this.e;
                                                vVar2.getClass();
                                                vVar2.b(false, Long.valueOf(b3.f341b), Long.valueOf(jLongValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i9] = Boolean.valueOf(zArr2[i9]);
                        }
                        z6 = true;
                    } else {
                        boolArr = boolArr;
                        map2 = map3;
                        length = length;
                        cVarArr = cVarArr;
                        zArr2 = zArr2;
                        i6 = i6;
                        z6 = z6 || zContainsKey2;
                    }
                    i7 = i9 + 1;
                    zArr = zArr2;
                    length = length;
                    boolArr = boolArr;
                    i6 = i6;
                    cVarArr = cVarArr;
                    map3 = map2;
                }
                Boolean[] boolArr2 = boolArr;
                boolean[] zArr3 = zArr;
                int i12 = i6;
                int i13 = length;
                A.c[] cVarArr2 = cVarArr;
                if (z5) {
                    for (int i14 = 0; i14 < 2; i14++) {
                        if (boolArr2[i14] == null) {
                            if (z6) {
                                boolArr2[i14] = Boolean.valueOf(zArr3[i14]);
                            } else {
                                boolArr2[i14] = Boolean.TRUE;
                                z6 = true;
                            }
                        }
                    }
                    if (!z6) {
                        boolArr2[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (boolArr2[i15] == null) {
                            boolArr2[i15] = Boolean.FALSE;
                        }
                    }
                }
                for (int i16 = 0; i16 < 2; i16++) {
                    if (zArr3[i16] != boolArr2[i16].booleanValue()) {
                        B b4 = bArr[i16];
                        b(boolArr2[i16].booleanValue(), Long.valueOf(b4.f341b), Long.valueOf(b4.f340a), keyEvent.getEventTime());
                    }
                }
                i6 = i12 + 1;
                length = i13;
                cVarArr = cVarArr2;
            }
        }
        b(true, Long.valueOf(j3), Long.valueOf(j3), 0L);
        hVar.b(true);
    }

    public final void d(Long l3, Long l4) {
        HashMap map = this.e;
        if (l4 != null) {
            if (((Long) map.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
