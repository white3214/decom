package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public abstract class o0O implements Closeable {
    @Nullable
    public Reader i1LIL11l;

    public static final class i1LIL11l extends Reader {
        public final ILL1iL1LiiI i1LIL11l;
        @Nullable
        public Reader iiIliillii;
        public boolean il1LilLllii;
        public final Charset illlI1lLIL;

        public i1LIL11l(ILL1iL1LiiI iLL1iL1LiiI, Charset charset) {
            this.i1LIL11l = iLL1iL1LiiI;
            this.illlI1lLIL = charset;
        }

        public void close() throws IOException {
            this.il1LilLllii = true;
            Reader reader = this.iiIliillii;
            if (reader != null) {
                reader.close();
            } else {
                this.i1LIL11l.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.il1LilLllii) {
                Reader reader = this.iiIliillii;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.i1LIL11l.iLI1L1l1li(), C0487o0OooooO.illlI1lLIL(this.i1LIL11l, this.illlI1lLIL));
                    this.iiIliillii = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public class iiI1L1iI extends o0O {
        public final /* synthetic */ ILL1iL1LiiI iiIliillii;
        public final /* synthetic */ long il1LilLllii;
        public final /* synthetic */ C0179o00OooO0 illlI1lLIL;

        public iiI1L1iI(C0179o00OooO0 o00oooo0, long j, ILL1iL1LiiI iLL1iL1LiiI) {
            this.illlI1lLIL = o00oooo0;
            this.il1LilLllii = j;
            this.iiIliillii = iLL1iL1LiiI;
        }

        public long I1LiILiLLIl1l() {
            return this.il1LilLllii;
        }

        public ILL1iL1LiiI IL11lll11() {
            return this.iiIliillii;
        }

        @Nullable
        public C0179o00OooO0 ilLIlL1ILi() {
            return this.illlI1lLIL;
        }
    }

    public static o0O I1lLLLlliILlI(@Nullable C0179o00OooO0 o00oooo0, ili11iILI1l ili11iili1l) {
        return IIL1Ll1I111(o00oooo0, (long) ili11iili1l.illiiliIILI(), new IiILIlLLiIL().ILiLII1ILi(ili11iili1l));
    }

    public static o0O IIL1Ll1I111(@Nullable C0179o00OooO0 o00oooo0, long j, ILL1iL1LiiI iLL1iL1LiiI) {
        if (iLL1iL1LiiI != null) {
            return new iiI1L1iI(o00oooo0, j, iLL1iL1LiiI);
        }
        throw new NullPointerException("source == null");
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

    public static o0O iiLl11ILL(@Nullable C0179o00OooO0 o00oooo0, byte[] bArr) {
        return IIL1Ll1I111(o00oooo0, (long) bArr.length, new IiILIlLLiIL().iiIliillii(bArr));
    }

    public static o0O ilIILlI1l11i(@Nullable C0179o00OooO0 o00oooo0, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (o00oooo0 != null) {
            Charset iiI1L1iI2 = o00oooo0.iiI1L1iI();
            if (iiI1L1iI2 == null) {
                o00oooo0 = C0179o00OooO0.il1LilLllii(o00oooo0 + "; charset=utf-8");
            } else {
                charset = iiI1L1iI2;
            }
        }
        IiILIlLLiIL IillLI1llIL1 = new IiILIlLLiIL().IIlLill(str, charset);
        return IIL1Ll1I111(o00oooo0, IillLI1llIL1.iLLi1LIi(), IillLI1llIL1);
    }

    public abstract long I1LiILiLLIl1l();

    public abstract ILL1iL1LiiI IL11lll11();

    public final Charset IiIl11II() {
        C0179o00OooO0 ilLIlL1ILi = ilLIlL1ILi();
        if (ilLIlL1ILi != null) {
            return ilLIlL1ILi.i1LIL11l(StandardCharsets.UTF_8);
        }
        return StandardCharsets.UTF_8;
    }

    public void close() {
        C0487o0OooooO.I11lLL1(IL11lll11());
    }

    public final Reader i111iLiiIIill() {
        Reader reader = this.i1LIL11l;
        if (reader != null) {
            return reader;
        }
        i1LIL11l i1lil11l = new i1LIL11l(IL11lll11(), IiIl11II());
        this.i1LIL11l = i1lil11l;
        return i1lil11l;
    }

    public final InputStream i1LIL11l() {
        return IL11lll11().iLI1L1l1li();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        iiI1L1iI(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String iILlLIlli() throws java.io.IOException {
        /*
            r3 = this;
            top.tntok.autobot.ILL1iL1LiiI r0 = r3.IL11lll11()
            java.nio.charset.Charset r1 = r3.IiIl11II()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = top.tntok.autobot.C0487o0OooooO.illlI1lLIL(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.ILiliIiI(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            iiI1L1iI(r2, r0)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            if (r0 == 0) goto L_0x001d
            iiI1L1iI(r1, r0)
        L_0x001d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o0O.iILlLIlli():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        iiI1L1iI(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] il1LilLllii() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.I1LiILiLLIl1l()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0053
            top.tntok.autobot.ILL1iL1LiiI r2 = r6.IL11lll11()
            byte[] r3 = r2.I1IIIi1i1ILl()     // Catch:{ all -> 0x004a }
            r4 = 0
            iiI1L1iI(r4, r2)
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0049
            int r2 = r3.length
            long r4 = (long) r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0024
            goto L_0x0049
        L_0x0024:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            int r0 = r3.length
            r4.append(r0)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        L_0x0049:
            return r3
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0052
            iiI1L1iI(r0, r2)
        L_0x0052:
            throw r1
        L_0x0053:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o0O.il1LilLllii():byte[]");
    }

    @Nullable
    public abstract C0179o00OooO0 ilLIlL1ILi();
}
