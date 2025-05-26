package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

@Deprecated
public class o0000O {
    public static final int I11lLL1;
    public static final int i1LIL11l = -1;
    public static final String iLLLILIiLi1Ii;
    public static final o0000O iiI1L1iI = new o0000O();
    public static final int iiIliillii = 2;
    public static final int iilLil1i11I1 = 3;
    public static final int il1LilLllii = 1;
    public static final int illlI1lLIL = 0;

    static {
        int i;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property != null) {
                String lowerCase = property.toLowerCase(Locale.ENGLISH);
                if (lowerCase.contains("windows")) {
                    i = 1;
                } else {
                    if (!lowerCase.contains("linux") && !lowerCase.contains("mpe/ix") && !lowerCase.contains("freebsd") && !lowerCase.contains("openbsd") && !lowerCase.contains("irix") && !lowerCase.contains("digital unix") && !lowerCase.contains("unix")) {
                        if (!lowerCase.contains("mac os x")) {
                            if (!lowerCase.contains("sun os") && !lowerCase.contains("sunos")) {
                                if (!lowerCase.contains("solaris")) {
                                    if (!lowerCase.contains("hp-ux")) {
                                        if (!lowerCase.contains("aix")) {
                                            i = 0;
                                        }
                                    }
                                    i = 3;
                                }
                            }
                            str = "/usr/xpg4/bin/df";
                            i = 3;
                        }
                    }
                    i = 2;
                }
                I11lLL1 = i;
                iLLLILIiLi1Ii = str;
                return;
            }
            throw new IOException("os.name not found");
        } catch (Exception unused) {
            i = -1;
        }
    }

    @Deprecated
    public static long i1LIL11l() throws IOException {
        return illlI1lLIL(-1);
    }

    @Deprecated
    public static long iiI1L1iI(String str) throws IOException {
        return iiI1L1iI.iilLil1i11I1(str, I11lLL1, false, -1);
    }

    @Deprecated
    public static long iiIliillii(String str, long j) throws IOException {
        return iiI1L1iI.iilLil1i11I1(str, I11lLL1, true, j);
    }

    @Deprecated
    public static long il1LilLllii(String str) throws IOException {
        return iiIliillii(str, -1);
    }

    @Deprecated
    public static long illlI1lLIL(long j) throws IOException {
        return iiIliillii(new File(".").getAbsolutePath(), j);
    }

    public long I11lLL1(String str, boolean z, boolean z2, long j) throws IOException {
        if (!str.isEmpty()) {
            String str2 = "-";
            if (z) {
                str2 = str2 + "k";
            }
            if (z2) {
                str2 = str2 + "P";
            }
            List<String> iILiI1lll = iILiI1lll(str2.length() > 1 ? new String[]{iLLLILIiLi1Ii, str2, str} : new String[]{iLLLILIiLi1Ii, str}, 3, j);
            if (iILiI1lll.size() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(iILiI1lll.get(1), " ");
                if (stringTokenizer.countTokens() >= 4) {
                    stringTokenizer.nextToken();
                } else if (stringTokenizer.countTokens() != 1 || iILiI1lll.size() < 3) {
                    throw new IOException("Command line '" + iLLLILIiLi1Ii + "' did not return data as expected for path '" + str + "'- check path is valid");
                } else {
                    stringTokenizer = new StringTokenizer(iILiI1lll.get(2), " ");
                }
                stringTokenizer.nextToken();
                stringTokenizer.nextToken();
                return iilLiIIIi11i(stringTokenizer.nextToken(), str);
            }
            throw new IOException("Command line '" + iLLLILIiLi1Ii + "' did not return info as expected for path '" + str + "'- response was " + iILiI1lll);
        }
        throw new IllegalArgumentException("Path must not be empty");
    }

    public Process IiIIlIL(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    public long IiiL1llIIi(String str, String str2) throws IOException {
        int i;
        int i2;
        int i3;
        int length = str.length();
        while (true) {
            length--;
            i = 0;
            if (length < 0) {
                i2 = 0;
                break;
            } else if (Character.isDigit(str.charAt(length))) {
                i2 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i3 = 0;
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i3 = length + 1;
                break;
            }
            length--;
        }
        if (length >= 0) {
            StringBuilder sb = new StringBuilder(str.substring(i3, i2));
            while (i < sb.length()) {
                if (sb.charAt(i) == ',' || sb.charAt(i) == '.') {
                    sb.deleteCharAt(i);
                    i--;
                }
                i++;
            }
            return iilLiIIIi11i(sb.toString(), str2);
        }
        throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> iILiI1lll(java.lang.String[] r11, int r12, long r13) throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            java.lang.Thread r2 = top.tntok.autobot.o0OoO.i1LIL11l(r13)     // Catch:{ InterruptedException -> 0x00f4, all -> 0x00f0 }
            java.lang.Process r3 = r10.IiIIlIL(r11)     // Catch:{ InterruptedException -> 0x00f4, all -> 0x00f0 }
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ InterruptedException -> 0x00ec, all -> 0x00e7 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ InterruptedException -> 0x00e3, all -> 0x00df }
            java.io.InputStream r6 = r3.getErrorStream()     // Catch:{ InterruptedException -> 0x00da, all -> 0x00d5 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            java.nio.charset.Charset r9 = java.nio.charset.Charset.defaultCharset()     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            r8.<init>(r4, r9)     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            java.lang.String r8 = r7.readLine()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
        L_0x002e:
            if (r8 == 0) goto L_0x0050
            int r9 = r0.size()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            if (r9 >= r12) goto L_0x0050
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r8 = r8.trim()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.add(r8)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r8 = r7.readLine()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            goto L_0x002e
        L_0x0048:
            r11 = move-exception
        L_0x0049:
            r1 = r4
            goto L_0x0120
        L_0x004c:
            r12 = move-exception
        L_0x004d:
            r1 = r3
            goto L_0x00f9
        L_0x0050:
            r3.waitFor()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            top.tntok.autobot.o0OoO.il1LilLllii(r2)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            int r12 = r3.exitValue()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            if (r12 != 0) goto L_0x00ae
            boolean r12 = r0.isEmpty()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            if (r12 != 0) goto L_0x0093
            r7.close()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r4.close()     // Catch:{ InterruptedException -> 0x0090, all -> 0x008d }
            if (r5 == 0) goto L_0x0077
            r5.close()     // Catch:{ InterruptedException -> 0x0073, all -> 0x006f }
            r5 = r1
            goto L_0x0077
        L_0x006f:
            r11 = move-exception
            r7 = r1
            goto L_0x0120
        L_0x0073:
            r12 = move-exception
            r4 = r1
            r7 = r4
            goto L_0x004d
        L_0x0077:
            if (r6 == 0) goto L_0x007d
            r6.close()     // Catch:{ InterruptedException -> 0x0073, all -> 0x006f }
            r6 = r1
        L_0x007d:
            top.tntok.autobot.C0130o00O0o00.IL1lILLLL1L(r1)
            top.tntok.autobot.C0130o00O0o00.iL1LIlIlI(r5)
            top.tntok.autobot.C0130o00O0o00.IL1lILLLL1L(r6)
            top.tntok.autobot.C0130o00O0o00.i111iLiiIIill(r1)
            r3.destroy()
            return r0
        L_0x008d:
            r11 = move-exception
            r7 = r1
            goto L_0x0049
        L_0x0090:
            r12 = move-exception
            r7 = r1
            goto L_0x004d
        L_0x0093:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r1 = "Command line did not return any info for command "
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.util.List r1 = java.util.Arrays.asList(r11)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r12.<init>(r0)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            throw r12     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
        L_0x00ae:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r1 = "Command line returned OS error code '"
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            int r1 = r3.exitValue()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r1 = "' for command "
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.util.List r1 = java.util.Arrays.asList(r11)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r0.append(r1)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            r12.<init>(r0)     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
            throw r12     // Catch:{ InterruptedException -> 0x004c, all -> 0x0048 }
        L_0x00d5:
            r11 = move-exception
            r6 = r1
        L_0x00d7:
            r7 = r6
            goto L_0x0049
        L_0x00da:
            r12 = move-exception
            r6 = r1
        L_0x00dc:
            r7 = r6
            goto L_0x004d
        L_0x00df:
            r11 = move-exception
            r5 = r1
            r6 = r5
            goto L_0x00d7
        L_0x00e3:
            r12 = move-exception
            r5 = r1
        L_0x00e5:
            r6 = r5
            goto L_0x00dc
        L_0x00e7:
            r11 = move-exception
            r5 = r1
        L_0x00e9:
            r6 = r5
            r7 = r6
            goto L_0x0120
        L_0x00ec:
            r12 = move-exception
            r4 = r1
            r5 = r4
            goto L_0x00e5
        L_0x00f0:
            r11 = move-exception
            r3 = r1
            r5 = r3
            goto L_0x00e9
        L_0x00f4:
            r12 = move-exception
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00f9:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            r2.<init>()     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "Command line threw an InterruptedException for command "
            r2.append(r3)     // Catch:{ all -> 0x011c }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ all -> 0x011c }
            r2.append(r11)     // Catch:{ all -> 0x011c }
            java.lang.String r11 = " timeout="
            r2.append(r11)     // Catch:{ all -> 0x011c }
            r2.append(r13)     // Catch:{ all -> 0x011c }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x011c }
            r0.<init>(r11, r12)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r11 = move-exception
            r3 = r1
            goto L_0x0049
        L_0x0120:
            top.tntok.autobot.C0130o00O0o00.IL1lILLLL1L(r1)
            top.tntok.autobot.C0130o00O0o00.iL1LIlIlI(r5)
            top.tntok.autobot.C0130o00O0o00.IL1lILLLL1L(r6)
            top.tntok.autobot.C0130o00O0o00.i111iLiiIIill(r7)
            if (r3 == 0) goto L_0x0131
            r3.destroy()
        L_0x0131:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o0000O.iILiI1lll(java.lang.String[], int, long):java.util.List");
    }

    public long iLLLILIiLi1Ii(String str, long j) throws IOException {
        String IIIlll1lll = C0089o000Ooo.IIIlll1lll(str, false);
        if (IIIlll1lll != null) {
            if (IIIlll1lll.length() > 0 && IIIlll1lll.charAt(0) != '\"') {
                IIIlll1lll = "\"" + IIIlll1lll + "\"";
            }
            List<String> iILiI1lll = iILiI1lll(new String[]{"cmd.exe", "/C", "dir /a /-c " + IIIlll1lll}, Integer.MAX_VALUE, j);
            for (int size = iILiI1lll.size() + -1; size >= 0; size--) {
                String str2 = iILiI1lll.get(size);
                if (str2.length() > 0) {
                    return IiiL1llIIi(str2, IIIlll1lll);
                }
            }
            throw new IOException("Command line 'dir /-c' did not return any info for path '" + IIIlll1lll + "'");
        }
        throw new IllegalArgumentException(str);
    }

    public long iilLiIIIi11i(String str, String str2) throws IOException {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new IOException("Command line '" + iLLLILIiLi1Ii + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e) {
            throw new IOException("Command line '" + iLLLILIiLi1Ii + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e);
        }
    }

    public long iilLil1i11I1(String str, int i, boolean z, long j) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        } else if (i == 0) {
            throw new IllegalStateException("Unsupported operating system");
        } else if (i == 1) {
            long iLLLILIiLi1Ii2 = iLLLILIiLi1Ii(str, j);
            if (z) {
                return iLLLILIiLi1Ii2 / C0086o000OoO.iiI1L1iI;
            }
            return iLLLILIiLi1Ii2;
        } else if (i == 2) {
            return I11lLL1(str, z, false, j);
        } else {
            if (i == 3) {
                return I11lLL1(str, z, true, j);
            }
            throw new IllegalStateException("Exception caught when determining operating system");
        }
    }
}
