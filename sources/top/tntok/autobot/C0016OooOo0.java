package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.OooOo0  reason: case insensitive filesystem */
public class C0016OooOo0 extends iilLiIIIi11i implements Serializable {
    public static final o00O00o0 i1LIL11l;
    public static final o00O00o0 illlI1lLIL;
    private static final long serialVersionUID = -5148237843784525732L;

    static {
        C0016OooOo0 oooOo0 = new C0016OooOo0();
        i1LIL11l = oooOo0;
        illlI1lLIL = oooOo0;
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
