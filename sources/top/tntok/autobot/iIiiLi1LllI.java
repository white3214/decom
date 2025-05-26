package top.tntok.autobot;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class iIiiLi1LllI {
    @Deprecated
    public static final Charset I11lLL1;
    @Deprecated
    public static final Charset i1LIL11l;
    public static final SortedMap<String, Charset> iiI1L1iI;
    @Deprecated
    public static final Charset iiIliillii;
    @Deprecated
    public static final Charset iilLil1i11I1;
    @Deprecated
    public static final Charset il1LilLllii;
    @Deprecated
    public static final Charset illlI1lLIL;

    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Charset charset = StandardCharsets.ISO_8859_1;
        treeMap.put(charset.name(), charset);
        Charset charset2 = StandardCharsets.US_ASCII;
        treeMap.put(charset2.name(), charset2);
        Charset charset3 = StandardCharsets.UTF_16;
        treeMap.put(charset3.name(), charset3);
        Charset charset4 = StandardCharsets.UTF_16BE;
        treeMap.put(charset4.name(), charset4);
        Charset charset5 = StandardCharsets.UTF_16LE;
        treeMap.put(charset5.name(), charset5);
        Charset charset6 = StandardCharsets.UTF_8;
        treeMap.put(charset6.name(), charset6);
        iiI1L1iI = Collections.unmodifiableSortedMap(treeMap);
        i1LIL11l = charset;
        illlI1lLIL = charset2;
        il1LilLllii = charset3;
        iiIliillii = charset4;
        iilLil1i11I1 = charset5;
        I11lLL1 = charset6;
    }

    public static Charset i1LIL11l(String str) {
        if (str == null) {
            return Charset.defaultCharset();
        }
        return Charset.forName(str);
    }

    public static SortedMap<String, Charset> iiI1L1iI() {
        return iiI1L1iI;
    }

    public static Charset illlI1lLIL(Charset charset) {
        if (charset == null) {
            return Charset.defaultCharset();
        }
        return charset;
    }
}
