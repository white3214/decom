package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import top.tntok.autobot.C0504o0o00OOO;

/* renamed from: top.tntok.autobot.o0O0oO  reason: case insensitive filesystem */
public final class C0317o0O0oO implements C0500o0o00O00, C0504o0o00OOO.iiI1L1iI {
    public static final /* synthetic */ boolean I1I11Il1 = false;
    public static final long IliiLiLliIl = 60000;
    public static final List<C0297o0O0Oo> i11liIIl11Ii1 = Collections.singletonList(C0297o0O0Oo.HTTP_1_1);
    public static final long iiiiI1iILL11I = 16777216;
    public final Runnable I11lLL1;
    public final ArrayDeque<Object> I1iIiIi = new ArrayDeque<>();
    public int I1l1iIll1lIi1;
    public boolean IL1lILLLL1L;
    public int ILl1iII11Ll1;
    public String Ii1liIIIiLi;
    public C0505o0o00OOo IiIIlIL;
    public iilLil1i11I1 IiiL1llIIi;
    public boolean IilL11ii1I1Il;
    public int i111iLiiIIill = -1;
    public long i1L1lLllLLlIi;
    public final C0498o0o00O i1LIL11l;
    public boolean i1iiLIil1ILi;
    public final ArrayDeque<ili11iILI1l> iILiI1lll = new ArrayDeque<>();
    public ScheduledFuture<?> iL1LIlIlI;
    public C0504o0o00OOO iLLLILIiLi1Ii;
    public final C0333o0O0ooO0 iiI1L1iI;
    public final String iiIliillii;
    public int iiLIIiIli;
    public ScheduledExecutorService iilLiIIIi11i;
    public iiIIl1I iilLil1i11I1;
    public final long il1LilLllii;
    public final Random illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0O0oO$i1LIL11l */
    public final class i1LIL11l implements Runnable {
        public i1LIL11l() {
        }

        public void run() {
            C0317o0O0oO.this.i1LIL11l();
        }
    }

    /* renamed from: top.tntok.autobot.o0O0oO$iiI1L1iI */
    public class iiI1L1iI implements iLII1iIiLLL1 {
        public final /* synthetic */ C0333o0O0ooO0 iiI1L1iI;

        public iiI1L1iI(C0333o0O0ooO0 o0o0ooo0) {
            this.iiI1L1iI = o0o0ooo0;
        }

        public void i1LIL11l(iiIIl1I iiiil1i, C0337o0O0oooO o0o0oooo) {
            C0045Ooooo00 iilLil1i11I1 = C0139o00OO00o.iiI1L1iI.iilLil1i11I1(o0o0oooo);
            try {
                C0317o0O0oO.this.i1L1lLllLLlIi(o0o0oooo, iilLil1i11I1);
                iilLil1i11I1 IiIIlIL = iilLil1i11I1.IiIIlIL();
                try {
                    C0317o0O0oO.this.Ii1liIIIiLi("OkHttp WebSocket " + this.iiI1L1iI.IiiL1llIIi().ILllI11(), IiIIlIL);
                    C0317o0O0oO o0o0oo = C0317o0O0oO.this;
                    o0o0oo.i1LIL11l.iilLil1i11I1(o0o0oo, o0o0oooo);
                    C0317o0O0oO.this.I1l1iIll1lIi1();
                } catch (Exception e) {
                    C0317o0O0oO.this.i111iLiiIIill(e, (C0337o0O0oooO) null);
                }
            } catch (IOException e2) {
                if (iilLil1i11I1 != null) {
                    iilLil1i11I1.IilL11ii1I1Il();
                }
                C0317o0O0oO.this.i111iLiiIIill(e2, o0o0oooo);
                C0487o0OooooO.I11lLL1(o0o0oooo);
            }
        }

        public void iiI1L1iI(iiIIl1I iiiil1i, IOException iOException) {
            C0317o0O0oO.this.i111iLiiIIill(iOException, (C0337o0O0oooO) null);
        }
    }

    /* renamed from: top.tntok.autobot.o0O0oO$iiIliillii */
    public final class iiIliillii implements Runnable {
        public iiIliillii() {
        }

        public void run() {
            C0317o0O0oO.this.IL111l1();
        }
    }

    /* renamed from: top.tntok.autobot.o0O0oO$iilLil1i11I1 */
    public static abstract class iilLil1i11I1 implements Closeable {
        public final boolean i1LIL11l;
        public final Iiii1LiI11i il1LilLllii;
        public final ILL1iL1LiiI illlI1lLIL;

        public iilLil1i11I1(boolean z, ILL1iL1LiiI iLL1iL1LiiI, Iiii1LiI11i iiii1LiI11i) {
            this.i1LIL11l = z;
            this.illlI1lLIL = iLL1iL1LiiI;
            this.il1LilLllii = iiii1LiI11i;
        }
    }

    /* renamed from: top.tntok.autobot.o0O0oO$il1LilLllii */
    public static final class il1LilLllii {
        public final ili11iILI1l i1LIL11l;
        public final int iiI1L1iI;

        public il1LilLllii(int i, ili11iILI1l ili11iili1l) {
            this.iiI1L1iI = i;
            this.i1LIL11l = ili11iili1l;
        }
    }

    /* renamed from: top.tntok.autobot.o0O0oO$illlI1lLIL */
    public static final class illlI1lLIL {
        public final ili11iILI1l i1LIL11l;
        public final int iiI1L1iI;
        public final long illlI1lLIL;

        public illlI1lLIL(int i, ili11iILI1l ili11iili1l, long j) {
            this.iiI1L1iI = i;
            this.i1LIL11l = ili11iili1l;
            this.illlI1lLIL = j;
        }
    }

    public C0317o0O0oO(C0333o0O0ooO0 o0o0ooo0, C0498o0o00O o0o00o, Random random, long j) {
        if ("GET".equals(o0o0ooo0.I11lLL1())) {
            this.iiI1L1iI = o0o0ooo0;
            this.i1LIL11l = o0o00o;
            this.illlI1lLIL = random;
            this.il1LilLllii = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.iiIliillii = ili11iILI1l.il1l1IlL(bArr).i1LIL11l();
            this.I11lLL1 = new C0320o0O0oO0o(this);
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + o0o0ooo0.I11lLL1());
    }

    public boolean I11lLL1(String str) {
        if (str != null) {
            return IliiLiLliIl(ili11iILI1l.IiiL1llIIi(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public synchronized int I1I11Il1() {
        return this.I1l1iIll1lIi1;
    }

    public void I1iIiIi(int i, TimeUnit timeUnit) throws InterruptedException {
        this.iilLiIIIi11i.awaitTermination((long) i, timeUnit);
    }

    public void I1l1iIll1lIi1() throws IOException {
        while (this.i111iLiiIIill == -1) {
            this.iLLLILIiLi1Ii.iiI1L1iI();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r2 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.iilLil1i11I1(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if ((r3 instanceof top.tntok.autobot.C0317o0O0oO.il1LilLllii) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r1 = ((top.tntok.autobot.C0317o0O0oO.il1LilLllii) r3).i1LIL11l;
        r0 = top.tntok.autobot.C0249o00oo00O.illlI1lLIL(r0.iiI1L1iI(((top.tntok.autobot.C0317o0O0oO.il1LilLllii) r3).iiI1L1iI, (long) r1.illiiliIILI()));
        r0.ILiLII1ILi(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r11.i1L1lLllLLlIi -= (long) r1.illiiliIILI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        if ((r3 instanceof top.tntok.autobot.C0317o0O0oO.illlI1lLIL) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        r3 = (top.tntok.autobot.C0317o0O0oO.illlI1lLIL) r3;
        r0.i1LIL11l(r3.iiI1L1iI, r3.i1LIL11l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r4 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        r11.i1LIL11l.iiI1L1iI(r11, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        top.tntok.autobot.C0487o0OooooO.I11lLL1(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ae, code lost:
        top.tntok.autobot.C0487o0OooooO.I11lLL1(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean IIlL1llI1() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.IilL11ii1I1Il     // Catch:{ all -> 0x0008 }
            r1 = 0
            if (r0 == 0) goto L_0x000b
            monitor-exit(r11)     // Catch:{ all -> 0x0008 }
            return r1
        L_0x0008:
            r0 = move-exception
            goto L_0x00b2
        L_0x000b:
            top.tntok.autobot.o0o00OOo r0 = r11.IiIIlIL     // Catch:{ all -> 0x0008 }
            java.util.ArrayDeque<top.tntok.autobot.ili11iILI1l> r2 = r11.iILiI1lll     // Catch:{ all -> 0x0008 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0008 }
            top.tntok.autobot.ili11iILI1l r2 = (top.tntok.autobot.ili11iILI1l) r2     // Catch:{ all -> 0x0008 }
            r3 = 0
            r4 = -1
            if (r2 != 0) goto L_0x0053
            java.util.ArrayDeque<java.lang.Object> r5 = r11.I1iIiIi     // Catch:{ all -> 0x0008 }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x0008 }
            boolean r6 = r5 instanceof top.tntok.autobot.C0317o0O0oO.illlI1lLIL     // Catch:{ all -> 0x0008 }
            if (r6 == 0) goto L_0x004a
            int r1 = r11.i111iLiiIIill     // Catch:{ all -> 0x0008 }
            java.lang.String r6 = r11.Ii1liIIIiLi     // Catch:{ all -> 0x0008 }
            if (r1 == r4) goto L_0x0034
            top.tntok.autobot.o0O0oO$iilLil1i11I1 r4 = r11.IiiL1llIIi     // Catch:{ all -> 0x0008 }
            r11.IiiL1llIIi = r3     // Catch:{ all -> 0x0008 }
            java.util.concurrent.ScheduledExecutorService r3 = r11.iilLiIIIi11i     // Catch:{ all -> 0x0008 }
            r3.shutdown()     // Catch:{ all -> 0x0008 }
        L_0x0032:
            r3 = r5
            goto L_0x0056
        L_0x0034:
            java.util.concurrent.ScheduledExecutorService r4 = r11.iilLiIIIi11i     // Catch:{ all -> 0x0008 }
            top.tntok.autobot.o0O0oO$i1LIL11l r7 = new top.tntok.autobot.o0O0oO$i1LIL11l     // Catch:{ all -> 0x0008 }
            r7.<init>()     // Catch:{ all -> 0x0008 }
            r8 = r5
            top.tntok.autobot.o0O0oO$illlI1lLIL r8 = (top.tntok.autobot.C0317o0O0oO.illlI1lLIL) r8     // Catch:{ all -> 0x0008 }
            long r8 = r8.illlI1lLIL     // Catch:{ all -> 0x0008 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0008 }
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r7, r8, r10)     // Catch:{ all -> 0x0008 }
            r11.iL1LIlIlI = r4     // Catch:{ all -> 0x0008 }
            r4 = r3
            goto L_0x0032
        L_0x004a:
            if (r5 != 0) goto L_0x004e
            monitor-exit(r11)     // Catch:{ all -> 0x0008 }
            return r1
        L_0x004e:
            r4 = r3
            r6 = r4
            r3 = r5
        L_0x0051:
            r1 = -1
            goto L_0x0056
        L_0x0053:
            r4 = r3
            r6 = r4
            goto L_0x0051
        L_0x0056:
            monitor-exit(r11)     // Catch:{ all -> 0x0008 }
            if (r2 == 0) goto L_0x005f
            r0.iilLil1i11I1(r2)     // Catch:{ all -> 0x005d }
            goto L_0x00a3
        L_0x005d:
            r0 = move-exception
            goto L_0x00ae
        L_0x005f:
            boolean r2 = r3 instanceof top.tntok.autobot.C0317o0O0oO.il1LilLllii     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x008f
            r1 = r3
            top.tntok.autobot.o0O0oO$il1LilLllii r1 = (top.tntok.autobot.C0317o0O0oO.il1LilLllii) r1     // Catch:{ all -> 0x005d }
            top.tntok.autobot.ili11iILI1l r1 = r1.i1LIL11l     // Catch:{ all -> 0x005d }
            top.tntok.autobot.o0O0oO$il1LilLllii r3 = (top.tntok.autobot.C0317o0O0oO.il1LilLllii) r3     // Catch:{ all -> 0x005d }
            int r2 = r3.iiI1L1iI     // Catch:{ all -> 0x005d }
            int r3 = r1.illiiliIILI()     // Catch:{ all -> 0x005d }
            long r5 = (long) r3     // Catch:{ all -> 0x005d }
            top.tntok.autobot.o0OOOo0 r0 = r0.iiI1L1iI(r2, r5)     // Catch:{ all -> 0x005d }
            top.tntok.autobot.Iiii1LiI11i r0 = top.tntok.autobot.C0249o00oo00O.illlI1lLIL(r0)     // Catch:{ all -> 0x005d }
            r0.ILiLII1ILi(r1)     // Catch:{ all -> 0x005d }
            r0.close()     // Catch:{ all -> 0x005d }
            monitor-enter(r11)     // Catch:{ all -> 0x005d }
            long r2 = r11.i1L1lLllLLlIi     // Catch:{ all -> 0x008c }
            int r0 = r1.illiiliIILI()     // Catch:{ all -> 0x008c }
            long r0 = (long) r0     // Catch:{ all -> 0x008c }
            long r2 = r2 - r0
            r11.i1L1lLllLLlIi = r2     // Catch:{ all -> 0x008c }
            monitor-exit(r11)     // Catch:{ all -> 0x008c }
            goto L_0x00a3
        L_0x008c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x008f:
            boolean r2 = r3 instanceof top.tntok.autobot.C0317o0O0oO.illlI1lLIL     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00a8
            top.tntok.autobot.o0O0oO$illlI1lLIL r3 = (top.tntok.autobot.C0317o0O0oO.illlI1lLIL) r3     // Catch:{ all -> 0x005d }
            int r2 = r3.iiI1L1iI     // Catch:{ all -> 0x005d }
            top.tntok.autobot.ili11iILI1l r3 = r3.i1LIL11l     // Catch:{ all -> 0x005d }
            r0.i1LIL11l(r2, r3)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x00a3
            top.tntok.autobot.o0o00O r0 = r11.i1LIL11l     // Catch:{ all -> 0x005d }
            r0.iiI1L1iI(r11, r1, r6)     // Catch:{ all -> 0x005d }
        L_0x00a3:
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r4)
            r0 = 1
            return r0
        L_0x00a8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x00ae:
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r4)
            throw r0
        L_0x00b2:
            monitor-exit(r11)     // Catch:{ all -> 0x0008 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.IIlL1llI1():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r1 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        i111iLiiIIill(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.il1LilLllii + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (top.tntok.autobot.C0337o0O0oooO) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.iiIliillii(top.tntok.autobot.ili11iILI1l.iiIliillii);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        i111iLiiIIill(r0, (top.tntok.autobot.C0337o0O0oooO) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void IL111l1() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.IilL11ii1I1Il     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r7)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r0 = move-exception
            goto L_0x0055
        L_0x0009:
            top.tntok.autobot.o0o00OOo r0 = r7.IiIIlIL     // Catch:{ all -> 0x0007 }
            boolean r1 = r7.i1iiLIil1ILi     // Catch:{ all -> 0x0007 }
            r2 = -1
            if (r1 == 0) goto L_0x0013
            int r1 = r7.I1l1iIll1lIi1     // Catch:{ all -> 0x0007 }
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            int r3 = r7.I1l1iIll1lIi1     // Catch:{ all -> 0x0007 }
            r4 = 1
            int r3 = r3 + r4
            r7.I1l1iIll1lIi1 = r3     // Catch:{ all -> 0x0007 }
            r7.i1iiLIil1ILi = r4     // Catch:{ all -> 0x0007 }
            monitor-exit(r7)     // Catch:{ all -> 0x0007 }
            r3 = 0
            if (r1 == r2) goto L_0x004a
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.il1LilLllii
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.i111iLiiIIill(r0, r3)
            return
        L_0x004a:
            top.tntok.autobot.ili11iILI1l r1 = top.tntok.autobot.ili11iILI1l.iiIliillii     // Catch:{ IOException -> 0x0050 }
            r0.iiIliillii(r1)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r7.i111iLiiIIill(r0, r3)
        L_0x0054:
            return
        L_0x0055:
            monitor-exit(r7)     // Catch:{ all -> 0x0007 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.IL111l1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean IL1lILLLL1L(int r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            top.tntok.autobot.C0503o0o00OO0.il1LilLllii(r7)     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            top.tntok.autobot.ili11iILI1l r0 = top.tntok.autobot.ili11iILI1l.IiiL1llIIi(r8)     // Catch:{ all -> 0x002d }
            int r1 = r0.illiiliIILI()     // Catch:{ all -> 0x002d }
            long r1 = (long) r1     // Catch:{ all -> 0x002d }
            r3 = 123(0x7b, double:6.1E-322)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0016
            goto L_0x0030
        L_0x0016:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r9.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r10 = "reason.size() > 123: "
            r9.append(r10)     // Catch:{ all -> 0x002d }
            r9.append(r8)     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x002d }
            r7.<init>(r8)     // Catch:{ all -> 0x002d }
            throw r7     // Catch:{ all -> 0x002d }
        L_0x002d:
            r7 = move-exception
            goto L_0x004e
        L_0x002f:
            r0 = 0
        L_0x0030:
            boolean r8 = r6.IilL11ii1I1Il     // Catch:{ all -> 0x002d }
            if (r8 != 0) goto L_0x004b
            boolean r8 = r6.IL1lILLLL1L     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x0039
            goto L_0x004b
        L_0x0039:
            r8 = 1
            r6.IL1lILLLL1L = r8     // Catch:{ all -> 0x002d }
            java.util.ArrayDeque<java.lang.Object> r1 = r6.I1iIiIi     // Catch:{ all -> 0x002d }
            top.tntok.autobot.o0O0oO$illlI1lLIL r2 = new top.tntok.autobot.o0O0oO$illlI1lLIL     // Catch:{ all -> 0x002d }
            r2.<init>(r7, r0, r9)     // Catch:{ all -> 0x002d }
            r1.add(r2)     // Catch:{ all -> 0x002d }
            r6.iiiiI1iILL11I()     // Catch:{ all -> 0x002d }
            monitor-exit(r6)
            return r8
        L_0x004b:
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x004e:
            monitor-exit(r6)     // Catch:{ all -> 0x002d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.IL1lILLLL1L(int, java.lang.String, long):boolean");
    }

    public boolean ILl1iII11Ll1() throws IOException {
        try {
            this.iLLLILIiLi1Ii.iiI1L1iI();
            if (this.i111iLiiIIill == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            i111iLiiIIill(e, (C0337o0O0oooO) null);
            return false;
        }
    }

    public void Ii1liIIIiLi(String str, iilLil1i11I1 iillil1i11i1) throws IOException {
        synchronized (this) {
            try {
                this.IiiL1llIIi = iillil1i11i1;
                this.IiIIlIL = new C0505o0o00OOo(iillil1i11i1.i1LIL11l, iillil1i11i1.il1LilLllii, this.illlI1lLIL);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C0487o0OooooO.IILiIL1i11Li(str, false));
                this.iilLiIIIi11i = scheduledThreadPoolExecutor;
                if (this.il1LilLllii != 0) {
                    iiIliillii iiiliillii = new iiIliillii();
                    long j = this.il1LilLllii;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(iiiliillii, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.I1iIiIi.isEmpty()) {
                    iiiiI1iILL11I();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.iLLLILIiLi1Ii = new C0504o0o00OOO(iillil1i11i1.i1LIL11l, iillil1i11i1.illlI1lLIL, this);
    }

    public synchronized void IiIIlIL(ili11iILI1l ili11iili1l) {
        this.ILl1iII11Ll1++;
        this.i1iiLIil1ILi = false;
    }

    public void IiiL1llIIi(int i, String str) {
        iilLil1i11I1 iillil1i11i1;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.i111iLiiIIill == -1) {
                        this.i111iLiiIIill = i;
                        this.Ii1liIIIiLi = str;
                        iillil1i11i1 = null;
                        if (this.IL1lILLLL1L && this.I1iIiIi.isEmpty()) {
                            iilLil1i11I1 iillil1i11i12 = this.IiiL1llIIi;
                            this.IiiL1llIIi = iillil1i11i1;
                            ScheduledFuture<?> scheduledFuture = this.iL1LIlIlI;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.iilLiIIIi11i.shutdown();
                            iillil1i11i1 = iillil1i11i12;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                this.i1LIL11l.i1LIL11l(this, i, str);
                if (iillil1i11i1 != null) {
                    this.i1LIL11l.iiI1L1iI(this, i, str);
                }
            } finally {
                C0487o0OooooO.I11lLL1(iillil1i11i1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final /* synthetic */ void IilL11ii1I1Il() {
        do {
            try {
            } catch (IOException e) {
                i111iLiiIIill(e, (C0337o0O0oooO) null);
                return;
            }
        } while (IIlL1llI1());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean IliiLiLliIl(top.tntok.autobot.ili11iILI1l r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.IilL11ii1I1Il     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.IL1lILLLL1L     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000b
            goto L_0x003e
        L_0x000b:
            long r2 = r6.i1L1lLllLLlIi     // Catch:{ all -> 0x0022 }
            int r0 = r7.illiiliIILI()     // Catch:{ all -> 0x0022 }
            long r4 = (long) r0     // Catch:{ all -> 0x0022 }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.il1LilLllii(r7, r8)     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0040
        L_0x0024:
            long r0 = r6.i1L1lLllLLlIi     // Catch:{ all -> 0x0022 }
            int r2 = r7.illiiliIILI()     // Catch:{ all -> 0x0022 }
            long r2 = (long) r2     // Catch:{ all -> 0x0022 }
            long r0 = r0 + r2
            r6.i1L1lLllLLlIi = r0     // Catch:{ all -> 0x0022 }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.I1iIiIi     // Catch:{ all -> 0x0022 }
            top.tntok.autobot.o0O0oO$il1LilLllii r1 = new top.tntok.autobot.o0O0oO$il1LilLllii     // Catch:{ all -> 0x0022 }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x0022 }
            r0.add(r1)     // Catch:{ all -> 0x0022 }
            r6.iiiiI1iILL11I()     // Catch:{ all -> 0x0022 }
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x003e:
            monitor-exit(r6)
            return r1
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0022 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.IliiLiLliIl(top.tntok.autobot.ili11iILI1l, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.i1LIL11l.illlI1lLIL(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        top.tntok.autobot.C0487o0OooooO.I11lLL1(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i111iLiiIIill(java.lang.Exception r4, @javax.annotation.Nullable top.tntok.autobot.C0337o0O0oooO r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.IilL11ii1I1Il     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r4 = move-exception
            goto L_0x002f
        L_0x0009:
            r0 = 1
            r3.IilL11ii1I1Il = r0     // Catch:{ all -> 0x0007 }
            top.tntok.autobot.o0O0oO$iilLil1i11I1 r0 = r3.IiiL1llIIi     // Catch:{ all -> 0x0007 }
            r1 = 0
            r3.IiiL1llIIi = r1     // Catch:{ all -> 0x0007 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.iL1LIlIlI     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0019
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0007 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.iilLiIIIi11i     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0020
            r1.shutdown()     // Catch:{ all -> 0x0007 }
        L_0x0020:
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            top.tntok.autobot.o0o00O r1 = r3.i1LIL11l     // Catch:{ all -> 0x002a }
            r1.illlI1lLIL(r3, r4, r5)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r0)
            return
        L_0x002a:
            r4 = move-exception
            top.tntok.autobot.C0487o0OooooO.I11lLL1(r0)
            throw r4
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.i111iLiiIIill(java.lang.Exception, top.tntok.autobot.o0O0oooO):void");
    }

    public synchronized int i11liIIl11Ii1() {
        return this.ILl1iII11Ll1;
    }

    public void i1L1lLllLLlIi(C0337o0O0oooO o0o0oooo, @Nullable C0045Ooooo00 ooooo00) throws IOException {
        if (o0o0oooo.IiIl11II() == 101) {
            String ilLIlL1ILi = o0o0oooo.ilLIlL1ILi("Connection");
            if (C0223o00oO00o.IliiLiLliIl.equalsIgnoreCase(ilLIlL1ILi)) {
                String ilLIlL1ILi2 = o0o0oooo.ilLIlL1ILi(C0223o00oO00o.IliiLiLliIl);
                if (C0223o00oO00o.i11liIIl11Ii1.equalsIgnoreCase(ilLIlL1ILi2)) {
                    String ilLIlL1ILi3 = o0o0oooo.ilLIlL1ILi("Sec-WebSocket-Accept");
                    String i1LIL11l2 = ili11iILI1l.IiiL1llIIi(this.iiIliillii + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").IILiIL1i11Li().i1LIL11l();
                    if (!i1LIL11l2.equals(ilLIlL1ILi3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + i1LIL11l2 + "' but was '" + ilLIlL1ILi3 + "'");
                    } else if (ooooo00 == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ilLIlL1ILi2 + "'");
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ilLIlL1ILi + "'");
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + o0o0oooo.IiIl11II() + " " + o0o0oooo.iILlLIlli() + "'");
        }
    }

    public void i1LIL11l() {
        this.iilLil1i11I1.i1LIL11l();
    }

    public void i1iI1iiLL1() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.iL1LIlIlI;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.iilLiIIIi11i.shutdown();
        this.iilLiIIIi11i.awaitTermination(10, TimeUnit.SECONDS);
    }

    public synchronized int i1iiLIil1ILi() {
        return this.iiLIIiIli;
    }

    public void iL1LIlIlI(C0240o00oOoOO o00ooooo) {
        C0240o00oOoOO il1LilLllii2 = o00ooooo.i11liIIl11Ii1().iL1LIlIlI(C0042OoooOo0.iiI1L1iI).iiiiI1iILL11I(i11liIIl11Ii1).il1LilLllii();
        C0333o0O0ooO0 i1LIL11l2 = this.iiI1L1iI.iLLLILIiLi1Ii().iLLLILIiLi1Ii(C0223o00oO00o.IliiLiLliIl, C0223o00oO00o.i11liIIl11Ii1).iLLLILIiLi1Ii("Connection", C0223o00oO00o.IliiLiLliIl).iLLLILIiLi1Ii("Sec-WebSocket-Key", this.iiIliillii).iLLLILIiLi1Ii("Sec-WebSocket-Version", C0223o00oO00o.i1iI1iiLL1).i1LIL11l();
        iiIIl1I IiIIlIL2 = C0139o00OO00o.iiI1L1iI.IiIIlIL(il1LilLllii2, i1LIL11l2);
        this.iilLil1i11I1 = IiIIlIL2;
        IiIIlIL2.ilLIlL1ILi(new iiI1L1iI(i1LIL11l2));
    }

    public boolean iLLLILIiLi1Ii(ili11iILI1l ili11iili1l) {
        if (ili11iili1l != null) {
            return IliiLiLliIl(ili11iili1l, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    public C0333o0O0ooO0 iiI1L1iI() {
        return this.iiI1L1iI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void iiIliillii(top.tntok.autobot.ili11iILI1l r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.IilL11ii1I1Il     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1.IL1lILLLL1L     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            java.util.ArrayDeque<java.lang.Object> r0 = r1.I1iIiIi     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            goto L_0x0024
        L_0x0012:
            r2 = move-exception
            goto L_0x0026
        L_0x0014:
            java.util.ArrayDeque<top.tntok.autobot.ili11iILI1l> r0 = r1.iILiI1lll     // Catch:{ all -> 0x0012 }
            r0.add(r2)     // Catch:{ all -> 0x0012 }
            r1.iiiiI1iILL11I()     // Catch:{ all -> 0x0012 }
            int r2 = r1.iiLIIiIli     // Catch:{ all -> 0x0012 }
            int r2 = r2 + 1
            r1.iiLIIiIli = r2     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x0024:
            monitor-exit(r1)
            return
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.iiIliillii(top.tntok.autobot.ili11iILI1l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean iiLIIiIli(top.tntok.autobot.ili11iILI1l r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.IilL11ii1I1Il     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = r1.IL1lILLLL1L     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            java.util.ArrayDeque<java.lang.Object> r0 = r1.I1iIiIi     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            goto L_0x001f
        L_0x0012:
            r2 = move-exception
            goto L_0x0022
        L_0x0014:
            java.util.ArrayDeque<top.tntok.autobot.ili11iILI1l> r0 = r1.iILiI1lll     // Catch:{ all -> 0x0012 }
            r0.add(r2)     // Catch:{ all -> 0x0012 }
            r1.iiiiI1iILL11I()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x001f:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0317o0O0oO.iiLIIiIli(top.tntok.autobot.ili11iILI1l):boolean");
    }

    public final void iiiiI1iILL11I() {
        ScheduledExecutorService scheduledExecutorService = this.iilLiIIIi11i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.I11lLL1);
        }
    }

    public void iilLiIIIi11i(ili11iILI1l ili11iili1l) throws IOException {
        this.i1LIL11l.iiIliillii(this, ili11iili1l);
    }

    public void iilLil1i11I1(String str) throws IOException {
        this.i1LIL11l.il1LilLllii(this, str);
    }

    public boolean il1LilLllii(int i, String str) {
        return IL1lILLLL1L(i, str, IliiLiLliIl);
    }

    public synchronized long illlI1lLIL() {
        return this.i1L1lLllLLlIi;
    }
}
