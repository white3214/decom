package top.tntok.autobot;

public class iiiL1LIIllL extends AssertionError {
    public static final int i1LIL11l = 20;
    private static final long serialVersionUID = 1;
    private String fActual;
    private String fExpected;

    public static class i1LIL11l {
        public static final String iiIliillii = "]";
        public static final String iilLil1i11I1 = "[";
        public static final String il1LilLllii = "...";
        public final String i1LIL11l;
        public final int iiI1L1iI;
        public final String illlI1lLIL;

        public class iiI1L1iI {
            public final String i1LIL11l;
            public final String iiI1L1iI;

            public String i1LIL11l() {
                if (this.iiI1L1iI.length() <= i1LIL11l.this.iiI1L1iI) {
                    return this.iiI1L1iI;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("...");
                String str = this.iiI1L1iI;
                sb.append(str.substring(str.length() - i1LIL11l.this.iiI1L1iI));
                return sb.toString();
            }

            public String iiI1L1iI() {
                return iiIliillii(i1LIL11l.this.illlI1lLIL);
            }

            public final String iiIliillii(String str) {
                return "[" + str.substring(this.iiI1L1iI.length(), str.length() - this.i1LIL11l.length()) + "]";
            }

            public String il1LilLllii() {
                return iiIliillii(i1LIL11l.this.i1LIL11l);
            }

            public String illlI1lLIL() {
                if (this.i1LIL11l.length() <= i1LIL11l.this.iiI1L1iI) {
                    return this.i1LIL11l;
                }
                return this.i1LIL11l.substring(0, i1LIL11l.this.iiI1L1iI) + "...";
            }

            public iiI1L1iI() {
                String iiI1L1iI2 = i1LIL11l.this.I11lLL1();
                this.iiI1L1iI = iiI1L1iI2;
                this.i1LIL11l = i1LIL11l.this.iLLLILIiLi1Ii(iiI1L1iI2);
            }
        }

        public i1LIL11l(int i, String str, String str2) {
            this.iiI1L1iI = i;
            this.i1LIL11l = str;
            this.illlI1lLIL = str2;
        }

        public final String I11lLL1() {
            int min = Math.min(this.i1LIL11l.length(), this.illlI1lLIL.length());
            for (int i = 0; i < min; i++) {
                if (this.i1LIL11l.charAt(i) != this.illlI1lLIL.charAt(i)) {
                    return this.i1LIL11l.substring(0, i);
                }
            }
            return this.i1LIL11l.substring(0, min);
        }

        public final String iLLLILIiLi1Ii(String str) {
            int min = Math.min(this.i1LIL11l.length() - str.length(), this.illlI1lLIL.length() - str.length()) - 1;
            int i = 0;
            while (i <= min) {
                String str2 = this.i1LIL11l;
                char charAt = str2.charAt((str2.length() - 1) - i);
                String str3 = this.illlI1lLIL;
                if (charAt != str3.charAt((str3.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str4 = this.i1LIL11l;
            return str4.substring(str4.length() - i);
        }

        public String iilLil1i11I1(String str) {
            String str2;
            String str3 = this.i1LIL11l;
            if (str3 == null || (str2 = this.illlI1lLIL) == null || str3.equals(str2)) {
                return Il1llillili.IllLlI1IiIL(str, this.i1LIL11l, this.illlI1lLIL);
            }
            iiI1L1iI iii1l1ii = new iiI1L1iI();
            String i1LIL11l2 = iii1l1ii.i1LIL11l();
            String illlI1lLIL2 = iii1l1ii.illlI1lLIL();
            return Il1llillili.IllLlI1IiIL(str, i1LIL11l2 + iii1l1ii.il1LilLllii() + illlI1lLIL2, i1LIL11l2 + iii1l1ii.iiI1L1iI() + illlI1lLIL2);
        }
    }

    public iiiL1LIIllL(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public String getMessage() {
        return new i1LIL11l(20, this.fExpected, this.fActual).iilLil1i11I1(super.getMessage());
    }

    public String i1LIL11l() {
        return this.fExpected;
    }

    public String iiI1L1iI() {
        return this.fActual;
    }
}
