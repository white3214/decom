package top.tntok.autobot;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: top.tntok.autobot.o0O0O0oO  reason: case insensitive filesystem */
public class C0292o0O0O0oO {
    public static final int i1LIL11l = 4;
    public static final C0292o0O0O0oO iiI1L1iI = iILiI1lll();
    public static final Logger il1LilLllii = Logger.getLogger(C0240o00oOoOO.class.getName());
    public static final int illlI1lLIL = 5;

    public static C0292o0O0O0oO I1iIiIi() {
        return iiI1L1iI;
    }

    public static boolean I1l1iIll1lIi1() {
        if ("conscrypt".equals(C0487o0OooooO.IilL11ii1I1Il("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public static boolean Ii1liIIIiLi() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static C0292o0O0O0oO IiiL1llIIi() {
        i1II1LilLiII iiiiI1iILL11I;
        if (I1l1iIll1lIi1() && (iiiiI1iILL11I = i1II1LilLiII.iiiiI1iILL11I()) != null) {
            return iiiiI1iILL11I;
        }
        C0154o00Oo0O iiiiI1iILL11I2 = C0154o00Oo0O.iiiiI1iILL11I();
        if (iiiiI1iILL11I2 != null) {
            return iiiiI1iILL11I2;
        }
        C0292o0O0O0oO iiiiI1iILL11I3 = C0155o00Oo0O0.iiiiI1iILL11I();
        if (iiiiI1iILL11I3 != null) {
            return iiiiI1iILL11I3;
        }
        return new C0292o0O0O0oO();
    }

    public static List<String> i1LIL11l(List<C0297o0O0Oo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0297o0O0Oo o0o0oo = list.get(i);
            if (o0o0oo != C0297o0O0Oo.HTTP_1_0) {
                arrayList.add(o0o0oo.toString());
            }
        }
        return arrayList;
    }

    @Nullable
    public static <T> T i1iiLIil1ILi(Object obj, Class<T> cls, String str) {
        Object i1iiLIil1ILi;
        Class cls2 = obj.getClass();
        while (true) {
            Class<Object> cls3 = Object.class;
            if (cls2 != cls3) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        return null;
                    }
                    return cls.cast(obj2);
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            } else if (str.equals("delegate") || (i1iiLIil1ILi = i1iiLIil1ILi(obj, cls3, "delegate")) == null) {
                return null;
            } else {
                return i1iiLIil1ILi(i1iiLIil1ILi, cls, str);
            }
        }
    }

    public static C0292o0O0O0oO iILiI1lll() {
        if (Ii1liIIIiLi()) {
            return iilLiIIIi11i();
        }
        return IiiL1llIIi();
    }

    public static C0292o0O0O0oO iilLiIIIi11i() {
        C0292o0O0O0oO I1I11Il1 = IILiIL1i11Li.I1I11Il1();
        if (I1I11Il1 != null) {
            return I1I11Il1;
        }
        C0292o0O0O0oO I1I11Il12 = IIlLill.I1I11Il1();
        if (I1I11Il12 != null) {
            return I1I11Il12;
        }
        throw new NullPointerException("No platform found on Android");
    }

    public static byte[] iilLil1i11I1(List<C0297o0O0Oo> list) {
        IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0297o0O0Oo o0o0oo = list.get(i);
            if (o0o0oo != C0297o0O0Oo.HTTP_1_0) {
                iiILIlLLiIL.IillLillLLIii(o0o0oo.toString().length());
                iiILIlLLiIL.illiiliIILI(o0o0oo.toString());
            }
        }
        return iiILIlLLiIL.I1IIIi1i1ILl();
    }

    public SSLContext IL1lILLLL1L() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public void ILl1iII11Ll1(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        iiLIIiIli(5, str, (Throwable) obj);
    }

    public void IiIIlIL(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public boolean IilL11ii1I1Il(String str) {
        return true;
    }

    @Nullable
    public Object i111iLiiIIill(String str) {
        if (il1LilLllii.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    @Nullable
    public X509TrustManager i11liIIl11Ii1(SSLSocketFactory sSLSocketFactory) {
        try {
            Object i1iiLIil1ILi = i1iiLIil1ILi(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (i1iiLIil1ILi == null) {
                return null;
            }
            return (X509TrustManager) i1iiLIil1ILi(i1iiLIil1ILi, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public String i1L1lLllLLlIi() {
        return "OkHttp";
    }

    @Nullable
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        return null;
    }

    public C0454o0OoOo0o iiIliillii(X509TrustManager x509TrustManager) {
        return new iLLi1LIi(x509TrustManager.getAcceptedIssuers());
    }

    public void iiLIIiIli(int i, String str, @Nullable Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        il1LilLllii.log(level, str, th);
    }

    public iilii1LIILi il1LilLllii(X509TrustManager x509TrustManager) {
        return new iliiI1Ii1iIl(iiIliillii(x509TrustManager));
    }

    public iilii1LIILi illlI1lLIL(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager i11liIIl11Ii1 = i11liIIl11Ii1(sSLSocketFactory);
        if (i11liIIl11Ii1 != null) {
            return il1LilLllii(i11liIIl11Ii1);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + I1iIiIi() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void I11lLL1(SSLSocketFactory sSLSocketFactory) {
    }

    public void iiI1L1iI(SSLSocket sSLSocket) {
    }

    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, @Nullable String str, List<C0297o0O0Oo> list) throws IOException {
    }
}
