package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class E extends IOException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2220d;

    public static E a() {
        return new E("Protocol message had invalid UTF-8.");
    }

    public static D b() {
        return new D("Protocol message tag had invalid wire type.");
    }

    public static E c() {
        return new E("CodedInputStream encountered a malformed varint.");
    }

    public static E d() {
        return new E("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static E e() {
        return new E("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
