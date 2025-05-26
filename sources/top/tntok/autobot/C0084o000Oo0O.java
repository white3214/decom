package top.tntok.autobot;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import top.tntok.autobot.C0222o00oO00O;

/* renamed from: top.tntok.autobot.o000Oo0O  reason: case insensitive filesystem */
public class C0084o000Oo0O implements C0115o000ooo {
    public static final String IL1lILLLL1L = "postData";
    public static final int Ii1liIIIiLi = 8192;
    public static final int IilL11ii1I1Il = 1024;
    public static final int i111iLiiIIill = 2097152;
    public static final int iL1LIlIlI = 512;
    public String I11lLL1;
    public String I1iIiIi;
    public Map<String, List<String>> IiIIlIL;
    public iLLLIL1Lll IiiL1llIIi;
    public String i1L1lLllLLlIi;
    public final C0132o00O0o0o i1LIL11l;
    public String iILiI1lll;
    public C0288o0O00o0 iLLLILIiLi1Ii;
    public final C0222o00oO00O iiI1L1iI;
    public int iiIliillii;
    public Map<String, String> iilLiIIIi11i;
    public int iilLil1i11I1;
    public final BufferedInputStream il1LilLllii;
    public final OutputStream illlI1lLIL;

    public C0084o000Oo0O(C0222o00oO00O o00oo00o, C0132o00O0o0o o00o0o0o, InputStream inputStream, OutputStream outputStream) {
        this.iiI1L1iI = o00oo00o;
        this.i1LIL11l = o00o0o0o;
        this.il1LilLllii = new BufferedInputStream(inputStream, 8192);
        this.illlI1lLIL = outputStream;
    }

    public final Map<String, String> I11lLL1() {
        return this.iilLiIIIi11i;
    }

    public final void I1iIiIi(iLLiiii11 illiiii11, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) throws C0222o00oO00O.i1LIL11l {
        int i;
        String str;
        ByteBuffer byteBuffer2 = byteBuffer;
        Map<String, List<String>> map3 = map;
        Map<String, String> map4 = map2;
        try {
            int[] i111iLiiIIill2 = i111iLiiIIill(byteBuffer2, illiiii11.iiI1L1iI().getBytes());
            int i2 = 2;
            if (i111iLiiIIill2.length >= 2) {
                int i3 = 1024;
                byte[] bArr = new byte[1024];
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = 1;
                    if (i5 < i111iLiiIIill2.length - 1) {
                        byteBuffer2.position(i111iLiiIIill2[i5]);
                        if (byteBuffer.remaining() < i3) {
                            i = byteBuffer.remaining();
                        } else {
                            i = 1024;
                        }
                        byteBuffer2.get(bArr, i4, i);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i4, i), Charset.forName(illiiii11.iiIliillii())), i);
                        String readLine = bufferedReader.readLine();
                        if (readLine != null && readLine.contains(illiiii11.iiI1L1iI())) {
                            String readLine2 = bufferedReader.readLine();
                            String str2 = null;
                            String str3 = null;
                            String str4 = null;
                            int i8 = 2;
                            while (readLine2 != null && readLine2.trim().length() > 0) {
                                Matcher matcher = C0222o00oO00O.IiiL1llIIi.matcher(readLine2);
                                if (matcher.matches()) {
                                    Matcher matcher2 = C0222o00oO00O.IL1lILLLL1L.matcher(matcher.group(i2));
                                    while (matcher2.find()) {
                                        String group = matcher2.group(i7);
                                        if ("name".equalsIgnoreCase(group)) {
                                            str = matcher2.group(2);
                                        } else {
                                            if ("filename".equalsIgnoreCase(group)) {
                                                String group2 = matcher2.group(2);
                                                if (!group2.isEmpty()) {
                                                    if (i6 > 0) {
                                                        str = str2 + String.valueOf(i6);
                                                        str3 = group2;
                                                        i6++;
                                                    } else {
                                                        i6++;
                                                    }
                                                }
                                                str3 = group2;
                                            }
                                            i7 = 1;
                                        }
                                        str2 = str;
                                        i7 = 1;
                                    }
                                }
                                Matcher matcher3 = C0222o00oO00O.I1iIiIi.matcher(readLine2);
                                if (matcher3.matches()) {
                                    str4 = matcher3.group(2).trim();
                                }
                                readLine2 = bufferedReader.readLine();
                                i8++;
                                i2 = 2;
                                i7 = 1;
                            }
                            int i9 = 0;
                            while (true) {
                                int i10 = i8 - 1;
                                if (i8 <= 0) {
                                    break;
                                }
                                i9 = I1l1iIll1lIi1(bArr, i9);
                                i8 = i10;
                            }
                            if (i9 < i - 4) {
                                int i11 = i111iLiiIIill2[i5] + i9;
                                i5++;
                                int i12 = i111iLiiIIill2[i5] - 4;
                                byteBuffer2.position(i11);
                                List list = map3.get(str2);
                                if (list == null) {
                                    list = new ArrayList();
                                    map3.put(str2, list);
                                }
                                if (str4 == null) {
                                    byte[] bArr2 = new byte[(i12 - i11)];
                                    byteBuffer2.get(bArr2);
                                    list.add(new String(bArr2, illiiii11.iiIliillii()));
                                } else {
                                    String IilL11ii1I1Il2 = IilL11ii1I1Il(byteBuffer2, i11, i12 - i11, str3);
                                    if (!map4.containsKey(str2)) {
                                        map4.put(str2, IilL11ii1I1Il2);
                                    } else {
                                        int i13 = 2;
                                        while (true) {
                                            if (!map4.containsKey(str2 + i13)) {
                                                break;
                                            }
                                            i13++;
                                        }
                                        map4.put(str2 + i13, IilL11ii1I1Il2);
                                    }
                                    list.add(str3);
                                }
                                i3 = 1024;
                                i2 = 2;
                                i4 = 0;
                            } else {
                                throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                            }
                        }
                    } else {
                        return;
                    }
                }
                throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
            }
            throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
        } catch (C0222o00oO00O.i1LIL11l e) {
            throw e;
        } catch (Exception e2) {
            throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.INTERNAL_ERROR, e2.toString());
        }
    }

    public final int I1l1iIll1lIi1(byte[] bArr, int i) {
        while (bArr[i] != 10) {
            i++;
        }
        return i + 1;
    }

    public final int IL1lILLLL1L(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    public final RandomAccessFile Ii1liIIIiLi() {
        try {
            return new RandomAccessFile(this.i1LIL11l.iiI1L1iI((String) null).iiI1L1iI(), "rw");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public final C0288o0O00o0 IiIIlIL() {
        return this.iLLLILIiLi1Ii;
    }

    public String IiiL1llIIi() {
        return this.iILiI1lll;
    }

    public final String IilL11ii1I1Il(ByteBuffer byteBuffer, int i, int i2, String str) {
        if (i2 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream = null;
        try {
            C0131o00O0o0O iiI1L1iI2 = this.i1LIL11l.iiI1L1iI(str);
            ByteBuffer duplicate = byteBuffer.duplicate();
            FileOutputStream fileOutputStream2 = new FileOutputStream(iiI1L1iI2.iiI1L1iI());
            try {
                FileChannel channel = fileOutputStream2.getChannel();
                duplicate.position(i).limit(i + i2);
                channel.write(duplicate.slice());
                String iiI1L1iI3 = iiI1L1iI2.iiI1L1iI();
                C0222o00oO00O.i1iiLIil1ILi(fileOutputStream2);
                return iiI1L1iI3;
            } catch (Exception e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    C0222o00oO00O.i1iiLIil1ILi(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                C0222o00oO00O.i1iiLIil1ILi(fileOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw new Error(e);
        }
    }

    public final int[] i111iLiiIIill(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + 4096;
        byte[] bArr2 = new byte[length];
        if (byteBuffer.remaining() < length) {
            i = byteBuffer.remaining();
        } else {
            i = length;
        }
        byteBuffer.get(bArr2, 0, i);
        int length2 = i - bArr.length;
        int i2 = 0;
        do {
            int i3 = 0;
            while (i3 < length2) {
                int i4 = 0;
                while (i4 < bArr.length && bArr2[i3 + i4] == bArr[i4]) {
                    if (i4 == bArr.length - 1) {
                        int[] iArr2 = new int[(iArr.length + 1)];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i2 + i3;
                        iArr = iArr2;
                    }
                    i4++;
                }
                i3++;
            }
            i2 += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    public final void i1L1lLllLLlIi(String str, Map<String, List<String>> map) {
        String str2;
        String str3;
        if (str == null) {
            this.iILiI1lll = "";
            return;
        }
        this.iILiI1lll = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                str3 = C0222o00oO00O.I11lLL1(nextToken.substring(0, indexOf)).trim();
                str2 = C0222o00oO00O.I11lLL1(nextToken.substring(indexOf + 1));
            } else {
                str3 = C0222o00oO00O.I11lLL1(nextToken).trim();
                str2 = "";
            }
            List list = map.get(str3);
            if (list == null) {
                list = new ArrayList();
                map.put(str3, list);
            }
            list.add(str2);
        }
    }

    public iLLLIL1Lll i1LIL11l() {
        return this.IiiL1llIIi;
    }

    public final void iILiI1lll(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws C0222o00oO00O.i1LIL11l {
        String str;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            i1L1lLllLLlIi(nextToken.substring(indexOf + 1), map2);
                            str = C0222o00oO00O.I11lLL1(nextToken.substring(0, indexOf));
                        } else {
                            str = C0222o00oO00O.I11lLL1(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            this.i1L1lLllLLlIi = stringTokenizer.nextToken();
                        } else {
                            this.i1L1lLllLLlIi = "HTTP/1.1";
                            C0222o00oO00O.I1l1iIll1lIi1.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                        }
                        String readLine2 = bufferedReader.readLine();
                        while (readLine2 != null && !readLine2.trim().isEmpty()) {
                            int indexOf2 = readLine2.indexOf(58);
                            if (indexOf2 >= 0) {
                                map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                            }
                            readLine2 = bufferedReader.readLine();
                        }
                        map.put("uri", str);
                        return;
                    }
                    throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
        } catch (IOException e) {
            C0376o0OOo0O0 o0ooo0o0 = C0376o0OOo0O0.INTERNAL_ERROR;
            throw new C0222o00oO00O.i1LIL11l(o0ooo0o0, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public long iL1LIlIlI() {
        if (this.iilLiIIIi11i.containsKey("content-length")) {
            return Long.parseLong(this.iilLiIIIi11i.get("content-length"));
        }
        int i = this.iiIliillii;
        int i2 = this.iilLil1i11I1;
        if (i < i2) {
            return (long) (i2 - i);
        }
        return 0;
    }

    public String iLLLILIiLi1Ii() {
        return this.I1iIiIi;
    }

    public final Map<String, List<String>> iiI1L1iI() {
        return this.IiIIlIL;
    }

    public void iiIliillii(Map<String, String> map) throws IOException, C0222o00oO00O.i1LIL11l {
        DataOutputStream dataOutputStream;
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteBuffer byteBuffer;
        Map<String, String> map2 = map;
        RandomAccessFile randomAccessFile2 = null;
        try {
            long iL1LIlIlI2 = iL1LIlIlI();
            if (iL1LIlIlI2 < 2097152) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = null;
            } else {
                randomAccessFile = Ii1liIIIiLi();
                byteArrayOutputStream = null;
                dataOutputStream = randomAccessFile;
            }
            try {
                byte[] bArr = new byte[512];
                while (this.iilLil1i11I1 >= 0 && iL1LIlIlI2 > 0) {
                    int read = this.il1LilLllii.read(bArr, 0, (int) Math.min(iL1LIlIlI2, 512));
                    this.iilLil1i11I1 = read;
                    iL1LIlIlI2 -= (long) read;
                    if (read > 0) {
                        dataOutputStream.write(bArr, 0, read);
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteBuffer = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    byteBuffer = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length());
                    randomAccessFile.seek(0);
                }
                if (C0288o0O00o0.POST.equals(this.iLLLILIiLi1Ii)) {
                    iLLiiii11 illiiii11 = new iLLiiii11(this.iilLiIIIi11i.get("content-type"));
                    if (!illiiii11.iilLil1i11I1()) {
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        String trim = new String(bArr2, illiiii11.iiIliillii()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(illiiii11.i1LIL11l())) {
                            i1L1lLllLLlIi(trim, this.IiIIlIL);
                        } else if (trim.length() != 0) {
                            map2.put(IL1lILLLL1L, trim);
                        }
                    } else if (illiiii11.iiI1L1iI() != null) {
                        I1iIiIi(illiiii11, byteBuffer, this.IiIIlIL, map2);
                    } else {
                        throw new C0222o00oO00O.i1LIL11l(C0376o0OOo0O0.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                    }
                } else if (C0288o0O00o0.PUT.equals(this.iLLLILIiLi1Ii)) {
                    map2.put("content", IilL11ii1I1Il(byteBuffer, 0, byteBuffer.limit(), (String) null));
                }
                C0222o00oO00O.i1iiLIil1ILi(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                C0222o00oO00O.i1iiLIil1ILi(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C0222o00oO00O.i1iiLIil1ILi(randomAccessFile2);
            throw th;
        }
    }

    @Deprecated
    public final Map<String, String> iilLiIIIi11i() {
        HashMap hashMap = new HashMap();
        for (String next : this.IiIIlIL.keySet()) {
            hashMap.put(next, (String) this.IiIIlIL.get(next).get(0));
        }
        return hashMap;
    }

    public final String iilLil1i11I1() {
        return this.I11lLL1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        top.tntok.autobot.C0338o0O0oooo.I1IILIil1lLlL(r0.iiI1L1iI(), top.tntok.autobot.C0222o00oO00O.i111iLiiIIill, r0.getMessage()).i1L1llI1LlL1l(r10.illlI1lLIL);
        top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r10.illlI1lLIL);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c, SSLException -> 0x016e, IOException -> 0x0170, i1LIL11l -> 0x003c, all -> 0x0039 }, ExcHandler: i1LIL11l (r0v14 'e' top.tntok.autobot.o00oO00O$i1LIL11l A[CUSTOM_DECLARE, Catch:{  }]), PHI: r4 
      PHI: (r4v4 top.tntok.autobot.o0O0oooo) = (r4v0 top.tntok.autobot.o0O0oooo), (r4v0 top.tntok.autobot.o0O0oooo), (r4v0 top.tntok.autobot.o0O0oooo), (r4v5 top.tntok.autobot.o0O0oooo), (r4v0 top.tntok.autobot.o0O0oooo) binds: [B:1:0x0009, B:2:?, B:3:0x0015, B:56:0x012a, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void il1LilLllii() throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "method"
            java.lang.String r1 = "text/plain"
            java.lang.String r2 = "NanoHttpd Shutdown"
            r3 = 8192(0x2000, float:1.14794E-41)
            r4 = 0
            byte[] r5 = new byte[r3]     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r6 = 0
            r10.iiIliillii = r6     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.iilLil1i11I1 = r6     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.BufferedInputStream r7 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r7.mark(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.BufferedInputStream r7 = r10.il1LilLllii     // Catch:{ SSLException -> 0x016e, IOException -> 0x0170, i1LIL11l -> 0x003c }
            int r3 = r7.read(r5, r6, r3)     // Catch:{ SSLException -> 0x016e, IOException -> 0x0170, i1LIL11l -> 0x003c }
            r7 = -1
            if (r3 == r7) goto L_0x015e
        L_0x001e:
            if (r3 <= 0) goto L_0x004b
            int r7 = r10.iilLil1i11I1     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r7 = r7 + r3
            r10.iilLil1i11I1 = r7     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r3 = r10.IL1lILLLL1L(r5, r7)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.iiIliillii = r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 <= 0) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            java.io.BufferedInputStream r3 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r7 = r10.iilLil1i11I1     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r8 = 8192 - r7
            int r3 = r3.read(r5, r7, r8)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            goto L_0x001e
        L_0x0039:
            r0 = move-exception
            goto L_0x01e9
        L_0x003c:
            r0 = move-exception
            goto L_0x0181
        L_0x003f:
            r0 = move-exception
            goto L_0x0198
        L_0x0042:
            r0 = move-exception
            goto L_0x01bf
        L_0x0045:
            r0 = move-exception
            goto L_0x01e7
        L_0x0048:
            r0 = move-exception
            goto L_0x01e8
        L_0x004b:
            int r3 = r10.iiIliillii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r7 = r10.iilLil1i11I1     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 >= r7) goto L_0x005e
            java.io.BufferedInputStream r3 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.reset()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.BufferedInputStream r3 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r7 = r10.iiIliillii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            long r7 = (long) r7     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.skip(r7)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x005e:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.<init>()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.IiIIlIL = r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 != 0) goto L_0x0071
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.<init>()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.iilLiIIIi11i = r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            goto L_0x0074
        L_0x0071:
            r3.clear()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x0074:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            int r9 = r10.iilLil1i11I1     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r8.<init>(r5, r6, r9)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r7.<init>(r8)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.<init>(r7)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r5.<init>()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.IiIIlIL     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.lang.String> r8 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.iILiI1lll(r3, r5, r7, r8)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = r10.I1iIiIi     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 == 0) goto L_0x00a5
            java.util.Map<java.lang.String, java.lang.String> r7 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r8 = "remote-addr"
            r7.put(r8, r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r7 = "http-client-ip"
            java.lang.String r8 = r10.I1iIiIi     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r3.put(r7, r8)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x00a5:
            java.lang.Object r3 = r5.get(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.o0O00o0 r3 = top.tntok.autobot.C0288o0O00o0.i1LIL11l(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.iLLLILIiLi1Ii = r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 == 0) goto L_0x013a
            java.lang.String r0 = "uri"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.I11lLL1 = r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.iLLLIL1Lll r0 = new top.tntok.autobot.iLLLIL1Lll     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r0.<init>(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r10.IiiL1llIIi = r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = "connection"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = "HTTP/1.1"
            java.lang.String r5 = r10.i1L1lLllLLlIi     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            boolean r3 = r3.equals(r5)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 == 0) goto L_0x00e6
            if (r0 == 0) goto L_0x00e4
            java.lang.String r3 = "(?i).*close.*"
            boolean r0 = r0.matches(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r0 != 0) goto L_0x00e6
        L_0x00e4:
            r0 = 1
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            top.tntok.autobot.o00oO00O r3 = r10.iiI1L1iI     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.o0O0oooo r4 = r3.i1L1lLllLLlIi(r10)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r4 == 0) goto L_0x0130
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.iilLiIIIi11i     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r5 = "accept-encoding"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.iLLLIL1Lll r5 = r10.IiiL1llIIi     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r5.iiIliillii(r4)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.o0O00o0 r5 = r10.iLLLILIiLi1Ii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r4.I1ILilil1I(r5)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 == 0) goto L_0x010d
            java.lang.String r5 = "gzip"
            boolean r3 = r3.contains(r5)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r3 != 0) goto L_0x0110
        L_0x010d:
            r4.iL1lL1LL(r6)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x0110:
            r4.I11iLiiIi(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.OutputStream r3 = r10.illlI1lLIL     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r4.i1L1llI1LlL1l(r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r0 == 0) goto L_0x012a
            boolean r0 = r4.iiLl11ILL()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            if (r0 != 0) goto L_0x012a
        L_0x0120:
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r4)
            top.tntok.autobot.o00O0o0o r0 = r10.i1LIL11l
            r0.clear()
            goto L_0x01e6
        L_0x012a:
            java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r0.<init>(r2)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            throw r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x0130:
            top.tntok.autobot.o00oO00O$i1LIL11l r0 = new top.tntok.autobot.o00oO00O$i1LIL11l     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.o0OOo0O0 r2 = top.tntok.autobot.C0376o0OOo0O0.INTERNAL_ERROR     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r3 = "SERVER INTERNAL ERROR: Serve() returned a null response."
            r0.<init>(r2, r3)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            throw r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x013a:
            top.tntok.autobot.o00oO00O$i1LIL11l r2 = new top.tntok.autobot.o00oO00O$i1LIL11l     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.o0OOo0O0 r3 = top.tntok.autobot.C0376o0OOo0O0.BAD_REQUEST     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r6.<init>()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r7 = "BAD REQUEST: Syntax error. HTTP verb "
            r6.append(r7)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r6.append(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r0 = " unhandled."
            r6.append(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.lang.String r0 = r6.toString()     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r2.<init>(r3, r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            throw r2     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x015e:
            java.io.BufferedInputStream r0 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.OutputStream r0 = r10.illlI1lLIL     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r0.<init>(r2)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            throw r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x016e:
            r0 = move-exception
            goto L_0x0180
        L_0x0170:
            java.io.BufferedInputStream r0 = r10.il1LilLllii     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.io.OutputStream r0 = r10.illlI1lLIL     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            java.net.SocketException r0 = new java.net.SocketException     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            r0.<init>(r2)     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
            throw r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x0180:
            throw r0     // Catch:{ SocketException -> 0x0048, SocketTimeoutException -> 0x0045, SSLException -> 0x0042, IOException -> 0x003f, i1LIL11l -> 0x003c }
        L_0x0181:
            top.tntok.autobot.o0OOo0O0 r2 = r0.iiI1L1iI()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.o0O0oooo r0 = top.tntok.autobot.C0338o0O0oooo.I1IILIil1lLlL(r2, r1, r0)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r1 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            r0.i1L1llI1LlL1l(r1)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r0 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0120
        L_0x0198:
            top.tntok.autobot.o0OOo0O0 r2 = top.tntok.autobot.C0376o0OOo0O0.INTERNAL_ERROR     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r3.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "SERVER INTERNAL ERROR: IOException: "
            r3.append(r5)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0039 }
            r3.append(r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.o0O0oooo r0 = top.tntok.autobot.C0338o0O0oooo.I1IILIil1lLlL(r2, r1, r0)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r1 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            r0.i1L1llI1LlL1l(r1)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r0 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0120
        L_0x01bf:
            top.tntok.autobot.o0OOo0O0 r2 = top.tntok.autobot.C0376o0OOo0O0.INTERNAL_ERROR     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r3.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "SSL PROTOCOL FAILURE: "
            r3.append(r5)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0039 }
            r3.append(r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.o0O0oooo r0 = top.tntok.autobot.C0338o0O0oooo.I1IILIil1lLlL(r2, r1, r0)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r1 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            r0.i1L1llI1LlL1l(r1)     // Catch:{ all -> 0x0039 }
            java.io.OutputStream r0 = r10.illlI1lLIL     // Catch:{ all -> 0x0039 }
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0120
        L_0x01e6:
            return
        L_0x01e7:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x01e8:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x01e9:
            top.tntok.autobot.C0222o00oO00O.i1iiLIil1ILi(r4)
            top.tntok.autobot.o00O0o0o r1 = r10.i1LIL11l
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0084o000Oo0O.il1LilLllii():void");
    }

    public final InputStream illlI1lLIL() {
        return this.il1LilLllii;
    }

    public C0084o000Oo0O(C0222o00oO00O o00oo00o, C0132o00O0o0o o00o0o0o, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.iiI1L1iI = o00oo00o;
        this.i1LIL11l = o00o0o0o;
        this.il1LilLllii = new BufferedInputStream(inputStream, 8192);
        this.illlI1lLIL = outputStream;
        this.I1iIiIi = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.iilLiIIIi11i = new HashMap();
    }
}
