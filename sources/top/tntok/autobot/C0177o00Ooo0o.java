package top.tntok.autobot;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.junit.runner.notification.RunListener;

/* renamed from: top.tntok.autobot.o00Ooo0o  reason: case insensitive filesystem */
public class C0177o00Ooo0o implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, Long> fDurations = new HashMap();
    private final Map<String, Long> fFailureTimestamps = new HashMap();
    private final File fHistoryStore;

    /* renamed from: top.tntok.autobot.o00Ooo0o$i1LIL11l */
    public final class i1LIL11l extends RunListener {
        public Map<C0009OooO0oO, Long> i1LIL11l;
        public long iiI1L1iI;

        public i1LIL11l() {
            this.iiI1L1iI = System.currentTimeMillis();
            this.i1LIL11l = new HashMap();
        }

        public void I11lLL1(C0009OooO0oO oooO0oO) throws Exception {
            this.i1LIL11l.put(oooO0oO, Long.valueOf(System.nanoTime()));
        }

        public void i1LIL11l(o00O0O o00o0o) throws Exception {
            C0177o00Ooo0o.this.iLLLILIiLi1Ii(o00o0o.iiI1L1iI(), this.iiI1L1iI);
        }

        public void iiIliillii(o0OO000 o0oo000) throws Exception {
            C0177o00Ooo0o.this.iilLiIIIi11i();
        }

        public void illlI1lLIL(C0009OooO0oO oooO0oO) throws Exception {
            C0177o00Ooo0o.this.I11lLL1(oooO0oO, System.nanoTime() - this.i1LIL11l.get(oooO0oO).longValue());
        }
    }

    /* renamed from: top.tntok.autobot.o00Ooo0o$illlI1lLIL */
    public class illlI1lLIL implements Comparator<C0009OooO0oO> {
        public illlI1lLIL() {
        }

        public final Long i1LIL11l(C0009OooO0oO oooO0oO) {
            Long illlI1lLIL = C0177o00Ooo0o.this.illlI1lLIL(oooO0oO);
            if (illlI1lLIL == null) {
                return 0L;
            }
            return illlI1lLIL;
        }

        /* renamed from: iiI1L1iI */
        public int compare(C0009OooO0oO oooO0oO, C0009OooO0oO oooO0oO2) {
            if (C0177o00Ooo0o.this.iiIliillii(oooO0oO)) {
                return -1;
            }
            if (C0177o00Ooo0o.this.iiIliillii(oooO0oO2)) {
                return 1;
            }
            int compareTo = i1LIL11l(oooO0oO2).compareTo(i1LIL11l(oooO0oO));
            if (compareTo != 0) {
                return compareTo;
            }
            return C0177o00Ooo0o.this.il1LilLllii(oooO0oO).compareTo(C0177o00Ooo0o.this.il1LilLllii(oooO0oO2));
        }
    }

    public C0177o00Ooo0o(File file) {
        this.fHistoryStore = file;
    }

    public static C0177o00Ooo0o IiIIlIL(File file) throws IIL1Iili {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            C0177o00Ooo0o o00ooo0o = (C0177o00Ooo0o) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return o00ooo0o;
        } catch (Exception e) {
            throw new IIL1Iili(e);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static C0177o00Ooo0o i1LIL11l(File file) {
        if (file.exists()) {
            try {
                return IiIIlIL(file);
            } catch (IIL1Iili e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new C0177o00Ooo0o(file);
    }

    public void I11lLL1(C0009OooO0oO oooO0oO, long j) {
        this.fDurations.put(oooO0oO.toString(), Long.valueOf(j));
    }

    public Comparator<C0009OooO0oO> IiiL1llIIi() {
        return new illlI1lLIL();
    }

    public void iLLLILIiLi1Ii(C0009OooO0oO oooO0oO, long j) {
        this.fFailureTimestamps.put(oooO0oO.toString(), Long.valueOf(j));
    }

    public boolean iiIliillii(C0009OooO0oO oooO0oO) {
        return !this.fDurations.containsKey(oooO0oO.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void iilLiIIIi11i() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0016 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0016 }
            java.io.File r3 = r5.fHistoryStore     // Catch:{ all -> 0x0016 }
            r2.<init>(r3)     // Catch:{ all -> 0x0016 }
            r1.<init>(r2)     // Catch:{ all -> 0x0016 }
            r1.writeObject(r5)     // Catch:{ all -> 0x0014 }
            r1.close()
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x001a
        L_0x0016:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            r1.close()
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0177o00Ooo0o.iilLiIIIi11i():void");
    }

    public RunListener iilLil1i11I1() {
        return new i1LIL11l();
    }

    public Long il1LilLllii(C0009OooO0oO oooO0oO) {
        return this.fDurations.get(oooO0oO.toString());
    }

    public Long illlI1lLIL(C0009OooO0oO oooO0oO) {
        return this.fFailureTimestamps.get(oooO0oO.toString());
    }
}
