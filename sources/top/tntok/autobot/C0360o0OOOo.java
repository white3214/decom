package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* renamed from: top.tntok.autobot.o0OOOo  reason: case insensitive filesystem */
public class C0360o0OOOo extends IiIIlIL implements Serializable {
    public static final Comparator<File> i1LIL11l;
    public static final Comparator<File> iiIliillii;
    public static final Comparator<File> il1LilLllii;
    public static final Comparator<File> illlI1lLIL;
    private static final long serialVersionUID = -1201561106411416190L;
    private final boolean sumDirectoryContents;

    static {
        C0360o0OOOo o0oooo = new C0360o0OOOo();
        i1LIL11l = o0oooo;
        illlI1lLIL = new o0OO00OO(o0oooo);
        C0360o0OOOo o0oooo2 = new C0360o0OOOo(true);
        il1LilLllii = o0oooo2;
        iiIliillii = new o0OO00OO(o0oooo2);
    }

    public C0360o0OOOo() {
        this.sumDirectoryContents = false;
    }

    public /* bridge */ /* synthetic */ File[] i1LIL11l(File[] fileArr) {
        return super.i1LIL11l(fileArr);
    }

    public /* bridge */ /* synthetic */ List iiI1L1iI(List list) {
        return super.iiI1L1iI(list);
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        long j;
        long j2;
        if (!file.isDirectory()) {
            j = file.length();
        } else if (!this.sumDirectoryContents || !file.exists()) {
            j = 0;
        } else {
            j = C0086o000OoO.iLLlLIIliLl(file);
        }
        if (!file2.isDirectory()) {
            j2 = file2.length();
        } else if (!this.sumDirectoryContents || !file2.exists()) {
            j2 = 0;
        } else {
            j2 = C0086o000OoO.iLLlLIIliLl(file2);
        }
        int i = ((j - j2) > 0 ? 1 : ((j - j2) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.sumDirectoryContents + "]";
    }

    public C0360o0OOOo(boolean z) {
        this.sumDirectoryContents = z;
    }
}
