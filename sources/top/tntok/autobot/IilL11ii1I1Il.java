package top.tntok.autobot;

public class IilL11ii1I1Il extends C0432o0OoO000 {
    public volatile int illlI1lLIL;

    public class iiI1L1iI extends Thread {
        public final /* synthetic */ C0428o0Oo0oo0 i1LIL11l;
        public final /* synthetic */ C0532o0oOo0o0 iiI1L1iI;

        public iiI1L1iI(C0532o0oOo0o0 o0ooo0o0, C0428o0Oo0oo0 o0oo0oo0) {
            this.iiI1L1iI = o0ooo0o0;
            this.i1LIL11l = o0oo0oo0;
        }

        public void run() {
            try {
                this.iiI1L1iI.i1LIL11l(this.i1LIL11l);
            } finally {
                IilL11ii1I1Il.this.IilL11ii1I1Il();
            }
        }
    }

    public IilL11ii1I1Il() {
    }

    public synchronized void I1l1iIll1lIi1() {
        while (this.illlI1lLIL < iL1LIlIlI()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public synchronized void IilL11ii1I1Il() {
        this.illlI1lLIL++;
        notifyAll();
    }

    public void i1LIL11l(C0428o0Oo0oo0 o0oo0oo0) {
        this.illlI1lLIL = 0;
        super.i1LIL11l(o0oo0oo0);
        I1l1iIll1lIi1();
    }

    public void iILiI1lll(C0532o0oOo0o0 o0ooo0o0, C0428o0Oo0oo0 o0oo0oo0) {
        new iiI1L1iI(o0ooo0o0, o0oo0oo0).start();
    }

    public IilL11ii1I1Il(Class<? extends C0534o0oOoo00> cls) {
        super((Class<?>) cls);
    }

    public IilL11ii1I1Il(String str) {
        super(str);
    }

    public IilL11ii1I1Il(Class<? extends C0534o0oOoo00> cls, String str) {
        super(cls, str);
    }
}
