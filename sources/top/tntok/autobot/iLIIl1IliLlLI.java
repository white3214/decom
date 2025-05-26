package top.tntok.autobot;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class iLIIl1IliLlLI extends C0446o0OoOOOo {
    public static final long IiIIlIL;
    @Nullable
    public static iLIIl1IliLlLI IiiL1llIIi = null;
    public static final int iLLLILIiLi1Ii = 65536;
    public static final long iilLiIIIi11i;
    public long I11lLL1;
    public boolean iiIliillii;
    @Nullable
    public iLIIl1IliLlLI iilLil1i11I1;

    public class i1LIL11l implements C0370o0OOOooO {
        public final /* synthetic */ C0370o0OOOooO i1LIL11l;

        public i1LIL11l(C0370o0OOOooO o0oooooo) {
            this.i1LIL11l = o0oooooo;
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            iLIIl1IliLlLI.this.i1L1lLllLLlIi();
            try {
                long IIlllIIi1ii = this.i1LIL11l.IIlllIIi1ii(iiILIlLLiIL, j);
                iLIIl1IliLlLI.this.iL1LIlIlI(true);
                return IIlllIIi1ii;
            } catch (IOException e) {
                throw iLIIl1IliLlLI.this.IL1lILLLL1L(e);
            } catch (Throwable th) {
                iLIIl1IliLlLI.this.iL1LIlIlI(false);
                throw th;
            }
        }

        public void close() throws IOException {
            iLIIl1IliLlLI.this.i1L1lLllLLlIi();
            try {
                this.i1LIL11l.close();
                iLIIl1IliLlLI.this.iL1LIlIlI(true);
            } catch (IOException e) {
                throw iLIIl1IliLlLI.this.IL1lILLLL1L(e);
            } catch (Throwable th) {
                iLIIl1IliLlLI.this.iL1LIlIlI(false);
                throw th;
            }
        }

        public C0446o0OoOOOo timeout() {
            return iLIIl1IliLlLI.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.i1LIL11l + ")";
        }
    }

    public class iiI1L1iI implements C0361o0OOOo0 {
        public final /* synthetic */ C0361o0OOOo0 i1LIL11l;

        public iiI1L1iI(C0361o0OOOo0 o0oooo0) {
            this.i1LIL11l = o0oooo0;
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
                    while (true) {
                        if (j2 >= o0OOO00o.iiI1L1iI) {
                            break;
                        }
                        j2 += (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        o0ooo00 = o0ooo00.iilLil1i11I1;
                    }
                    iLIIl1IliLlLI.this.i1L1lLllLLlIi();
                    try {
                        this.i1LIL11l.I1iIiIi(iiILIlLLiIL, j2);
                        j -= j2;
                        iLIIl1IliLlLI.this.iL1LIlIlI(true);
                    } catch (IOException e) {
                        throw iLIIl1IliLlLI.this.IL1lILLLL1L(e);
                    } catch (Throwable th) {
                        iLIIl1IliLlLI.this.iL1LIlIlI(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public void close() throws IOException {
            iLIIl1IliLlLI.this.i1L1lLllLLlIi();
            try {
                this.i1LIL11l.close();
                iLIIl1IliLlLI.this.iL1LIlIlI(true);
            } catch (IOException e) {
                throw iLIIl1IliLlLI.this.IL1lILLLL1L(e);
            } catch (Throwable th) {
                iLIIl1IliLlLI.this.iL1LIlIlI(false);
                throw th;
            }
        }

        public void flush() throws IOException {
            iLIIl1IliLlLI.this.i1L1lLllLLlIi();
            try {
                this.i1LIL11l.flush();
                iLIIl1IliLlLI.this.iL1LIlIlI(true);
            } catch (IOException e) {
                throw iLIIl1IliLlLI.this.IL1lILLLL1L(e);
            } catch (Throwable th) {
                iLIIl1IliLlLI.this.iL1LIlIlI(false);
                throw th;
            }
        }

        public C0446o0OoOOOo timeout() {
            return iLIIl1IliLlLI.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.i1LIL11l + ")";
        }
    }

    public static final class illlI1lLIL extends Thread {
        public illlI1lLIL() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r1.i1iiLIil1ILi();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<top.tntok.autobot.iLIIl1IliLlLI> r0 = top.tntok.autobot.iLIIl1IliLlLI.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                top.tntok.autobot.iLIIl1IliLlLI r1 = top.tntok.autobot.iLIIl1IliLlLI.iILiI1lll()     // Catch:{ all -> 0x000b }
                if (r1 != 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x000b }
                goto L_0x0000
            L_0x000b:
                r1 = move-exception
                goto L_0x001b
            L_0x000d:
                top.tntok.autobot.iLIIl1IliLlLI r2 = top.tntok.autobot.iLIIl1IliLlLI.IiiL1llIIi     // Catch:{ all -> 0x000b }
                if (r1 != r2) goto L_0x0016
                r1 = 0
                top.tntok.autobot.iLIIl1IliLlLI.IiiL1llIIi = r1     // Catch:{ all -> 0x000b }
                monitor-exit(r0)     // Catch:{ all -> 0x000b }
                return
            L_0x0016:
                monitor-exit(r0)     // Catch:{ all -> 0x000b }
                r1.i1iiLIil1ILi()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x000b }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iLIIl1IliLlLI.illlI1lLIL.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IiIIlIL = millis;
        iilLiIIIi11i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static synchronized boolean I1iIiIi(iLIIl1IliLlLI iliil1ilillli) {
        synchronized (iLIIl1IliLlLI.class) {
            iLIIl1IliLlLI iliil1ilillli2 = IiiL1llIIi;
            while (iliil1ilillli2 != null) {
                iLIIl1IliLlLI iliil1ilillli3 = iliil1ilillli2.iilLil1i11I1;
                if (iliil1ilillli3 == iliil1ilillli) {
                    iliil1ilillli2.iilLil1i11I1 = iliil1ilillli.iilLil1i11I1;
                    iliil1ilillli.iilLil1i11I1 = null;
                    return false;
                }
                iliil1ilillli2 = iliil1ilillli3;
            }
            return true;
        }
    }

    public static synchronized void I1l1iIll1lIi1(iLIIl1IliLlLI iliil1ilillli, long j, boolean z) {
        synchronized (iLIIl1IliLlLI.class) {
            try {
                if (IiiL1llIIi == null) {
                    IiiL1llIIi = new iLIIl1IliLlLI();
                    new illlI1lLIL().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 && z) {
                    iliil1ilillli.I11lLL1 = Math.min(j, iliil1ilillli.il1LilLllii() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    iliil1ilillli.I11lLL1 = j + nanoTime;
                } else if (z) {
                    iliil1ilillli.I11lLL1 = iliil1ilillli.il1LilLllii();
                } else {
                    throw new AssertionError();
                }
                long IilL11ii1I1Il = iliil1ilillli.IilL11ii1I1Il(nanoTime);
                iLIIl1IliLlLI iliil1ilillli2 = IiiL1llIIi;
                while (true) {
                    iLIIl1IliLlLI iliil1ilillli3 = iliil1ilillli2.iilLil1i11I1;
                    if (iliil1ilillli3 == null) {
                        break;
                    } else if (IilL11ii1I1Il < iliil1ilillli3.IilL11ii1I1Il(nanoTime)) {
                        break;
                    } else {
                        iliil1ilillli2 = iliil1ilillli2.iilLil1i11I1;
                    }
                }
                iliil1ilillli.iilLil1i11I1 = iliil1ilillli2.iilLil1i11I1;
                iliil1ilillli2.iilLil1i11I1 = iliil1ilillli;
                if (iliil1ilillli2 == IiiL1llIIi) {
                    iLIIl1IliLlLI.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static iLIIl1IliLlLI iILiI1lll() throws InterruptedException {
        iLIIl1IliLlLI iliil1ilillli = IiiL1llIIi.iilLil1i11I1;
        Class<iLIIl1IliLlLI> cls = iLIIl1IliLlLI.class;
        if (iliil1ilillli == null) {
            long nanoTime = System.nanoTime();
            cls.wait(IiIIlIL);
            if (IiiL1llIIi.iilLil1i11I1 != null || System.nanoTime() - nanoTime < iilLiIIIi11i) {
                return null;
            }
            return IiiL1llIIi;
        }
        long IilL11ii1I1Il = iliil1ilillli.IilL11ii1I1Il(System.nanoTime());
        if (IilL11ii1I1Il > 0) {
            long j = IilL11ii1I1Il / 1000000;
            cls.wait(j, (int) (IilL11ii1I1Il - (1000000 * j)));
            return null;
        }
        IiiL1llIIi.iilLil1i11I1 = iliil1ilillli.iilLil1i11I1;
        iliil1ilillli.iilLil1i11I1 = null;
        return iliil1ilillli;
    }

    public final IOException IL1lILLLL1L(IOException iOException) throws IOException {
        if (!i111iLiiIIill()) {
            return iOException;
        }
        return Ii1liIIIiLi(iOException);
    }

    public final C0370o0OOOooO ILl1iII11Ll1(C0370o0OOOooO o0oooooo) {
        return new i1LIL11l(o0oooooo);
    }

    public IOException Ii1liIIIiLi(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long IilL11ii1I1Il(long j) {
        return this.I11lLL1 - j;
    }

    public final boolean i111iLiiIIill() {
        if (!this.iiIliillii) {
            return false;
        }
        this.iiIliillii = false;
        return I1iIiIi(this);
    }

    public final void i1L1lLllLLlIi() {
        if (!this.iiIliillii) {
            long iilLiIIIi11i2 = iilLiIIIi11i();
            boolean iilLil1i11I12 = iilLil1i11I1();
            if (iilLiIIIi11i2 != 0 || iilLil1i11I12) {
                this.iiIliillii = true;
                I1l1iIll1lIi1(this, iilLiIIIi11i2, iilLil1i11I12);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final void iL1LIlIlI(boolean z) throws IOException {
        if (i111iLiiIIill() && z) {
            throw Ii1liIIIiLi((IOException) null);
        }
    }

    public final C0361o0OOOo0 iiLIIiIli(C0361o0OOOo0 o0oooo0) {
        return new iiI1L1iI(o0oooo0);
    }

    public void i1iiLIil1ILi() {
    }
}
