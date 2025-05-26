package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IiiI1LIIl implements C0113o000ooO0 {
    public final List<iIiIl1LIi> i1LIL11l = Collections.synchronizedList(new ArrayList());
    public long iiI1L1iI;

    public void i1LIL11l(iIiIl1LIi iiiil1lii) {
        this.i1LIL11l.remove(iiiil1lii);
    }

    public void iiI1L1iI(iIiIl1LIi iiiil1lii) {
        this.iiI1L1iI++;
        this.i1LIL11l.add(iiiil1lii);
        il1LilLllii(iiiil1lii).start();
    }

    public List<iIiIl1LIi> iiIliillii() {
        return this.i1LIL11l;
    }

    public Thread il1LilLllii(iIiIl1LIi iiiil1lii) {
        Thread thread = new Thread(iiiil1lii);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.iiI1L1iI + ")");
        return thread;
    }

    public void illlI1lLIL() {
        Iterator it = new ArrayList(this.i1LIL11l).iterator();
        while (it.hasNext()) {
            ((iIiIl1LIi) it.next()).iiI1L1iI();
        }
    }
}
