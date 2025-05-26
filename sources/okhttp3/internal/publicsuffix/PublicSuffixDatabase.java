package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import top.tntok.autobot.C0089o000Ooo;
import top.tntok.autobot.i1IL1lILl1L1I;

public final class PublicSuffixDatabase {
    public static final String[] I11lLL1 = new String[0];
    public static final byte IiIIlIL = 33;
    public static final String[] iLLLILIiLi1Ii = {"*"};
    public static final String iiIliillii = "publicsuffixes.gz";
    public static final PublicSuffixDatabase iilLiIIIi11i = new PublicSuffixDatabase();
    public static final byte[] iilLil1i11I1 = {42};
    public final CountDownLatch i1LIL11l = new CountDownLatch(1);
    public final AtomicBoolean iiI1L1iI = new AtomicBoolean(false);
    public byte[] il1LilLllii;
    public byte[] illlI1lLIL;

    public static String iiI1L1iI(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i10] & i1IL1lILl1L1I.iiI1L1iI;
                }
                i3 = b - (bArr3[i6 + i11] & i1IL1lILl1L1I.iiI1L1iI);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, StandardCharsets.UTF_8);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i5;
        }
        return null;
    }

    public static PublicSuffixDatabase illlI1lLIL() {
        return iilLiIIIi11i;
    }

    public void I11lLL1(byte[] bArr, byte[] bArr2) {
        this.illlI1lLIL = bArr;
        this.il1LilLllii = bArr2;
        this.iiI1L1iI.set(true);
        this.i1LIL11l.countDown();
    }

    public final String[] i1LIL11l(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.iiI1L1iI.get() || !this.iiI1L1iI.compareAndSet(false, true)) {
            try {
                this.i1LIL11l.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            iilLil1i11I1();
        }
        synchronized (this) {
            if (this.illlI1lLIL == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = iiI1L1iI(this.illlI1lLIL, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = iilLil1i11I1;
                str3 = iiI1L1iI(this.illlI1lLIL, bArr2, i4);
                if (str3 != null) {
                    break;
                }
                i4++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String iiI1L1iI2 = iiI1L1iI(this.il1LilLllii, bArr, i);
                if (iiI1L1iI2 != null) {
                    str = iiI1L1iI2;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return iLLLILIiLi1Ii;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = I11lLL1;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = I11lLL1;
            }
            if (strArr2.length > strArr3.length) {
                return strArr2;
            }
            return strArr3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iiIliillii() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            top.tntok.autobot.o000Oo00 r1 = new top.tntok.autobot.o000Oo00
            top.tntok.autobot.o0OOOooO r0 = top.tntok.autobot.C0249o00oo00O.iILiI1lll(r0)
            r1.<init>(r0)
            top.tntok.autobot.ILL1iL1LiiI r0 = top.tntok.autobot.C0249o00oo00O.il1LilLllii(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003c }
            r0.readFully(r1)     // Catch:{ all -> 0x003c }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003c }
            r0.readFully(r2)     // Catch:{ all -> 0x003c }
            r0.close()
            monitor-enter(r3)
            r3.illlI1lLIL = r1     // Catch:{ all -> 0x0039 }
            r3.il1LilLllii = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.CountDownLatch r0 = r3.i1LIL11l
            r0.countDown()
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r2 = move-exception
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0049:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.iiIliillii():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iilLil1i11I1() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.iiIliillii()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            top.tntok.autobot.o0O0O0oO r2 = top.tntok.autobot.C0292o0O0O0oO.I1iIiIi()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.iiLIIiIli(r4, r3, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.iilLil1i11I1():void");
    }

    public String il1LilLllii(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] i1LIL11l2 = i1LIL11l(split);
            if (split.length == i1LIL11l2.length && i1LIL11l2[0].charAt(0) != '!') {
                return null;
            }
            if (i1LIL11l2[0].charAt(0) == '!') {
                length = split.length;
                length2 = i1LIL11l2.length;
            } else {
                length = split.length;
                length2 = i1LIL11l2.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i = length - length2; i < split2.length; i++) {
                sb.append(split2[i]);
                sb.append(C0089o000Ooo.il1LilLllii);
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }
}
