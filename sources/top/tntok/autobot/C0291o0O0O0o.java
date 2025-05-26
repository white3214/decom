package top.tntok.autobot;

import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o0O0O0o  reason: case insensitive filesystem */
public final class C0291o0O0O0o {
    @Nullable
    public C0361o0OOOo0 I11lLL1;
    public final IiILIlLLiIL i1LIL11l = new IiILIlLLiIL();
    public final long iiI1L1iI;
    public final C0361o0OOOo0 iiIliillii = new iiI1L1iI();
    public final C0370o0OOOooO iilLil1i11I1 = new i1LIL11l();
    public boolean il1LilLllii;
    public boolean illlI1lLIL;

    /* renamed from: top.tntok.autobot.o0O0O0o$i1LIL11l */
    public final class i1LIL11l implements C0370o0OOOooO {
        public final C0446o0OoOOOo i1LIL11l = new C0446o0OoOOOo();

        public i1LIL11l() {
        }

        public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            synchronized (C0291o0O0O0o.this.i1LIL11l) {
                try {
                    if (!C0291o0O0O0o.this.il1LilLllii) {
                        while (C0291o0O0O0o.this.i1LIL11l.iLLi1LIi() == 0) {
                            C0291o0O0O0o o0o0o0o = C0291o0O0O0o.this;
                            if (o0o0o0o.illlI1lLIL) {
                                return -1;
                            }
                            this.i1LIL11l.IiiL1llIIi(o0o0o0o.i1LIL11l);
                        }
                        long IIlllIIi1ii = C0291o0O0O0o.this.i1LIL11l.IIlllIIi1ii(iiILIlLLiIL, j);
                        C0291o0O0O0o.this.i1LIL11l.notifyAll();
                        return IIlllIIi1ii;
                    }
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void close() throws IOException {
            synchronized (C0291o0O0O0o.this.i1LIL11l) {
                C0291o0O0O0o o0o0o0o = C0291o0O0O0o.this;
                o0o0o0o.il1LilLllii = true;
                o0o0o0o.i1LIL11l.notifyAll();
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    /* renamed from: top.tntok.autobot.o0O0O0o$iiI1L1iI */
    public final class iiI1L1iI implements C0361o0OOOo0 {
        public final o0O0o00O i1LIL11l = new o0O0o00O();

        public iiI1L1iI() {
        }

        public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
            C0361o0OOOo0 o0oooo0;
            synchronized (C0291o0O0O0o.this.i1LIL11l) {
                try {
                    if (!C0291o0O0O0o.this.illlI1lLIL) {
                        while (true) {
                            if (j <= 0) {
                                o0oooo0 = null;
                                break;
                            } else if (C0291o0O0O0o.this.I11lLL1 != null) {
                                o0oooo0 = C0291o0O0O0o.this.I11lLL1;
                                break;
                            } else {
                                C0291o0O0O0o o0o0o0o = C0291o0O0O0o.this;
                                if (!o0o0o0o.il1LilLllii) {
                                    long iLLi1LIi = o0o0o0o.iiI1L1iI - o0o0o0o.i1LIL11l.iLLi1LIi();
                                    if (iLLi1LIi == 0) {
                                        this.i1LIL11l.IiiL1llIIi(C0291o0O0O0o.this.i1LIL11l);
                                    } else {
                                        long min = Math.min(iLLi1LIi, j);
                                        C0291o0O0O0o.this.i1LIL11l.I1iIiIi(iiILIlLLiIL, min);
                                        j -= min;
                                        C0291o0O0O0o.this.i1LIL11l.notifyAll();
                                    }
                                } else {
                                    throw new IOException("source is closed");
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } finally {
                }
            }
            if (o0oooo0 != null) {
                this.i1LIL11l.I1iIiIi(o0oooo0.timeout());
                try {
                    o0oooo0.I1iIiIi(iiILIlLLiIL, j);
                } finally {
                    this.i1LIL11l.iILiI1lll();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
            r6.i1LIL11l.I1iIiIi(r1.timeout());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
            r6.i1LIL11l.iILiI1lll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r6 = this;
                top.tntok.autobot.o0O0O0o r0 = top.tntok.autobot.C0291o0O0O0o.this
                top.tntok.autobot.IiILIlLLiIL r0 = r0.i1LIL11l
                monitor-enter(r0)
                top.tntok.autobot.o0O0O0o r1 = top.tntok.autobot.C0291o0O0O0o.this     // Catch:{ all -> 0x000d }
                boolean r2 = r1.illlI1lLIL     // Catch:{ all -> 0x000d }
                if (r2 == 0) goto L_0x000f
                monitor-exit(r0)     // Catch:{ all -> 0x000d }
                return
            L_0x000d:
                r1 = move-exception
                goto L_0x005f
            L_0x000f:
                top.tntok.autobot.o0OOOo0 r1 = r1.I11lLL1     // Catch:{ all -> 0x000d }
                if (r1 == 0) goto L_0x001c
                top.tntok.autobot.o0O0O0o r1 = top.tntok.autobot.C0291o0O0O0o.this     // Catch:{ all -> 0x000d }
                top.tntok.autobot.o0OOOo0 r1 = r1.I11lLL1     // Catch:{ all -> 0x000d }
                goto L_0x0042
            L_0x001c:
                top.tntok.autobot.o0O0O0o r1 = top.tntok.autobot.C0291o0O0O0o.this     // Catch:{ all -> 0x000d }
                boolean r2 = r1.il1LilLllii     // Catch:{ all -> 0x000d }
                if (r2 == 0) goto L_0x0037
                top.tntok.autobot.IiILIlLLiIL r1 = r1.i1LIL11l     // Catch:{ all -> 0x000d }
                long r1 = r1.iLLi1LIi()     // Catch:{ all -> 0x000d }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x002f
                goto L_0x0037
            L_0x002f:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x000d }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x000d }
                throw r1     // Catch:{ all -> 0x000d }
            L_0x0037:
                top.tntok.autobot.o0O0O0o r1 = top.tntok.autobot.C0291o0O0O0o.this     // Catch:{ all -> 0x000d }
                r2 = 1
                r1.illlI1lLIL = r2     // Catch:{ all -> 0x000d }
                top.tntok.autobot.IiILIlLLiIL r1 = r1.i1LIL11l     // Catch:{ all -> 0x000d }
                r1.notifyAll()     // Catch:{ all -> 0x000d }
                r1 = 0
            L_0x0042:
                monitor-exit(r0)     // Catch:{ all -> 0x000d }
                if (r1 == 0) goto L_0x005e
                top.tntok.autobot.o0O0o00O r0 = r6.i1LIL11l
                top.tntok.autobot.o0OoOOOo r2 = r1.timeout()
                r0.I1iIiIi(r2)
                r1.close()     // Catch:{ all -> 0x0057 }
                top.tntok.autobot.o0O0o00O r0 = r6.i1LIL11l
                r0.iILiI1lll()
                goto L_0x005e
            L_0x0057:
                r0 = move-exception
                top.tntok.autobot.o0O0o00O r1 = r6.i1LIL11l
                r1.iILiI1lll()
                throw r0
            L_0x005e:
                return
            L_0x005f:
                monitor-exit(r0)     // Catch:{ all -> 0x000d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0291o0O0O0o.iiI1L1iI.close():void");
        }

        public void flush() throws IOException {
            C0361o0OOOo0 o0oooo0;
            synchronized (C0291o0O0O0o.this.i1LIL11l) {
                try {
                    C0291o0O0O0o o0o0o0o = C0291o0O0O0o.this;
                    if (o0o0o0o.illlI1lLIL) {
                        throw new IllegalStateException("closed");
                    } else if (o0o0o0o.I11lLL1 != null) {
                        o0oooo0 = C0291o0O0O0o.this.I11lLL1;
                    } else {
                        C0291o0O0O0o o0o0o0o2 = C0291o0O0O0o.this;
                        if (o0o0o0o2.il1LilLllii) {
                            if (o0o0o0o2.i1LIL11l.iLLi1LIi() > 0) {
                                throw new IOException("source is closed");
                            }
                        }
                        o0oooo0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (o0oooo0 != null) {
                this.i1LIL11l.I1iIiIi(o0oooo0.timeout());
                try {
                    o0oooo0.flush();
                } finally {
                    this.i1LIL11l.iILiI1lll();
                }
            }
        }

        public C0446o0OoOOOo timeout() {
            return this.i1LIL11l;
        }
    }

    public C0291o0O0O0o(long j) {
        if (j >= 1) {
            this.iiI1L1iI = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        monitor-enter(r6.i1LIL11l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.il1LilLllii = true;
        r6.i1LIL11l.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i1LIL11l(top.tntok.autobot.C0361o0OOOo0 r7) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            top.tntok.autobot.IiILIlLLiIL r0 = r6.i1LIL11l
            monitor-enter(r0)
            top.tntok.autobot.o0OOOo0 r1 = r6.I11lLL1     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0043
            top.tntok.autobot.IiILIlLLiIL r1 = r6.i1LIL11l     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.Il1llillili()     // Catch:{ all -> 0x0016 }
            r2 = 1
            if (r1 == 0) goto L_0x0018
            r6.il1LilLllii = r2     // Catch:{ all -> 0x0016 }
            r6.I11lLL1 = r7     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r7 = move-exception
            goto L_0x004b
        L_0x0018:
            top.tntok.autobot.IiILIlLLiIL r1 = new top.tntok.autobot.IiILIlLLiIL     // Catch:{ all -> 0x0016 }
            r1.<init>()     // Catch:{ all -> 0x0016 }
            top.tntok.autobot.IiILIlLLiIL r3 = r6.i1LIL11l     // Catch:{ all -> 0x0016 }
            long r4 = r3.illlI1lLIL     // Catch:{ all -> 0x0016 }
            r1.I1iIiIi(r3, r4)     // Catch:{ all -> 0x0016 }
            top.tntok.autobot.IiILIlLLiIL r3 = r6.i1LIL11l     // Catch:{ all -> 0x0016 }
            r3.notifyAll()     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            long r3 = r1.illlI1lLIL     // Catch:{ all -> 0x0033 }
            r7.I1iIiIi(r1, r3)     // Catch:{ all -> 0x0033 }
            r7.flush()     // Catch:{ all -> 0x0033 }
            goto L_0x0000
        L_0x0033:
            r7 = move-exception
            top.tntok.autobot.IiILIlLLiIL r1 = r6.i1LIL11l
            monitor-enter(r1)
            r6.il1LilLllii = r2     // Catch:{ all -> 0x0040 }
            top.tntok.autobot.IiILIlLLiIL r0 = r6.i1LIL11l     // Catch:{ all -> 0x0040 }
            r0.notifyAll()     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r7
        L_0x0040:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r7
        L_0x0043:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "sink already folded"
            r7.<init>(r1)     // Catch:{ all -> 0x0016 }
            throw r7     // Catch:{ all -> 0x0016 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0291o0O0O0o.i1LIL11l(top.tntok.autobot.o0OOOo0):void");
    }

    public final C0370o0OOOooO il1LilLllii() {
        return this.iilLil1i11I1;
    }

    public final C0361o0OOOo0 illlI1lLIL() {
        return this.iiIliillii;
    }
}
