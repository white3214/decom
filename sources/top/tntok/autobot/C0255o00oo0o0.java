package top.tntok.autobot;

import android.view.Surface;
import java.util.concurrent.Semaphore;

/* renamed from: top.tntok.autobot.o00oo0o0  reason: case insensitive filesystem */
public final /* synthetic */ class C0255o00oo0o0 implements Runnable {
    public final /* synthetic */ C0363o0OOOo0O i1LIL11l;
    public final /* synthetic */ C0254o00oo0o iiI1L1iI;
    public final /* synthetic */ Throwable[] iiIliillii;
    public final /* synthetic */ Semaphore iilLil1i11I1;
    public final /* synthetic */ Surface il1LilLllii;
    public final /* synthetic */ C0363o0OOOo0O illlI1lLIL;

    public /* synthetic */ C0255o00oo0o0(C0254o00oo0o o00oo0o, C0363o0OOOo0O o0oooo0o, C0363o0OOOo0O o0oooo0o2, Surface surface, Throwable[] thArr, Semaphore semaphore) {
        this.iiI1L1iI = o00oo0o;
        this.i1LIL11l = o0oooo0o;
        this.illlI1lLIL = o0oooo0o2;
        this.il1LilLllii = surface;
        this.iiIliillii = thArr;
        this.iilLil1i11I1 = semaphore;
    }

    public final void run() {
        this.iiI1L1iI.I11lLL1(this.i1LIL11l, this.illlI1lLIL, this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1);
    }
}
