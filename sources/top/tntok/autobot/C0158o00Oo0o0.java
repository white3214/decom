package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.o00Oo0o0  reason: case insensitive filesystem */
public class C0158o00Oo0o0 extends IiIIlIL implements Serializable {
    public static final Comparator<File> i1LIL11l;
    public static final Comparator<File> illlI1lLIL;
    private static final long serialVersionUID = 7372168004395734046L;

    static {
        C0158o00Oo0o0 o00oo0o0 = new C0158o00Oo0o0();
        i1LIL11l = o00oo0o0;
        illlI1lLIL = new o0OO00OO(o00oo0o0);
    }

    public /* bridge */ /* synthetic */ File[] i1LIL11l(File[] fileArr) {
        return super.i1LIL11l(fileArr);
    }

    public /* bridge */ /* synthetic */ List iiI1L1iI(List list) {
        return super.iiI1L1iI(list);
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        int i = ((file.lastModified() - file2.lastModified()) > 0 ? 1 : ((file.lastModified() - file2.lastModified()) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
