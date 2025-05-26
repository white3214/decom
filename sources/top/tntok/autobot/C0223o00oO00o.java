package top.tntok.autobot;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: top.tntok.autobot.o00oO00o  reason: case insensitive filesystem */
public abstract class C0223o00oO00o extends C0222o00oO00O {
    public static final String I1I11Il1 = "sec-websocket-version";
    public static final String I1IIIi1i1ILl = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final String IIlL1llI1 = "sec-websocket-key";
    public static final String IL111l1 = "sec-websocket-accept";
    public static final Logger ILl1iII11Ll1 = Logger.getLogger(C0223o00oO00o.class.getName());
    public static final char[] IilliIIIlI1ll = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final String IliiLiLliIl = "Upgrade";
    public static final String i11liIIl11Ii1 = "websocket";
    public static final String i1iI1iiLL1 = "13";
    public static final String i1iiLIil1ILi = "upgrade";
    public static final String iiiiI1iILL11I = "connection";
    public static final String il1l1IlL = "sec-websocket-protocol";

    /* renamed from: top.tntok.autobot.o00oO00o$iiI1L1iI */
    public final class iiI1L1iI implements C0117o000oooO<C0115o000ooo, C0338o0O0oooo> {
        public iiI1L1iI() {
        }

        /* renamed from: i1LIL11l */
        public C0338o0O0oooo iiI1L1iI(C0115o000ooo o000ooo) {
            return C0223o00oO00o.this.IL1IiilLlLI(o000ooo);
        }
    }

    public C0223o00oO00o(int i) {
        super(i);
        iiI1L1iI(new iiI1L1iI());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (r0 != 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String IIIlll1lll(byte[] r13) {
        /*
            int r0 = r13.length
            int r1 = r0 + 2
            int r1 = r1 / 3
            int r1 = r1 * 4
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000c:
            r5 = 2
            if (r3 >= r0) goto L_0x0059
            int r6 = r3 + 1
            byte r7 = r13[r3]
            if (r6 >= r0) goto L_0x001a
            int r3 = r3 + 2
            byte r6 = r13[r6]
            goto L_0x001c
        L_0x001a:
            r3 = r6
            r6 = 0
        L_0x001c:
            if (r3 >= r0) goto L_0x0023
            int r8 = r3 + 1
            byte r3 = r13[r3]
            goto L_0x0025
        L_0x0023:
            r8 = r3
            r3 = 0
        L_0x0025:
            int r9 = r4 + 1
            char[] r10 = IilliIIIlI1ll
            int r11 = r7 >> 2
            r11 = r11 & 63
            char r11 = r10[r11]
            r1[r4] = r11
            int r11 = r4 + 2
            int r7 = r7 << 4
            r12 = r6 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 4
            r7 = r7 | r12
            r7 = r7 & 63
            char r7 = r10[r7]
            r1[r9] = r7
            int r7 = r4 + 3
            int r5 = r6 << 2
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> 6
            r5 = r5 | r6
            r5 = r5 & 63
            char r5 = r10[r5]
            r1[r11] = r5
            int r4 = r4 + 4
            r3 = r3 & 63
            char r3 = r10[r3]
            r1[r7] = r3
            r3 = r8
            goto L_0x000c
        L_0x0059:
            int r0 = r0 % 3
            r13 = 61
            r2 = 1
            if (r0 == r2) goto L_0x0063
            if (r0 == r5) goto L_0x0067
            goto L_0x006b
        L_0x0063:
            int r4 = r4 + -1
            r1[r4] = r13
        L_0x0067:
            int r4 = r4 + -1
            r1[r4] = r13
        L_0x006b:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0223o00oO00o.IIIlll1lll(byte[]):java.lang.String");
    }

    public static String iliilLllIl1(String str) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        String str2 = str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        instance.update(str2.getBytes(), 0, str2.length());
        return IIIlll1lll(instance.digest());
    }

    public final boolean IILiIL1i11Li(Map<String, String> map) {
        String str = map.get("connection");
        if (str == null || !str.toLowerCase().contains(IliiLiLliIl.toLowerCase())) {
            return false;
        }
        return true;
    }

    public boolean IIlLill(C0115o000ooo o000ooo) {
        Map<String, String> I11lLL1 = o000ooo.I11lLL1();
        boolean IILiIL1i11Li = IILiIL1i11Li(I11lLL1);
        if (!i11liIIl11Ii1.equalsIgnoreCase(I11lLL1.get("upgrade")) || !IILiIL1i11Li) {
            return false;
        }
        return true;
    }

    public C0338o0O0oooo IL1IiilLlLI(C0115o000ooo o000ooo) {
        Map<String, String> I11lLL1 = o000ooo.I11lLL1();
        if (!IIlLill(o000ooo)) {
            return null;
        }
        if (!i1iI1iiLL1.equalsIgnoreCase(I11lLL1.get(I1I11Il1))) {
            C0376o0OOo0O0 o0ooo0o0 = C0376o0OOo0O0.BAD_REQUEST;
            return C0338o0O0oooo.I1IILIil1lLlL(o0ooo0o0, C0222o00oO00O.i111iLiiIIill, "Invalid Websocket-Version " + I11lLL1.get(I1I11Il1));
        } else if (!I11lLL1.containsKey(IIlL1llI1)) {
            return C0338o0O0oooo.I1IILIil1lLlL(C0376o0OOo0O0.BAD_REQUEST, C0222o00oO00O.i111iLiiIIill, "Missing Websocket-Key");
        } else {
            C0338o0O0oooo IiIIlIL = illiiliIILI(o000ooo).IiIIlIL();
            try {
                IiIIlIL.il1LilLllii(IL111l1, iliilLllIl1(I11lLL1.get(IIlL1llI1)));
                if (I11lLL1.containsKey(il1l1IlL)) {
                    IiIIlIL.il1LilLllii(il1l1IlL, I11lLL1.get(il1l1IlL).split(",")[0]);
                }
                return IiIIlIL;
            } catch (NoSuchAlgorithmException unused) {
                return C0338o0O0oooo.I1IILIil1lLlL(C0376o0OOo0O0.INTERNAL_ERROR, C0222o00oO00O.i111iLiiIIill, "The SHA-1 Algorithm required for websockets is not available on the server.");
            }
        }
    }

    public abstract C0499o0o00O0 illiiliIILI(C0115o000ooo o000ooo);

    public C0223o00oO00o(String str, int i) {
        super(str, i);
        iiI1L1iI(new iiI1L1iI());
    }
}
