package top.tntok.autobot;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import top.tntok.autobot.o00OO00O;
import top.tntok.autobot.o0OO0o00;

/* renamed from: top.tntok.autobot.OooooO0  reason: case insensitive filesystem */
public final class C0047OooooO0 {
    public static final /* synthetic */ boolean IiiL1llIIi = false;
    public final o0OO0o00 I11lLL1;
    public boolean IiIIlIL;
    public final ILl1iII11Ll1 i1LIL11l;
    public C0315o0O0o0oO iLLLILIiLi1Ii;
    public final C0452o0OoOo00 iiI1L1iI;
    public final C0042OoooOo0 iiIliillii;
    public o0OO0OoO iilLiIIIi11i;
    public o0OO0o00.iiI1L1iI iilLil1i11I1;
    public final iiIIl1I il1LilLllii;
    public final C0330o0O0oo0O illlI1lLIL;

    public C0047OooooO0(C0452o0OoOo00 o0oooo00, C0330o0O0oo0O o0o0oo0o, ILl1iII11Ll1 iLl1iII11Ll1, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0) {
        this.iiI1L1iI = o0oooo00;
        this.illlI1lLIL = o0o0oo0o;
        this.i1LIL11l = iLl1iII11Ll1;
        this.il1LilLllii = iiiil1i;
        this.iiIliillii = ooooOo0;
        this.I11lLL1 = new o0OO0o00(iLl1iII11Ll1, o0o0oo0o.iiIliillii, iiiil1i, ooooOo0);
    }

    public final boolean I11lLL1() {
        C0315o0O0o0oO o0o0o0oo = this.iiI1L1iI.IiIIlIL;
        if (o0o0o0oo == null || o0o0o0oo.iILiI1lll != 0 || !C0487o0OooooO.I1IIIi1i1ILl(o0o0o0oo.i1LIL11l().iiI1L1iI().iILiI1lll(), this.i1LIL11l.iILiI1lll())) {
            return false;
        }
        return true;
    }

    public C0046Ooooo0o i1LIL11l(C0240o00oOoOO o00ooooo, o00OO00O.iiI1L1iI iii1l1ii, boolean z) {
        try {
            return il1LilLllii(iii1l1ii.iiIliillii(), iii1l1ii.iLLLILIiLi1Ii(), iii1l1ii.i1LIL11l(), o00ooooo.IliiLiLliIl(), o00ooooo.I1IIIi1i1ILl(), z).Ii1liIIIiLi(o00ooooo, iii1l1ii);
        } catch (C0342o0OO0Ooo e) {
            iLLLILIiLi1Ii();
            throw e;
        } catch (IOException e2) {
            iLLLILIiLi1Ii();
            throw new C0342o0OO0Ooo(e2);
        }
    }

    public void iLLLILIiLi1Ii() {
        synchronized (this.illlI1lLIL) {
            this.IiIIlIL = true;
        }
    }

    public C0315o0O0o0oO iiI1L1iI() {
        return this.iLLLILIiLi1Ii;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean iiIliillii() {
        /*
            r3 = this;
            top.tntok.autobot.o0O0oo0O r0 = r3.illlI1lLIL
            monitor-enter(r0)
            top.tntok.autobot.o0OO0OoO r1 = r3.iilLiIIIi11i     // Catch:{ all -> 0x000a }
            r2 = 1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x000a:
            r1 = move-exception
            goto L_0x0034
        L_0x000c:
            boolean r1 = r3.I11lLL1()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x001e
            top.tntok.autobot.o0OoOo00 r1 = r3.iiI1L1iI     // Catch:{ all -> 0x000a }
            top.tntok.autobot.o0O0o0oO r1 = r1.IiIIlIL     // Catch:{ all -> 0x000a }
            top.tntok.autobot.o0OO0OoO r1 = r1.i1LIL11l()     // Catch:{ all -> 0x000a }
            r3.iilLiIIIi11i = r1     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x001e:
            top.tntok.autobot.o0OO0o00$iiI1L1iI r1 = r3.iilLil1i11I1     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.i1LIL11l()     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x0032
        L_0x0028:
            top.tntok.autobot.o0OO0o00 r1 = r3.I11lLL1     // Catch:{ all -> 0x000a }
            boolean r1 = r1.i1LIL11l()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0047OooooO0.iiIliillii():boolean");
    }

    public boolean iilLil1i11I1() {
        boolean z;
        synchronized (this.illlI1lLIL) {
            z = this.IiIIlIL;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.iL1LIlIlI(r9) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final top.tntok.autobot.C0315o0O0o0oO il1LilLllii(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            top.tntok.autobot.o0O0o0oO r0 = r3.illlI1lLIL(r4, r5, r6, r7, r8)
            top.tntok.autobot.o0O0oo0O r1 = r3.illlI1lLIL
            monitor-enter(r1)
            int r2 = r0.I1iIiIi     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            boolean r2 = r0.i111iLiiIIill()     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return r0
        L_0x0013:
            r4 = move-exception
            goto L_0x0021
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            boolean r1 = r0.iL1LIlIlI(r9)
            if (r1 != 0) goto L_0x0020
            r0.I1l1iIll1lIi1()
            goto L_0x0000
        L_0x0020:
            return r0
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0047OooooO0.il1LilLllii(int, int, int, int, boolean, boolean):top.tntok.autobot.o0O0o0oO");
    }

    public final C0315o0O0o0oO illlI1lLIL(int i, int i2, int i3, int i4, boolean z) throws IOException {
        C0315o0O0o0oO o0o0o0oo;
        Socket socket;
        Socket socket2;
        C0315o0O0o0oO o0o0o0oo2;
        boolean z2;
        o0OO0OoO o0oo0ooo;
        boolean z3;
        List<o0OO0OoO> list;
        o0OO0o00.iiI1L1iI iii1l1ii;
        synchronized (this.illlI1lLIL) {
            try {
                if (!this.iiI1L1iI.IiIIlIL()) {
                    this.IiIIlIL = false;
                    C0452o0OoOo00 o0oooo00 = this.iiI1L1iI;
                    o0o0o0oo = o0oooo00.IiIIlIL;
                    socket = null;
                    if (o0o0o0oo == null || !o0o0o0oo.IiiL1llIIi) {
                        socket2 = null;
                    } else {
                        socket2 = o0oooo00.i1L1lLllLLlIi();
                    }
                    C0452o0OoOo00 o0oooo002 = this.iiI1L1iI;
                    o0o0o0oo2 = o0oooo002.IiIIlIL;
                    if (o0o0o0oo2 != null) {
                        o0o0o0oo = null;
                    } else {
                        o0o0o0oo2 = null;
                    }
                    if (o0o0o0oo2 == null) {
                        if (this.illlI1lLIL.IiiL1llIIi(this.i1LIL11l, o0oooo002, (List<o0OO0OoO>) null, false)) {
                            o0o0o0oo2 = this.iiI1L1iI.IiIIlIL;
                            o0oo0ooo = null;
                            z2 = true;
                        } else {
                            o0oo0ooo = this.iilLiIIIi11i;
                            if (o0oo0ooo != null) {
                                this.iilLiIIIi11i = null;
                            } else if (I11lLL1()) {
                                o0oo0ooo = this.iiI1L1iI.IiIIlIL.i1LIL11l();
                            }
                            z2 = false;
                        }
                    }
                    o0oo0ooo = null;
                    z2 = false;
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        C0487o0OooooO.IiIIlIL(socket2);
        if (o0o0o0oo != null) {
            this.iiIliillii.IiIIlIL(this.il1LilLllii, o0o0o0oo);
        }
        if (z2) {
            this.iiIliillii.iLLLILIiLi1Ii(this.il1LilLllii, o0o0o0oo2);
        }
        if (o0o0o0oo2 != null) {
            return o0o0o0oo2;
        }
        if (o0oo0ooo != null || ((iii1l1ii = this.iilLil1i11I1) != null && iii1l1ii.i1LIL11l())) {
            z3 = false;
        } else {
            this.iilLil1i11I1 = this.I11lLL1.il1LilLllii();
            z3 = true;
        }
        synchronized (this.illlI1lLIL) {
            try {
                if (!this.iiI1L1iI.IiIIlIL()) {
                    if (z3) {
                        list = this.iilLil1i11I1.iiI1L1iI();
                        if (this.illlI1lLIL.IiiL1llIIi(this.i1LIL11l, this.iiI1L1iI, list, false)) {
                            o0o0o0oo2 = this.iiI1L1iI.IiIIlIL;
                            z2 = true;
                        }
                    } else {
                        list = null;
                    }
                    if (!z2) {
                        if (o0oo0ooo == null) {
                            o0oo0ooo = this.iilLil1i11I1.illlI1lLIL();
                        }
                        o0o0o0oo2 = new C0315o0O0o0oO(this.illlI1lLIL, o0oo0ooo);
                        this.iLLLILIiLi1Ii = o0o0o0oo2;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        if (z2) {
            this.iiIliillii.iLLLILIiLi1Ii(this.il1LilLllii, o0o0o0oo2);
            return o0o0o0oo2;
        }
        o0o0o0oo2.iLLLILIiLi1Ii(i, i2, i3, i4, z, this.il1LilLllii, this.iiIliillii);
        this.illlI1lLIL.iiIliillii.iiI1L1iI(o0o0o0oo2.i1LIL11l());
        synchronized (this.illlI1lLIL) {
            try {
                this.iLLLILIiLi1Ii = null;
                if (this.illlI1lLIL.IiiL1llIIi(this.i1LIL11l, this.iiI1L1iI, list, true)) {
                    o0o0o0oo2.IiiL1llIIi = true;
                    socket = o0o0o0oo2.illlI1lLIL();
                    o0o0o0oo2 = this.iiI1L1iI.IiIIlIL;
                    this.iilLiIIIi11i = o0oo0ooo;
                } else {
                    this.illlI1lLIL.iilLiIIIi11i(o0o0o0oo2);
                    this.iiI1L1iI.iiI1L1iI(o0o0o0oo2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C0487o0OooooO.IiIIlIL(socket);
        this.iiIliillii.iLLLILIiLi1Ii(this.il1LilLllii, o0o0o0oo2);
        return o0o0o0oo2;
    }
}
