package top.tntok.autobot;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ILiLII1ILi implements Iterator<Object> {
    public final Object i1LIL11l;
    public int illlI1lLIL = 0;

    public ILiLII1ILi(Object obj) {
        if (obj.getClass().isArray()) {
            this.i1LIL11l = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    public boolean hasNext() {
        if (this.illlI1lLIL < Array.getLength(this.i1LIL11l)) {
            return true;
        }
        return false;
    }

    public Object next() {
        Object obj = this.i1LIL11l;
        int i = this.illlI1lLIL;
        this.illlI1lLIL = i + 1;
        return Array.get(obj, i);
    }

    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
