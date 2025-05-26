package top.tntok.autobot;

import java.io.IOException;

public final class o0O0O0Oo implements C0370o0OOOooO {
    public long I11lLL1;
    public final ILL1iL1LiiI i1LIL11l;
    public int iiIliillii;
    public boolean iilLil1i11I1;
    public o0OOO00 il1LilLllii;
    public final IiILIlLLiIL illlI1lLIL;

    public o0O0O0Oo(ILL1iL1LiiI iLL1iL1LiiI) {
        int i;
        this.i1LIL11l = iLL1iL1LiiI;
        IiILIlLLiIL illlI1lLIL2 = iLL1iL1LiiI.illlI1lLIL();
        this.illlI1lLIL = illlI1lLIL2;
        o0OOO00 o0ooo00 = illlI1lLIL2.i1LIL11l;
        this.il1LilLllii = o0ooo00;
        if (o0ooo00 != null) {
            i = o0ooo00.i1LIL11l;
        } else {
            i = -1;
        }
        this.iiIliillii = i;
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        o0OOO00 o0ooo00;
        o0OOO00 o0ooo002;
        if (!this.iilLil1i11I1) {
            o0OOO00 o0ooo003 = this.il1LilLllii;
            if (o0ooo003 == null || (o0ooo003 == (o0ooo002 = this.illlI1lLIL.i1LIL11l) && this.iiIliillii == o0ooo002.i1LIL11l)) {
                this.i1LIL11l.iLIIl1IliLlLI(this.I11lLL1 + j);
                if (this.il1LilLllii == null && (o0ooo00 = this.illlI1lLIL.i1LIL11l) != null) {
                    this.il1LilLllii = o0ooo00;
                    this.iiIliillii = o0ooo00.i1LIL11l;
                }
                long min = Math.min(j, this.illlI1lLIL.illlI1lLIL - this.I11lLL1);
                if (min <= 0) {
                    return -1;
                }
                this.illlI1lLIL.iILlLIlli(iiILIlLLiIL, this.I11lLL1, min);
                this.I11lLL1 += min;
                return min;
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        this.iilLil1i11I1 = true;
    }

    public C0446o0OoOOOo timeout() {
        return this.i1LIL11l.timeout();
    }
}
