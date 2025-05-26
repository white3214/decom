package top.tntok.autobot;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.UiAutomation;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0oOoOoo  reason: case insensitive filesystem */
public class C0533o0oOoOoo {
    public UiAutomation i1LIL11l;
    public final HandlerThread iiI1L1iI = new HandlerThread(C0387o0OOoO0o.iiI1L1iI("deEDSg8zFh9U5zB3GjIfEkX6FlcJORoa\n", "IIhCP3tce34=\n"));
    public boolean iiIliillii = false;
    public Method il1LilLllii;
    public Method illlI1lLIL;

    public boolean I11lLL1() {
        return this.iiIliillii;
    }

    public void i1LIL11l() throws Exception {
        if (this.iiI1L1iI.isAlive()) {
            il1LilLllii().invoke(this.i1LIL11l, (Object[]) null);
            this.iiI1L1iI.quit();
            this.iiIliillii = false;
            return;
        }
        throw new IllegalStateException(C0387o0OOoO0o.iiI1L1iI("Sqj1Y0r7j85vrfRlRPGYi2iw4mIK\n", "C8SHBiuf9u4=\n"));
    }

    public void iLLLILIiLi1Ii(boolean z) {
        AccessibilityServiceInfo serviceInfo = this.i1LIL11l.getServiceInfo();
        if (z) {
            serviceInfo.flags &= -3;
        } else {
            serviceInfo.flags |= 2;
        }
        this.i1LIL11l.setServiceInfo(serviceInfo);
    }

    public void iiI1L1iI() {
        if (!this.iiI1L1iI.isAlive()) {
            this.iiI1L1iI.start();
            try {
                this.i1LIL11l = iilLil1i11I1();
                illlI1lLIL().invoke(this.i1LIL11l, new Object[]{1});
                this.iiIliillii = true;
            } catch (Exception e) {
                System.out.println(C0387o0OOoO0o.iiI1L1iI("lzhJljSwIFq2OGeNYLYjUrZxbZEysD8=\n", "wlEI40DfTTs=\n"));
                e.printStackTrace();
                throw new IllegalStateException(C0387o0OOoO0o.iiI1L1iI("gj0KJUxjwOegPhYuSGTNoqdw\n", "w1F4QC0Hucc=\n"));
            }
        } else {
            throw new IllegalStateException(C0387o0OOoO0o.iiI1L1iI("JjQ8C28BmQQENyAAawaUQQN5\n", "Z1hObg5l4CQ=\n"));
        }
    }

    public UiAutomation iiIliillii() {
        return this.i1LIL11l;
    }

    public final UiAutomation iilLil1i11I1() throws Exception {
        Object newInstance = Class.forName(C0387o0OOoO0o.iiI1L1iI("MI5wx5X4nZswkGSbr/i4wCWPedSO+JbbEo9625/yjdw+jg==\n", "UeAUtfqR+bU=\n")).getConstructor((Class[]) null).newInstance((Object[]) null);
        return UiAutomation.class.getConstructor(new Class[]{Looper.class, Class.forName(C0387o0OOoO0o.iiI1L1iI("eSDuHps0OFd5PvpCvQg1OG065QGVKTUWdg3lApo4Pw1xIeQ=\n", "GE6KbPRdXHk=\n"))}).newInstance(new Object[]{this.iiI1L1iI.getLooper(), newInstance});
    }

    public final Method il1LilLllii() throws Exception {
        if (this.il1LilLllii == null) {
            this.il1LilLllii = UiAutomation.class.getMethod(C0387o0OOoO0o.iiI1L1iI("qEF6wz1BWE+vXA==\n", "zCgJoFIvNio=\n"), (Class[]) null);
        }
        return this.il1LilLllii;
    }

    public final Method illlI1lLIL() throws Exception {
        if (this.illlI1lLIL == null) {
            this.illlI1lLIL = UiAutomation.class.getMethod(C0387o0OOoO0o.iiI1L1iI("WXypIORBJw==\n", "OhPHToEiUxg=\n"), new Class[]{Integer.TYPE});
        }
        return this.illlI1lLIL;
    }
}
