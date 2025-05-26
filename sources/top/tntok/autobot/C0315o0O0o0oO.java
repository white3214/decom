package top.tntok.autobot;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import top.tntok.autobot.C0097o000o0O;
import top.tntok.autobot.C0317o0O0oO;
import top.tntok.autobot.C0333o0O0ooO0;
import top.tntok.autobot.C0337o0O0oooO;
import top.tntok.autobot.o00OO00O;

/* renamed from: top.tntok.autobot.o0O0o0oO  reason: case insensitive filesystem */
public final class C0315o0O0o0oO extends C0097o000o0O.iilLiIIIi11i implements ILILl1IL1Iil {
    public static final /* synthetic */ boolean I1l1iIll1lIi1 = false;
    public static final String Ii1liIIIiLi = "throw with null exception";
    public static final int IilL11ii1I1Il = 21;
    public C0297o0O0Oo I11lLL1;
    public int I1iIiIi;
    public int IL1lILLLL1L = 1;
    public ILL1iL1LiiI IiIIlIL;
    public boolean IiiL1llIIi;
    public long i111iLiiIIill = Long.MAX_VALUE;
    public int i1L1lLllLLlIi;
    public final C0330o0O0oo0O i1LIL11l;
    public int iILiI1lll;
    public final List<Reference<C0452o0OoOo00>> iL1LIlIlI = new ArrayList();
    public C0097o000o0O iLLLILIiLi1Ii;
    public Socket iiIliillii;
    public Iiii1LiI11i iilLiIIIi11i;
    public C0082o000Oo iilLil1i11I1;
    public Socket il1LilLllii;
    public final o0OO0OoO illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0O0o0oO$iiI1L1iI */
    public class iiI1L1iI extends C0317o0O0oO.iilLil1i11I1 {
        public final /* synthetic */ C0045Ooooo00 iiIliillii;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public iiI1L1iI(boolean z, ILL1iL1LiiI iLL1iL1LiiI, Iiii1LiI11i iiii1LiI11i, C0045Ooooo00 ooooo00) {
            super(z, iLL1iL1LiiI, iiii1LiI11i);
            this.iiIliillii = ooooo00;
        }

        public void close() throws IOException {
            this.iiIliillii.iiI1L1iI(-1, true, true, (IOException) null);
        }
    }

    public C0315o0O0o0oO(C0330o0O0oo0O o0o0oo0o, o0OO0OoO o0oo0ooo) {
        this.i1LIL11l = o0o0oo0o;
        this.illlI1lLIL = o0oo0ooo;
    }

    public static C0315o0O0o0oO i11liIIl11Ii1(C0330o0O0oo0O o0o0oo0o, o0OO0OoO o0oo0ooo, Socket socket, long j) {
        C0315o0O0o0oO o0o0o0oo = new C0315o0O0o0oO(o0o0oo0o, o0oo0ooo);
        o0o0o0oo.iiIliillii = socket;
        o0o0o0oo.i111iLiiIIill = j;
        return o0o0o0oo;
    }

    public void I11lLL1() {
        C0487o0OooooO.IiIIlIL(this.il1LilLllii);
    }

    public final C0333o0O0ooO0 I1iIiIi() throws IOException {
        C0333o0O0ooO0 i1LIL11l2 = new C0333o0O0ooO0.iiI1L1iI().IilL11ii1I1Il(this.illlI1lLIL.iiI1L1iI().iILiI1lll()).iilLiIIIi11i("CONNECT", (C0334o0O0ooOO) null).iLLLILIiLi1Ii("Host", C0487o0OooooO.I1l1iIll1lIi1(this.illlI1lLIL.iiI1L1iI().iILiI1lll(), true)).iLLLILIiLi1Ii("Proxy-Connection", "Keep-Alive").iLLLILIiLi1Ii("User-Agent", C0491o0o000O.iiI1L1iI()).i1LIL11l();
        C0333o0O0ooO0 iiI1L1iI2 = this.illlI1lLIL.iiI1L1iI().iLLLILIiLi1Ii().iiI1L1iI(this.illlI1lLIL, new C0337o0O0oooO.iiI1L1iI().Ii1liIIIiLi(i1LIL11l2).IL1lILLLL1L(C0297o0O0Oo.HTTP_1_1).I11lLL1(407).iILiI1lll("Preemptive Authenticate").i1LIL11l(C0487o0OooooO.il1LilLllii).IilL11ii1I1Il(-1).iL1LIlIlI(-1).IiIIlIL("Proxy-Authenticate", "OkHttp-Preemptive").illlI1lLIL());
        if (iiI1L1iI2 != null) {
            return iiI1L1iI2;
        }
        return i1LIL11l2;
    }

    public void I1l1iIll1lIi1() {
        synchronized (this.i1LIL11l) {
            this.IiiL1llIIi = true;
        }
    }

    public boolean IL1lILLLL1L(ILl1iII11Ll1 iLl1iII11Ll1, @Nullable List<o0OO0OoO> list) {
        if (this.iL1LIlIlI.size() >= this.IL1lILLLL1L || this.IiiL1llIIi || !C0139o00OO00o.iiI1L1iI.iiIliillii(this.illlI1lLIL.iiI1L1iI(), iLl1iII11Ll1)) {
            return false;
        }
        if (iLl1iII11Ll1.iILiI1lll().iL1LIlIlI().equals(i1LIL11l().iiI1L1iI().iILiI1lll().iL1LIlIlI())) {
            return true;
        }
        if (this.iLLLILIiLi1Ii == null || list == null || !iiLIIiIli(list) || iLl1iII11Ll1.iiIliillii() != C0238o00oOoO.iiI1L1iI || !i1iiLIil1ILi(iLl1iII11Ll1.iILiI1lll())) {
            return false;
        }
        try {
            iLl1iII11Ll1.iiI1L1iI().iiI1L1iI(iLl1iII11Ll1.iILiI1lll().iL1LIlIlI(), iiI1L1iI().I11lLL1());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final void ILl1iII11Ll1(int i) throws IOException {
        this.iiIliillii.setSoTimeout(0);
        C0097o000o0O iiI1L1iI2 = new C0097o000o0O.iLLLILIiLi1Ii(true).iilLil1i11I1(this.iiIliillii, this.illlI1lLIL.iiI1L1iI().iILiI1lll().iL1LIlIlI(), this.IiIIlIL, this.iilLiIIIi11i).i1LIL11l(this).illlI1lLIL(i).iiI1L1iI();
        this.iLLLILIiLi1Ii = iiI1L1iI2;
        iiI1L1iI2.iiL1l1iLliL();
    }

    public C0046Ooooo0o Ii1liIIIiLi(C0240o00oOoOO o00ooooo, o00OO00O.iiI1L1iI iii1l1ii) throws SocketException {
        if (this.iLLLILIiLi1Ii != null) {
            return new C0099o000o0OO(o00ooooo, this, iii1l1ii, this.iLLLILIiLi1Ii);
        }
        this.iiIliillii.setSoTimeout(iii1l1ii.iLLLILIiLi1Ii());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.IiIIlIL.timeout().IiIIlIL((long) iii1l1ii.iLLLILIiLi1Ii(), timeUnit);
        this.iilLiIIIi11i.timeout().IiIIlIL((long) iii1l1ii.i1LIL11l(), timeUnit);
        return new C0550oooo00o(o00ooooo, this, this.IiIIlIL, this.iilLiIIIi11i);
    }

    public final void IiIIlIL(int i, int i2, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0) throws IOException {
        Socket socket;
        Proxy i1LIL11l2 = this.illlI1lLIL.i1LIL11l();
        ILl1iII11Ll1 iiI1L1iI2 = this.illlI1lLIL.iiI1L1iI();
        if (i1LIL11l2.type() == Proxy.Type.DIRECT || i1LIL11l2.type() == Proxy.Type.HTTP) {
            socket = iiI1L1iI2.iilLiIIIi11i().createSocket();
        } else {
            socket = new Socket(i1LIL11l2);
        }
        this.il1LilLllii = socket;
        ooooOo0.I11lLL1(iiiil1i, this.illlI1lLIL.il1LilLllii(), i1LIL11l2);
        this.il1LilLllii.setSoTimeout(i2);
        try {
            C0292o0O0O0oO.I1iIiIi().IiIIlIL(this.il1LilLllii, this.illlI1lLIL.il1LilLllii(), i);
            try {
                this.IiIIlIL = C0249o00oo00O.il1LilLllii(C0249o00oo00O.i1L1lLllLLlIi(this.il1LilLllii));
                this.iilLiIIIi11i = C0249o00oo00O.illlI1lLIL(C0249o00oo00O.IiIIlIL(this.il1LilLllii));
            } catch (NullPointerException e) {
                if (Ii1liIIIiLi.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.illlI1lLIL.il1LilLllii());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void IiiL1llIIi(int i, int i2, int i3, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0) throws IOException {
        C0333o0O0ooO0 I1iIiIi2 = I1iIiIi();
        C0109o000oo00 IiiL1llIIi2 = I1iIiIi2.IiiL1llIIi();
        int i4 = 0;
        while (i4 < 21) {
            IiIIlIL(i, i2, iiiil1i, ooooOo0);
            I1iIiIi2 = iILiI1lll(i2, i3, I1iIiIi2, IiiL1llIIi2);
            if (I1iIiIi2 != null) {
                C0487o0OooooO.IiIIlIL(this.il1LilLllii);
                this.il1LilLllii = null;
                this.iilLiIIIi11i = null;
                this.IiIIlIL = null;
                ooooOo0.iiIliillii(iiiil1i, this.illlI1lLIL.il1LilLllii(), this.illlI1lLIL.i1LIL11l(), (C0297o0O0Oo) null);
                i4++;
            } else {
                return;
            }
        }
    }

    public C0317o0O0oO.iilLil1i11I1 IilL11ii1I1Il(C0045Ooooo00 ooooo00) throws SocketException {
        this.iiIliillii.setSoTimeout(0);
        I1l1iIll1lIi1();
        return new iiI1L1iI(true, this.IiIIlIL, this.iilLiIIIi11i, ooooo00);
    }

    public boolean i111iLiiIIill() {
        if (this.iLLLILIiLi1Ii != null) {
            return true;
        }
        return false;
    }

    public final void i1L1lLllLLlIi(iLIililLI11 iliililli11, int i, iiIIl1I iiiil1i, C0042OoooOo0 ooooOo0) throws IOException {
        if (this.illlI1lLIL.iiI1L1iI().IiiL1llIIi() == null) {
            List<C0297o0O0Oo> iilLil1i11I12 = this.illlI1lLIL.iiI1L1iI().iilLil1i11I1();
            C0297o0O0Oo o0o0oo = C0297o0O0Oo.H2_PRIOR_KNOWLEDGE;
            if (iilLil1i11I12.contains(o0o0oo)) {
                this.iiIliillii = this.il1LilLllii;
                this.I11lLL1 = o0o0oo;
                ILl1iII11Ll1(i);
                return;
            }
            this.iiIliillii = this.il1LilLllii;
            this.I11lLL1 = C0297o0O0Oo.HTTP_1_1;
            return;
        }
        ooooOo0.iiiiI1iILL11I(iiiil1i);
        iilLiIIIi11i(iliililli11);
        ooooOo0.i11liIIl11Ii1(iiiil1i, this.iilLil1i11I1);
        if (this.I11lLL1 == C0297o0O0Oo.HTTP_2) {
            ILl1iII11Ll1(i);
        }
    }

    public o0OO0OoO i1LIL11l() {
        return this.illlI1lLIL;
    }

    public boolean i1iiLIil1ILi(C0109o000oo00 o000oo00) {
        if (o000oo00.il1l1IlL() != this.illlI1lLIL.iiI1L1iI().iILiI1lll().il1l1IlL()) {
            return false;
        }
        if (o000oo00.iL1LIlIlI().equals(this.illlI1lLIL.iiI1L1iI().iILiI1lll().iL1LIlIlI())) {
            return true;
        }
        if (this.iilLil1i11I1 == null || !C0238o00oOoO.iiI1L1iI.illlI1lLIL(o000oo00.iL1LIlIlI(), (X509Certificate) this.iilLil1i11I1.I11lLL1().get(0))) {
            return false;
        }
        return true;
    }

    public final C0333o0O0ooO0 iILiI1lll(int i, int i2, C0333o0O0ooO0 o0o0ooo0, C0109o000oo00 o000oo00) throws IOException {
        String str = "CONNECT " + C0487o0OooooO.I1l1iIll1lIi1(o000oo00, true) + " HTTP/1.1";
        while (true) {
            C0550oooo00o oooo00o = new C0550oooo00o((C0240o00oOoOO) null, (C0315o0O0o0oO) null, this.IiIIlIL, this.iilLiIIIi11i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.IiIIlIL.timeout().IiIIlIL((long) i, timeUnit);
            this.iilLiIIIi11i.timeout().IiIIlIL((long) i2, timeUnit);
            oooo00o.il1l1IlL(o0o0ooo0.iiIliillii(), str);
            oooo00o.iiIliillii();
            C0337o0O0oooO illlI1lLIL2 = oooo00o.IiiL1llIIi(false).Ii1liIIIiLi(o0o0ooo0).illlI1lLIL();
            oooo00o.IL111l1(illlI1lLIL2);
            int IiIl11II = illlI1lLIL2.IiIl11II();
            if (IiIl11II != 200) {
                if (IiIl11II == 407) {
                    C0333o0O0ooO0 iiI1L1iI2 = this.illlI1lLIL.iiI1L1iI().iLLLILIiLi1Ii().iiI1L1iI(this.illlI1lLIL, illlI1lLIL2);
                    if (iiI1L1iI2 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(illlI1lLIL2.ilLIlL1ILi("Connection"))) {
                        return iiI1L1iI2;
                    } else {
                        o0o0ooo0 = iiI1L1iI2;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + illlI1lLIL2.IiIl11II());
                }
            } else if (this.IiIIlIL.iLlIllll().Il1llillili() && this.iilLiIIIi11i.illlI1lLIL().Il1llillili()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public boolean iL1LIlIlI(boolean z) {
        int soTimeout;
        if (this.iiIliillii.isClosed() || this.iiIliillii.isInputShutdown() || this.iiIliillii.isOutputShutdown()) {
            return false;
        }
        C0097o000o0O o000o0o = this.iLLLILIiLi1Ii;
        if (o000o0o != null) {
            return o000o0o.ilLIlLiIILl1(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.iiIliillii.getSoTimeout();
                this.iiIliillii.setSoTimeout(1);
                if (this.IiIIlIL.Il1llillili()) {
                    this.iiIliillii.setSoTimeout(soTimeout);
                    return false;
                }
                this.iiIliillii.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.iiIliillii.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iLLLILIiLi1Ii(int r17, int r18, int r19, int r20, boolean r21, top.tntok.autobot.iiIIl1I r22, top.tntok.autobot.C0042OoooOo0 r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            top.tntok.autobot.o0O0Oo r0 = r7.I11lLL1
            if (r0 != 0) goto L_0x0152
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL
            top.tntok.autobot.ILl1iII11Ll1 r0 = r0.iiI1L1iI()
            java.util.List r0 = r0.i1LIL11l()
            top.tntok.autobot.iLIililLI11 r10 = new top.tntok.autobot.iLIililLI11
            r10.<init>(r0)
            top.tntok.autobot.o0OO0OoO r1 = r7.illlI1lLIL
            top.tntok.autobot.ILl1iII11Ll1 r1 = r1.iiI1L1iI()
            javax.net.ssl.SSLSocketFactory r1 = r1.IiiL1llIIi()
            if (r1 != 0) goto L_0x0074
            top.tntok.autobot.ILLiiL1ill1lI r1 = top.tntok.autobot.ILLiiL1ill1lI.iilLiIIIi11i
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL
            top.tntok.autobot.ILl1iII11Ll1 r0 = r0.iiI1L1iI()
            top.tntok.autobot.o000oo00 r0 = r0.iILiI1lll()
            java.lang.String r0 = r0.iL1LIlIlI()
            top.tntok.autobot.o0O0O0oO r1 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()
            boolean r1 = r1.IilL11ii1I1Il(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            top.tntok.autobot.o0OO0Ooo r1 = new top.tntok.autobot.o0OO0Ooo
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            top.tntok.autobot.o0OO0Ooo r0 = new top.tntok.autobot.o0OO0Ooo
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL
            top.tntok.autobot.ILl1iII11Ll1 r0 = r0.iiI1L1iI()
            java.util.List r0 = r0.iilLil1i11I1()
            top.tntok.autobot.o0O0Oo r1 = top.tntok.autobot.C0297o0O0Oo.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0145
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL     // Catch:{ IOException -> 0x00ab }
            boolean r0 = r0.illlI1lLIL()     // Catch:{ IOException -> 0x00ab }
            if (r0 == 0) goto L_0x00b3
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.IiiL1llIIi(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00ab }
            java.net.Socket r0 = r7.il1LilLllii     // Catch:{ IOException -> 0x00ab }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00cf
        L_0x00a4:
            r13 = r17
            r14 = r18
        L_0x00a8:
            r15 = r20
            goto L_0x00bb
        L_0x00ab:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00b0:
            r15 = r20
            goto L_0x0102
        L_0x00b3:
            r13 = r17
            r14 = r18
            r7.IiIIlIL(r13, r14, r8, r9)     // Catch:{ IOException -> 0x0100 }
            goto L_0x00a8
        L_0x00bb:
            r7.i1L1lLllLLlIi(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00fe }
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL     // Catch:{ IOException -> 0x00fe }
            java.net.InetSocketAddress r0 = r0.il1LilLllii()     // Catch:{ IOException -> 0x00fe }
            top.tntok.autobot.o0OO0OoO r1 = r7.illlI1lLIL     // Catch:{ IOException -> 0x00fe }
            java.net.Proxy r1 = r1.i1LIL11l()     // Catch:{ IOException -> 0x00fe }
            top.tntok.autobot.o0O0Oo r2 = r7.I11lLL1     // Catch:{ IOException -> 0x00fe }
            r9.iiIliillii(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00fe }
        L_0x00cf:
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL
            boolean r0 = r0.illlI1lLIL()
            if (r0 == 0) goto L_0x00e9
            java.net.Socket r0 = r7.il1LilLllii
            if (r0 == 0) goto L_0x00dc
            goto L_0x00e9
        L_0x00dc:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            top.tntok.autobot.o0OO0Ooo r1 = new top.tntok.autobot.o0OO0Ooo
            r1.<init>(r0)
            throw r1
        L_0x00e9:
            top.tntok.autobot.o000o0O r0 = r7.iLLLILIiLi1Ii
            if (r0 == 0) goto L_0x00fd
            top.tntok.autobot.o0O0oo0O r1 = r7.i1LIL11l
            monitor-enter(r1)
            top.tntok.autobot.o000o0O r0 = r7.iLLLILIiLi1Ii     // Catch:{ all -> 0x00fa }
            int r0 = r0.ILIiLLLL1iiii()     // Catch:{ all -> 0x00fa }
            r7.IL1lILLLL1L = r0     // Catch:{ all -> 0x00fa }
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
            goto L_0x00fd
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
            throw r0
        L_0x00fd:
            return
        L_0x00fe:
            r0 = move-exception
            goto L_0x0102
        L_0x0100:
            r0 = move-exception
            goto L_0x00b0
        L_0x0102:
            java.net.Socket r1 = r7.iiIliillii
            top.tntok.autobot.C0487o0OooooO.IiIIlIL(r1)
            java.net.Socket r1 = r7.il1LilLllii
            top.tntok.autobot.C0487o0OooooO.IiIIlIL(r1)
            r7.iiIliillii = r11
            r7.il1LilLllii = r11
            r7.IiIIlIL = r11
            r7.iilLiIIIi11i = r11
            r7.iilLil1i11I1 = r11
            r7.I11lLL1 = r11
            r7.iLLLILIiLi1Ii = r11
            top.tntok.autobot.o0OO0OoO r1 = r7.illlI1lLIL
            java.net.InetSocketAddress r3 = r1.il1LilLllii()
            top.tntok.autobot.o0OO0OoO r1 = r7.illlI1lLIL
            java.net.Proxy r4 = r1.i1LIL11l()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.iilLil1i11I1(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0137
            top.tntok.autobot.o0OO0Ooo r12 = new top.tntok.autobot.o0OO0Ooo
            r12.<init>(r0)
            goto L_0x013a
        L_0x0137:
            r12.iiI1L1iI(r0)
        L_0x013a:
            if (r21 == 0) goto L_0x0144
            boolean r0 = r10.i1LIL11l(r0)
            if (r0 == 0) goto L_0x0144
            goto L_0x0088
        L_0x0144:
            throw r12
        L_0x0145:
            top.tntok.autobot.o0OO0Ooo r0 = new top.tntok.autobot.o0OO0Ooo
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0315o0O0o0oO.iLLLILIiLi1Ii(int, int, int, int, boolean, top.tntok.autobot.iiIIl1I, top.tntok.autobot.OoooOo0):void");
    }

    public C0082o000Oo iiI1L1iI() {
        return this.iilLil1i11I1;
    }

    public void iiIliillii(C0097o000o0O o000o0o) {
        synchronized (this.i1LIL11l) {
            this.IL1lILLLL1L = o000o0o.ILIiLLLL1iiii();
        }
    }

    public final boolean iiLIIiIli(List<o0OO0OoO> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o0OO0OoO o0oo0ooo = list.get(i);
            Proxy.Type type = o0oo0ooo.i1LIL11l().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.illlI1lLIL.i1LIL11l().type() == type2 && this.illlI1lLIL.il1LilLllii().equals(o0oo0ooo.il1LilLllii())) {
                return true;
            }
        }
        return false;
    }

    public void iiiiI1iILL11I(@Nullable IOException iOException) {
        synchronized (this.i1LIL11l) {
            try {
                if (iOException instanceof C0380o0OOo0o0) {
                    C0039OoooOO0 ooooOO0 = ((C0380o0OOo0o0) iOException).errorCode;
                    if (ooooOO0 == C0039OoooOO0.REFUSED_STREAM) {
                        int i = this.i1L1lLllLLlIi + 1;
                        this.i1L1lLllLLlIi = i;
                        if (i > 1) {
                            this.IiiL1llIIi = true;
                            this.iILiI1lll++;
                        }
                    } else if (ooooOO0 != C0039OoooOO0.CANCEL) {
                        this.IiiL1llIIi = true;
                        this.iILiI1lll++;
                    }
                } else if (!i111iLiiIIill() || (iOException instanceof IliiLiLi)) {
                    this.IiiL1llIIi = true;
                    if (this.I1iIiIi == 0) {
                        if (iOException != null) {
                            this.i1LIL11l.illlI1lLIL(this.illlI1lLIL, iOException);
                        }
                        this.iILiI1lll++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138 A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013e A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iilLiIIIi11i(top.tntok.autobot.iLIililLI11 r8) throws java.io.IOException {
        /*
            r7 = this;
            top.tntok.autobot.o0OO0OoO r0 = r7.illlI1lLIL
            top.tntok.autobot.ILl1iII11Ll1 r0 = r0.iiI1L1iI()
            javax.net.ssl.SSLSocketFactory r1 = r0.IiiL1llIIi()
            r2 = 0
            java.net.Socket r3 = r7.il1LilLllii     // Catch:{ AssertionError -> 0x0131 }
            top.tntok.autobot.o000oo00 r4 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0131 }
            java.lang.String r4 = r4.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0131 }
            top.tntok.autobot.o000oo00 r5 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0131 }
            int r5 = r5.il1l1IlL()     // Catch:{ AssertionError -> 0x0131 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0131 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0131 }
            top.tntok.autobot.ILLiiL1ill1lI r8 = r8.iiI1L1iI(r1)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            boolean r3 = r8.iilLil1i11I1()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            if (r3 == 0) goto L_0x004a
            top.tntok.autobot.o0O0O0oO r3 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000oo00 r4 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r4 = r4.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.util.List r5 = r0.iilLil1i11I1()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r3.iLLLILIiLi1Ii(r1, r4, r5)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r8 = move-exception
            r2 = r1
            goto L_0x013f
        L_0x0046:
            r8 = move-exception
            r2 = r1
            goto L_0x0132
        L_0x004a:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000Oo r4 = top.tntok.autobot.C0082o000Oo.i1LIL11l(r3)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            javax.net.ssl.HostnameVerifier r5 = r0.iiIliillii()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000oo00 r6 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r6 = r6.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            if (r3 != 0) goto L_0x00e1
            java.util.List r8 = r4.I11lLL1()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00bf
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000oo00 r0 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = r0.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = top.tntok.autobot.II1l11I11IiiL.il1LilLllii(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.util.List r8 = top.tntok.autobot.C0238o00oOoO.iiI1L1iI(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            throw r2     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
        L_0x00bf:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000oo00 r0 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = r0.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            throw r8     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
        L_0x00e1:
            top.tntok.autobot.II1l11I11IiiL r3 = r0.iiI1L1iI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o000oo00 r0 = r0.iILiI1lll()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r0 = r0.iL1LIlIlI()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.util.List r5 = r4.I11lLL1()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r3.iiI1L1iI(r0, r5)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            boolean r8 = r8.iilLil1i11I1()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            if (r8 == 0) goto L_0x0102
            top.tntok.autobot.o0O0O0oO r8 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.lang.String r2 = r8.iL1LIlIlI(r1)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
        L_0x0102:
            r7.iiIliillii = r1     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o0OOOooO r8 = top.tntok.autobot.C0249o00oo00O.i1L1lLllLLlIi(r1)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.ILL1iL1LiiI r8 = top.tntok.autobot.C0249o00oo00O.il1LilLllii(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r7.IiIIlIL = r8     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            java.net.Socket r8 = r7.iiIliillii     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o0OOOo0 r8 = top.tntok.autobot.C0249o00oo00O.IiIIlIL(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.Iiii1LiI11i r8 = top.tntok.autobot.C0249o00oo00O.illlI1lLIL(r8)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r7.iilLiIIIi11i = r8     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            r7.iilLil1i11I1 = r4     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            if (r2 == 0) goto L_0x0123
            top.tntok.autobot.o0O0Oo r8 = top.tntok.autobot.C0297o0O0Oo.iiI1L1iI(r2)     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            goto L_0x0125
        L_0x0123:
            top.tntok.autobot.o0O0Oo r8 = top.tntok.autobot.C0297o0O0Oo.HTTP_1_1     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
        L_0x0125:
            r7.I11lLL1 = r8     // Catch:{ AssertionError -> 0x0046, all -> 0x0042 }
            top.tntok.autobot.o0O0O0oO r8 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()
            r8.iiI1L1iI(r1)
            return
        L_0x012f:
            r8 = move-exception
            goto L_0x013f
        L_0x0131:
            r8 = move-exception
        L_0x0132:
            boolean r0 = top.tntok.autobot.C0487o0OooooO.i1iI1iiLL1(r8)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x013e
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012f }
            r0.<init>(r8)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ all -> 0x012f }
        L_0x013e:
            throw r8     // Catch:{ all -> 0x012f }
        L_0x013f:
            if (r2 == 0) goto L_0x0148
            top.tntok.autobot.o0O0O0oO r0 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()
            r0.iiI1L1iI(r2)
        L_0x0148:
            top.tntok.autobot.C0487o0OooooO.IiIIlIL(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0315o0O0o0oO.iilLiIIIi11i(top.tntok.autobot.iLIililLI11):void");
    }

    public void iilLil1i11I1(C0102o000o0o0 o000o0o0) throws IOException {
        o000o0o0.il1LilLllii(C0039OoooOO0.REFUSED_STREAM, (IOException) null);
    }

    public C0297o0O0Oo il1LilLllii() {
        return this.I11lLL1;
    }

    public Socket illlI1lLIL() {
        return this.iiIliillii;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.illlI1lLIL.iiI1L1iI().iILiI1lll().iL1LIlIlI());
        sb.append(":");
        sb.append(this.illlI1lLIL.iiI1L1iI().iILiI1lll().il1l1IlL());
        sb.append(", proxy=");
        sb.append(this.illlI1lLIL.i1LIL11l());
        sb.append(" hostAddress=");
        sb.append(this.illlI1lLIL.il1LilLllii());
        sb.append(" cipherSuite=");
        C0082o000Oo o000oo = this.iilLil1i11I1;
        if (o000oo != null) {
            obj = o000oo.iiI1L1iI();
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.I11lLL1);
        sb.append('}');
        return sb.toString();
    }
}
