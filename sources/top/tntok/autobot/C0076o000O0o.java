package top.tntok.autobot;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* renamed from: top.tntok.autobot.o000O0o  reason: case insensitive filesystem */
public class C0076o000O0o extends Writer {
    public final Writer i1LIL11l;

    public C0076o000O0o(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.Writer iiI1L1iI(java.io.File r3, java.lang.Object r4, boolean r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "encoding"
            java.util.Objects.requireNonNull(r4, r0)
            boolean r0 = r3.exists()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003b, RuntimeException -> 0x0039 }
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x003b, RuntimeException -> 0x0039 }
            boolean r5 = r4 instanceof java.nio.charset.Charset     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            if (r5 == 0) goto L_0x0025
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            java.nio.charset.Charset r4 = (java.nio.charset.Charset) r4     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            return r5
        L_0x0020:
            r4 = move-exception
        L_0x0021:
            r1 = r2
            goto L_0x003c
        L_0x0023:
            r4 = move-exception
            goto L_0x0021
        L_0x0025:
            boolean r5 = r4 instanceof java.nio.charset.CharsetEncoder     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            if (r5 == 0) goto L_0x0031
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            java.nio.charset.CharsetEncoder r4 = (java.nio.charset.CharsetEncoder) r4     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            return r5
        L_0x0031:
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0020 }
            return r5
        L_0x0039:
            r4 = move-exception
            goto L_0x003c
        L_0x003b:
            r4 = move-exception
        L_0x003c:
            top.tntok.autobot.C0130o00O0o00.IiIIlIL(r1)     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r5 = move-exception
            r4.addSuppressed(r5)
        L_0x0044:
            if (r0 != 0) goto L_0x0049
            top.tntok.autobot.C0086o000OoO.IL1IiilLlLI(r3)
        L_0x0049:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0076o000O0o.iiI1L1iI(java.io.File, java.lang.Object, boolean):java.io.Writer");
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public void flush() throws IOException {
        this.i1LIL11l.flush();
    }

    public void write(int i) throws IOException {
        this.i1LIL11l.write(i);
    }

    public C0076o000O0o(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }

    public void write(char[] cArr) throws IOException {
        this.i1LIL11l.write(cArr);
    }

    public C0076o000O0o(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        this.i1LIL11l.write(cArr, i, i2);
    }

    public C0076o000O0o(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    public void write(String str) throws IOException {
        this.i1LIL11l.write(str);
    }

    public C0076o000O0o(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    public void write(String str, int i, int i2) throws IOException {
        this.i1LIL11l.write(str, i, i2);
    }

    public C0076o000O0o(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    public C0076o000O0o(File file, String str) throws IOException {
        this(file, str, false);
    }

    public C0076o000O0o(File file, String str, boolean z) throws IOException {
        this.i1LIL11l = iiI1L1iI(file, str, z);
    }

    public C0076o000O0o(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public C0076o000O0o(File file, Charset charset, boolean z) throws IOException {
        this.i1LIL11l = iiI1L1iI(file, charset, z);
    }

    public C0076o000O0o(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public C0076o000O0o(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this.i1LIL11l = iiI1L1iI(file, charsetEncoder, z);
    }
}
