package top.tntok.autobot;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: top.tntok.autobot.OooOoOO  reason: case insensitive filesystem */
public class C0021OooOoOO implements o00000O0 {
    public static final String I1iIiIi = "ISO-8859-1";
    public static final AtomicInteger IL1lILLLL1L = new AtomicInteger(0);
    public static final String i1L1lLllLLlIi = UUID.randomUUID().toString().replace('-', '_');
    public final File I11lLL1;
    public transient iLiiLii1 IiIIlIL;
    public o00000OO IiiL1llIIi;
    public final String i1LIL11l;
    public String iILiI1lll = I1iIiIi;
    public byte[] iLLLILIiLi1Ii;
    public String iiI1L1iI;
    public long iiIliillii = -1;
    public transient File iilLiIIIi11i;
    public final int iilLil1i11I1;
    public final String il1LilLllii;
    public boolean illlI1lLIL;

    public C0021OooOoOO(String str, String str2, boolean z, String str3, int i, File file) {
        this.iiI1L1iI = str;
        this.i1LIL11l = str2;
        this.illlI1lLIL = z;
        this.il1LilLllii = str3;
        this.iilLil1i11I1 = i;
        this.I11lLL1 = file;
    }

    public static String ILl1iII11Ll1() {
        int andIncrement = IL1lILLLL1L.getAndIncrement();
        String num = Integer.toString(andIncrement);
        if (andIncrement >= 100000000) {
            return num;
        }
        return ("00000000" + num).substring(num.length());
    }

    public o00000OO I11lLL1() {
        return this.IiiL1llIIi;
    }

    public void I1iIiIi(o00000OO o00000oo) {
        this.IiiL1llIIi = o00000oo;
    }

    public File I1l1iIll1lIi1() {
        if (this.IiIIlIL != null && !i1L1lLllLLlIi()) {
            return this.IiIIlIL.I1lLLLlliILlI();
        }
        return null;
    }

    public long IL1lILLLL1L() {
        long j = this.iiIliillii;
        if (j >= 0) {
            return j;
        }
        byte[] bArr = this.iLLLILIiLi1Ii;
        if (bArr != null) {
            return (long) bArr.length;
        }
        if (this.IiIIlIL.iiLl11ILL()) {
            return (long) this.IiIIlIL.ilIILlI1l11i().length;
        }
        return this.IiIIlIL.I1lLLLlliILlI().length();
    }

    public String Ii1liIIIiLi() {
        C0266o00ooOo0 o00oooo0 = new C0266o00ooOo0();
        o00oooo0.IiiL1llIIi(true);
        return o00oooo0.iiIliillii(i1LIL11l(), ';').get("charset");
    }

    public String IiIIlIL(String str) throws UnsupportedEncodingException, IOException {
        return new String(get(), str);
    }

    public String IiiL1llIIi() {
        try {
            byte[] bArr = get();
            String Ii1liIIIiLi = Ii1liIIIiLi();
            if (Ii1liIIIiLi == null) {
                Ii1liIIIiLi = this.iILiI1lll;
            }
            return new String(bArr, Ii1liIIIiLi);
        } catch (IOException unused) {
            return "";
        }
    }

    public String IilL11ii1I1Il() {
        return this.iILiI1lll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r1 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] get() throws java.io.UncheckedIOException {
        /*
            r4 = this;
            boolean r0 = r4.i1L1lLllLLlIi()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            byte[] r0 = r4.iLLLILIiLi1Ii
            if (r0 != 0) goto L_0x0015
            top.tntok.autobot.iLiiLii1 r0 = r4.IiIIlIL
            if (r0 == 0) goto L_0x0015
            byte[] r0 = r0.ilIILlI1l11i()
            r4.iLLLILIiLi1Ii = r0
        L_0x0015:
            byte[] r0 = r4.iLLLILIiLi1Ii
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            goto L_0x0022
        L_0x0020:
            byte[] r0 = new byte[r1]
        L_0x0022:
            return r0
        L_0x0023:
            long r2 = r4.IL1lILLLL1L()
            int r0 = (int) r2
            byte[] r0 = new byte[r0]
            top.tntok.autobot.iLiiLii1 r2 = r4.IiIIlIL     // Catch:{ IOException -> 0x0043 }
            java.io.File r2 = r2.I1lLLLlliILlI()     // Catch:{ IOException -> 0x0043 }
            java.nio.file.Path r2 = r2.toPath()     // Catch:{ IOException -> 0x0043 }
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch:{ IOException -> 0x0043 }
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r2, r1)     // Catch:{ IOException -> 0x0043 }
            top.tntok.autobot.C0130o00O0o00.I1i1iiiI(r1, r0)     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            goto L_0x0054
        L_0x0045:
            return r0
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r2 = move-exception
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ IOException -> 0x0043 }
        L_0x0053:
            throw r2     // Catch:{ IOException -> 0x0043 }
        L_0x0054:
            java.io.UncheckedIOException r0 = top.tntok.autobot.C0019OooOoO.iiI1L1iI(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0021OooOoOO.get():byte[]");
    }

    public void i111iLiiIIill(String str) {
        this.iiI1L1iI = str;
    }

    public boolean i1L1lLllLLlIi() {
        if (this.iLLLILIiLi1Ii != null) {
            return true;
        }
        return this.IiIIlIL.iiLl11ILL();
    }

    public String i1LIL11l() {
        return this.i1LIL11l;
    }

    public void i1iiLIil1ILi(String str) {
        this.iILiI1lll = str;
    }

    public void iILiI1lll(boolean z) {
        this.illlI1lLIL = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iLLLILIiLi1Ii(java.io.File r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r4.i1L1lLllLLlIi()
            if (r0 == 0) goto L_0x0032
            java.nio.file.Path r5 = r5.toPath()     // Catch:{ IOException -> 0x002a }
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]     // Catch:{ IOException -> 0x002a }
            java.io.OutputStream r5 = java.nio.file.Files.newOutputStream(r5, r0)     // Catch:{ IOException -> 0x002a }
            byte[] r0 = r4.get()     // Catch:{ all -> 0x001c }
            r5.write(r0)     // Catch:{ all -> 0x001c }
            r5.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0056
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            if (r5 == 0) goto L_0x0029
            r5.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r0.addSuppressed(r5)     // Catch:{ IOException -> 0x002a }
        L_0x0029:
            throw r1     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Unexpected output data"
            r5.<init>(r0)
            throw r5
        L_0x0032:
            java.io.File r0 = r4.I1l1iIll1lIi1()
            java.lang.String r1 = "Cannot write uploaded file to disk!"
            if (r0 == 0) goto L_0x0057
            long r2 = r0.length()
            r4.iiIliillii = r2
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x0053
            boolean r2 = r5.delete()
            if (r2 == 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            top.tntok.autobot.o0000Oo0 r5 = new top.tntok.autobot.o0000Oo0
            r5.<init>(r1)
            throw r5
        L_0x0053:
            top.tntok.autobot.C0086o000OoO.ilLilIL(r0, r5)
        L_0x0056:
            return
        L_0x0057:
            top.tntok.autobot.o0000Oo0 r5 = new top.tntok.autobot.o0000Oo0
            r5.<init>(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0021OooOoOO.iLLLILIiLi1Ii(java.io.File):void");
    }

    public String iiI1L1iI() {
        return C0381o0OOo0oO.illlI1lLIL(this.il1LilLllii);
    }

    public boolean iiIliillii() {
        return this.illlI1lLIL;
    }

    public File iiLIIiIli() {
        if (this.iilLiIIIi11i == null) {
            File file = this.I11lLL1;
            if (file == null) {
                file = new File(System.getProperty("java.io.tmpdir"));
            }
            this.iilLiIIIi11i = new File(file, String.format("upload_%s_%s.tmp", new Object[]{i1L1lLllLLlIi, ILl1iII11Ll1()}));
        }
        return this.iilLiIIIi11i;
    }

    public OutputStream iilLiIIIi11i() {
        if (this.IiIIlIL == null) {
            this.IiIIlIL = new iLiiLii1(this.iilLil1i11I1, iiLIIiIli());
        }
        return this.IiIIlIL;
    }

    public String iilLil1i11I1() {
        return this.iiI1L1iI;
    }

    public void il1LilLllii() {
        this.iLLLILIiLi1Ii = null;
        File I1l1iIll1lIi1 = I1l1iIll1lIi1();
        if (I1l1iIll1lIi1 != null && !i1L1lLllLLlIi() && I1l1iIll1lIi1.exists() && !I1l1iIll1lIi1.delete()) {
            String str = "Cannot delete " + I1l1iIll1lIi1.toString();
            C0020OooOoO0.iiI1L1iI();
            throw OooOo.iiI1L1iI(str, new IOException(str));
        }
    }

    public InputStream illlI1lLIL() throws IOException {
        if (!i1L1lLllLLlIi()) {
            return Files.newInputStream(this.IiIIlIL.I1lLLLlliILlI().toPath(), new OpenOption[0]);
        }
        if (this.iLLLILIiLi1Ii == null) {
            this.iLLLILIiLi1Ii = this.IiIIlIL.ilIILlI1l11i();
        }
        return new ByteArrayInputStream(this.iLLLILIiLi1Ii);
    }

    public String toString() {
        return String.format("name=%s, StoreLocation=%s, size=%s bytes, isFormField=%s, FieldName=%s", new Object[]{iiI1L1iI(), I1l1iIll1lIi1(), Long.valueOf(IL1lILLLL1L()), Boolean.valueOf(iiIliillii()), iilLil1i11I1()});
    }
}
