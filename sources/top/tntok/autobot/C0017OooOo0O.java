package top.tntok.autobot;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/* renamed from: top.tntok.autobot.OooOo0O  reason: case insensitive filesystem */
public abstract class C0017OooOo0O<T> {
    public final int i1LIL11l;
    public final FileFilter iiI1L1iI;

    /* renamed from: top.tntok.autobot.OooOo0O$iiI1L1iI */
    public static class iiI1L1iI extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public iiI1L1iI(File file2, int i) {
            this("Operation Cancelled", file2, i);
        }

        public File i1LIL11l() {
            return this.file;
        }

        public int iiI1L1iI() {
            return this.depth;
        }

        public iiI1L1iI(String str, File file2, int i) {
            super(str);
            this.file = file2;
            this.depth = i;
        }
    }

    public C0017OooOo0O() {
        this((FileFilter) null, -1);
    }

    public final void I1iIiIi(File file, Collection<T> collection) throws IOException {
        Objects.requireNonNull(file, "startDirectory");
        try {
            IiiL1llIIi(file, collection);
            iILiI1lll(file, 0, collection);
            I11lLL1(collection);
        } catch (iiI1L1iI e) {
            illlI1lLIL(file, collection, e);
        }
    }

    public boolean IiIIlIL(File file, int i, Collection<T> collection) throws IOException {
        return false;
    }

    public final void iILiI1lll(File file, int i, Collection<T> collection) throws IOException {
        File[] fileArr;
        iiI1L1iI(file, i, collection);
        if (il1LilLllii(file, i, collection)) {
            iilLil1i11I1(file, i, collection);
            int i2 = i + 1;
            int i3 = this.i1LIL11l;
            if (i3 < 0 || i2 <= i3) {
                iiI1L1iI(file, i, collection);
                FileFilter fileFilter = this.iiI1L1iI;
                if (fileFilter == null) {
                    fileArr = file.listFiles();
                } else {
                    fileArr = file.listFiles(fileFilter);
                }
                File[] i1LIL11l2 = i1LIL11l(file, i, fileArr);
                if (i1LIL11l2 == null) {
                    iilLiIIIi11i(file, i2, collection);
                } else {
                    for (File file2 : i1LIL11l2) {
                        if (file2.isDirectory()) {
                            iILiI1lll(file2, i2, collection);
                        } else {
                            iiI1L1iI(file2, i2, collection);
                            iLLLILIiLi1Ii(file2, i2, collection);
                            iiI1L1iI(file2, i2, collection);
                        }
                    }
                }
            }
            iiIliillii(file, i, collection);
        }
        iiI1L1iI(file, i, collection);
    }

    public final void iiI1L1iI(File file, int i, Collection<T> collection) throws IOException {
        if (IiIIlIL(file, i, collection)) {
            throw new iiI1L1iI(file, i);
        }
    }

    public boolean il1LilLllii(File file, int i, Collection<T> collection) throws IOException {
        return true;
    }

    public C0017OooOo0O(FileFilter fileFilter, int i) {
        this.iiI1L1iI = fileFilter;
        this.i1LIL11l = i;
    }

    public C0017OooOo0O(o00O00o0 o00o00o0, o00O00o0 o00o00o02, int i) {
        if (o00o00o0 == null && o00o00o02 == null) {
            this.iiI1L1iI = null;
        } else {
            this.iiI1L1iI = o00000.I1IIIi1i1ILl(o00000.IliiLiLliIl(o00o00o0 == null ? C0453o0OoOo0O.i1LIL11l : o00o00o0), o00000.I1I11Il1(o00o00o02 == null ? C0453o0OoOo0O.i1LIL11l : o00o00o02));
        }
        this.i1LIL11l = i;
    }

    public void I11lLL1(Collection<T> collection) throws IOException {
    }

    public void IiiL1llIIi(File file, Collection<T> collection) throws IOException {
    }

    public File[] i1LIL11l(File file, int i, File... fileArr) throws IOException {
        return fileArr;
    }

    public void iLLLILIiLi1Ii(File file, int i, Collection<T> collection) throws IOException {
    }

    public void iiIliillii(File file, int i, Collection<T> collection) throws IOException {
    }

    public void iilLiIIIi11i(File file, int i, Collection<T> collection) throws IOException {
    }

    public void iilLil1i11I1(File file, int i, Collection<T> collection) throws IOException {
    }

    public void illlI1lLIL(File file, Collection<T> collection, iiI1L1iI iii1l1ii) throws IOException {
        throw iii1l1ii;
    }
}
