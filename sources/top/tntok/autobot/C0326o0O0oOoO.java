package top.tntok.autobot;

import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o0O0oOoO  reason: case insensitive filesystem */
public final class C0326o0O0oOoO implements IlI1l1i1Ilii {
    public final Pattern iiI1L1iI;

    public C0326o0O0oOoO(String str) {
        this(Pattern.compile(str));
    }

    public boolean iiI1L1iI(String str) {
        return this.iiI1L1iI.matcher(str).matches();
    }

    public C0326o0O0oOoO(Pattern pattern) {
        if (pattern != null) {
            this.iiI1L1iI = pattern;
            return;
        }
        throw new IllegalArgumentException("Null pattern");
    }
}
