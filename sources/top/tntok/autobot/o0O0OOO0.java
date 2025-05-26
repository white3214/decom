package top.tntok.autobot;

import java.util.Objects;

public class o0O0OOO0 {
    public final C0363o0OOOo0O i1LIL11l;
    public final C0293o0O0O0oo iiI1L1iI;

    public o0O0OOO0(C0293o0O0O0oo o0o0o0oo, C0363o0OOOo0O o0oooo0o) {
        this.iiI1L1iI = o0o0o0oo;
        this.i1LIL11l = o0oooo0o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) obj;
        if (!Objects.equals(this.iiI1L1iI, o0o0ooo0.iiI1L1iI) || !Objects.equals(this.i1LIL11l, o0o0ooo0.i1LIL11l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.iiI1L1iI, this.i1LIL11l});
    }

    public C0363o0OOOo0O i1LIL11l() {
        return this.i1LIL11l;
    }

    public C0293o0O0O0oo iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public o0O0OOO0 illlI1lLIL(int i) {
        if (i == 1) {
            return new o0O0OOO0(new C0293o0O0O0oo(this.i1LIL11l.iiI1L1iI() - this.iiI1L1iI.i1LIL11l(), this.iiI1L1iI.iiI1L1iI()), this.i1LIL11l.iilLil1i11I1());
        }
        if (i == 2) {
            return new o0O0OOO0(new C0293o0O0O0oo(this.i1LIL11l.illlI1lLIL() - this.iiI1L1iI.iiI1L1iI(), this.i1LIL11l.iiI1L1iI() - this.iiI1L1iI.i1LIL11l()), this.i1LIL11l);
        }
        if (i != 3) {
            return this;
        }
        return new o0O0OOO0(new C0293o0O0O0oo(this.iiI1L1iI.i1LIL11l(), this.i1LIL11l.illlI1lLIL() - this.iiI1L1iI.iiI1L1iI()), this.i1LIL11l.iilLil1i11I1());
    }

    public String toString() {
        return C0387o0OOoO0o.iiI1L1iI("1PTMnqc4KoP/69CevSV4\n", "hJu/99NRRe0=\n") + this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("04k6NyyUdm6swDMxYw==\n", "/6lJVF7xEwA=\n") + this.i1LIL11l + '}';
    }

    public o0O0OOO0(int i, int i2, int i3, int i4) {
        this(new C0293o0O0O0oo(i, i2), new C0363o0OOOo0O(i3, i4));
    }
}
