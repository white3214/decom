package top.tntok.autobot;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: top.tntok.autobot.o00OooO0  reason: case insensitive filesystem */
public final class C0179o00OooO0 {
    public static final Pattern I11lLL1 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern iLLLILIiLi1Ii = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public static final String iiIliillii = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    public static final String iilLil1i11I1 = "\"([^\"]*)\"";
    public final String i1LIL11l;
    public final String iiI1L1iI;
    @Nullable
    public final String il1LilLllii;
    public final String illlI1lLIL;

    public C0179o00OooO0(String str, String str2, String str3, @Nullable String str4) {
        this.iiI1L1iI = str;
        this.i1LIL11l = str2;
        this.illlI1lLIL = str3;
        this.il1LilLllii = str4;
    }

    @Nullable
    public static C0179o00OooO0 il1LilLllii(String str) {
        try {
            return illlI1lLIL(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static C0179o00OooO0 illlI1lLIL(String str) {
        Matcher matcher = I11lLL1.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = iLLLILIiLi1Ii.matcher(str);
            int end = matcher.end();
            String str2 = null;
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C0179o00OooO0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0179o00OooO0) || !((C0179o00OooO0) obj).iiI1L1iI.equals(this.iiI1L1iI)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.iiI1L1iI.hashCode();
    }

    @Nullable
    public Charset i1LIL11l(@Nullable Charset charset) {
        try {
            String str = this.il1LilLllii;
            if (str != null) {
                return Charset.forName(str);
            }
            return charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    @Nullable
    public Charset iiI1L1iI() {
        return i1LIL11l((Charset) null);
    }

    public String iiIliillii() {
        return this.illlI1lLIL;
    }

    public String iilLil1i11I1() {
        return this.i1LIL11l;
    }

    public String toString() {
        return this.iiI1L1iI;
    }
}
