package top.tntok.autobot;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: top.tntok.autobot.o0oOo0O0  reason: case insensitive filesystem */
public final class C0531o0oOo0O0 implements iiIIl1I {
    public final C0240o00oOoOO i1LIL11l;
    public final boolean iiIliillii;
    public boolean iilLil1i11I1;
    public final C0333o0O0ooO0 il1LilLllii;
    public C0452o0OoOo00 illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0oOo0O0$iiI1L1iI */
    public final class iiI1L1iI extends C0248o00oo000 {
        public static final /* synthetic */ boolean iiIliillii = false;
        public final iLII1iIiLLL1 i1LIL11l;
        public volatile AtomicInteger illlI1lLIL = new AtomicInteger(0);

        public iiI1L1iI(iLII1iIiLLL1 ilii1iiilll1) {
            super("OkHttp %s", C0531o0oOo0O0.this.iLLLILIiLi1Ii());
            this.i1LIL11l = ilii1iiilll1;
        }

        public AtomicInteger I1iIiIi() {
            return this.illlI1lLIL;
        }

        public C0531o0oOo0O0 IL1lILLLL1L() {
            return C0531o0oOo0O0.this;
        }

        public void Ii1liIIIiLi(iiI1L1iI iii1l1ii) {
            this.illlI1lLIL = iii1l1ii.illlI1lLIL;
        }

        public C0333o0O0ooO0 i111iLiiIIill() {
            return C0531o0oOo0O0.this.il1LilLllii;
        }

        public void i1L1lLllLLlIi(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C0531o0oOo0O0.this.illlI1lLIL.iILiI1lll(interruptedIOException);
                this.i1LIL11l.iiI1L1iI(C0531o0oOo0O0.this, interruptedIOException);
                C0531o0oOo0O0.this.i1LIL11l.i1L1lLllLLlIi().I11lLL1(this);
            } catch (Throwable th) {
                C0531o0oOo0O0.this.i1LIL11l.i1L1lLllLLlIi().I11lLL1(this);
                throw th;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[Catch:{ all -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ all -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ all -> 0x0058 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void iILiI1lll() {
            /*
                r4 = this;
                top.tntok.autobot.o0oOo0O0 r0 = top.tntok.autobot.C0531o0oOo0O0.this
                top.tntok.autobot.o0OoOo00 r0 = r0.illlI1lLIL
                r0.i111iLiiIIill()
                r0 = 0
                top.tntok.autobot.o0oOo0O0 r1 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ IOException -> 0x002c, all -> 0x0028 }
                top.tntok.autobot.o0O0oooO r0 = r1.iilLil1i11I1()     // Catch:{ IOException -> 0x002c, all -> 0x0028 }
                r1 = 1
                top.tntok.autobot.iLII1iIiLLL1 r2 = r4.i1LIL11l     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                top.tntok.autobot.o0oOo0O0 r3 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.i1LIL11l(r3, r0)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            L_0x0018:
                top.tntok.autobot.o0oOo0O0 r0 = top.tntok.autobot.C0531o0oOo0O0.this
                top.tntok.autobot.o00oOoOO r0 = r0.i1LIL11l
                top.tntok.autobot.OooOooO r0 = r0.i1L1lLllLLlIi()
                r0.I11lLL1(r4)
                goto L_0x0085
            L_0x0024:
                r0 = move-exception
                goto L_0x0030
            L_0x0026:
                r0 = move-exception
                goto L_0x005b
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
                goto L_0x0030
            L_0x002c:
                r1 = move-exception
                r0 = r1
                r1 = 0
                goto L_0x005b
            L_0x0030:
                top.tntok.autobot.o0oOo0O0 r2 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ all -> 0x0058 }
                r2.i1LIL11l()     // Catch:{ all -> 0x0058 }
                if (r1 != 0) goto L_0x005a
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r2.<init>()     // Catch:{ all -> 0x0058 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0058 }
                r2.append(r0)     // Catch:{ all -> 0x0058 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0058 }
                r1.<init>(r2)     // Catch:{ all -> 0x0058 }
                r1.addSuppressed(r0)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.iLII1iIiLLL1 r2 = r4.i1LIL11l     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0oOo0O0 r3 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ all -> 0x0058 }
                r2.iiI1L1iI(r3, r1)     // Catch:{ all -> 0x0058 }
                goto L_0x005a
            L_0x0058:
                r0 = move-exception
                goto L_0x0086
            L_0x005a:
                throw r0     // Catch:{ all -> 0x0058 }
            L_0x005b:
                if (r1 == 0) goto L_0x007d
                top.tntok.autobot.o0O0O0oO r1 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r2.<init>()     // Catch:{ all -> 0x0058 }
                java.lang.String r3 = "Callback failure for "
                r2.append(r3)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0oOo0O0 r3 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ all -> 0x0058 }
                java.lang.String r3 = r3.IiIIlIL()     // Catch:{ all -> 0x0058 }
                r2.append(r3)     // Catch:{ all -> 0x0058 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0058 }
                r3 = 4
                r1.iiLIIiIli(r3, r2, r0)     // Catch:{ all -> 0x0058 }
                goto L_0x0018
            L_0x007d:
                top.tntok.autobot.iLII1iIiLLL1 r1 = r4.i1LIL11l     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0oOo0O0 r2 = top.tntok.autobot.C0531o0oOo0O0.this     // Catch:{ all -> 0x0058 }
                r1.iiI1L1iI(r2, r0)     // Catch:{ all -> 0x0058 }
                goto L_0x0018
            L_0x0085:
                return
            L_0x0086:
                top.tntok.autobot.o0oOo0O0 r1 = top.tntok.autobot.C0531o0oOo0O0.this
                top.tntok.autobot.o00oOoOO r1 = r1.i1LIL11l
                top.tntok.autobot.OooOooO r1 = r1.i1L1lLllLLlIi()
                r1.I11lLL1(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0531o0oOo0O0.iiI1L1iI.iILiI1lll():void");
        }

        public String iL1LIlIlI() {
            return C0531o0oOo0O0.this.il1LilLllii.IiiL1llIIi().iL1LIlIlI();
        }
    }

    public C0531o0oOo0O0(C0240o00oOoOO o00ooooo, C0333o0O0ooO0 o0o0ooo0, boolean z) {
        this.i1LIL11l = o00ooooo;
        this.il1LilLllii = o0o0ooo0;
        this.iiIliillii = z;
    }

    public static C0531o0oOo0O0 I11lLL1(C0240o00oOoOO o00ooooo, C0333o0O0ooO0 o0o0ooo0, boolean z) {
        C0531o0oOo0O0 o0ooo0o0 = new C0531o0oOo0O0(o00ooooo, o0o0ooo0, z);
        o0ooo0o0.illlI1lLIL = new C0452o0OoOo00(o00ooooo, o0ooo0o0);
        return o0ooo0o0;
    }

    public synchronized boolean I1LiILiLLIl1l() {
        return this.iilLil1i11I1;
    }

    public String IiIIlIL() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (IiIl11II()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.iiIliillii) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(iLLLILIiLi1Ii());
        return sb.toString();
    }

    public boolean IiIl11II() {
        return this.illlI1lLIL.IiIIlIL();
    }

    public void i1LIL11l() {
        this.illlI1lLIL.il1LilLllii();
    }

    public String iLLLILIiLi1Ii() {
        return this.il1LilLllii.IiiL1llIIi().ILllI11();
    }

    public C0333o0O0ooO0 iiI1L1iI() {
        return this.il1LilLllii;
    }

    /* renamed from: iiIliillii */
    public C0531o0oOo0O0 i111iLiiIIill() {
        return I11lLL1(this.i1LIL11l, this.il1LilLllii, this.iiIliillii);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public top.tntok.autobot.C0337o0O0oooO iilLil1i11I1() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            top.tntok.autobot.o00oOoOO r0 = r11.i1LIL11l
            java.util.List r0 = r0.iiLIIiIli()
            r1.addAll(r0)
            top.tntok.autobot.oo0ooO r0 = new top.tntok.autobot.oo0ooO
            top.tntok.autobot.o00oOoOO r2 = r11.i1LIL11l
            r0.<init>(r2)
            r1.add(r0)
            top.tntok.autobot.iLliII11iI r0 = new top.tntok.autobot.iLliII11iI
            top.tntok.autobot.o00oOoOO r2 = r11.i1LIL11l
            top.tntok.autobot.ii1ILilI1IL r2 = r2.I1iIiIi()
            r0.<init>(r2)
            r1.add(r0)
            top.tntok.autobot.I1LIi1ii1l r0 = new top.tntok.autobot.I1LIi1ii1l
            top.tntok.autobot.o00oOoOO r2 = r11.i1LIL11l
            top.tntok.autobot.o00OO0 r2 = r2.ILl1iII11Ll1()
            r0.<init>(r2)
            r1.add(r0)
            top.tntok.autobot.ilLLLLilLilI r0 = new top.tntok.autobot.ilLLLLilLilI
            top.tntok.autobot.o00oOoOO r2 = r11.i1LIL11l
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.iiIliillii
            if (r0 != 0) goto L_0x004b
            top.tntok.autobot.o00oOoOO r0 = r11.i1LIL11l
            java.util.List r0 = r0.i1iiLIil1ILi()
            r1.addAll(r0)
        L_0x004b:
            top.tntok.autobot.ilLILlL r0 = new top.tntok.autobot.ilLILlL
            boolean r2 = r11.iiIliillii
            r0.<init>(r2)
            r1.add(r0)
            top.tntok.autobot.oooOO0 r10 = new top.tntok.autobot.oooOO0
            top.tntok.autobot.o0OoOo00 r2 = r11.illlI1lLIL
            top.tntok.autobot.o0O0ooO0 r5 = r11.il1LilLllii
            top.tntok.autobot.o00oOoOO r0 = r11.i1LIL11l
            int r7 = r0.iilLiIIIi11i()
            top.tntok.autobot.o00oOoOO r0 = r11.i1LIL11l
            int r8 = r0.il1l1IlL()
            top.tntok.autobot.o00oOoOO r0 = r11.i1LIL11l
            int r9 = r0.IL1IiilLlLI()
            r3 = 0
            r4 = 0
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            top.tntok.autobot.o0O0ooO0 r2 = r11.il1LilLllii     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            top.tntok.autobot.o0O0oooO r2 = r10.IiIIlIL(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            top.tntok.autobot.o0OoOo00 r3 = r11.illlI1lLIL     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.IiIIlIL()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            top.tntok.autobot.o0OoOo00 r1 = r11.illlI1lLIL
            r1.iILiI1lll(r0)
            return r2
        L_0x008a:
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r1 = move-exception
            r2 = 1
            top.tntok.autobot.o0OoOo00 r3 = r11.illlI1lLIL     // Catch:{ all -> 0x00a0 }
            java.io.IOException r1 = r3.iILiI1lll(r1)     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            r2 = r1
            r1 = 1
        L_0x00a3:
            if (r1 != 0) goto L_0x00aa
            top.tntok.autobot.o0OoOo00 r1 = r11.illlI1lLIL
            r1.iILiI1lll(r0)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0531o0oOo0O0.iilLil1i11I1():top.tntok.autobot.o0O0oooO");
    }

    public C0337o0O0oooO il1LilLllii() throws IOException {
        synchronized (this) {
            if (!this.iilLil1i11I1) {
                this.iilLil1i11I1 = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.illlI1lLIL.i111iLiiIIill();
        this.illlI1lLIL.i1LIL11l();
        try {
            this.i1LIL11l.i1L1lLllLLlIi().illlI1lLIL(this);
            return iilLil1i11I1();
        } finally {
            this.i1LIL11l.i1L1lLllLLlIi().iLLLILIiLi1Ii(this);
        }
    }

    public void ilLIlL1ILi(iLII1iIiLLL1 ilii1iiilll1) {
        synchronized (this) {
            if (!this.iilLil1i11I1) {
                this.iilLil1i11I1 = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.illlI1lLIL.i1LIL11l();
        this.i1LIL11l.i1L1lLllLLlIi().i1LIL11l(new iiI1L1iI(ilii1iiilll1));
    }

    public C0446o0OoOOOo timeout() {
        return this.illlI1lLIL.IL1lILLLL1L();
    }
}
