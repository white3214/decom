package top.tntok.autobot;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import top.tntok.autobot.C0396o0OOooO;

public class iiiiL1i1LllL implements C0396o0OOooO.iiI1L1iI {
    public MediaCodec i1LIL11l;
    public final AtomicBoolean iiI1L1iI = new AtomicBoolean();

    public boolean i1LIL11l() {
        return this.iiI1L1iI.getAndSet(false);
    }

    public void iiI1L1iI() {
        illlI1lLIL();
    }

    public synchronized void il1LilLllii(MediaCodec mediaCodec) {
        this.i1LIL11l = mediaCodec;
    }

    public synchronized void illlI1lLIL() {
        this.iiI1L1iI.set(true);
        MediaCodec mediaCodec = this.i1LIL11l;
        if (mediaCodec != null) {
            try {
                mediaCodec.signalEndOfInputStream();
            } catch (IllegalStateException unused) {
            }
        }
    }
}
