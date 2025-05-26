package top.tntok.autobot;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import top.tntok.autobot.II1l11I11IiiL;

/* renamed from: top.tntok.autobot.o00oOoO  reason: case insensitive filesystem */
public final class C0238o00oOoO implements HostnameVerifier {
    public static final int i1LIL11l = 2;
    public static final C0238o00oOoO iiI1L1iI = new C0238o00oOoO();
    public static final int illlI1lLIL = 7;

    public static List<String> i1LIL11l(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static List<String> iiI1L1iI(X509Certificate x509Certificate) {
        List<String> i1LIL11l2 = i1LIL11l(x509Certificate, 7);
        List<String> i1LIL11l3 = i1LIL11l(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(i1LIL11l2.size() + i1LIL11l3.size());
        arrayList.addAll(i1LIL11l2);
        arrayList.addAll(i1LIL11l3);
        return arrayList;
    }

    public final boolean iiIliillii(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String il1LilLllii : i1LIL11l(x509Certificate, 2)) {
            if (il1LilLllii(lowerCase, il1LilLllii)) {
                return true;
            }
        }
        return false;
    }

    public final boolean iilLil1i11I1(String str, X509Certificate x509Certificate) {
        List<String> i1LIL11l2 = i1LIL11l(x509Certificate, 7);
        int size = i1LIL11l2.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(i1LIL11l2.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean il1LilLllii(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + C0089o000Ooo.il1LilLllii;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + C0089o000Ooo.il1LilLllii;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith(II1l11I11IiiL.i1LIL11l.iiIliillii) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || II1l11I11IiiL.i1LIL11l.iiIliillii.equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean illlI1lLIL(String str, X509Certificate x509Certificate) {
        if (C0487o0OooooO.ILllI11(str)) {
            return iilLil1i11I1(str, x509Certificate);
        }
        return iiIliillii(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return illlI1lLIL(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
