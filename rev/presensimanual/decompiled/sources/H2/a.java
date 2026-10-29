package H2;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f330a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        B2.h.d(charsetForName, "forName(...)");
        f330a = charsetForName;
        B2.h.d(Charset.forName("UTF-16"), "forName(...)");
        B2.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        B2.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        B2.h.d(Charset.forName("US-ASCII"), "forName(...)");
        B2.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
