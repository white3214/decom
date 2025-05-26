package top.tntok.autobot.video;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.IDisplayWindowListener;
import top.tntok.autobot.C0028Oooo00o;
import top.tntok.autobot.C0363o0OOOo0O;
import top.tntok.autobot.C0387o0OOoO0o;
import top.tntok.autobot.C0525o0oOO;
import top.tntok.autobot.Model.DisplayWindowListener;
import top.tntok.autobot.Oooo0;
import top.tntok.autobot.Oooo000;
import top.tntok.autobot.o0OOOO0o;

public class DisplaySizeMonitor {
    public static final boolean I11lLL1;
    public static final /* synthetic */ boolean iLLLILIiLi1Ii = false;
    public HandlerThread i1LIL11l;
    public C0028Oooo00o.illlI1lLIL iiI1L1iI;
    public C0363o0OOOo0O iiIliillii;
    public iiI1L1iI iilLil1i11I1;
    public int il1LilLllii = -1;
    public IDisplayWindowListener illlI1lLIL;

    public interface iiI1L1iI {
        void iiI1L1iI();
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT != 34) {
            z = true;
        } else {
            z = false;
        }
        I11lLL1 = z;
    }

    public void I11lLL1(final int i, iiI1L1iI iii1l1ii) {
        this.iilLil1i11I1 = iii1l1ii;
        this.il1LilLllii = i;
        if (I11lLL1) {
            HandlerThread handlerThread = new HandlerThread(C0387o0OOoO0o.iiI1L1iI("a2nZlgHXUFpGc96DA9Nb\n", "LwCq5m22KRY=\n"));
            this.i1LIL11l = handlerThread;
            handlerThread.start();
            this.iiI1L1iI = o0OOOO0o.il1LilLllii().I1iIiIi(new Oooo0(this, i), new Handler(this.i1LIL11l.getLooper()));
            return;
        }
        this.illlI1lLIL = new DisplayWindowListener() {
            public void onDisplayConfigurationChanged(int i, Configuration configuration) {
                if (C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
                    C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("0thSRuMLCNH/y0R74AQY9vnDGxbgBDXr5cFNV/YpHuzw2EZD/QsF6/nfYl7uBBbn8pk=\n", "lrEhNo9qcYI=\n") + i + C0387o0OOoO0o.iiI1L1iI("9A==\n", "3WL0XTxRGSo=\n"));
                }
                if (i == i) {
                    DisplaySizeMonitor.this.illlI1lLIL();
                }
            }
        };
        o0OOOO0o.I1iIiIi().IL1lILLLL1L(this.illlI1lLIL);
    }

    public void iLLLILIiLi1Ii() {
        if (I11lLL1) {
            if (this.iiI1L1iI != null) {
                o0OOOO0o.il1LilLllii().IL1lILLLL1L(this.iiI1L1iI);
                this.iiI1L1iI = null;
            }
            HandlerThread handlerThread = this.i1LIL11l;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        } else if (this.illlI1lLIL != null) {
            o0OOOO0o.I1iIiIi().I1l1iIll1lIi1(this.illlI1lLIL);
        }
    }

    public final /* synthetic */ void iiIliillii(int i, int i2) {
        if (C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
            C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("DLGrVGYJX+shor1pZQZPzCeq4gRlBmLRO6i0RXMrTtkmv71AIg==\n", "SNjYJApoJrg=\n") + i2 + C0387o0OOoO0o.iiI1L1iI("UA==\n", "efsrgoIbyfs=\n"));
        }
        if (i2 == i) {
            illlI1lLIL();
        }
    }

    public synchronized void iilLil1i11I1(C0363o0OOOo0O o0oooo0o) {
        this.iiIliillii = o0oooo0o;
    }

    public final synchronized C0363o0OOOo0O il1LilLllii() {
        return this.iiIliillii;
    }

    public final void illlI1lLIL() {
        Oooo000 I11lLL12 = o0OOOO0o.il1LilLllii().I11lLL1(this.il1LilLllii);
        if (I11lLL12 == null) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("85XgF6VuUSXZmvxHr2BaTA==\n", "t/yTZ8kPKGw=\n") + this.il1LilLllii + C0387o0OOoO0o.iiI1L1iI("aLZtwA9UOBIqsCzcBE8+Wy2jaco=\n", "SNUMrmE7TDI=\n"));
            if (C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
                C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("3DxPzTrI3TXxL1nwOcfNEvcnBp0kzNUT/SZI7zPawRKwfAad\n", "mFU8vVappGY=\n") + il1LilLllii() + C0387o0OOoO0o.iiI1L1iI("60xtzITeNTqlDiSChQ==\n", "y2FT7KyrW1E=\n"));
            }
            iilLil1i11I1((C0363o0OOOo0O) null);
            this.iilLil1i11I1.iiI1L1iI();
            return;
        }
        C0363o0OOOo0O iilLil1i11I12 = I11lLL12.iilLil1i11I1();
        C0363o0OOOo0O il1LilLllii2 = il1LilLllii();
        if (!iilLil1i11I12.equals(il1LilLllii2)) {
            if (C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
                C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("Hkf/5jMQjmozVOnbMB+eTTVctrYtFIZMP134xDoCkk1yB7a2\n", "Wi6Mll9x9zk=\n") + il1LilLllii2 + C0387o0OOoO0o.iiI1L1iI("X2pMZw==\n", "f0dyR5XU7Kk=\n") + iilLil1i11I12);
            }
            iilLil1i11I1(iilLil1i11I12);
            this.iilLil1i11I1.iiI1L1iI();
        } else if (C0525o0oOO.I11lLL1(C0525o0oOO.iiI1L1iI.i1LIL11l)) {
            C0525o0oOO.iLLLILIiLi1Ii(C0387o0OOoO0o.iiI1L1iI("IaTp5FYKIwsMt//ZVQUzLAq/oLRpAiA9RaP14BoIMjkLqv/wGkM=\n", "Zc2alDprWlg=\n") + iilLil1i11I12 + C0387o0OOoO0o.iiI1L1iI("946jZq7aA7uqlPFnsI8Ip6rm5nGkjkX9\n", "3rSDAsH6bdQ=\n"));
        }
    }
}
