package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0Oo0OOO  reason: case insensitive filesystem */
public class C0415o0Oo0OOO {
    public static String iiI1L1iI = C0387o0OOoO0o.iiI1L1iI("6VumeQ==\n", "2GmVTZx8TBY=\n");

    static {
        iiI1L1iI += C0387o0OOoO0o.iiI1L1iI("WA==\n", "bQx0Wa8/hIg=\n");
    }

    public static int i1LIL11l(int i, int i2) {
        return i + (i2 << 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2 = r1;
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0043, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC, Splitter:B:22:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003e A[SYNTHETIC, Splitter:B:30:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String iiI1L1iI(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0027 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0027 }
            int r3 = r1.available()     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            byte[] r0 = new byte[r3]     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            r1.read(r0)     // Catch:{ IOException -> 0x0013, all -> 0x0010 }
            goto L_0x0017
        L_0x0010:
            r3 = move-exception
            r0 = r1
            goto L_0x003c
        L_0x0013:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ FileNotFoundException -> 0x0020, all -> 0x0010 }
        L_0x0017:
            r1.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x0037
        L_0x001b:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0037
        L_0x0020:
            r3 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0029
        L_0x0025:
            r3 = move-exception
            goto L_0x003c
        L_0x0027:
            r3 = move-exception
            r1 = r0
        L_0x0029:
            r3.printStackTrace()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0036:
            r0 = r1
        L_0x0037:
            java.lang.String r3 = top.tntok.autobot.Ilili11iLIl.iiIliillii(r0)
            return r3
        L_0x003c:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0415o0Oo0OOO.iiI1L1iI(java.lang.String):java.lang.String");
    }

    public static void illlI1lLIL(String[] strArr) {
        System.out.println(iiI1L1iI);
    }
}
