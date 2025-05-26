package top.tntok.autobot;

import java.io.OutputStream;

public class IIii1iL111 extends C0303o0O0OoOo {
    public long i1LIL11l = 0;

    public IIii1iL111(OutputStream outputStream) {
        super(outputStream);
    }

    public synchronized long I1LiILiLLIl1l() {
        long j;
        j = this.i1LIL11l;
        this.i1LIL11l = 0;
        return j;
    }

    public int IiIl11II() {
        long i111iLiiIIill = i111iLiiIIill();
        if (i111iLiiIIill <= 2147483647L) {
            return (int) i111iLiiIIill;
        }
        throw new ArithmeticException("The byte count " + i111iLiiIIill + " is too large to be converted to an int");
    }

    public synchronized long i111iLiiIIill() {
        return this.i1LIL11l;
    }

    public synchronized void i1LIL11l(int i) {
        this.i1LIL11l += (long) i;
    }

    public int ilLIlL1ILi() {
        long I1LiILiLLIl1l = I1LiILiLLIl1l();
        if (I1LiILiLLIl1l <= 2147483647L) {
            return (int) I1LiILiLLIl1l;
        }
        throw new ArithmeticException("The byte count " + I1LiILiLLIl1l + " is too large to be converted to an int");
    }
}
