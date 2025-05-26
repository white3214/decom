package top.tntok.autobot;

import android.media.MediaCodec;

public final /* synthetic */ class IL11lll11 implements Runnable {
    public final /* synthetic */ MediaCodec i1LIL11l;
    public final /* synthetic */ iILlLIlli iiI1L1iI;

    public /* synthetic */ IL11lll11(iILlLIlli iilllilli, MediaCodec mediaCodec) {
        this.iiI1L1iI = iilllilli;
        this.i1LIL11l = mediaCodec;
    }

    public final void run() {
        this.iiI1L1iI.iL1LIlIlI(this.i1LIL11l);
    }
}
