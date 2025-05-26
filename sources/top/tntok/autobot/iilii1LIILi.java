package top.tntok.autobot;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public abstract class iilii1LIILi {
    public static iilii1LIILi i1LIL11l(X509TrustManager x509TrustManager) {
        return C0292o0O0O0oO.I1iIiIi().il1LilLllii(x509TrustManager);
    }

    public static iilii1LIILi illlI1lLIL(X509Certificate... x509CertificateArr) {
        return new iliiI1Ii1iIl(new iLLi1LIi(x509CertificateArr));
    }

    public abstract List<Certificate> iiI1L1iI(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
