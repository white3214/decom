package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.o000o00O  reason: case insensitive filesystem */
public class C0095o000o00O extends iilLiIIIi11i implements Serializable {
    public static final o00O00o0 i1LIL11l;
    public static final o00O00o0 illlI1lLIL;
    private static final long serialVersionUID = 8930842316112759062L;

    static {
        C0095o000o00O o000o00o = new C0095o000o00O();
        i1LIL11l = o000o00o;
        illlI1lLIL = new C0538o0ooOO(o000o00o);
    }

    public boolean accept(File file) {
        return file.isHidden();
    }
}
