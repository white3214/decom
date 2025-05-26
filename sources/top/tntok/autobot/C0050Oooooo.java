package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.Oooooo  reason: case insensitive filesystem */
public class C0050Oooooo extends IiIIlIL implements Serializable {
    public static final Comparator<File> I11lLL1;
    public static final Comparator<File> i1LIL11l;
    public static final Comparator<File> iiIliillii;
    public static final Comparator<File> iilLil1i11I1;
    public static final Comparator<File> il1LilLllii;
    public static final Comparator<File> illlI1lLIL;
    private static final long serialVersionUID = 1928235200184222815L;
    private final o00O000o caseSensitivity;

    static {
        C0050Oooooo oooooo = new C0050Oooooo();
        i1LIL11l = oooooo;
        illlI1lLIL = new o0OO00OO(oooooo);
        C0050Oooooo oooooo2 = new C0050Oooooo(o00O000o.INSENSITIVE);
        il1LilLllii = oooooo2;
        iiIliillii = new o0OO00OO(oooooo2);
        C0050Oooooo oooooo3 = new C0050Oooooo(o00O000o.SYSTEM);
        iilLil1i11I1 = oooooo3;
        I11lLL1 = new o0OO00OO(oooooo3);
    }

    public C0050Oooooo() {
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
        return this.caseSensitivity.iiI1L1iI(C0089o000Ooo.i1L1lLllLLlIi(file.getName()), C0089o000Ooo.i1L1lLllLLlIi(file2.getName()));
    }

    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }

    public C0050Oooooo(o00O000o o00o000o) {
        this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
    }
}
