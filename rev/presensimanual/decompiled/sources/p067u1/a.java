package p067u1;

import E0.e;
import O.m;
import O.u;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import id.go.bangkalankab.simpeg.R;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p033j1.b;
import p040l1.c;
import p040l1.s;
import p071w1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements V.a, c, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f5753d;

    public static boolean c(Q.b bVar, Editable editable, int i3, int i4, boolean z2) {
        int iMin;
        if (editable == null || i3 < 0 || i4 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int iMax = Math.max(i3, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z3) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break loop0;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z3) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z3 = true;
                        }
                        selectionStart = -1;
                        break loop0;
                    }
                }
            }
            selectionStart = -1;
            break loop0;
            int iMax2 = Math.max(i4, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z4) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z4) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z4 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i3, 0);
            iMin = Math.min(selectionEnd + i4, editable.length());
        }
        u[] uVarArr = (u[]) editable.getSpans(selectionStart, iMin, u.class);
        if (uVarArr == null || uVarArr.length <= 0) {
            return false;
        }
        for (u uVar : uVarArr) {
            int spanStart = editable.getSpanStart(uVar);
            int spanEnd = editable.getSpanEnd(uVar);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        bVar.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        bVar.endBatchEdit();
        return true;
    }

    @Override // V.a
    public CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f2419d.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p033j1.b
    public void b(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        p071w1.a aVar = new p071w1.a();
        m mVar = new m(1);
        ReferenceQueue referenceQueue = aVar.f5777a;
        Set set = aVar.f5778b;
        set.add(new k(aVar, referenceQueue, set, mVar));
        Thread thread = new Thread(new e(13, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }
}
