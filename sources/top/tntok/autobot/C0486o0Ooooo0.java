package top.tntok.autobot;

import java.util.concurrent.ThreadFactory;

/* renamed from: top.tntok.autobot.o0Ooooo0  reason: case insensitive filesystem */
public final /* synthetic */ class C0486o0Ooooo0 implements ThreadFactory {
    public final /* synthetic */ boolean i1LIL11l;
    public final /* synthetic */ String iiI1L1iI;

    public /* synthetic */ C0486o0Ooooo0(String str, boolean z) {
        this.iiI1L1iI = str;
        this.i1LIL11l = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C0487o0OooooO.IIlL1llI1(this.iiI1L1iI, this.i1LIL11l, runnable);
    }
}
