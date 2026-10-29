package p009c1;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        ((o) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -228219804;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=common, enableFirelog=true, firelogEventType=1}";
    }
}
