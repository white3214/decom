package top.tntok.autobot;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import top.tntok.autobot.C0022OooOoo;
import top.tntok.autobot.C0094o000o000;
import top.tntok.autobot.C0333o0O0ooO0;
import top.tntok.autobot.C0337o0O0oooO;

public final class iL1ilIi1l11L1 implements Closeable, Flushable {
    public static final int IiIIlIL = 201105;
    public static final int IiiL1llIIi = 1;
    public static final int iILiI1lll = 2;
    public static final int iilLiIIIi11i = 0;
    public int I11lLL1;
    public final o00OO0 i1LIL11l;
    public int iLLLILIiLi1Ii;
    public int iiIliillii;
    public int iilLil1i11I1;
    public int il1LilLllii;
    public final C0022OooOoo illlI1lLIL;

    public class i1LIL11l implements Iterator<String> {
        public final Iterator<C0022OooOoo.iilLil1i11I1> i1LIL11l;
        public boolean il1LilLllii;
        @Nullable
        public String illlI1lLIL;

        public i1LIL11l() throws IOException {
            this.i1LIL11l = iL1ilIi1l11L1.this.illlI1lLIL.iLlI1iL1lIIL();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
            if (r2 != null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            continue;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasNext() {
            /*
                r5 = this;
                java.lang.String r0 = r5.illlI1lLIL
                r1 = 1
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                r5.il1LilLllii = r0
            L_0x0009:
                java.util.Iterator<top.tntok.autobot.OooOoo$iilLil1i11I1> r2 = r5.i1LIL11l
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L_0x003b
                java.util.Iterator<top.tntok.autobot.OooOoo$iilLil1i11I1> r2 = r5.i1LIL11l     // Catch:{ IOException -> 0x002b }
                java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x002b }
                top.tntok.autobot.OooOoo$iilLil1i11I1 r2 = (top.tntok.autobot.C0022OooOoo.iilLil1i11I1) r2     // Catch:{ IOException -> 0x002b }
                top.tntok.autobot.o0OOOooO r3 = r2.i111iLiiIIill(r0)     // Catch:{ all -> 0x002d }
                top.tntok.autobot.ILL1iL1LiiI r3 = top.tntok.autobot.C0249o00oo00O.il1LilLllii(r3)     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r3.i1iI1iiLL1()     // Catch:{ all -> 0x002d }
                r5.illlI1lLIL = r3     // Catch:{ all -> 0x002d }
                r2.close()     // Catch:{ IOException -> 0x002b }
                return r1
            L_0x002b:
                goto L_0x0009
            L_0x002d:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x002f }
            L_0x002f:
                r4 = move-exception
                if (r2 == 0) goto L_0x003a
                r2.close()     // Catch:{ all -> 0x0036 }
                goto L_0x003a
            L_0x0036:
                r2 = move-exception
                r3.addSuppressed(r2)     // Catch:{ IOException -> 0x002b }
            L_0x003a:
                throw r4     // Catch:{ IOException -> 0x002b }
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iL1ilIi1l11L1.i1LIL11l.hasNext():boolean");
        }

        /* renamed from: iiI1L1iI */
        public String next() {
            if (hasNext()) {
                String str = this.illlI1lLIL;
                this.illlI1lLIL = null;
                this.il1LilLllii = true;
                return str;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.il1LilLllii) {
                this.i1LIL11l.remove();
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }
    }

    public class iiI1L1iI implements o00OO0 {
        public iiI1L1iI() {
        }

        @Nullable
        public C0337o0O0oooO i1LIL11l(C0333o0O0ooO0 o0o0ooo0) throws IOException {
            return iL1ilIi1l11L1.this.IiIl11II(o0o0ooo0);
        }

        public void iiI1L1iI() {
            iL1ilIi1l11L1.this.ILIiLLLL1iiii();
        }

        public void iiIliillii(C0333o0O0ooO0 o0o0ooo0) throws IOException {
            iL1ilIi1l11L1.this.iIiL11iL(o0o0ooo0);
        }

        public void iilLil1i11I1(ILLL1LlLLilL iLLL1LlLLilL) {
            iL1ilIi1l11L1.this.i1L1llI1LlL1l(iLLL1LlLLilL);
        }

        @Nullable
        public I1lilLill1I il1LilLllii(C0337o0O0oooO o0o0oooo) throws IOException {
            return iL1ilIi1l11L1.this.IL11lll11(o0o0oooo);
        }

        public void illlI1lLIL(C0337o0O0oooO o0o0oooo, C0337o0O0oooO o0o0oooo2) {
            iL1ilIi1l11L1.this.II1l1IliI1Li1(o0o0oooo, o0o0oooo2);
        }
    }

    public static class il1LilLllii extends o0O {
        @Nullable
        public final String iiIliillii;
        @Nullable
        public final String iilLil1i11I1;
        public final ILL1iL1LiiI il1LilLllii;
        public final C0022OooOoo.iilLil1i11I1 illlI1lLIL;

        public class iiI1L1iI extends C0078o000O0oO {
            public final /* synthetic */ C0022OooOoo.iilLil1i11I1 illlI1lLIL;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public iiI1L1iI(C0370o0OOOooO o0oooooo, C0022OooOoo.iilLil1i11I1 iillil1i11i1) {
                super(o0oooooo);
                this.illlI1lLIL = iillil1i11i1;
            }

            public void close() throws IOException {
                this.illlI1lLIL.close();
                super.close();
            }
        }

        public il1LilLllii(C0022OooOoo.iilLil1i11I1 iillil1i11i1, String str, String str2) {
            this.illlI1lLIL = iillil1i11i1;
            this.iiIliillii = str;
            this.iilLil1i11I1 = str2;
            this.il1LilLllii = C0249o00oo00O.il1LilLllii(new iiI1L1iI(iillil1i11i1.i111iLiiIIill(1), iillil1i11i1));
        }

        public long I1LiILiLLIl1l() {
            try {
                String str = this.iilLil1i11I1;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public ILL1iL1LiiI IL11lll11() {
            return this.il1LilLllii;
        }

        public C0179o00OooO0 ilLIlL1ILi() {
            String str = this.iiIliillii;
            if (str != null) {
                return C0179o00OooO0.il1LilLllii(str);
            }
            return null;
        }
    }

    public final class illlI1lLIL implements I1lilLill1I {
        public C0361o0OOOo0 i1LIL11l;
        public final C0022OooOoo.il1LilLllii iiI1L1iI;
        public boolean il1LilLllii;
        public C0361o0OOOo0 illlI1lLIL;

        public class iiI1L1iI extends C0077o000O0o0 {
            public final /* synthetic */ C0022OooOoo.il1LilLllii il1LilLllii;
            public final /* synthetic */ iL1ilIi1l11L1 illlI1lLIL;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public iiI1L1iI(C0361o0OOOo0 o0oooo0, iL1ilIi1l11L1 il1ilii1l11l1, C0022OooOoo.il1LilLllii il1lillllii) {
                super(o0oooo0);
                this.illlI1lLIL = il1ilii1l11l1;
                this.il1LilLllii = il1lillllii;
            }

            public void close() throws IOException {
                synchronized (iL1ilIi1l11L1.this) {
                    try {
                        illlI1lLIL illli1llil = illlI1lLIL.this;
                        if (!illli1llil.il1LilLllii) {
                            illli1llil.il1LilLllii = true;
                            iL1ilIi1l11L1.this.il1LilLllii++;
                            super.close();
                            this.il1LilLllii.illlI1lLIL();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
        }

        public illlI1lLIL(C0022OooOoo.il1LilLllii il1lillllii) {
            this.iiI1L1iI = il1lillllii;
            C0361o0OOOo0 iiIliillii2 = il1lillllii.iiIliillii(1);
            this.i1LIL11l = iiIliillii2;
            this.illlI1lLIL = new iiI1L1iI(iiIliillii2, iL1ilIi1l11L1.this, il1lillllii);
        }

        public C0361o0OOOo0 i1LIL11l() {
            return this.illlI1lLIL;
        }

        public void iiI1L1iI() {
            synchronized (iL1ilIi1l11L1.this) {
                try {
                    if (!this.il1LilLllii) {
                        this.il1LilLllii = true;
                        iL1ilIi1l11L1.this.iiIliillii++;
                        C0487o0OooooO.I11lLL1(this.i1LIL11l);
                        try {
                            this.iiI1L1iI.iiI1L1iI();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public iL1ilIi1l11L1(File file, long j) {
        this(file, j, o0000O0O.iiI1L1iI);
    }

    public static int iILlLIlli(ILL1iL1LiiI iLL1iL1LiiI) throws IOException {
        try {
            long il1l1IlL = iLL1iL1LiiI.il1l1IlL();
            String i1iI1iiLL1 = iLL1iL1LiiI.i1iI1iiLL1();
            if (il1l1IlL >= 0 && il1l1IlL <= 2147483647L && i1iI1iiLL1.isEmpty()) {
                return (int) il1l1IlL;
            }
            throw new IOException("expected an int but was \"" + il1l1IlL + i1iI1iiLL1 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static String ilIILlI1l11i(C0109o000oo00 o000oo00) {
        return ili11iILI1l.IiiL1llIIi(o000oo00.toString()).IIlL1llI1().IL1lILLLL1L();
    }

    public synchronized int I1IILIil1lLlL() {
        return this.iLLLILIiLi1Ii;
    }

    public synchronized int I1LiILiLLIl1l() {
        return this.I11lLL1;
    }

    public long I1lLLLlliILlI() {
        return this.illlI1lLIL.iiLl11ILL();
    }

    public void II1l1IliI1Li1(C0337o0O0oooO o0o0oooo, C0337o0O0oooO o0o0oooo2) {
        C0022OooOoo.il1LilLllii il1lillllii;
        iiIliillii iiiliillii = new iiIliillii(o0o0oooo2);
        try {
            il1lillllii = ((il1LilLllii) o0o0oooo.iiI1L1iI()).illlI1lLIL.i1LIL11l();
            if (il1lillllii != null) {
                try {
                    iiiliillii.iilLil1i11I1(il1lillllii);
                    il1lillllii.illlI1lLIL();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            il1lillllii = null;
            iiI1L1iI(il1lillllii);
        }
    }

    public boolean IIL1Ll1I111() {
        return this.illlI1lLIL.iILlLIlli();
    }

    public synchronized int IIlLLll1ll1() {
        return this.il1LilLllii;
    }

    @Nullable
    public I1lilLill1I IL11lll11(C0337o0O0oooO o0o0oooo) {
        C0022OooOoo.il1LilLllii il1lillllii;
        String I11lLL12 = o0o0oooo.i11iLLllliI().I11lLL1();
        if (C0106o000oOoo.iiI1L1iI(o0o0oooo.i11iLLllliI().I11lLL1())) {
            try {
                iIiL11iL(o0o0oooo.i11iLLllliI());
            } catch (IOException unused) {
            }
            return null;
        } else if (!I11lLL12.equals("GET") || C0104o000o0oo.iiIliillii(o0o0oooo)) {
            return null;
        } else {
            iiIliillii iiiliillii = new iiIliillii(o0o0oooo);
            try {
                il1lillllii = this.illlI1lLIL.I1LiILiLLIl1l(ilIILlI1l11i(o0o0oooo.i11iLLllliI().IiiL1llIIi()));
                if (il1lillllii == null) {
                    return null;
                }
                try {
                    iiiliillii.iilLil1i11I1(il1lillllii);
                    return new illlI1lLIL(il1lillllii);
                } catch (IOException unused2) {
                    iiI1L1iI(il1lillllii);
                    return null;
                }
            } catch (IOException unused3) {
                il1lillllii = null;
                iiI1L1iI(il1lillllii);
                return null;
            }
        }
    }

    public synchronized void ILIiLLLL1iiii() {
        this.I11lLL1++;
    }

    @Nullable
    public C0337o0O0oooO IiIl11II(C0333o0O0ooO0 o0o0ooo0) {
        try {
            C0022OooOoo.iilLil1i11I1 ilIILlI1l11i = this.illlI1lLIL.ilIILlI1l11i(ilIILlI1l11i(o0o0ooo0.IiiL1llIIi()));
            if (ilIILlI1l11i == null) {
                return null;
            }
            try {
                iiIliillii iiiliillii = new iiIliillii(ilIILlI1l11i.i111iLiiIIill(0));
                C0337o0O0oooO il1LilLllii2 = iiiliillii.il1LilLllii(ilIILlI1l11i);
                if (iiiliillii.i1LIL11l(o0o0ooo0, il1LilLllii2)) {
                    return il1LilLllii2;
                }
                C0487o0OooooO.I11lLL1(il1LilLllii2.iiI1L1iI());
                return null;
            } catch (IOException unused) {
                C0487o0OooooO.I11lLL1(ilIILlI1l11i);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public void close() throws IOException {
        this.illlI1lLIL.close();
    }

    public void flush() throws IOException {
        this.illlI1lLIL.flush();
    }

    public void i111iLiiIIill() throws IOException {
        this.illlI1lLIL.IIL1Ll1I111();
    }

    public Iterator<String> i11iLLllliI() throws IOException {
        return new i1LIL11l();
    }

    public synchronized void i1L1llI1LlL1l(ILLL1LlLLilL iLLL1LlLLilL) {
        try {
            this.iLLLILIiLi1Ii++;
            if (iLLL1LlLLilL.iiI1L1iI != null) {
                this.iilLil1i11I1++;
            } else if (iLLL1LlLLilL.i1LIL11l != null) {
                this.I11lLL1++;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void i1LIL11l() throws IOException {
        this.illlI1lLIL.IiIl11II();
    }

    public void iIiL11iL(C0333o0O0ooO0 o0o0ooo0) throws IOException {
        this.illlI1lLIL.i11iLLllliI(ilIILlI1l11i(o0o0ooo0.IiiL1llIIi()));
    }

    public final void iiI1L1iI(@Nullable C0022OooOoo.il1LilLllii il1lillllii) {
        if (il1lillllii != null) {
            try {
                il1lillllii.iiI1L1iI();
            } catch (IOException unused) {
            }
        }
    }

    public synchronized int iiLl11ILL() {
        return this.iilLil1i11I1;
    }

    public File il1LilLllii() {
        return this.illlI1lLIL.I1lLLLlliILlI();
    }

    public void ilLIlL1ILi() throws IOException {
        this.illlI1lLIL.IL11lll11();
    }

    public long ilLIlLiIILl1() throws IOException {
        return this.illlI1lLIL.I1llIillii1();
    }

    public synchronized int ilLilIL() {
        return this.iiIliillii;
    }

    public iL1ilIi1l11L1(File file, long j, o0000O0O o0000o0o) {
        this.i1LIL11l = new iiI1L1iI();
        this.illlI1lLIL = C0022OooOoo.i111iLiiIIill(o0000o0o, file, IiIIlIL, 2, j);
    }

    public static final class iiIliillii {
        public static final String IiiL1llIIi = (C0292o0O0O0oO.I1iIiIi().i1L1lLllLLlIi() + "-Sent-Millis");
        public static final String iILiI1lll = (C0292o0O0O0oO.I1iIiIi().i1L1lLllLLlIi() + "-Received-Millis");
        public final C0094o000o000 I11lLL1;
        public final long IiIIlIL;
        public final C0094o000o000 i1LIL11l;
        @Nullable
        public final C0082o000Oo iLLLILIiLi1Ii;
        public final String iiI1L1iI;
        public final int iiIliillii;
        public final long iilLiIIIi11i;
        public final String iilLil1i11I1;
        public final C0297o0O0Oo il1LilLllii;
        public final String illlI1lLIL;

        public iiIliillii(C0370o0OOOooO o0oooooo) throws IOException {
            C0448o0OoOOo0 o0ooooo0;
            try {
                ILL1iL1LiiI il1LilLllii2 = C0249o00oo00O.il1LilLllii(o0oooooo);
                this.iiI1L1iI = il1LilLllii2.i1iI1iiLL1();
                this.illlI1lLIL = il1LilLllii2.i1iI1iiLL1();
                C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
                int iILlLIlli = iL1ilIi1l11L1.iILlLIlli(il1LilLllii2);
                for (int i = 0; i < iILlLIlli; i++) {
                    iii1l1ii.iilLil1i11I1(il1LilLllii2.i1iI1iiLL1());
                }
                this.i1LIL11l = iii1l1ii.IiIIlIL();
                C0375o0OOo0O i1LIL11l2 = C0375o0OOo0O.i1LIL11l(il1LilLllii2.i1iI1iiLL1());
                this.il1LilLllii = i1LIL11l2.iiI1L1iI;
                this.iiIliillii = i1LIL11l2.i1LIL11l;
                this.iilLil1i11I1 = i1LIL11l2.illlI1lLIL;
                C0094o000o000.iiI1L1iI iii1l1ii2 = new C0094o000o000.iiI1L1iI();
                int iILlLIlli2 = iL1ilIi1l11L1.iILlLIlli(il1LilLllii2);
                for (int i2 = 0; i2 < iILlLIlli2; i2++) {
                    iii1l1ii2.iilLil1i11I1(il1LilLllii2.i1iI1iiLL1());
                }
                String str = IiiL1llIIi;
                String iilLiIIIi11i2 = iii1l1ii2.iilLiIIIi11i(str);
                String str2 = iILiI1lll;
                String iilLiIIIi11i3 = iii1l1ii2.iilLiIIIi11i(str2);
                iii1l1ii2.IiiL1llIIi(str);
                iii1l1ii2.IiiL1llIIi(str2);
                long j = 0;
                this.IiIIlIL = iilLiIIIi11i2 != null ? Long.parseLong(iilLiIIIi11i2) : 0;
                this.iilLiIIIi11i = iilLiIIIi11i3 != null ? Long.parseLong(iilLiIIIi11i3) : j;
                this.I11lLL1 = iii1l1ii2.IiIIlIL();
                if (iiI1L1iI()) {
                    String i1iI1iiLL1 = il1LilLllii2.i1iI1iiLL1();
                    if (i1iI1iiLL1.length() <= 0) {
                        i1lLIl1L1lIL i1LIL11l3 = i1lLIl1L1lIL.i1LIL11l(il1LilLllii2.i1iI1iiLL1());
                        List<Certificate> illlI1lLIL2 = illlI1lLIL(il1LilLllii2);
                        List<Certificate> illlI1lLIL3 = illlI1lLIL(il1LilLllii2);
                        if (!il1LilLllii2.Il1llillili()) {
                            o0ooooo0 = C0448o0OoOOo0.iiI1L1iI(il1LilLllii2.i1iI1iiLL1());
                        } else {
                            o0ooooo0 = C0448o0OoOOo0.SSL_3_0;
                        }
                        this.iLLLILIiLi1Ii = C0082o000Oo.illlI1lLIL(o0ooooo0, i1LIL11l3, illlI1lLIL2, illlI1lLIL3);
                    } else {
                        throw new IOException("expected \"\" but was \"" + i1iI1iiLL1 + "\"");
                    }
                } else {
                    this.iLLLILIiLi1Ii = null;
                }
            } finally {
                o0oooooo.close();
            }
        }

        public boolean i1LIL11l(C0333o0O0ooO0 o0o0ooo0, C0337o0O0oooO o0o0oooo) {
            if (!this.iiI1L1iI.equals(o0o0ooo0.IiiL1llIIi().toString()) || !this.illlI1lLIL.equals(o0o0ooo0.I11lLL1()) || !C0104o000o0oo.ILl1iII11Ll1(o0o0oooo, this.i1LIL11l, o0o0ooo0)) {
                return false;
            }
            return true;
        }

        public final boolean iiI1L1iI() {
            return this.iiI1L1iI.startsWith("https://");
        }

        public final void iiIliillii(Iiii1LiI11i iiii1LiI11i, List<Certificate> list) throws IOException {
            try {
                iiii1LiI11i.IIllllLiIlIl((long) list.size()).IillLillLLIii(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    iiii1LiI11i.illiiliIILI(ili11iILI1l.il1l1IlL(list.get(i).getEncoded()).i1LIL11l()).IillLillLLIii(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public void iilLil1i11I1(C0022OooOoo.il1LilLllii il1lillllii) throws IOException {
            Iiii1LiI11i illlI1lLIL2 = C0249o00oo00O.illlI1lLIL(il1lillllii.iiIliillii(0));
            illlI1lLIL2.illiiliIILI(this.iiI1L1iI).IillLillLLIii(10);
            illlI1lLIL2.illiiliIILI(this.illlI1lLIL).IillLillLLIii(10);
            illlI1lLIL2.IIllllLiIlIl((long) this.i1LIL11l.I1iIiIi()).IillLillLLIii(10);
            int I1iIiIi = this.i1LIL11l.I1iIiIi();
            for (int i = 0; i < I1iIiIi; i++) {
                illlI1lLIL2.illiiliIILI(this.i1LIL11l.iLLLILIiLi1Ii(i)).illiiliIILI(": ").illiiliIILI(this.i1LIL11l.IL1lILLLL1L(i)).IillLillLLIii(10);
            }
            illlI1lLIL2.illiiliIILI(new C0375o0OOo0O(this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1).toString()).IillLillLLIii(10);
            illlI1lLIL2.IIllllLiIlIl((long) (this.I11lLL1.I1iIiIi() + 2)).IillLillLLIii(10);
            int I1iIiIi2 = this.I11lLL1.I1iIiIi();
            for (int i2 = 0; i2 < I1iIiIi2; i2++) {
                illlI1lLIL2.illiiliIILI(this.I11lLL1.iLLLILIiLi1Ii(i2)).illiiliIILI(": ").illiiliIILI(this.I11lLL1.IL1lILLLL1L(i2)).IillLillLLIii(10);
            }
            illlI1lLIL2.illiiliIILI(IiiL1llIIi).illiiliIILI(": ").IIllllLiIlIl(this.IiIIlIL).IillLillLLIii(10);
            illlI1lLIL2.illiiliIILI(iILiI1lll).illiiliIILI(": ").IIllllLiIlIl(this.iilLiIIIi11i).IillLillLLIii(10);
            if (iiI1L1iI()) {
                illlI1lLIL2.IillLillLLIii(10);
                illlI1lLIL2.illiiliIILI(this.iLLLILIiLi1Ii.iiI1L1iI().iiIliillii()).IillLillLLIii(10);
                iiIliillii(illlI1lLIL2, this.iLLLILIiLi1Ii.I11lLL1());
                iiIliillii(illlI1lLIL2, this.iLLLILIiLi1Ii.il1LilLllii());
                illlI1lLIL2.illiiliIILI(this.iLLLILIiLi1Ii.IiIIlIL().illlI1lLIL()).IillLillLLIii(10);
            }
            illlI1lLIL2.close();
        }

        public C0337o0O0oooO il1LilLllii(C0022OooOoo.iilLil1i11I1 iillil1i11i1) {
            String il1LilLllii2 = this.I11lLL1.il1LilLllii("Content-Type");
            String il1LilLllii3 = this.I11lLL1.il1LilLllii("Content-Length");
            return new C0337o0O0oooO.iiI1L1iI().Ii1liIIIiLi(new C0333o0O0ooO0.iiI1L1iI().i111iLiiIIill(this.iiI1L1iI).iilLiIIIi11i(this.illlI1lLIL, (C0334o0O0ooOO) null).IiIIlIL(this.i1LIL11l).i1LIL11l()).IL1lILLLL1L(this.il1LilLllii).I11lLL1(this.iiIliillii).iILiI1lll(this.iilLil1i11I1).iilLiIIIi11i(this.I11lLL1).i1LIL11l(new il1LilLllii(iillil1i11i1, il1LilLllii2, il1LilLllii3)).iLLLILIiLi1Ii(this.iLLLILIiLi1Ii).IilL11ii1I1Il(this.IiIIlIL).iL1LIlIlI(this.iilLiIIIi11i).illlI1lLIL();
        }

        public final List<Certificate> illlI1lLIL(ILL1iL1LiiI iLL1iL1LiiI) throws IOException {
            int iILlLIlli = iL1ilIi1l11L1.iILlLIlli(iLL1iL1LiiI);
            if (iILlLIlli == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iILlLIlli);
                for (int i = 0; i < iILlLIlli; i++) {
                    String i1iI1iiLL1 = iLL1iL1LiiI.i1iI1iiLL1();
                    IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
                    iiILIlLLiIL.ILiLII1ILi(ili11iILI1l.iilLil1i11I1(i1iI1iiLL1));
                    arrayList.add(instance.generateCertificate(iiILIlLLiIL.iLI1L1l1li()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public iiIliillii(C0337o0O0oooO o0o0oooo) {
            this.iiI1L1iI = o0o0oooo.i11iLLllliI().IiiL1llIIi().toString();
            this.i1LIL11l = C0104o000o0oo.iiLIIiIli(o0o0oooo);
            this.illlI1lLIL = o0o0oooo.i11iLLllliI().I11lLL1();
            this.il1LilLllii = o0o0oooo.i1L1llI1LlL1l();
            this.iiIliillii = o0o0oooo.IiIl11II();
            this.iilLil1i11I1 = o0o0oooo.iILlLIlli();
            this.I11lLL1 = o0o0oooo.I1lLLLlliILlI();
            this.iLLLILIiLi1Ii = o0o0oooo.I1LiILiLLIl1l();
            this.IiIIlIL = o0o0oooo.ilLilIL();
            this.iilLiIIIi11i = o0o0oooo.II1l1IliI1Li1();
        }
    }
}
