package top.tntok.autobot;

import android.media.MediaCodec;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;
import top.tntok.autobot.IiiIIil1l;

public final class ilLIlLiIILl1 implements IiiIIil1l {
    public final C0379o0OOo0o i1LIL11l;
    public final I1i1iiiI iiI1L1iI;
    public Thread illlI1lLIL;

    public ilLIlLiIILl1(I1i1iiiI i1i1iiiI, C0379o0OOo0o o0ooo0o) {
        this.iiI1L1iI = i1i1iiiI;
        this.i1LIL11l = o0ooo0o;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void iiIliillii(IiiIIil1l.iiI1L1iI iii1l1ii) {
        String str;
        String str2;
        boolean z = false;
        try {
            iilLil1i11I1();
            str = "UCDh0GlmsoZyOvfdYzTgkGU69cljIg==\n";
            str2 = "EVWFuQZGwOM=\n";
        } catch (ILiliIiI unused) {
            str = "zw9ZzqSNBgTtFU/Drt9UEvoVTdeuyQ==\n";
            str2 = "jno9p8utdGE=\n";
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("VYwSAiKvkMt3lgQPKP3C3WCWBhso6w==\n", "FPl2a02P4q4=\n"));
            iii1l1ii.iiI1L1iI(false);
            throw th;
        }
        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI(str, str2));
        iii1l1ii.iiI1L1iI(z);
    }

    public void i1LIL11l(IiiIIil1l.iiI1L1iI iii1l1ii) {
        Thread thread = new Thread(new I1IILIil1lLlL(this, iii1l1ii), C0387o0OOoO0o.iiI1L1iI("O61w/ryPhT8t\n", "WtgUl9Oi914=\n"));
        this.illlI1lLIL = thread;
        thread.start();
    }

    public void iiI1L1iI() {
        Thread thread = this.illlI1lLIL;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public final void iilLil1i11I1() throws IOException, ILiliIiI {
        if (Build.VERSION.SDK_INT < 30) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("k698IOpwDwShu3ol4DRRTbuuOCD2cAUCpvprPPUgBB+mv3xp5zUNAqC/OAjrNBkCu744eLQ=\n", "0toYSYVQa20=\n"));
            this.i1LIL11l.iiIliillii(false);
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4096);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            this.iiI1L1iI.illlI1lLIL();
            this.i1LIL11l.il1LilLllii();
            while (!Thread.currentThread().isInterrupted()) {
                allocateDirect.position(0);
                int il1LilLllii = this.iiI1L1iI.il1LilLllii(allocateDirect, bufferInfo);
                if (il1LilLllii >= 0) {
                    allocateDirect.limit(il1LilLllii);
                    this.i1LIL11l.iLLLILIiLi1Ii(allocateDirect, bufferInfo);
                } else {
                    throw new IOException(C0387o0OOoO0o.iiI1L1iI("VUF8IUlQ421iDnsoTBStY2NKYCIXUA==\n", "Fi4JTS1wjQI=\n") + il1LilLllii);
                }
            }
        } catch (IOException e) {
            if (!o00O000.iiI1L1iI(e)) {
                C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("xiGVnVacZjT3IISGXJxgJ/U7gw==\n", "h1Tx9Dm8BVU=\n"), e);
            }
        } catch (Throwable th) {
            this.iiI1L1iI.iiI1L1iI();
            throw th;
        }
        this.iiI1L1iI.iiI1L1iI();
    }

    public void illlI1lLIL() throws InterruptedException {
        Thread thread = this.illlI1lLIL;
        if (thread != null) {
            thread.join();
        }
    }
}
