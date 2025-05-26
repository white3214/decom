package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: top.tntok.autobot.o00ooO0o  reason: case insensitive filesystem */
public abstract class C0261o00ooO0o {
    public static final String i1LIL11l = "Ordering class %s should have a public constructor with signature %s(Ordering.Context context)";

    /* renamed from: top.tntok.autobot.o00ooO0o$i1LIL11l */
    public static class i1LIL11l {
        public final C0009OooO0oO iiI1L1iI;

        public /* synthetic */ i1LIL11l(C0009OooO0oO oooO0oO, iiI1L1iI iii1l1ii) {
            this(oooO0oO);
        }

        public C0009OooO0oO iiI1L1iI() {
            return this.iiI1L1iI;
        }

        public i1LIL11l(C0009OooO0oO oooO0oO) {
            this.iiI1L1iI = oooO0oO;
        }
    }

    /* renamed from: top.tntok.autobot.o00ooO0o$iiI1L1iI */
    public class iiI1L1iI extends C0261o00ooO0o {
        public final /* synthetic */ Random illlI1lLIL;

        public iiI1L1iI(Random random) {
            this.illlI1lLIL = random;
        }

        public boolean iLLLILIiLi1Ii() {
            return false;
        }

        public List<C0009OooO0oO> iilLil1i11I1(Collection<C0009OooO0oO> collection) {
            ArrayList arrayList = new ArrayList(collection);
            Collections.shuffle(arrayList, this.illlI1lLIL);
            return arrayList;
        }
    }

    /* renamed from: top.tntok.autobot.o00ooO0o$illlI1lLIL */
    public interface illlI1lLIL {
        C0261o00ooO0o iiI1L1iI(i1LIL11l i1lil11l);
    }

    public static C0261o00ooO0o I11lLL1(Random random) {
        return new iiI1L1iI(random);
    }

    public static String iiIliillii(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return cls.getName();
        }
        return canonicalName;
    }

    public static C0261o00ooO0o il1LilLllii(illlI1lLIL illli1llil, C0009OooO0oO oooO0oO) throws o00OO0OO {
        if (illli1llil == null) {
            throw new NullPointerException("factory cannot be null");
        } else if (oooO0oO != null) {
            return illli1llil.iiI1L1iI(new i1LIL11l(oooO0oO, (iiI1L1iI) null));
        } else {
            throw new NullPointerException("annotatedTestClass cannot be null");
        }
    }

    public static C0261o00ooO0o illlI1lLIL(Class<? extends illlI1lLIL> cls, C0009OooO0oO oooO0oO) throws o00OO0OO {
        if (cls == null) {
            throw new NullPointerException("factoryClass cannot be null");
        } else if (oooO0oO != null) {
            try {
                return il1LilLllii((illlI1lLIL) cls.getConstructor((Class[]) null).newInstance((Object[]) null), oooO0oO);
            } catch (NoSuchMethodException unused) {
                throw new o00OO0OO(String.format(i1LIL11l, new Object[]{iiIliillii(cls), cls.getSimpleName()}));
            } catch (Exception e) {
                throw new o00OO0OO("Could not create ordering for " + oooO0oO, e);
            }
        } else {
            throw new NullPointerException("annotatedTestClass cannot be null");
        }
    }

    public void i1LIL11l(Object obj) throws o00OO0OO {
        if (obj instanceof C0258o00ooO0) {
            ((C0258o00ooO0) obj).iilLil1i11I1(new C0260o00ooO0O(this));
        }
    }

    public boolean iLLLILIiLi1Ii() {
        return true;
    }

    public abstract List<C0009OooO0oO> iilLil1i11I1(Collection<C0009OooO0oO> collection);
}
