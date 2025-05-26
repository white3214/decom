package top.tntok.autobot;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class II1l11I11IiiL {
    public static final II1l11I11IiiL illlI1lLIL = new iiI1L1iI().i1LIL11l();
    @Nullable
    public final iilii1LIILi i1LIL11l;
    public final Set<i1LIL11l> iiI1L1iI;

    public static final class i1LIL11l {
        public static final String iiIliillii = "*.";
        public final String i1LIL11l;
        public final String iiI1L1iI;
        public final ili11iILI1l il1LilLllii;
        public final String illlI1lLIL;

        public i1LIL11l(String str, String str2) {
            String str3;
            this.iiI1L1iI = str;
            if (str.startsWith(iiIliillii)) {
                str3 = C0109o000oo00.I1iIiIi("http://" + str.substring(2)).iL1LIlIlI();
            } else {
                str3 = C0109o000oo00.I1iIiIi("http://" + str).iL1LIlIlI();
            }
            this.i1LIL11l = str3;
            if (str2.startsWith("sha1/")) {
                this.illlI1lLIL = "sha1/";
                this.il1LilLllii = ili11iILI1l.iilLil1i11I1(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.illlI1lLIL = "sha256/";
                this.il1LilLllii = ili11iILI1l.iilLil1i11I1(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            if (this.il1LilLllii == null) {
                throw new IllegalArgumentException("pins must be base64: " + str2);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof i1LIL11l) {
                i1LIL11l i1lil11l = (i1LIL11l) obj;
                if (!this.iiI1L1iI.equals(i1lil11l.iiI1L1iI) || !this.illlI1lLIL.equals(i1lil11l.illlI1lLIL) || !this.il1LilLllii.equals(i1lil11l.il1LilLllii)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.iiI1L1iI.hashCode()) * 31) + this.illlI1lLIL.hashCode()) * 31) + this.il1LilLllii.hashCode();
        }

        public boolean iiI1L1iI(String str) {
            if (!this.iiI1L1iI.startsWith(iiIliillii)) {
                return str.equals(this.i1LIL11l);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.i1LIL11l.length()) {
                String str2 = this.i1LIL11l;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.illlI1lLIL + this.il1LilLllii.i1LIL11l();
        }
    }

    public static final class iiI1L1iI {
        public final List<i1LIL11l> iiI1L1iI = new ArrayList();

        public II1l11I11IiiL i1LIL11l() {
            return new II1l11I11IiiL(new LinkedHashSet(this.iiI1L1iI), (iilii1LIILi) null);
        }

        public iiI1L1iI iiI1L1iI(String str, String... strArr) {
            if (str != null) {
                for (String i1lil11l : strArr) {
                    this.iiI1L1iI.add(new i1LIL11l(str, i1lil11l));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }
    }

    public II1l11I11IiiL(Set<i1LIL11l> set, @Nullable iilii1LIILi iilii1liili) {
        this.iiI1L1iI = set;
        this.i1LIL11l = iilii1liili;
    }

    public static ili11iILI1l iiIliillii(X509Certificate x509Certificate) {
        return ili11iILI1l.il1l1IlL(x509Certificate.getPublicKey().getEncoded()).IILiIL1i11Li();
    }

    public static ili11iILI1l iilLil1i11I1(X509Certificate x509Certificate) {
        return ili11iILI1l.il1l1IlL(x509Certificate.getPublicKey().getEncoded()).IIlLill();
    }

    public static String il1LilLllii(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + iilLil1i11I1((X509Certificate) certificate).i1LIL11l();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public II1l11I11IiiL I11lLL1(@Nullable iilii1LIILi iilii1liili) {
        if (Objects.equals(this.i1LIL11l, iilii1liili)) {
            return this;
        }
        return new II1l11I11IiiL(this.iiI1L1iI, iilii1liili);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof II1l11I11IiiL) {
            II1l11I11IiiL iI1l11I11IiiL = (II1l11I11IiiL) obj;
            if (!Objects.equals(this.i1LIL11l, iI1l11I11IiiL.i1LIL11l) || !this.iiI1L1iI.equals(iI1l11I11IiiL.iiI1L1iI)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Objects.hashCode(this.i1LIL11l) * 31) + this.iiI1L1iI.hashCode();
    }

    public void i1LIL11l(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        iiI1L1iI(str, Arrays.asList(certificateArr));
    }

    public void iiI1L1iI(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<i1LIL11l> illlI1lLIL2 = illlI1lLIL(str);
        if (!illlI1lLIL2.isEmpty()) {
            iilii1LIILi iilii1liili = this.i1LIL11l;
            if (iilii1liili != null) {
                list = iilii1liili.iiI1L1iI(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = illlI1lLIL2.size();
                ili11iILI1l ili11iili1l = null;
                ili11iILI1l ili11iili1l2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    i1LIL11l i1lil11l = illlI1lLIL2.get(i2);
                    if (i1lil11l.illlI1lLIL.equals("sha256/")) {
                        if (ili11iili1l == null) {
                            ili11iili1l = iilLil1i11I1(x509Certificate);
                        }
                        if (i1lil11l.il1LilLllii.equals(ili11iili1l)) {
                            return;
                        }
                    } else if (i1lil11l.illlI1lLIL.equals("sha1/")) {
                        if (ili11iili1l2 == null) {
                            ili11iili1l2 = iiIliillii(x509Certificate);
                        }
                        if (i1lil11l.il1LilLllii.equals(ili11iili1l2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + i1lil11l.illlI1lLIL);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(il1LilLllii(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = illlI1lLIL2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append(illlI1lLIL2.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public List<i1LIL11l> illlI1lLIL(String str) {
        List<i1LIL11l> emptyList = Collections.emptyList();
        for (i1LIL11l next : this.iiI1L1iI) {
            if (next.iiI1L1iI(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }
}
