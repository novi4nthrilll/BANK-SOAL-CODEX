package p023g1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f4501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f4502b;

    static {
        Locale locale = Locale.ROOT;
        f4501a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f4502b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
