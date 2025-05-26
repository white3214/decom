package top.tntok.autobot;

import android.graphics.SurfaceTexture;

/* renamed from: top.tntok.autobot.o00oo0Oo  reason: case insensitive filesystem */
public final /* synthetic */ class C0253o00oo0Oo implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0363o0OOOo0O i1LIL11l;
    public final /* synthetic */ C0254o00oo0o iiI1L1iI;

    public /* synthetic */ C0253o00oo0Oo(C0254o00oo0o o00oo0o, C0363o0OOOo0O o0oooo0o) {
        this.iiI1L1iI = o00oo0o;
        this.i1LIL11l = o0oooo0o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.iiI1L1iI.iilLil1i11I1(this.i1LIL11l, surfaceTexture);
    }
}
