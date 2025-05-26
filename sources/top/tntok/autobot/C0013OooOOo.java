package top.tntok.autobot;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: top.tntok.autobot.OooOOo  reason: case insensitive filesystem */
public class C0013OooOOo {
    public static final int i1LIL11l = 262144;
    public static final int illlI1lLIL = 262139;
    public final DataOutputStream iiI1L1iI;

    public C0013OooOOo(OutputStream outputStream) {
        this.iiI1L1iI = new DataOutputStream(new BufferedOutputStream(outputStream));
    }

    public void iiI1L1iI(OooOOOO oooOOOO) throws IOException {
        int iLLLILIiLi1Ii = oooOOOO.iLLLILIiLi1Ii();
        this.iiI1L1iI.writeByte(iLLLILIiLi1Ii);
        if (iLLLILIiLi1Ii == 0) {
            byte[] bytes = oooOOOO.I11lLL1().getBytes(StandardCharsets.UTF_8);
            int iiI1L1iI2 = C0390o0OOoOo.iiI1L1iI(bytes, illlI1lLIL);
            this.iiI1L1iI.writeInt(iiI1L1iI2);
            this.iiI1L1iI.write(bytes, 0, iiI1L1iI2);
        } else if (iLLLILIiLi1Ii == 1) {
            this.iiI1L1iI.writeLong(oooOOOO.iilLil1i11I1());
        } else if (iLLLILIiLi1Ii == 2) {
            this.iiI1L1iI.writeShort(oooOOOO.iiIliillii());
            byte[] il1LilLllii = oooOOOO.il1LilLllii();
            this.iiI1L1iI.writeShort(il1LilLllii.length);
            this.iiI1L1iI.write(il1LilLllii);
        } else {
            throw new ilI11Illi1LLl(C0387o0OOoO0o.iiI1L1iI("fsrUNszdjP1O0to214qWpFvBhXg=\n", "K6S/WKOq4t0=\n") + iLLLILIiLi1Ii);
        }
        this.iiI1L1iI.flush();
    }
}
