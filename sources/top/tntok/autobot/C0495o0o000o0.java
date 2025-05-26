package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0o000o0  reason: case insensitive filesystem */
public enum C0495o0o000o0 {
    i1LIL11l(C0387o0OOoO0o.iiI1L1iI("JNJrCR57dA==\n", "QLsYeXIaDYc=\n")),
    illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("DXxSzGvb\n", "bh0/qRm6WgM=\n"));
    
    private final String name;

    /* access modifiers changed from: public */
    C0495o0o000o0(String str) {
        this.name = str;
    }

    public static C0495o0o000o0 i1LIL11l(String str) {
        for (C0495o0o000o0 o0o000o0 : values()) {
            if (str.equals(o0o000o0.name)) {
                return o0o000o0;
            }
        }
        return null;
    }
}
