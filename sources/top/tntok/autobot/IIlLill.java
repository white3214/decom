package top.tntok.autobot;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class IIlLill extends C0292o0O0O0oO {
    public static final int iILiI1lll = 4000;
    public final Method I11lLL1;
    public final Method IiIIlIL;
    public final i1LIL11l IiiL1llIIi = i1LIL11l.i1LIL11l();
    public final Method iLLLILIiLi1Ii;
    public final Class<?> iiIliillii;
    public final Method iilLiIIIi11i;
    public final Class<?> iilLil1i11I1;

    public static final class i1LIL11l {
        public final Method i1LIL11l;
        public final Method iiI1L1iI;
        public final Method illlI1lLIL;

        public i1LIL11l(Method method, Method method2, Method method3) {
            this.iiI1L1iI = method;
            this.i1LIL11l = method2;
            this.illlI1lLIL = method3;
        }

        public static i1LIL11l i1LIL11l() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", (Class[]) null);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", (Class[]) null);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new i1LIL11l(method3, method, method2);
        }

        public Object iiI1L1iI(String str) {
            Method method = this.iiI1L1iI;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    this.i1LIL11l.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean illlI1lLIL(Object obj) {
            if (obj != null) {
                try {
                    this.illlI1lLIL.invoke(obj, (Object[]) null);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    public static final class iiI1L1iI extends iilii1LIILi {
        public final Method i1LIL11l;
        public final Object iiI1L1iI;

        public iiI1L1iI(Object obj, Method method) {
            this.iiI1L1iI = obj;
            this.i1LIL11l = method;
        }

        public boolean equals(Object obj) {
            return obj instanceof iiI1L1iI;
        }

        public int hashCode() {
            return 0;
        }

        public List<Certificate> iiI1L1iI(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.i1LIL11l.invoke(this.iiI1L1iI, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static final class illlI1lLIL implements C0454o0OoOo0o {
        public final Method i1LIL11l;
        public final X509TrustManager iiI1L1iI;

        public illlI1lLIL(X509TrustManager x509TrustManager, Method method) {
            this.i1LIL11l = method;
            this.iiI1L1iI = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof illlI1lLIL)) {
                return false;
            }
            illlI1lLIL illli1llil = (illlI1lLIL) obj;
            if (!this.iiI1L1iI.equals(illli1llil.iiI1L1iI) || !this.i1LIL11l.equals(illli1llil.i1LIL11l)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.iiI1L1iI.hashCode() + (this.i1LIL11l.hashCode() * 31);
        }

        public X509Certificate iiI1L1iI(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.i1LIL11l.invoke(this.iiI1L1iI, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    public IIlLill(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.iiIliillii = cls;
        this.iilLil1i11I1 = cls2;
        this.I11lLL1 = method;
        this.iLLLILIiLi1Ii = method2;
        this.IiIIlIL = method3;
        this.iilLiIIIi11i = method4;
    }

    @Nullable
    public static C0292o0O0O0oO I1I11Il1() {
        if (!C0292o0O0O0oO.Ii1liIIIiLi()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new IIlLill(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE}), cls2.getMethod("setHostname", new Class[]{String.class}), cls2.getMethod("getAlpnSelectedProtocol", (Class[]) null), cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int i1iI1iiLL1() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.SSLContext IL1lILLLL1L() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x0006 }
            r1 = 22
            if (r0 >= r1) goto L_0x000d
        L_0x0006:
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x000d }
            return r0
        L_0x000d:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0014 }
            return r0
        L_0x0014:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IIlLill.IL1lILLLL1L():javax.net.ssl.SSLContext");
    }

    public void ILl1iII11Ll1(String str, Object obj) {
        if (!this.IiiL1llIIi.illlI1lLIL(obj)) {
            iiLIIiIli(5, str, (Throwable) null);
        }
    }

    public void IiIIlIL(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C0487o0OooooO.i1iI1iiLL1(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    public boolean IilL11ii1I1Il(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return IliiLiLliIl(str, cls, cls.getMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.IilL11ii1I1Il(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    public final boolean IliiLiLliIl(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return iiiiI1iILL11I(str, cls, obj);
        }
    }

    @Nullable
    public Object i111iLiiIIill(String str) {
        return this.IiiL1llIIi.iiI1L1iI(str);
    }

    @Nullable
    public X509TrustManager i11liIIl11Ii1(SSLSocketFactory sSLSocketFactory) {
        Object i1iiLIil1ILi = C0292o0O0O0oO.i1iiLIil1ILi(sSLSocketFactory, this.iiIliillii, "sslParameters");
        if (i1iiLIil1ILi == null) {
            try {
                i1iiLIil1ILi = C0292o0O0O0oO.i1iiLIil1ILi(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.i11liIIl11Ii1(sSLSocketFactory);
            }
        }
        Class cls = X509TrustManager.class;
        X509TrustManager x509TrustManager = (X509TrustManager) C0292o0O0O0oO.i1iiLIil1ILi(i1iiLIil1ILi, cls, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) C0292o0O0O0oO.i1iiLIil1ILi(i1iiLIil1ILi, cls, "trustManager");
    }

    @Nullable
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        if (!this.iilLil1i11I1.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.IiIIlIL.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, String str, List<C0297o0O0Oo> list) throws IOException {
        if (this.iilLil1i11I1.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.I11lLL1.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.iLLLILIiLi1Ii.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new AssertionError(e);
                }
            }
            this.iilLiIIIi11i.invoke(sSLSocket, new Object[]{C0292o0O0O0oO.iilLil1i11I1(list)});
        }
    }

    public C0454o0OoOo0o iiIliillii(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new illlI1lLIL(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.iiIliillii(x509TrustManager);
        }
    }

    public void iiLIIiIli(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + iILiI1lll);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public final boolean iiiiI1iILL11I(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", (Class[]) null).invoke(obj, (Object[]) null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.IilL11ii1I1Il(str);
        }
    }

    public iilii1LIILi il1LilLllii(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            Class<String> cls2 = String.class;
            return new iiI1L1iI(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls2, cls2}));
        } catch (Exception unused) {
            return super.il1LilLllii(x509TrustManager);
        }
    }
}
