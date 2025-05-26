package top.tntok.autobot;

import java.util.List;

public class o000OOo0 {
    public static final int I1iIiIi = 5;
    public static final int IiIIlIL = 1;
    public static final int IiiL1llIIi = 3;
    public static final int iILiI1lll = 4;
    public static final int iilLiIIIi11i = 2;
    public long I11lLL1;
    public long i1LIL11l;
    public List<C0293o0O0O0oo> iLLLILIiLi1Ii;
    public final long iiI1L1iI;
    public int iiIliillii = 1;
    public long iilLil1i11I1;
    public boolean il1LilLllii = false;
    public long illlI1lLIL = 0;

    public o000OOo0(long j, long j2, List<C0293o0O0O0oo> list) {
        this.iilLil1i11I1 = j;
        this.I11lLL1 = j2;
        this.iLLLILIiLi1Ii = list;
        this.iiI1L1iI = j2 / ((long) list.size());
    }

    public static long iiI1L1iI(List<o000OOo0> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            long illlI1lLIL2 = list.get(i).illlI1lLIL();
            if (illlI1lLIL2 > j) {
                j = illlI1lLIL2;
            }
        }
        return j;
    }

    public int I11lLL1() {
        return this.iiIliillii;
    }

    public void IiIIlIL(long j) {
        this.iilLil1i11I1 = j;
    }

    public void IiiL1llIIi(List<C0293o0O0O0oo> list) {
        this.iLLLILIiLi1Ii = list;
    }

    public C0293o0O0O0oo i1LIL11l() {
        C0293o0O0O0oo o0o0o0oo = null;
        if (this.il1LilLllii) {
            if (this.iiIliillii == 2) {
                o0o0o0oo = this.iLLLILIiLi1Ii.get(0);
            }
            if (this.iiIliillii == 3) {
                o0o0o0oo = this.iLLLILIiLi1Ii.get((int) this.illlI1lLIL);
            }
            if (this.iiIliillii == 4) {
                List<C0293o0O0O0oo> list = this.iLLLILIiLi1Ii;
                o0o0o0oo = list.get(list.size() - 1);
            }
            this.il1LilLllii = false;
        }
        return o0o0o0oo;
    }

    public void iILiI1lll(int i) {
        this.iiIliillii = i;
    }

    public void iLLLILIiLi1Ii(long j) {
        long j2 = this.iilLil1i11I1;
        if (j >= j2) {
            this.i1LIL11l = j;
            if (j == j2) {
                iILiI1lll(2);
                this.il1LilLllii = true;
            }
            long floor = (long) Math.floor((double) ((this.i1LIL11l - this.iilLil1i11I1) / this.iiI1L1iI));
            if (floor != this.illlI1lLIL) {
                this.illlI1lLIL = floor;
                if (this.iiIliillii < 4) {
                    iILiI1lll(3);
                    this.il1LilLllii = true;
                }
            }
            if (this.illlI1lLIL == ((long) this.iLLLILIiLi1Ii.size())) {
                iILiI1lll(4);
                this.il1LilLllii = true;
            }
            if (this.illlI1lLIL > ((long) this.iLLLILIiLi1Ii.size())) {
                iILiI1lll(5);
            }
        }
    }

    public long iiIliillii() {
        return this.I11lLL1;
    }

    public void iilLiIIIi11i(long j) {
        this.I11lLL1 = j;
    }

    public List<C0293o0O0O0oo> iilLil1i11I1() {
        return this.iLLLILIiLi1Ii;
    }

    public long il1LilLllii() {
        return this.iilLil1i11I1;
    }

    public long illlI1lLIL() {
        return this.iilLil1i11I1 + this.I11lLL1;
    }
}
