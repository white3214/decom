package top.tntok.autobot;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import top.tntok.autobot.o00OO00O;

/* renamed from: top.tntok.autobot.o0OoOo00  reason: case insensitive filesystem */
public final class C0452o0OoOo00 {
    public static final /* synthetic */ boolean iL1LIlIlI = false;
    public C0333o0O0ooO0 I11lLL1;
    public boolean I1iIiIi;
    public boolean IL1lILLLL1L;
    public C0315o0O0o0oO IiIIlIL;
    public boolean IiiL1llIIi;
    public boolean i1L1lLllLLlIi;
    public final C0330o0O0oo0O i1LIL11l;
    public boolean iILiI1lll;
    public C0047OooooO0 iLLLILIiLi1Ii;
    public final C0240o00oOoOO iiI1L1iI;
    public final iLIIl1IliLlLI iiIliillii;
    @Nullable
    public C0045Ooooo00 iilLiIIIi11i;
    @Nullable
    public Object iilLil1i11I1;
    public final C0042OoooOo0 il1LilLllii;
    public final iiIIl1I illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0OoOo00$i1LIL11l */
    public static final class i1LIL11l extends WeakReference<C0452o0OoOo00> {
        public final Object iiI1L1iI;

        public i1LIL11l(C0452o0OoOo00 o0oooo00, Object obj) {
            super(o0oooo00);
            this.iiI1L1iI = obj;
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOo00$iiI1L1iI */
    public class iiI1L1iI extends iLIIl1IliLlLI {
        public iiI1L1iI() {
        }

        public void i1iiLIil1ILi() {
            C0452o0OoOo00.this.il1LilLllii();
        }
    }

    public C0452o0OoOo00(C0240o00oOoOO o00ooooo, iiIIl1I iiiil1i) {
        iiI1L1iI iii1l1ii = new iiI1L1iI();
        this.iiIliillii = iii1l1ii;
        this.iiI1L1iI = o00ooooo;
        this.i1LIL11l = C0139o00OO00o.iiI1L1iI.iilLiIIIi11i(o00ooooo.IiiL1llIIi());
        this.illlI1lLIL = iiiil1i;
        this.il1LilLllii = o00ooooo.iL1LIlIlI().iiI1L1iI(iiiil1i);
        iii1l1ii.IiIIlIL((long) o00ooooo.iLLLILIiLi1Ii(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return iilLiIIIi11i(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r7;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException I11lLL1(top.tntok.autobot.C0045Ooooo00 r4, boolean r5, boolean r6, @javax.annotation.Nullable java.io.IOException r7) {
        /*
            r3 = this;
            top.tntok.autobot.o0O0oo0O r0 = r3.i1LIL11l
            monitor-enter(r0)
            top.tntok.autobot.Ooooo00 r1 = r3.iilLiIIIi11i     // Catch:{ all -> 0x0009 }
            if (r4 == r1) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r7
        L_0x0009:
            r4 = move-exception
            goto L_0x003f
        L_0x000b:
            r4 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0015
            boolean r5 = r3.IiiL1llIIi     // Catch:{ all -> 0x0009 }
            r5 = r5 ^ r4
            r3.IiiL1llIIi = r4     // Catch:{ all -> 0x0009 }
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            if (r6 == 0) goto L_0x001f
            boolean r6 = r3.iILiI1lll     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x001d
            r5 = 1
        L_0x001d:
            r3.iILiI1lll = r4     // Catch:{ all -> 0x0009 }
        L_0x001f:
            boolean r6 = r3.IiiL1llIIi     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x0036
            boolean r6 = r3.iILiI1lll     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x0036
            if (r5 == 0) goto L_0x0036
            top.tntok.autobot.o0O0o0oO r5 = r1.illlI1lLIL()     // Catch:{ all -> 0x0009 }
            int r6 = r5.I1iIiIi     // Catch:{ all -> 0x0009 }
            int r6 = r6 + r4
            r5.I1iIiIi = r6     // Catch:{ all -> 0x0009 }
            r5 = 0
            r3.iilLiIIIi11i = r5     // Catch:{ all -> 0x0009 }
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x003e
            java.io.IOException r7 = r3.iilLiIIIi11i(r7, r2)
        L_0x003e:
            return r7
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0452o0OoOo00.I11lLL1(top.tntok.autobot.Ooooo00, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public void I1iIiIi(C0333o0O0ooO0 o0o0ooo0) {
        C0333o0O0ooO0 o0o0ooo02 = this.I11lLL1;
        if (o0o0ooo02 != null) {
            if (C0487o0OooooO.I1IIIi1i1ILl(o0o0ooo02.IiiL1llIIi(), o0o0ooo0.IiiL1llIIi()) && this.iLLLILIiLi1Ii.iiIliillii()) {
                return;
            }
            if (this.iilLiIIIi11i != null) {
                throw new IllegalStateException();
            } else if (this.iLLLILIiLi1Ii != null) {
                iilLiIIIi11i((IOException) null, true);
                this.iLLLILIiLi1Ii = null;
            }
        }
        this.I11lLL1 = o0o0ooo0;
        this.iLLLILIiLi1Ii = new C0047OooooO0(this, this.i1LIL11l, iiIliillii(o0o0ooo0.IiiL1llIIi()), this.illlI1lLIL, this.il1LilLllii);
    }

    public C0446o0OoOOOo IL1lILLLL1L() {
        return this.iiIliillii;
    }

    @Nullable
    public final IOException Ii1liIIIiLi(@Nullable IOException iOException) {
        if (this.i1L1lLllLLlIi || !this.iiIliillii.i111iLiiIIill()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public boolean IiIIlIL() {
        boolean z;
        synchronized (this.i1LIL11l) {
            z = this.I1iIiIi;
        }
        return z;
    }

    public C0045Ooooo00 IiiL1llIIi(o00OO00O.iiI1L1iI iii1l1ii, boolean z) {
        synchronized (this.i1LIL11l) {
            if (this.IL1lILLLL1L) {
                throw new IllegalStateException("released");
            } else if (this.iilLiIIIi11i != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C0045Ooooo00 ooooo00 = new C0045Ooooo00(this, this.illlI1lLIL, this.il1LilLllii, this.iLLLILIiLi1Ii, this.iLLLILIiLi1Ii.i1LIL11l(this.iiI1L1iI, iii1l1ii, z));
        synchronized (this.i1LIL11l) {
            this.iilLiIIIi11i = ooooo00;
            this.IiiL1llIIi = false;
            this.iILiI1lll = false;
        }
        return ooooo00;
    }

    public void i111iLiiIIill() {
        this.iiIliillii.i1L1lLllLLlIi();
    }

    @Nullable
    public Socket i1L1lLllLLlIi() {
        int size = this.IiIIlIL.iL1LIlIlI.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.IiIIlIL.iL1LIlIlI.get(i).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C0315o0O0o0oO o0o0o0oo = this.IiIIlIL;
            o0o0o0oo.iL1LIlIlI.remove(i);
            this.IiIIlIL = null;
            if (o0o0o0oo.iL1LIlIlI.isEmpty()) {
                o0o0o0oo.i111iLiiIIill = System.nanoTime();
                if (this.i1LIL11l.il1LilLllii(o0o0o0oo)) {
                    return o0o0o0oo.illlI1lLIL();
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public void i1LIL11l() {
        this.iilLil1i11I1 = C0292o0O0O0oO.I1iIiIi().i111iLiiIIill("response.body().close()");
        this.il1LilLllii.il1LilLllii(this.illlI1lLIL);
    }

    @Nullable
    public IOException iILiI1lll(@Nullable IOException iOException) {
        synchronized (this.i1LIL11l) {
            this.IL1lILLLL1L = true;
        }
        return iilLiIIIi11i(iOException, false);
    }

    public void iL1LIlIlI() {
        if (!this.i1L1lLllLLlIi) {
            this.i1L1lLllLLlIi = true;
            this.iiIliillii.i111iLiiIIill();
            return;
        }
        throw new IllegalStateException();
    }

    public boolean iLLLILIiLi1Ii() {
        boolean z;
        synchronized (this.i1LIL11l) {
            if (this.iilLiIIIi11i != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void iiI1L1iI(C0315o0O0o0oO o0o0o0oo) {
        if (this.IiIIlIL == null) {
            this.IiIIlIL = o0o0o0oo;
            o0o0o0oo.iL1LIlIlI.add(new i1LIL11l(this, this.iilLil1i11I1));
            return;
        }
        throw new IllegalStateException();
    }

    public final ILl1iII11Ll1 iiIliillii(C0109o000oo00 o000oo00) {
        II1l11I11IiiL iI1l11I11IiiL;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (o000oo00.i111iLiiIIill()) {
            sSLSocketFactory = this.iiI1L1iI.IIIlll1lll();
            hostnameVerifier = this.iiI1L1iI.I1l1iIll1lIi1();
            iI1l11I11IiiL = this.iiI1L1iI.IiIIlIL();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            iI1l11I11IiiL = null;
        }
        return new ILl1iII11Ll1(o000oo00.iL1LIlIlI(), o000oo00.il1l1IlL(), this.iiI1L1iI.IL1lILLLL1L(), this.iiI1L1iI.IilliIIIlI1ll(), sSLSocketFactory, hostnameVerifier, iI1l11I11IiiL, this.iiI1L1iI.IIlL1llI1(), this.iiI1L1iI.i1iI1iiLL1(), this.iiI1L1iI.I1I11Il1(), this.iiI1L1iI.iILiI1lll(), this.iiI1L1iI.IL111l1());
    }

    @Nullable
    public final IOException iilLiIIIi11i(@Nullable IOException iOException, boolean z) {
        C0315o0O0o0oO o0o0o0oo;
        Socket socket;
        boolean z2;
        boolean z3;
        synchronized (this.i1LIL11l) {
            if (z) {
                try {
                    if (this.iilLiIIIi11i != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            o0o0o0oo = this.IiIIlIL;
            if (o0o0o0oo == null || this.iilLiIIIi11i != null || (!z && !this.IL1lILLLL1L)) {
                socket = null;
            } else {
                socket = i1L1lLllLLlIi();
            }
            if (this.IiIIlIL != null) {
                o0o0o0oo = null;
            }
            z2 = false;
            if (!this.IL1lILLLL1L || this.iilLiIIIi11i != null) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        C0487o0OooooO.IiIIlIL(socket);
        if (o0o0o0oo != null) {
            this.il1LilLllii.IiIIlIL(this.illlI1lLIL, o0o0o0oo);
        }
        if (z3) {
            if (iOException != null) {
                z2 = true;
            }
            iOException = Ii1liIIIiLi(iOException);
            if (z2) {
                this.il1LilLllii.illlI1lLIL(this.illlI1lLIL, iOException);
            } else {
                this.il1LilLllii.i1LIL11l(this.illlI1lLIL);
            }
        }
        return iOException;
    }

    public void iilLil1i11I1() {
        synchronized (this.i1LIL11l) {
            try {
                if (!this.IL1lILLLL1L) {
                    this.iilLiIIIi11i = null;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void il1LilLllii() {
        C0045Ooooo00 ooooo00;
        C0315o0O0o0oO o0o0o0oo;
        synchronized (this.i1LIL11l) {
            try {
                this.I1iIiIi = true;
                ooooo00 = this.iilLiIIIi11i;
                C0047OooooO0 oooooO0 = this.iLLLILIiLi1Ii;
                if (oooooO0 == null || oooooO0.iiI1L1iI() == null) {
                    o0o0o0oo = this.IiIIlIL;
                } else {
                    o0o0o0oo = this.iLLLILIiLi1Ii.iiI1L1iI();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (ooooo00 != null) {
            ooooo00.i1LIL11l();
        } else if (o0o0o0oo != null) {
            o0o0o0oo.I11lLL1();
        }
    }

    public boolean illlI1lLIL() {
        if (!this.iLLLILIiLi1Ii.iilLil1i11I1() || !this.iLLLILIiLi1Ii.iiIliillii()) {
            return false;
        }
        return true;
    }
}
