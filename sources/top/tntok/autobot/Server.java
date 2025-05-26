package top.tntok.autobot;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import top.tntok.autobot.control.Controller;
import top.tntok.autobot.video.i1LIL11l;

public final class Server {
    public static final /* synthetic */ boolean i1LIL11l = false;
    public static final String iiI1L1iI = System.getProperty(C0387o0OOoO0o.iiI1L1iI("/svuXUs9qHTn2bZMBCqs\n", "lKqYPGVexBU=\n")).split(File.pathSeparator)[0];

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
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.Server.iiI1L1iI.i1LIL11l():void");
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

    public static void iilLil1i11I1(o0O0o o0o0o) throws IOException, i1iliIlLli {
        I1LILl1ILllii i1LILl1ILllii;
        C0396o0OOooO o0ooooo;
        I1i1iiiI i1i1iiiI;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && o0o0o.IiIl11II() == C0495o0o000o0.illlI1lLIL) {
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("ugbJqef1t6iQFdaj5/35otkO1+z7++PlihLUvPrm46CdR8ap8/vloNkmyqjn+/6h2VaW\n", "+WekzJWUl8U=\n"));
            throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("yvSU+aheOq/g54vzqFZ0pan8iry0UG7i+uCJ7LVNbqft\n", "iZX5nNo/GsI=\n"));
        } else if (i >= 29 || o0o0o.I1IIIi1i1ILl() == null) {
            Controller controller = null;
            if (o0o0o.i111iLiiIIill()) {
                i1LILl1ILllii = I1LILl1ILllii.IiIIlIL(o0o0o);
            } else {
                i1LILl1ILllii = null;
            }
            int IL1IiilLlLI = o0o0o.IL1IiilLlLI();
            boolean IillLillLLIii = o0o0o.IillLillLLIii();
            boolean IilL11ii1I1Il = o0o0o.IilL11ii1I1Il();
            boolean IiiIlLl1il1i = o0o0o.IiiIlLl1il1i();
            boolean i1LIL11l2 = o0o0o.i1LIL11l();
            boolean illiiliIILI = o0o0o.illiiliIILI();
            C0510o0o00o.iiI1L1iI();
            ArrayList<IiiIIil1l> arrayList = new ArrayList<>();
            C0010OooO0oo ilLIlL1ILi = C0010OooO0oo.ilLIlL1ILi(IL1IiilLlLI, IillLillLLIii, IiiIlLl1il1i, i1LIL11l2, IilL11ii1I1Il, illiiliIILI);
            try {
                if (o0o0o.iliilLllIl1()) {
                    ilLIlL1ILi.IIL1Ll1I111(OooOO0O.iLLLILIiLi1Ii());
                }
                if (IilL11ii1I1Il) {
                    Controller controller2 = new Controller(ilLIlL1ILi.il1LilLllii(), i1LILl1ILllii, o0o0o);
                    arrayList.add(controller2);
                    controller = controller2;
                }
                if (i1LIL11l2) {
                    iLiI1Llil il1LilLllii = o0o0o.il1LilLllii();
                    II1l1IliI1Li1 iLLLILIiLi1Ii = o0o0o.iLLLILIiLi1Ii();
                    if (iLLLILIiLi1Ii.illlI1lLIL()) {
                        i1i1iiiI = new IIL1Ll1I111(iLLLILIiLi1Ii);
                    } else {
                        i1i1iiiI = new iIiL11iL(o0o0o.iilLil1i11I1());
                    }
                    C0379o0OOo0o o0ooo0o = new C0379o0OOo0o(ilLIlL1ILi.i1LIL11l(), il1LilLllii, o0o0o.IIlLill(), o0o0o.ILllI11());
                    if (il1LilLllii == iLiI1Llil.iiIliillii) {
                        obj = new ilLIlLiIILl1(i1i1iiiI, o0ooo0o);
                    } else {
                        obj = new iILlLIlli(i1i1iiiI, o0ooo0o, o0o0o);
                    }
                    arrayList.add(obj);
                }
                if (IiiIlLl1il1i) {
                    C0379o0OOo0o o0ooo0o2 = new C0379o0OOo0o(ilLIlL1ILi.I1LiILiLLIl1l(), o0o0o.i1LiiIlIL1I(), o0o0o.IIlLill(), o0o0o.ILllI11());
                    if (o0o0o.IiIl11II() != C0495o0o000o0.i1LIL11l) {
                        o0ooooo = new ILL1IIlIiILil(o0o0o);
                    } else if (o0o0o.I1IIIi1i1ILl() != null) {
                        o0ooooo = new top.tntok.autobot.video.iiI1L1iI(controller, o0o0o);
                    } else {
                        o0ooooo = new i1LIL11l(controller, o0o0o);
                    }
                    arrayList.add(new C0401o0OOooo0(o0ooooo, o0ooo0o2, o0o0o));
                    if (controller != null) {
                        controller.IIIlll1lll(o0ooooo);
                    }
                }
                iiI1L1iI iii1l1ii = new iiI1L1iI(arrayList.size());
                for (IiiIIil1l i1LIL11l3 : arrayList) {
                    i1LIL11l3.i1LIL11l(new C0358o0OOOOoO(iii1l1ii));
                }
                iii1l1ii.i1LIL11l();
                if (i1LILl1ILllii != null) {
                    i1LILl1ILllii.i1LIL11l();
                }
                for (IiiIIil1l iiI1L1iI2 : arrayList) {
                    iiI1L1iI2.iiI1L1iI();
                }
                C0254o00oo0o.IiIIlIL();
                ilLIlL1ILi.ilIILlI1l11i();
                if (i1LILl1ILllii != null) {
                    try {
                        i1LILl1ILllii.illlI1lLIL();
                    } catch (InterruptedException unused) {
                    }
                }
                for (IiiIIil1l illlI1lLIL : arrayList) {
                    illlI1lLIL.illlI1lLIL();
                }
                C0254o00oo0o.iiIliillii();
                ilLIlL1ILi.close();
            } catch (Throwable th) {
                if (i1LILl1ILllii != null) {
                    i1LILl1ILllii.i1LIL11l();
                }
                for (IiiIIil1l iiI1L1iI3 : arrayList) {
                    iiI1L1iI3.iiI1L1iI();
                }
                C0254o00oo0o.IiIIlIL();
                ilLIlL1ILi.ilIILlI1l11i();
                if (i1LILl1ILllii != null) {
                    try {
                        i1LILl1ILllii.illlI1lLIL();
                    } catch (InterruptedException unused2) {
                        ilLIlL1ILi.close();
                        throw th;
                    }
                }
                for (IiiIIil1l illlI1lLIL2 : arrayList) {
                    illlI1lLIL2.illlI1lLIL();
                }
                C0254o00oo0o.iiIliillii();
                ilLIlL1ILi.close();
                throw th;
            }
        } else {
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("5mJJmchHGWDdZlKZ2kcYZMRmR5nXXUt6x3MeysteG3vac1vdnkwOcsd1W5n/QA9mx25amY8e\n", "qAc+ub4uaxQ=\n"));
            throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("qwplPkojnLyQDn4+WCOduIkOaz5VOc6mihsybUk6nqeXG3d6\n", "5W8SHjxK7sg=\n"));
        }
    }

    public static void illlI1lLIL(String... strArr) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler(new C0355o0OOO0oo());
        o0O0o Iiiiii1l1I1L1 = o0O0o.Iiiiii1l1I1L1(strArr);
        C0525o0oOO.i1LIL11l();
        C0525o0oOO.iilLil1i11I1(Iiiiii1l1I1L1.IIlL1llI1());
        C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("L/pSnXnFtvYw\n", "a58k9BqgjNY=\n") + Build.MANUFACTURER + C0387o0OOoO0o.iiI1L1iI("eTE=\n", "JBGr+ou0zH0=\n") + Build.BRAND + " " + Build.MODEL + C0387o0OOoO0o.iiI1L1iI("ziBnMQa7b4iKKA==\n", "7ggmX2LJAOE=\n") + Build.VERSION.RELEASE + C0387o0OOoO0o.iiI1L1iI("kA==\n", "uU9g/RFOMhU=\n"));
        if (Iiiiii1l1I1L1.i1iiLIil1ILi()) {
            if (Iiiiii1l1I1L1.i111iLiiIIill()) {
                I1LILl1ILllii.iilLiIIIi11i();
            }
            if (Iiiiii1l1I1L1.i1iI1iiLL1()) {
                C0525o0oOO.iiIliillii(C0167o00OoOOO.iLLLILIiLi1Ii());
                C0525o0oOO.iiIliillii(C0167o00OoOOO.il1LilLllii());
            }
            if (Iiiiii1l1I1L1.I1I11Il1()) {
                C0525o0oOO.iiIliillii(C0167o00OoOOO.iilLil1i11I1());
            }
            if (Iiiiii1l1I1L1.IliiLiLliIl() || Iiiiii1l1I1L1.iiiiI1iILL11I()) {
                C0510o0o00o.iiI1L1iI();
                C0525o0oOO.iiIliillii(C0167o00OoOOO.iiIliillii(Iiiiii1l1I1L1.iiiiI1iILL11I()));
            }
            if (Iiiiii1l1I1L1.i11liIIl11Ii1()) {
                C0510o0o00o.iiI1L1iI();
                C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("BtJgYPDjVVs4xy9C+/RUXT/EL2Ll4FUceI4vK+H4T0F2zW56teRHWTOAfGz49QZGP81qKg==\n", "VqAPA5WQJjI=\n"));
                C0525o0oOO.iiIliillii(C0167o00OoOOO.i1LIL11l());
                return;
            }
            return;
        }
        try {
            iilLil1i11I1(Iiiiii1l1I1L1);
        } catch (i1iliIlLli unused) {
        }
    }

    public static void main(String... strArr) {
        int i = 0;
        try {
            illlI1lLIL(strArr);
        } catch (Throwable th) {
            C0525o0oOO.il1LilLllii(th.getMessage(), th);
            i = 1;
        } finally {
            System.exit(i);
        }
    }
}
