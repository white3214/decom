package top.tntok.autobot;

import java.io.Serializable;

/* renamed from: top.tntok.autobot.o0OOO0oO  reason: case insensitive filesystem */
public class C0354o0OOO0oO implements Serializable {
    private final String value;

    public C0354o0OOO0oO(Object obj) {
        this.value = String.valueOf(obj);
    }

    public static Object iiI1L1iI(Object obj) {
        if (obj == null || (obj instanceof Serializable)) {
            return obj;
        }
        return new C0354o0OOO0oO(obj);
    }

    public String toString() {
        return this.value;
    }
}
