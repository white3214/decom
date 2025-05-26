package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0O0oo0  reason: case insensitive filesystem */
public class C0329o0O0oo0 extends C0420o0Oo0Ooo {
    public int i1LIL11l;

    public C0329o0O0oo0(C0532o0oOo0o0 o0ooo0o0, int i) {
        super(o0ooo0o0);
        if (i >= 0) {
            this.i1LIL11l = i;
            return;
        }
        throw new IllegalArgumentException("Repetition count must be >= 0");
    }

    public void i1LIL11l(C0428o0Oo0oo0 o0oo0oo0) {
        for (int i = 0; i < this.i1LIL11l && !o0oo0oo0.i1L1lLllLLlIi(); i++) {
            super.i1LIL11l(o0oo0oo0);
        }
    }

    public int illlI1lLIL() {
        return super.illlI1lLIL() * this.i1LIL11l;
    }

    public String toString() {
        return super.toString() + "(repeated)";
    }
}
