package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.Oooo  reason: case insensitive filesystem */
public class C0026Oooo extends iilLiIIIi11i implements Serializable {
    public static final o00O00o0 i1LIL11l;
    public static final o00O00o0 illlI1lLIL;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        C0026Oooo oooo = new C0026Oooo();
        i1LIL11l = oooo;
        illlI1lLIL = new C0538o0ooOO(oooo);
    }

    public boolean accept(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return true;
            }
            return false;
        } else if (file.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
