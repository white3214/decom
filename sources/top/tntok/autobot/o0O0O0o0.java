package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class o0O0O0o0 extends iLLlLL1i1ILl1 {
    public o0O0O0o0(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    public boolean i111iLiiIIill(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "Buffer");
        if (bArr.length <= this.il1LilLllii) {
            if (this.illlI1lLIL.il1LilLllii() < bArr.length) {
                iiI1L1iI();
            }
            return this.illlI1lLIL.IiIIlIL(bArr, i, i2);
        }
        throw new IllegalArgumentException("Peek request size of " + bArr.length + " bytes exceeds buffer size of " + this.il1LilLllii + " bytes");
    }

    public boolean il1LilLllii(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr, "Buffer");
        if (bArr.length <= this.il1LilLllii) {
            if (this.illlI1lLIL.il1LilLllii() < bArr.length) {
                iiI1L1iI();
            }
            return this.illlI1lLIL.IiIIlIL(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Peek request size of " + bArr.length + " bytes exceeds buffer size of " + this.il1LilLllii + " bytes");
    }

    public o0O0O0o0(InputStream inputStream) {
        super(inputStream);
    }
}
