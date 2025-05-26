package top.tntok.autobot;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: top.tntok.autobot.o0OOooO0  reason: case insensitive filesystem */
public final class C0397o0OOooO0 {
    public final Set<o0OO0OoO> iiI1L1iI = new LinkedHashSet();

    public synchronized void i1LIL11l(o0OO0OoO o0oo0ooo) {
        this.iiI1L1iI.add(o0oo0ooo);
    }

    public synchronized void iiI1L1iI(o0OO0OoO o0oo0ooo) {
        this.iiI1L1iI.remove(o0oo0ooo);
    }

    public synchronized boolean illlI1lLIL(o0OO0OoO o0oo0ooo) {
        return this.iiI1L1iI.contains(o0oo0ooo);
    }
}
