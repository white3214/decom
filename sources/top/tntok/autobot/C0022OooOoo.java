package top.tntok.autobot;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.OooOoo  reason: case insensitive filesystem */
public final class C0022OooOoo implements Closeable, Flushable {
    public static final long I1I11Il1 = -1;
    public static final String I1IIIi1i1ILl = "READ";
    public static final String IIlL1llI1 = "CLEAN";
    public static final String IL111l1 = "DIRTY";
    public static final String ILl1iII11Ll1 = "journal";
    public static final /* synthetic */ boolean IilliIIIlI1ll = false;
    public static final String IliiLiLliIl = "1";
    public static final String i11liIIl11Ii1 = "journal.bkp";
    public static final Pattern i1iI1iiLL1 = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final String i1iiLIil1ILi = "journal.tmp";
    public static final String iiiiI1iILL11I = "libcore.io.DiskLruCache";
    public static final String il1l1IlL = "REMOVE";
    public final int I11lLL1;
    public int I1iIiIi;
    public final Executor I1l1iIll1lIi1;
    public boolean IL1lILLLL1L;
    public boolean Ii1liIIIiLi;
    public final int IiIIlIL;
    public Iiii1LiI11i IiiL1llIIi;
    public long IilL11ii1I1Il = 0;
    public boolean i111iLiiIIill;
    public boolean i1L1lLllLLlIi;
    public final o0000O0O i1LIL11l;
    public final LinkedHashMap<String, iiIliillii> iILiI1lll = new LinkedHashMap<>(0, 0.75f, true);
    public boolean iL1LIlIlI;
    public long iLLLILIiLi1Ii;
    public final File iiIliillii;
    public final Runnable iiLIIiIli = new iiI1L1iI();
    public long iilLiIIIi11i = 0;
    public final File iilLil1i11I1;
    public final File il1LilLllii;
    public final File illlI1lLIL;

    /* renamed from: top.tntok.autobot.OooOoo$i1LIL11l */
    public class i1LIL11l extends C0539o0ooOO0 {
        public static final /* synthetic */ boolean iiIliillii = false;

        public i1LIL11l(C0361o0OOOo0 o0oooo0) {
            super(o0oooo0);
        }

        public void i1LIL11l(IOException iOException) {
            C0022OooOoo.this.i1L1lLllLLlIi = true;
        }
    }

    /* renamed from: top.tntok.autobot.OooOoo$iiI1L1iI */
    public class iiI1L1iI implements Runnable {
        public iiI1L1iI() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r1 = r6.iiI1L1iI;
            r1.Ii1liIIIiLi = true;
            r1.IiiL1llIIi = top.tntok.autobot.C0249o00oo00O.illlI1lLIL(top.tntok.autobot.C0249o00oo00O.i1LIL11l());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                top.tntok.autobot.OooOoo r0 = top.tntok.autobot.C0022OooOoo.this
                monitor-enter(r0)
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ all -> 0x0011 }
                boolean r2 = r1.IL1lILLLL1L     // Catch:{ all -> 0x0011 }
                r3 = 0
                r4 = 1
                r2 = r2 ^ r4
                boolean r5 = r1.iL1LIlIlI     // Catch:{ all -> 0x0011 }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r1 = move-exception
                goto L_0x003d
            L_0x0013:
                r1.I11iLiiIi()     // Catch:{ IOException -> 0x0017 }
                goto L_0x001b
            L_0x0017:
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ all -> 0x0011 }
                r1.i111iLiiIIill = r4     // Catch:{ all -> 0x0011 }
            L_0x001b:
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ IOException -> 0x002d }
                boolean r1 = r1.iIiL11iL()     // Catch:{ IOException -> 0x002d }
                if (r1 == 0) goto L_0x003b
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ IOException -> 0x002d }
                r1.II1l1IliI1Li1()     // Catch:{ IOException -> 0x002d }
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ IOException -> 0x002d }
                r1.I1iIiIi = r3     // Catch:{ IOException -> 0x002d }
                goto L_0x003b
            L_0x002d:
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ all -> 0x0011 }
                r1.Ii1liIIIiLi = r4     // Catch:{ all -> 0x0011 }
                top.tntok.autobot.o0OOOo0 r2 = top.tntok.autobot.C0249o00oo00O.i1LIL11l()     // Catch:{ all -> 0x0011 }
                top.tntok.autobot.Iiii1LiI11i r2 = top.tntok.autobot.C0249o00oo00O.illlI1lLIL(r2)     // Catch:{ all -> 0x0011 }
                r1.IiiL1llIIi = r2     // Catch:{ all -> 0x0011 }
            L_0x003b:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x003d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.iiI1L1iI.run():void");
        }
    }

    /* renamed from: top.tntok.autobot.OooOoo$iiIliillii */
    public final class iiIliillii {
        public long I11lLL1;
        public final long[] i1LIL11l;
        public final String iiI1L1iI;
        public boolean iiIliillii;
        public il1LilLllii iilLil1i11I1;
        public final File[] il1LilLllii;
        public final File[] illlI1lLIL;

        public iiIliillii(String str) {
            this.iiI1L1iI = str;
            int i = C0022OooOoo.this.IiIIlIL;
            this.i1LIL11l = new long[i];
            this.illlI1lLIL = new File[i];
            this.il1LilLllii = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(C0089o000Ooo.il1LilLllii);
            int length = sb.length();
            for (int i2 = 0; i2 < C0022OooOoo.this.IiIIlIL; i2++) {
                sb.append(i2);
                this.illlI1lLIL[i2] = new File(C0022OooOoo.this.illlI1lLIL, sb.toString());
                sb.append(".tmp");
                this.il1LilLllii[i2] = new File(C0022OooOoo.this.illlI1lLIL, sb.toString());
                sb.setLength(length);
            }
        }

        public void i1LIL11l(String[] strArr) throws IOException {
            if (strArr.length == C0022OooOoo.this.IiIIlIL) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.i1LIL11l[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw iiI1L1iI(strArr);
                    }
                }
                return;
            }
            throw iiI1L1iI(strArr);
        }

        public final IOException iiI1L1iI(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public void il1LilLllii(Iiii1LiI11i iiii1LiI11i) throws IOException {
            for (long IIllllLiIlIl : this.i1LIL11l) {
                iiii1LiI11i.IillLillLLIii(32).IIllllLiIlIl(IIllllLiIlIl);
            }
        }

        public iilLil1i11I1 illlI1lLIL() {
            C0370o0OOOooO o0oooooo;
            if (Thread.holdsLock(C0022OooOoo.this)) {
                C0370o0OOOooO[] o0ooooooArr = new C0370o0OOOooO[C0022OooOoo.this.IiIIlIL];
                long[] jArr = (long[]) this.i1LIL11l.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        C0022OooOoo oooOoo = C0022OooOoo.this;
                        if (i2 >= oooOoo.IiIIlIL) {
                            return new iilLil1i11I1(this.iiI1L1iI, this.I11lLL1, o0ooooooArr, jArr);
                        }
                        o0ooooooArr[i2] = oooOoo.i1LIL11l.i1LIL11l(this.illlI1lLIL[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C0022OooOoo oooOoo2 = C0022OooOoo.this;
                            if (i >= oooOoo2.IiIIlIL || (o0oooooo = o0ooooooArr[i]) == null) {
                                try {
                                    oooOoo2.ilLilIL(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                C0487o0OooooO.I11lLL1(o0oooooo);
                                i++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: top.tntok.autobot.OooOoo$iilLil1i11I1 */
    public final class iilLil1i11I1 implements Closeable {
        public final String i1LIL11l;
        public final long[] iiIliillii;
        public final C0370o0OOOooO[] il1LilLllii;
        public final long illlI1lLIL;

        public iilLil1i11I1(String str, long j, C0370o0OOOooO[] o0ooooooArr, long[] jArr) {
            this.i1LIL11l = str;
            this.illlI1lLIL = j;
            this.il1LilLllii = o0ooooooArr;
            this.iiIliillii = jArr;
        }

        public String IiIl11II() {
            return this.i1LIL11l;
        }

        public void close() {
            for (C0370o0OOOooO I11lLL1 : this.il1LilLllii) {
                C0487o0OooooO.I11lLL1(I11lLL1);
            }
        }

        public C0370o0OOOooO i111iLiiIIill(int i) {
            return this.il1LilLllii[i];
        }

        @Nullable
        public il1LilLllii i1LIL11l() throws IOException {
            return C0022OooOoo.this.ilLIlL1ILi(this.i1LIL11l, this.illlI1lLIL);
        }

        public long il1LilLllii(int i) {
            return this.iiIliillii[i];
        }
    }

    /* renamed from: top.tntok.autobot.OooOoo$il1LilLllii */
    public final class il1LilLllii {
        public final boolean[] i1LIL11l;
        public final iiIliillii iiI1L1iI;
        public boolean illlI1lLIL;

        /* renamed from: top.tntok.autobot.OooOoo$il1LilLllii$iiI1L1iI */
        public class iiI1L1iI extends C0539o0ooOO0 {
            public iiI1L1iI(C0361o0OOOo0 o0oooo0) {
                super(o0oooo0);
            }

            public void i1LIL11l(IOException iOException) {
                synchronized (C0022OooOoo.this) {
                    il1LilLllii.this.il1LilLllii();
                }
            }
        }

        public il1LilLllii(iiIliillii iiiliillii) {
            boolean[] zArr;
            this.iiI1L1iI = iiiliillii;
            if (iiiliillii.iiIliillii) {
                zArr = null;
            } else {
                zArr = new boolean[C0022OooOoo.this.IiIIlIL];
            }
            this.i1LIL11l = zArr;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|10|11) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i1LIL11l() {
            /*
                r3 = this;
                top.tntok.autobot.OooOoo r0 = top.tntok.autobot.C0022OooOoo.this
                monitor-enter(r0)
                boolean r1 = r3.illlI1lLIL     // Catch:{ all -> 0x0014 }
                if (r1 != 0) goto L_0x0016
                top.tntok.autobot.OooOoo$iiIliillii r1 = r3.iiI1L1iI     // Catch:{ all -> 0x0014 }
                top.tntok.autobot.OooOoo$il1LilLllii r1 = r1.iilLil1i11I1     // Catch:{ all -> 0x0014 }
                if (r1 != r3) goto L_0x0016
                top.tntok.autobot.OooOoo r1 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ IOException -> 0x0016 }
                r2 = 0
                r1.il1LilLllii(r3, r2)     // Catch:{ IOException -> 0x0016 }
                goto L_0x0016
            L_0x0014:
                r1 = move-exception
                goto L_0x0018
            L_0x0016:
                monitor-exit(r0)     // Catch:{ all -> 0x0014 }
                return
            L_0x0018:
                monitor-exit(r0)     // Catch:{ all -> 0x0014 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.il1LilLllii.i1LIL11l():void");
        }

        public void iiI1L1iI() throws IOException {
            synchronized (C0022OooOoo.this) {
                try {
                    if (!this.illlI1lLIL) {
                        if (this.iiI1L1iI.iilLil1i11I1 == this) {
                            C0022OooOoo.this.il1LilLllii(this, false);
                        }
                        this.illlI1lLIL = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C0361o0OOOo0 iiIliillii(int i) {
            synchronized (C0022OooOoo.this) {
                try {
                    if (!this.illlI1lLIL) {
                        iiIliillii iiiliillii = this.iiI1L1iI;
                        if (iiiliillii.iilLil1i11I1 != this) {
                            C0361o0OOOo0 i1LIL11l2 = C0249o00oo00O.i1LIL11l();
                            return i1LIL11l2;
                        }
                        if (!iiiliillii.iiIliillii) {
                            this.i1LIL11l[i] = true;
                        }
                        iiI1L1iI iii1l1ii = new iiI1L1iI(C0022OooOoo.this.i1LIL11l.illlI1lLIL(iiiliillii.il1LilLllii[i]));
                        return iii1l1ii;
                    }
                    throw new IllegalStateException();
                } catch (FileNotFoundException unused) {
                    return C0249o00oo00O.i1LIL11l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public top.tntok.autobot.C0370o0OOOooO iilLil1i11I1(int r5) {
            /*
                r4 = this;
                top.tntok.autobot.OooOoo r0 = top.tntok.autobot.C0022OooOoo.this
                monitor-enter(r0)
                boolean r1 = r4.illlI1lLIL     // Catch:{ all -> 0x0021 }
                if (r1 != 0) goto L_0x0027
                top.tntok.autobot.OooOoo$iiIliillii r1 = r4.iiI1L1iI     // Catch:{ all -> 0x0021 }
                boolean r2 = r1.iiIliillii     // Catch:{ all -> 0x0021 }
                r3 = 0
                if (r2 == 0) goto L_0x0025
                top.tntok.autobot.OooOoo$il1LilLllii r2 = r1.iilLil1i11I1     // Catch:{ all -> 0x0021 }
                if (r2 == r4) goto L_0x0013
                goto L_0x0025
            L_0x0013:
                top.tntok.autobot.OooOoo r2 = top.tntok.autobot.C0022OooOoo.this     // Catch:{ FileNotFoundException -> 0x0023 }
                top.tntok.autobot.o0000O0O r2 = r2.i1LIL11l     // Catch:{ FileNotFoundException -> 0x0023 }
                java.io.File[] r1 = r1.illlI1lLIL     // Catch:{ FileNotFoundException -> 0x0023 }
                r5 = r1[r5]     // Catch:{ FileNotFoundException -> 0x0023 }
                top.tntok.autobot.o0OOOooO r5 = r2.i1LIL11l(r5)     // Catch:{ FileNotFoundException -> 0x0023 }
                monitor-exit(r0)     // Catch:{ all -> 0x0021 }
                return r5
            L_0x0021:
                r5 = move-exception
                goto L_0x002d
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0021 }
                return r3
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0021 }
                return r3
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
                r5.<init>()     // Catch:{ all -> 0x0021 }
                throw r5     // Catch:{ all -> 0x0021 }
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0021 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.il1LilLllii.iilLil1i11I1(int):top.tntok.autobot.o0OOOooO");
        }

        public void il1LilLllii() {
            if (this.iiI1L1iI.iilLil1i11I1 == this) {
                int i = 0;
                while (true) {
                    C0022OooOoo oooOoo = C0022OooOoo.this;
                    if (i < oooOoo.IiIIlIL) {
                        try {
                            oooOoo.i1LIL11l.iiI1L1iI(this.iiI1L1iI.il1LilLllii[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.iiI1L1iI.iilLil1i11I1 = null;
                        return;
                    }
                }
            }
        }

        public void illlI1lLIL() throws IOException {
            synchronized (C0022OooOoo.this) {
                try {
                    if (!this.illlI1lLIL) {
                        if (this.iiI1L1iI.iilLil1i11I1 == this) {
                            C0022OooOoo.this.il1LilLllii(this, true);
                        }
                        this.illlI1lLIL = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: top.tntok.autobot.OooOoo$illlI1lLIL */
    public class illlI1lLIL implements Iterator<iilLil1i11I1> {
        public final Iterator<iiIliillii> i1LIL11l;
        public iilLil1i11I1 il1LilLllii;
        public iilLil1i11I1 illlI1lLIL;

        public illlI1lLIL() {
            this.i1LIL11l = new ArrayList(C0022OooOoo.this.iILiI1lll.values()).iterator();
        }

        public boolean hasNext() {
            if (this.illlI1lLIL != null) {
                return true;
            }
            synchronized (C0022OooOoo.this) {
                try {
                    if (C0022OooOoo.this.iL1LIlIlI) {
                        return false;
                    }
                    while (this.i1LIL11l.hasNext()) {
                        iiIliillii next = this.i1LIL11l.next();
                        if (next.iiIliillii) {
                            iilLil1i11I1 illlI1lLIL2 = next.illlI1lLIL();
                            if (illlI1lLIL2 != null) {
                                this.illlI1lLIL = illlI1lLIL2;
                                return true;
                            }
                        }
                    }
                    return false;
                } finally {
                }
            }
        }

        /* renamed from: iiI1L1iI */
        public iilLil1i11I1 next() {
            if (hasNext()) {
                iilLil1i11I1 iillil1i11i1 = this.illlI1lLIL;
                this.il1LilLllii = iillil1i11i1;
                this.illlI1lLIL = null;
                return iillil1i11i1;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            iilLil1i11I1 iillil1i11i1 = this.il1LilLllii;
            if (iillil1i11i1 != null) {
                try {
                    C0022OooOoo.this.i11iLLllliI(iillil1i11i1.i1LIL11l);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.il1LilLllii = null;
                    throw th;
                }
                this.il1LilLllii = null;
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }
    }

    public C0022OooOoo(o0000O0O o0000o0o, File file, int i, int i2, long j, Executor executor) {
        this.i1LIL11l = o0000o0o;
        this.illlI1lLIL = file;
        this.I11lLL1 = i;
        this.il1LilLllii = new File(file, ILl1iII11Ll1);
        this.iiIliillii = new File(file, i1iiLIil1ILi);
        this.iilLil1i11I1 = new File(file, i11liIIl11Ii1);
        this.IiIIlIL = i2;
        this.iLLLILIiLi1Ii = j;
        this.I1l1iIll1lIi1 = executor;
    }

    public static C0022OooOoo i111iLiiIIill(o0000O0O o0000o0o, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C0022OooOoo(o0000o0o, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0487o0OooooO.IILiIL1i11Li("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static /* synthetic */ void iiI1L1iI(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public void I11iLiiIi() throws IOException {
        while (this.iilLiIIIi11i > this.iLLLILIiLi1Ii) {
            ilLilIL(this.iILiI1lll.values().iterator().next());
        }
        this.i111iLiiIIill = false;
    }

    public final Iiii1LiI11i I1IILIil1lLlL() throws FileNotFoundException {
        return C0249o00oo00O.illlI1lLIL(new i1LIL11l(this.i1LIL11l.il1LilLllii(this.il1LilLllii)));
    }

    @Nullable
    public il1LilLllii I1LiILiLLIl1l(String str) throws IOException {
        return ilLIlL1ILi(str, -1);
    }

    public File I1lLLLlliILlI() {
        return this.illlI1lLIL;
    }

    public synchronized long I1llIillii1() throws IOException {
        IL11lll11();
        return this.iilLiIIIi11i;
    }

    public synchronized void II1l1IliI1Li1() throws IOException {
        try {
            Iiii1LiI11i iiii1LiI11i = this.IiiL1llIIi;
            if (iiii1LiI11i != null) {
                iiii1LiI11i.close();
            }
            Iiii1LiI11i illlI1lLIL2 = C0249o00oo00O.illlI1lLIL(this.i1LIL11l.illlI1lLIL(this.iiIliillii));
            try {
                illlI1lLIL2.illiiliIILI(iiiiI1iILL11I).IillLillLLIii(10);
                illlI1lLIL2.illiiliIILI(IliiLiLliIl).IillLillLLIii(10);
                illlI1lLIL2.IIllllLiIlIl((long) this.I11lLL1).IillLillLLIii(10);
                illlI1lLIL2.IIllllLiIlIl((long) this.IiIIlIL).IillLillLLIii(10);
                illlI1lLIL2.IillLillLLIii(10);
                for (iiIliillii next : this.iILiI1lll.values()) {
                    if (next.iilLil1i11I1 != null) {
                        illlI1lLIL2.illiiliIILI(IL111l1).IillLillLLIii(32);
                        illlI1lLIL2.illiiliIILI(next.iiI1L1iI);
                        illlI1lLIL2.IillLillLLIii(10);
                    } else {
                        illlI1lLIL2.illiiliIILI(IIlL1llI1).IillLillLLIii(32);
                        illlI1lLIL2.illiiliIILI(next.iiI1L1iI);
                        next.il1LilLllii(illlI1lLIL2);
                        illlI1lLIL2.IillLillLLIii(10);
                    }
                }
                iiI1L1iI((Throwable) null, illlI1lLIL2);
                if (this.i1LIL11l.iiIliillii(this.il1LilLllii)) {
                    this.i1LIL11l.I11lLL1(this.il1LilLllii, this.iilLil1i11I1);
                }
                this.i1LIL11l.I11lLL1(this.iiIliillii, this.il1LilLllii);
                this.i1LIL11l.iiI1L1iI(this.iilLil1i11I1);
                this.IiiL1llIIi = I1IILIil1lLlL();
                this.i1L1lLllLLlIi = false;
                this.Ii1liIIIiLi = false;
            } catch (Throwable th) {
                if (illlI1lLIL2 != null) {
                    iiI1L1iI(th, illlI1lLIL2);
                }
                throw th;
            }
        } finally {
        }
    }

    public synchronized void IIL1Ll1I111() throws IOException {
        try {
            IL11lll11();
            for (iiIliillii ilLilIL : (iiIliillii[]) this.iILiI1lll.values().toArray(new iiIliillii[this.iILiI1lll.size()])) {
                ilLilIL(ilLilIL);
            }
            this.i111iLiiIIill = false;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void IIlLLll1ll1(long j) {
        this.iLLLILIiLi1Ii = j;
        if (this.IL1lILLLL1L) {
            this.I1l1iIll1lIi1.execute(this.iiLIIiIli);
        }
    }

    public synchronized void IL11lll11() throws IOException {
        try {
            if (!this.IL1lILLLL1L) {
                if (this.i1LIL11l.iiIliillii(this.iilLil1i11I1)) {
                    if (this.i1LIL11l.iiIliillii(this.il1LilLllii)) {
                        this.i1LIL11l.iiI1L1iI(this.iilLil1i11I1);
                    } else {
                        this.i1LIL11l.I11lLL1(this.iilLil1i11I1, this.il1LilLllii);
                    }
                }
                if (this.i1LIL11l.iiIliillii(this.il1LilLllii)) {
                    ILIiLLLL1iiii();
                    ilLIlLiIILl1();
                    this.IL1lILLLL1L = true;
                    return;
                }
                II1l1IliI1Li1();
                this.IL1lILLLL1L = true;
            }
        } catch (IOException e) {
            C0292o0O0O0oO I1iIiIi2 = C0292o0O0O0oO.I1iIiIi();
            I1iIiIi2.iiLIIiIli(5, "DiskLruCache " + this.illlI1lLIL + " is corrupt: " + e.getMessage() + ", removing", e);
            IiIl11II();
            this.iL1LIlIlI = false;
        } catch (Throwable th) {
            this.iL1LIlIlI = false;
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.I1iIiIi = r0 - r9.iILiI1lll.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r1.Il1llillili() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        II1l1IliI1Li1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r9.IiiL1llIIi = I1IILIil1lLlL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        iiI1L1iI((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r1 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        iiI1L1iI(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x007d=Splitter:B:24:0x007d, B:17:0x005f=Splitter:B:17:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ILIiLLLL1iiii() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            top.tntok.autobot.o0000O0O r1 = r9.i1LIL11l
            java.io.File r2 = r9.il1LilLllii
            top.tntok.autobot.o0OOOooO r1 = r1.i1LIL11l(r2)
            top.tntok.autobot.ILL1iL1LiiI r1 = top.tntok.autobot.C0249o00oo00O.il1LilLllii(r1)
            java.lang.String r2 = r1.i1iI1iiLL1()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = r1.i1iI1iiLL1()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r1.i1iI1iiLL1()     // Catch:{ all -> 0x005d }
            java.lang.String r5 = r1.i1iI1iiLL1()     // Catch:{ all -> 0x005d }
            java.lang.String r6 = r1.i1iI1iiLL1()     // Catch:{ all -> 0x005d }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.I11lLL1     // Catch:{ all -> 0x005d }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x005d }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.IiIIlIL     // Catch:{ all -> 0x005d }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x005d }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x007d
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.i1iI1iiLL1()     // Catch:{ EOFException -> 0x005f }
            r9.i1L1llI1LlL1l(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            r0 = move-exception
            goto L_0x00ab
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r2 = r9.iILiI1lll     // Catch:{ all -> 0x005d }
            int r2 = r2.size()     // Catch:{ all -> 0x005d }
            int r0 = r0 - r2
            r9.I1iIiIi = r0     // Catch:{ all -> 0x005d }
            boolean r0 = r1.Il1llillili()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0072
            r9.II1l1IliI1Li1()     // Catch:{ all -> 0x005d }
            goto L_0x0078
        L_0x0072:
            top.tntok.autobot.Iiii1LiI11i r0 = r9.I1IILIil1lLlL()     // Catch:{ all -> 0x005d }
            r9.IiiL1llIIi = r0     // Catch:{ all -> 0x005d }
        L_0x0078:
            r0 = 0
            iiI1L1iI(r0, r1)
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r7.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005d }
            r7.append(r2)     // Catch:{ all -> 0x005d }
            r7.append(r0)     // Catch:{ all -> 0x005d }
            r7.append(r3)     // Catch:{ all -> 0x005d }
            r7.append(r0)     // Catch:{ all -> 0x005d }
            r7.append(r5)     // Catch:{ all -> 0x005d }
            r7.append(r0)     // Catch:{ all -> 0x005d }
            r7.append(r6)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005d }
            r4.<init>(r0)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b2
            iiI1L1iI(r0, r1)
        L_0x00b2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.ILIiLLLL1iiii():void");
    }

    public void IiIl11II() throws IOException {
        close();
        this.i1LIL11l.iLLLILIiLi1Ii(this.illlI1lLIL);
    }

    public synchronized void close() throws IOException {
        try {
            if (this.IL1lILLLL1L) {
                if (!this.iL1LIlIlI) {
                    for (iiIliillii iiiliillii : (iiIliillii[]) this.iILiI1lll.values().toArray(new iiIliillii[this.iILiI1lll.size()])) {
                        il1LilLllii il1lillllii = iiiliillii.iilLil1i11I1;
                        if (il1lillllii != null) {
                            il1lillllii.iiI1L1iI();
                        }
                    }
                    I11iLiiIi();
                    this.IiiL1llIIi.close();
                    this.IiiL1llIIi = null;
                    this.iL1LIlIlI = true;
                    return;
                }
            }
            this.iL1LIlIlI = true;
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void flush() throws IOException {
        if (this.IL1lILLLL1L) {
            i1LIL11l();
            I11iLiiIi();
            this.IiiL1llIIi.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean i11iLLllliI(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.IL11lll11()     // Catch:{ all -> 0x0028 }
            r6.i1LIL11l()     // Catch:{ all -> 0x0028 }
            r6.i1LlL1iILLLil(r7)     // Catch:{ all -> 0x0028 }
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r0 = r6.iILiI1lll     // Catch:{ all -> 0x0028 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0028 }
            top.tntok.autobot.OooOoo$iiIliillii r7 = (top.tntok.autobot.C0022OooOoo.iiIliillii) r7     // Catch:{ all -> 0x0028 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.ilLilIL(r7)     // Catch:{ all -> 0x0028 }
            if (r7 == 0) goto L_0x002a
            long r1 = r6.iilLiIIIi11i     // Catch:{ all -> 0x0028 }
            long r3 = r6.iLLLILIiLi1Ii     // Catch:{ all -> 0x0028 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            r6.i111iLiiIIill = r0     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r7 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r6)
            return r7
        L_0x002c:
            monitor-exit(r6)     // Catch:{ all -> 0x0028 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.i11iLLllliI(java.lang.String):boolean");
    }

    public final void i1L1llI1LlL1l(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(il1l1IlL)) {
                    this.iILiI1lll.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            iiIliillii iiiliillii = this.iILiI1lll.get(str2);
            if (iiiliillii == null) {
                iiiliillii = new iiIliillii(str2);
                this.iILiI1lll.put(str2, iiiliillii);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(IIlL1llI1)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                iiiliillii.iiIliillii = true;
                iiiliillii.iilLil1i11I1 = null;
                iiiliillii.i1LIL11l(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(IL111l1)) {
                iiiliillii.iilLil1i11I1 = new il1LilLllii(iiiliillii);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(I1IIIi1i1ILl)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    public final synchronized void i1LIL11l() {
        if (iILlLIlli()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void i1LlL1iILLLil(String str) {
        if (!i1iI1iiLL1.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public synchronized boolean iILlLIlli() {
        return this.iL1LIlIlI;
    }

    public boolean iIiL11iL() {
        int i = this.I1iIiIi;
        if (i < 2000 || i < this.iILiI1lll.size()) {
            return false;
        }
        return true;
    }

    public synchronized Iterator<iilLil1i11I1> iLlI1iL1lIIL() throws IOException {
        IL11lll11();
        return new illlI1lLIL();
    }

    public synchronized long iiLl11ILL() {
        return this.iLLLILIiLi1Ii;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void il1LilLllii(top.tntok.autobot.C0022OooOoo.il1LilLllii r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            top.tntok.autobot.OooOoo$iiIliillii r0 = r10.iiI1L1iI     // Catch:{ all -> 0x002a }
            top.tntok.autobot.OooOoo$il1LilLllii r1 = r0.iilLil1i11I1     // Catch:{ all -> 0x002a }
            if (r1 != r10) goto L_0x00f8
            r1 = 0
            if (r11 == 0) goto L_0x004a
            boolean r2 = r0.iiIliillii     // Catch:{ all -> 0x002a }
            if (r2 != 0) goto L_0x004a
            r2 = 0
        L_0x000f:
            int r3 = r9.IiIIlIL     // Catch:{ all -> 0x002a }
            if (r2 >= r3) goto L_0x004a
            boolean[] r3 = r10.i1LIL11l     // Catch:{ all -> 0x002a }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0030
            top.tntok.autobot.o0000O0O r3 = r9.i1LIL11l     // Catch:{ all -> 0x002a }
            java.io.File[] r4 = r0.il1LilLllii     // Catch:{ all -> 0x002a }
            r4 = r4[r2]     // Catch:{ all -> 0x002a }
            boolean r3 = r3.iiIliillii(r4)     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x002d
            r10.iiI1L1iI()     // Catch:{ all -> 0x002a }
            monitor-exit(r9)
            return
        L_0x002a:
            r10 = move-exception
            goto L_0x00fe
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0030:
            r10.iiI1L1iI()     // Catch:{ all -> 0x002a }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
            r11.<init>()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x002a }
            r11.append(r2)     // Catch:{ all -> 0x002a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x002a }
            r10.<init>(r11)     // Catch:{ all -> 0x002a }
            throw r10     // Catch:{ all -> 0x002a }
        L_0x004a:
            int r10 = r9.IiIIlIL     // Catch:{ all -> 0x002a }
            if (r1 >= r10) goto L_0x0082
            java.io.File[] r10 = r0.il1LilLllii     // Catch:{ all -> 0x002a }
            r10 = r10[r1]     // Catch:{ all -> 0x002a }
            if (r11 == 0) goto L_0x007a
            top.tntok.autobot.o0000O0O r2 = r9.i1LIL11l     // Catch:{ all -> 0x002a }
            boolean r2 = r2.iiIliillii(r10)     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x007f
            java.io.File[] r2 = r0.illlI1lLIL     // Catch:{ all -> 0x002a }
            r2 = r2[r1]     // Catch:{ all -> 0x002a }
            top.tntok.autobot.o0000O0O r3 = r9.i1LIL11l     // Catch:{ all -> 0x002a }
            r3.I11lLL1(r10, r2)     // Catch:{ all -> 0x002a }
            long[] r10 = r0.i1LIL11l     // Catch:{ all -> 0x002a }
            r3 = r10[r1]     // Catch:{ all -> 0x002a }
            top.tntok.autobot.o0000O0O r10 = r9.i1LIL11l     // Catch:{ all -> 0x002a }
            long r5 = r10.iilLil1i11I1(r2)     // Catch:{ all -> 0x002a }
            long[] r10 = r0.i1LIL11l     // Catch:{ all -> 0x002a }
            r10[r1] = r5     // Catch:{ all -> 0x002a }
            long r7 = r9.iilLiIIIi11i     // Catch:{ all -> 0x002a }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.iilLiIIIi11i = r7     // Catch:{ all -> 0x002a }
            goto L_0x007f
        L_0x007a:
            top.tntok.autobot.o0000O0O r2 = r9.i1LIL11l     // Catch:{ all -> 0x002a }
            r2.iiI1L1iI(r10)     // Catch:{ all -> 0x002a }
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0082:
            int r10 = r9.I1iIiIi     // Catch:{ all -> 0x002a }
            r1 = 1
            int r10 = r10 + r1
            r9.I1iIiIi = r10     // Catch:{ all -> 0x002a }
            r10 = 0
            r0.iilLil1i11I1 = r10     // Catch:{ all -> 0x002a }
            boolean r10 = r0.iiIliillii     // Catch:{ all -> 0x002a }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00be
            r0.iiIliillii = r1     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "CLEAN"
            top.tntok.autobot.Iiii1LiI11i r10 = r10.illiiliIILI(r1)     // Catch:{ all -> 0x002a }
            r10.IillLillLLIii(r3)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            java.lang.String r1 = r0.iiI1L1iI     // Catch:{ all -> 0x002a }
            r10.illiiliIILI(r1)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            r0.il1LilLllii(r10)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            r10.IillLillLLIii(r2)     // Catch:{ all -> 0x002a }
            if (r11 == 0) goto L_0x00dc
            long r10 = r9.IilL11ii1I1Il     // Catch:{ all -> 0x002a }
            r1 = 1
            long r1 = r1 + r10
            r9.IilL11ii1I1Il = r1     // Catch:{ all -> 0x002a }
            r0.I11lLL1 = r10     // Catch:{ all -> 0x002a }
            goto L_0x00dc
        L_0x00be:
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r10 = r9.iILiI1lll     // Catch:{ all -> 0x002a }
            java.lang.String r11 = r0.iiI1L1iI     // Catch:{ all -> 0x002a }
            r10.remove(r11)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            java.lang.String r11 = "REMOVE"
            top.tntok.autobot.Iiii1LiI11i r10 = r10.illiiliIILI(r11)     // Catch:{ all -> 0x002a }
            r10.IillLillLLIii(r3)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            java.lang.String r11 = r0.iiI1L1iI     // Catch:{ all -> 0x002a }
            r10.illiiliIILI(r11)     // Catch:{ all -> 0x002a }
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            r10.IillLillLLIii(r2)     // Catch:{ all -> 0x002a }
        L_0x00dc:
            top.tntok.autobot.Iiii1LiI11i r10 = r9.IiiL1llIIi     // Catch:{ all -> 0x002a }
            r10.flush()     // Catch:{ all -> 0x002a }
            long r10 = r9.iilLiIIIi11i     // Catch:{ all -> 0x002a }
            long r0 = r9.iLLLILIiLi1Ii     // Catch:{ all -> 0x002a }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ef
            boolean r10 = r9.iIiL11iL()     // Catch:{ all -> 0x002a }
            if (r10 == 0) goto L_0x00f6
        L_0x00ef:
            java.util.concurrent.Executor r10 = r9.I1l1iIll1lIi1     // Catch:{ all -> 0x002a }
            java.lang.Runnable r11 = r9.iiLIIiIli     // Catch:{ all -> 0x002a }
            r10.execute(r11)     // Catch:{ all -> 0x002a }
        L_0x00f6:
            monitor-exit(r9)
            return
        L_0x00f8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002a }
            r10.<init>()     // Catch:{ all -> 0x002a }
            throw r10     // Catch:{ all -> 0x002a }
        L_0x00fe:
            monitor-exit(r9)     // Catch:{ all -> 0x002a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.il1LilLllii(top.tntok.autobot.OooOoo$il1LilLllii, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized top.tntok.autobot.C0022OooOoo.iilLil1i11I1 ilIILlI1l11i(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.IL11lll11()     // Catch:{ all -> 0x004d }
            r3.i1LIL11l()     // Catch:{ all -> 0x004d }
            r3.i1LlL1iILLLil(r4)     // Catch:{ all -> 0x004d }
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r0 = r3.iILiI1lll     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            top.tntok.autobot.OooOoo$iiIliillii r0 = (top.tntok.autobot.C0022OooOoo.iiIliillii) r0     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x0051
            boolean r2 = r0.iiIliillii     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x001a
            goto L_0x0051
        L_0x001a:
            top.tntok.autobot.OooOoo$iilLil1i11I1 r0 = r0.illlI1lLIL()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.I1iIiIi     // Catch:{ all -> 0x004d }
            int r1 = r1 + 1
            r3.I1iIiIi = r1     // Catch:{ all -> 0x004d }
            top.tntok.autobot.Iiii1LiI11i r1 = r3.IiiL1llIIi     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "READ"
            top.tntok.autobot.Iiii1LiI11i r1 = r1.illiiliIILI(r2)     // Catch:{ all -> 0x004d }
            r2 = 32
            top.tntok.autobot.Iiii1LiI11i r1 = r1.IillLillLLIii(r2)     // Catch:{ all -> 0x004d }
            top.tntok.autobot.Iiii1LiI11i r4 = r1.illiiliIILI(r4)     // Catch:{ all -> 0x004d }
            r1 = 10
            r4.IillLillLLIii(r1)     // Catch:{ all -> 0x004d }
            boolean r4 = r3.iIiL11iL()     // Catch:{ all -> 0x004d }
            if (r4 == 0) goto L_0x004f
            java.util.concurrent.Executor r4 = r3.I1l1iIll1lIi1     // Catch:{ all -> 0x004d }
            java.lang.Runnable r1 = r3.iiLIIiIli     // Catch:{ all -> 0x004d }
            r4.execute(r1)     // Catch:{ all -> 0x004d }
            goto L_0x004f
        L_0x004d:
            r4 = move-exception
            goto L_0x0053
        L_0x004f:
            monitor-exit(r3)
            return r0
        L_0x0051:
            monitor-exit(r3)
            return r1
        L_0x0053:
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.ilIILlI1l11i(java.lang.String):top.tntok.autobot.OooOoo$iilLil1i11I1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized top.tntok.autobot.C0022OooOoo.il1LilLllii ilLIlL1ILi(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.IL11lll11()     // Catch:{ all -> 0x0022 }
            r5.i1LIL11l()     // Catch:{ all -> 0x0022 }
            r5.i1LlL1iILLLil(r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r0 = r5.iILiI1lll     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0022 }
            top.tntok.autobot.OooOoo$iiIliillii r0 = (top.tntok.autobot.C0022OooOoo.iiIliillii) r0     // Catch:{ all -> 0x0022 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0024
            long r1 = r0.I11lLL1     // Catch:{ all -> 0x0022 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            goto L_0x0077
        L_0x0024:
            monitor-exit(r5)
            return r3
        L_0x0026:
            if (r0 == 0) goto L_0x002e
            top.tntok.autobot.OooOoo$il1LilLllii r7 = r0.iilLil1i11I1     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x002e
            monitor-exit(r5)
            return r3
        L_0x002e:
            boolean r7 = r5.i111iLiiIIill     // Catch:{ all -> 0x0022 }
            if (r7 != 0) goto L_0x006e
            boolean r7 = r5.Ii1liIIIiLi     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0037
            goto L_0x006e
        L_0x0037:
            top.tntok.autobot.Iiii1LiI11i r7 = r5.IiiL1llIIi     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "DIRTY"
            top.tntok.autobot.Iiii1LiI11i r7 = r7.illiiliIILI(r8)     // Catch:{ all -> 0x0022 }
            r8 = 32
            top.tntok.autobot.Iiii1LiI11i r7 = r7.IillLillLLIii(r8)     // Catch:{ all -> 0x0022 }
            top.tntok.autobot.Iiii1LiI11i r7 = r7.illiiliIILI(r6)     // Catch:{ all -> 0x0022 }
            r8 = 10
            r7.IillLillLLIii(r8)     // Catch:{ all -> 0x0022 }
            top.tntok.autobot.Iiii1LiI11i r7 = r5.IiiL1llIIi     // Catch:{ all -> 0x0022 }
            r7.flush()     // Catch:{ all -> 0x0022 }
            boolean r7 = r5.i1L1lLllLLlIi     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0059
            monitor-exit(r5)
            return r3
        L_0x0059:
            if (r0 != 0) goto L_0x0065
            top.tntok.autobot.OooOoo$iiIliillii r0 = new top.tntok.autobot.OooOoo$iiIliillii     // Catch:{ all -> 0x0022 }
            r0.<init>(r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap<java.lang.String, top.tntok.autobot.OooOoo$iiIliillii> r7 = r5.iILiI1lll     // Catch:{ all -> 0x0022 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0022 }
        L_0x0065:
            top.tntok.autobot.OooOoo$il1LilLllii r6 = new top.tntok.autobot.OooOoo$il1LilLllii     // Catch:{ all -> 0x0022 }
            r6.<init>(r0)     // Catch:{ all -> 0x0022 }
            r0.iilLil1i11I1 = r6     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r6
        L_0x006e:
            java.util.concurrent.Executor r6 = r5.I1l1iIll1lIi1     // Catch:{ all -> 0x0022 }
            java.lang.Runnable r7 = r5.iiLIIiIli     // Catch:{ all -> 0x0022 }
            r6.execute(r7)     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r3
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0022 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0022OooOoo.ilLIlL1ILi(java.lang.String, long):top.tntok.autobot.OooOoo$il1LilLllii");
    }

    public final void ilLIlLiIILl1() throws IOException {
        this.i1LIL11l.iiI1L1iI(this.iiIliillii);
        Iterator<iiIliillii> it = this.iILiI1lll.values().iterator();
        while (it.hasNext()) {
            iiIliillii next = it.next();
            int i = 0;
            if (next.iilLil1i11I1 == null) {
                while (i < this.IiIIlIL) {
                    this.iilLiIIIi11i += next.i1LIL11l[i];
                    i++;
                }
            } else {
                next.iilLil1i11I1 = null;
                while (i < this.IiIIlIL) {
                    this.i1LIL11l.iiI1L1iI(next.illlI1lLIL[i]);
                    this.i1LIL11l.iiI1L1iI(next.il1LilLllii[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public boolean ilLilIL(iiIliillii iiiliillii) throws IOException {
        il1LilLllii il1lillllii = iiiliillii.iilLil1i11I1;
        if (il1lillllii != null) {
            il1lillllii.il1LilLllii();
        }
        for (int i = 0; i < this.IiIIlIL; i++) {
            this.i1LIL11l.iiI1L1iI(iiiliillii.illlI1lLIL[i]);
            long j = this.iilLiIIIi11i;
            long[] jArr = iiiliillii.i1LIL11l;
            this.iilLiIIIi11i = j - jArr[i];
            jArr[i] = 0;
        }
        this.I1iIiIi++;
        this.IiiL1llIIi.illiiliIILI(il1l1IlL).IillLillLLIii(32).illiiliIILI(iiiliillii.iiI1L1iI).IillLillLLIii(10);
        this.iILiI1lll.remove(iiiliillii.iiI1L1iI);
        if (iIiL11iL()) {
            this.I1l1iIll1lIi1.execute(this.iiLIIiIli);
        }
        return true;
    }
}
