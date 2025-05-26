package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* renamed from: top.tntok.autobot.o0ooO0O0  reason: case insensitive filesystem */
public class C0537o0ooO0O0 implements Runnable {
    public static final int IiIIlIL = 1000;
    public static final Charset IiiL1llIIi = Charset.defaultCharset();
    public static final String iilLiIIIi11i = "r";
    public final boolean I11lLL1;
    public final File i1LIL11l;
    public volatile boolean iLLLILIiLi1Ii;
    public final byte[] iiI1L1iI;
    public final boolean iiIliillii;
    public final C0411o0Oo0O00 iilLil1i11I1;
    public final long il1LilLllii;
    public final Charset illlI1lLIL;

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00) {
        this(file, o0oo0o00, 1000);
    }

    public static C0537o0ooO0O0 I11lLL1(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2, int i) {
        return iiI1L1iI(file, IiiL1llIIi, o0oo0o00, j, z, z2, i);
    }

    public static C0537o0ooO0O0 i1LIL11l(File file, C0411o0Oo0O00 o0oo0o00) {
        return il1LilLllii(file, o0oo0o00, 1000, false);
    }

    public static C0537o0ooO0O0 iiI1L1iI(File file, Charset charset, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2, int i) {
        C0537o0ooO0O0 o0ooo0o0 = new C0537o0ooO0O0(file, charset, o0oo0o00, j, z, z2, i);
        Thread thread = new Thread(o0ooo0o0);
        thread.setDaemon(true);
        thread.start();
        return o0ooo0o0;
    }

    public static C0537o0ooO0O0 iiIliillii(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, int i) {
        return I11lLL1(file, o0oo0o00, j, z, false, i);
    }

    public static C0537o0ooO0O0 iilLil1i11I1(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2) {
        return I11lLL1(file, o0oo0o00, j, z, z2, 8192);
    }

    public static C0537o0ooO0O0 il1LilLllii(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z) {
        return iiIliillii(file, o0oo0o00, j, z, 8192);
    }

    public static C0537o0ooO0O0 illlI1lLIL(File file, C0411o0Oo0O00 o0oo0o00, long j) {
        return il1LilLllii(file, o0oo0o00, j, false);
    }

    public File IiIIlIL() {
        return this.i1LIL11l;
    }

    public final long IiiL1llIIi(RandomAccessFile randomAccessFile) throws IOException {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long j = filePointer;
            boolean z = false;
            while (iilLiIIIi11i() && (read = randomAccessFile.read(this.iiI1L1iI)) != -1) {
                for (int i = 0; i < read; i++) {
                    byte b = this.iiI1L1iI[i];
                    if (b == 10) {
                        this.iilLil1i11I1.iiI1L1iI(new String(byteArrayOutputStream.toByteArray(), this.illlI1lLIL));
                        byteArrayOutputStream.reset();
                        filePointer = ((long) i) + j + 1;
                        z = false;
                    } else if (b != 13) {
                        if (z) {
                            this.iilLil1i11I1.iiI1L1iI(new String(byteArrayOutputStream.toByteArray(), this.illlI1lLIL));
                            byteArrayOutputStream.reset();
                            filePointer = ((long) i) + j + 1;
                            z = false;
                        }
                        byteArrayOutputStream.write(b);
                    } else {
                        if (z) {
                            byteArrayOutputStream.write(13);
                        }
                        z = true;
                    }
                }
                j = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            C0411o0Oo0O00 o0oo0o00 = this.iilLil1i11I1;
            if (o0oo0o00 instanceof C0410o0Oo0O0) {
                ((C0410o0Oo0O0) o0oo0o00).iilLil1i11I1();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void iILiI1lll() {
        this.iLLLILIiLi1Ii = false;
    }

    public long iLLLILIiLi1Ii() {
        return this.il1LilLllii;
    }

    public boolean iilLiIIIi11i() {
        return this.iLLLILIiLi1Ii;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r14.iilLil1i11I1.illlI1lLIL();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff A[SYNTHETIC, Splitter:B:88:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011c A[SYNTHETIC, Splitter:B:99:0x011c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:91:0x0105=Splitter:B:91:0x0105, B:85:0x00f8=Splitter:B:85:0x00f8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            r0 = 0
            r2 = 0
            r3 = r0
            r5 = r3
        L_0x0005:
            boolean r7 = r14.iilLiIIIi11i()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.lang.String r8 = "r"
            if (r7 == 0) goto L_0x0045
            if (r2 != 0) goto L_0x0045
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0021 }
            java.io.File r9 = r14.i1LIL11l     // Catch:{ FileNotFoundException -> 0x0021 }
            r7.<init>(r9, r8)     // Catch:{ FileNotFoundException -> 0x0021 }
            r2 = r7
            goto L_0x0026
        L_0x0018:
            r0 = move-exception
            goto L_0x011a
        L_0x001b:
            r0 = move-exception
            goto L_0x00f8
        L_0x001e:
            r0 = move-exception
            goto L_0x0105
        L_0x0021:
            top.tntok.autobot.o0Oo0O00 r7 = r14.iilLil1i11I1     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r7.illlI1lLIL()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
        L_0x0026:
            if (r2 != 0) goto L_0x002e
            long r7 = r14.il1LilLllii     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            goto L_0x0005
        L_0x002e:
            boolean r3 = r14.iiIliillii     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            if (r3 == 0) goto L_0x003a
            java.io.File r3 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r3 = r3.length()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r5 = r3
            goto L_0x003b
        L_0x003a:
            r5 = r0
        L_0x003b:
            java.io.File r3 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r3 = r3.lastModified()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r2.seek(r5)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            goto L_0x0005
        L_0x0045:
            boolean r7 = r14.iilLiIIIi11i()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            if (r7 == 0) goto L_0x00e8
            java.io.File r7 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            boolean r7 = top.tntok.autobot.C0086o000OoO.IillLillLLIii(r7, r3)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.io.File r9 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r9 = r9.length()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a5
            top.tntok.autobot.o0Oo0O00 r7 = r14.iilLil1i11I1     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r7.i1LIL11l()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x008b }
            java.io.File r9 = r14.i1LIL11l     // Catch:{ all -> 0x008b }
            r7.<init>(r9, r8)     // Catch:{ all -> 0x008b }
            r14.IiiL1llIIi(r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0073
        L_0x006b:
            r9 = move-exception
            goto L_0x008d
        L_0x006d:
            r9 = move-exception
            top.tntok.autobot.o0Oo0O00 r10 = r14.iilLil1i11I1     // Catch:{ all -> 0x006b }
            r10.il1LilLllii(r9)     // Catch:{ all -> 0x006b }
        L_0x0073:
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ FileNotFoundException -> 0x0085 }
            goto L_0x0088
        L_0x0079:
            r0 = move-exception
            r2 = r7
            goto L_0x011a
        L_0x007d:
            r0 = move-exception
            r2 = r7
            goto L_0x00f8
        L_0x0081:
            r0 = move-exception
            r2 = r7
            goto L_0x0105
        L_0x0085:
            r5 = r0
        L_0x0086:
            r2 = r7
            goto L_0x009a
        L_0x0088:
            r5 = r0
        L_0x0089:
            r2 = r7
            goto L_0x0045
        L_0x008b:
            r9 = move-exception
            r7 = r2
        L_0x008d:
            throw r9     // Catch:{ all -> 0x008e }
        L_0x008e:
            r10 = move-exception
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r2 = move-exception
            r9.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0086 }
        L_0x0099:
            throw r10     // Catch:{ FileNotFoundException -> 0x0086 }
        L_0x009a:
            top.tntok.autobot.o0Oo0O00 r7 = r14.iilLil1i11I1     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r7.illlI1lLIL()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r9 = r14.il1LilLllii     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            goto L_0x0045
        L_0x00a5:
            if (r11 <= 0) goto L_0x00b5
            long r3 = r14.IiiL1llIIi(r2)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.io.File r5 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r5 = r5.lastModified()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
        L_0x00b1:
            r12 = r3
            r3 = r5
            r5 = r12
            goto L_0x00c5
        L_0x00b5:
            if (r7 == 0) goto L_0x00c5
            r2.seek(r0)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r3 = r14.IiiL1llIIi(r2)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.io.File r5 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            long r5 = r5.lastModified()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            goto L_0x00b1
        L_0x00c5:
            boolean r7 = r14.I11lLL1     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            if (r7 == 0) goto L_0x00ce
            if (r2 == 0) goto L_0x00ce
            r2.close()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
        L_0x00ce:
            long r9 = r14.il1LilLllii     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            boolean r7 = r14.iilLiIIIi11i()     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            if (r7 == 0) goto L_0x0045
            boolean r7 = r14.I11lLL1     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            if (r7 == 0) goto L_0x0045
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            java.io.File r9 = r14.i1LIL11l     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r7.<init>(r9, r8)     // Catch:{ InterruptedException -> 0x001e, Exception -> 0x001b }
            r7.seek(r5)     // Catch:{ InterruptedException -> 0x0081, Exception -> 0x007d, all -> 0x0079 }
            goto L_0x0089
        L_0x00e8:
            if (r2 == 0) goto L_0x00f4
            r2.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00f4
        L_0x00ee:
            r0 = move-exception
        L_0x00ef:
            top.tntok.autobot.o0Oo0O00 r1 = r14.iilLil1i11I1
            r1.il1LilLllii(r0)
        L_0x00f4:
            r14.iILiI1lll()
            goto L_0x0119
        L_0x00f8:
            top.tntok.autobot.o0Oo0O00 r1 = r14.iilLil1i11I1     // Catch:{ all -> 0x0018 }
            r1.il1LilLllii(r0)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x00f4
            r2.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x00f4
        L_0x0103:
            r0 = move-exception
            goto L_0x00ef
        L_0x0105:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0018 }
            r1.interrupt()     // Catch:{ all -> 0x0018 }
            top.tntok.autobot.o0Oo0O00 r1 = r14.iilLil1i11I1     // Catch:{ all -> 0x0018 }
            r1.il1LilLllii(r0)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x00f4
            r2.close()     // Catch:{ IOException -> 0x0117 }
            goto L_0x00f4
        L_0x0117:
            r0 = move-exception
            goto L_0x00ef
        L_0x0119:
            return
        L_0x011a:
            if (r2 == 0) goto L_0x0126
            r2.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0126
        L_0x0120:
            r1 = move-exception
            top.tntok.autobot.o0Oo0O00 r2 = r14.iilLil1i11I1
            r2.il1LilLllii(r1)
        L_0x0126:
            r14.iILiI1lll()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0537o0ooO0O0.run():void");
    }

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00, long j) {
        this(file, o0oo0o00, j, false);
    }

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z) {
        this(file, o0oo0o00, j, z, 8192);
    }

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2) {
        this(file, o0oo0o00, j, z, z2, 8192);
    }

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, int i) {
        this(file, o0oo0o00, j, z, false, i);
    }

    public C0537o0ooO0O0(File file, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2, int i) {
        this(file, IiiL1llIIi, o0oo0o00, j, z, z2, i);
    }

    public C0537o0ooO0O0(File file, Charset charset, C0411o0Oo0O00 o0oo0o00, long j, boolean z, boolean z2, int i) {
        this.iLLLILIiLi1Ii = true;
        this.i1LIL11l = file;
        this.il1LilLllii = j;
        this.iiIliillii = z;
        this.iiI1L1iI = new byte[i];
        this.iilLil1i11I1 = o0oo0o00;
        o0oo0o00.iiIliillii(this);
        this.I11lLL1 = z2;
        this.illlI1lLIL = charset;
    }
}
