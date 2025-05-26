package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00oo0  reason: case insensitive filesystem */
public enum C0247o00oo0 {
    Continuation(0),
    Text(1),
    Binary(2),
    Close(8),
    Ping(9),
    Pong(10);
    
    private final byte code;

    /* access modifiers changed from: public */
    C0247o00oo0(int i) {
        this.code = (byte) i;
    }

    public static C0247o00oo0 i1LIL11l(byte b) {
        for (C0247o00oo0 o00oo0 : values()) {
            if (o00oo0.illlI1lLIL() == b) {
                return o00oo0;
            }
        }
        return null;
    }

    public boolean il1LilLllii() {
        if (this == Close || this == Ping || this == Pong) {
            return true;
        }
        return false;
    }

    public byte illlI1lLIL() {
        return this.code;
    }
}
