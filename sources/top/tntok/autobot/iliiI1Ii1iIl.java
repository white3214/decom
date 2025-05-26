package top.tntok.autobot;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class iliiI1Ii1iIl extends iilii1LIILi {
    public static final int i1LIL11l = 9;
    public final C0454o0OoOo0o iiI1L1iI;

    public iliiI1Ii1iIl(C0454o0OoOo0o o0oooo0o) {
        this.iiI1L1iI = o0oooo0o;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iliiI1Ii1iIl) || !((iliiI1Ii1iIl) obj).iiI1L1iI.equals(this.iiI1L1iI)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.iiI1L1iI.hashCode();
    }

    public List<Certificate> iiI1L1iI(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate iiI1L1iI2 = this.iiI1L1iI.iiI1L1iI(x509Certificate);
            if (iiI1L1iI2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(iiI1L1iI2)) {
                    arrayList.add(iiI1L1iI2);
                }
                if (il1LilLllii(iiI1L1iI2, iiI1L1iI2)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (il1LilLllii(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean il1LilLllii(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
