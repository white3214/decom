package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o000o0o0  reason: case insensitive filesystem */
public final class C0102o000o0o0 {
    public static final /* synthetic */ boolean I1iIiIi = false;
    public final i1LIL11l I11lLL1;
    public final illlI1lLIL IiIIlIL;
    @Nullable
    public C0039OoooOO0 IiiL1llIIi;
    public long i1LIL11l;
    @Nullable
    public IOException iILiI1lll;
    public final iiI1L1iI iLLLILIiLi1Ii;
    public long iiI1L1iI = 0;
    public final Deque<C0094o000o000> iiIliillii;
    public final illlI1lLIL iilLiIIIi11i;
    public boolean iilLil1i11I1;
    public final C0097o000o0O il1LilLllii;
    public final int illlI1lLIL;

    /* renamed from: top.tntok.autobot.o000o0o0$i1LIL11l */
    public final class i1LIL11l implements C0370o0OOOooO {
        public static final /* synthetic */ boolean IiIIlIL = false;
        public boolean I11lLL1;
        public final IiILIlLLiIL i1LIL11l = new IiILIlLLiIL();
        public C0094o000o000 iiIliillii;
        public boolean iilLil1i11I1;
        public final long il1LilLllii;
        public final IiILIlLLiIL illlI1lLIL = new IiILIlLLiIL();

        public i1LIL11l(long j) {
            this.il1LilLllii = j;
        }

        public final void I1LiILiLLIl1l(long j) {
            C0102o000o0o0.this.il1LilLllii.il11iII1(j);
        }

        /* JADX INFO: finally extract failed */
        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            Throwable th;
            long IIlllIIi1ii;
            if (j >= 0) {
                while (true) {
                    synchronized (C0102o000o0o0.this) {
                        try {
                            C0102o000o0o0.this.IiIIlIL.i1L1lLllLLlIi();
                            C0102o000o0o0 o000o0o0 = C0102o000o0o0.this;
                            if (o000o0o0.IiiL1llIIi != null) {
                                th = o000o0o0.iILiI1lll;
                                if (th == null) {
                                    th = new C0380o0OOo0o0(C0102o000o0o0.this.IiiL1llIIi);
                                }
                            } else {
                                th = null;
                            }
                            if (this.iilLil1i11I1) {
                                throw new IOException("stream closed");
                            } else if (this.illlI1lLIL.iLLi1LIi() > 0) {
                                IiILIlLLiIL iiILIlLLiIL2 = this.illlI1lLIL;
                                IIlllIIi1ii = iiILIlLLiIL2.IIlllIIi1ii(iiILIlLLiIL, Math.min(j, iiILIlLLiIL2.iLLi1LIi()));
                                C0102o000o0o0 o000o0o02 = C0102o000o0o0.this;
                                long j2 = o000o0o02.iiI1L1iI + IIlllIIi1ii;
                                o000o0o02.iiI1L1iI = j2;
                                if (th == null && j2 >= ((long) (o000o0o02.il1LilLllii.iiLIIiIli.iiIliillii() / 2))) {
                                    C0102o000o0o0 o000o0o03 = C0102o000o0o0.this;
                                    o000o0o03.il1LilLllii.ILI1Iil1li(o000o0o03.illlI1lLIL, o000o0o03.iiI1L1iI);
                                    C0102o000o0o0.this.iiI1L1iI = 0;
                                }
                            } else if (this.I11lLL1 || th != null) {
                                IIlllIIi1ii = -1;
                            } else {
                                C0102o000o0o0.this.iiLIIiIli();
                                C0102o000o0o0.this.IiIIlIL.i11liIIl11Ii1();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                C0102o000o0o0.this.IiIIlIL.i11liIIl11Ii1();
                if (IIlllIIi1ii != -1) {
                    I1LiILiLLIl1l(IIlllIIi1ii);
                    return IIlllIIi1ii;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }

        public void IiIl11II(ILL1iL1LiiI iLL1iL1LiiI, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (C0102o000o0o0.this) {
                    z = this.I11lLL1;
                    z2 = false;
                    if (this.illlI1lLIL.iLLi1LIi() + j > this.il1LilLllii) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    iLL1iL1LiiI.skip(j);
                    C0102o000o0o0.this.iilLil1i11I1(C0039OoooOO0.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    iLL1iL1LiiI.skip(j);
                    return;
                } else {
                    long IIlllIIi1ii = iLL1iL1LiiI.IIlllIIi1ii(this.i1LIL11l, j);
                    if (IIlllIIi1ii != -1) {
                        j -= IIlllIIi1ii;
                        synchronized (C0102o000o0o0.this) {
                            try {
                                if (this.iilLil1i11I1) {
                                    j2 = this.i1LIL11l.iLLi1LIi();
                                    this.i1LIL11l.IIL1Ll1I111();
                                } else {
                                    if (this.illlI1lLIL.iLLi1LIi() == 0) {
                                        z2 = true;
                                    }
                                    this.illlI1lLIL.Ii1liIIIiLi(this.i1LIL11l);
                                    if (z2) {
                                        C0102o000o0o0.this.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        if (j2 > 0) {
                            I1LiILiLLIl1l(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            long iLLi1LIi;
            synchronized (C0102o000o0o0.this) {
                this.iilLil1i11I1 = true;
                iLLi1LIi = this.illlI1lLIL.iLLi1LIi();
                this.illlI1lLIL.IIL1Ll1I111();
                C0102o000o0o0.this.notifyAll();
            }
            if (iLLi1LIi > 0) {
                I1LiILiLLIl1l(iLLi1LIi);
            }
            C0102o000o0o0.this.i1LIL11l();
        }

        public C0446o0OoOOOo timeout() {
            return C0102o000o0o0.this.IiIIlIL;
        }
    }

    /* renamed from: top.tntok.autobot.o000o0o0$iiI1L1iI */
    public final class iiI1L1iI implements C0361o0OOOo0 {
        public static final long I11lLL1 = 16384;
        public static final /* synthetic */ boolean iLLLILIiLi1Ii = false;
        public final IiILIlLLiIL i1LIL11l = new IiILIlLLiIL();
        public boolean iiIliillii;
        public boolean il1LilLllii;
        public C0094o000o000 illlI1lLIL;

        public iiI1L1iI() {
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            this.i1LIL11l.I1iIiIi(iiILIlLLiIL, j);
            while (this.i1LIL11l.iLLi1LIi() >= I11lLL1) {
                i1LIL11l(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            if (r8.iilLil1i11I1.iLLLILIiLi1Ii.iiIliillii != false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r8.i1LIL11l.iLLi1LIi() <= 0) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
            if (r8.illlI1lLIL == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
            if (r8.i1LIL11l.iLLi1LIi() <= 0) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            i1LIL11l(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            r0 = r8.iilLil1i11I1;
            r0.il1LilLllii.iLLi1LIi(r0.illlI1lLIL, true, top.tntok.autobot.C0487o0OooooO.IIlLill(r8.illlI1lLIL));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            if (r2 == false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            if (r8.i1LIL11l.iLLi1LIi() <= 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            i1LIL11l(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
            r0 = r8.iilLil1i11I1;
            r0.il1LilLllii.iliiI1Ii1iIl(r0.illlI1lLIL, true, (top.tntok.autobot.IiILIlLLiIL) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
            r2 = r8.iilLil1i11I1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r8.il1LilLllii = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
            r8.iilLil1i11I1.il1LilLllii.flush();
            r8.iilLil1i11I1.i1LIL11l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                monitor-enter(r0)
                boolean r1 = r8.il1LilLllii     // Catch:{ all -> 0x0009 }
                if (r1 == 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                return
            L_0x0009:
                r1 = move-exception
                goto L_0x007b
            L_0x000c:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0o0$iiI1L1iI r0 = r0.iLLLILIiLi1Ii
                boolean r0 = r0.iiIliillii
                r1 = 1
                if (r0 != 0) goto L_0x0065
                top.tntok.autobot.IiILIlLLiIL r0 = r8.i1LIL11l
                long r2 = r0.iLLi1LIi()
                r0 = 0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0025
                r2 = 1
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                top.tntok.autobot.o000o000 r3 = r8.illlI1lLIL
                if (r3 == 0) goto L_0x0048
            L_0x002a:
                top.tntok.autobot.IiILIlLLiIL r2 = r8.i1LIL11l
                long r2 = r2.iLLi1LIi()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0038
                r8.i1LIL11l(r0)
                goto L_0x002a
            L_0x0038:
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0O r2 = r0.il1LilLllii
                int r0 = r0.illlI1lLIL
                top.tntok.autobot.o000o000 r3 = r8.illlI1lLIL
                java.util.List r3 = top.tntok.autobot.C0487o0OooooO.IIlLill(r3)
                r2.iLLi1LIi(r0, r1, r3)
                goto L_0x0065
            L_0x0048:
                if (r2 == 0) goto L_0x0058
            L_0x004a:
                top.tntok.autobot.IiILIlLLiIL r0 = r8.i1LIL11l
                long r2 = r0.iLLi1LIi()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0065
                r8.i1LIL11l(r1)
                goto L_0x004a
            L_0x0058:
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0O r2 = r0.il1LilLllii
                int r3 = r0.illlI1lLIL
                r5 = 0
                r6 = 0
                r4 = 1
                r2.iliiI1Ii1iIl(r3, r4, r5, r6)
            L_0x0065:
                top.tntok.autobot.o000o0o0 r2 = top.tntok.autobot.C0102o000o0o0.this
                monitor-enter(r2)
                r8.il1LilLllii = r1     // Catch:{ all -> 0x0078 }
                monitor-exit(r2)     // Catch:{ all -> 0x0078 }
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0O r0 = r0.il1LilLllii
                r0.flush()
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                r0.i1LIL11l()
                return
            L_0x0078:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0078 }
                throw r0
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0102o000o0o0.iiI1L1iI.close():void");
        }

        public void flush() throws IOException {
            synchronized (C0102o000o0o0.this) {
                C0102o000o0o0.this.illlI1lLIL();
            }
            while (this.i1LIL11l.iLLi1LIi() > 0) {
                i1LIL11l(false);
                C0102o000o0o0.this.il1LilLllii.flush();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.iilLiIIIi11i.i11liIIl11Ii1();
            r11.iilLil1i11I1.illlI1lLIL();
            r9 = java.lang.Math.min(r11.iilLil1i11I1.i1LIL11l, r11.i1LIL11l.iLLi1LIi());
            r1 = r11.iilLil1i11I1;
            r1.i1LIL11l -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i1LIL11l(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                monitor-enter(r0)
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0$illlI1lLIL r1 = r1.iilLiIIIi11i     // Catch:{ all -> 0x0079 }
                r1.i1L1lLllLLlIi()     // Catch:{ all -> 0x0079 }
            L_0x000a:
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0024 }
                long r2 = r1.i1LIL11l     // Catch:{ all -> 0x0024 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0026
                boolean r2 = r11.iiIliillii     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                boolean r2 = r11.il1LilLllii     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                top.tntok.autobot.OoooOO0 r2 = r1.IiiL1llIIi     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                r1.iiLIIiIli()     // Catch:{ all -> 0x0024 }
                goto L_0x000a
            L_0x0024:
                r12 = move-exception
                goto L_0x007b
            L_0x0026:
                top.tntok.autobot.o000o0o0$illlI1lLIL r1 = r1.iilLiIIIi11i     // Catch:{ all -> 0x0079 }
                r1.i11liIIl11Ii1()     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0079 }
                r1.illlI1lLIL()     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0079 }
                long r1 = r1.i1LIL11l     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.IiILIlLLiIL r3 = r11.i1LIL11l     // Catch:{ all -> 0x0079 }
                long r3 = r3.iLLi1LIi()     // Catch:{ all -> 0x0079 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0079 }
                long r2 = r1.i1LIL11l     // Catch:{ all -> 0x0079 }
                long r2 = r2 - r9
                r1.i1LIL11l = r2     // Catch:{ all -> 0x0079 }
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0$illlI1lLIL r0 = r1.iilLiIIIi11i
                r0.i1L1lLllLLlIi()
                if (r12 == 0) goto L_0x005c
                top.tntok.autobot.IiILIlLLiIL r12 = r11.i1LIL11l     // Catch:{ all -> 0x005a }
                long r0 = r12.iLLi1LIi()     // Catch:{ all -> 0x005a }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005c
                r12 = 1
                r7 = 1
                goto L_0x005e
            L_0x005a:
                r12 = move-exception
                goto L_0x0071
            L_0x005c:
                r12 = 0
                r7 = 0
            L_0x005e:
                top.tntok.autobot.o000o0o0 r12 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x005a }
                top.tntok.autobot.o000o0O r5 = r12.il1LilLllii     // Catch:{ all -> 0x005a }
                int r6 = r12.illlI1lLIL     // Catch:{ all -> 0x005a }
                top.tntok.autobot.IiILIlLLiIL r8 = r11.i1LIL11l     // Catch:{ all -> 0x005a }
                r5.iliiI1Ii1iIl(r6, r7, r8, r9)     // Catch:{ all -> 0x005a }
                top.tntok.autobot.o000o0o0 r12 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0o0$illlI1lLIL r12 = r12.iilLiIIIi11i
                r12.i11liIIl11Ii1()
                return
            L_0x0071:
                top.tntok.autobot.o000o0o0 r0 = top.tntok.autobot.C0102o000o0o0.this
                top.tntok.autobot.o000o0o0$illlI1lLIL r0 = r0.iilLiIIIi11i
                r0.i11liIIl11Ii1()
                throw r12
            L_0x0079:
                r12 = move-exception
                goto L_0x0083
            L_0x007b:
                top.tntok.autobot.o000o0o0 r1 = top.tntok.autobot.C0102o000o0o0.this     // Catch:{ all -> 0x0079 }
                top.tntok.autobot.o000o0o0$illlI1lLIL r1 = r1.iilLiIIIi11i     // Catch:{ all -> 0x0079 }
                r1.i11liIIl11Ii1()     // Catch:{ all -> 0x0079 }
                throw r12     // Catch:{ all -> 0x0079 }
            L_0x0083:
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0102o000o0o0.iiI1L1iI.i1LIL11l(boolean):void");
        }

        public C0446o0OoOOOo timeout() {
            return C0102o000o0o0.this.iilLiIIIi11i;
        }
    }

    /* renamed from: top.tntok.autobot.o000o0o0$illlI1lLIL */
    public class illlI1lLIL extends iLIIl1IliLlLI {
        public illlI1lLIL() {
        }

        public IOException Ii1liIIIiLi(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void i11liIIl11Ii1() throws IOException {
            if (i111iLiiIIill()) {
                throw Ii1liIIIiLi((IOException) null);
            }
        }

        public void i1iiLIil1ILi() {
            C0102o000o0o0.this.iilLil1i11I1(C0039OoooOO0.CANCEL);
            C0102o000o0o0.this.il1LilLllii.iL1lL1LL();
        }
    }

    public C0102o000o0o0(int i, C0097o000o0O o000o0o, boolean z, boolean z2, @Nullable C0094o000o000 o000o000) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.iiIliillii = arrayDeque;
        this.IiIIlIL = new illlI1lLIL();
        this.iilLiIIIi11i = new illlI1lLIL();
        if (o000o0o != null) {
            this.illlI1lLIL = i;
            this.il1LilLllii = o000o0o;
            this.i1LIL11l = (long) o000o0o.ILl1iII11Ll1.iiIliillii();
            i1LIL11l i1lil11l = new i1LIL11l((long) o000o0o.iiLIIiIli.iiIliillii());
            this.I11lLL1 = i1lil11l;
            iiI1L1iI iii1l1ii = new iiI1L1iI();
            this.iLLLILIiLi1Ii = iii1l1ii;
            i1lil11l.I11lLL1 = z2;
            iii1l1ii.iiIliillii = z;
            if (o000o000 != null) {
                arrayDeque.add(o000o000);
            }
            if (I1iIiIi() && o000o000 != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!I1iIiIi() && o000o000 == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public void I11lLL1(C0094o000o000 o000o000) {
        synchronized (this) {
            try {
                if (this.iLLLILIiLi1Ii.iiIliillii) {
                    throw new IllegalStateException("already finished");
                } else if (o000o000.I1iIiIi() != 0) {
                    C0094o000o000 unused = this.iLLLILIiLi1Ii.illlI1lLIL = o000o000;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean I1iIiIi() {
        boolean z;
        if ((this.illlI1lLIL & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.il1LilLllii.i1LIL11l == z) {
            return true;
        }
        return false;
    }

    public synchronized C0094o000o000 I1l1iIll1lIi1() throws IOException {
        C0094o000o000 o000o000;
        try {
            if (this.IiiL1llIIi != null) {
                Throwable th = this.iILiI1lll;
                if (th == null) {
                    th = new C0380o0OOo0o0(this.IiiL1llIIi);
                }
                throw th;
            }
            i1LIL11l i1lil11l = this.I11lLL1;
            if (!i1lil11l.I11lLL1 || !i1lil11l.i1LIL11l.Il1llillili() || !this.I11lLL1.illlI1lLIL.Il1llillili()) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            } else if (this.I11lLL1.iiIliillii != null) {
                o000o000 = this.I11lLL1.iiIliillii;
            } else {
                o000o000 = C0487o0OooooO.illlI1lLIL;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return o000o000;
    }

    public C0446o0OoOOOo IL1lILLLL1L() {
        return this.IiIIlIL;
    }

    public void ILl1iII11Ll1(List<C0090o000Ooo0> list, boolean z, boolean z2) throws IOException {
        if (list != null) {
            synchronized (this) {
                try {
                    this.iilLil1i11I1 = true;
                    if (z) {
                        this.iLLLILIiLi1Ii.iiIliillii = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (!z2) {
                synchronized (this.il1LilLllii) {
                    if (this.il1LilLllii.I1l1iIll1lIi1 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            this.il1LilLllii.iLLi1LIi(this.illlI1lLIL, z, list);
            if (z2) {
                this.il1LilLllii.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public synchronized void Ii1liIIIiLi(C0039OoooOO0 ooooOO0) {
        if (this.IiiL1llIIi == null) {
            this.IiiL1llIIi = ooooOO0;
            notifyAll();
        }
    }

    public synchronized C0039OoooOO0 IiIIlIL() {
        return this.IiiL1llIIi;
    }

    public C0361o0OOOo0 IiiL1llIIi() {
        synchronized (this) {
            try {
                if (!this.iilLil1i11I1) {
                    if (!I1iIiIi()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return this.iLLLILIiLi1Ii;
    }

    /* JADX INFO: finally extract failed */
    public synchronized C0094o000o000 IilL11ii1I1Il() throws IOException {
        this.IiIIlIL.i1L1lLllLLlIi();
        while (this.iiIliillii.isEmpty() && this.IiiL1llIIi == null) {
            try {
                iiLIIiIli();
            } catch (Throwable th) {
                this.IiIIlIL.i11liIIl11Ii1();
                throw th;
            }
        }
        this.IiIIlIL.i11liIIl11Ii1();
        if (!this.iiIliillii.isEmpty()) {
        } else {
            Throwable th2 = this.iILiI1lll;
            if (th2 == null) {
                th2 = new C0380o0OOo0o0(this.IiiL1llIIi);
            }
            throw th2;
        }
        return this.iiIliillii.removeFirst();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[Catch:{ all -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i111iLiiIIill(top.tntok.autobot.C0094o000o000 r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.iilLil1i11I1     // Catch:{ all -> 0x000f }
            r1 = 1
            if (r0 == 0) goto L_0x0011
            if (r4 != 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            top.tntok.autobot.o000o0o0$i1LIL11l r0 = r2.I11lLL1     // Catch:{ all -> 0x000f }
            top.tntok.autobot.C0094o000o000 unused = r0.iiIliillii = r3     // Catch:{ all -> 0x000f }
            goto L_0x0018
        L_0x000f:
            r3 = move-exception
            goto L_0x0030
        L_0x0011:
            r2.iilLil1i11I1 = r1     // Catch:{ all -> 0x000f }
            java.util.Deque<top.tntok.autobot.o000o000> r0 = r2.iiIliillii     // Catch:{ all -> 0x000f }
            r0.add(r3)     // Catch:{ all -> 0x000f }
        L_0x0018:
            if (r4 == 0) goto L_0x001e
            top.tntok.autobot.o000o0o0$i1LIL11l r3 = r2.I11lLL1     // Catch:{ all -> 0x000f }
            r3.I11lLL1 = r1     // Catch:{ all -> 0x000f }
        L_0x001e:
            boolean r3 = r2.i1L1lLllLLlIi()     // Catch:{ all -> 0x000f }
            r2.notifyAll()     // Catch:{ all -> 0x000f }
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            if (r3 != 0) goto L_0x002f
            top.tntok.autobot.o000o0O r3 = r2.il1LilLllii
            int r4 = r2.illlI1lLIL
            r3.IiL1llLiil1(r4)
        L_0x002f:
            return
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0102o000o0o0.i111iLiiIIill(top.tntok.autobot.o000o000, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean i1L1lLllLLlIi() {
        /*
            r3 = this;
            monitor-enter(r3)
            top.tntok.autobot.OoooOO0 r0 = r3.IiiL1llIIi     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            top.tntok.autobot.o000o0o0$i1LIL11l r0 = r3.I11lLL1     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.I11lLL1     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            boolean r0 = r0.iilLil1i11I1     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            goto L_0x0015
        L_0x0013:
            r0 = move-exception
            goto L_0x0028
        L_0x0015:
            top.tntok.autobot.o000o0o0$iiI1L1iI r0 = r3.iLLLILIiLi1Ii     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.iiIliillii     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x001f
            boolean r0 = r0.il1LilLllii     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            boolean r0 = r3.iilLil1i11I1     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r3)
            return r1
        L_0x0025:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0102o000o0o0.i1L1lLllLLlIi():boolean");
    }

    public void i1LIL11l() throws IOException {
        boolean z;
        boolean i1L1lLllLLlIi;
        synchronized (this) {
            try {
                i1LIL11l i1lil11l = this.I11lLL1;
                if (!i1lil11l.I11lLL1 && i1lil11l.iilLil1i11I1) {
                    iiI1L1iI iii1l1ii = this.iLLLILIiLi1Ii;
                    if (!iii1l1ii.iiIliillii) {
                        if (iii1l1ii.il1LilLllii) {
                        }
                    }
                    z = true;
                    i1L1lLllLLlIi = i1L1lLllLLlIi();
                }
                z = false;
                i1L1lLllLLlIi = i1L1lLllLLlIi();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z) {
            il1LilLllii(C0039OoooOO0.CANCEL, (IOException) null);
        } else if (!i1L1lLllLLlIi) {
            this.il1LilLllii.IiL1llLiil1(this.illlI1lLIL);
        }
    }

    public C0446o0OoOOOo i1iiLIil1ILi() {
        return this.iilLiIIIi11i;
    }

    public C0370o0OOOooO iILiI1lll() {
        return this.I11lLL1;
    }

    public void iL1LIlIlI(ILL1iL1LiiI iLL1iL1LiiI, int i) throws IOException {
        this.I11lLL1.IiIl11II(iLL1iL1LiiI, (long) i);
    }

    public C0097o000o0O iLLLILIiLi1Ii() {
        return this.il1LilLllii;
    }

    public void iiI1L1iI(long j) {
        this.i1LIL11l += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final boolean iiIliillii(C0039OoooOO0 ooooOO0, @Nullable IOException iOException) {
        synchronized (this) {
            try {
                if (this.IiiL1llIIi != null) {
                    return false;
                }
                if (this.I11lLL1.I11lLL1 && this.iLLLILIiLi1Ii.iiIliillii) {
                    return false;
                }
                this.IiiL1llIIi = ooooOO0;
                this.iILiI1lll = iOException;
                notifyAll();
                this.il1LilLllii.IiL1llLiil1(this.illlI1lLIL);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void iiLIIiIli() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public int iilLiIIIi11i() {
        return this.illlI1lLIL;
    }

    public void iilLil1i11I1(C0039OoooOO0 ooooOO0) {
        if (iiIliillii(ooooOO0, (IOException) null)) {
            this.il1LilLllii.iLLlLIIliLl(this.illlI1lLIL, ooooOO0);
        }
    }

    public void il1LilLllii(C0039OoooOO0 ooooOO0, @Nullable IOException iOException) throws IOException {
        if (iiIliillii(ooooOO0, iOException)) {
            this.il1LilLllii.I11lLL1L11Lil(this.illlI1lLIL, ooooOO0);
        }
    }

    public void illlI1lLIL() throws IOException {
        iiI1L1iI iii1l1ii = this.iLLLILIiLi1Ii;
        if (iii1l1ii.il1LilLllii) {
            throw new IOException("stream closed");
        } else if (iii1l1ii.iiIliillii) {
            throw new IOException("stream finished");
        } else if (this.IiiL1llIIi != null) {
            Throwable th = this.iILiI1lll;
            if (th == null) {
                th = new C0380o0OOo0o0(this.IiiL1llIIi);
            }
            throw th;
        }
    }
}
