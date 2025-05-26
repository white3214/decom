package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOo00  reason: case insensitive filesystem */
public enum C0372o0OOo00 implements ILi1lIlLliLI {
    OVERRIDE_READ_ONLY;

    public static boolean iiI1L1iI(ILi1lIlLliLI[] iLi1lIlLliLIArr) {
        if (!(iLi1lIlLliLIArr == null || iLi1lIlLliLIArr.length == 0)) {
            for (C0372o0OOo00 o0ooo00 : iLi1lIlLliLIArr) {
                if (o0ooo00 == OVERRIDE_READ_ONLY) {
                    return true;
                }
            }
        }
        return false;
    }
}
