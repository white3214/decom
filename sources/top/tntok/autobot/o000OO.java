package top.tntok.autobot;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public enum o000OO {
    GENERIC(false, false, Integer.MAX_VALUE, Integer.MAX_VALUE, new char[]{0}, new String[0]),
    LINUX(true, true, 255, 4096, new char[]{0, '/'}, new String[0]),
    MAC_OSX(true, true, 255, 1024, new char[]{0, '/', ':'}, new String[0]),
    WINDOWS(false, true, 255, 32000, new char[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, '\"', '*', '/', ':', '<', '>', '?', '\\', '|'}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "CON", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "NUL", "PRN"});
    
    public static final boolean I11lLL1 = false;
    public static final boolean IiIIlIL = false;
    public static final String iLLLILIiLi1Ii = "Windows";
    public static final boolean iilLil1i11I1 = false;
    private final boolean casePreserving;
    private final boolean caseSensitive;
    private final char[] illegalFileNameChars;
    private final int maxFileNameLength;
    private final int maxPathLength;
    private final String[] reservedFileNames;

    static {
        iilLil1i11I1 = iiIliillii("Linux");
        I11lLL1 = iiIliillii("Mac");
        IiIIlIL = iiIliillii(iLLLILIiLi1Ii);
    }

    /* access modifiers changed from: public */
    o000OO(boolean z, boolean z2, int i, int i2, char[] cArr, String[] strArr) {
        this.maxFileNameLength = i;
        this.maxPathLength = i2;
        Objects.requireNonNull(cArr, "illegalFileNameChars");
        this.illegalFileNameChars = cArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.reservedFileNames = strArr;
        this.caseSensitive = z;
        this.casePreserving = z2;
    }

    public static String I11lLL1(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            printStream.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static boolean iILiI1lll(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    public static o000OO iiI1L1iI() {
        if (iilLil1i11I1) {
            return LINUX;
        }
        if (I11lLL1) {
            return MAC_OSX;
        }
        if (IiIIlIL) {
            return WINDOWS;
        }
        return GENERIC;
    }

    public static boolean iiIliillii(String str) {
        return iILiI1lll(I11lLL1("os.name"), str);
    }

    public boolean I1iIiIi(CharSequence charSequence) {
        if (Arrays.binarySearch(this.reservedFileNames, charSequence) >= 0) {
            return true;
        }
        return false;
    }

    public boolean IiIIlIL() {
        return this.caseSensitive;
    }

    public boolean IiiL1llIIi(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() > this.maxFileNameLength || I1iIiIi(charSequence)) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (iilLiIIIi11i(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String i1L1lLllLLlIi(String str, char c) {
        Object obj;
        if (iilLiIIIi11i(c)) {
            if (c == 0) {
                obj = "\\0";
            } else {
                obj = Character.valueOf(c);
            }
            throw new IllegalArgumentException(String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s", new Object[]{obj, name(), Arrays.toString(this.illegalFileNameChars)}));
        }
        int length = str.length();
        int i = this.maxFileNameLength;
        if (length > i) {
            str = str.substring(0, i);
        }
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (iilLiIIIi11i(charArray[i2])) {
                charArray[i2] = c;
                z = true;
            }
        }
        if (z) {
            return String.valueOf(charArray);
        }
        return str;
    }

    public char[] i1LIL11l() {
        return (char[]) this.illegalFileNameChars.clone();
    }

    public boolean iLLLILIiLi1Ii() {
        return this.casePreserving;
    }

    public final boolean iilLiIIIi11i(char c) {
        if (Arrays.binarySearch(this.illegalFileNameChars, c) >= 0) {
            return true;
        }
        return false;
    }

    public String[] iilLil1i11I1() {
        return (String[]) this.reservedFileNames.clone();
    }

    public int il1LilLllii() {
        return this.maxPathLength;
    }

    public int illlI1lLIL() {
        return this.maxFileNameLength;
    }
}
