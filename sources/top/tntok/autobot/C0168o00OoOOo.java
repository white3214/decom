package top.tntok.autobot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: top.tntok.autobot.o00OoOOo  reason: case insensitive filesystem */
public class C0168o00OoOOo {
    public static MessageDigest i1LIL11l;
    public static char[] iiI1L1iI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        i1LIL11l = null;
        try {
            i1LIL11l = MessageDigest.getInstance(C0387o0OOoO0o.iiI1L1iI("ZKw/\n", "KegKaXYd6/o=\n"));
        } catch (NoSuchAlgorithmException e) {
            PrintStream printStream = System.err;
            printStream.println(C0168o00OoOOo.class.getName() + C0387o0OOoO0o.iiI1L1iI("1a3hFpFmCTimwNhC3llJW4ypMZZFno3TVWEVlFOemFCIqJpnmQtgNX1hSaZChIBXsKc=\n", "MCV88zbt7LQ=\n"));
            e.printStackTrace();
        }
    }

    public static String I11lLL1(String str) {
        return iLLLILIiLi1Ii(str.getBytes());
    }

    public static String i1LIL11l(byte[] bArr) {
        return illlI1lLIL(bArr, 0, bArr.length);
    }

    public static String iLLLILIiLi1Ii(byte[] bArr) {
        i1LIL11l.update(bArr);
        return i1LIL11l(i1LIL11l.digest());
    }

    public static void iiI1L1iI(byte b, StringBuffer stringBuffer) {
        char[] cArr = iiI1L1iI;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static String iiIliillii(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                i1LIL11l.update(bArr, 0, read);
            } else {
                fileInputStream.close();
                return i1LIL11l(i1LIL11l.digest());
            }
        }
    }

    public static String iilLil1i11I1(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        i1LIL11l.update(fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length()));
        fileInputStream.close();
        return i1LIL11l(i1LIL11l.digest());
    }

    public static boolean il1LilLllii(String str, String str2) {
        return I11lLL1(str).equals(str2);
    }

    public static String illlI1lLIL(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            iiI1L1iI(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }
}
