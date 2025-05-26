package top.tntok.autobot;

import java.lang.reflect.Method;
import top.tntok.autobot.C0416o0Oo0OOo;
import top.tntok.autobot.C0528o0oOOOoo;

/* renamed from: top.tntok.autobot.o0Ooo0O  reason: case insensitive filesystem */
public class C0468o0Ooo0O implements C0416o0Oo0OOo.i1LIL11l {
    public boolean i1LIL11l(Class<?> cls) {
        return C0469o0Ooo0O0.class.isAssignableFrom(cls);
    }

    public boolean iiI1L1iI(Method method) {
        if (method.getParameterTypes().length != 0 || !method.getName().startsWith(C0528o0oOOOoo.iilLil1i11I1.I1iIiIi) || !method.getReturnType().getSimpleName().equals("void")) {
            return false;
        }
        return true;
    }
}
