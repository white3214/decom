package top.tntok.autobot;

import java.lang.annotation.Annotation;

/* renamed from: top.tntok.autobot.o0o0000o  reason: case insensitive filesystem */
public class C0490o0o0000o extends Exception {
    private static final long serialVersionUID = 3176511008672645574L;

    public C0490o0o0000o(o000OO00<?> o000oo00, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", new Object[]{cls.getSimpleName(), o000oo00.iiIliillii(), str}));
    }
}
