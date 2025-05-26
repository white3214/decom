package top.tntok.autobot;

import java.io.IOException;
import java.util.List;

public class o00O00OO extends IOException {
    private static final long serialVersionUID = 1;
    private final List<? extends Throwable> causeList;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o00O00OO(java.util.List<? extends java.lang.Throwable> r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = 0
            goto L_0x0009
        L_0x0005:
            int r1 = r4.size()
        L_0x0009:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r1 = 1
            r2[r1] = r4
            java.lang.String r1 = "%,d exceptions: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            if (r4 != 0) goto L_0x001f
            r0 = 0
            goto L_0x0025
        L_0x001f:
            java.lang.Object r0 = r4.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0025:
            r3.<init>(r1, r0)
            if (r4 != 0) goto L_0x002e
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x002e:
            r3.causeList = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.o00O00OO.<init>(java.util.List):void");
    }

    public <T extends Throwable> T i1LIL11l(int i, Class<T> cls) {
        return (Throwable) this.causeList.get(i);
    }

    public <T extends Throwable> T iiI1L1iI(int i) {
        return (Throwable) this.causeList.get(i);
    }

    public <T extends Throwable> List<T> il1LilLllii(Class<T> cls) {
        return this.causeList;
    }

    public <T extends Throwable> List<T> illlI1lLIL() {
        return this.causeList;
    }
}
