package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.o00o0ooo  reason: case insensitive filesystem */
public class C0219o00o0ooo extends IiIIlIL implements Serializable {
    public static final Comparator<File> I11lLL1;
    public static final Comparator<File> i1LIL11l;
    public static final Comparator<File> iiIliillii;
    public static final Comparator<File> iilLil1i11I1;
    public static final Comparator<File> il1LilLllii;
    public static final Comparator<File> illlI1lLIL;
    private static final long serialVersionUID = 8397947749814525798L;
    private final o00O000o caseSensitivity;

    static {
        C0219o00o0ooo o00o0ooo = new C0219o00o0ooo();
        i1LIL11l = o00o0ooo;
        illlI1lLIL = new o0OO00OO(o00o0ooo);
        C0219o00o0ooo o00o0ooo2 = new C0219o00o0ooo(o00O000o.INSENSITIVE);
        il1LilLllii = o00o0ooo2;
        iiIliillii = new o0OO00OO(o00o0ooo2);
        C0219o00o0ooo o00o0ooo3 = new C0219o00o0ooo(o00O000o.SYSTEM);
        iilLil1i11I1 = o00o0ooo3;
        I11lLL1 = new o0OO00OO(o00o0ooo3);
    }

    public C0219o00o0ooo() {
        this.caseSensitivity = o00O000o.SENSITIVE;
    }

    public /* bridge */ /* synthetic */ File[] i1LIL11l(File[] fileArr) {
        return super.i1LIL11l(fileArr);
    }

    public /* bridge */ /* synthetic */ List iiI1L1iI(List list) {
        return super.iiI1L1iI(list);
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        return this.caseSensitivity.iiI1L1iI(file.getName(), file2.getName());
    }

    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }

    public C0219o00o0ooo(o00O000o o00o000o) {
        this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
    }
}
