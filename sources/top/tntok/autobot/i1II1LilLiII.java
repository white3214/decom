package top.tntok.autobot;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

public class i1II1LilLiII extends C0292o0O0O0oO {
    public static i1II1LilLiII iiiiI1iILL11I() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new i1II1LilLiII();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void I11lLL1(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public SSLContext IL1lILLLL1L() {
        try {
            return SSLContext.getInstance("TLSv1.3", IliiLiLliIl());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", IliiLiLliIl());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public final Provider IliiLiLliIl() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Nullable
    public X509TrustManager i11liIIl11Ii1(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.i11liIIl11Ii1(sSLSocketFactory);
        }
        try {
            Object i1iiLIil1ILi = C0292o0O0O0oO.i1iiLIil1ILi(sSLSocketFactory, Object.class, "sslParameters");
            if (i1iiLIil1ILi != null) {
                return (X509TrustManager) C0292o0O0O0oO.i1iiLIil1ILi(i1iiLIil1ILi, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Nullable
    public String iL1LIlIlI(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.iL1LIlIlI(sSLSocket);
    }

    public void iLLLILIiLi1Ii(SSLSocket sSLSocket, String str, List<C0297o0O0Oo> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0292o0O0O0oO.i1LIL11l(list).toArray(new String[0]));
            return;
        }
        super.iLLLILIiLi1Ii(sSLSocket, str, list);
    }
}
