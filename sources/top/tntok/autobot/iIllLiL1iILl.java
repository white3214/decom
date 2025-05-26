package top.tntok.autobot;

import top.tntok.autobot.control.Controller;

public final /* synthetic */ class iIllLiL1iILl implements Runnable {
    public final /* synthetic */ String i1LIL11l;
    public final /* synthetic */ Controller iiI1L1iI;

    public /* synthetic */ iIllLiL1iILl(Controller controller, String str) {
        this.iiI1L1iI = controller;
        this.i1LIL11l = str;
    }

    public final void run() {
        this.iiI1L1iI.IliiLiLliIl(this.i1LIL11l);
    }
}
