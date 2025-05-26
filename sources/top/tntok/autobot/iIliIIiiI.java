package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class iIliIIiiI extends I11lLL1 {
    public iIliIIiiI() {
        this(1024);
    }

    public static InputStream ILIiLLLL1iiii(InputStream inputStream) throws IOException {
        return i1L1llI1LlL1l(inputStream, 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream i1L1llI1LlL1l(java.io.InputStream r1, int r2) throws java.io.IOException {
        /*
            top.tntok.autobot.iIliIIiiI r0 = new top.tntok.autobot.iIliIIiiI
            r0.<init>(r2)
            r0.iiLl11ILL(r1)     // Catch:{ all -> 0x0010 }
            java.io.InputStream r1 = r0.ilLIlL1ILi()     // Catch:{ all -> 0x0010 }
            r0.close()
            return r1
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x001b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.iIliIIiiI.i1L1llI1LlL1l(java.io.InputStream, int):java.io.InputStream");
    }

    public synchronized void I1IILIil1lLlL(OutputStream outputStream) throws IOException {
        ilLIlLiIILl1(outputStream);
    }

    public synchronized byte[] IiIl11II() {
        return I1LiILiLLIl1l();
    }

    public synchronized int i111iLiiIIill() {
        return this.iilLil1i11I1;
    }

    public synchronized void i1LIL11l() {
        il1LilLllii();
    }

    public synchronized int iiLl11ILL(InputStream inputStream) throws IOException {
        return IL11lll11(inputStream);
    }

    public synchronized InputStream ilLIlL1ILi() {
        return IIL1Ll1I111(new iI1LILIILLI());
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            synchronized (this) {
                iIiL11iL(bArr, i, i2);
            }
        }
    }

    public iIliIIiiI(int i) {
        if (i >= 0) {
            synchronized (this) {
                iiI1L1iI(i);
            }
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    public synchronized void write(int i) {
        iILlLIlli(i);
    }
}
