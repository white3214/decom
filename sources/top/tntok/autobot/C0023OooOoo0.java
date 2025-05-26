package top.tntok.autobot;

import java.io.File;

/* renamed from: top.tntok.autobot.OooOoo0  reason: case insensitive filesystem */
public class C0023OooOoo0 implements o00000O {
    public static final int iiIliillii = 10240;
    public int i1LIL11l;
    public File iiI1L1iI;
    public String il1LilLllii;
    public o0O0O00 illlI1lLIL;

    public C0023OooOoo0() {
        this(10240, (File) null);
    }

    public void I11lLL1(o0O0O00 o0o0o00) {
        this.illlI1lLIL = o0o0o00;
    }

    public void IiIIlIL(int i) {
        this.i1LIL11l = i;
    }

    public String i1LIL11l() {
        return this.il1LilLllii;
    }

    public void iLLLILIiLi1Ii(File file) {
        this.iiI1L1iI = file;
    }

    public o00000O0 iiI1L1iI(String str, String str2, boolean z, String str3) {
        C0021OooOoOO oooOoOO = new C0021OooOoOO(str, str2, z, str3, this.i1LIL11l, this.iiI1L1iI);
        oooOoOO.i1iiLIil1ILi(this.il1LilLllii);
        o0O0O00 illlI1lLIL2 = illlI1lLIL();
        if (illlI1lLIL2 != null) {
            illlI1lLIL2.iiIliillii(oooOoOO.iiLIIiIli(), oooOoOO);
        }
        return oooOoOO;
    }

    public int iiIliillii() {
        return this.i1LIL11l;
    }

    public void iilLil1i11I1(String str) {
        this.il1LilLllii = str;
    }

    public File il1LilLllii() {
        return this.iiI1L1iI;
    }

    public o0O0O00 illlI1lLIL() {
        return this.illlI1lLIL;
    }

    public C0023OooOoo0(int i, File file) {
        this.il1LilLllii = C0021OooOoOO.I1iIiIi;
        this.i1LIL11l = i;
        this.iiI1L1iI = file;
    }
}
