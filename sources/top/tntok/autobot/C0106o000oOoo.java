package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o000oOoo  reason: case insensitive filesystem */
public final class C0106o000oOoo {
    public static boolean i1LIL11l(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static boolean iiI1L1iI(String str) {
        if (str.equals(o00Oo00.IL1lILLLL1L) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean iiIliillii(String str) {
        if (str.equals(o00Oo00.IL1lILLLL1L) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    public static boolean il1LilLllii(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean illlI1lLIL(String str) {
        return !str.equals("PROPFIND");
    }
}
