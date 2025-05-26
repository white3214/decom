package top.tntok.autobot;

/* renamed from: top.tntok.autobot.OooooOO  reason: case insensitive filesystem */
public class C0048OooooOO extends C0374o0OOo00o {
    public final Class<? extends Throwable> i1LIL11l;
    public final C0374o0OOo00o iiI1L1iI;

    public C0048OooooOO(C0374o0OOo00o o0ooo00o, Class<? extends Throwable> cls) {
        this.iiI1L1iI = o0ooo00o;
        this.i1LIL11l = cls;
    }

    public void iiI1L1iI() throws Exception {
        try {
            this.iiI1L1iI.iiI1L1iI();
            throw new AssertionError("Expected exception: " + this.i1LIL11l.getName());
        } catch (iLILliI1 e) {
            if (!this.i1LIL11l.isAssignableFrom(e.getClass())) {
                throw e;
            }
        } catch (Throwable th) {
            if (!this.i1LIL11l.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.i1LIL11l.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
        }
    }
}
