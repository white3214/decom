package top.tntok.autobot;

public enum I1lILLiiI1iI {
    NormalClosure(1000),
    GoingAway(C0503o0o00OO0.iiLIIiIli),
    ProtocolError(1002),
    UnsupportedData(1003),
    NoStatusRcvd(C0503o0o00OO0.ILl1iII11Ll1),
    AbnormalClosure(1006),
    InvalidFramePayloadData(1007),
    PolicyViolation(1008),
    MessageTooBig(1009),
    MandatoryExt(1010),
    InternalServerError(1011),
    TLSHandshake(1015);
    
    private final int code;

    /* access modifiers changed from: public */
    I1lILLiiI1iI(int i) {
        this.code = i;
    }

    public static I1lILLiiI1iI i1LIL11l(int i) {
        for (I1lILLiiI1iI i1lILLiiI1iI : values()) {
            if (i1lILLiiI1iI.illlI1lLIL() == i) {
                return i1lILLiiI1iI;
            }
        }
        return null;
    }

    public int illlI1lLIL() {
        return this.code;
    }
}
