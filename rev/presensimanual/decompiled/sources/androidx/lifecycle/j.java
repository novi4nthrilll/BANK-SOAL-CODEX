package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final h Companion;
    public static final j ON_ANY;
    public static final j ON_CREATE;
    public static final j ON_DESTROY;
    public static final j ON_PAUSE;
    public static final j ON_RESUME;
    public static final j ON_START;
    public static final j ON_STOP;

    static {
        j jVar = new j("ON_CREATE", 0);
        ON_CREATE = jVar;
        j jVar2 = new j("ON_START", 1);
        ON_START = jVar2;
        j jVar3 = new j("ON_RESUME", 2);
        ON_RESUME = jVar3;
        j jVar4 = new j("ON_PAUSE", 3);
        ON_PAUSE = jVar4;
        j jVar5 = new j("ON_STOP", 4);
        ON_STOP = jVar5;
        j jVar6 = new j("ON_DESTROY", 5);
        ON_DESTROY = jVar6;
        j jVar7 = new j("ON_ANY", 6);
        ON_ANY = jVar7;
        $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        Companion = new h();
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final k a() {
        switch (i.f2384a[ordinal()]) {
            case 1:
            case 2:
                return k.f2386f;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return k.f2387g;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return k.f2388h;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return k.f2385d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
