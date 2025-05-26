package top.tntok.autobot;

import java.lang.annotation.Annotation;

public class o00OOO extends C0346o0OO0oOO implements o000OO0O, C0258o00ooO0 {
    public volatile C0532o0oOo0o0 iiI1L1iI;

    public static final class i1LIL11l implements C0423o0Oo0o0o {
        public final org.junit.runner.notification.iiI1L1iI iiI1L1iI;

        public final C0009OooO0oO I11lLL1(C0532o0oOo0o0 o0ooo0o0) {
            if (o0ooo0o0 instanceof C0007OooO0Oo) {
                return ((C0007OooO0Oo) o0ooo0o0).iiI1L1iI();
            }
            return C0009OooO0oO.I11lLL1(iLLLILIiLi1Ii(o0ooo0o0), IiIIlIL(o0ooo0o0));
        }

        public final String IiIIlIL(C0532o0oOo0o0 o0ooo0o0) {
            if (o0ooo0o0 instanceof C0534o0oOoo00) {
                return ((C0534o0oOoo00) o0ooo0o0).illi1LIILLiL();
            }
            return o0ooo0o0.toString();
        }

        public void i1LIL11l(C0532o0oOo0o0 o0ooo0o0, Throwable th) {
            this.iiI1L1iI.iilLil1i11I1(new o00O0O(I11lLL1(o0ooo0o0), th));
        }

        public final Class<? extends C0532o0oOo0o0> iLLLILIiLi1Ii(C0532o0oOo0o0 o0ooo0o0) {
            return o0ooo0o0.getClass();
        }

        public void iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, IillLillLLIii iillLillLLIii) {
            i1LIL11l(o0ooo0o0, iillLillLLIii);
        }

        public void iiIliillii(C0532o0oOo0o0 o0ooo0o0) {
            this.iiI1L1iI.iILiI1lll(I11lLL1(o0ooo0o0));
        }

        public void iilLil1i11I1(C0532o0oOo0o0 o0ooo0o0) {
            this.iiI1L1iI.iLLLILIiLi1Ii(I11lLL1(o0ooo0o0));
        }

        public i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
            this.iiI1L1iI = iii1l1ii;
        }
    }

    public o00OOO(Class<?> cls) {
        this((C0532o0oOo0o0) new C0432o0OoO000((Class<?>) cls.asSubclass(C0534o0oOoo00.class)));
    }

    public static Annotation[] IiIIlIL(C0534o0oOoo00 o0oooo00) {
        try {
            return o0oooo00.getClass().getMethod(o0oooo00.illi1LIILLiL(), (Class[]) null).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    public static C0009OooO0oO IiiL1llIIi(C0532o0oOo0o0 o0ooo0o0) {
        String str;
        if (o0ooo0o0 instanceof C0534o0oOoo00) {
            C0534o0oOoo00 o0oooo00 = (C0534o0oOoo00) o0ooo0o0;
            return C0009OooO0oO.iLLLILIiLi1Ii(o0oooo00.getClass(), o0oooo00.illi1LIILLiL(), IiIIlIL(o0oooo00));
        } else if (o0ooo0o0 instanceof C0432o0OoO000) {
            C0432o0OoO000 o0ooo000 = (C0432o0OoO000) o0ooo0o0;
            if (o0ooo000.iLLLILIiLi1Ii() == null) {
                str = iLLLILIiLi1Ii(o0ooo000);
            } else {
                str = o0ooo000.iLLLILIiLi1Ii();
            }
            C0009OooO0oO iilLil1i11I1 = C0009OooO0oO.iilLil1i11I1(str, new Annotation[0]);
            int iL1LIlIlI = o0ooo000.iL1LIlIlI();
            for (int i = 0; i < iL1LIlIlI; i++) {
                iilLil1i11I1.iiI1L1iI(IiiL1llIIi(o0ooo000.i1L1lLllLLlIi(i)));
            }
            return iilLil1i11I1;
        } else if (o0ooo0o0 instanceof C0007OooO0Oo) {
            return ((C0007OooO0Oo) o0ooo0o0).iiI1L1iI();
        } else {
            if (o0ooo0o0 instanceof C0420o0Oo0Ooo) {
                return IiiL1llIIi(((C0420o0Oo0Ooo) o0ooo0o0).illi1LIILLiL());
            }
            return C0009OooO0oO.illlI1lLIL(o0ooo0o0.getClass());
        }
    }

    public static String iLLLILIiLi1Ii(C0432o0OoO000 o0ooo000) {
        String str;
        int illlI1lLIL = o0ooo000.illlI1lLIL();
        if (illlI1lLIL == 0) {
            str = "";
        } else {
            str = String.format(" [example: %s]", new Object[]{o0ooo000.i1L1lLllLLlIi(0)});
        }
        return String.format("TestSuite with %s tests%s", new Object[]{Integer.valueOf(illlI1lLIL), str});
    }

    private C0532o0oOo0o0 iilLiIIIi11i() {
        return this.iiI1L1iI;
    }

    public C0423o0Oo0o0o I11lLL1(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        return new i1LIL11l(iii1l1ii);
    }

    public void i1LIL11l(org.junit.runner.notification.iiI1L1iI iii1l1ii) {
        C0428o0Oo0oo0 o0oo0oo0 = new C0428o0Oo0oo0();
        o0oo0oo0.illlI1lLIL(I11lLL1(iii1l1ii));
        iilLiIIIi11i().i1LIL11l(o0oo0oo0);
    }

    public final void iILiI1lll(C0532o0oOo0o0 o0ooo0o0) {
        this.iiI1L1iI = o0ooo0o0;
    }

    public C0009OooO0oO iiI1L1iI() {
        return IiiL1llIIi(iilLiIIIi11i());
    }

    public void iiIliillii(o000O0O o000o0o) throws C0529o0oOOo {
        if (iilLiIIIi11i() instanceof o000OO0O) {
            ((o000OO0O) iilLiIIIi11i()).iiIliillii(o000o0o);
        } else if (iilLiIIIi11i() instanceof C0432o0OoO000) {
            C0432o0OoO000 o0ooo000 = (C0432o0OoO000) iilLiIIIi11i();
            C0432o0OoO000 o0ooo0002 = new C0432o0OoO000(o0ooo000.iLLLILIiLi1Ii());
            int iL1LIlIlI = o0ooo000.iL1LIlIlI();
            for (int i = 0; i < iL1LIlIlI; i++) {
                C0532o0oOo0o0 i1L1lLllLLlIi = o0ooo000.i1L1lLllLLlIi(i);
                if (o000o0o.iiIliillii(IiiL1llIIi(i1L1lLllLLlIi))) {
                    o0ooo0002.iiI1L1iI(i1L1lLllLLlIi);
                }
            }
            iILiI1lll(o0ooo0002);
            if (o0ooo0002.iL1LIlIlI() == 0) {
                throw new C0529o0oOOo();
            }
        }
    }

    public void iilLil1i11I1(C0260o00ooO0O o00ooo0o) throws o00OO0OO {
        if (iilLiIIIi11i() instanceof C0258o00ooO0) {
            ((C0258o00ooO0) iilLiIIIi11i()).iilLil1i11I1(o00ooo0o);
        }
    }

    public void il1LilLllii(C0369o0OOOoo0 o0ooooo0) {
        if (iilLiIIIi11i() instanceof C0367o0OOOoOo) {
            ((C0367o0OOOoOo) iilLiIIIi11i()).il1LilLllii(o0ooooo0);
        }
    }

    public o00OOO(C0532o0oOo0o0 o0ooo0o0) {
        iILiI1lll(o0ooo0o0);
    }
}
