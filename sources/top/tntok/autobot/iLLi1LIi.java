package top.tntok.autobot;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class iLLi1LIi implements C0454o0OoOo0o {
    public final Map<X500Principal, Set<X509Certificate>> iiI1L1iI = new LinkedHashMap();

    public iLLi1LIi(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.iiI1L1iI.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.iiI1L1iI.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iLLi1LIi) || !((iLLi1LIi) obj).iiI1L1iI.equals(this.iiI1L1iI)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.iiI1L1iI.hashCode();
    }

    public X509Certificate iiI1L1iI(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.iiI1L1iI.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
