package top.tntok.autobot;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: top.tntok.autobot.o000Oo  reason: case insensitive filesystem */
public final class C0082o000Oo {
    public final i1lLIl1L1lIL i1LIL11l;
    public final C0448o0OoOOo0 iiI1L1iI;
    public final List<Certificate> il1LilLllii;
    public final List<Certificate> illlI1lLIL;

    public C0082o000Oo(C0448o0OoOOo0 o0ooooo0, i1lLIl1L1lIL i1llil1l1lil, List<Certificate> list, List<Certificate> list2) {
        this.iiI1L1iI = o0ooooo0;
        this.i1LIL11l = i1llil1l1lil;
        this.illlI1lLIL = list;
        this.il1LilLllii = list2;
    }

    public static C0082o000Oo i1LIL11l(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            i1lLIl1L1lIL i1LIL11l2 = i1lLIl1L1lIL.i1LIL11l(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C0448o0OoOOo0 iiI1L1iI2 = C0448o0OoOOo0.iiI1L1iI(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C0487o0OooooO.ILl1iII11Ll1(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C0487o0OooooO.ILl1iII11Ll1(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C0082o000Oo(iiI1L1iI2, i1LIL11l2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static C0082o000Oo illlI1lLIL(C0448o0OoOOo0 o0ooooo0, i1lLIl1L1lIL i1llil1l1lil, List<Certificate> list, List<Certificate> list2) {
        if (o0ooooo0 == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (i1llil1l1lil != null) {
            return new C0082o000Oo(o0ooooo0, i1llil1l1lil, C0487o0OooooO.iiLIIiIli(list), C0487o0OooooO.iiLIIiIli(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public List<Certificate> I11lLL1() {
        return this.illlI1lLIL;
    }

    public C0448o0OoOOo0 IiIIlIL() {
        return this.iiI1L1iI;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0082o000Oo)) {
            return false;
        }
        C0082o000Oo o000oo = (C0082o000Oo) obj;
        if (!this.iiI1L1iI.equals(o000oo.iiI1L1iI) || !this.i1LIL11l.equals(o000oo.i1LIL11l) || !this.illlI1lLIL.equals(o000oo.illlI1lLIL) || !this.il1LilLllii.equals(o000oo.il1LilLllii)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.iiI1L1iI.hashCode()) * 31) + this.i1LIL11l.hashCode()) * 31) + this.illlI1lLIL.hashCode()) * 31) + this.il1LilLllii.hashCode();
    }

    @Nullable
    public Principal iLLLILIiLi1Ii() {
        if (!this.illlI1lLIL.isEmpty()) {
            return ((X509Certificate) this.illlI1lLIL.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public i1lLIl1L1lIL iiI1L1iI() {
        return this.i1LIL11l;
    }

    @Nullable
    public Principal iiIliillii() {
        if (!this.il1LilLllii.isEmpty()) {
            return ((X509Certificate) this.il1LilLllii.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final List<String> iilLil1i11I1(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) next).getSubjectDN()));
            } else {
                arrayList.add(next.getType());
            }
        }
        return arrayList;
    }

    public List<Certificate> il1LilLllii() {
        return this.il1LilLllii;
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.iiI1L1iI + " cipherSuite=" + this.i1LIL11l + " peerCertificates=" + iilLil1i11I1(this.illlI1lLIL) + " localCertificates=" + iilLil1i11I1(this.il1LilLllii) + '}';
    }
}
