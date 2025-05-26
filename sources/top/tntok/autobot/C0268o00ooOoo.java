package top.tntok.autobot;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: top.tntok.autobot.o00ooOoo  reason: case insensitive filesystem */
public class C0268o00ooOoo extends AssertionError {
    private static final long serialVersionUID = 1;

    public C0268o00ooOoo(Throwable th, String str, Object... objArr) {
        super(String.format("%s(%s)", new Object[]{str, i1LIL11l(", ", objArr)}));
        initCause(th);
    }

    public static String i1LIL11l(String str, Object... objArr) {
        return iiI1L1iI(str, Arrays.asList(objArr));
    }

    public static String iiI1L1iI(String str, Collection<Object> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(illlI1lLIL(it.next()));
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String illlI1lLIL(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Throwable unused) {
            return "[toString failed]";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0268o00ooOoo) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
