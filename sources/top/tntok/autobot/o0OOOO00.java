package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

public class o0OOOO00 implements Runnable {
    public final int i1LIL11l;
    public C0222o00oO00O iiI1L1iI;
    public boolean il1LilLllii = false;
    public IOException illlI1lLIL;

    public o0OOOO00(C0222o00oO00O o00oo00o, int i) {
        this.iiI1L1iI = o00oo00o;
        this.i1LIL11l = i;
    }

    public boolean i1LIL11l() {
        return this.il1LilLllii;
    }

    public IOException iiI1L1iI() {
        return this.illlI1lLIL;
    }

    public void run() {
        InetSocketAddress inetSocketAddress;
        try {
            ServerSocket IiiL1llIIi = this.iiI1L1iI.IiiL1llIIi();
            if (this.iiI1L1iI.iiI1L1iI != null) {
                C0222o00oO00O o00oo00o = this.iiI1L1iI;
                inetSocketAddress = new InetSocketAddress(o00oo00o.iiI1L1iI, o00oo00o.i1LIL11l);
            } else {
                inetSocketAddress = new InetSocketAddress(this.iiI1L1iI.i1LIL11l);
            }
            IiiL1llIIi.bind(inetSocketAddress);
            this.il1LilLllii = true;
            do {
                try {
                    Socket accept = this.iiI1L1iI.IiiL1llIIi().accept();
                    accept.setSendBufferSize(307200);
                    accept.setTcpNoDelay(true);
                    int i = this.i1LIL11l;
                    if (i > 0) {
                        accept.setSoTimeout(i);
                    }
                    InputStream inputStream = accept.getInputStream();
                    C0222o00oO00O o00oo00o2 = this.iiI1L1iI;
                    o00oo00o2.iLLLILIiLi1Ii.iiI1L1iI(o00oo00o2.illlI1lLIL(accept, inputStream));
                } catch (IOException e) {
                    C0222o00oO00O.I1l1iIll1lIi1.log(Level.FINE, "Communication with the client broken", e);
                }
            } while (!this.iiI1L1iI.IiiL1llIIi().isClosed());
        } catch (IOException e2) {
            this.illlI1lLIL = e2;
        }
    }
}
