package top.tntok.autobot;

import top.tntok.autobot.iIII1lLI111;

public enum iLiI1Llil implements iIII1lLI111 {
    i1LIL11l(1869641075, C0387o0OOoO0o.iiI1L1iI("pWJNnA==\n", "yhI47+IECU4=\n"), C0387o0OOoO0o.iiI1L1iI("ZJTZKG6eBDNwkg==\n", "BeG9QQGxa0M=\n")),
    illlI1lLIL(6381923, C0387o0OOoO0o.iiI1L1iI("J8/b\n", "Rq64dJnfLWs=\n"), C0387o0OOoO0o.iiI1L1iI("zPd43AA3seqZ4zHZDmyx\n", "rYIctW8Y3Jo=\n")),
    il1LilLllii(1718378851, C0387o0OOoO0o.iiI1L1iI("9tLvbw==\n", "kL6ODH1/ZQo=\n"), C0387o0OOoO0o.iiI1L1iI("/VsBdu868ZL9TQ==\n", "nC5lH4AVl/4=\n")),
    iiIliillii(7496055, C0387o0OOoO0o.iiI1L1iI("7y+e\n", "nU7pXwSXIMw=\n"), C0387o0OOoO0o.iiI1L1iI("cz8wFmyxogBl\n", "EkpUfwOe0GE=\n"));
    
    private final int id;
    private final String mimeType;
    private final String name;

    /* access modifiers changed from: public */
    iLiI1Llil(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.mimeType = str2;
    }

    public static iLiI1Llil iilLil1i11I1(String str) {
        for (iLiI1Llil ilii1llil : values()) {
            if (ilii1llil.name.equals(str)) {
                return ilii1llil;
            }
        }
        return null;
    }

    public int i1LIL11l() {
        return this.id;
    }

    public String iiI1L1iI() {
        return this.name;
    }

    public String il1LilLllii() {
        return this.mimeType;
    }

    public iIII1lLI111.iiI1L1iI illlI1lLIL() {
        return iIII1lLI111.iiI1L1iI.illlI1lLIL;
    }
}
