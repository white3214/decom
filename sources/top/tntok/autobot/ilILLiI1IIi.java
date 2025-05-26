package top.tntok.autobot;

import java.nio.charset.CharacterCodingException;

public class ilILLiI1IIi extends C0502o0o00O0o {
    public static final /* synthetic */ boolean iilLiIIIi11i = false;
    public String IiIIlIL;
    public I1lILLiiI1iI iLLLILIiLi1Ii;

    public ilILLiI1IIi(I1lILLiiI1iI i1lILLiiI1iI, String str) throws CharacterCodingException {
        super(C0247o00oo0.Close, true, ILl1iII11Ll1(i1lILLiiI1iI, str));
    }

    public static byte[] ILl1iII11Ll1(I1lILLiiI1iI i1lILLiiI1iI, String str) throws CharacterCodingException {
        if (i1lILLiiI1iI == null) {
            return new byte[0];
        }
        byte[] I1l1iIll1lIi1 = C0502o0o00O0o.I1l1iIll1lIi1(str);
        byte[] bArr = new byte[(I1l1iIll1lIi1.length + 2)];
        bArr[0] = (byte) ((i1lILLiiI1iI.illlI1lLIL() >> 8) & 255);
        bArr[1] = (byte) (i1lILLiiI1iI.illlI1lLIL() & 255);
        System.arraycopy(I1l1iIll1lIi1, 0, bArr, 2, I1l1iIll1lIi1.length);
        return bArr;
    }

    public String i11liIIl11Ii1() {
        return this.IiIIlIL;
    }

    public I1lILLiiI1iI i1iiLIil1ILi() {
        return this.iLLLILIiLi1Ii;
    }

    public ilILLiI1IIi(C0502o0o00O0o o0o00o0o) throws CharacterCodingException {
        super(o0o00o0o);
        if (o0o00o0o.il1LilLllii().length >= 2) {
            this.iLLLILIiLi1Ii = I1lILLiiI1iI.i1LIL11l((o0o00o0o.il1LilLllii()[1] & i1IL1lILl1L1I.iiI1L1iI) | ((o0o00o0o.il1LilLllii()[0] & i1IL1lILl1L1I.iiI1L1iI) << 8));
            this.IiIIlIL = C0502o0o00O0o.i1LIL11l(il1LilLllii(), 2, il1LilLllii().length - 2);
        }
    }
}
