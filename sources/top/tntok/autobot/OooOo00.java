package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class OooOo00 extends IiIIlIL implements Serializable {
    public static final int i1LIL11l = 2;
    public static final Comparator<File> iiIliillii;
    public static final Comparator<File> il1LilLllii;
    public static final int illlI1lLIL = 1;
    private static final long serialVersionUID = 296132640160964395L;

    static {
        OooOo00 oooOo00 = new OooOo00();
        il1LilLllii = oooOo00;
        iiIliillii = new o0OO00OO(oooOo00);
    }

    public /* bridge */ /* synthetic */ File[] i1LIL11l(File[] fileArr) {
        return super.i1LIL11l(fileArr);
    }

    public /* bridge */ /* synthetic */ List iiI1L1iI(List list) {
        return super.iiI1L1iI(list);
    }

    public final int il1LilLllii(File file) {
        if (file.isDirectory()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        return il1LilLllii(file) - il1LilLllii(file2);
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
