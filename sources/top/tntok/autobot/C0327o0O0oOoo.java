package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: top.tntok.autobot.o0O0oOoo  reason: case insensitive filesystem */
public final class C0327o0O0oOoo {
    public static final ili11iILI1l I1iIiIi = ili11iILI1l.IiiL1llIIi("OkHttp cache v1\n");
    public static final long IL1lILLLL1L = 32;
    public static final int IiiL1llIIi = 1;
    public static final ili11iILI1l i1L1lLllLLlIi = ili11iILI1l.IiiL1llIIi("OkHttp DIRTY :(\n");
    public static final int iILiI1lll = 2;
    public final ili11iILI1l I11lLL1;
    public final long IiIIlIL;
    public Thread i1LIL11l;
    public final IiILIlLLiIL iLLLILIiLi1Ii = new IiILIlLLiIL();
    public RandomAccessFile iiI1L1iI;
    public long iiIliillii;
    public int iilLiIIIi11i;
    public boolean iilLil1i11I1;
    public final IiILIlLLiIL il1LilLllii = new IiILIlLLiIL();
    public C0370o0OOOooO illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0O0oOoo$iiI1L1iI */
    public class iiI1L1iI implements C0370o0OOOooO {
        public final C0446o0OoOOOo i1LIL11l = new C0446o0OoOOOo();
        public long il1LilLllii;
        public C0073o0000oo illlI1lLIL;

        public iiI1L1iI() {
            this.illlI1lLIL = new C0073o0000oo(C0327o0O0oOoo.this.iiI1L1iI.getChannel());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r0 = r1.iiIliillii;
            r5 = r0.illlI1lLIL.IIlllIIi1ii(r0.il1LilLllii, r0.IiIIlIL);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
            if (r5 != -1) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
            r1.iiIliillii.iiI1L1iI(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            r2 = r1.iiIliillii;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r0 = r1.iiIliillii;
            r0.i1LIL11l = null;
            r0.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r2 = java.lang.Math.min(r5, r2);
            r1.iiIliillii.il1LilLllii.iILlLIlli(r22, 0, r2);
            r1.il1LilLllii += r2;
            r1.illlI1lLIL.i1LIL11l(r7 + 32, r1.iiIliillii.il1LilLllii.clone(), r5);
            r7 = r1.iiIliillii;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r0 = r1.iiIliillii;
            r0.iLLLILIiLi1Ii.I1iIiIi(r0.il1LilLllii, r5);
            r8 = r1.iiIliillii.iLLLILIiLi1Ii.iLLi1LIi();
            r0 = r1.iiIliillii;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
            if (r8 <= r0.IiIIlIL) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
            r0 = r0.iLLLILIiLi1Ii;
            r0.skip(r0.iLLi1LIi() - r1.iiIliillii.IiIIlIL);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
            r8 = r1.iiIliillii;
            r8.iiIliillii += r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
            monitor-enter(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0 = r1.iiIliillii;
            r0.i1LIL11l = null;
            r0.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
            monitor-exit(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c6, code lost:
            monitor-enter(r1.iiIliillii);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r3 = r1.iiIliillii;
            r3.i1LIL11l = null;
            r3.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            r5 = r7 - r0.iLLLILIiLi1Ii.iLLi1LIi();
            r11 = r1.il1LilLllii;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
            if (r11 >= r5) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e2, code lost:
            r2 = java.lang.Math.min(r2, r7 - r11);
            r1.illlI1lLIL.iiI1L1iI(r1.il1LilLllii + 32, r22, r2);
            r1.il1LilLllii += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f8, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r2 = java.lang.Math.min(r2, r7 - r11);
            r1.iiIliillii.iLLLILIiLi1Ii.iILlLIlli(r22, r1.il1LilLllii - r5, r2);
            r1.il1LilLllii += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0112, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long IIlllIIi1ii(top.tntok.autobot.IiILIlLLiIL r22, long r23) throws java.io.IOException {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                top.tntok.autobot.o0000oo r0 = r1.illlI1lLIL
                if (r0 == 0) goto L_0x0115
                top.tntok.autobot.o0O0oOoo r4 = top.tntok.autobot.C0327o0O0oOoo.this
                monitor-enter(r4)
            L_0x000b:
                long r5 = r1.il1LilLllii     // Catch:{ all -> 0x001f }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x001f }
                long r7 = r0.iiIliillii     // Catch:{ all -> 0x001f }
                r9 = 32
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x00d3
                boolean r5 = r0.iilLil1i11I1     // Catch:{ all -> 0x001f }
                r11 = -1
                if (r5 == 0) goto L_0x0022
                monitor-exit(r4)     // Catch:{ all -> 0x001f }
                return r11
            L_0x001f:
                r0 = move-exception
                goto L_0x0113
            L_0x0022:
                java.lang.Thread r5 = r0.i1LIL11l     // Catch:{ all -> 0x001f }
                if (r5 == 0) goto L_0x002c
                top.tntok.autobot.o0OoOOOo r5 = r1.i1LIL11l     // Catch:{ all -> 0x001f }
                r5.IiiL1llIIi(r0)     // Catch:{ all -> 0x001f }
                goto L_0x000b
            L_0x002c:
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001f }
                r0.i1LIL11l = r5     // Catch:{ all -> 0x001f }
                monitor-exit(r4)     // Catch:{ all -> 0x001f }
                r4 = 0
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0OOOooO r5 = r0.illlI1lLIL     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.IiILIlLLiIL r6 = r0.il1LilLllii     // Catch:{ all -> 0x0058 }
                long r13 = r0.IiIIlIL     // Catch:{ all -> 0x0058 }
                long r5 = r5.IIlllIIi1ii(r6, r13)     // Catch:{ all -> 0x0058 }
                int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r0 != 0) goto L_0x005a
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0058 }
                r0.iiI1L1iI(r7)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0O0oOoo r2 = top.tntok.autobot.C0327o0O0oOoo.this
                monitor-enter(r2)
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0055 }
                r0.i1LIL11l = r4     // Catch:{ all -> 0x0055 }
                r0.notifyAll()     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                return r11
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r0 = move-exception
                goto L_0x00c4
            L_0x005a:
                long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.IiILIlLLiIL r11 = r0.il1LilLllii     // Catch:{ all -> 0x0058 }
                r13 = 0
                r12 = r22
                r15 = r2
                r11.iILlLIlli(r12, r13, r15)     // Catch:{ all -> 0x0058 }
                long r11 = r1.il1LilLllii     // Catch:{ all -> 0x0058 }
                long r11 = r11 + r2
                r1.il1LilLllii = r11     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0000oo r15 = r1.illlI1lLIL     // Catch:{ all -> 0x0058 }
                long r16 = r7 + r9
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.IiILIlLLiIL r0 = r0.il1LilLllii     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.IiILIlLLiIL r18 = r0.clone()     // Catch:{ all -> 0x0058 }
                r19 = r5
                r15.i1LIL11l(r16, r18, r19)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0O0oOoo r7 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x0058 }
                monitor-enter(r7)     // Catch:{ all -> 0x0058 }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.IiILIlLLiIL r8 = r0.iLLLILIiLi1Ii     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.IiILIlLLiIL r0 = r0.il1LilLllii     // Catch:{ all -> 0x00ab }
                r8.I1iIiIi(r0, r5)     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.IiILIlLLiIL r0 = r0.iLLLILIiLi1Ii     // Catch:{ all -> 0x00ab }
                long r8 = r0.iLLi1LIi()     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00ab }
                long r10 = r0.IiIIlIL     // Catch:{ all -> 0x00ab }
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto L_0x00ad
                top.tntok.autobot.IiILIlLLiIL r0 = r0.iLLLILIiLi1Ii     // Catch:{ all -> 0x00ab }
                long r8 = r0.iLLi1LIi()     // Catch:{ all -> 0x00ab }
                top.tntok.autobot.o0O0oOoo r10 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00ab }
                long r10 = r10.IiIIlIL     // Catch:{ all -> 0x00ab }
                long r8 = r8 - r10
                r0.skip(r8)     // Catch:{ all -> 0x00ab }
                goto L_0x00ad
            L_0x00ab:
                r0 = move-exception
                goto L_0x00c2
            L_0x00ad:
                top.tntok.autobot.o0O0oOoo r8 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00ab }
                long r9 = r8.iiIliillii     // Catch:{ all -> 0x00ab }
                long r9 = r9 + r5
                r8.iiIliillii = r9     // Catch:{ all -> 0x00ab }
                monitor-exit(r7)     // Catch:{ all -> 0x00ab }
                monitor-enter(r8)
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00bf }
                r0.i1LIL11l = r4     // Catch:{ all -> 0x00bf }
                r0.notifyAll()     // Catch:{ all -> 0x00bf }
                monitor-exit(r8)     // Catch:{ all -> 0x00bf }
                return r2
            L_0x00bf:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x00bf }
                throw r0
            L_0x00c2:
                monitor-exit(r7)     // Catch:{ all -> 0x00ab }
                throw r0     // Catch:{ all -> 0x0058 }
            L_0x00c4:
                top.tntok.autobot.o0O0oOoo r2 = top.tntok.autobot.C0327o0O0oOoo.this
                monitor-enter(r2)
                top.tntok.autobot.o0O0oOoo r3 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x00d0 }
                r3.i1LIL11l = r4     // Catch:{ all -> 0x00d0 }
                r3.notifyAll()     // Catch:{ all -> 0x00d0 }
                monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
                throw r0
            L_0x00d0:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00d0 }
                throw r0
            L_0x00d3:
                top.tntok.autobot.IiILIlLLiIL r0 = r0.iLLLILIiLi1Ii     // Catch:{ all -> 0x001f }
                long r5 = r0.iLLi1LIi()     // Catch:{ all -> 0x001f }
                long r5 = r7 - r5
                long r11 = r1.il1LilLllii     // Catch:{ all -> 0x001f }
                int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00f9
                monitor-exit(r4)     // Catch:{ all -> 0x001f }
                long r7 = r7 - r11
                long r2 = java.lang.Math.min(r2, r7)
                top.tntok.autobot.o0000oo r11 = r1.illlI1lLIL
                long r4 = r1.il1LilLllii
                long r12 = r4 + r9
                r14 = r22
                r15 = r2
                r11.iiI1L1iI(r12, r14, r15)
                long r4 = r1.il1LilLllii
                long r4 = r4 + r2
                r1.il1LilLllii = r4
                return r2
            L_0x00f9:
                long r7 = r7 - r11
                long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x001f }
                top.tntok.autobot.o0O0oOoo r0 = top.tntok.autobot.C0327o0O0oOoo.this     // Catch:{ all -> 0x001f }
                top.tntok.autobot.IiILIlLLiIL r9 = r0.iLLLILIiLi1Ii     // Catch:{ all -> 0x001f }
                long r7 = r1.il1LilLllii     // Catch:{ all -> 0x001f }
                long r11 = r7 - r5
                r10 = r22
                r13 = r2
                r9.iILlLIlli(r10, r11, r13)     // Catch:{ all -> 0x001f }
                long r5 = r1.il1LilLllii     // Catch:{ all -> 0x001f }
                long r5 = r5 + r2
                r1.il1LilLllii = r5     // Catch:{ all -> 0x001f }
                monitor-exit(r4)     // Catch:{ all -> 0x001f }
                return r2
            L_0x0113:
                monitor-exit(r4)     // Catch:{ all -> 0x001f }
                throw r0
            L_0x0115:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0327o0O0oOoo.iiI1L1iI.IIlllIIi1ii(top.tntok.autobot.IiILIlLLiIL, long):long");
        }

        public void close() throws IOException {
            if (this.illlI1lLIL != null) {
                RandomAccessFile randomAccessFile = null;
                this.illlI1lLIL = null;
                synchronized (C0327o0O0oOoo.this) {
                    try {
                        C0327o0O0oOoo o0o0oooo = C0327o0O0oOoo.this;
                        int i = o0o0oooo.iilLiIIIi11i - 1;
                        o0o0oooo.iilLiIIIi11i = i;
                        if (i == 0) {
                            RandomAccessFile randomAccessFile2 = o0o0oooo.iiI1L1iI;
                            o0o0oooo.iiI1L1iI = null;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (randomAccessFile != null) {
                    C0487o0OooooO.I11lLL1(randomAccessFile);
                }
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    public C0327o0O0oOoo(RandomAccessFile randomAccessFile, C0370o0OOOooO o0oooooo, long j, ili11iILI1l ili11iili1l, long j2) {
        boolean z;
        this.iiI1L1iI = randomAccessFile;
        this.illlI1lLIL = o0oooooo;
        if (o0oooooo == null) {
            z = true;
        } else {
            z = false;
        }
        this.iilLil1i11I1 = z;
        this.iiIliillii = j;
        this.I11lLL1 = ili11iili1l;
        this.IiIIlIL = j2;
    }

    public static C0327o0O0oOoo i1LIL11l(File file, C0370o0OOOooO o0oooooo, ili11iILI1l ili11iili1l, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C0327o0O0oOoo o0o0oooo = new C0327o0O0oOoo(randomAccessFile, o0oooooo, 0, ili11iili1l, j);
        randomAccessFile.setLength(0);
        o0o0oooo.I11lLL1(i1L1lLllLLlIi, -1, -1);
        return o0o0oooo;
    }

    public static C0327o0O0oOoo iilLil1i11I1(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C0073o0000oo o0000oo = new C0073o0000oo(randomAccessFile.getChannel());
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        o0000oo.iiI1L1iI(0, iiILIlLLiIL, 32);
        ili11iILI1l ili11iili1l = I1iIiIi;
        if (iiILIlLLiIL.iliilLllIl1((long) ili11iili1l.illiiliIILI()).equals(ili11iili1l)) {
            long readLong = iiILIlLLiIL.readLong();
            long readLong2 = iiILIlLLiIL.readLong();
            IiILIlLLiIL iiILIlLLiIL2 = new IiILIlLLiIL();
            o0000oo.iiI1L1iI(readLong + 32, iiILIlLLiIL2, readLong2);
            return new C0327o0O0oOoo(randomAccessFile, (C0370o0OOOooO) null, readLong, iiILIlLLiIL2.IL1IiilLlLI(), 0);
        }
        throw new IOException("unreadable cache file");
    }

    public final void I11lLL1(ili11iILI1l ili11iili1l, long j, long j2) throws IOException {
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        iiILIlLLiIL.ILiLII1ILi(ili11iili1l);
        iiILIlLLiIL.IilliIIIlI1ll(j);
        iiILIlLLiIL.IilliIIIlI1ll(j2);
        if (iiILIlLLiIL.iLLi1LIi() == 32) {
            new C0073o0000oo(this.iiI1L1iI.getChannel()).i1LIL11l(0, iiILIlLLiIL, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void iLLLILIiLi1Ii(long j) throws IOException {
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        iiILIlLLiIL.ILiLII1ILi(this.I11lLL1);
        new C0073o0000oo(this.iiI1L1iI.getChannel()).i1LIL11l(32 + j, iiILIlLLiIL, (long) this.I11lLL1.illiiliIILI());
    }

    public void iiI1L1iI(long j) throws IOException {
        iLLLILIiLi1Ii(j);
        this.iiI1L1iI.getChannel().force(false);
        I11lLL1(I1iIiIi, j, (long) this.I11lLL1.illiiliIILI());
        this.iiI1L1iI.getChannel().force(false);
        synchronized (this) {
            this.iilLil1i11I1 = true;
        }
        C0487o0OooooO.I11lLL1(this.illlI1lLIL);
        this.illlI1lLIL = null;
    }

    public C0370o0OOOooO iiIliillii() {
        synchronized (this) {
            try {
                if (this.iiI1L1iI == null) {
                    return null;
                }
                this.iilLiIIIi11i++;
                return new iiI1L1iI();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public ili11iILI1l il1LilLllii() {
        return this.I11lLL1;
    }

    public boolean illlI1lLIL() {
        if (this.iiI1L1iI == null) {
            return true;
        }
        return false;
    }
}
