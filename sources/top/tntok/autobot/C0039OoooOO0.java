package top.tntok.autobot;

/* renamed from: top.tntok.autobot.OoooOO0  reason: case insensitive filesystem */
public enum C0039OoooOO0 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    /* access modifiers changed from: public */
    C0039OoooOO0(int i) {
        this.httpCode = i;
    }

    public static C0039OoooOO0 iiI1L1iI(int i) {
        for (C0039OoooOO0 ooooOO0 : values()) {
            if (ooooOO0.httpCode == i) {
                return ooooOO0;
            }
        }
        return null;
    }
}
