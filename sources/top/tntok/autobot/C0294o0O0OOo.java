package top.tntok.autobot;

import android.os.Build;
import android.os.IInterface;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0O0OOo  reason: case insensitive filesystem */
public final class C0294o0O0OOo {
    public Method i1LIL11l;
    public final IInterface iiI1L1iI;

    public C0294o0O0OOo(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public static C0294o0O0OOo iiI1L1iI() {
        return new C0294o0O0OOo(o0OOOO0o.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("mknNCEM=\n", "6ia6bTHJUog=\n"), C0387o0OOoO0o.iiI1L1iI("Acx+IQNz1KoP0TQaPHXH4RLvez0NfdX2\n", "YKIaU2wasIQ=\n")));
    }

    public final Method i1LIL11l() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("5a4W5IgRjWb1lDz5nhOAZPi0JOg=\n", "jN1Sjfth4Qc=\n"), new Class[]{Integer.TYPE});
            } else {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("fFX/wARqxrN2Ut/YFQ==\n", "FSa2rnAPtNI=\n"), (Class[]) null);
            }
        }
        return this.i1LIL11l;
    }

    public boolean illlI1lLIL(int i) {
        try {
            Method i1LIL11l2 = i1LIL11l();
            if (Build.VERSION.SDK_INT < 34) {
                return ((Boolean) i1LIL11l2.invoke(this.iiI1L1iI, (Object[]) null)).booleanValue();
            }
            return ((Boolean) i1LIL11l2.invoke(this.iiI1L1iI, new Object[]{Integer.valueOf(i)})).booleanValue();
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("o/Pbakf7f1mUvMdoVbR6U8Dxy3JLtHU=\n", "4JyuBiPbETY=\n"), e);
            return false;
        }
    }
}
