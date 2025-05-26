package top.tntok.autobot;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class iIiIl1llILlI extends FilterOutputStream {
    public iIiIl1llILlI(OutputStream outputStream) {
        super(outputStream);
    }

    public void iiI1L1iI() throws IOException {
        this.out.write("0\r\n\r\n".getBytes());
    }

    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 != 0) {
            this.out.write(String.format("%x\r\n", new Object[]{Integer.valueOf(i2)}).getBytes());
            this.out.write(bArr, i, i2);
            this.out.write(C0130o00O0o00.IiIIlIL.getBytes());
        }
    }
}
