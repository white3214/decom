package top.tntok.autobot;

import java.util.List;

/* renamed from: top.tntok.autobot.o00OO0o0  reason: case insensitive filesystem */
public class C0141o00OO0o0 extends C0136o00O0oo {
    private static final long serialVersionUID = 1;
    private final String message;

    public C0141o00OO0o0(Class<?> cls, List<Throwable> list) {
        super(list);
        this.message = i1LIL11l(cls, list);
    }

    public static String i1LIL11l(Class<?> cls, List<Throwable> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Invalid test class '%s':", new Object[]{cls.getName()}));
        int i = 1;
        for (Throwable message2 : list) {
            sb.append("\n  " + i + ". " + message2.getMessage());
            i++;
        }
        return sb.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
