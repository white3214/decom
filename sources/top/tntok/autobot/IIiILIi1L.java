package top.tntok.autobot;

public enum IIiILIi1L {
    i1LIL11l(C0387o0OOoO0o.iiI1L1iI("cFwymCE=\n", "Fi5d9lUdzn0=\n"), 0),
    illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("3uvNMQ==\n", "vIquWlOvNzM=\n"), 1),
    il1LilLllii(C0387o0OOoO0o.iiI1L1iI("VnigVQ55C94=\n", "MwDUMHwXarI=\n"), 2);
    
    private final String name;
    private final int value;

    /* access modifiers changed from: public */
    IIiILIi1L(String str, int i) {
        this.name = str;
        this.value = i;
    }

    public static IIiILIi1L i1LIL11l(String str) {
        for (IIiILIi1L iIiILIi1L : values()) {
            if (str.equals(iIiILIi1L.name)) {
                return iIiILIi1L;
            }
        }
        return null;
    }

    public int illlI1lLIL() {
        return this.value;
    }
}
