package top.tntok.autobot;

public class III1ilIlliL {
    public static final String I11lLL1 = "]";
    public static final String iLLLILIiLi1Ii = "[";
    public static final String iilLil1i11I1 = "...";
    public String i1LIL11l;
    public int iiI1L1iI;
    public int iiIliillii;
    public int il1LilLllii;
    public String illlI1lLIL;

    public III1ilIlliL(int i, String str, String str2) {
        this.iiI1L1iI = i;
        this.i1LIL11l = str;
        this.illlI1lLIL = str2;
    }

    public final void I11lLL1() {
        int length = this.i1LIL11l.length() - 1;
        int length2 = this.illlI1lLIL.length() - 1;
        while (true) {
            int i = this.il1LilLllii;
            if (length2 < i || length < i || this.i1LIL11l.charAt(length) != this.illlI1lLIL.charAt(length2)) {
                this.iiIliillii = this.i1LIL11l.length() - length;
            } else {
                length2--;
                length--;
            }
        }
        this.iiIliillii = this.i1LIL11l.length() - length;
    }

    public String i1LIL11l(String str) {
        if (this.i1LIL11l == null || this.illlI1lLIL == null || iiI1L1iI()) {
            return IiIl11II.ILllI11(str, this.i1LIL11l, this.illlI1lLIL);
        }
        iilLil1i11I1();
        I11lLL1();
        return IiIl11II.ILllI11(str, illlI1lLIL(this.i1LIL11l), illlI1lLIL(this.illlI1lLIL));
    }

    public final boolean iiI1L1iI() {
        return this.i1LIL11l.equals(this.illlI1lLIL);
    }

    public final String iiIliillii() {
        String str;
        int min = Math.min((this.i1LIL11l.length() - this.iiIliillii) + 1 + this.iiI1L1iI, this.i1LIL11l.length());
        StringBuilder sb = new StringBuilder();
        String str2 = this.i1LIL11l;
        sb.append(str2.substring((str2.length() - this.iiIliillii) + 1, min));
        if ((this.i1LIL11l.length() - this.iiIliillii) + 1 < this.i1LIL11l.length() - this.iiI1L1iI) {
            str = "...";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void iilLil1i11I1() {
        this.il1LilLllii = 0;
        int min = Math.min(this.i1LIL11l.length(), this.illlI1lLIL.length());
        while (true) {
            int i = this.il1LilLllii;
            if (i < min && this.i1LIL11l.charAt(i) == this.illlI1lLIL.charAt(this.il1LilLllii)) {
                this.il1LilLllii++;
            } else {
                return;
            }
        }
    }

    public final String il1LilLllii() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.il1LilLllii > this.iiI1L1iI) {
            str = "...";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(this.i1LIL11l.substring(Math.max(0, this.il1LilLllii - this.iiI1L1iI), this.il1LilLllii));
        return sb.toString();
    }

    public final String illlI1lLIL(String str) {
        String str2 = "[" + str.substring(this.il1LilLllii, (str.length() - this.iiIliillii) + 1) + "]";
        if (this.il1LilLllii > 0) {
            str2 = il1LilLllii() + str2;
        }
        if (this.iiIliillii <= 0) {
            return str2;
        }
        return str2 + iiIliillii();
    }
}
