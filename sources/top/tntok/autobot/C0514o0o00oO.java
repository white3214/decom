package top.tntok.autobot;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o0o00oO  reason: case insensitive filesystem */
public class C0514o0o00oO extends Reader {
    public static final String I11lLL1 = "US-ASCII";
    public static final String I1iIiIi = "UTF-32";
    public static final String I1l1iIll1lIi1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    public static final Ii1lLiiIli[] IL1lILLLL1L = {Ii1lLiiIli.i1LIL11l, Ii1lLiiIli.illlI1lLIL, Ii1lLiiIli.il1LilLllii, Ii1lLiiIli.iiIliillii, Ii1lLiiIli.iilLil1i11I1};
    public static final String ILl1iII11Ll1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    public static final Pattern Ii1liIIIiLi = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);
    public static final String IiIIlIL = "UTF-16LE";
    public static final String IiiL1llIIi = "UTF-32LE";
    public static final String IilL11ii1I1Il = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    public static final Pattern i111iLiiIIill = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final String i1L1lLllLLlIi = "CP1047";
    public static final String i1iiLIil1ILi = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    public static final String iILiI1lll = "UTF-16";
    public static final Ii1lLiiIli[] iL1LIlIlI = {new Ii1lLiiIli(iilLil1i11I1, 60, 63, 120, 109), new Ii1lLiiIli(iLLLILIiLi1Ii, 0, 60, 0, 63), new Ii1lLiiIli(IiIIlIL, 60, 0, 63, 0), new Ii1lLiiIli(iilLiIIIi11i, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new Ii1lLiiIli(IiiL1llIIi, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new Ii1lLiiIli(i1L1lLllLLlIi, 76, 111, 167, 148)};
    public static final String iLLLILIiLi1Ii = "UTF-16BE";
    public static final int iiIliillii = 8192;
    public static final String iiLIIiIli = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    public static final String iilLiIIIi11i = "UTF-32BE";
    public static final String iilLil1i11I1 = "UTF-8";
    public final Reader i1LIL11l;
    public final String il1LilLllii;
    public final String illlI1lLIL;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0514o0o00oO(File file) throws IOException {
        this((InputStream) new FileInputStream(file));
        Objects.requireNonNull(file);
    }

    public static String I1LiILiLLIl1l(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(";");
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    public static boolean I1lLLLlliILlI(String str) {
        if (str == null || (!str.equals("application/xml") && !str.equals("application/xml-dtd") && !str.equals("application/xml-external-parsed-entity") && (!str.startsWith("application/") || !str.endsWith("+xml")))) {
            return false;
        }
        return true;
    }

    public static String IiIl11II(String str) {
        int indexOf;
        String str2;
        if (str == null || (indexOf = str.indexOf(";")) <= -1) {
            return null;
        }
        Matcher matcher = i111iLiiIIill.matcher(str.substring(indexOf + 1));
        if (matcher.find()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2.toUpperCase(Locale.ROOT);
        }
        return null;
    }

    public static boolean iiLl11ILL(String str) {
        if (str == null || (!str.equals("text/xml") && !str.equals("text/xml-external-parsed-entity") && (!str.startsWith("text/") || !str.endsWith("+xml")))) {
            return false;
        }
        return true;
    }

    public static String ilIILlI1l11i(InputStream inputStream, String str) throws IOException {
        if (str != null) {
            byte[] bArr = new byte[8192];
            inputStream.mark(8192);
            int read = inputStream.read(bArr, 0, 8192);
            String str2 = "";
            int i = -1;
            int i2 = 0;
            int i3 = 8192;
            while (read != -1 && i == -1 && i2 < 8192) {
                i2 += read;
                i3 -= read;
                read = inputStream.read(bArr, i2, i3);
                str2 = new String(bArr, 0, i2, str);
                i = str2.indexOf(62);
            }
            if (i == -1) {
                if (read == -1) {
                    throw new IOException("Unexpected end of XML stream");
                }
                throw new IOException("XML prolog or ROOT element not found on first " + i2 + " bytes");
            } else if (i2 > 0) {
                inputStream.reset();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str2.substring(0, i + 1)));
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                Matcher matcher = Ii1liIIIiLi.matcher(stringBuffer);
                if (matcher.find()) {
                    String upperCase = matcher.group(1).toUpperCase(Locale.ROOT);
                    return upperCase.substring(1, upperCase.length() - 1);
                }
            }
        }
        return null;
    }

    public String IIL1Ll1I111() {
        return this.illlI1lLIL;
    }

    public final String IL11lll11(i1LlL1iILLLil i1lll1iilllil, i1LlL1iILLLil i1lll1iilllil2, String str, boolean z) throws IOException {
        String ilLIlL1ILi = i1lll1iilllil.ilLIlL1ILi();
        String ilLIlL1ILi2 = i1lll1iilllil2.ilLIlL1ILi();
        try {
            return iiI1L1iI(str, ilLIlL1ILi, ilLIlL1ILi2, ilIILlI1l11i(i1lll1iilllil2, ilLIlL1ILi2), z);
        } catch (C0516o0o00oOO e) {
            if (z) {
                return il1LilLllii(str, e);
            }
            throw e;
        }
    }

    public void close() throws IOException {
        this.i1LIL11l.close();
    }

    public final String i111iLiiIIill(i1LlL1iILLLil i1lll1iilllil, i1LlL1iILLLil i1lll1iilllil2, boolean z) throws IOException {
        String ilLIlL1ILi = i1lll1iilllil.ilLIlL1ILi();
        String ilLIlL1ILi2 = i1lll1iilllil2.ilLIlL1ILi();
        try {
            return i1LIL11l(ilLIlL1ILi, ilLIlL1ILi2, ilIILlI1l11i(i1lll1iilllil2, ilLIlL1ILi2));
        } catch (C0516o0o00oOO e) {
            if (z) {
                return il1LilLllii((String) null, e);
            }
            throw e;
        }
    }

    public String i1LIL11l(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 == null || str3 == null) {
                String str4 = this.il1LilLllii;
                if (str4 == null) {
                    return iilLil1i11I1;
                }
                return str4;
            } else if (!str3.equals(iILiI1lll) || (!str2.equals(iLLLILIiLi1Ii) && !str2.equals(IiIIlIL))) {
                return str3;
            } else {
                return str2;
            }
        } else if (str.equals(iilLil1i11I1)) {
            if (str2 != null && !str2.equals(iilLil1i11I1)) {
                throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
            } else if (str3 == null || str3.equals(iilLil1i11I1)) {
                return str;
            } else {
                throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
            }
        } else if (str.equals(iLLLILIiLi1Ii) || str.equals(IiIIlIL)) {
            if (str2 != null && !str2.equals(str)) {
                throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
            } else if (str3 == null || str3.equals(iILiI1lll) || str3.equals(str)) {
                return str;
            } else {
                throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
            }
        } else if (!str.equals(iilLiIIIi11i) && !str.equals(IiiL1llIIi)) {
            throw new C0516o0o00oOO(MessageFormat.format(I1l1iIll1lIi1, new Object[]{str, str2, str3}), str, str2, str3);
        } else if (str2 != null && !str2.equals(str)) {
            throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
        } else if (str3 == null || str3.equals(I1iIiIi) || str3.equals(str)) {
            return str;
        } else {
            throw new C0516o0o00oOO(MessageFormat.format(IilL11ii1I1Il, new Object[]{str, str2, str3}), str, str2, str3);
        }
    }

    public String iiI1L1iI(String str, String str2, String str3, String str4, boolean z) throws IOException {
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        if (z && str7 != null) {
            return str7;
        }
        String I1LiILiLLIl1l = I1LiILiLLIl1l(str);
        String IiIl11II = IiIl11II(str);
        boolean I1lLLLlliILlI = I1lLLLlliILlI(I1LiILiLLIl1l);
        boolean iiLl11ILL = iiLl11ILL(I1LiILiLLIl1l);
        if (!I1lLLLlliILlI && !iiLl11ILL) {
            throw new C0516o0o00oOO(MessageFormat.format(i1iiLIil1ILi, new Object[]{I1LiILiLLIl1l, IiIl11II, str5, str6, str7}), I1LiILiLLIl1l, IiIl11II, str2, str3, str4);
        } else if (IiIl11II == null) {
            if (I1lLLLlliILlI) {
                return i1LIL11l(str5, str6, str7);
            }
            String str8 = this.il1LilLllii;
            if (str8 == null) {
                return "US-ASCII";
            }
            return str8;
        } else if (IiIl11II.equals(iLLLILIiLi1Ii) || IiIl11II.equals(IiIIlIL)) {
            if (str5 == null) {
                return IiIl11II;
            }
            throw new C0516o0o00oOO(MessageFormat.format(iiLIIiIli, new Object[]{I1LiILiLLIl1l, IiIl11II, str5, str6, str7}), I1LiILiLLIl1l, IiIl11II, str2, str3, str4);
        } else if (IiIl11II.equals(iILiI1lll)) {
            if (str5 != null && str5.startsWith(iILiI1lll)) {
                return str5;
            }
            throw new C0516o0o00oOO(MessageFormat.format(ILl1iII11Ll1, new Object[]{I1LiILiLLIl1l, IiIl11II, str5, str6, str7}), I1LiILiLLIl1l, IiIl11II, str2, str3, str4);
        } else if (IiIl11II.equals(iilLiIIIi11i) || IiIl11II.equals(IiiL1llIIi)) {
            if (str5 == null) {
                return IiIl11II;
            }
            throw new C0516o0o00oOO(MessageFormat.format(iiLIIiIli, new Object[]{I1LiILiLLIl1l, IiIl11II, str5, str6, str7}), I1LiILiLLIl1l, IiIl11II, str2, str3, str4);
        } else if (!IiIl11II.equals(I1iIiIi)) {
            return IiIl11II;
        } else {
            if (str5 != null && str5.startsWith(I1iIiIi)) {
                return str5;
            }
            throw new C0516o0o00oOO(MessageFormat.format(ILl1iII11Ll1, new Object[]{I1LiILiLLIl1l, IiIl11II, str5, str6, str7}), I1LiILiLLIl1l, IiIl11II, str2, str3, str4);
        }
    }

    public final String il1LilLllii(String str, C0516o0o00oOO o0o00ooo) throws IOException {
        if (str != null && str.startsWith(C0222o00oO00O.Ii1liIIIiLi)) {
            String substring = str.substring(9);
            try {
                return iiI1L1iI("text/xml" + substring, o0o00ooo.iiI1L1iI(), o0o00ooo.iiIliillii(), o0o00ooo.il1LilLllii(), true);
            } catch (C0516o0o00oOO e) {
                o0o00ooo = e;
            }
        }
        String il1LilLllii2 = o0o00ooo.il1LilLllii();
        if (il1LilLllii2 == null) {
            il1LilLllii2 = o0o00ooo.i1LIL11l();
        }
        if (il1LilLllii2 != null) {
            return il1LilLllii2;
        }
        String str2 = this.il1LilLllii;
        if (str2 == null) {
            return iilLil1i11I1;
        }
        return str2;
    }

    public String ilLIlL1ILi() {
        return this.il1LilLllii;
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.i1LIL11l.read(cArr, i, i2);
    }

    public C0514o0o00oO(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public C0514o0o00oO(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, z, (String) null);
    }

    public C0514o0o00oO(InputStream inputStream, boolean z, String str) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.il1LilLllii = str;
        i1LlL1iILLLil i1lll1iilllil = new i1LlL1iILLLil(new BufferedInputStream(inputStream, 8192), false, IL1lILLLL1L);
        i1LlL1iILLLil i1lll1iilllil2 = new i1LlL1iILLLil(i1lll1iilllil, true, iL1LIlIlI);
        String i111iLiiIIill2 = i111iLiiIIill(i1lll1iilllil, i1lll1iilllil2, z);
        this.illlI1lLIL = i111iLiiIIill2;
        this.i1LIL11l = new InputStreamReader(i1lll1iilllil2, i111iLiiIIill2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0514o0o00oO(URL url) throws IOException {
        this(url.openConnection(), (String) null);
        Objects.requireNonNull(url, "url");
    }

    public C0514o0o00oO(URLConnection uRLConnection, String str) throws IOException {
        Objects.requireNonNull(uRLConnection, "conm");
        this.il1LilLllii = str;
        String contentType = uRLConnection.getContentType();
        i1LlL1iILLLil i1lll1iilllil = new i1LlL1iILLLil(new BufferedInputStream(uRLConnection.getInputStream(), 8192), false, IL1lILLLL1L);
        i1LlL1iILLLil i1lll1iilllil2 = new i1LlL1iILLLil(i1lll1iilllil, true, iL1LIlIlI);
        if ((uRLConnection instanceof HttpURLConnection) || contentType != null) {
            this.illlI1lLIL = IL11lll11(i1lll1iilllil, i1lll1iilllil2, contentType, true);
        } else {
            this.illlI1lLIL = i111iLiiIIill(i1lll1iilllil, i1lll1iilllil2, true);
        }
        this.i1LIL11l = new InputStreamReader(i1lll1iilllil2, this.illlI1lLIL);
    }

    public C0514o0o00oO(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true);
    }

    public C0514o0o00oO(InputStream inputStream, String str, boolean z, String str2) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
        this.il1LilLllii = str2;
        i1LlL1iILLLil i1lll1iilllil = new i1LlL1iILLLil(new BufferedInputStream(inputStream, 8192), false, IL1lILLLL1L);
        i1LlL1iILLLil i1lll1iilllil2 = new i1LlL1iILLLil(i1lll1iilllil, true, iL1LIlIlI);
        String IL11lll11 = IL11lll11(i1lll1iilllil, i1lll1iilllil2, str, z);
        this.illlI1lLIL = IL11lll11;
        this.i1LIL11l = new InputStreamReader(i1lll1iilllil2, IL11lll11);
    }

    public C0514o0o00oO(InputStream inputStream, String str, boolean z) throws IOException {
        this(inputStream, str, z, (String) null);
    }
}
