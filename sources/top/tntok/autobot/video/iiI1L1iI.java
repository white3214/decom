package top.tntok.autobot.video;

import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import top.tntok.autobot.C0220o00oO0;
import top.tntok.autobot.C0234o00oOo;
import top.tntok.autobot.C0254o00oo0o;
import top.tntok.autobot.C0263o00ooOO0;
import top.tntok.autobot.C0363o0OOOo0O;
import top.tntok.autobot.C0387o0OOoO0o;
import top.tntok.autobot.C0396o0OOooO;
import top.tntok.autobot.C0494o0o000Oo;
import top.tntok.autobot.C0496o0o000oO;
import top.tntok.autobot.C0525o0oOO;
import top.tntok.autobot.Oooo000;
import top.tntok.autobot.i11liIIl11Ii1;
import top.tntok.autobot.i1iiLIil1ILi;
import top.tntok.autobot.o0O0OOO;
import top.tntok.autobot.o0O0o;
import top.tntok.autobot.o0OOOO0o;

public class iiI1L1iI extends C0396o0OOooO {
    public static final int I1I11Il1 = 512;
    public static final int I1IIIi1i1ILl = 16384;
    public static final /* synthetic */ boolean IIIlll1lll = false;
    public static final int IIlL1llI1 = 2048;
    public static final int IL111l1 = 4096;
    public static final int ILl1iII11Ll1 = 1;
    public static final int IilliIIIlI1ll = 32768;
    public static final int IliiLiLliIl = 256;
    public static final int i11liIIl11Ii1 = 64;
    public static final int i1iI1iiLL1 = 1024;
    public static final int i1iiLIil1ILi = 8;
    public static final int iiiiI1iILL11I = 128;
    public static final int il1l1IlL = 8192;
    public C0254o00oo0o I11lLL1;
    public final C0263o00ooOO0 I1iIiIi;
    public C0363o0OOOo0O I1l1iIll1lIi1;
    public final boolean IL1lILLLL1L;
    public C0363o0OOOo0O Ii1liIIIiLi;
    public int IiIIlIL;
    public final Rect IiiL1llIIi;
    public C0363o0OOOo0O IilL11ii1I1Il;
    public VirtualDisplay i111iLiiIIill;
    public final float i1L1lLllLLlIi;
    public final C0496o0o000oO i1LIL11l;
    public final boolean iILiI1lll;
    public final boolean iL1LIlIlI;
    public C0363o0OOOo0O iLLLILIiLi1Ii;
    public i1iiLIil1ILi iiIliillii;
    public int iiLIIiIli;
    public int iilLiIIIi11i;
    public i1iiLIil1ILi iilLil1i11I1;
    public final DisplaySizeMonitor il1LilLllii = new DisplaySizeMonitor();
    public final C0234o00oOo illlI1lLIL;

    public iiI1L1iI(C0496o0o000oO o0o000oo, o0O0o o0o0o) {
        boolean z;
        this.i1LIL11l = o0o000oo;
        this.illlI1lLIL = o0o0o.I1IIIi1i1ILl();
        this.iilLiIIIi11i = o0o0o.il1l1IlL();
        this.IiiL1llIIi = o0o0o.I1l1iIll1lIi1();
        if (o0o0o.iL1LIlIlI() != C0263o00ooOO0.iiI1L1iI.i1LIL11l) {
            z = true;
        } else {
            z = false;
        }
        this.iILiI1lll = z;
        this.I1iIiIi = o0o0o.IL1lILLLL1L();
        this.i1L1lLllLLlIi = o0o0o.iiI1L1iI();
        this.IL1lILLLL1L = o0o0o.IIi1l1i();
        this.iL1LIlIlI = o0o0o.IIllllLiIlIl();
    }

    public static int iILiI1lll(C0363o0OOOo0O o0oooo0o, int i, C0363o0OOOo0O o0oooo0o2) {
        return (i * o0oooo0o2.i1LIL11l()) / o0oooo0o.i1LIL11l();
    }

    public void I11lLL1() {
        this.il1LilLllii.iLLLILIiLi1Ii();
        VirtualDisplay virtualDisplay = this.i111iLiiIIill;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.i111iLiiIIill = null;
        }
    }

    public void I1iIiIi(Surface surface) {
        int i;
        int i2;
        try {
            if (this.IL1lILLLL1L) {
                i = 457;
            } else {
                i = 201;
            }
            if (this.iL1LIlIlI) {
                i |= 512;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                int i4 = i | 15360;
                if (i3 >= 34) {
                    i |= 64512;
                } else {
                    i2 = i4;
                    VirtualDisplay illlI1lLIL2 = o0OOOO0o.il1LilLllii().illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("EJbAGv/M\n", "Y/WyeY+1Rv4=\n"), this.IilL11ii1I1Il.illlI1lLIL(), this.IilL11ii1I1Il.iiI1L1iI(), this.iiLIIiIli, surface, i2);
                    this.i111iLiiIIill = illlI1lLIL2;
                    int displayId = illlI1lLIL2.getDisplay().getDisplayId();
                    C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("2sIvfQy68w/4xiFnSA==\n", "lKdYXWjTgH8=\n") + this.IilL11ii1I1Il.illlI1lLIL() + C0387o0OOoO0o.iiI1L1iI("vw==\n", "x6PdKOKP15g=\n") + this.IilL11ii1I1Il.iiI1L1iI() + C0387o0OOoO0o.iiI1L1iI("Lg==\n", "AY7Dsj6kIQw=\n") + this.iiLIIiIli + C0387o0OOoO0o.iiI1L1iI("uF/s+Ag=\n", "mHeFnDWG9P4=\n") + displayId + C0387o0OOoO0o.iiI1L1iI("8g==\n", "29lrgbAGzY0=\n"));
                    this.il1LilLllii.I11lLL1(displayId, new C0220o00oO0(this));
                }
            }
            i2 = i;
            VirtualDisplay illlI1lLIL22 = o0OOOO0o.il1LilLllii().illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("EJbAGv/M\n", "Y/WyeY+1Rv4=\n"), this.IilL11ii1I1Il.illlI1lLIL(), this.IilL11ii1I1Il.iiI1L1iI(), this.iiLIIiIli, surface, i2);
            this.i111iLiiIIill = illlI1lLIL22;
            int displayId2 = illlI1lLIL22.getDisplay().getDisplayId();
            C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("2sIvfQy68w/4xiFnSA==\n", "lKdYXWjTgH8=\n") + this.IilL11ii1I1Il.illlI1lLIL() + C0387o0OOoO0o.iiI1L1iI("vw==\n", "x6PdKOKP15g=\n") + this.IilL11ii1I1Il.iiI1L1iI() + C0387o0OOoO0o.iiI1L1iI("Lg==\n", "AY7Dsj6kIQw=\n") + this.iiLIIiIli + C0387o0OOoO0o.iiI1L1iI("uF/s+Ag=\n", "mHeFnDWG9P4=\n") + displayId2 + C0387o0OOoO0o.iiI1L1iI("8g==\n", "29lrgbAGzY0=\n"));
            this.il1LilLllii.I11lLL1(displayId2, new C0220o00oO0(this));
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("uG3aWfR12xiPIsxH9TTBEttmxkbgOdQO\n", "+wKvNZBVtXc=\n"), e);
            throw new AssertionError(C0387o0OOoO0o.iiI1L1iI("XRu4jjrdccFqVK6QO5xryz4QpJEukX7X\n", "HnTN4l79H64=\n"));
        }
    }

    public synchronized boolean IiIIlIL(int i) {
        this.iilLiIIIi11i = i;
        return true;
    }

    public void IiiL1llIIi() {
        C0254o00oo0o o00oo0o = this.I11lLL1;
        if (o00oo0o != null) {
            o00oo0o.I1iIiIi();
            this.I11lLL1 = null;
        }
    }

    public void i1LIL11l() {
        this.IilL11ii1I1Il = this.illlI1lLIL.i1LIL11l();
        int iiI1L1iI = this.illlI1lLIL.iiI1L1iI();
        this.iiLIIiIli = iiI1L1iI;
        if (this.IilL11ii1I1Il == null || iiI1L1iI == 0) {
            Oooo000 I11lLL12 = o0OOOO0o.il1LilLllii().I11lLL1(0);
            if (I11lLL12 != null) {
                this.iLLLILIiLi1Ii = I11lLL12.iilLil1i11I1();
                if (I11lLL12.iiIliillii() % 2 != 0) {
                    this.iLLLILIiLi1Ii = this.iLLLILIiLi1Ii.iilLil1i11I1();
                }
                this.IiIIlIL = I11lLL12.i1LIL11l();
                return;
            }
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("Tt9sf/R2bDlz0mRo9HxqPiPYamS6dilqZd9pfbZzZiEjymox5Ss3enuPNSnkMjd+M9p1eA==\n", "A74FEdQSBUo=\n"));
            this.iLLLILIiLi1Ii = new C0363o0OOOo0O(1920, 1080);
            this.IiIIlIL = 240;
        }
    }

    public void iLLLILIiLi1Ii() {
        il1LilLllii();
    }

    public synchronized C0363o0OOOo0O iiI1L1iI() {
        return this.Ii1liIIIiLi;
    }

    public void iilLiIIIi11i(Surface surface) throws IOException {
        if (this.iiIliillii != null) {
            C0254o00oo0o o00oo0o = new C0254o00oo0o(new i11liIIl11Ii1(this.iiIliillii));
            this.I11lLL1 = o00oo0o;
            surface = o00oo0o.iILiI1lll(this.I1l1iIll1lIi1, this.Ii1liIIIiLi, surface);
        }
        VirtualDisplay virtualDisplay = this.i111iLiiIIill;
        if (virtualDisplay == null) {
            I1iIiIi(surface);
        } else {
            virtualDisplay.setSurface(surface);
        }
        if (this.i1LIL11l != null) {
            this.i1LIL11l.il1LilLllii(this.i111iLiiIIill.getDisplay().getDisplayId(), o0O0OOO.iiI1L1iI(this.Ii1liIIIiLi, this.iilLil1i11I1, this.IilL11ii1I1Il));
        }
    }

    public void iilLil1i11I1() {
        int i;
        boolean z;
        if (this.i111iLiiIIill == null) {
            if (!this.illlI1lLIL.il1LilLllii()) {
                this.IilL11ii1I1Il = this.iLLLILIiLi1Ii;
            }
            if (!this.illlI1lLIL.illlI1lLIL()) {
                this.iiLIIiIli = iILiI1lll(this.iLLLILIiLi1Ii, this.IiIIlIL, this.IilL11ii1I1Il);
            }
            C0363o0OOOo0O o0oooo0o = this.IilL11ii1I1Il;
            this.Ii1liIIIiLi = o0oooo0o;
            this.il1LilLllii.iilLil1i11I1(o0oooo0o);
            i = 0;
        } else {
            Oooo000 I11lLL12 = o0OOOO0o.il1LilLllii().I11lLL1(this.i111iLiiIIill.getDisplay().getDisplayId());
            this.IilL11ii1I1Il = I11lLL12.iilLil1i11I1();
            this.iiLIIiIli = I11lLL12.i1LIL11l();
            i = I11lLL12.iiIliillii();
        }
        C0494o0o000Oo o0o000oo = new C0494o0o000Oo(this.IilL11ii1I1Il);
        Rect rect = this.IiiL1llIIi;
        if (rect != null) {
            if (i % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            o0o000oo.i1LIL11l(rect, z);
        }
        o0o000oo.illlI1lLIL(i, this.iILiI1lll, this.I1iIiIi);
        o0o000oo.iiI1L1iI((double) this.i1L1lLllLLlIi);
        C0363o0OOOo0O iLLLILIiLi1Ii2 = o0o000oo.iLLLILIiLi1Ii();
        if (!iLLLILIiLi1Ii2.il1LilLllii() || (this.iilLiIIIi11i != 0 && iLLLILIiLi1Ii2.i1LIL11l() > this.iilLiIIIi11i)) {
            int i2 = this.iilLiIIIi11i;
            if (i2 != 0) {
                iLLLILIiLi1Ii2 = iLLLILIiLi1Ii2.iiIliillii(i2);
            }
            o0o000oo.iiIliillii(iLLLILIiLi1Ii2.I11lLL1());
        }
        this.iilLil1i11I1 = o0o000oo.I11lLL1();
        this.Ii1liIIIiLi = o0o000oo.iLLLILIiLi1Ii();
        if (i % 2 == 0) {
            this.I1l1iIll1lIi1 = this.IilL11ii1I1Il;
        } else {
            this.I1l1iIll1lIi1 = this.IilL11ii1I1Il.iilLil1i11I1();
        }
        C0494o0o000Oo o0o000oo2 = new C0494o0o000Oo(this.I1l1iIll1lIi1);
        o0o000oo2.iilLil1i11I1(i);
        this.iiIliillii = i1iiLIil1ILi.iilLil1i11I1(o0o000oo2.I11lLL1(), this.iilLil1i11I1);
    }
}
