package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o000Ooo0  reason: case insensitive filesystem */
public final class C0090o000Ooo0 {
    public static final String I11lLL1 = ":path";
    public static final ili11iILI1l I1iIiIi = ili11iILI1l.IiiL1llIIi(iLLLILIiLi1Ii);
    public static final String IiIIlIL = ":authority";
    public static final ili11iILI1l IiiL1llIIi = ili11iILI1l.IiiL1llIIi(iilLil1i11I1);
    public static final ili11iILI1l i1L1lLllLLlIi = ili11iILI1l.IiiL1llIIi(IiIIlIL);
    public static final ili11iILI1l iILiI1lll = ili11iILI1l.IiiL1llIIi(I11lLL1);
    public static final String iLLLILIiLi1Ii = ":scheme";
    public static final String iiIliillii = ":status";
    public static final ili11iILI1l iilLiIIIi11i = ili11iILI1l.IiiL1llIIi(iiIliillii);
    public static final String iilLil1i11I1 = ":method";
    public static final ili11iILI1l il1LilLllii = ili11iILI1l.IiiL1llIIi(":");
    public final ili11iILI1l i1LIL11l;
    public final ili11iILI1l iiI1L1iI;
    public final int illlI1lLIL;

    public C0090o000Ooo0(String str, String str2) {
        this(ili11iILI1l.IiiL1llIIi(str), ili11iILI1l.IiiL1llIIi(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0090o000Ooo0)) {
            return false;
        }
        C0090o000Ooo0 o000ooo0 = (C0090o000Ooo0) obj;
        if (!this.iiI1L1iI.equals(o000ooo0.iiI1L1iI) || !this.i1LIL11l.equals(o000ooo0.i1LIL11l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode();
    }

    public String toString() {
        return C0487o0OooooO.Ii1liIIIiLi("%s: %s", this.iiI1L1iI.ILiLII1ILi(), this.i1LIL11l.ILiLII1ILi());
    }

    public C0090o000Ooo0(ili11iILI1l ili11iili1l, String str) {
        this(ili11iili1l, ili11iILI1l.IiiL1llIIi(str));
    }

    public C0090o000Ooo0(ili11iILI1l ili11iili1l, ili11iILI1l ili11iili1l2) {
        this.iiI1L1iI = ili11iili1l;
        this.i1LIL11l = ili11iili1l2;
        this.illlI1lLIL = ili11iili1l.illiiliIILI() + 32 + ili11iili1l2.illiiliIILI();
    }
}
