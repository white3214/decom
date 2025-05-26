package top.tntok.autobot;

import java.lang.reflect.Modifier;
import java.util.List;
import top.tntok.autobot.o000OO00;

public abstract class o000OO00<T extends o000OO00<T>> implements illiiliIILI {
    public T I11lLL1(List<T> list) {
        int size = list.size() - 1;
        while (size >= 0) {
            T t = (o000OO00) list.get(size);
            if (!iilLiIIIi11i(t)) {
                size--;
            } else if (!t.iLLLILIiLi1Ii()) {
                return null;
            } else {
                list.remove(size);
                return t;
            }
        }
        return this;
    }

    public boolean IiIIlIL() {
        return Modifier.isPublic(il1LilLllii());
    }

    public boolean IiiL1llIIi() {
        return Modifier.isStatic(il1LilLllii());
    }

    public abstract boolean iLLLILIiLi1Ii();

    public abstract String iiIliillii();

    public abstract boolean iilLiIIIi11i(T t);

    public abstract Class<?> iilLil1i11I1();

    public abstract int il1LilLllii();

    public abstract Class<?> illlI1lLIL();
}
