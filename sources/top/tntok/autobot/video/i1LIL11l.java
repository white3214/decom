package top.tntok.autobot.video;

import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.os.IBinder;
import android.view.Surface;
import java.io.IOException;
import top.tntok.autobot.C0167o00OoOOO;
import top.tntok.autobot.C0254o00oo0o;
import top.tntok.autobot.C0263o00ooOO0;
import top.tntok.autobot.C0349o0OO0ooO;
import top.tntok.autobot.C0363o0OOOo0O;
import top.tntok.autobot.C0387o0OOoO0o;
import top.tntok.autobot.C0396o0OOooO;
import top.tntok.autobot.C0398o0OOooOO;
import top.tntok.autobot.C0494o0o000Oo;
import top.tntok.autobot.C0496o0o000oO;
import top.tntok.autobot.C0525o0oOO;
import top.tntok.autobot.Oooo000;
import top.tntok.autobot.i11liIIl11Ii1;
import top.tntok.autobot.i1iiLIil1ILi;
import top.tntok.autobot.i1iliIlLli;
import top.tntok.autobot.o0O0OOO;
import top.tntok.autobot.o0O0o;
import top.tntok.autobot.o0OOOO0o;

public class i1LIL11l extends C0396o0OOooO {
    public static final /* synthetic */ boolean iL1LIlIlI = false;
    public C0263o00ooOO0 I11lLL1;
    public VirtualDisplay I1iIiIi;
    public C0254o00oo0o IL1lILLLL1L;
    public Oooo000 IiIIlIL;
    public final DisplaySizeMonitor IiiL1llIIi = new DisplaySizeMonitor();
    public i1iiLIil1ILi i1L1lLllLLlIi;
    public final C0496o0o000oO i1LIL11l;
    public IBinder iILiI1lll;
    public final float iLLLILIiLi1Ii;
    public final Rect iiIliillii;
    public C0363o0OOOo0O iilLiIIIi11i;
    public C0263o00ooOO0.iiI1L1iI iilLil1i11I1;
    public int il1LilLllii;
    public final int illlI1lLIL;

    public i1LIL11l(C0496o0o000oO o0o000oo, o0O0o o0o0o) {
        this.i1LIL11l = o0o000oo;
        this.illlI1lLIL = o0o0o.iiLIIiIli();
        this.il1LilLllii = o0o0o.il1l1IlL();
        this.iiIliillii = o0o0o.I1l1iIll1lIi1();
        this.iilLil1i11I1 = o0o0o.iL1LIlIlI();
        this.I11lLL1 = o0o0o.IL1lILLLL1L();
        this.iLLLILIiLi1Ii = o0o0o.iiI1L1iI();
    }

    public static void I1iIiIi(IBinder iBinder, Surface surface, Rect rect, Rect rect2, int i) {
        C0398o0OOooOO.iL1LIlIlI();
        try {
            C0398o0OOooOO.iiLIIiIli(iBinder, surface);
            C0398o0OOooOO.I1l1iIll1lIi1(iBinder, 0, rect, rect2);
            C0398o0OOooOO.Ii1liIIIiLi(iBinder, i);
        } finally {
            C0398o0OOooOO.iiI1L1iI();
        }
    }

    public static IBinder iILiI1lll() throws Exception {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || (i == 30 && !C0387o0OOoO0o.iiI1L1iI("Cg==\n", "WcuVzR0NllI=\n").equals(Build.VERSION.CODENAME))) {
            z = true;
        } else {
            z = false;
        }
        return C0398o0OOooOO.i1LIL11l(C0387o0OOoO0o.iiI1L1iI("1xBEp1NY\n", "pHM2xCMhoB4=\n"), z);
    }

    public void I11lLL1() {
        this.IiiL1llIIi.iLLLILIiLi1Ii();
        IBinder iBinder = this.iILiI1lll;
        if (iBinder != null) {
            C0398o0OOooOO.illlI1lLIL(iBinder);
            this.iILiI1lll = null;
        }
        VirtualDisplay virtualDisplay = this.I1iIiIi;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.I1iIiIi = null;
        }
    }

    public boolean IiIIlIL(int i) {
        this.il1LilLllii = i;
        return true;
    }

    public void IiiL1llIIi() {
        C0254o00oo0o o00oo0o = this.IL1lILLLL1L;
        if (o00oo0o != null) {
            o00oo0o.I1iIiIi();
            this.IL1lILLLL1L = null;
        }
    }

    public void i1LIL11l() {
        this.IiiL1llIIi.I11lLL1(this.illlI1lLIL, new C0349o0OO0ooO(this));
    }

    public void iLLLILIiLi1Ii() {
        il1LilLllii();
    }

    public C0363o0OOOo0O iiI1L1iI() {
        return this.iilLiIIIi11i;
    }

    public void iilLiIIIi11i(Surface surface) throws IOException {
        C0363o0OOOo0O o0oooo0o;
        o0O0OOO o0o0ooo;
        int i;
        IBinder iBinder = this.iILiI1lll;
        if (iBinder != null) {
            C0398o0OOooOO.illlI1lLIL(iBinder);
            this.iILiI1lll = null;
        }
        VirtualDisplay virtualDisplay = this.I1iIiIi;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.I1iIiIi = null;
        }
        if (this.i1L1lLllLLlIi != null) {
            o0oooo0o = this.IiIIlIL.iilLil1i11I1();
            C0254o00oo0o o00oo0o = new C0254o00oo0o(new i11liIIl11Ii1(this.i1L1lLllLLlIi));
            this.IL1lILLLL1L = o00oo0o;
            surface = o00oo0o.iILiI1lll(o0oooo0o, this.iilLiIIIi11i, surface);
        } else {
            o0oooo0o = this.iilLiIIIi11i;
        }
        try {
            this.I1iIiIi = o0OOOO0o.il1LilLllii().il1LilLllii(C0387o0OOoO0o.iiI1L1iI("ZzW5hV0S\n", "FFbL5i1r4MQ=\n"), o0oooo0o.illlI1lLIL(), o0oooo0o.iiI1L1iI(), this.illlI1lLIL, surface);
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("jcfaUnHd/YTp29pLc9uk+qDd2U58xcnfp8/OR2+cxe6A\n", "ya6pIh28hL4=\n"));
        } catch (Exception e) {
            try {
                this.iILiI1lll = iILiI1lll();
                C0363o0OOOo0O iilLil1i11I12 = this.IiIIlIL.iilLil1i11I1();
                I1iIiIi(this.iILiI1lll, surface, iilLil1i11I12.iLLLILIiLi1Ii(), o0oooo0o.iLLLILIiLi1Ii(), this.IiIIlIL.il1LilLllii());
                C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("dbyUkkOwgh4RoJSLQbbbd0SngYNMtLhLX6GVjUPxunR4\n", "MdXn4i/R+yQ=\n"));
            } catch (Exception e2) {
                C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("T005ZtyqjRZ4Ai943euXHCxGJXnI5oIALFc/Y9btwz1lUTxm2fOuGGJDK2/K\n", "DCJMCriK43k=\n"), e);
                C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("VC9C9/NbWQ5jYFTp8hpDBDckXujnF1YYNzVE8vkcFzJiMlH69B50Dnk0RfT7\n", "F0A3m5d7N2E=\n"), e2);
                throw new AssertionError(C0387o0OOoO0o.iiI1L1iI("5qQjR9QChhnR6zVZ1UOcE4WvP1jATokP\n", "pctWK7Ai6HY=\n"));
            }
        }
        if (this.i1LIL11l != null) {
            if (this.I1iIiIi == null || this.illlI1lLIL == 0) {
                o0o0ooo = o0O0OOO.iiI1L1iI(this.iilLiIIIi11i, this.i1L1lLllLLlIi, this.IiIIlIL.iilLil1i11I1());
                i = this.illlI1lLIL;
            } else {
                o0o0ooo = o0O0OOO.iiI1L1iI(this.iilLiIIIi11i, this.i1L1lLllLLlIi, o0oooo0o);
                i = this.I1iIiIi.getDisplay().getDisplayId();
            }
            this.i1LIL11l.il1LilLllii(i, o0o0ooo);
        }
    }

    public void iilLil1i11I1() throws i1iliIlLli {
        boolean z;
        Oooo000 I11lLL12 = o0OOOO0o.il1LilLllii().I11lLL1(this.illlI1lLIL);
        this.IiIIlIL = I11lLL12;
        if (I11lLL12 != null) {
            boolean z2 = true;
            if ((I11lLL12.illlI1lLIL() & 1) == 0) {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("3YKbHo89T8r9hI0djXtCyvGKngvDGnqr3rS7O7MMebjNuLc+sRNir9q/rSq8HmOs3666PcM6Wov+\nx8gDii5EheuChgnDP1eEuYmNTpE5RZ7rgosahjg=\n", "mevobuNcNuo=\n"));
            }
            C0363o0OOOo0O iilLil1i11I12 = this.IiIIlIL.iilLil1i11I1();
            this.IiiL1llIIi.iilLil1i11I1(iilLil1i11I12);
            if (this.iilLil1i11I1 == C0263o00ooOO0.iiI1L1iI.illlI1lLIL) {
                this.iilLil1i11I1 = C0263o00ooOO0.iiI1L1iI.il1LilLllii;
                this.I11lLL1 = C0263o00ooOO0.i1LIL11l(this.IiIIlIL.iiIliillii());
            }
            C0494o0o000Oo o0o000oo = new C0494o0o000Oo(iilLil1i11I12);
            if (this.iiIliillii != null) {
                if (this.IiIIlIL.iiIliillii() % 2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                o0o000oo.i1LIL11l(this.iiIliillii, z);
            }
            if (this.iilLil1i11I1 == C0263o00ooOO0.iiI1L1iI.i1LIL11l) {
                z2 = false;
            }
            o0o000oo.illlI1lLIL(this.IiIIlIL.iiIliillii(), z2, this.I11lLL1);
            o0o000oo.iiI1L1iI((double) this.iLLLILIiLi1Ii);
            this.i1L1lLllLLlIi = o0o000oo.I11lLL1();
            this.iilLiIIIi11i = o0o000oo.iLLLILIiLi1Ii().iiIliillii(this.il1LilLllii).I11lLL1();
            return;
        }
        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("A/8E4muDo8c=\n", "R5Z3kgfi2uc=\n") + this.illlI1lLIL + C0387o0OOoO0o.iiI1L1iI("gFCcdqRuNNTOWvk=\n", "oD7zAoQIW6E=\n") + C0167o00OoOOO.iilLil1i11I1());
        throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("EPBvKXC44dEh93c3c6720Sz6Pmc=\n", "RZ4ERx/Pj/E=\n") + this.illlI1lLIL);
    }
}
