package top.tntok.autobot;

import java.io.Serializable;

public class o00O0O implements Serializable {
    private static final long serialVersionUID = 1;
    private final C0009OooO0oO fDescription;
    private final Throwable fThrownException;

    public o00O0O(C0009OooO0oO oooO0oO, Throwable th) {
        this.fThrownException = th;
        this.fDescription = oooO0oO;
    }

    public Throwable i1LIL11l() {
        return this.fThrownException;
    }

    public C0009OooO0oO iiI1L1iI() {
        return this.fDescription;
    }

    public String iiIliillii() {
        return C0449o0OoOOoO.I11lLL1(i1LIL11l());
    }

    public String iilLil1i11I1() {
        return C0449o0OoOOoO.iLLLILIiLi1Ii(i1LIL11l());
    }

    public String il1LilLllii() {
        return this.fDescription.iL1LIlIlI();
    }

    public String illlI1lLIL() {
        return i1LIL11l().getMessage();
    }

    public String toString() {
        return il1LilLllii() + ": " + this.fThrownException.getMessage();
    }
}
