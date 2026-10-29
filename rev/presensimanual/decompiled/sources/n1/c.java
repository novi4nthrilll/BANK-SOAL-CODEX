package n1;

import W1.C0104l;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5394b;

    public c(String str, Map map) {
        this.f5393a = str;
        this.f5394b = map;
    }

    public static C0104l a(String str) {
        C0104l c0104l = new C0104l();
        c0104l.e = null;
        c0104l.f1774d = str;
        return c0104l;
    }

    public static c c(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f5394b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5393a.equals(cVar.f5393a) && this.f5394b.equals(cVar.f5394b);
    }

    public final int hashCode() {
        return this.f5394b.hashCode() + (this.f5393a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f5393a + ", properties=" + this.f5394b.values() + "}";
    }
}
