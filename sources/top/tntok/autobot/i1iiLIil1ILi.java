package top.tntok.autobot;

public class i1iiLIil1ILi {
    public static final i1iiLIil1ILi I11lLL1 = new i1iiLIil1ILi(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double i1LIL11l;
    public final double iiI1L1iI;
    public final double iiIliillii;
    public final double iilLil1i11I1;
    public final double il1LilLllii;
    public final double illlI1lLIL;

    public i1iiLIil1ILi(double d, double d2, double d3, double d4, double d5, double d6) {
        this.iiI1L1iI = d;
        this.i1LIL11l = d2;
        this.illlI1lLIL = d3;
        this.il1LilLllii = d4;
        this.iiIliillii = d5;
        this.iilLil1i11I1 = d6;
    }

    public static i1iiLIil1ILi I11lLL1(C0363o0OOOo0O o0oooo0o) {
        return new i1iiLIil1ILi(1.0d / ((double) o0oooo0o.illlI1lLIL()), 0.0d, 0.0d, -1.0d / ((double) o0oooo0o.iiI1L1iI()), 0.0d, 1.0d);
    }

    public static i1iiLIil1ILi I1iIiIi(C0363o0OOOo0O o0oooo0o, C0363o0OOOo0O o0oooo0o2) {
        return iILiI1lll(((double) o0oooo0o2.illlI1lLIL()) / ((double) o0oooo0o.illlI1lLIL()), ((double) o0oooo0o2.iiI1L1iI()) / ((double) o0oooo0o.iiI1L1iI()));
    }

    public static i1iiLIil1ILi IiIIlIL(double d, double d2, double d3, double d4) {
        if (d3 != 0.0d && d4 != 0.0d) {
            return iILiI1lll(1.0d / d3, 1.0d / d4).iiIliillii(iL1LIlIlI(-d, -d2));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("TE0fpLP1Ao9qSgOrseQCiWAMEKT85E+Ne1VRq67kQ8cv\n", "DyxxytyBIv0=\n") + d3 + C0387o0OOoO0o.iiI1L1iI("eg==\n", "AhPCfqgNYn0=\n") + d4);
    }

    public static i1iiLIil1ILi IiiL1llIIi(int i) {
        int i2 = i;
        if (i2 == 0) {
            return I11lLL1;
        }
        if (i2 == 1) {
            return new i1iiLIil1ILi(0.0d, 1.0d, -1.0d, 0.0d, 1.0d, 0.0d);
        }
        if (i2 == 2) {
            return new i1iiLIil1ILi(-1.0d, 0.0d, 0.0d, -1.0d, 1.0d, 1.0d);
        }
        if (i2 == 3) {
            return new i1iiLIil1ILi(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 1.0d);
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("umpsI+njDOWBa24j8eMHq8kk\n", "8wQaQoWKaMU=\n") + i2);
    }

    public static i1iiLIil1ILi i111iLiiIIill() {
        return new i1iiLIil1ILi(1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 1.0d);
    }

    public static i1iiLIil1ILi iILiI1lll(double d, double d2) {
        return new i1iiLIil1ILi(d, 0.0d, 0.0d, d2, 0.0d, 0.0d);
    }

    public static i1iiLIil1ILi iL1LIlIlI(double d, double d2) {
        return new i1iiLIil1ILi(1.0d, 0.0d, 0.0d, 1.0d, d, d2);
    }

    public static i1iiLIil1ILi iLLLILIiLi1Ii(C0363o0OOOo0O o0oooo0o) {
        double iiI1L1iI2 = (double) o0oooo0o.iiI1L1iI();
        return new i1iiLIil1ILi((double) o0oooo0o.illlI1lLIL(), 0.0d, 0.0d, -iiI1L1iI2, 0.0d, iiI1L1iI2);
    }

    public static i1iiLIil1ILi iilLiIIIi11i(double d) {
        double radians = Math.toRadians(d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        return new i1iiLIil1ILi(cos, sin, -sin, cos, 0.0d, 0.0d);
    }

    public static i1iiLIil1ILi iilLil1i11I1(i1iiLIil1ILi... i1iiliil1iliArr) {
        i1iiLIil1ILi i1iiliil1ili = null;
        for (i1iiLIil1ILi i1iiliil1ili2 : i1iiliil1iliArr) {
            if (i1iiliil1ili == null) {
                i1iiliil1ili = i1iiliil1ili2;
            } else {
                i1iiliil1ili = i1iiliil1ili.iiIliillii(i1iiliil1ili2);
            }
        }
        return i1iiliil1ili;
    }

    public static i1iiLIil1ILi illlI1lLIL() {
        return new i1iiLIil1ILi(-1.0d, 0.0d, 0.0d, 1.0d, 1.0d, 0.0d);
    }

    public float[] IL1lILLLL1L() {
        float[] fArr = new float[16];
        i1L1lLllLLlIi(fArr);
        return fArr;
    }

    public i1iiLIil1ILi Ii1liIIIiLi(double d) {
        return iILiI1lll(1.0d / d, 1.0d).iiIliillii(this).iiIliillii(iILiI1lll(d, 1.0d));
    }

    public i1iiLIil1ILi IilL11ii1I1Il(C0363o0OOOo0O o0oooo0o) {
        return Ii1liIIIiLi(((double) o0oooo0o.illlI1lLIL()) / ((double) o0oooo0o.iiI1L1iI()));
    }

    public void i1L1lLllLLlIi(float[] fArr) {
        fArr[0] = (float) this.iiI1L1iI;
        fArr[1] = (float) this.i1LIL11l;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) this.illlI1lLIL;
        fArr[5] = (float) this.il1LilLllii;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = (float) this.iiIliillii;
        fArr[13] = (float) this.iilLil1i11I1;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public i1iiLIil1ILi i1LIL11l() {
        return iL1LIlIlI(0.5d, 0.5d).iiIliillii(this).iiIliillii(iL1LIlIlI(-0.5d, -0.5d));
    }

    public C0293o0O0O0oo iiI1L1iI(C0293o0O0O0oo o0o0o0oo) {
        int iiI1L1iI2 = o0o0o0oo.iiI1L1iI();
        double d = (double) iiI1L1iI2;
        double i1LIL11l2 = (double) o0o0o0oo.i1LIL11l();
        return new C0293o0O0O0oo((int) ((this.iiI1L1iI * d) + (this.illlI1lLIL * i1LIL11l2) + this.iiIliillii), (int) ((this.i1LIL11l * d) + (this.il1LilLllii * i1LIL11l2) + this.iilLil1i11I1));
    }

    public i1iiLIil1ILi iiIliillii(i1iiLIil1ILi i1iiliil1ili) {
        i1iiLIil1ILi i1iiliil1ili2 = i1iiliil1ili;
        if (i1iiliil1ili2 == null) {
            return this;
        }
        double d = this.iiI1L1iI;
        double d2 = i1iiliil1ili2.iiI1L1iI;
        double d3 = this.illlI1lLIL;
        double d4 = i1iiliil1ili2.i1LIL11l;
        double d5 = (d * d2) + (d3 * d4);
        double d6 = this.i1LIL11l;
        double d7 = this.il1LilLllii;
        double d8 = (d2 * d6) + (d4 * d7);
        double d9 = i1iiliil1ili2.illlI1lLIL;
        double d10 = i1iiliil1ili2.il1LilLllii;
        double d11 = (d * d9) + (d3 * d10);
        double d12 = (d9 * d6) + (d10 * d7);
        double d13 = i1iiliil1ili2.iiIliillii;
        double d14 = i1iiliil1ili2.iilLil1i11I1;
        return new i1iiLIil1ILi(d5, d8, d11, d12, (d * d13) + (d3 * d14) + this.iiIliillii, (d6 * d13) + (d7 * d14) + this.iilLil1i11I1);
    }

    public i1iiLIil1ILi il1LilLllii() {
        double d = this.iiI1L1iI;
        double d2 = this.il1LilLllii;
        double d3 = this.illlI1lLIL;
        double d4 = this.i1LIL11l;
        double d5 = (d * d2) - (d3 * d4);
        if (d5 == 0.0d) {
            return null;
        }
        double d6 = (-d4) / d5;
        double d7 = d / d5;
        double d8 = (-d3) / d5;
        double d9 = this.iilLil1i11I1;
        double d10 = d2 / d5;
        double d11 = this.iiIliillii;
        return new i1iiLIil1ILi(d10, d6, d8, d7, ((d3 * d9) - (d2 * d11)) / d5, ((d4 * d11) - (d * d9)) / d5);
    }

    public String toString() {
        return C0387o0OOoO0o.iiI1L1iI("Rg==\n", "HSaE1Ivn6e0=\n") + this.iiI1L1iI + C0387o0OOoO0o.iiI1L1iI("Cjk=\n", "Jhnv+64iz3M=\n") + this.illlI1lLIL + C0387o0OOoO0o.iiI1L1iI("yYw=\n", "5awsKXgQrpI=\n") + this.iiIliillii + C0387o0OOoO0o.iiI1L1iI("RGU=\n", "f0XX8jB8LYg=\n") + this.i1LIL11l + C0387o0OOoO0o.iiI1L1iI("l+8=\n", "u8/ZhgChHJI=\n") + this.il1LilLllii + C0387o0OOoO0o.iiI1L1iI("GGU=\n", "NEVPbSf/jkc=\n") + this.iilLil1i11I1 + C0387o0OOoO0o.iiI1L1iI("6A==\n", "tQ/5AMd9l74=\n");
    }
}
