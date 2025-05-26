package top.tntok.autobot;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: top.tntok.autobot.OooO0oo  reason: case insensitive filesystem */
public final class C0010OooO0oo implements Closeable {
    public static final String IiIIlIL = C0387o0OOoO0o.iiI1L1iI("0bnO2+mi\n", "otq8uJnbqrQ=\n");
    public static final int iLLLILIiLi1Ii = 64;
    public final i11ILLI1I I11lLL1;
    public final LocalSocket i1LIL11l;
    public final FileDescriptor iiIliillii;
    public final LocalSocket iilLil1i11I1;
    public final LocalSocket il1LilLllii;
    public final FileDescriptor illlI1lLIL;

    public C0010OooO0oo(LocalSocket localSocket, LocalSocket localSocket2, LocalSocket localSocket3) throws IOException {
        FileDescriptor fileDescriptor;
        FileDescriptor fileDescriptor2;
        this.i1LIL11l = localSocket;
        this.il1LilLllii = localSocket2;
        this.iilLil1i11I1 = localSocket3;
        i11ILLI1I i11illi1i = null;
        if (localSocket != null) {
            fileDescriptor = localSocket.getFileDescriptor();
        } else {
            fileDescriptor = null;
        }
        this.illlI1lLIL = fileDescriptor;
        if (localSocket2 != null) {
            fileDescriptor2 = localSocket2.getFileDescriptor();
        } else {
            fileDescriptor2 = null;
        }
        this.iiIliillii = fileDescriptor2;
        this.I11lLL1 = localSocket3 != null ? new i11ILLI1I(localSocket3) : i11illi1i;
    }

    public static String IiIl11II(int i) {
        if (i == -1) {
            return IiIIlIL;
        }
        return IiIIlIL + String.format(C0387o0OOoO0o.iiI1L1iI("hH8P9Js=\n", "21o/zONbdcs=\n"), new Object[]{Integer.valueOf(i)});
    }

    public static LocalSocket iiI1L1iI(String str) throws IOException {
        LocalSocket localSocket = new LocalSocket();
        localSocket.connect(new LocalSocketAddress(str));
        return localSocket;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: android.net.LocalSocket} */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static top.tntok.autobot.C0010OooO0oo ilLIlL1ILi(int r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) throws java.io.IOException {
        /*
            java.lang.String r2 = IiIl11II(r2)
            r0 = 0
            if (r3 == 0) goto L_0x006d
            android.net.LocalServerSocket r3 = new android.net.LocalServerSocket     // Catch:{ IOException -> 0x006b, RuntimeException -> 0x0067 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x006b, RuntimeException -> 0x0067 }
            r2 = 0
            if (r4 == 0) goto L_0x0027
            android.net.LocalSocket r4 = r3.accept()     // Catch:{ all -> 0x0023 }
            if (r7 == 0) goto L_0x0028
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ all -> 0x001e }
            r7.write(r2)     // Catch:{ all -> 0x001e }
            r7 = 0
            goto L_0x0028
        L_0x001e:
            r2 = move-exception
            r5 = r0
            r0 = r4
            r4 = r5
            goto L_0x004f
        L_0x0023:
            r2 = move-exception
            r4 = r0
            r5 = r4
            goto L_0x004f
        L_0x0027:
            r4 = r0
        L_0x0028:
            if (r5 == 0) goto L_0x003e
            android.net.LocalSocket r5 = r3.accept()     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x003f
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch:{ all -> 0x0039 }
            r7.write(r2)     // Catch:{ all -> 0x0039 }
            r7 = 0
            goto L_0x003f
        L_0x0039:
            r2 = move-exception
            r1 = r0
            r0 = r4
            r4 = r1
            goto L_0x004f
        L_0x003e:
            r5 = r0
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            android.net.LocalSocket r0 = r3.accept()     // Catch:{ all -> 0x0039 }
            if (r7 == 0) goto L_0x005c
            java.io.OutputStream r6 = r0.getOutputStream()     // Catch:{ all -> 0x0039 }
            r6.write(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x005c
        L_0x004f:
            r3.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x005a, RuntimeException -> 0x0058 }
        L_0x0057:
            throw r2     // Catch:{ IOException -> 0x005a, RuntimeException -> 0x0058 }
        L_0x0058:
            r2 = move-exception
            goto L_0x008d
        L_0x005a:
            r2 = move-exception
            goto L_0x008d
        L_0x005c:
            r3.close()     // Catch:{ IOException -> 0x0065, RuntimeException -> 0x0060 }
            goto L_0x009d
        L_0x0060:
            r2 = move-exception
        L_0x0061:
            r1 = r0
            r0 = r4
            r4 = r1
            goto L_0x008d
        L_0x0065:
            r2 = move-exception
            goto L_0x0061
        L_0x0067:
            r2 = move-exception
        L_0x0068:
            r4 = r0
            r5 = r4
            goto L_0x008d
        L_0x006b:
            r2 = move-exception
            goto L_0x0068
        L_0x006d:
            if (r4 == 0) goto L_0x0075
            android.net.LocalSocket r3 = iiI1L1iI(r2)     // Catch:{ IOException -> 0x006b, RuntimeException -> 0x0067 }
            r4 = r3
            goto L_0x0076
        L_0x0075:
            r4 = r0
        L_0x0076:
            if (r5 == 0) goto L_0x0085
            android.net.LocalSocket r3 = iiI1L1iI(r2)     // Catch:{ IOException -> 0x0083, RuntimeException -> 0x007e }
            r5 = r3
            goto L_0x0086
        L_0x007e:
            r2 = move-exception
        L_0x007f:
            r5 = r0
            r0 = r4
            r4 = r5
            goto L_0x008d
        L_0x0083:
            r2 = move-exception
            goto L_0x007f
        L_0x0085:
            r5 = r0
        L_0x0086:
            if (r6 == 0) goto L_0x009d
            android.net.LocalSocket r0 = iiI1L1iI(r2)     // Catch:{ IOException -> 0x0065, RuntimeException -> 0x0060 }
            goto L_0x009d
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.close()
        L_0x0092:
            if (r5 == 0) goto L_0x0097
            r5.close()
        L_0x0097:
            if (r4 == 0) goto L_0x009c
            r4.close()
        L_0x009c:
            throw r2
        L_0x009d:
            top.tntok.autobot.OooO0oo r2 = new top.tntok.autobot.OooO0oo
            r2.<init>(r4, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0010OooO0oo.ilLIlL1ILi(int, boolean, boolean, boolean, boolean, boolean):top.tntok.autobot.OooO0oo");
    }

    public FileDescriptor I1LiILiLLIl1l() {
        return this.illlI1lLIL;
    }

    public void IIL1Ll1I111(String str) throws IOException {
        byte[] bArr = new byte[64];
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.arraycopy(bytes, 0, bArr, 0, C0390o0OOoOo.iiI1L1iI(bytes, 63));
        o00O000.iilLil1i11I1(i111iLiiIIill().getFileDescriptor(), bArr, 0, 64);
    }

    public void close() throws IOException {
        LocalSocket localSocket = this.i1LIL11l;
        if (localSocket != null) {
            localSocket.close();
        }
        LocalSocket localSocket2 = this.il1LilLllii;
        if (localSocket2 != null) {
            localSocket2.close();
        }
        LocalSocket localSocket3 = this.iilLil1i11I1;
        if (localSocket3 != null) {
            localSocket3.close();
        }
    }

    public final LocalSocket i111iLiiIIill() {
        LocalSocket localSocket = this.i1LIL11l;
        if (localSocket != null) {
            return localSocket;
        }
        LocalSocket localSocket2 = this.il1LilLllii;
        if (localSocket2 != null) {
            return localSocket2;
        }
        return this.iilLil1i11I1;
    }

    public FileDescriptor i1LIL11l() {
        return this.iiIliillii;
    }

    public i11ILLI1I il1LilLllii() {
        return this.I11lLL1;
    }

    public void ilIILlI1l11i() throws IOException {
        LocalSocket localSocket = this.i1LIL11l;
        if (localSocket != null) {
            localSocket.shutdownInput();
            this.i1LIL11l.shutdownOutput();
        }
        LocalSocket localSocket2 = this.il1LilLllii;
        if (localSocket2 != null) {
            localSocket2.shutdownInput();
            this.il1LilLllii.shutdownOutput();
        }
        LocalSocket localSocket3 = this.iilLil1i11I1;
        if (localSocket3 != null) {
            localSocket3.shutdownInput();
            this.iilLil1i11I1.shutdownOutput();
        }
    }
}
