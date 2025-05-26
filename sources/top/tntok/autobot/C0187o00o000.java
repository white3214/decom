package top.tntok.autobot;

import java.lang.reflect.Method;
import java.util.Comparator;

/* renamed from: top.tntok.autobot.o00o000  reason: case insensitive filesystem */
public enum C0187o00o000 {
    NAME_ASCENDING(C0188o00o0000.i1LIL11l),
    JVM((String) null),
    DEFAULT(C0188o00o0000.iiI1L1iI);
    
    private final Comparator<Method> comparator;

    /* access modifiers changed from: public */
    C0187o00o000(Comparator<Method> comparator2) {
        this.comparator = comparator2;
    }

    public Comparator<Method> iiI1L1iI() {
        return this.comparator;
    }
}
