package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

public class iIlIiiI1L extends iilLiIIIi11i implements Serializable {
    public static final o00O00o0 i1LIL11l;
    public static final o00O00o0 illlI1lLIL;
    private static final long serialVersionUID = 3179904805251622989L;

    static {
        iIlIiiI1L iiliiii1l = new iIlIiiI1L();
        i1LIL11l = iiliiii1l;
        illlI1lLIL = new C0538o0ooOO(iiliiii1l);
    }

    public boolean accept(File file) {
        return file.canExecute();
    }
}
