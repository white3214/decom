package top.tntok.autobot;

import top.tntok.autobot.iIII1lLI111;

/* renamed from: top.tntok.autobot.o0o000OO  reason: case insensitive filesystem */
public enum C0493o0o000OO implements iIII1lLI111 {
    i1LIL11l(1748121140, C0387o0OOoO0o.iiI1L1iI("hX+WKg==\n", "7U2gHquwHVU=\n"), C0387o0OOoO0o.iiI1L1iI("38foW9mq+UPK\n", "qa6MPraFmDU=\n")),
    illlI1lLIL(1748121141, C0387o0OOoO0o.iiI1L1iI("o38fiA==\n", "y00pvaTdQTQ=\n"), C0387o0OOoO0o.iiI1L1iI("R6pacHf1p4pHoA==\n", "McM+FRjaz+8=\n")),
    il1LilLllii(6387249, C0387o0OOoO0o.iiI1L1iI("tBeQ\n", "1WGhgigOaLI=\n"), C0387o0OOoO0o.iiI1L1iI("akn9ihAUrHosEQ==\n", "HCCZ7387zQw=\n"));
    
    private final int id;
    private final String mimeType;
    private final String name;

    /* access modifiers changed from: public */
    C0493o0o000OO(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.mimeType = str2;
    }

    public static C0493o0o000OO iilLil1i11I1(String str) {
        for (C0493o0o000OO o0o000oo : values()) {
            if (o0o000oo.name.equals(str)) {
                return o0o000oo;
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
        return iIII1lLI111.iiI1L1iI.i1LIL11l;
    }
}
