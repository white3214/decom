package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0Oo0o0O  reason: case insensitive filesystem */
public class C0422o0Oo0o0O {
    public Throwable i1LIL11l;
    public C0532o0oOo0o0 iiI1L1iI;

    public C0422o0Oo0o0O(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
        this.iiI1L1iI = o0ooo0o0;
        this.i1LIL11l = th;
    }

    public C0532o0oOo0o0 i1LIL11l() {
        return this.iiI1L1iI;
    }

    public String iiI1L1iI() {
        return il1LilLllii().getMessage();
    }

    public String iiIliillii() {
        return C0449o0OoOOoO.I11lLL1(il1LilLllii());
    }

    public Throwable il1LilLllii() {
        return this.i1LIL11l;
    }

    public boolean illlI1lLIL() {
        return il1LilLllii() instanceof IillLillLLIii;
    }

    public String toString() {
        return this.iiI1L1iI + ": " + this.i1LIL11l.getMessage();
    }
}
