package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o00oo000  reason: case insensitive filesystem */
public abstract class C0248o00oo000 implements Runnable {
    public final String iiI1L1iI;

    public C0248o00oo000(String str, Object... objArr) {
        this.iiI1L1iI = C0487o0OooooO.Ii1liIIIiLi(str, objArr);
    }

    public abstract void iILiI1lll();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.iiI1L1iI);
        try {
            iILiI1lll();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
