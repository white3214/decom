package top.tntok.autobot;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o0OOOOo  reason: case insensitive filesystem */
public class C0357o0OOOOo {
    public static final String i1LIL11l = C0387o0OOoO0o.iiI1L1iI("CYo=\n", "euK2SxJlops=\n");
    public static final String iiI1L1iI = C0387o0OOoO0o.iiI1L1iI("BbM=\n", "dsbjNCs+2YU=\n");
    public static final long iiIliillii = 10;
    public static final String il1LilLllii = null;
    public static final String illlI1lLIL = C0387o0OOoO0o.iiI1L1iI("k4MChXk=\n", "9vtr8XOpBd8=\n");

    public C0357o0OOOOo() {
        throw new AssertionError();
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0151, code lost:
        if (r7 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0170, code lost:
        if (r7 == null) goto L_0x0173;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0145 A[Catch:{ IOException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x014a A[Catch:{ IOException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015c A[SYNTHETIC, Splitter:B:112:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0164 A[Catch:{ IOException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0169 A[Catch:{ IOException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0183 A[SYNTHETIC, Splitter:B:125:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018b A[Catch:{ IOException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0190 A[Catch:{ IOException -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0118 A[Catch:{ IOException -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120 A[Catch:{ IOException -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013d A[SYNTHETIC, Splitter:B:97:0x013d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:109:0x0157=Splitter:B:109:0x0157, B:94:0x0138=Splitter:B:94:0x0138} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static top.tntok.autobot.C0357o0OOOOo.iiI1L1iI I11lLL1(java.lang.String[] r15, boolean r16, boolean r17, long r18) {
        /*
            r0 = r15
            r1 = 0
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x000a
            r1 = 10
            goto L_0x000c
        L_0x000a:
            r1 = r18
        L_0x000c:
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L_0x019d
            int r5 = r0.length
            if (r5 != 0) goto L_0x0015
            goto L_0x019d
        L_0x0015:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Runtime r7 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0035, Exception -> 0x002f, all -> 0x0028 }
            if (r16 == 0) goto L_0x003b
            java.lang.String r8 = iiI1L1iI     // Catch:{ IOException -> 0x0035, Exception -> 0x002f, all -> 0x0028 }
            goto L_0x003d
        L_0x0028:
            r0 = move-exception
            r3 = r0
            r1 = r4
            r2 = r1
            r7 = r2
            goto L_0x0181
        L_0x002f:
            r0 = move-exception
            r1 = r4
            r2 = r1
            r7 = r2
            goto L_0x0138
        L_0x0035:
            r0 = move-exception
            r1 = r4
            r2 = r1
            r7 = r2
            goto L_0x0157
        L_0x003b:
            java.lang.String r8 = i1LIL11l     // Catch:{ IOException -> 0x0035, Exception -> 0x002f, all -> 0x0028 }
        L_0x003d:
            java.lang.Process r7 = r7.exec(r8)     // Catch:{ IOException -> 0x0035, Exception -> 0x002f, all -> 0x0028 }
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0134, Exception -> 0x0130, all -> 0x012b }
            java.io.OutputStream r9 = r7.getOutputStream()     // Catch:{ IOException -> 0x0134, Exception -> 0x0130, all -> 0x012b }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0134, Exception -> 0x0130, all -> 0x012b }
            int r9 = r0.length     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r10 = 0
        L_0x004c:
            java.lang.String r11 = "\n"
            if (r10 >= r9) goto L_0x008b
            r12 = r0[r10]     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            if (r12 != 0) goto L_0x0055
            goto L_0x0088
        L_0x0055:
            java.lang.String r13 = "CjIQcyc7\n"
            java.lang.String r14 = "aUZiHwxYw1U=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r14)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            boolean r13 = r13.equals(r12)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            if (r13 == 0) goto L_0x007b
            r12 = 3
            r8.write(r12)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            goto L_0x0082
        L_0x0068:
            r0 = move-exception
            r3 = r0
            r1 = r4
            r2 = r1
        L_0x006c:
            r4 = r8
            goto L_0x0181
        L_0x006f:
            r0 = move-exception
            r1 = r4
            r2 = r1
        L_0x0072:
            r4 = r8
            goto L_0x0138
        L_0x0075:
            r0 = move-exception
            r1 = r4
            r2 = r1
        L_0x0078:
            r4 = r8
            goto L_0x0157
        L_0x007b:
            byte[] r12 = r12.getBytes()     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r8.write(r12)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
        L_0x0082:
            r8.writeBytes(r11)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r8.flush()     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
        L_0x0088:
            int r10 = r10 + 1
            goto L_0x004c
        L_0x008b:
            java.lang.String r0 = illlI1lLIL     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r8.flush()     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            boolean r0 = iLLLILIiLi1Ii(r7, r0, r1)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            if (r0 == 0) goto L_0x0107
            int r3 = r7.exitValue()     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            if (r17 == 0) goto L_0x0105
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0101, Exception -> 0x00fd, all -> 0x00f8 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0101, Exception -> 0x00fd, all -> 0x00f8 }
            java.io.InputStream r9 = r7.getErrorStream()     // Catch:{ IOException -> 0x0101, Exception -> 0x00fd, all -> 0x00f8 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0101, Exception -> 0x00fd, all -> 0x00f8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0101, Exception -> 0x00fd, all -> 0x00f8 }
        L_0x00bd:
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            if (r0 == 0) goto L_0x00dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.<init>()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.append(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.append(r11)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r5.append(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            goto L_0x00bd
        L_0x00d6:
            r0 = move-exception
            r3 = r0
            goto L_0x006c
        L_0x00d9:
            r0 = move-exception
            goto L_0x0072
        L_0x00db:
            r0 = move-exception
            goto L_0x0078
        L_0x00dd:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            if (r0 == 0) goto L_0x00f6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.<init>()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.append(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r4.append(r11)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            r6.append(r0)     // Catch:{ IOException -> 0x00db, Exception -> 0x00d9, all -> 0x00d6 }
            goto L_0x00dd
        L_0x00f6:
            r4 = r1
            goto L_0x0113
        L_0x00f8:
            r0 = move-exception
            r3 = r0
            r2 = r4
            goto L_0x006c
        L_0x00fd:
            r0 = move-exception
            r2 = r4
            goto L_0x0072
        L_0x0101:
            r0 = move-exception
            r2 = r4
            goto L_0x0078
        L_0x0105:
            r2 = r4
            goto L_0x0113
        L_0x0107:
            java.lang.String r0 = "xCpvRCrEXZ+nRV8a\n"
            java.lang.String r1 = "IqPIrItItSk=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r1)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            r6.append(r0)     // Catch:{ IOException -> 0x0075, Exception -> 0x006f, all -> 0x0068 }
            goto L_0x0105
        L_0x0113:
            r8.close()     // Catch:{ IOException -> 0x011c }
            if (r4 == 0) goto L_0x011e
            r4.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x011e
        L_0x011c:
            r0 = move-exception
            goto L_0x0124
        L_0x011e:
            if (r2 == 0) goto L_0x0127
            r2.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0127
        L_0x0124:
            r0.printStackTrace()
        L_0x0127:
            r7.destroy()
            goto L_0x0173
        L_0x012b:
            r0 = move-exception
            r3 = r0
            r1 = r4
            r2 = r1
            goto L_0x0181
        L_0x0130:
            r0 = move-exception
            r1 = r4
            r2 = r1
            goto L_0x0138
        L_0x0134:
            r0 = move-exception
            r1 = r4
            r2 = r1
            goto L_0x0157
        L_0x0138:
            r0.printStackTrace()     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x0143
            r4.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x0143
        L_0x0141:
            r0 = move-exception
            goto L_0x014e
        L_0x0143:
            if (r1 == 0) goto L_0x0148
            r1.close()     // Catch:{ IOException -> 0x0141 }
        L_0x0148:
            if (r2 == 0) goto L_0x0151
            r2.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x0151
        L_0x014e:
            r0.printStackTrace()
        L_0x0151:
            if (r7 == 0) goto L_0x0173
            goto L_0x0127
        L_0x0154:
            r0 = move-exception
            r3 = r0
            goto L_0x0181
        L_0x0157:
            r0.printStackTrace()     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x0162
            r4.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0162
        L_0x0160:
            r0 = move-exception
            goto L_0x016d
        L_0x0162:
            if (r1 == 0) goto L_0x0167
            r1.close()     // Catch:{ IOException -> 0x0160 }
        L_0x0167:
            if (r2 == 0) goto L_0x0170
            r2.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0170
        L_0x016d:
            r0.printStackTrace()
        L_0x0170:
            if (r7 == 0) goto L_0x0173
            goto L_0x0127
        L_0x0173:
            top.tntok.autobot.o0OOOOo$iiI1L1iI r0 = new top.tntok.autobot.o0OOOOo$iiI1L1iI
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = r6.toString()
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0181:
            if (r4 == 0) goto L_0x0189
            r4.close()     // Catch:{ IOException -> 0x0187 }
            goto L_0x0189
        L_0x0187:
            r0 = move-exception
            goto L_0x0194
        L_0x0189:
            if (r1 == 0) goto L_0x018e
            r1.close()     // Catch:{ IOException -> 0x0187 }
        L_0x018e:
            if (r2 == 0) goto L_0x0197
            r2.close()     // Catch:{ IOException -> 0x0187 }
            goto L_0x0197
        L_0x0194:
            r0.printStackTrace()
        L_0x0197:
            if (r7 == 0) goto L_0x019c
            r7.destroy()
        L_0x019c:
            throw r3
        L_0x019d:
            top.tntok.autobot.o0OOOOo$iiI1L1iI r0 = new top.tntok.autobot.o0OOOOo$iiI1L1iI
            r0.<init>(r3, r4, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0357o0OOOOo.I11lLL1(java.lang.String[], boolean, boolean, long):top.tntok.autobot.o0OOOOo$iiI1L1iI");
    }

    public static iiI1L1iI i1LIL11l(String str, boolean z, long j) {
        return I11lLL1(new String[]{str}, z, true, j);
    }

    public static boolean iLLLILIiLi1Ii(Process process, TimeUnit timeUnit, long j) throws InterruptedException {
        long nanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100));
                }
                nanos = timeUnit.toNanos(j) - (System.nanoTime() - nanoTime);
                if (nanos <= 0) {
                    return false;
                }
            }
        } while (nanos <= 0);
        return false;
    }

    public static boolean iiI1L1iI() {
        if (illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("ejKkQCDkyOtr\n", "H1HMLwCWp4Q=\n"), true, false, 1).iiI1L1iI == 0) {
            return true;
        }
        return false;
    }

    public static iiI1L1iI iiIliillii(List<String> list, boolean z, boolean z2, long j) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return I11lLL1(strArr, z, z2, j);
    }

    public static iiI1L1iI iilLil1i11I1(String[] strArr, boolean z, long j) {
        return I11lLL1(strArr, z, true, j);
    }

    public static iiI1L1iI il1LilLllii(List<String> list, boolean z, long j) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return I11lLL1(strArr, z, true, j);
    }

    public static iiI1L1iI illlI1lLIL(String str, boolean z, boolean z2, long j) {
        return I11lLL1(new String[]{str}, z, z2, j);
    }

    /* renamed from: top.tntok.autobot.o0OOOOo$iiI1L1iI */
    public static class iiI1L1iI {
        public String i1LIL11l;
        public int iiI1L1iI;
        public String illlI1lLIL;

        public iiI1L1iI(int i) {
            this.iiI1L1iI = i;
        }

        public iiI1L1iI(int i, String str, String str2) {
            this.iiI1L1iI = i;
            this.i1LIL11l = str.trim();
            this.illlI1lLIL = str2.trim();
        }
    }
}
