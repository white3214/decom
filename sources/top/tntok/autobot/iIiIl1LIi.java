package top.tntok.autobot;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public class iIiIl1LIi implements Runnable {
    public final InputStream i1LIL11l;
    public final C0222o00oO00O iiI1L1iI;
    public final Socket illlI1lLIL;

    public iIiIl1LIi(C0222o00oO00O o00oo00o, InputStream inputStream, Socket socket) {
        this.iiI1L1iI = o00oo00o;
        this.i1LIL11l = inputStream;
        this.illlI1lLIL = socket;
    }

    public void iiI1L1iI() {
        C0222o00oO00O.i1iiLIil1ILi(this.i1LIL11l);
        C0222o00oO00O.i1iiLIil1ILi(this.illlI1lLIL);
    }

    public void run() {
        OutputStream outputStream = null;
        try {
            outputStream = this.illlI1lLIL.getOutputStream();
            C0084o000Oo0O o000oo0o = new C0084o000Oo0O(this.iiI1L1iI, this.iiI1L1iI.I1iIiIi().iiI1L1iI(), this.i1LIL11l, outputStream, this.illlI1lLIL.getInetAddress());
            while (!this.illlI1lLIL.isClosed()) {
                o000oo0o.il1LilLllii();
            }
        } catch (Exception e) {
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                C0222o00oO00O.I1l1iIll1lIi1.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e);
            }
        } catch (Throwable th) {
            C0222o00oO00O.i1iiLIil1ILi((Object) null);
            C0222o00oO00O.i1iiLIil1ILi(this.i1LIL11l);
            C0222o00oO00O.i1iiLIil1ILi(this.illlI1lLIL);
            this.iiI1L1iI.iLLLILIiLi1Ii.i1LIL11l(this);
            throw th;
        }
        C0222o00oO00O.i1iiLIil1ILi(outputStream);
        C0222o00oO00O.i1iiLIil1ILi(this.i1LIL11l);
        C0222o00oO00O.i1iiLIil1ILi(this.illlI1lLIL);
        this.iiI1L1iI.iLLLILIiLi1Ii.i1LIL11l(this);
    }
}
