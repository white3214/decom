package top.tntok.autobot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class iLi111LlII implements C0132o00O0o0o {
    public final List<C0131o00O0o0O> i1LIL11l;
    public final File iiI1L1iI;

    public iLi111LlII() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.iiI1L1iI = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.i1LIL11l = new ArrayList();
    }

    public void clear() {
        for (C0131o00O0o0O il1LilLllii : this.i1LIL11l) {
            try {
                il1LilLllii.il1LilLllii();
            } catch (Exception e) {
                C0222o00oO00O.I1l1iIll1lIi1.log(Level.WARNING, "could not delete file ", e);
            }
        }
        this.i1LIL11l.clear();
    }

    public C0131o00O0o0O iiI1L1iI(String str) throws Exception {
        iLilLl1ii ililll1ii = new iLilLl1ii(this.iiI1L1iI);
        this.i1LIL11l.add(ililll1ii);
        return ililll1ii;
    }
}
