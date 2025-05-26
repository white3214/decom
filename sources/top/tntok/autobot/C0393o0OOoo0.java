package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoo0  reason: case insensitive filesystem */
public abstract class C0393o0OOoo0 extends C0460o0OoOoo0<String> {
    public final boolean iiIliillii;
    public final String iilLil1i11I1;
    public final String il1LilLllii;

    public C0393o0OOoo0(String str, boolean z, String str2) {
        this.il1LilLllii = str;
        this.iiIliillii = z;
        this.iilLil1i11I1 = str2;
    }

    public String I11lLL1(String str) {
        if (this.iiIliillii) {
            return str.toLowerCase();
        }
        return str;
    }

    public abstract boolean IiIIlIL(String str);

    /* renamed from: iLLLILIiLi1Ii */
    public void iiIliillii(String str, OooO0o oooO0o) {
        oooO0o.iiIliillii("was \"").iiIliillii(str).iiIliillii("\"");
    }

    /* renamed from: iilLiIIIi11i */
    public boolean iilLil1i11I1(String str) {
        if (this.iiIliillii) {
            str = str.toLowerCase();
        }
        return IiIIlIL(str);
    }

    public void illlI1lLIL(OooO0o oooO0o) {
        oooO0o.iiIliillii("a string ").iiIliillii(this.il1LilLllii).iiIliillii(" ").iiI1L1iI(this.iilLil1i11I1);
        if (this.iiIliillii) {
            oooO0o.iiIliillii(" ignoring case");
        }
    }
}
