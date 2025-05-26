package top.tntok.autobot;

import android.net.LocalSocket;
import java.io.IOException;

public final class i11ILLI1I {
    public final C0013OooOOo i1LIL11l;
    public final Il1lL1lLIL iiI1L1iI;

    public i11ILLI1I(LocalSocket localSocket) throws IOException {
        this.iiI1L1iI = new Il1lL1lLIL(localSocket.getInputStream());
        this.i1LIL11l = new C0013OooOOo(localSocket.getOutputStream());
    }

    public void i1LIL11l(OooOOOO oooOOOO) throws IOException {
        this.i1LIL11l.iiI1L1iI(oooOOOO);
    }

    public iI11ilILI iiI1L1iI() throws IOException {
        return this.iiI1L1iI.Ii1liIIIiLi();
    }
}
