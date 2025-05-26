package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: top.tntok.autobot.o00oOoO0  reason: case insensitive filesystem */
public class C0239o00oOoO0 extends oo0OOoo {
    public final List<iiI1L1iI> i1LIL11l = new ArrayList();

    public C0239o00oOoO0(InputStream inputStream) {
        super(inputStream);
    }

    public List<iiI1L1iI> I1LiILiLLIl1l() {
        return this.i1LIL11l;
    }

    public void I1lLLLlliILlI(IOException iOException) throws IOException {
        for (iiI1L1iI il1LilLllii : I1LiILiLLIl1l()) {
            il1LilLllii.il1LilLllii(iOException);
        }
    }

    public void IIL1Ll1I111(int i) throws IOException {
        for (iiI1L1iI i1LIL11l2 : I1LiILiLLIl1l()) {
            i1LIL11l2.i1LIL11l(i);
        }
    }

    public void IL11lll11(iiI1L1iI iii1l1ii) {
        this.i1LIL11l.remove(iii1l1ii);
    }

    public void IiIl11II() throws IOException {
        do {
        } while (read(new byte[8192]) != -1);
    }

    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            ilLIlL1ILi();
        } else {
            I1lLLLlliILlI(e);
        }
    }

    public void i111iLiiIIill(iiI1L1iI iii1l1ii) {
        this.i1LIL11l.add(iii1l1ii);
    }

    public void iILlLIlli() {
        this.i1LIL11l.clear();
    }

    public void iiLl11ILL() throws IOException {
        for (iiI1L1iI iiIliillii : I1LiILiLLIl1l()) {
            iiIliillii.iiIliillii();
        }
    }

    public void ilIILlI1l11i(byte[] bArr, int i, int i2) throws IOException {
        for (iiI1L1iI illlI1lLIL : I1LiILiLLIl1l()) {
            illlI1lLIL.illlI1lLIL(bArr, i, i2);
        }
    }

    public void ilLIlL1ILi() throws IOException {
        for (iiI1L1iI iiI1L1iI2 : I1LiILiLLIl1l()) {
            iiI1L1iI2.iiI1L1iI();
        }
    }

    public int read() throws IOException {
        int i;
        try {
            i = super.read();
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (e != null) {
            I1lLLLlliILlI(e);
        } else if (i == -1) {
            iiLl11ILL();
        } else {
            IIL1Ll1I111(i);
        }
        return i;
    }

    public int read(byte[] bArr) throws IOException {
        int i;
        try {
            i = super.read(bArr);
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (e != null) {
            I1lLLLlliILlI(e);
        } else if (i == -1) {
            iiLl11ILL();
        } else if (i > 0) {
            ilIILlI1l11i(bArr, 0, i);
        }
        return i;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            i3 = super.read(bArr, i, i2);
            e = null;
        } catch (IOException e) {
            e = e;
            i3 = 0;
        }
        if (e != null) {
            I1lLLLlliILlI(e);
        } else if (i3 == -1) {
            iiLl11ILL();
        } else if (i3 > 0) {
            ilIILlI1l11i(bArr, i, i3);
        }
        return i3;
    }

    /* renamed from: top.tntok.autobot.o00oOoO0$iiI1L1iI */
    public static abstract class iiI1L1iI {
        public void iiI1L1iI() throws IOException {
        }

        public void iiIliillii() throws IOException {
        }

        public void i1LIL11l(int i) throws IOException {
        }

        public void il1LilLllii(IOException iOException) throws IOException {
            throw iOException;
        }

        public void illlI1lLIL(byte[] bArr, int i, int i2) throws IOException {
        }
    }
}
