package top.tntok.autobot;

import java.util.Iterator;

public abstract class o000O0O {
    public static final o000O0O iiI1L1iI = new iiI1L1iI();

    public class i1LIL11l extends o000O0O {
        public final /* synthetic */ C0009OooO0oO i1LIL11l;

        public i1LIL11l(C0009OooO0oO oooO0oO) {
            this.i1LIL11l = oooO0oO;
        }

        public String i1LIL11l() {
            return String.format("Method %s", new Object[]{this.i1LIL11l.iL1LIlIlI()});
        }

        public boolean iiIliillii(C0009OooO0oO oooO0oO) {
            if (oooO0oO.iiLIIiIli()) {
                return this.i1LIL11l.equals(oooO0oO);
            }
            Iterator<C0009OooO0oO> it = oooO0oO.i1L1lLllLLlIi().iterator();
            while (it.hasNext()) {
                if (iiIliillii(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public class illlI1lLIL extends o000O0O {
        public final /* synthetic */ o000O0O i1LIL11l;
        public final /* synthetic */ o000O0O illlI1lLIL;

        public illlI1lLIL(o000O0O o000o0o, o000O0O o000o0o2) {
            this.i1LIL11l = o000o0o;
            this.illlI1lLIL = o000o0o2;
        }

        public String i1LIL11l() {
            return this.i1LIL11l.i1LIL11l() + " and " + this.illlI1lLIL.i1LIL11l();
        }

        public boolean iiIliillii(C0009OooO0oO oooO0oO) {
            if (!this.i1LIL11l.iiIliillii(oooO0oO) || !this.illlI1lLIL.iiIliillii(oooO0oO)) {
                return false;
            }
            return true;
        }
    }

    public static o000O0O il1LilLllii(C0009OooO0oO oooO0oO) {
        return new i1LIL11l(oooO0oO);
    }

    public abstract String i1LIL11l();

    public void iiI1L1iI(Object obj) throws C0529o0oOOo {
        if (obj instanceof o000OO0O) {
            ((o000OO0O) obj).iiIliillii(this);
        }
    }

    public abstract boolean iiIliillii(C0009OooO0oO oooO0oO);

    public o000O0O illlI1lLIL(o000O0O o000o0o) {
        if (o000o0o == this || o000o0o == iiI1L1iI) {
            return this;
        }
        return new illlI1lLIL(this, o000o0o);
    }

    public class iiI1L1iI extends o000O0O {
        public String i1LIL11l() {
            return "all tests";
        }

        public boolean iiIliillii(C0009OooO0oO oooO0oO) {
            return true;
        }

        public void iiI1L1iI(Object obj) throws C0529o0oOOo {
        }

        public o000O0O illlI1lLIL(o000O0O o000o0o) {
            return o000o0o;
        }
    }
}
