package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0OO0Ooo  reason: case insensitive filesystem */
public final class C0342o0OO0Ooo extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public C0342o0OO0Ooo(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public IOException i1LIL11l() {
        return this.firstException;
    }

    public void iiI1L1iI(IOException iOException) {
        C0487o0OooooO.i1LIL11l(this.firstException, iOException);
        this.lastException = iOException;
    }

    public IOException illlI1lLIL() {
        return this.lastException;
    }
}
