package top.tntok.autobot;

import java.lang.reflect.InvocationTargetException;

public abstract class o0O0oo00 {
    public abstract Object i1LIL11l() throws Throwable;

    public Object iiI1L1iI() throws Throwable {
        try {
            return i1LIL11l();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
