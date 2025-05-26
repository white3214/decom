package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

/* renamed from: top.tntok.autobot.o000000o  reason: case insensitive filesystem */
public class C0055o000000o extends iilLiIIIi11i implements Serializable {
    public static final o00O00o0 i1LIL11l = new C0055o000000o();
    private static final long serialVersionUID = 5345244090827540862L;

    public boolean accept(File file) {
        return file.isFile();
    }
}
