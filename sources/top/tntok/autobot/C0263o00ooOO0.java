package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00ooOO0  reason: case insensitive filesystem */
public enum C0263o00ooOO0 {
    i1LIL11l(C0387o0OOoO0o.iiI1L1iI("/g==\n", "zsCrrGnFzUk=\n")),
    illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("cZs=\n", "SKvynj5B1Io=\n")),
    il1LilLllii(C0387o0OOoO0o.iiI1L1iI("f/jp\n", "TsDZ1dWF1dM=\n")),
    iiIliillii(C0387o0OOoO0o.iiI1L1iI("IITC\n", "ErPyMBhwDzs=\n")),
    iilLil1i11I1(C0387o0OOoO0o.iiI1L1iI("DoowYGc=\n", "aOZZEFdzMfM=\n")),
    I11lLL1(C0387o0OOoO0o.iiI1L1iI("toSNlSOl\n", "0Ojk5RqVgS0=\n")),
    iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("Qh2hBPqRJQ==\n", "JHHIdMupFbU=\n")),
    IiIIlIL(C0387o0OOoO0o.iiI1L1iI("chMCDrii4A==\n", "FH9rfoqV0MI=\n"));
    
    private final String name;

    /* renamed from: top.tntok.autobot.o00ooOO0$iiI1L1iI */
    public enum iiI1L1iI {
        i1LIL11l,
        illlI1lLIL,
        il1LilLllii
    }

    /* access modifiers changed from: public */
    C0263o00ooOO0(String str) {
        this.name = str;
    }

    public static C0263o00ooOO0 i1LIL11l(int i) {
        return values()[i];
    }

    public static C0263o00ooOO0 illlI1lLIL(String str) {
        for (C0263o00ooOO0 o00oooo0 : values()) {
            if (o00oooo0.name.equals(str)) {
                return o00oooo0;
            }
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("eZxhQ3XoWb5DgGNIdOtW6kWdZBc6\n", "LPIKLRqfN54=\n") + str);
    }

    public boolean iiIliillii() {
        if ((ordinal() & 4) != 0) {
            return true;
        }
        return false;
    }

    public int il1LilLllii() {
        return ordinal() & 3;
    }
}
