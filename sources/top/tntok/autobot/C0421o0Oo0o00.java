package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0Oo0o00  reason: case insensitive filesystem */
public class C0421o0Oo0o00 implements Runnable {
    public static void i1LIL11l() {
        if (iiI1L1iI()) {
            try {
                Ii1l11i1IiL1.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("UACiJDw2\n", "ImXAS1NC6AA=\n"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                System.exit(1);
                throw th;
            }
            System.exit(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean iiI1L1iI() {
        /*
            java.lang.String r0 = "Y8UHonRUCAU+\n"
            java.lang.String r1 = "Tp111xo+bHI=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)
            java.lang.String r1 = "/D1KBLzlvvizZkcFpeE=\n"
            java.lang.String r2 = "0VwtYdKR0pE=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            top.tntok.autobot.o0OO0oo0 r2 = top.tntok.autobot.C0169o00OoOo.iiI1L1iI()
            java.util.List r2 = r2.iiI1L1iI()
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r0)
            if (r4 != 0) goto L_0x0034
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L_0x001c
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0421o0Oo0o00.iiI1L1iI():boolean");
    }

    public void run() {
        while (true) {
            i1LIL11l();
            try {
                Thread.sleep(C0470o0Ooo0Oo.iLLLILIiLi1Ii);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
