package top.tntok.autobot;

public class I1LLLIIll {
    public static Class<?> i1LIL11l(String str, Class<?> cls) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = cls.getClassLoader();
        }
        return Class.forName(str, true, contextClassLoader);
    }

    public static Class<?> iiI1L1iI(String str) throws ClassNotFoundException {
        return i1LIL11l(str, I1LLLIIll.class);
    }
}
