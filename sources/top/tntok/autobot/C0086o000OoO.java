package top.tntok.autobot;

import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.zip.CRC32;
import top.tntok.autobot.ILL1lL1lI;

/* renamed from: top.tntok.autobot.o000OoO  reason: case insensitive filesystem */
public class C0086o000OoO {
    public static final long I11lLL1 = 1099511627776L;
    public static final BigInteger I1iIiIi;
    public static final File[] IL1lILLLL1L = new File[0];
    public static final long IiIIlIL = 1125899906842624L;
    public static final long IiiL1llIIi = 1152921504606846976L;
    public static final BigInteger i1L1lLllLLlIi;
    public static final BigInteger i1LIL11l;
    public static final BigInteger iILiI1lll;
    public static final BigInteger iLLLILIiLi1Ii;
    public static final long iiI1L1iI = 1024;
    public static final long iiIliillii = 1073741824;
    public static final BigInteger iilLiIIIi11i;
    public static final BigInteger iilLil1i11I1;
    public static final BigInteger il1LilLllii;
    public static final long illlI1lLIL = 1048576;

    static {
        BigInteger valueOf = BigInteger.valueOf(iiI1L1iI);
        i1LIL11l = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        il1LilLllii = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        iilLil1i11I1 = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        iLLLILIiLi1Ii = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        iilLiIIIi11i = multiply4;
        iILiI1lll = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(iiI1L1iI).multiply(BigInteger.valueOf(IiiL1llIIi));
        I1iIiIi = multiply5;
        i1L1lLllLLlIi = valueOf.multiply(multiply5);
    }

    public static FileOutputStream I11iLiiIi(File file) throws IOException {
        return i1LlL1iILLLil(file, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.zip.Checksum I11lLL1(java.io.File r2, java.util.zip.Checksum r3) throws java.io.IOException {
        /*
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L_0x0023
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            top.tntok.autobot.C0130o00O0o00.i1iiLIil1ILi(r0)     // Catch:{ all -> 0x0017 }
            r0.close()
            return r3
        L_0x0017:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0022:
            throw r3
        L_0x0023:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Checksums can't be computed on directories"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.I11lLL1(java.io.File, java.util.zip.Checksum):java.util.zip.Checksum");
    }

    public static BigInteger I11lLL1L11Lil(File file) {
        if (file.isDirectory()) {
            return iLliII11iI(file);
        }
        return BigInteger.valueOf(file.length());
    }

    public static void I1I11Il1(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            i11liIIl11Ii1(file, file2);
        } else if (file.isDirectory()) {
            IilL11ii1I1Il(file, file2);
        } else {
            throw new IOException("The source " + file + " does not exist");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r3.position() > 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r3.flip();
        r2.append(java.nio.charset.StandardCharsets.UTF_8.decode(r3).toString());
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r3.flip();
        r2.append(java.nio.charset.StandardCharsets.UTF_8.decode(r3).toString());
        r3.clear();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[ExcHandler: all (r8v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String I1IIIi1i1ILl(java.lang.String r8) {
        /*
            if (r8 == 0) goto L_0x00a2
            r0 = 37
            int r1 = r8.indexOf(r0)
            if (r1 < 0) goto L_0x00a2
            int r1 = r8.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r1)
            r4 = 0
        L_0x0018:
            if (r4 >= r1) goto L_0x009e
            char r5 = r8.charAt(r4)
            if (r5 != r0) goto L_0x0092
        L_0x0020:
            int r5 = r4 + 1
            int r6 = r4 + 3
            java.lang.String r5 = r8.substring(r5, r6)     // Catch:{ RuntimeException -> 0x005d, all -> 0x003d }
            r7 = 16
            int r5 = java.lang.Integer.parseInt(r5, r7)     // Catch:{ RuntimeException -> 0x005d, all -> 0x003d }
            byte r5 = (byte) r5     // Catch:{ RuntimeException -> 0x005d, all -> 0x003d }
            r3.put(r5)     // Catch:{ RuntimeException -> 0x005d, all -> 0x003d }
            if (r6 >= r1) goto L_0x0042
            char r4 = r8.charAt(r6)     // Catch:{ RuntimeException -> 0x003f, all -> 0x003d }
            if (r4 == r0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            r4 = r6
            goto L_0x0020
        L_0x003d:
            r8 = move-exception
            goto L_0x005f
        L_0x003f:
            r4 = r6
            goto L_0x0079
        L_0x0042:
            int r4 = r3.position()
            if (r4 <= 0) goto L_0x005b
            r3.flip()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r4 = r4.decode(r3)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r3.clear()
        L_0x005b:
            r4 = r6
            goto L_0x0018
        L_0x005d:
            goto L_0x0079
        L_0x005f:
            int r0 = r3.position()
            if (r0 <= 0) goto L_0x0078
            r3.flip()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r0 = r0.decode(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            r3.clear()
        L_0x0078:
            throw r8
        L_0x0079:
            int r5 = r3.position()
            if (r5 <= 0) goto L_0x0092
            r3.flip()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r5 = r5.decode(r3)
            java.lang.String r5 = r5.toString()
            r2.append(r5)
            r3.clear()
        L_0x0092:
            int r5 = r4 + 1
            char r4 = r8.charAt(r4)
            r2.append(r4)
            r4 = r5
            goto L_0x0018
        L_0x009e:
            java.lang.String r8 = r2.toString()
        L_0x00a2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.I1IIIi1i1ILl(java.lang.String):java.lang.String");
    }

    public static C0160o00Oo0oo I1IILIil1lLlL(File file, String str) throws IOException {
        try {
            return C0130o00O0o00.IiIl11II(iLlI1iL1lIIL(file), str);
        } catch (IOException | RuntimeException e) {
            C0130o00O0o00.i1L1lLllLLlIi((Closeable) null, new o000O000(e));
            throw e;
        }
    }

    public static byte[] I1ILilil1I(File file) throws IOException {
        byte[] bArr;
        FileInputStream iLlI1iL1lIIL = iLlI1iL1lIIL(file);
        try {
            long length = file.length();
            if (length > 0) {
                bArr = C0130o00O0o00.i1LlL1iILLLil(iLlI1iL1lIIL, length);
            } else {
                bArr = C0130o00O0o00.iLlI1iL1lIIL(iLlI1iL1lIIL);
            }
            if (iLlI1iL1lIIL != null) {
                iLlI1iL1lIIL.close();
            }
            return bArr;
        } catch (Throwable th) {
            if (iLlI1iL1lIIL != null) {
                try {
                    iLlI1iL1lIIL.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean I1Ii1ILliII(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return IIlllIIi1ii(file, chronoLocalDate.atTime(localTime));
    }

    public static void I1LIi1ii1l(File file, byte[] bArr, int i, int i2) throws IOException {
        I1lilLill1I(file, bArr, i, i2, false);
    }

    public static boolean I1LiILiLLIl1l(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return iLiI1Llil(file, instant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static boolean I1LiliILi1lI1(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return IillLillLLIii(file, instant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static boolean I1i1iiiI(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return I1LiliILi1lI1(file, chronoZonedDateTime.toInstant());
    }

    public static File[] I1iIiIi(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long I1l1iIll1lIi1(java.io.File r1, java.io.OutputStream r2) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            long r1 = top.tntok.autobot.C0130o00O0o00.iliilLllIl1(r0, r2)     // Catch:{ all -> 0x000d }
            r0.close()
            return r1
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0018:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.I1l1iIll1lIi1(java.io.File, java.io.OutputStream):long");
    }

    public static void I1lLI1lLiLL(File file, String str, Charset charset) throws IOException {
        IiLlIiL1IlIlI(file, str, charset, false);
    }

    public static Iterator<File> I1lLLLlliILlI(File file, o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        return ilLIlLiIILl1(file, o00o00o0, o00o00o02).iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void I1lilLill1I(java.io.File r0, byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException {
        /*
            java.io.FileOutputStream r0 = i1LlL1iILLLil(r0, r4)
            r0.write(r1, r2, r3)     // Catch:{ all -> 0x000b }
            r0.close()
            return
        L_0x000b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000d }
        L_0x000d:
            r2 = move-exception
            if (r0 == 0) goto L_0x0018
            r0.close()     // Catch:{ all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0018:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.I1lilLill1I(java.io.File, byte[], int, int, boolean):void");
    }

    public static void I1llIillii1(File file, File file2, boolean z) throws IOException {
        ILL1iL1LiiI(file, file2);
        if (file.isDirectory()) {
            i11iLLllliI(file, file2, z);
        } else {
            IIlLLll1ll1(file, file2, z);
        }
    }

    public static void II1l1IliI1Li1(File file, File file2) throws IOException {
        ILL1iL1LiiI(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        } else if (file2.exists()) {
            throw new o000000O("Destination '" + file2 + "' already exists");
        } else if (!file.renameTo(file2)) {
            String canonicalPath = file2.getCanonicalPath();
            if (!canonicalPath.startsWith(file.getCanonicalPath() + File.separator)) {
                i1L1lLllLLlIi(file, file2);
                IilliIIIlI1ll(file);
                if (file.exists()) {
                    throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
                }
                return;
            }
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
    }

    public static void IIIlIlILLI1iL(File file, Collection<?> collection) throws IOException {
        iLII1iIiLLL1(file, (String) null, collection, (String) null, false);
    }

    public static void IIIlll1lll(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (!ilIILlI1l11i(file)) {
                iilLiIIIi11i(file);
            }
        }
    }

    public static boolean IIL1Ll1I111(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return iLiI1Llil(file, date.getTime());
    }

    public static boolean IILiIL1i11Li(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        } else if (file2 != null && file.exists() && file2.exists()) {
            return C0089o000Ooo.i1LIL11l(file.getCanonicalPath(), file2.getCanonicalPath());
        } else {
            return false;
        }
    }

    public static File IIi1l1i(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            i++;
            file = new File(file, strArr[i]);
        }
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r1.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r2 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void IIlL1llI1(java.io.InputStream r1, java.io.File r2) throws java.io.IOException {
        /*
            java.io.FileOutputStream r2 = I11iLiiIi(r2)
            top.tntok.autobot.C0130o00O0o00.I1I11Il1(r1, r2)     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x000c
            r2.close()
        L_0x000c:
            return
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            if (r2 == 0) goto L_0x001a
            r2.close()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r2 = move-exception
            r1.addSuppressed(r2)
        L_0x001a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IIlL1llI1(java.io.InputStream, java.io.File):void");
    }

    public static void IIlLLll1ll1(File file, File file2, boolean z) throws IOException {
        ILL1iL1LiiI(file, file2);
        if (!file2.exists() && z && !file2.mkdirs()) {
            throw new IOException("Could not create destination directories '" + file2 + "'");
        } else if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        } else if (file2.isDirectory()) {
            ilLilIL(file, new File(file2, file.getName()));
        } else {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
    }

    public static void IIlLill(File file, File file2, FileFilter fileFilter, boolean z, List<String> list, CopyOption... copyOptionArr) throws IOException {
        File[] fileArr;
        if (fileFilter == null) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(fileFilter);
        }
        if (fileArr != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Destination '" + file2 + "' exists but is not a directory");
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' directory cannot be created");
            }
            if (file2.canWrite()) {
                for (File file3 : fileArr) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            IIlLill(file3, file4, fileFilter, z, list, copyOptionArr);
                        } else {
                            iliilLllIl1(file3, file4, z, copyOptionArr);
                        }
                    }
                }
                if (z) {
                    il11iII1(file, file2);
                    return;
                }
                return;
            }
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        throw new IOException("Failed to list contents of " + file);
    }

    public static void IIli11LiiIl(File file, Collection<?> collection, boolean z) throws IOException {
        iLII1iIiLLL1(file, (String) null, collection, (String) null, z);
    }

    public static void IIll1lIL(File file, Collection<?> collection, String str) throws IOException {
        iLII1iIiLLL1(file, (String) null, collection, str, false);
    }

    public static boolean IIlllIIi1ii(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return IllLlI1IiIL(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static File IIllllLiIlIl(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r1 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void IL111l1(java.net.URL r1, java.io.File r2) throws java.io.IOException {
        /*
            java.io.InputStream r1 = r1.openStream()
            IliiLiLliIl(r1, r2)     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            return
        L_0x000d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x001a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IL111l1(java.net.URL, java.io.File):void");
    }

    public static Iterator<File> IL11lll11(File file, o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        return i1L1llI1LlL1l(file, o00o00o0, o00o00o02).iterator();
    }

    public static void IL1IiLI(File file, String str, Collection<?> collection, boolean z) throws IOException {
        iLII1iIiLLL1(file, str, collection, (String) null, z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(1:6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean IL1IiilLlLI(java.io.File r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r2.isDirectory()     // Catch:{ Exception -> 0x000d }
            if (r1 == 0) goto L_0x000d
            IiIIlIL(r2)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            boolean r2 = r2.delete()     // Catch:{ Exception -> 0x0012 }
            return r2
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IL1IiilLlLI(java.io.File):boolean");
    }

    public static void IL1lILLLL1L(File file, File file2, FileFilter fileFilter) throws IOException {
        iL1LIlIlI(file, file2, fileFilter, true);
    }

    public static long ILI1Iil1li(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        long j = 0;
        for (File file2 : listFiles) {
            if (!ilIILlI1l11i(file2)) {
                j += iillllIL(file2);
                if (j < 0) {
                    break;
                }
            }
        }
        return j;
    }

    public static Collection<File> ILIiLLLL1iiii(File file, String[] strArr, boolean z) {
        o00O00o0 o00o00o0;
        o00O00o0 o00o00o02;
        if (strArr == null) {
            o00o00o0 = C0453o0OoOo0O.illlI1lLIL;
        } else {
            o00o00o0 = new C0394o0OOoo0O(iIiiI1IILilLl(strArr));
        }
        if (z) {
            o00o00o02 = C0453o0OoOo0O.illlI1lLIL;
        } else {
            o00o00o02 = C0224o00oO0O.illlI1lLIL;
        }
        return ilLIlLiIILl1(file, o00o00o0, o00o00o02);
    }

    public static void ILL1iL1LiiI(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "destination");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    public static void ILLL1LlLLilL(File file, byte[] bArr, boolean z) throws IOException {
        I1lilLill1I(file, bArr, 0, bArr.length, z);
    }

    public static void ILiIL1Lll(File file, String str, String str2) throws IOException {
        ilLlL1i1L(file, str, str2, false);
    }

    public static String ILiLII1ILi() {
        return System.getProperty("user.home");
    }

    public static boolean ILiliIiI(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return IillLillLLIii(file, date.getTime());
    }

    public static void ILl1iII11Ll1(File file, File file2, boolean z) throws IOException {
        i1iiLIil1ILi(file, file2, z, StandardCopyOption.REPLACE_EXISTING);
    }

    @Deprecated
    public static void ILlI1I1Ill1IL(File file, String str, boolean z) throws IOException {
        IiLlIiL1IlIlI(file, str, Charset.defaultCharset(), z);
    }

    public static void ILllI11(File file) throws IOException {
        if (file.isDirectory()) {
            IIIlll1lll(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void Ii1lLiiIli(File file, CharSequence charSequence, String str, boolean z) throws IOException {
        ili11iILI1l(file, charSequence, iIiiLi1LllI.i1LIL11l(str), z);
    }

    public static void Ii1liIIIiLi(File file, File file2, boolean z) throws IOException {
        iL1LIlIlI(file, file2, (FileFilter) null, z);
    }

    public static void IiIIlIL(File file) throws IOException {
        File[] i1iliILILi = i1iliILILi(file);
        ArrayList arrayList = new ArrayList();
        for (File illiiliIILI : i1iliILILi) {
            try {
                illiiliIILI(illiiliIILI);
            } catch (IOException e) {
                arrayList.add(e);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public static void IiILIlLLiIL(File file) throws IOException {
        if (!file.exists()) {
            I11iLiiIi(file).close();
        }
        if (!file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to set the last modification time for " + file);
        }
    }

    public static URL[] IiIiilIiL1iLi(File... fileArr) throws IOException {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i = 0; i < length; i++) {
            urlArr[i] = fileArr[i].toURI().toURL();
        }
        return urlArr;
    }

    public static Collection<File> IiIl11II(File file, o00O00o0 o00o00o0, o00O00o0 o00o00o02, boolean z) {
        Iiii1LiI11i(file, o00o00o0);
        o00O00o0 iLLi1LIi = iLLi1LIi(o00o00o0);
        o00O00o0 iliiI1Ii1iIl = iliiI1Ii1iIl(o00o00o02);
        LinkedList linkedList = new LinkedList();
        if (z) {
            linkedList.add(file);
        }
        Il1llillili(linkedList, file, o00000.I1IIIi1i1ILl(iLLi1LIi, iliiI1Ii1iIl), z);
        return linkedList;
    }

    @Deprecated
    public static String IiL1llLiil1(File file) throws IOException {
        return i1IL1lILl1L1I(file, Charset.defaultCharset());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void IiLlIiL1IlIlI(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, boolean r3) throws java.io.IOException {
        /*
            java.io.FileOutputStream r0 = i1LlL1iILLLil(r0, r3)
            top.tntok.autobot.C0130o00O0o00.I1lilLill1I(r1, r0, r2)     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000c
            r0.close()
        L_0x000c:
            return
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            if (r0 == 0) goto L_0x001a
            r0.close()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x001a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IiLlIiL1IlIlI(java.io.File, java.lang.String, java.nio.charset.Charset, boolean):void");
    }

    public static boolean IiiIIil1l(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return iLIIl1IliLlLI(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static File IiiIlLl1il1i() {
        return new File(iLlIllll());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0064, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0069, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r8.addSuppressed(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0075, code lost:
        r7.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean IiiL1llIIi(java.io.File r7, java.io.File r8) throws java.io.IOException {
        /*
            r0 = 1
            if (r7 != 0) goto L_0x0006
            if (r8 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r7 != 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r8 != 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r7.exists()
            boolean r3 = r8.exists()
            if (r2 == r3) goto L_0x0020
            return r1
        L_0x0020:
            if (r2 != 0) goto L_0x0023
            return r0
        L_0x0023:
            boolean r2 = r7.isDirectory()
            if (r2 != 0) goto L_0x0079
            boolean r2 = r8.isDirectory()
            if (r2 != 0) goto L_0x0079
            long r2 = r7.length()
            long r4 = r8.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x003c
            return r1
        L_0x003c:
            java.io.File r1 = r7.getCanonicalFile()
            java.io.File r2 = r8.getCanonicalFile()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            return r0
        L_0x004b:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0060 }
            r7.<init>(r8)     // Catch:{ all -> 0x0060 }
            boolean r8 = top.tntok.autobot.C0130o00O0o00.i11liIIl11Ii1(r0, r7)     // Catch:{ all -> 0x0062 }
            r7.close()     // Catch:{ all -> 0x0060 }
            r0.close()
            return r8
        L_0x0060:
            r7 = move-exception
            goto L_0x006e
        L_0x0062:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ all -> 0x0060 }
        L_0x006d:
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x006e:
            throw r7     // Catch:{ all -> 0x006f }
        L_0x006f:
            r8 = move-exception
            r0.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r0 = move-exception
            r7.addSuppressed(r0)
        L_0x0078:
            throw r8
        L_0x0079:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Can't compare directories, only files"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IiiL1llIIi(java.io.File, java.io.File):boolean");
    }

    public static void Iiii1LiI11i(File file, o00O00o0 o00o00o0) {
        if (file.isDirectory()) {
            Objects.requireNonNull(o00o00o0, "fileFilter");
            return;
        }
        throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + file);
    }

    public static boolean Iiiiii1l1I1L1(File file, File file2) {
        Objects.requireNonNull(file2, "reference");
        if (file2.exists()) {
            return IillLillLLIii(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    public static void IilL11ii1I1Il(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceDir");
        if (!file.exists() || file.isDirectory()) {
            Objects.requireNonNull(file2, "destinationDir");
            if (!file2.exists() || file2.isDirectory()) {
                Ii1liIIIiLi(file, new File(file2, file.getName()), true);
                return;
            }
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        throw new IllegalArgumentException("Source '" + file + "' is not a directory");
    }

    public static boolean IillLI1llIL1(File file, int i) {
        long currentTimeMillis = System.currentTimeMillis() + (((long) i) * 1000);
        boolean z = false;
        while (!file.exists()) {
            try {
                long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                if (currentTimeMillis2 < 0) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
                try {
                    Thread.sleep(Math.min(100, currentTimeMillis2));
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Exception unused2) {
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    public static boolean IillLillLLIii(File file, long j) {
        Objects.requireNonNull(file, "file");
        if (file.exists() && file.lastModified() > j) {
            return true;
        }
        return false;
    }

    public static void IilliIIIlI1ll(File file) throws IOException {
        if (file.exists()) {
            if (!ilIILlI1l11i(file)) {
                IiIIlIL(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    public static void Il1llillili(Collection<File> collection, File file, o00O00o0 o00o00o0, boolean z) {
        File[] listFiles = file.listFiles(o00o00o0);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    Il1llillili(collection, file2, o00o00o0, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> IlLLlIi1iI1li(java.io.File r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            java.io.FileInputStream r1 = iLlI1iL1lIIL(r1)
            java.nio.charset.Charset r2 = top.tntok.autobot.iIiiLi1LllI.illlI1lLIL(r2)     // Catch:{ all -> 0x0012 }
            java.util.List r2 = top.tntok.autobot.C0130o00O0o00.IllLlI1IiIL(r1, r2)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0011
            r1.close()
        L_0x0011:
            return r2
        L_0x0012:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IlLLlIi1iI1li(java.io.File, java.nio.charset.Charset):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        if (r1 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void IliiLiLliIl(java.io.InputStream r1, java.io.File r2) throws java.io.IOException {
        /*
            IIlL1llI1(r1, r2)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0008
            r1.close()
        L_0x0008:
            return
        L_0x0009:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0016
            r1.close()     // Catch:{ all -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x0016:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.IliiLiLliIl(java.io.InputStream, java.io.File):void");
    }

    @Deprecated
    public static List<String> Ilili11iLIl(File file) throws IOException {
        return IlLLlIi1iI1li(file, Charset.defaultCharset());
    }

    public static boolean IllLlI1IiIL(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return ilLIlL1ILi(file, chronoLocalDateTime.atZone(zoneId));
    }

    public static void i111iLiiIIill(File file, File file2, FileFilter fileFilter, boolean z, CopyOption... copyOptionArr) throws IOException {
        ArrayList arrayList;
        File[] fileArr;
        iilLil1i11I1(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                if (fileFilter == null) {
                    fileArr = file.listFiles();
                } else {
                    fileArr = file.listFiles(fileFilter);
                }
                if (fileArr != null && fileArr.length > 0) {
                    arrayList = new ArrayList(fileArr.length);
                    for (File name : fileArr) {
                        arrayList.add(new File(file2, name.getName()).getCanonicalPath());
                    }
                    IIlLill(file, file2, fileFilter, z, arrayList, copyOptionArr);
                }
            }
            arrayList = null;
            IIlLill(file, file2, fileFilter, z, arrayList, copyOptionArr);
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void i11iLLllliI(File file, File file2, boolean z) throws IOException {
        ILL1iL1LiiI(file, file2);
        if (!file2.exists() && z && !file2.mkdirs()) {
            throw new IOException("Could not create destination directories '" + file2 + "'");
        } else if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        } else if (file2.isDirectory()) {
            II1l1IliI1Li1(file, new File(file2, file.getName()));
        } else {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
    }

    public static void i11liIIl11Ii1(File file, File file2) throws IOException {
        iiiiI1iILL11I(file, file2, true);
    }

    public static void i1I1l11IL(File file, byte[] bArr) throws IOException {
        ILLL1LlLLilL(file, bArr, false);
    }

    public static void i1II1iL(File file, CharSequence charSequence, Charset charset) throws IOException {
        ili11iILI1l(file, charSequence, charset, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String i1IL1lILl1L1I(java.io.File r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            java.io.FileInputStream r1 = iLlI1iL1lIIL(r1)
            java.nio.charset.Charset r2 = top.tntok.autobot.iIiiLi1LllI.illlI1lLIL(r2)     // Catch:{ all -> 0x0012 }
            java.lang.String r2 = top.tntok.autobot.C0130o00O0o00.iliiLi1I(r1, r2)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0011
            r1.close()
        L_0x0011:
            return r2
        L_0x0012:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.i1IL1lILl1L1I(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static void i1L1lLllLLlIi(File file, File file2) throws IOException {
        Ii1liIIIiLi(file, file2, true);
    }

    public static Collection<File> i1L1llI1LlL1l(File file, o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        return IiIl11II(file, o00o00o0, o00o00o02, true);
    }

    public static String i1LIL11l(long j) {
        return illlI1lLIL(BigInteger.valueOf(j));
    }

    public static File i1LiiIlIL1I() {
        return new File(ILiLII1ILi());
    }

    public static FileOutputStream i1LlL1iILLLil(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, z);
    }

    public static boolean i1i1111LLILli(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return IiiIIil1l(file, chronoLocalDate.atTime(localTime));
    }

    public static void i1iI1iiLL1(Iterable<File> iterable, File file) throws IOException {
        Objects.requireNonNull(iterable, "sourceIterable");
        for (File i11liIIl11Ii1 : iterable) {
            i11liIIl11Ii1(i11liIIl11Ii1, file);
        }
    }

    @Deprecated
    public static void i1iLi1lIlL(File file, String str) throws IOException {
        IiLlIiL1IlIlI(file, str, Charset.defaultCharset(), false);
    }

    public static void i1iLlIill1I(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Unable to create directory " + file);
        }
    }

    public static void i1iiLIil1ILi(File file, File file2, boolean z, CopyOption... copyOptionArr) throws IOException {
        iilLil1i11I1(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                iliilLllIl1(file, file2, z, copyOptionArr);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static File[] i1iliILILi(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                return listFiles;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    @Deprecated
    public static void iI1LILIILLI(File file, CharSequence charSequence) throws IOException {
        ili11iILI1l(file, charSequence, Charset.defaultCharset(), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0072, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0074, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0079, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007a, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean iILiI1lll(java.io.File r4, java.io.File r5, java.lang.String r6) throws java.io.IOException {
        /*
            r0 = 1
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r4 != 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r5 != 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0015
            return r1
        L_0x0015:
            boolean r2 = r4.exists()
            boolean r3 = r5.exists()
            if (r2 == r3) goto L_0x0020
            return r1
        L_0x0020:
            if (r2 != 0) goto L_0x0023
            return r0
        L_0x0023:
            boolean r1 = r4.isDirectory()
            if (r1 != 0) goto L_0x007e
            boolean r1 = r5.isDirectory()
            if (r1 != 0) goto L_0x007e
            java.io.File r1 = r4.getCanonicalFile()
            java.io.File r2 = r5.getCanonicalFile()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003e
            return r0
        L_0x003e:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            java.nio.charset.Charset r4 = top.tntok.autobot.iIiiLi1LllI.i1LIL11l(r6)
            r0.<init>(r1, r4)
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0065 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0065 }
            r1.<init>(r5)     // Catch:{ all -> 0x0065 }
            java.nio.charset.Charset r5 = top.tntok.autobot.iIiiLi1LllI.i1LIL11l(r6)     // Catch:{ all -> 0x0065 }
            r4.<init>(r1, r5)     // Catch:{ all -> 0x0065 }
            boolean r5 = top.tntok.autobot.C0130o00O0o00.IliiLiLliIl(r0, r4)     // Catch:{ all -> 0x0067 }
            r4.close()     // Catch:{ all -> 0x0065 }
            r0.close()
            return r5
        L_0x0065:
            r4 = move-exception
            goto L_0x0073
        L_0x0067:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            r4.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch:{ all -> 0x0065 }
        L_0x0072:
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0073:
            throw r4     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r5 = move-exception
            r0.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x007d:
            throw r5
        L_0x007e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Can't compare directories, only files"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.iILiI1lll(java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static long iILil1IilI1l(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            return ILI1Iil1li(file);
        } else {
            return file.length();
        }
    }

    public static void iIi1LiiIIl1(File file, Collection<?> collection, String str, boolean z) throws IOException {
        iLII1iIiLLL1(file, (String) null, collection, str, z);
    }

    public static C0160o00Oo0oo iIiL11iL(File file) throws IOException {
        return I1IILIil1lLlL(file, (String) null);
    }

    public static String[] iIiiI1IILilLl(String... strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = "." + strArr[i];
        }
        return strArr2;
    }

    public static void iIliIIiiI(File file, CharSequence charSequence, String str) throws IOException {
        Ii1lLiiIli(file, charSequence, str, false);
    }

    public static void iL1LIlIlI(File file, File file2, FileFilter fileFilter, boolean z) throws IOException {
        i111iLiiIIill(file, file2, fileFilter, z, StandardCopyOption.REPLACE_EXISTING);
    }

    @Deprecated
    public static void iL1ilIi1l11L1(File file, CharSequence charSequence, boolean z) throws IOException {
        ili11iILI1l(file, charSequence, Charset.defaultCharset(), z);
    }

    public static String iL1lL1LL(File file, String str) throws IOException {
        return i1IL1lILl1L1I(file, iIiiLi1LllI.i1LIL11l(str));
    }

    public static boolean iLI1L1l1li(File file, File file2) {
        Objects.requireNonNull(file2, "reference");
        if (file2.exists()) {
            return iLiI1Llil(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void iLII1iIiLLL1(java.io.File r1, java.lang.String r2, java.util.Collection<?> r3, java.lang.String r4, boolean r5) throws java.io.IOException {
        /*
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r1 = i1LlL1iILLLil(r1, r5)
            r0.<init>(r1)
            top.tntok.autobot.C0130o00O0o00.IIllliII1(r3, r4, r0, r2)     // Catch:{ all -> 0x0010 }
            r0.close()
            return
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r3 = move-exception
            r1.addSuppressed(r3)
        L_0x001b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.iLII1iIiLLL1(java.io.File, java.lang.String, java.util.Collection, java.lang.String, boolean):void");
    }

    public static boolean iLIIl1IliLlLI(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return I1i1iiiI(file, chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean iLILliI1(File file, ChronoLocalDate chronoLocalDate) {
        return i1i1111LLILli(file, chronoLocalDate, LocalTime.now());
    }

    public static long iLLLILIiLi1Ii(File file) throws IOException {
        return I11lLL1(file, new CRC32()).getValue();
    }

    public static o00O00o0 iLLi1LIi(o00O00o0 o00o00o0) {
        return o00000.I11lLL1(o00o00o0, o00000.il1l1IlL(C0016OooOo0.illlI1lLIL));
    }

    public static long iLLlLIIliLl(File file) {
        il1LilLllii(file);
        return ILI1Iil1li(file);
    }

    public static boolean iLiI1Llil(File file, long j) {
        Objects.requireNonNull(file, "file");
        if (file.exists() && file.lastModified() < j) {
            return true;
        }
        return false;
    }

    public static FileInputStream iLlI1iL1lIIL(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static String iLlIllll() {
        return System.getProperty("java.io.tmpdir");
    }

    public static BigInteger iLliII11iI(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : listFiles) {
            if (!ilIILlI1l11i(file2)) {
                bigInteger = bigInteger.add(I11lLL1L11Lil(file2));
            }
        }
        return bigInteger;
    }

    public static void iiIIl1I(File file, String str, Collection<?> collection) throws IOException {
        iLII1iIiLLL1(file, str, collection, (String) null, false);
    }

    public static BigInteger iiIiili(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            return iLliII11iI(file);
        } else {
            return BigInteger.valueOf(file.length());
        }
    }

    public static void iiIliillii(File file, File file2, long j, long j2) throws IOException {
        if (j != j2) {
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + j + " Actual: " + j2);
        }
    }

    public static List<String> iiL1l1iLliL(File file, String str) throws IOException {
        return IlLLlIi1iI1li(file, iIiiLi1LllI.i1LIL11l(str));
    }

    public static void iiLIIiIli(File file, File file2) throws IOException {
        ILl1iII11Ll1(file, file2, true);
    }

    public static Iterator<File> iiLl11ILL(File file, String[] strArr, boolean z) {
        return ILIiLLLL1iiii(file, strArr, z).iterator();
    }

    public static void iiiiI1iILL11I(File file, File file2, boolean z) throws IOException {
        Objects.requireNonNull(file2, "destinationDir");
        if (!file2.exists() || file2.isDirectory()) {
            ILl1iII11Ll1(file, new File(file2, file.getName()), z);
            return;
        }
        throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
    }

    public static BigInteger iil1ILLLi11(File file) {
        il1LilLllii(file);
        return iLliII11iI(file);
    }

    public static void iilLiIIIi11i(File file) throws IOException {
        File[] i1iliILILi = i1iliILILi(file);
        ArrayList arrayList = new ArrayList();
        for (File ILllI11 : i1iliILILi) {
            try {
                ILllI11(ILllI11);
            } catch (IOException e) {
                arrayList.add(e);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public static void iilLil1i11I1(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "target");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    public static long iillllIL(File file) {
        if (file.isDirectory()) {
            return ILI1Iil1li(file);
        }
        return file.length();
    }

    public static void il11iII1(File file, File file2) throws IOException {
        if (!file2.setLastModified(file.lastModified())) {
            throw new IOException("Failed setLastModified on " + file);
        }
    }

    public static void il1LilLllii(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void il1l1IlL(java.net.URL r0, java.io.File r1, int r2, int r3) throws java.io.IOException {
        /*
            java.net.URLConnection r0 = r0.openConnection()
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r3)
            java.io.InputStream r0 = r0.getInputStream()
            IliiLiLliIl(r0, r1)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0016
            r0.close()
        L_0x0016:
            return
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0024:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0086o000OoO.il1l1IlL(java.net.URL, java.io.File, int, int):void");
    }

    public static boolean ilIILlI1l11i(File file) {
        Objects.requireNonNull(file, "file");
        return Files.isSymbolicLink(file.toPath());
    }

    public static void ilLILlL(File file, String str, Collection<?> collection, String str2) throws IOException {
        iLII1iIiLLL1(file, str, collection, str2, false);
    }

    public static boolean ilLIlL1ILi(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return I1LiILiLLIl1l(file, chronoZonedDateTime.toInstant());
    }

    public static Collection<File> ilLIlLiIILl1(File file, o00O00o0 o00o00o0, o00O00o0 o00o00o02) {
        return IiIl11II(file, o00o00o0, o00o00o02, false);
    }

    public static void ilLilIL(File file, File file2) throws IOException {
        ILL1iL1LiiI(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        } else if (file2.exists()) {
            throw new o000000O("Destination '" + file2 + "' already exists");
        } else if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        } else if (!file.renameTo(file2)) {
            iiLIIiIli(file, file2);
            if (!file.delete()) {
                IL1IiilLlLI(file2);
                throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void ilLlL1i1L(File file, String str, String str2, boolean z) throws IOException {
        IiLlIiL1IlIlI(file, str, iIiiLi1LllI.i1LIL11l(str2), z);
    }

    public static void ili11iILI1l(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
        String str;
        if (charSequence == null) {
            str = null;
        } else {
            str = charSequence.toString();
        }
        IiLlIiL1IlIlI(file, str, charset, z);
    }

    public static o00O00o0 iliiI1Ii1iIl(o00O00o0 o00o00o0) {
        if (o00o00o0 == null) {
            return C0224o00oO0O.illlI1lLIL;
        }
        return o00000.I11lLL1(o00o00o0, C0016OooOo0.illlI1lLIL);
    }

    public static File[] iliiLi1I(URL... urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return IL1lILLLL1L;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i = 0; i < urlArr.length; i++) {
            URL url = urlArr[i];
            if (url != null) {
                if (url.getProtocol().equals("file")) {
                    fileArr[i] = iliilLIIilill(url);
                } else {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
            }
        }
        return fileArr;
    }

    public static File iliilLIIilill(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(I1IIIi1i1ILl(url.getFile().replace('/', File.separatorChar)));
    }

    public static void iliilLllIl1(File file, File file2, boolean z, CopyOption... copyOptionArr) throws IOException {
        if (!file2.exists() || !file2.isDirectory()) {
            Path iiI1L1iI2 = file.toPath();
            Path iiI1L1iI3 = file2.toPath();
            Path unused = Files.copy(iiI1L1iI2, iiI1L1iI3, copyOptionArr);
            File file3 = file;
            File file4 = file2;
            iiIliillii(file3, file4, Files.size(iiI1L1iI2), Files.size(iiI1L1iI3));
            iiIliillii(file3, file4, file.length(), file2.length());
            if (z) {
                il11iII1(file, file2);
                return;
            }
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is a directory");
    }

    public static boolean illi1IL1(File file, ChronoLocalDate chronoLocalDate) {
        return I1Ii1ILliII(file, chronoLocalDate, LocalTime.now());
    }

    public static void illi1LIILLiL(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            i1iLlIill1I(parentFile);
        }
    }

    public static void illiiliIILI(File file) throws IOException {
        try {
            ILL1lL1lI.iLLLILIiLi1Ii iilLiIIIi11i2 = C0331o0O0oo0o.iilLiIIIi11i(file.toPath());
            if (iilLiIIIi11i2.iiI1L1iI().get() < 1 && iilLiIIIi11i2.i1LIL11l().get() < 1) {
                throw new FileNotFoundException("File does not exist: " + file);
            }
        } catch (IOException e) {
            throw new IOException("Unable to delete file: " + file, e);
        }
    }

    public static String illlI1lLIL(BigInteger bigInteger) {
        BigInteger bigInteger2 = iILiI1lll;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger2)) + " EB";
        }
        BigInteger bigInteger4 = iilLiIIIi11i;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger4)) + " PB";
        }
        BigInteger bigInteger5 = iLLLILIiLi1Ii;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger5)) + " TB";
        }
        BigInteger bigInteger6 = iilLil1i11I1;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger6)) + " GB";
        }
        BigInteger bigInteger7 = il1LilLllii;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger7)) + " MB";
        }
        BigInteger bigInteger8 = i1LIL11l;
        if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger8)) + " KB";
        }
        return String.valueOf(bigInteger) + " bytes";
    }
}
