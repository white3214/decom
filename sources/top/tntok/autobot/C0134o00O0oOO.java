package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00O0oOO  reason: case insensitive filesystem */
public class C0134o00O0oOO extends Iil1LL1IlIIli {
    public Object i1LIL11l;

    public C0134o00O0oOO(double d) {
        this.i1LIL11l = Double.valueOf(d);
    }

    public void illlI1lLIL(Object obj, Object obj2) {
        if (obj instanceof Double) {
            Il1llillili.I1l1iIll1lIi1(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.i1LIL11l).doubleValue());
        } else {
            Il1llillili.iiLIIiIli(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.i1LIL11l).floatValue());
        }
    }

    public C0134o00O0oOO(float f) {
        this.i1LIL11l = Float.valueOf(f);
    }
}
