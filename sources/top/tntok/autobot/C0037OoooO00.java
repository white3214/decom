package top.tntok.autobot;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.junit.runners.Suite;

/* renamed from: top.tntok.autobot.OoooO00  reason: case insensitive filesystem */
public class C0037OoooO00 extends Suite {
    public C0037OoooO00(Class<?> cls, C0402o0OOoooO o0oooooo) throws Throwable {
        super(o0oooooo, cls, ILllI11(cls.getClasses()));
    }

    public static Class<?>[] ILllI11(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
