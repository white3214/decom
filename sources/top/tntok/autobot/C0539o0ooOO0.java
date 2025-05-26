package top.tntok.autobot;

import java.io.IOException;

/* renamed from: top.tntok.autobot.o0ooOO0  reason: case insensitive filesystem */
public class C0539o0ooOO0 extends C0077o000O0o0 {
    public boolean illlI1lLIL;

    public C0539o0ooOO0(C0361o0OOOo0 o0oooo0) {
        super(o0oooo0);
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        if (this.illlI1lLIL) {
            iiILIlLLiIL.skip(j);
            return;
        }
        try {
            super.I1iIiIi(iiILIlLLiIL, j);
        } catch (IOException e) {
            this.illlI1lLIL = true;
            i1LIL11l(e);
        }
    }

    public void close() throws IOException {
        if (!this.illlI1lLIL) {
            try {
                super.close();
            } catch (IOException e) {
                this.illlI1lLIL = true;
                i1LIL11l(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.illlI1lLIL) {
            try {
                super.flush();
            } catch (IOException e) {
                this.illlI1lLIL = true;
                i1LIL11l(e);
            }
        }
    }

    public void i1LIL11l(IOException iOException) {
    }
}
