package top.tntok.autobot;

public enum II1l1IliI1Li1 {
    i1LIL11l(C0387o0OOoO0o.iiI1L1iI("N5A4SQFX\n", "WOVMOXQjXfg=\n")),
    illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("bMdZ\n", "Aa466/IooIs=\n")),
    il1LilLllii(C0387o0OOoO0o.iiI1L1iI("bNZnmu+NOeQ=\n", "HLoG443sWo8=\n"));
    
    private final String name;

    /* access modifiers changed from: public */
    II1l1IliI1Li1(String str) {
        this.name = str;
    }

    public static II1l1IliI1Li1 i1LIL11l(String str) {
        for (II1l1IliI1Li1 iI1l1IliI1Li1 : values()) {
            if (str.equals(iI1l1IliI1Li1.name)) {
                return iI1l1IliI1Li1;
            }
        }
        return null;
    }

    public boolean illlI1lLIL() {
        if (this != il1LilLllii) {
            return true;
        }
        return false;
    }
}
