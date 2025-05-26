package top.tntok.autobot;

import java.net.Proxy;

/* renamed from: top.tntok.autobot.o0O0ooo  reason: case insensitive filesystem */
public final class C0335o0O0ooo {
    public static boolean i1LIL11l(C0333o0O0ooO0 o0o0ooo0, Proxy.Type type) {
        if (o0o0ooo0.iilLil1i11I1() || type != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public static String iiI1L1iI(C0333o0O0ooO0 o0o0ooo0, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(o0o0ooo0.I11lLL1());
        sb.append(' ');
        if (i1LIL11l(o0o0ooo0, type)) {
            sb.append(o0o0ooo0.IiiL1llIIi());
        } else {
            sb.append(illlI1lLIL(o0o0ooo0.IiiL1llIIi()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String illlI1lLIL(C0109o000oo00 o000oo00) {
        String iLLLILIiLi1Ii = o000oo00.iLLLILIiLi1Ii();
        String iilLiIIIi11i = o000oo00.iilLiIIIi11i();
        if (iilLiIIIi11i == null) {
            return iLLLILIiLi1Ii;
        }
        return iLLLILIiLi1Ii + '?' + iilLiIIIi11i;
    }
}
