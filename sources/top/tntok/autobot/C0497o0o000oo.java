package top.tntok.autobot;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: top.tntok.autobot.o0o000oo  reason: case insensitive filesystem */
public class C0497o0o000oo {
    public static Map<String, byte[]> i1LIL11l = null;
    public static final Map<String, String> iiI1L1iI;

    static {
        HashMap hashMap = new HashMap();
        iiI1L1iI = hashMap;
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("FwNRBw==\n", "f3c8a7gM3mk=\n"), C0387o0OOoO0o.iiI1L1iI("E3ZDpzmV88YL\n", "ZxM70xb9h6s=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("qj36\n", "wkmX0ClcGiw=\n"), C0387o0OOoO0o.iiI1L1iI("Tm9TQ2Whs8dW\n", "OgorN0rJx6o=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("XZCK\n", "PuP5aRXkDg0=\n"), C0387o0OOoO0o.iiI1L1iI("K1QvV1fq3hI=\n", "XzFXI3iJrWE=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("rC0=\n", "xl7cH1vvF14=\n"), C0387o0OOoO0o.iiI1L1iI("jESghscKCdyEW77FxAgeyZ5XooPeHQ==\n", "7TTQ6q5paKg=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("tKI25g==\n", "3tFZiPReoLU=\n"), C0387o0OOoO0o.iiI1L1iI("GcR0cvflPuQR22ox9PUw/g==\n", "eLQEHp6GX5A=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("WRhn\n", "KXYAxZDfnpM=\n"), C0387o0OOoO0o.iiI1L1iI("9w3K8vbRGeb5\n", "nmCrlZP+aYg=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("sr85\n", "2M9eTBZ/KBU=\n"), C0387o0OOoO0o.iiI1L1iI("SMCviB8fs7dEyg==\n", "Ia3O73ow2cc=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("axQPtQ==\n", "AWRq0gBhZmQ=\n"), C0387o0OOoO0o.iiI1L1iI("MUu7/34KUso9QQ==\n", "WCbamBslOLo=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("your\n", "o+jEB/tsUoI=\n"), C0387o0OOoO0o.iiI1L1iI("jqTXrEWRq92Oqtml\n", "58m2yyC+0/A=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("7yrv\n", "iEOJA89t5q8=\n"), C0387o0OOoO0o.iiI1L1iI("G5x8SxVMyBMU\n", "cvEdLHBjr3o=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("pFwD\n", "1ypkP1VbrhU=\n"), C0387o0OOoO0o.iiI1L1iI("iWALLUiJ5uWHJhInQQ==\n", "4A1qSi2mlZM=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("y8G8VA==\n", "vK7aMhm5faA=\n"), C0387o0OOoO0o.iiI1L1iI("Yg9WI/tKDEFi\n", "BGA4V9Q9Yyc=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("AJdgnZ8=\n", "d/gG+62aUB4=\n"), C0387o0OOoO0o.iiI1L1iI("4Xj9hC82M4bhJQ==\n", "hxeT8ABBXOA=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("YcvW\n", "Fb+wAJOSCeg=\n"), C0387o0OOoO0o.iiI1L1iI("ICSIICJHxvQ=\n", "RkvmVA0zspI=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("ZWO+\n", "ChfYEI+fXGk=\n"), C0387o0OOoO0o.iiI1L1iI("+IqFf6CfdwI=\n", "nuXrC4/wA2Q=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("mfv9\n", "9IvJy6+P65s=\n"), C0387o0OOoO0o.iiI1L1iI("Dex5Eln5kp9P\n", "e4UddzbW/+8=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("Qmm1AA==\n", "NQzXbdbb3Bg=\n"), C0387o0OOoO0o.iiI1L1iI("6F9iw9t5atP8Ww==\n", "njYGprRWHbY=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("Mmte\n", "XQw57GRRhmA=\n"), C0387o0OOoO0o.iiI1L1iI("TA89PWapymVd\n", "OmZZWAmGpQI=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("6Gqy\n", "nwvEy5h5ohI=\n"), C0387o0OOoO0o.iiI1L1iI("mJv8fFyAhy2P\n", "+e6YFTOv8Ew=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("TuXZ\n", "I5XqzaWRZYs=\n"), C0387o0OOoO0o.iiI1L1iI("3h/Pkz0yKR3aDQ==\n", "v2qr+lIdRG0=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("zxGi\n", "t3zOBPAw/LI=\n"), C0387o0OOoO0o.iiI1L1iI("9GtT+WdqgHb8dE26dmSN\n", "lRsjlQ4J4QI=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("hn9a\n", "9hs86GE7UV8=\n"), C0387o0OOoO0o.iiI1L1iI("QEQ6VkFqj4hIWyQVWG2I\n", "ITRKOigJ7vw=\n"));
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("wzSo\n", "uV3YmRpjiaE=\n"), C0387o0OOoO0o.iiI1L1iI("bp+owKlJm05mgLaDukOK\n", "D+/YrMAq+jo=\n"));
    }

    public static String i1LIL11l(String str) {
        String str2 = iiI1L1iI.get(str.substring(str.lastIndexOf(46) + 1).toLowerCase());
        if (!C0391o0OOoOo0.iiI1L1iI(str2)) {
            return str2;
        }
        return C0387o0OOoO0o.iiI1L1iI("W/VpLukM1jpT6ndt7wzDK06oajbyCtYj\n", "OoUZQoBvt04=\n");
    }

    public static byte[] iiI1L1iI(String str) {
        return Base64.decode(str, 0);
    }

    public static byte[] iiIliillii(String str) throws IOException {
        File file = new File(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Map<String, byte[]> iilLil1i11I1(byte[] bArr) {
        ZipInputStream zipInputStream;
        ByteArrayInputStream byteArrayInputStream;
        IOException e;
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                zipInputStream = new ZipInputStream(byteArrayInputStream);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        hashMap.put(nextEntry.getName(), byteArrayOutputStream.toByteArray());
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            e.printStackTrace();
                            C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream);
                            C0130o00O0o00.IL1lILLLL1L(zipInputStream);
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (IOException e3) {
                e = e3;
                zipInputStream = null;
                e.printStackTrace();
                C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream);
                C0130o00O0o00.IL1lILLLL1L(zipInputStream);
                return hashMap;
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = null;
                byteArrayInputStream2 = byteArrayInputStream;
                C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream2);
                C0130o00O0o00.IL1lILLLL1L(zipInputStream);
                throw th;
            }
        } catch (IOException e4) {
            byteArrayInputStream = null;
            e = e4;
            zipInputStream = null;
            e.printStackTrace();
            C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream);
            C0130o00O0o00.IL1lILLLL1L(zipInputStream);
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            zipInputStream = null;
            C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream2);
            C0130o00O0o00.IL1lILLLL1L(zipInputStream);
            throw th;
        }
        C0130o00O0o00.IL1lILLLL1L(byteArrayInputStream);
        C0130o00O0o00.IL1lILLLL1L(zipInputStream);
        return hashMap;
    }

    public static void il1LilLllii(String[] strArr) {
        try {
            byte[] iiIliillii = iiIliillii(C0387o0OOoO0o.iiI1L1iI("zwpq1uwi9VE=\n", "u28ZosJWjSU=\n"));
            PrintStream printStream = System.out;
            printStream.println(C0387o0OOoO0o.iiI1L1iI("SBcGzpPw7lAVZA68zs6WGiQebpako6toRgsDzL326UM0\n", "roGBKihGBv8=\n") + iiIliillii.length);
            Map<String, byte[]> iilLil1i11I1 = iilLil1i11I1(iiIliillii(C0387o0OOoO0o.iiI1L1iI("73zHp9obqQU=\n", "mxm00/RhwHU=\n")));
            printStream.println(C0387o0OOoO0o.iiI1L1iI("eGfod0fgd4iZmFD4GpN/+sSmKLIr6R/Qrss00kTmW4q0qVzsF5Bl3M2SIg==\n", "Ii64V6F28Gw=\n") + iilLil1i11I1.size());
            for (String next : iilLil1i11I1.keySet()) {
                PrintStream printStream2 = System.out;
                printStream2.println(C0387o0OOoO0o.iiI1L1iI("+A7rAO2qZ54=\n", "Hphs5FYcXb4=\n") + next + C0387o0OOoO0o.iiI1L1iI("Y6D003BqYABrrcN7p6wfAA==\n", "jBx4njknJSA=\n") + i1LIL11l(next));
            }
        } catch (IOException e) {
            PrintStream printStream3 = System.err;
            printStream3.println(C0387o0OOoO0o.iiI1L1iI("D5oqc0ZIMHlS6SIBGFppPl2pl7c=\n", "6Qytl/3+2NY=\n") + e.getMessage());
        }
    }

    public static void illlI1lLIL() {
        i1LIL11l = iilLil1i11I1(iiI1L1iI(C0488o0o00.iiI1L1iI()));
    }
}
