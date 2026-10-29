package p028i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import k.Q;
import org.xmlpull.v1.XmlPullParserException;
import p011d.a;
import p013d1.G2;
import p032j.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {
    public static final Class[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f4557f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f4558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4561d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f4557f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f4560c = context;
        Object[] objArr = {context};
        this.f4558a = objArr;
        this.f4559b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        cVar.f4534b = 0;
                        cVar.f4535c = 0;
                        cVar.f4536d = 0;
                        cVar.e = 0;
                        cVar.f4537f = r4;
                        cVar.f4538g = r4;
                    } else if (name2.equals("item")) {
                        if (!cVar.f4539h) {
                            cVar.f4539h = r4;
                            cVar.b(cVar.f4533a.add(cVar.f4534b, cVar.f4540i, cVar.f4541j, cVar.f4542k));
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                d dVar = cVar.f4532D;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = dVar.f4560c.obtainStyledAttributes(attributeSet, a.f3541l);
                    cVar.f4534b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                    cVar.f4535c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    cVar.f4536d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    cVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    cVar.f4537f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                    cVar.f4538g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    Context context = dVar.f4560c;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f3542m);
                    cVar.f4540i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    cVar.f4541j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.f4535c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.f4536d) & 65535);
                    cVar.f4542k = typedArrayObtainStyledAttributes2.getText(7);
                    cVar.f4543l = typedArrayObtainStyledAttributes2.getText(8);
                    cVar.f4544m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    cVar.f4545n = string == null ? (char) 0 : string.charAt(0);
                    cVar.f4546o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    cVar.f4547p = string2 == null ? (char) 0 : string2.charAt(0);
                    cVar.f4548q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        cVar.f4549r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        cVar.f4549r = cVar.e;
                    }
                    cVar.f4550s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    cVar.f4551t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f4537f);
                    cVar.f4552u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.f4538g);
                    cVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    cVar.f4555y = typedArrayObtainStyledAttributes2.getString(12);
                    cVar.f4553w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    cVar.f4554x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z4 = string3 != null;
                    if (z4 && cVar.f4553w == 0 && cVar.f4554x == null) {
                        if (cVar.a(string3, f4557f, dVar.f4559b) != null) {
                            throw new ClassCastException();
                        }
                    } else if (z4) {
                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                    }
                    cVar.f4556z = typedArrayObtainStyledAttributes2.getText(17);
                    cVar.f4529A = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        cVar.f4531C = Q.c(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.f4531C);
                    } else {
                        cVar.f4531C = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = G2.a(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        cVar.f4530B = colorStateList;
                    } else {
                        cVar.f4530B = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    cVar.f4539h = false;
                } else if (name3.equals("menu")) {
                    cVar.f4539h = true;
                    SubMenu subMenuAddSubMenu = cVar.f4533a.addSubMenu(cVar.f4534b, cVar.f4540i, cVar.f4541j, cVar.f4542k);
                    cVar.b(subMenuAddSubMenu.getItem());
                    b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = 1;
            i3 = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f4560c.getResources().getLayout(i3);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
