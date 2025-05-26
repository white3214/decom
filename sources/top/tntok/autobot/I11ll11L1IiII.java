package top.tntok.autobot;

public class I11ll11L1IiII extends IillLillLLIii {
    public static final int i1LIL11l = 20;
    private static final long serialVersionUID = 1;
    private String fActual;
    private String fExpected;

    public I11ll11L1IiII(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public String getMessage() {
        return new III1ilIlliL(20, this.fExpected, this.fActual).i1LIL11l(super.getMessage());
    }

    public String i1LIL11l() {
        return this.fActual;
    }

    public String illlI1lLIL() {
        return this.fExpected;
    }
}
