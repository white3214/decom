package top.tntok.autobot;

import android.media.AudioRecord;
import android.media.AudioTimestamp;

public class i1L1llI1LlL1l {
    public static final long iilLil1i11I1 = 21;
    public final AudioTimestamp i1LIL11l = new AudioTimestamp();
    public final AudioRecord iiI1L1iI;
    public long iiIliillii = 0;
    public long il1LilLllii = 0;
    public long illlI1lLIL = -1;

    public i1L1llI1LlL1l(AudioRecord audioRecord) {
        this.iiI1L1iI = audioRecord;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int iiI1L1iI(java.nio.ByteBuffer r10, android.media.MediaCodec.BufferInfo r11) {
        /*
            r9 = this;
            android.media.AudioRecord r0 = r9.iiI1L1iI
            r1 = 4096(0x1000, float:5.74E-42)
            int r10 = r0.read(r10, r1)
            if (r10 > 0) goto L_0x000b
            return r10
        L_0x000b:
            android.media.AudioRecord r0 = r9.iiI1L1iI
            android.media.AudioTimestamp r1 = r9.i1LIL11l
            r2 = 0
            int r0 = r0.getTimestamp(r1, r2)
            r1 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x0029
            android.media.AudioTimestamp r0 = r9.i1LIL11l
            long r5 = r0.nanoTime
            long r7 = r9.illlI1lLIL
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            long r3 = r5 / r3
            r9.illlI1lLIL = r5
            goto L_0x0043
        L_0x0029:
            long r5 = r9.iiIliillii
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "102TLatIQDXgAoEku0hHNP1WjyCjSE8v8EuJYbsBQz/nVocsvw==\n"
            java.lang.String r5 = "lCLmQc9oLlo=\n"
            java.lang.String r0 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r0, r5)
            top.tntok.autobot.C0525o0oOO.IiIIlIL(r0)
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r3
            r9.iiIliillii = r5
        L_0x0041:
            long r3 = r9.iiIliillii
        L_0x0043:
            long r5 = (long) r10
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r7
            r7 = 192000(0x2ee00, double:9.48606E-319)
            long r5 = r5 / r7
            long r5 = r5 + r3
            r9.iiIliillii = r5
            long r5 = r9.il1LilLllii
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            r0 = 21
            long r7 = r5 + r0
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0060
            long r5 = r5 + r0
            goto L_0x0061
        L_0x0060:
            r5 = r3
        L_0x0061:
            r9.il1LilLllii = r5
            r3 = 0
            r7 = 0
            r2 = r11
            r4 = r10
            r2.set(r3, r4, r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.i1L1llI1LlL1l.iiI1L1iI(java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):int");
    }
}
