package top.tntok.autobot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.o0OOo0oO  reason: case insensitive filesystem */
public final class C0381o0OOo0oO {
    public static final int iiI1L1iI = 8192;

    public static String i1LIL11l(InputStream inputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        il1LilLllii(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString(str);
    }

    public static String iiI1L1iI(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        il1LilLllii(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString();
    }

    public static long iiIliillii(InputStream inputStream, OutputStream outputStream, boolean z, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else if (read > 0) {
                    j += (long) read;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, read);
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th3) {
                                r5.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                throw th;
            }
        }
        if (outputStream != null) {
            if (z) {
                outputStream.close();
            } else {
                outputStream.flush();
            }
        }
        inputStream.close();
        inputStream.close();
        if (outputStream != null) {
            outputStream.close();
        }
        return j;
    }

    public static long il1LilLllii(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return iiIliillii(inputStream, outputStream, z, new byte[8192]);
    }

    public static String illlI1lLIL(String str) {
        if (str != null) {
            if (str.indexOf(0) != -1) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != 0) {
                        sb.append(charAt);
                    } else {
                        sb.append("\\0");
                    }
                }
                throw new o00OO0O(str, "Invalid file name: " + sb);
            }
        }
        return str;
    }
}
