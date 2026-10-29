package p046n2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;
import p013d1.AbstractC0479l3;

/* JADX INFO: loaded from: classes.dex */
public final class M extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        String[] strArr = {"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0479l3.a(4));
        for (int i3 = 0; i3 < 4; i3++) {
            linkedHashSet.add(strArr[i3]);
        }
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || linkedHashSet.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
