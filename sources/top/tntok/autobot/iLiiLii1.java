package top.tntok.autobot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class iLiiLii1 extends C0441o0OoOO00 {
    public File I11lLL1;
    public final String IiIIlIL;
    public boolean IiiL1llIIi;
    public final String iLLLILIiLi1Ii;
    public iIliIIiiI iiIliillii;
    public final File iilLiIIIi11i;
    public OutputStream iilLil1i11I1;

    public iLiiLii1(int i, File file) {
        this(i, file, (String) null, (String) null, (File) null, 1024);
    }

    public File I1lLLLlliILlI() {
        return this.I11lLL1;
    }

    public void IIL1Ll1I111() throws IOException {
        String str = this.iLLLILIiLi1Ii;
        if (str != null) {
            this.I11lLL1 = File.createTempFile(str, this.IiIIlIL, this.iilLiIIIi11i);
        }
        C0086o000OoO.illi1LIILLiL(this.I11lLL1);
        FileOutputStream fileOutputStream = new FileOutputStream(this.I11lLL1);
        try {
            this.iiIliillii.I1IILIil1lLlL(fileOutputStream);
            this.iilLil1i11I1 = fileOutputStream;
            this.iiIliillii = null;
        } catch (IOException e) {
            fileOutputStream.close();
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void IL11lll11(java.io.OutputStream r3) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.IiiL1llIIi
            if (r0 == 0) goto L_0x002a
            boolean r0 = r2.iiLl11ILL()
            if (r0 == 0) goto L_0x0010
            top.tntok.autobot.iIliIIiiI r0 = r2.iiIliillii
            r0.I1IILIil1lLlL(r3)
            goto L_0x001d
        L_0x0010:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.I11lLL1
            r0.<init>(r1)
            top.tntok.autobot.C0130o00O0o00.I1I11Il1(r0, r3)     // Catch:{ all -> 0x001e }
            r0.close()
        L_0x001d:
            return
        L_0x001e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0029:
            throw r1
        L_0x002a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Stream not closed"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iLiiLii1.IL11lll11(java.io.OutputStream):void");
    }

    public void close() throws IOException {
        super.close();
        this.IiiL1llIIi = true;
    }

    public boolean iiLl11ILL() {
        return !IiIl11II();
    }

    public OutputStream il1LilLllii() throws IOException {
        return this.iilLil1i11I1;
    }

    public byte[] ilIILlI1l11i() {
        iIliIIiiI iiliiiiii = this.iiIliillii;
        if (iiliiiiii != null) {
            return iiliiiiii.IiIl11II();
        }
        return null;
    }

    public iLiiLii1(int i, int i2, File file) {
        this(i, file, (String) null, (String) null, (File) null, i2);
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public iLiiLii1(int i, String str, String str2, File file) {
        this(i, (File) null, str, str2, file, 1024);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    public iLiiLii1(int i, int i2, String str, String str2, File file) {
        this(i, (File) null, str, str2, file, i2);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public iLiiLii1(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.IiiL1llIIi = false;
        this.I11lLL1 = file;
        this.iLLLILIiLi1Ii = str;
        this.IiIIlIL = str2;
        this.iilLiIIIi11i = file2;
        iIliIIiiI iiliiiiii = new iIliIIiiI(i2);
        this.iiIliillii = iiliiiiii;
        this.iilLil1i11I1 = iiliiiiii;
    }
}
