package top.tntok.autobot;

import java.math.BigInteger;
import java.util.Objects;

public class ILL1lL1lI {

    public static class I11lLL1 extends i1LIL11l {
        public I11lLL1() {
            super(ILL1lL1lI.illlI1lLIL(), ILL1lL1lI.illlI1lLIL(), ILL1lL1lI.illlI1lLIL());
        }
    }

    public static class i1LIL11l implements iLLLILIiLi1Ii {
        public final iiIliillii i1LIL11l;
        public final iiIliillii iiI1L1iI;
        public final iiIliillii illlI1lLIL;

        public i1LIL11l(iiIliillii iiiliillii, iiIliillii iiiliillii2, iiIliillii iiiliillii3) {
            this.iiI1L1iI = iiiliillii;
            this.i1LIL11l = iiiliillii2;
            this.illlI1lLIL = iiiliillii3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i1LIL11l)) {
                return false;
            }
            i1LIL11l i1lil11l = (i1LIL11l) obj;
            if (!Objects.equals(this.iiI1L1iI, i1lil11l.iiI1L1iI) || !Objects.equals(this.i1LIL11l, i1lil11l.i1LIL11l) || !Objects.equals(this.illlI1lLIL, i1lil11l.illlI1lLIL)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.iiI1L1iI, this.i1LIL11l, this.illlI1lLIL});
        }

        public iiIliillii i1LIL11l() {
            return this.i1LIL11l;
        }

        public iiIliillii iiI1L1iI() {
            return this.illlI1lLIL;
        }

        public iiIliillii illlI1lLIL() {
            return this.iiI1L1iI;
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", new Object[]{Long.valueOf(this.illlI1lLIL.get()), Long.valueOf(this.i1LIL11l.get()), Long.valueOf(this.iiI1L1iI.get())});
        }
    }

    public interface iLLLILIiLi1Ii {
        iiIliillii i1LIL11l();

        iiIliillii iiI1L1iI();

        iiIliillii illlI1lLIL();
    }

    public interface iiIliillii {
        long get();

        Long i1LIL11l();

        void iiI1L1iI();

        void il1LilLllii(long j);

        BigInteger illlI1lLIL();
    }

    public static class iilLil1i11I1 implements iiIliillii {
        public long iiI1L1iI;

        public iilLil1i11I1() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof iiIliillii) && this.iiI1L1iI == ((iiIliillii) obj).get()) {
                return true;
            }
            return false;
        }

        public long get() {
            return this.iiI1L1iI;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Long.valueOf(this.iiI1L1iI)});
        }

        public Long i1LIL11l() {
            return Long.valueOf(this.iiI1L1iI);
        }

        public void iiI1L1iI() {
            this.iiI1L1iI++;
        }

        public void il1LilLllii(long j) {
            this.iiI1L1iI += j;
        }

        public BigInteger illlI1lLIL() {
            return BigInteger.valueOf(this.iiI1L1iI);
        }

        public String toString() {
            return Long.toString(this.iiI1L1iI);
        }
    }

    public static class il1LilLllii extends i1LIL11l {
        public il1LilLllii() {
            super(ILL1lL1lI.iiI1L1iI(), ILL1lL1lI.iiI1L1iI(), ILL1lL1lI.iiI1L1iI());
        }
    }

    public static class illlI1lLIL implements iiIliillii {
        public BigInteger iiI1L1iI;

        public illlI1lLIL() {
            this.iiI1L1iI = BigInteger.ZERO;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iiIliillii)) {
                return false;
            }
            return Objects.equals(this.iiI1L1iI, ((iiIliillii) obj).illlI1lLIL());
        }

        public long get() {
            return this.iiI1L1iI.longValueExact();
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.iiI1L1iI});
        }

        public Long i1LIL11l() {
            return Long.valueOf(this.iiI1L1iI.longValueExact());
        }

        public void iiI1L1iI() {
            this.iiI1L1iI = this.iiI1L1iI.add(BigInteger.ONE);
        }

        public void il1LilLllii(long j) {
            this.iiI1L1iI = this.iiI1L1iI.add(BigInteger.valueOf(j));
        }

        public BigInteger illlI1lLIL() {
            return this.iiI1L1iI;
        }

        public String toString() {
            return this.iiI1L1iI.toString();
        }
    }

    public static iLLLILIiLi1Ii i1LIL11l() {
        return new il1LilLllii();
    }

    public static iiIliillii iiI1L1iI() {
        return new illlI1lLIL();
    }

    public static iLLLILIiLi1Ii il1LilLllii() {
        return new I11lLL1();
    }

    public static iiIliillii illlI1lLIL() {
        return new iilLil1i11I1();
    }
}
