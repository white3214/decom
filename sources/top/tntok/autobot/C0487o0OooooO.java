package top.tntok.autobot;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import top.tntok.autobot.C0094o000o000;

/* renamed from: top.tntok.autobot.o0OooooO  reason: case insensitive filesystem */
public final class C0487o0OooooO {
    public static final Charset I11lLL1 = Charset.forName(C0514o0o00oO.iilLiIIIi11i);
    public static final TimeZone IiIIlIL = TimeZone.getTimeZone("GMT");
    public static final Method IiiL1llIIi;
    public static final String[] i1LIL11l = new String[0];
    public static final Pattern iILiI1lll = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final Charset iLLLILIiLi1Ii = Charset.forName(C0514o0o00oO.IiiL1llIIi);
    public static final byte[] iiI1L1iI;
    public static final C0334o0O0ooOO iiIliillii;
    public static final Comparator<String> iilLiIIIi11i = new C0484o0OoooOo();
    public static final C0256o00oo0oO iilLil1i11I1 = C0256o00oo0oO.il1LilLllii(ili11iILI1l.I11lLL1("efbbbf"), ili11iILI1l.I11lLL1("feff"), ili11iILI1l.I11lLL1("fffe"), ili11iILI1l.I11lLL1("0000ffff"), ili11iILI1l.I11lLL1("ffff0000"));
    public static final o0O il1LilLllii;
    public static final C0094o000o000 illlI1lLIL = C0094o000o000.iILiI1lll(new String[0]);

    static {
        Class<Throwable> cls = Throwable.class;
        byte[] bArr = new byte[0];
        iiI1L1iI = bArr;
        Method method = null;
        il1LilLllii = o0O.iiLl11ILL((C0179o00OooO0) null, bArr);
        iiIliillii = C0334o0O0ooOO.iilLil1i11I1((C0179o00OooO0) null, bArr);
        try {
            method = cls.getDeclaredMethod("addSuppressed", new Class[]{cls});
        } catch (Exception unused) {
        }
        IiiL1llIIi = method;
    }

    public static void I11lLL1(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] I1I11Il1(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean I1IIIi1i1ILl(C0109o000oo00 o000oo00, C0109o000oo00 o000oo002) {
        if (!o000oo00.iL1LIlIlI().equals(o000oo002.iL1LIlIlI()) || o000oo00.il1l1IlL() != o000oo002.il1l1IlL() || !o000oo00.illi1LIILLiL().equals(o000oo002.illi1LIILLiL())) {
            return false;
        }
        return true;
    }

    public static boolean I1iIiIi(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    public static String I1l1iIll1lIi1(C0109o000oo00 o000oo00, boolean z) {
        String str;
        if (o000oo00.iL1LIlIlI().contains(":")) {
            str = "[" + o000oo00.iL1LIlIlI() + "]";
        } else {
            str = o000oo00.iL1LIlIlI();
        }
        if (!z && o000oo00.il1l1IlL() == C0109o000oo00.iiIliillii(o000oo00.illi1LIILLiL())) {
            return str;
        }
        return str + ":" + o000oo00.il1l1IlL();
    }

    public static int IIIlll1lll(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static ThreadFactory IILiIL1i11Li(String str, boolean z) {
        return new C0486o0Ooooo0(str, z);
    }

    public static /* synthetic */ Thread IIlL1llI1(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static List<C0090o000Ooo0> IIlLill(C0094o000o000 o000o000) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < o000o000.I1iIiIi(); i++) {
            arrayList.add(new C0090o000Ooo0(o000o000.iLLLILIiLi1Ii(i), o000o000.IL1lILLLL1L(i)));
        }
        return arrayList;
    }

    public static boolean IL111l1(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int IL1IiilLlLI(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static int IL1lILLLL1L(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    @SafeVarargs
    public static <T> List<T> ILl1iII11Ll1(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static boolean ILllI11(String str) {
        return iILiI1lll.matcher(str).matches();
    }

    public static String Ii1liIIIiLi(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void IiIIlIL(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!i1iI1iiLL1(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean IiiL1llIIi(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static String IilL11ii1I1Il(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return property;
            }
            return str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    public static boolean IilliIIIlI1ll(C0370o0OOOooO o0oooooo, int i, TimeUnit timeUnit) throws IOException {
        long j;
        long nanoTime = System.nanoTime();
        if (o0oooooo.timeout().iilLil1i11I1()) {
            j = o0oooooo.timeout().il1LilLllii() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        o0oooooo.timeout().iiIliillii(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            while (o0oooooo.IIlllIIi1ii(iiILIlLLiIL, 8192) != -1) {
                iiILIlLLiIL.IIL1Ll1I111();
            }
            if (j == Long.MAX_VALUE) {
                o0oooooo.timeout().iiI1L1iI();
                return true;
            }
            o0oooooo.timeout().iiIliillii(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                o0oooooo.timeout().iiI1L1iI();
                return false;
            }
            o0oooooo.timeout().iiIliillii(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                o0oooooo.timeout().iiI1L1iI();
            } else {
                o0oooooo.timeout().iiIliillii(nanoTime + j);
            }
            throw th;
        }
    }

    public static String IliiLiLliIl(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        while (i2 < bArr.length) {
            if (i2 == i) {
                iiILIlLLiIL.IillLillLLIii(58);
                i2 += i4;
                if (i2 == 16) {
                    iiILIlLLiIL.IillLillLLIii(58);
                }
            } else {
                if (i2 > 0) {
                    iiILIlLLiIL.IillLillLLIii(58);
                }
                iiILIlLLiIL.IL111l1((long) (((bArr[i2] & i1IL1lILl1L1I.iiI1L1iI) << 8) | (bArr[i2 + 1] & i1IL1lILl1L1I.iiI1L1iI)));
                i2 += 2;
            }
        }
        return iiILIlLLiIL.illi1IL1();
    }

    public static boolean i111iLiiIIill(C0370o0OOOooO o0oooooo, int i, TimeUnit timeUnit) {
        try {
            return IilliIIIlI1ll(o0oooooo, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static int i11liIIl11Ii1(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    @Nullable
    public static InetAddress i1L1lLllLLlIi(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !I1iIiIi(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int iILiI1lll2 = iILiI1lll(str.charAt(i));
                    if (iILiI1lll2 == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + iILiI1lll2;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 += 2;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static void i1LIL11l(Throwable th, Throwable th2) {
        Method method = IiiL1llIIi;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean i1iI1iiLL1(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static <K, V> Map<K, V> i1iiLIil1ILi(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int iILiI1lll(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int iL1LIlIlI(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static void iLLLILIiLi1Ii(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int iiIliillii(String str, long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static <T> List<T> iiLIIiIli(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static int iiiiI1iILL11I(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static String[] iilLiIIIi11i(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[(length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static void iilLil1i11I1(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static String il1LilLllii(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = i1L1lLllLLlIi(str, 0, str.length());
            } else {
                inetAddress = i1L1lLllLLlIi(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return IliiLiLliIl(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !IiiL1llIIi(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static X509TrustManager il1l1IlL() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    public static C0094o000o000 iliilLllIl1(List<C0090o000Ooo0> list) {
        C0094o000o000.iiI1L1iI iii1l1ii = new C0094o000o000.iiI1L1iI();
        for (C0090o000Ooo0 next : list) {
            C0139o00OO00o.iiI1L1iI.i1LIL11l(iii1l1ii, next.iiI1L1iI.ILiLII1ILi(), next.i1LIL11l.ILiLII1ILi());
        }
        return iii1l1ii.IiIIlIL();
    }

    public static String illiiliIILI(String str, int i, int i2) {
        int IIIlll1lll = IIIlll1lll(str, i, i2);
        return str.substring(IIIlll1lll, IL1IiilLlLI(str, IIIlll1lll, i2));
    }

    public static Charset illlI1lLIL(ILL1iL1LiiI iLL1iL1LiiI, Charset charset) throws IOException {
        int I1I11Il1 = iLL1iL1LiiI.I1I11Il1(iilLil1i11I1);
        if (I1I11Il1 == -1) {
            return charset;
        }
        if (I1I11Il1 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (I1I11Il1 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (I1I11Il1 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (I1I11Il1 == 3) {
            return I11lLL1;
        }
        if (I1I11Il1 == 4) {
            return iLLLILIiLi1Ii;
        }
        throw new AssertionError();
    }
}
