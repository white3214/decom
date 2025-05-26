package top.tntok.autobot;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: top.tntok.autobot.o0OOo0O  reason: case insensitive filesystem */
public final class C0375o0OOo0O {
    public static final int iiIliillii = 308;
    public static final int iilLil1i11I1 = 100;
    public static final int il1LilLllii = 307;
    public final int i1LIL11l;
    public final C0297o0O0Oo iiI1L1iI;
    public final String illlI1lLIL;

    public C0375o0OOo0O(C0297o0O0Oo o0o0oo, int i, String str) {
        this.iiI1L1iI = o0o0oo;
        this.i1LIL11l = i;
        this.illlI1lLIL = str;
    }

    public static C0375o0OOo0O i1LIL11l(String str) throws IOException {
        int i;
        C0297o0O0Oo o0o0oo;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                o0o0oo = C0297o0O0Oo.HTTP_1_0;
            } else if (charAt == 1) {
                o0o0oo = C0297o0O0Oo.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            o0o0oo = C0297o0O0Oo.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C0375o0OOo0O(o0o0oo, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public static C0375o0OOo0O iiI1L1iI(C0337o0O0oooO o0o0oooo) {
        return new C0375o0OOo0O(o0o0oooo.i1L1llI1LlL1l(), o0o0oooo.IiIl11II(), o0o0oooo.iILlLIlli());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.iiI1L1iI == C0297o0O0Oo.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.i1LIL11l);
        if (this.illlI1lLIL != null) {
            sb.append(' ');
            sb.append(this.illlI1lLIL);
        }
        return sb.toString();
    }
}
