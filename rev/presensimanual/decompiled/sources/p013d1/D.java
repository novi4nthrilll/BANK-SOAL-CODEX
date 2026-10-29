package p013d1;

import W1.u;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static u a(String str) {
        return new u("channel-error", "Unable to establish connection on channel: " + str + ".", "");
    }

    public static ArrayList b(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof u) {
            u uVar = (u) th;
            arrayList.add(uVar.f1789d);
            arrayList.add(uVar.getMessage());
            arrayList.add(uVar.e);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
