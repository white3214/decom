package top.tntok.autobot;

import java.util.Iterator;

public class o0OOO0OO<T> implements Iterator<o0OOO0O0> {
    public Iterator<T> i1LIL11l;

    public o0OOO0OO(Iterator<T> it) {
        this.i1LIL11l = it;
    }

    public boolean hasNext() {
        return this.i1LIL11l.hasNext();
    }

    /* renamed from: iiI1L1iI */
    public o0OOO0O0 next() {
        return new o0OOO0O(this.i1LIL11l.next());
    }

    public void remove() {
        this.i1LIL11l.remove();
    }
}
