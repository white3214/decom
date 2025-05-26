package top.tntok.autobot;

import java.util.concurrent.TimeUnit;

/* renamed from: top.tntok.autobot.o0OoOOOO  reason: case insensitive filesystem */
public class C0445o0OoOOOO implements C0429o0Oo0ooO {
    public final TimeUnit i1LIL11l;
    public final long iiI1L1iI;

    /* renamed from: top.tntok.autobot.o0OoOOOO$i1LIL11l */
    public static class i1LIL11l {
        public long i1LIL11l = 0;
        public boolean iiI1L1iI = false;
        public TimeUnit illlI1lLIL = TimeUnit.SECONDS;

        public TimeUnit i1LIL11l() {
            return this.illlI1lLIL;
        }

        public C0445o0OoOOOO iiI1L1iI() {
            return new C0445o0OoOOOO(this);
        }

        public i1LIL11l il1LilLllii(long j, TimeUnit timeUnit) {
            this.i1LIL11l = j;
            this.illlI1lLIL = timeUnit;
            return this;
        }

        public long illlI1lLIL() {
            return this.i1LIL11l;
        }
    }

    /* renamed from: top.tntok.autobot.o0OoOOOO$iiI1L1iI */
    public class iiI1L1iI extends C0374o0OOo00o {
        public final /* synthetic */ Exception iiI1L1iI;

        public iiI1L1iI(Exception exc) {
            this.iiI1L1iI = exc;
        }

        public void iiI1L1iI() throws Throwable {
            throw new RuntimeException("Invalid parameters for Timeout", this.iiI1L1iI);
        }
    }

    @Deprecated
    public C0445o0OoOOOO(int i) {
        this((long) i, TimeUnit.MILLISECONDS);
    }

    public static i1LIL11l i1LIL11l() {
        return new i1LIL11l();
    }

    public static C0445o0OoOOOO iiIliillii(long j) {
        return new C0445o0OoOOOO(j, TimeUnit.MILLISECONDS);
    }

    public static C0445o0OoOOOO iilLil1i11I1(long j) {
        return new C0445o0OoOOOO(j, TimeUnit.SECONDS);
    }

    public C0374o0OOo00o iiI1L1iI(C0374o0OOo00o o0ooo00o, C0009OooO0oO oooO0oO) {
        try {
            return illlI1lLIL(o0ooo00o);
        } catch (Exception e) {
            return new iiI1L1iI(e);
        }
    }

    public final long il1LilLllii(TimeUnit timeUnit) {
        return timeUnit.convert(this.iiI1L1iI, this.i1LIL11l);
    }

    public C0374o0OOo00o illlI1lLIL(C0374o0OOo00o o0ooo00o) throws Exception {
        return C0451o0OoOo0.illlI1lLIL().il1LilLllii(this.iiI1L1iI, this.i1LIL11l).illlI1lLIL(o0ooo00o);
    }

    public C0445o0OoOOOO(long j, TimeUnit timeUnit) {
        this.iiI1L1iI = j;
        this.i1LIL11l = timeUnit;
    }

    public C0445o0OoOOOO(i1LIL11l i1lil11l) {
        this.iiI1L1iI = i1lil11l.illlI1lLIL();
        this.i1LIL11l = i1lil11l.i1LIL11l();
    }
}
