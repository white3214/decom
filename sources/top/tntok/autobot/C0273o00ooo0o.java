package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.o00ooo0o  reason: case insensitive filesystem */
public class C0273o00ooo0o extends IiIIlIL implements Serializable {
    public static final Comparator<File> I11lLL1;
    public static final Comparator<File> i1LIL11l;
    public static final Comparator<File> iiIliillii;
    public static final Comparator<File> iilLil1i11I1;
    public static final Comparator<File> il1LilLllii;
    public static final Comparator<File> illlI1lLIL;
    private static final long serialVersionUID = 6527501707585768673L;
    private final o00O000o caseSensitivity;

    static {
        C0273o00ooo0o o00ooo0o = new C0273o00ooo0o();
        i1LIL11l = o00ooo0o;
        illlI1lLIL = new o0OO00OO(o00ooo0o);
        C0273o00ooo0o o00ooo0o2 = new C0273o00ooo0o(o00O000o.INSENSITIVE);
        il1LilLllii = o00ooo0o2;
        iiIliillii = new o0OO00OO(o00ooo0o2);
        C0273o00ooo0o o00ooo0o3 = new C0273o00ooo0o(o00O000o.SYSTEM);
        iilLil1i11I1 = o00ooo0o3;
        I11lLL1 = new o0OO00OO(o00ooo0o3);
    }

    public C0273o00ooo0o() {
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
        return this.caseSensitivity.iiI1L1iI(file.getPath(), file2.getPath());
    }

    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }

    public C0273o00ooo0o(o00O000o o00o000o) {
        this.caseSensitivity = o00o000o == null ? o00O000o.SENSITIVE : o00o000o;
    }
}
