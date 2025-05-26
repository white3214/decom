package top.tntok.autobot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iLLiiii11 {
    public static final String I11lLL1 = "[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)";
    public static final String IiIIlIL = "[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?";
    public static final String IiiL1llIIi = "[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?";
    public static final Pattern iILiI1lll = Pattern.compile(IiiL1llIIi, 2);
    public static final Pattern iLLLILIiLi1Ii = Pattern.compile(I11lLL1, 2);
    public static final String iiIliillii = "US-ASCII";
    public static final Pattern iilLiIIIi11i = Pattern.compile(IiIIlIL, 2);
    public static final String iilLil1i11I1 = "multipart/form-data";
    public final String i1LIL11l;
    public final String iiI1L1iI;
    public final String il1LilLllii;
    public final String illlI1lLIL;

    public iLLiiii11(String str) {
        this.iiI1L1iI = str;
        if (str != null) {
            this.i1LIL11l = il1LilLllii(str, iLLLILIiLi1Ii, "", 1);
            this.illlI1lLIL = il1LilLllii(str, iilLiIIIi11i, (String) null, 2);
        } else {
            this.i1LIL11l = "";
            this.illlI1lLIL = C0514o0o00oO.iilLil1i11I1;
        }
        if ("multipart/form-data".equalsIgnoreCase(this.i1LIL11l)) {
            this.il1LilLllii = il1LilLllii(str, iILiI1lll, (String) null, 2);
        } else {
            this.il1LilLllii = null;
        }
    }

    public iLLiiii11 I11lLL1() {
        if (this.illlI1lLIL != null) {
            return this;
        }
        return new iLLiiii11(this.iiI1L1iI + "; charset=UTF-8");
    }

    public String i1LIL11l() {
        return this.i1LIL11l;
    }

    public String iiI1L1iI() {
        return this.il1LilLllii;
    }

    public String iiIliillii() {
        String str = this.illlI1lLIL;
        if (str == null) {
            return "US-ASCII";
        }
        return str;
    }

    public boolean iilLil1i11I1() {
        return "multipart/form-data".equalsIgnoreCase(this.i1LIL11l);
    }

    public final String il1LilLllii(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(i);
        }
        return str2;
    }

    public String illlI1lLIL() {
        return this.iiI1L1iI;
    }
}
