package top.tntok.autobot;

import java.util.Objects;

/* renamed from: top.tntok.autobot.o0O0O0oo  reason: case insensitive filesystem */
public class C0293o0O0O0oo {
    public final int i1LIL11l;
    public final int iiI1L1iI;

    public C0293o0O0O0oo(int i, int i2) {
        this.iiI1L1iI = i;
        this.i1LIL11l = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0293o0O0O0oo o0o0o0oo = (C0293o0O0O0oo) obj;
        if (this.iiI1L1iI == o0o0o0oo.iiI1L1iI && this.i1LIL11l == o0o0o0oo.i1LIL11l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.iiI1L1iI), Integer.valueOf(this.i1LIL11l)});
    }

    public int i1LIL11l() {
        return this.i1LIL11l;
    }

    public int iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public String toString() {
        return C0387o0OOoO0o.iiI1L1iI("IMH8l2zS+R0=\n", "cK6V+RipgSA=\n") + this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("nTy3Kg==\n", "sRzOF6mteIY=\n") + this.i1LIL11l + '}';
    }
}
