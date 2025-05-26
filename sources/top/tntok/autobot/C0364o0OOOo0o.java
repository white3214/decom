package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOOo0o  reason: case insensitive filesystem */
public abstract class C0364o0OOOo0o extends C0062o0000Oo0 {
    private static final long serialVersionUID = -8776225574705254126L;
    private final long actual;
    private final long permitted;

    public C0364o0OOOo0o(String str, long j, long j2) {
        super(str);
        this.actual = j;
        this.permitted = j2;
    }

    public long i1LIL11l() {
        return this.permitted;
    }

    public long iiI1L1iI() {
        return this.actual;
    }
}
