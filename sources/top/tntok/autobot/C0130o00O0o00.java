package top.tntok.autobot;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/* renamed from: top.tntok.autobot.o00O0o00  reason: case insensitive filesystem */
public class C0130o00O0o00 {
    @Deprecated
    public static final String I11lLL1 = System.lineSeparator();
    public static final String IiIIlIL = "\r\n";
    public static char[] IiiL1llIIi = null;
    public static final int i1LIL11l = 8192;
    public static final String iLLLILIiLi1Ii = "\n";
    public static final byte[] iiI1L1iI = new byte[0];
    public static final char iiIliillii = '\\';
    public static final byte[] iilLiIIIi11i = new byte[8192];
    public static final int iilLil1i11I1 = -1;
    public static final char il1LilLllii = '/';
    public static final char illlI1lLIL = File.separatorChar;

    public static byte[] I11iLiiIi(InputStream inputStream, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
        } else if (i == 0) {
            return iiI1L1iI;
        } else {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == i) {
                return bArr;
            }
            throw new IOException("Unexpected read size. current: " + i2 + ", expected: " + i);
        }
    }

    public static BufferedWriter I11lLL1(Writer writer) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer);
    }

    public static InputStream I11lLL1L11Lil(CharSequence charSequence, Charset charset) {
        return iil1ILLLi11(charSequence.toString(), charset);
    }

    public static int I1I11Il1(InputStream inputStream, OutputStream outputStream) throws IOException {
        long iliilLllIl1 = iliilLllIl1(inputStream, outputStream);
        if (iliilLllIl1 > 2147483647L) {
            return -1;
        }
        return (int) iliilLllIl1;
    }

    @Deprecated
    public static void I1IIIi1i1ILl(InputStream inputStream, Writer writer) throws IOException {
        IIIlll1lll(inputStream, writer, Charset.defaultCharset());
    }

    public static long I1IILIil1lLlL(Reader reader, long j) throws IOException {
        if (j >= 0) {
            if (IiiL1llIIi == null) {
                IiiL1llIIi = new char[iilLiIIIi11i.length];
            }
            long j2 = j;
            while (j2 > 0) {
                long read = (long) reader.read(IiiL1llIIi, 0, (int) Math.min(j2, (long) iilLiIIIi11i.length));
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    @Deprecated
    public static byte[] I1ILilil1I(Reader reader) throws IOException {
        return iL1lL1LL(reader, Charset.defaultCharset());
    }

    @Deprecated
    public static List<String> I1Ii1ILliII(InputStream inputStream) throws IOException {
        return IllLlI1IiIL(inputStream, Charset.defaultCharset());
    }

    public static void I1LIi1ii1l(String str, OutputStream outputStream, String str2) throws IOException {
        I1lilLill1I(str, outputStream, iIiiLi1LllI.i1LIL11l(str2));
    }

    public static void I1LiILiLLIl1l(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int iLIIl1IliLlLI = iLIIl1IliLlLI(readableByteChannel, byteBuffer);
        if (iLIIl1IliLlLI != remaining) {
            throw new EOFException("Length to read: " + remaining + " actual: " + iLIIl1IliLlLI);
        }
    }

    public static int I1LiliILi1lI1(InputStream inputStream, byte[] bArr) throws IOException {
        return iLILliI1(inputStream, bArr, 0, bArr.length);
    }

    public static void I1i1iiiI(InputStream inputStream, byte[] bArr) throws IOException {
        ILiliIiI(inputStream, bArr, 0, bArr.length);
    }

    @Deprecated
    public static void I1iIiIi(Closeable closeable) {
        i1L1lLllLLlIi(closeable, C0127o00O0Ooo.iiI1L1iI((Object) null));
    }

    @Deprecated
    public static void I1l1iIll1lIi1(Socket socket) {
        I1iIiIi(socket);
    }

    public static void I1lLI1lLiLL(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    public static String I1lLLLlliILlI(String str, Charset charset) throws IOException {
        return iiLl11ILL(str, charset, (ClassLoader) null);
    }

    public static void I1lilLill1I(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(iIiiLi1LllI.illlI1lLIL(charset)));
        }
    }

    public static BufferedReader I1llIillii1(Reader reader, int i) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    public static void II1l1IliI1Li1(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j >= 0) {
            long ilLIlLiIILl1 = ilLIlLiIILl1(readableByteChannel, j);
            if (ilLIlLiIILl1 != j) {
                throw new EOFException("Bytes to skip: " + j + " actual: " + ilLIlLiIILl1);
            }
            return;
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
    }

    @Deprecated
    public static void IIIlIlILLI1iL(byte[] bArr, Writer writer) throws IOException {
        iIi1LiiIIl1(bArr, writer, Charset.defaultCharset());
    }

    public static void IIIlll1lll(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        i1iI1iiLL1(new InputStreamReader(inputStream, iIiiLi1LllI.illlI1lLIL(charset)), writer);
    }

    public static byte[] IIL1Ll1I111(String str) throws IOException {
        return ilIILlI1l11i(str, (ClassLoader) null);
    }

    public static void IILiIL1i11Li(Reader reader, OutputStream outputStream, String str) throws IOException {
        IIlLill(reader, outputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    public static long IIi1l1i(Reader reader, Writer writer, long j, long j2) throws IOException {
        return IIllllLiIlIl(reader, writer, j, j2, new char[8192]);
    }

    public static long IIlL1llI1(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        return i1iLlIill1I(inputStream, outputStream, new byte[i]);
    }

    public static BufferedReader IIlLLll1ll1(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static void IIlLill(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, iIiiLi1LllI.illlI1lLIL(charset));
        i1iI1iiLL1(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    @Deprecated
    public static void IIli11LiiIl(char[] cArr, OutputStream outputStream) throws IOException {
        ILiIL1Lll(cArr, outputStream, Charset.defaultCharset());
    }

    public static void IIll1lIL(byte[] bArr, Writer writer, String str) throws IOException {
        iIi1LiiIIl1(bArr, writer, iIiiLi1LllI.i1LIL11l(str));
    }

    public static List<String> IIlllIIi1ii(InputStream inputStream, String str) throws IOException {
        return IllLlI1IiIL(inputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    public static void IIllliII1(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        IlL1iIiii(collection, str, outputStream, iIiiLi1LllI.i1LIL11l(str2));
    }

    public static long IIllllLiIlIl(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
        long j3 = 0;
        if (j > 0) {
            i1L1llI1LlL1l(reader, j);
        }
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        int length = cArr.length;
        if (i > 0 && j2 < ((long) cArr.length)) {
            length = (int) j2;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j3 += (long) read;
            if (i > 0) {
                length = (int) Math.min(j2 - j3, (long) cArr.length);
            }
        }
        return j3;
    }

    public static long IL111l1(Reader reader, Appendable appendable) throws IOException {
        return il1l1IlL(reader, appendable, CharBuffer.allocate(8192));
    }

    public static URL IL11lll11(String str) throws IOException {
        return iILlLIlli(str, (ClassLoader) null);
    }

    public static void IL1IiLI(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    @Deprecated
    public static void IL1IiilLlLI(Reader reader, OutputStream outputStream) throws IOException {
        IIlLill(reader, outputStream, Charset.defaultCharset());
    }

    public static void IL1i1iLI1l(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection != null) {
            if (str == null) {
                str = System.lineSeparator();
            }
            for (Object next : collection) {
                if (next != null) {
                    writer.write(next.toString());
                }
                writer.write(str);
            }
        }
    }

    @Deprecated
    public static void IL1lILLLL1L(InputStream inputStream) {
        I1iIiIi(inputStream);
    }

    public static InputStream ILI1Iil1li(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str.getBytes(iIiiLi1LllI.i1LIL11l(str2)));
    }

    public static void ILIiLLLL1iiii(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            long iIiL11iL = iIiL11iL(inputStream, j);
            if (iIiL11iL != j) {
                throw new EOFException("Bytes to skip: " + j + " actual: " + iIiL11iL);
            }
            return;
        }
        throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
    }

    @Deprecated
    public static String ILL1iL1LiiI(URL url) throws IOException {
        return IillLI1llIL1(url, Charset.defaultCharset());
    }

    public static void ILLL1LlLLilL(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void ILiIL1Lll(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(iIiiLi1LllI.illlI1lLIL(charset)));
        }
    }

    public static Writer ILiIlILiL(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        if (appendable instanceof StringBuilder) {
            return new C0382o0OOo0oo((StringBuilder) appendable);
        }
        return new iLlIllll(appendable);
    }

    public static int ILiLII1ILi(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static void ILiliIiI(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int iLILliI1 = iLILliI1(inputStream, bArr, i, i2);
        if (iLILliI1 != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + iLILliI1);
        }
    }

    @Deprecated
    public static void ILl1iII11Ll1(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable I1iIiIi : closeableArr) {
                I1iIiIi(I1iIiIi);
            }
        }
    }

    @Deprecated
    public static void ILlI1I1Ill1IL(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        IlL1iIiii(collection, str, outputStream, Charset.defaultCharset());
    }

    public static long ILllI11(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
        int i;
        long j3 = 0;
        if (j > 0) {
            ILIiLLLL1iiii(inputStream, j);
        }
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        int length = bArr.length;
        if (i2 <= 0 || j2 >= ((long) length)) {
            i = length;
        } else {
            i = (int) j2;
        }
        while (i > 0) {
            int read = inputStream.read(bArr, 0, i);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j3 += (long) read;
            if (i2 > 0) {
                i = (int) Math.min(j2 - j3, (long) length);
            }
        }
        return j3;
    }

    @Deprecated
    public static void Ii1lLiiIli(CharSequence charSequence, OutputStream outputStream) throws IOException {
        ili11iILI1l(charSequence, outputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static void Ii1liIIIiLi(Writer writer) {
        I1iIiIi(writer);
    }

    public static void IiIIlIL(Closeable closeable) throws IOException {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static String IiILIlLLiIL(URI uri, String str) throws IOException {
        return Iiii1LiI11i(uri, iIiiLi1LllI.i1LIL11l(str));
    }

    @Deprecated
    public static String IiIiilIiL1iLi(URI uri) throws IOException {
        return Iiii1LiI11i(uri, Charset.defaultCharset());
    }

    public static C0160o00Oo0oo IiIl11II(InputStream inputStream, String str) throws IOException {
        return IillLillLLIii(inputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    public static byte[] IiL1llLiil1(Reader reader, String str) throws IOException {
        return iL1lL1LL(reader, iIiiLi1LllI.i1LIL11l(str));
    }

    public static void IiLlIiL1IlIlI(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i, min);
                length -= min;
                i += min;
            }
        }
    }

    public static int IiiIIil1l(Reader reader, char[] cArr, int i, int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int read = reader.read(cArr, (i2 - i3) + i, i3);
                if (-1 == read) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }
        throw new IllegalArgumentException("Length must not be negative: " + i2);
    }

    public static long IiiIlLl1il1i(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j;
            }
            writer.write(cArr, 0, read);
            j += (long) read;
        }
    }

    public static void IiiL1llIIi(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static String Iiii1LiI11i(URI uri, Charset charset) throws IOException {
        return IillLI1llIL1(uri.toURL(), iIiiLi1LllI.illlI1lLIL(charset));
    }

    public static C0160o00Oo0oo Iiiiii1l1I1L1(Reader reader) {
        return new C0160o00Oo0oo(reader);
    }

    @Deprecated
    public static void IilL11ii1I1Il(ServerSocket serverSocket) {
        I1iIiIi(serverSocket);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String IillLI1llIL1(java.net.URL r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            java.io.InputStream r1 = r1.openStream()
            java.lang.String r2 = iliiLi1I(r1, r2)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()
        L_0x000d:
            return r2
        L_0x000e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x001b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.IillLI1llIL1(java.net.URL, java.nio.charset.Charset):java.lang.String");
    }

    public static C0160o00Oo0oo IillLillLLIii(InputStream inputStream, Charset charset) throws IOException {
        return new C0160o00Oo0oo(new InputStreamReader(inputStream, iIiiLi1LllI.illlI1lLIL(charset)));
    }

    public static void IilliIIIlI1ll(InputStream inputStream, Writer writer, String str) throws IOException {
        IIIlll1lll(inputStream, writer, iIiiLi1LllI.i1LIL11l(str));
    }

    public static int Il1llillili(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static void IlL1iIiii(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection != null) {
            if (str == null) {
                str = System.lineSeparator();
            }
            Charset illlI1lLIL2 = iIiiLi1LllI.illlI1lLIL(charset);
            for (Object next : collection) {
                if (next != null) {
                    outputStream.write(next.toString().getBytes(illlI1lLIL2));
                }
                outputStream.write(str.getBytes(illlI1lLIL2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r2 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        r0.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] IlLLlIi1iI1li(java.net.URLConnection r2) throws java.io.IOException {
        /*
            java.io.InputStream r2 = r2.getInputStream()
            byte[] r0 = iLlI1iL1lIIL(r2)     // Catch:{ all -> 0x000e }
            if (r2 == 0) goto L_0x000d
            r2.close()
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r1 = move-exception
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r2 = move-exception
            r0.addSuppressed(r2)
        L_0x001b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.IlLLlIi1iI1li(java.net.URLConnection):byte[]");
    }

    public static boolean IliiLiLliIl(Reader reader, Reader reader2) throws IOException {
        boolean z;
        boolean z2 = true;
        if (reader == reader2) {
            return true;
        }
        if (reader == null) {
            z = true;
        } else {
            z = false;
        }
        if (reader2 != null) {
            z2 = false;
        }
        if (z2 ^ z) {
            return false;
        }
        BufferedReader IIlLLll1ll1 = IIlLLll1ll1(reader);
        BufferedReader IIlLLll1ll12 = IIlLLll1ll1(reader2);
        String readLine = IIlLLll1ll1.readLine();
        String readLine2 = IIlLLll1ll12.readLine();
        while (readLine != null && readLine.equals(readLine2)) {
            readLine = IIlLLll1ll1.readLine();
            readLine2 = IIlLLll1ll12.readLine();
        }
        return Objects.equals(readLine, readLine2);
    }

    public static byte[] Ilili11iLIl(URI uri) throws IOException {
        return iiL1l1iLliL(uri.toURL());
    }

    public static List<String> IllLlI1IiIL(InputStream inputStream, Charset charset) throws IOException {
        return ilLIlL1ILi(new InputStreamReader(inputStream, iIiiLi1LllI.illlI1lLIL(charset)));
    }

    @Deprecated
    public static void i111iLiiIIill(Reader reader) {
        I1iIiIi(reader);
    }

    public static InputStream i11iLLllliI(InputStream inputStream) throws IOException {
        return iIliIIiiI.ILIiLLLL1iiii(inputStream);
    }

    public static boolean i11liIIl11Ii1(InputStream inputStream, InputStream inputStream2) throws IOException {
        boolean z;
        boolean z2;
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream == null) {
            z = true;
        } else {
            z = false;
        }
        if (inputStream2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        BufferedInputStream iiI1L1iI2 = iiI1L1iI(inputStream);
        BufferedInputStream iiI1L1iI3 = iiI1L1iI(inputStream2);
        for (int read = iiI1L1iI2.read(); -1 != read; read = iiI1L1iI2.read()) {
            if (read != iiI1L1iI3.read()) {
                return false;
            }
        }
        if (iiI1L1iI3.read() == -1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static void i1I1l11IL(String str, OutputStream outputStream) throws IOException {
        I1lilLill1I(str, outputStream, Charset.defaultCharset());
    }

    public static void i1II1iL(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        ili11iILI1l(charSequence, outputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    @Deprecated
    public static byte[] i1IL1lILl1L1I(String str) throws IOException {
        return str.getBytes(Charset.defaultCharset());
    }

    public static void i1L1lLllLLlIi(Closeable closeable, Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (consumer != null) {
                    consumer.accept(e);
                }
            }
        }
    }

    public static void i1L1llI1LlL1l(Reader reader, long j) throws IOException {
        long I1IILIil1lLlL = I1IILIil1lLlL(reader, j);
        if (I1IILIil1lLlL != j) {
            throw new EOFException("Chars to skip: " + j + " actual: " + I1IILIil1lLlL);
        }
    }

    public static BufferedInputStream i1LIL11l(InputStream inputStream, int i) {
        Objects.requireNonNull(inputStream, "inputStream");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i);
    }

    public static int i1LiiIlIL1I(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static byte[] i1LlL1iILLLil(InputStream inputStream, long j) throws IOException {
        if (j <= 2147483647L) {
            return I11iLiiIi(inputStream, (int) j);
        }
        throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j);
    }

    public static int i1i1111LLILli(Reader reader, char[] cArr) throws IOException {
        return IiiIIil1l(reader, cArr, 0, cArr.length);
    }

    public static int i1iI1iiLL1(Reader reader, Writer writer) throws IOException {
        long illi1LIILLiL = illi1LIILLiL(reader, writer);
        if (illi1LIILLiL > 2147483647L) {
            return -1;
        }
        return (int) illi1LIILLiL;
    }

    public static void i1iLi1lIlL(char[] cArr, OutputStream outputStream, String str) throws IOException {
        ILiIL1Lll(cArr, outputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    public static long i1iLlIill1I(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        if (inputStream != null) {
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            }
        }
        return j;
    }

    public static long i1iiLIil1ILi(InputStream inputStream) throws IOException {
        return i1iLlIill1I(inputStream, C0232o00oOOo0.i1LIL11l, iilLiIIIi11i);
    }

    public static String i1iliILILi(URL url, String str) throws IOException {
        return IillLI1llIL1(url, iIiiLi1LllI.i1LIL11l(str));
    }

    @Deprecated
    public static String iI1LILIILLI(byte[] bArr) throws IOException {
        return new String(bArr, Charset.defaultCharset());
    }

    public static void iILiI1lll(Closeable... closeableArr) throws IOException {
        if (closeableArr != null) {
            for (Closeable IiIIlIL2 : closeableArr) {
                IiIIlIL(IiIIlIL2);
            }
        }
    }

    public static char[] iILil1IilI1l(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        i1iI1iiLL1(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static URL iILlLIlli(String str, ClassLoader classLoader) throws IOException {
        URL url;
        if (classLoader == null) {
            url = C0130o00O0o00.class.getResource(str);
        } else {
            url = classLoader.getResource(str);
        }
        if (url != null) {
            return url;
        }
        throw new IOException("Resource not found: " + str);
    }

    public static void iIi1LiiIIl1(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, iIiiLi1LllI.illlI1lLIL(charset)));
        }
    }

    public static long iIiL11iL(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                byte[] bArr = iilLiIIIi11i;
                long read = (long) inputStream.read(bArr, 0, (int) Math.min(j2, (long) bArr.length));
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String iIiiI1IILilLl(java.io.Reader r2) throws java.io.IOException {
        /*
            top.tntok.autobot.o0OOo0oo r0 = new top.tntok.autobot.o0OOo0oo
            r0.<init>()
            i1iI1iiLL1(r2, r0)     // Catch:{ all -> 0x0010 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0010 }
            r0.close()
            return r2
        L_0x0010:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x001b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.iIiiI1IILilLl(java.io.Reader):java.lang.String");
    }

    public static String iIliIIiiI(byte[] bArr, String str) throws IOException {
        return new String(bArr, iIiiLi1LllI.i1LIL11l(str));
    }

    @Deprecated
    public static void iL1LIlIlI(OutputStream outputStream) {
        I1iIiIi(outputStream);
    }

    public static void iL1ilIi1l11L1(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            ILLL1LlLLilL(charSequence.toString(), writer);
        }
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
    public static byte[] iL1lL1LL(java.io.Reader r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            top.tntok.autobot.iIliIIiiI r0 = new top.tntok.autobot.iIliIIiiI
            r0.<init>()
            IIlLill(r1, r0, r2)     // Catch:{ all -> 0x0010 }
            byte[] r1 = r0.IiIl11II()     // Catch:{ all -> 0x0010 }
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
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.iL1lL1LL(java.io.Reader, java.nio.charset.Charset):byte[]");
    }

    public static void iLI1L1l1li(Reader reader, char[] cArr, int i, int i2) throws IOException {
        int IiiIIil1l = IiiIIil1l(reader, cArr, i, i2);
        if (IiiIIil1l != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + IiiIIil1l);
        }
    }

    @Deprecated
    public static void iLII1iIiLLL1(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0004 A[LOOP:0: B:1:0x0004->B:4:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int iLIIl1IliLlLI(java.nio.channels.ReadableByteChannel r3, java.nio.ByteBuffer r4) throws java.io.IOException {
        /*
            int r0 = r4.remaining()
        L_0x0004:
            int r1 = r4.remaining()
            if (r1 <= 0) goto L_0x0011
            int r1 = r3.read(r4)
            r2 = -1
            if (r2 != r1) goto L_0x0004
        L_0x0011:
            int r3 = r4.remaining()
            int r0 = r0 - r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.iLIIl1IliLlLI(java.nio.channels.ReadableByteChannel, java.nio.ByteBuffer):int");
    }

    public static int iLILliI1(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int read = inputStream.read(bArr, (i2 - i3) + i, i3);
                if (-1 == read) {
                    break;
                }
                i3 -= read;
            }
            return i2 - i3;
        }
        throw new IllegalArgumentException("Length must not be negative: " + i2);
    }

    public static BufferedWriter iLLLILIiLi1Ii(Writer writer, int i) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i);
    }

    public static char[] iLLi1LIi(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        IIIlll1lll(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    @Deprecated
    public static InputStream iLLlLIIliLl(String str) {
        return iil1ILLLi11(str, Charset.defaultCharset());
    }

    public static void iLiI1Llil(Reader reader, char[] cArr) throws IOException {
        iLI1L1l1li(reader, cArr, 0, cArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] iLlI1iL1lIIL(java.io.InputStream r2) throws java.io.IOException {
        /*
            top.tntok.autobot.iIliIIiiI r0 = new top.tntok.autobot.iIliIIiiI
            r0.<init>()
            I1I11Il1(r2, r0)     // Catch:{ all -> 0x0010 }
            byte[] r2 = r0.IiIl11II()     // Catch:{ all -> 0x0010 }
            r0.close()
            return r2
        L_0x0010:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x001b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.iLlI1iL1lIIL(java.io.InputStream):byte[]");
    }

    public static int iLlIllll(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    @Deprecated
    public static String iLliII11iI(InputStream inputStream) throws IOException {
        return iliiLi1I(inputStream, Charset.defaultCharset());
    }

    public static BufferedInputStream iiI1L1iI(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    @Deprecated
    public static void iiIIl1I(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        ilLILlL(stringBuffer, outputStream, (String) null);
    }

    public static InputStream iiIiili(CharSequence charSequence, String str) throws IOException {
        return I11lLL1L11Lil(charSequence, iIiiLi1LllI.i1LIL11l(str));
    }

    public static BufferedReader iiIliillii(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static byte[] iiL1l1iLliL(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        try {
            return IlLLlIi1iI1li(openConnection);
        } finally {
            IiiL1llIIi(openConnection);
        }
    }

    @Deprecated
    public static void iiLIIiIli(Selector selector) {
        I1iIiIi(selector);
    }

    public static String iiLl11ILL(String str, Charset charset, ClassLoader classLoader) throws IOException {
        return IillLI1llIL1(iILlLIlli(str, classLoader), charset);
    }

    public static boolean iiiiI1iILL11I(Reader reader, Reader reader2) throws IOException {
        boolean z;
        boolean z2;
        if (reader == reader2) {
            return true;
        }
        if (reader == null) {
            z = true;
        } else {
            z = false;
        }
        if (reader2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        BufferedReader IIlLLll1ll1 = IIlLLll1ll1(reader);
        BufferedReader IIlLLll1ll12 = IIlLLll1ll1(reader2);
        for (int read = IIlLLll1ll1.read(); -1 != read; read = IIlLLll1ll1.read()) {
            if (read != IIlLLll1ll12.read()) {
                return false;
            }
        }
        if (IIlLLll1ll12.read() == -1) {
            return true;
        }
        return false;
    }

    public static InputStream iil1ILLLi11(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(iIiiLi1LllI.illlI1lLIL(charset)));
    }

    public static void iilLiIIIi11i(Closeable closeable, oOO00O<IOException> ooo00o) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (ooo00o != null) {
                    ooo00o.accept(e);
                }
            }
        }
    }

    public static BufferedReader iilLil1i11I1(Reader reader, int i) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    @Deprecated
    public static InputStream iillllIL(CharSequence charSequence) {
        return I11lLL1L11Lil(charSequence, Charset.defaultCharset());
    }

    @Deprecated
    public static char[] il11iII1(InputStream inputStream) throws IOException {
        return iLLi1LIi(inputStream, Charset.defaultCharset());
    }

    public static BufferedOutputStream il1LilLllii(OutputStream outputStream, int i) {
        Objects.requireNonNull(outputStream, "outputStream");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i);
    }

    public static long il1l1IlL(Reader reader, Appendable appendable, CharBuffer charBuffer) throws IOException {
        long j = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 == read) {
                return j;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, read);
            j += (long) read;
        }
    }

    public static byte[] ilIILlI1l11i(String str, ClassLoader classLoader) throws IOException {
        return iiL1l1iLliL(iILlLIlli(str, classLoader));
    }

    @Deprecated
    public static void ilLILlL(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(iIiiLi1LllI.i1LIL11l(str)));
        }
    }

    public static List<String> ilLIlL1ILi(Reader reader) throws IOException {
        BufferedReader IIlLLll1ll1 = IIlLLll1ll1(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = IIlLLll1ll1.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static long ilLIlLiIILl1(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j, (long) iilLiIIIi11i.length));
            long j2 = j;
            while (j2 > 0) {
                allocate.position(0);
                allocate.limit((int) Math.min(j2, (long) iilLiIIIi11i.length));
                int read = readableByteChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                j2 -= (long) read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
    }

    public static InputStream ilLilIL(InputStream inputStream, int i) throws IOException {
        return iIliIIiiI.i1L1llI1LlL1l(inputStream, i);
    }

    public static void ilLlL1i1L(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void ili11iILI1l(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            I1lilLill1I(charSequence.toString(), outputStream, charset);
        }
    }

    public static char[] iliiI1Ii1iIl(InputStream inputStream, String str) throws IOException {
        return iLLi1LIi(inputStream, iIiiLi1LllI.i1LIL11l(str));
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
    public static java.lang.String iliiLi1I(java.io.InputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            top.tntok.autobot.o0OOo0oo r0 = new top.tntok.autobot.o0OOo0oo
            r0.<init>()
            IIIlll1lll(r1, r0, r2)     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0010 }
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
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0130o00O0o00.iliiLi1I(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    public static String iliilLIIilill(InputStream inputStream, String str) throws IOException {
        return iliiLi1I(inputStream, iIiiLi1LllI.i1LIL11l(str));
    }

    public static long iliilLllIl1(InputStream inputStream, OutputStream outputStream) throws IOException {
        return IIlL1llI1(inputStream, outputStream, 8192);
    }

    public static byte[] illi1IL1(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        ILiliIiI(inputStream, bArr, 0, i);
        return bArr;
    }

    public static long illi1LIILLiL(Reader reader, Writer writer) throws IOException {
        return IiiIlLl1il1i(reader, writer, new char[8192]);
    }

    public static long illiiliIILI(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        return ILllI11(inputStream, outputStream, j, j2, new byte[8192]);
    }

    public static BufferedOutputStream illlI1lLIL(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream);
    }
}
