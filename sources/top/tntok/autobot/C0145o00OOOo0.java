package top.tntok.autobot;

import java.util.Iterator;
import java.util.List;
import org.junit.Ignore;

/* renamed from: top.tntok.autobot.o00OOOo0  reason: case insensitive filesystem */
public class C0145o00OOOo0 implements C0532o0oOo0o0, o000OO0O, C0258o00ooO0, C0007OooO0Oo {
    public final C0346o0OO0oOO i1LIL11l;
    public final Class<?> iiI1L1iI;
    public final C0144o00OOOo illlI1lLIL;

    public C0145o00OOOo0(Class<?> cls) {
        this(cls, C0144o00OOOo.I11lLL1());
    }

    public Class<?> I11lLL1() {
        return this.iiI1L1iI;
    }

    public final boolean IiIIlIL(C0009OooO0oO oooO0oO) {
        if (oooO0oO.iILiI1lll(Ignore.class) != null) {
            return true;
        }
        return false;
    }

    public void i1LIL11l(C0428o0Oo0oo0 o0oo0oo0) {
        this.i1LIL11l.i1LIL11l(this.illlI1lLIL.iLLLILIiLi1Ii(o0oo0oo0, this));
    }

    public List<C0532o0oOo0o0> iLLLILIiLi1Ii() {
        return this.illlI1lLIL.iiIliillii(iiI1L1iI());
    }

    public C0009OooO0oO iiI1L1iI() {
        return iilLiIIIi11i(this.i1LIL11l.iiI1L1iI());
    }

    public void iiIliillii(o000O0O o000o0o) throws C0529o0oOOo {
        o000o0o.iiI1L1iI(this.i1LIL11l);
    }

    public final C0009OooO0oO iilLiIIIi11i(C0009OooO0oO oooO0oO) {
        if (IiIIlIL(oooO0oO)) {
            return C0009OooO0oO.illlI1lLIL;
        }
        C0009OooO0oO i1LIL11l2 = oooO0oO.i1LIL11l();
        Iterator<C0009OooO0oO> it = oooO0oO.i1L1lLllLLlIi().iterator();
        while (it.hasNext()) {
            C0009OooO0oO iilLiIIIi11i = iilLiIIIi11i(it.next());
            if (!iilLiIIIi11i.IilL11ii1I1Il()) {
                i1LIL11l2.iiI1L1iI(iilLiIIIi11i);
            }
        }
        return i1LIL11l2;
    }

    public void iilLil1i11I1(C0260o00ooO0O o00ooo0o) throws o00OO0OO {
        o00ooo0o.iiI1L1iI(this.i1LIL11l);
    }

    public void il1LilLllii(C0369o0OOOoo0 o0ooooo0) {
        o0ooooo0.i1LIL11l(this.i1LIL11l);
    }

    public int illlI1lLIL() {
        return this.i1LIL11l.illlI1lLIL();
    }

    public String toString() {
        return this.iiI1L1iI.getName();
    }

    public C0145o00OOOo0(Class<?> cls, C0144o00OOOo o00oooo) {
        this.illlI1lLIL = o00oooo;
        this.iiI1L1iI = cls;
        this.i1LIL11l = C0328o0O0oo.i1LIL11l(cls).iLLLILIiLi1Ii();
    }
}
