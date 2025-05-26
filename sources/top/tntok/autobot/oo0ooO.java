package top.tntok.autobot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import top.tntok.autobot.C0333o0O0ooO0;

public final class oo0ooO implements o00OO00O {
    public static final int i1LIL11l = 20;
    public final C0240o00oOoOO iiI1L1iI;

    public oo0ooO(C0240o00oOoOO o00ooooo) {
        this.iiI1L1iI = o00ooooo;
    }

    public final C0333o0O0ooO0 i1LIL11l(C0337o0O0oooO o0o0oooo, @Nullable o0OO0OoO o0oo0ooo) throws IOException {
        String ilLIlL1ILi;
        C0109o000oo00 i1iLlIill1I;
        Proxy proxy;
        if (o0o0oooo != null) {
            int IiIl11II = o0o0oooo.IiIl11II();
            String I11lLL1 = o0o0oooo.i11iLLllliI().I11lLL1();
            C0334o0O0ooOO o0o0oooo2 = null;
            if (IiIl11II == 307 || IiIl11II == 308) {
                if (!I11lLL1.equals("GET") && !I11lLL1.equals("HEAD")) {
                    return null;
                }
            } else if (IiIl11II == 401) {
                return this.iiI1L1iI.iilLil1i11I1().iiI1L1iI(o0oo0ooo, o0o0oooo);
            } else {
                if (IiIl11II != 503) {
                    if (IiIl11II == 407) {
                        if (o0oo0ooo != null) {
                            proxy = o0oo0ooo.i1LIL11l();
                        } else {
                            proxy = this.iiI1L1iI.i1iI1iiLL1();
                        }
                        if (proxy.type() == Proxy.Type.HTTP) {
                            return this.iiI1L1iI.IIlL1llI1().iiI1L1iI(o0oo0ooo, o0o0oooo);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (IiIl11II != 408) {
                        switch (IiIl11II) {
                            case Il1lL1lLIL.il1LilLllii:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.iiI1L1iI.I1IIIi1i1ILl()) {
                        return null;
                    } else {
                        C0334o0O0ooOO iiI1L1iI2 = o0o0oooo.i11iLLllliI().iiI1L1iI();
                        if (iiI1L1iI2 != null && iiI1L1iI2.IiIIlIL()) {
                            return null;
                        }
                        if ((o0o0oooo.ILIiLLLL1iiii() == null || o0o0oooo.ILIiLLLL1iiii().IiIl11II() != 408) && iilLil1i11I1(o0o0oooo, 0) <= 0) {
                            return o0o0oooo.i11iLLllliI();
                        }
                        return null;
                    }
                } else if ((o0o0oooo.ILIiLLLL1iiii() == null || o0o0oooo.ILIiLLLL1iiii().IiIl11II() != 503) && iilLil1i11I1(o0o0oooo, Integer.MAX_VALUE) == 0) {
                    return o0o0oooo.i11iLLllliI();
                } else {
                    return null;
                }
            }
            if (!this.iiI1L1iI.Ii1liIIIiLi() || (ilLIlL1ILi = o0o0oooo.ilLIlL1ILi("Location")) == null || (i1iLlIill1I = o0o0oooo.i11iLLllliI().IiiL1llIIi().i1iLlIill1I(ilLIlL1ILi)) == null) {
                return null;
            }
            if (!i1iLlIill1I.illi1LIILLiL().equals(o0o0oooo.i11iLLllliI().IiiL1llIIi().illi1LIILLiL()) && !this.iiI1L1iI.IilL11ii1I1Il()) {
                return null;
            }
            C0333o0O0ooO0.iiI1L1iI iLLLILIiLi1Ii = o0o0oooo.i11iLLllliI().iLLLILIiLi1Ii();
            if (C0106o000oOoo.i1LIL11l(I11lLL1)) {
                boolean il1LilLllii = C0106o000oOoo.il1LilLllii(I11lLL1);
                if (C0106o000oOoo.illlI1lLIL(I11lLL1)) {
                    iLLLILIiLi1Ii.iilLiIIIi11i("GET", (C0334o0O0ooOO) null);
                } else {
                    if (il1LilLllii) {
                        o0o0oooo2 = o0o0oooo.i11iLLllliI().iiI1L1iI();
                    }
                    iLLLILIiLi1Ii.iilLiIIIi11i(I11lLL1, o0o0oooo2);
                }
                if (!il1LilLllii) {
                    iLLLILIiLi1Ii.i1L1lLllLLlIi("Transfer-Encoding");
                    iLLLILIiLi1Ii.i1L1lLllLLlIi("Content-Length");
                    iLLLILIiLi1Ii.i1L1lLllLLlIi("Content-Type");
                }
            }
            if (!C0487o0OooooO.I1IIIi1i1ILl(o0o0oooo.i11iLLllliI().IiiL1llIIi(), i1iLlIill1I)) {
                iLLLILIiLi1Ii.i1L1lLllLLlIi("Authorization");
            }
            return iLLLILIiLi1Ii.IilL11ii1I1Il(i1iLlIill1I).i1LIL11l();
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        r1.iilLil1i11I1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public top.tntok.autobot.C0337o0O0oooO iiI1L1iI(top.tntok.autobot.o00OO00O.iiI1L1iI r9) throws java.io.IOException {
        /*
            r8 = this;
            top.tntok.autobot.o0O0ooO0 r0 = r9.iiI1L1iI()
            top.tntok.autobot.oooOO0 r9 = (top.tntok.autobot.C0549oooOO0) r9
            top.tntok.autobot.o0OoOo00 r1 = r9.iILiI1lll()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = 0
        L_0x000e:
            r1.I1iIiIi(r0)
            boolean r6 = r1.IiIIlIL()
            if (r6 != 0) goto L_0x00be
            top.tntok.autobot.o0O0oooO r0 = r9.IiiL1llIIi(r0, r1, r3)     // Catch:{ o0OO0Ooo -> 0x00a9, IOException -> 0x0098 }
            if (r4 == 0) goto L_0x0035
            top.tntok.autobot.o0O0oooO$iiI1L1iI r0 = r0.I1IILIil1lLlL()
            top.tntok.autobot.o0O0oooO$iiI1L1iI r4 = r4.I1IILIil1lLlL()
            top.tntok.autobot.o0O0oooO$iiI1L1iI r4 = r4.i1LIL11l(r3)
            top.tntok.autobot.o0O0oooO r4 = r4.illlI1lLIL()
            top.tntok.autobot.o0O0oooO$iiI1L1iI r0 = r0.i1L1lLllLLlIi(r4)
            top.tntok.autobot.o0O0oooO r0 = r0.illlI1lLIL()
        L_0x0035:
            r4 = r0
            top.tntok.autobot.o00OO00o r0 = top.tntok.autobot.C0139o00OO00o.iiI1L1iI
            top.tntok.autobot.Ooooo00 r0 = r0.iilLil1i11I1(r4)
            if (r0 == 0) goto L_0x0047
            top.tntok.autobot.o0O0o0oO r6 = r0.illlI1lLIL()
            top.tntok.autobot.o0OO0OoO r6 = r6.i1LIL11l()
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            top.tntok.autobot.o0O0ooO0 r6 = r8.i1LIL11l(r4, r6)
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0059
            boolean r9 = r0.iLLLILIiLi1Ii()
            if (r9 == 0) goto L_0x0059
            r1.iL1LIlIlI()
        L_0x0059:
            return r4
        L_0x005a:
            top.tntok.autobot.o0O0ooOO r7 = r6.iiI1L1iI()
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.IiIIlIL()
            if (r7 == 0) goto L_0x0067
            return r4
        L_0x0067:
            top.tntok.autobot.o0O r7 = r4.iiI1L1iI()
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r7)
            boolean r7 = r1.iLLLILIiLi1Ii()
            if (r7 == 0) goto L_0x0077
            r0.iiIliillii()
        L_0x0077:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007f
            r0 = r6
            goto L_0x000e
        L_0x007f:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0096:
            r9 = move-exception
            goto L_0x00ba
        L_0x0098:
            r6 = move-exception
            boolean r7 = r6 instanceof top.tntok.autobot.IliiLiLi     // Catch:{ all -> 0x0096 }
            r7 = r7 ^ 1
            boolean r7 = r8.il1LilLllii(r6, r1, r7, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00a8
        L_0x00a3:
            r1.iilLil1i11I1()
            goto L_0x000e
        L_0x00a8:
            throw r6     // Catch:{ all -> 0x0096 }
        L_0x00a9:
            r6 = move-exception
            java.io.IOException r7 = r6.illlI1lLIL()     // Catch:{ all -> 0x0096 }
            boolean r7 = r8.il1LilLllii(r7, r1, r2, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00b5
            goto L_0x00a3
        L_0x00b5:
            java.io.IOException r9 = r6.i1LIL11l()     // Catch:{ all -> 0x0096 }
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x00ba:
            r1.iilLil1i11I1()
            throw r9
        L_0x00be:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.oo0ooO.iiI1L1iI(top.tntok.autobot.o00OO00O$iiI1L1iI):top.tntok.autobot.o0O0oooO");
    }

    public final boolean iiIliillii(IOException iOException, C0333o0O0ooO0 o0o0ooo0) {
        C0334o0O0ooOO iiI1L1iI2 = o0o0ooo0.iiI1L1iI();
        if ((iiI1L1iI2 == null || !iiI1L1iI2.IiIIlIL()) && !(iOException instanceof FileNotFoundException)) {
            return false;
        }
        return true;
    }

    public final int iilLil1i11I1(C0337o0O0oooO o0o0oooo, int i) {
        String ilLIlL1ILi = o0o0oooo.ilLIlL1ILi("Retry-After");
        if (ilLIlL1ILi == null) {
            return i;
        }
        if (ilLIlL1ILi.matches("\\d+")) {
            return Integer.valueOf(ilLIlL1ILi).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean il1LilLllii(IOException iOException, C0452o0OoOo00 o0oooo00, boolean z, C0333o0O0ooO0 o0o0ooo0) {
        if (!this.iiI1L1iI.I1IIIi1i1ILl()) {
            return false;
        }
        if ((!z || !iiIliillii(iOException, o0o0ooo0)) && illlI1lLIL(iOException, z) && o0oooo00.illlI1lLIL()) {
            return true;
        }
        return false;
    }

    public final boolean illlI1lLIL(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }
}
