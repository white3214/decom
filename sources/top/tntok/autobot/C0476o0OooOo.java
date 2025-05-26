package top.tntok.autobot;

import android.os.IInterface;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0OooOo  reason: case insensitive filesystem */
public final class C0476o0OooOo {
    public Method i1LIL11l;
    public final IInterface iiI1L1iI;
    public boolean iiIliillii = true;
    public Method iilLil1i11I1;
    public Method il1LilLllii;
    public boolean illlI1lLIL;

    public C0476o0OooOo(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public static C0476o0OooOo i1LIL11l() {
        return new C0476o0OooOo(o0OOOO0o.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("m8kUS+b/htua\n", "6L11P5OM5Lo=\n"), C0387o0OOoO0o.iiI1L1iI("R72kaJN/EP9Lu61om38A6Fa8qCrcYgDsUKe6JJNjWsR3pqgyh2I27FaBrDSEeBfo\n", "JNLJRvIRdI0=\n")));
    }

    public final Method I11lLL1() throws NoSuchMethodException {
        if (this.il1LilLllii == null) {
            try {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("Dms44V+iE3cfZyHuVrUQcwV2JA==\n", "axNIgDHGQBI=\n"), new Class[]{String.class});
            } catch (NoSuchMethodException unused) {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("emo3U9BIDkprZi5c2V8NTnF3Kw==\n", "HxJHMr4sXS8=\n"), (Class[]) null);
                this.iiIliillii = false;
            }
        }
        return this.il1LilLllii;
    }

    public void iiI1L1iI() {
        try {
            iiIliillii().invoke(this.iiI1L1iI, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("yi6rwRH34Tf9YbfDA7jkPaksu9kduOs=\n", "iUHerXXXj1g=\n"), e);
        }
    }

    public final Method iiIliillii() throws NoSuchMethodException {
        if (this.iilLil1i11I1 == null) {
            this.iilLil1i11I1 = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("/gUyc2TCwULNCzB6acE=\n", "nWpeHwWysic=\n"), (Class[]) null);
        }
        return this.iilLil1i11I1;
    }

    public final Method iilLil1i11I1() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("T9VIHAXhEZtexF4UCOQrnUXDSy0K6zqY\n", "Kq04fWuFX/Q=\n"), (Class[]) null);
            } catch (NoSuchMethodException unused) {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("gv249OG89AyT7K787LnOCojru8Xutt8P\n", "54XIlY/YumM=\n"), new Class[]{Integer.TYPE});
                this.illlI1lLIL = true;
            }
        }
        return this.i1LIL11l;
    }

    public void il1LilLllii() {
        try {
            Method I11lLL1 = I11lLL1();
            if (this.iiIliillii) {
                I11lLL1.invoke(this.iiI1L1iI, new Object[]{null});
                return;
            }
            I11lLL1.invoke(this.iiI1L1iI, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("+6zuWm6T+gLM4/JYfNz/CJiu/kJi3PA=\n", "uMObNgqzlG0=\n"), e);
        }
    }

    public void illlI1lLIL() {
        try {
            Method iilLil1i11I12 = iilLil1i11I1();
            if (this.illlI1lLIL) {
                iilLil1i11I12.invoke(this.iiI1L1iI, new Object[]{0});
                return;
            }
            iilLil1i11I12.invoke(this.iiI1L1iI, (Object[]) null);
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("v0udZxqLaLaIBIFlCMRtvNxJjX8WxGI=\n", "/CToC36rBtk=\n"), e);
        }
    }
}
