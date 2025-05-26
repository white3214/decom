package top.tntok.autobot;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class o0OO00O implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final FileFilter fileFilter;
    private final List<C0544o0ooOoO> listeners;
    private final o000000 rootEntry;

    public o0OO00O(String str) {
        this(new File(str));
    }

    public final void I11lLL1(o000000 o000000) {
        for (C0544o0ooOoO next : this.listeners) {
            if (o000000.iLLLILIiLi1Ii()) {
                next.iLLLILIiLi1Ii(o000000.i1LIL11l());
            } else {
                next.iilLil1i11I1(o000000.i1LIL11l());
            }
        }
    }

    public void I1iIiIi() throws Exception {
        o000000 o000000 = this.rootEntry;
        o000000.IiiL1llIIi(o000000.i1LIL11l());
        this.rootEntry.iILiI1lll(iLLLILIiLi1Ii(this.rootEntry.i1LIL11l(), this.rootEntry));
    }

    public void IL1lILLLL1L(C0544o0ooOoO o0ooooo) {
        if (o0ooooo != null) {
            do {
            } while (this.listeners.remove(o0ooooo));
        }
    }

    public final void IiIIlIL(o000000 o000000, File file) {
        if (o000000.IiiL1llIIi(file)) {
            for (C0544o0ooOoO next : this.listeners) {
                if (o000000.iLLLILIiLi1Ii()) {
                    next.iiI1L1iI(file);
                } else {
                    next.il1LilLllii(file);
                }
            }
        }
    }

    public FileFilter IiiL1llIIi() {
        return this.fileFilter;
    }

    public final File[] i1L1lLllLLlIi(File file) {
        File[] fileArr;
        if (file.isDirectory()) {
            FileFilter fileFilter2 = this.fileFilter;
            if (fileFilter2 == null) {
                fileArr = file.listFiles();
            } else {
                fileArr = file.listFiles(fileFilter2);
            }
        } else {
            fileArr = null;
        }
        if (fileArr == null) {
            fileArr = C0086o000OoO.IL1lILLLL1L;
        }
        Comparator<File> comparator2 = this.comparator;
        if (comparator2 != null && fileArr.length > 1) {
            Arrays.sort(fileArr, comparator2);
        }
        return fileArr;
    }

    public void i1LIL11l() {
        for (C0544o0ooOoO iiIliillii : this.listeners) {
            iiIliillii.iiIliillii(this);
        }
        File i1LIL11l = this.rootEntry.i1LIL11l();
        if (i1LIL11l.exists()) {
            o000000 o000000 = this.rootEntry;
            illlI1lLIL(o000000, o000000.iiI1L1iI(), i1L1lLllLLlIi(i1LIL11l));
        } else if (this.rootEntry.IiIIlIL()) {
            o000000 o0000002 = this.rootEntry;
            illlI1lLIL(o0000002, o0000002.iiI1L1iI(), C0086o000OoO.IL1lILLLL1L);
        }
        for (C0544o0ooOoO i1LIL11l2 : this.listeners) {
            i1LIL11l2.i1LIL11l(this);
        }
    }

    public Iterable<C0544o0ooOoO> iILiI1lll() {
        return this.listeners;
    }

    public final o000000[] iLLLILIiLi1Ii(File file, o000000 o000000) {
        o000000[] o000000Arr;
        File[] i1L1lLllLLlIi = i1L1lLllLLlIi(file);
        if (i1L1lLllLLlIi.length > 0) {
            o000000Arr = new o000000[i1L1lLllLLlIi.length];
        } else {
            o000000Arr = o000000.i1LIL11l;
        }
        for (int i = 0; i < i1L1lLllLLlIi.length; i++) {
            o000000Arr[i] = il1LilLllii(o000000, i1L1lLllLLlIi[i]);
        }
        return o000000Arr;
    }

    public void iiI1L1iI(C0544o0ooOoO o0ooooo) {
        if (o0ooooo != null) {
            this.listeners.add(o0ooooo);
        }
    }

    public File iilLiIIIi11i() {
        return this.rootEntry.i1LIL11l();
    }

    public final void iilLil1i11I1(o000000 o000000) {
        for (C0544o0ooOoO next : this.listeners) {
            if (o000000.iLLLILIiLi1Ii()) {
                next.illlI1lLIL(o000000.i1LIL11l());
            } else {
                next.I11lLL1(o000000.i1LIL11l());
            }
        }
        for (o000000 iilLil1i11I1 : o000000.iiI1L1iI()) {
            iilLil1i11I1(iilLil1i11I1);
        }
    }

    public final o000000 il1LilLllii(o000000 o000000, File file) {
        o000000 iilLiIIIi11i = o000000.iilLiIIIi11i(file);
        iilLiIIIi11i.IiiL1llIIi(file);
        iilLiIIIi11i.iILiI1lll(iLLLILIiLi1Ii(file, iilLiIIIi11i));
        return iilLiIIIi11i;
    }

    public final void illlI1lLIL(o000000 o000000, o000000[] o000000Arr, File[] fileArr) {
        o000000[] o000000Arr2;
        if (fileArr.length > 0) {
            o000000Arr2 = new o000000[fileArr.length];
        } else {
            o000000Arr2 = o000000.i1LIL11l;
        }
        int length = o000000Arr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            o000000 o0000002 = o000000Arr[i2];
            while (i < fileArr.length && this.comparator.compare(o0000002.i1LIL11l(), fileArr[i]) > 0) {
                o000000 il1LilLllii = il1LilLllii(o000000, fileArr[i]);
                o000000Arr2[i] = il1LilLllii;
                iilLil1i11I1(il1LilLllii);
                i++;
            }
            if (i >= fileArr.length || this.comparator.compare(o0000002.i1LIL11l(), fileArr[i]) != 0) {
                illlI1lLIL(o0000002, o0000002.iiI1L1iI(), C0086o000OoO.IL1lILLLL1L);
                I11lLL1(o0000002);
            } else {
                IiIIlIL(o0000002, fileArr[i]);
                illlI1lLIL(o0000002, o0000002.iiI1L1iI(), i1L1lLllLLlIi(fileArr[i]));
                o000000Arr2[i] = o0000002;
                i++;
            }
        }
        while (i < fileArr.length) {
            o000000 il1LilLllii2 = il1LilLllii(o000000, fileArr[i]);
            o000000Arr2[i] = il1LilLllii2;
            iilLil1i11I1(il1LilLllii2);
            i++;
        }
        o000000.iILiI1lll(o000000Arr2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[file='");
        sb.append(iilLiIIIi11i().getPath());
        sb.append('\'');
        if (this.fileFilter != null) {
            sb.append(", ");
            sb.append(this.fileFilter.toString());
        }
        sb.append(", listeners=");
        sb.append(this.listeners.size());
        sb.append("]");
        return sb.toString();
    }

    public o0OO00O(String str, FileFilter fileFilter2) {
        this(new File(str), fileFilter2);
    }

    public o0OO00O(String str, FileFilter fileFilter2, o00O000o o00o000o) {
        this(new File(str), fileFilter2, o00o000o);
    }

    public o0OO00O(File file) {
        this(file, (FileFilter) null);
    }

    public o0OO00O(File file, FileFilter fileFilter2) {
        this(file, fileFilter2, (o00O000o) null);
    }

    public o0OO00O(File file, FileFilter fileFilter2, o00O000o o00o000o) {
        this(new o000000(file), fileFilter2, o00o000o);
    }

    public o0OO00O(o000000 o000000, FileFilter fileFilter2, o00O000o o00o000o) {
        this.listeners = new CopyOnWriteArrayList();
        if (o000000 == null) {
            throw new IllegalArgumentException("Root entry is missing");
        } else if (o000000.i1LIL11l() != null) {
            this.rootEntry = o000000;
            this.fileFilter = fileFilter2;
            if (o00o000o == null || o00o000o.equals(o00O000o.SYSTEM)) {
                this.comparator = C0219o00o0ooo.iilLil1i11I1;
            } else if (o00o000o.equals(o00O000o.INSENSITIVE)) {
                this.comparator = C0219o00o0ooo.il1LilLllii;
            } else {
                this.comparator = C0219o00o0ooo.i1LIL11l;
            }
        } else {
            throw new IllegalArgumentException("Root directory is missing");
        }
    }

    public void iiIliillii() throws Exception {
    }
}
