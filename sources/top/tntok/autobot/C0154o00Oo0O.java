package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: top.tntok.autobot.o00Oo0O  reason: case insensitive filesystem */
public final class C0154o00Oo0O extends C0292o0O0O0oO {
    public final Method iiIliillii;
    public final Method iilLil1i11I1;

    public C0154o00Oo0O(Method method, Method method2) {
        this.iiIliillii = method;
        this.iilLil1i11I1 = method2;
    }

    public static C0154o00Oo0O iiiiI1iILL11I() {
        try {
            return new C0154o00Oo0O(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", (Class[]) null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public X509TrustManager i11liIIl11Ii1(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Nullable
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        try {
            String str = (String) this.iilLil1i11I1.invoke(sSLSocket, (Object[]) null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, String str, List<C0297o0O0Oo> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> i1LIL11l = C0292o0O0O0oO.i1LIL11l(list);
            this.iiIliillii.invoke(sSLParameters, new Object[]{i1LIL11l.toArray(new String[i1LIL11l.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }
}
