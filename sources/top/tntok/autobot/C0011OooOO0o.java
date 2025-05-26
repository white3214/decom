package top.tntok.autobot;

import java.io.File;

/* renamed from: top.tntok.autobot.OooOO0o  reason: case insensitive filesystem */
public class C0011OooOO0o {
    public static final String iiI1L1iI = System.getProperty(C0387o0OOoO0o.iiI1L1iI("6pwHq5wPcePzjl+60xh1\n", "gP1xyrJsHYI=\n")).split(File.pathSeparator)[0];

    /* renamed from: top.tntok.autobot.OooOO0o$iiI1L1iI */
    public static class iiI1L1iI {
        public boolean i1LIL11l;
        public int iiI1L1iI;

        public iiI1L1iI(int i) {
            this.iiI1L1iI = i;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
            jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:7:0x000d
            	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
            	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
            	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
            	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
            */
        public synchronized void i1LIL11l() {
            /*
                r1 = this;
                monitor-enter(r1)
            L_0x0001:
                int r0 = r1.iiI1L1iI     // Catch:{ InterruptedException -> 0x0010 }
                if (r0 <= 0) goto L_0x0010
                boolean r0 = r1.i1LIL11l     // Catch:{ InterruptedException -> 0x0010 }
                if (r0 != 0) goto L_0x0010
                r1.wait()     // Catch:{ InterruptedException -> 0x0010 }
                goto L_0x0001
            L_0x000d:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x000d }
                throw r0
            L_0x0010:
                monitor-exit(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0011OooOO0o.iiI1L1iI.i1LIL11l():void");
        }

        public synchronized void iiI1L1iI(boolean z) {
            try {
                int i = this.iiI1L1iI - 1;
                this.iiI1L1iI = i;
                if (z) {
                    this.i1LIL11l = true;
                }
                if (i == 0 || this.i1LIL11l) {
                    notify();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static void main(String[] strArr) {
        int i;
        boolean z;
        try {
            if (strArr.length > 0) {
                i = Integer.parseInt(strArr[0]);
            } else {
                i = C0507o0o00Oo0.i1LIL11l;
            }
            if (strArr.length > 1) {
                z = C0387o0OOoO0o.iiI1L1iI("rQ==\n", "nEsO63PfpPs=\n").equals(strArr[1]);
            } else {
                z = false;
            }
            iilLil1i11I1.iLiI1Llil = z;
            new iilLil1i11I1(i).IllLlI1IiIL();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            System.exit(0);
            throw th;
        }
        System.exit(0);
    }
}
