package top.tntok.autobot;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: top.tntok.autobot.o000OO0o  reason: case insensitive filesystem */
public final class C0080o000OO0o implements IlI1l1i1Ilii {
    public final Set<String> iiI1L1iI;

    public C0080o000OO0o(String... strArr) {
        this.iiI1L1iI = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    public boolean iiI1L1iI(String str) {
        return this.iiI1L1iI.contains(str);
    }
}
