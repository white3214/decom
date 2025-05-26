package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.os.Build;
import android.os.SystemClock;
import java.nio.ByteBuffer;

public class IIL1Ll1I111 implements I1i1iiiI {
    public static final int I11lLL1 = 12;
    public static final int iLLLILIiLi1Ii = 2;
    public static final int iiIliillii = 12;
    public static final int iilLil1i11I1 = 2;
    public static final int il1LilLllii = 48000;
    public AudioRecord i1LIL11l;
    public final int iiI1L1iI;
    public i1L1llI1LlL1l illlI1lLIL;

    public static /* synthetic */ class iiI1L1iI {
        public static final /* synthetic */ int[] iiI1L1iI;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                top.tntok.autobot.II1l1IliI1Li1[] r0 = top.tntok.autobot.II1l1IliI1Li1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iiI1L1iI = r0
                top.tntok.autobot.II1l1IliI1Li1 r1 = top.tntok.autobot.II1l1IliI1Li1.i1LIL11l     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = iiI1L1iI     // Catch:{ NoSuchFieldError -> 0x001d }
                top.tntok.autobot.II1l1IliI1Li1 r1 = top.tntok.autobot.II1l1IliI1Li1.illlI1lLIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.IIL1Ll1I111.iiI1L1iI.<clinit>():void");
        }
    }

    public IIL1Ll1I111(II1l1IliI1Li1 iI1l1IliI1Li1) {
        this.iiI1L1iI = iilLil1i11I1(iI1l1IliI1Li1);
    }

    public static void IiIIlIL() {
        o0OOOO0o.iiI1L1iI().iiIliillii(C0387o0OOoO0o.iiI1L1iI("YpkKegabOy1unwN6FJ06M20=\n", "AfZnVGf1X18=\n"));
    }

    public static void iLLLILIiLi1Ii() {
        Intent intent = new Intent(C0387o0OOoO0o.iiI1L1iI("5cdU5ulYR5btx0Tx6EUN2efdWfvoH275zec=\n", "hKkwlIYxI7g=\n"));
        intent.addFlags(268435456);
        intent.addCategory(C0387o0OOoO0o.iiI1L1iI("tMR7L//rzbO8xGs4/vaH/rTeejr/8NCzmetKE9PK7M8=\n", "1aofXZCCqZ0=\n"));
        intent.setComponent(new ComponentName(C0387o0OOoO0o.iiI1L1iI("TYbSlCHtaqpBgNuUM+trtEI=\n", "Lum/ukCDDtg=\n"), C0387o0OOoO0o.iiI1L1iI("nW6Itbx3/N+RaIG1rnH9wZIvrf68adzYk3Gk+Klw7sSKeA==\n", "/gHlm90ZmK0=\n")));
        o0OOOO0o.iiI1L1iI().iL1LIlIlI(intent);
    }

    @SuppressLint({"WrongConstant", "MissingPermission"})
    @TargetApi(23)
    public static AudioRecord iiIliillii(int i) {
        AudioRecord.Builder iiI1L1iI2 = ilLIlL1ILi.iiI1L1iI();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioRecord.Builder unused = iiI1L1iI2.setContext(FakeContext.iiI1L1iI());
        }
        AudioRecord.Builder unused2 = iiI1L1iI2.setAudioSource(i);
        AudioRecord.Builder unused3 = iiI1L1iI2.setAudioFormat(iLI1L1l1li.iiI1L1iI());
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 12, 2);
        if (minBufferSize > 0) {
            AudioRecord.Builder unused4 = iiI1L1iI2.setBufferSizeInBytes(minBufferSize * 8);
        }
        return iiI1L1iI2.build();
    }

    public static int iilLil1i11I1(II1l1IliI1Li1 iI1l1IliI1Li1) {
        int i = iiI1L1iI.iiI1L1iI[iI1l1IliI1Li1.ordinal()];
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("GTXkBrVJFwk4PvNTpEwcEiN75BywSxsedns=\n", "TFuXc8U5eHs=\n") + iI1l1IliI1Li1);
    }

    public final void I11lLL1() throws ILiliIiI {
        try {
            this.i1LIL11l = iiIliillii(this.iiI1L1iI);
        } catch (NullPointerException unused) {
            this.i1LIL11l = C0510o0o00o.i1LIL11l(this.iiI1L1iI, 48000, 12, 2, 12, 2);
        }
        this.i1LIL11l.startRecording();
        this.illlI1lLIL = new i1L1llI1LlL1l(this.i1LIL11l);
    }

    public void i1LIL11l() throws ILiliIiI {
        if (Build.VERSION.SDK_INT < 30) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("cmYHWb3kvx1AcgFct6DhVFpnQ1mh5LUbRzMQRaK0tAZHdgcQsKG9G0F2Q3G8oKkbWndDAeM=\n", "MxNjMNLE23Q=\n"));
            throw new ILiliIiI();
        }
    }

    public void iiI1L1iI() {
        AudioRecord audioRecord = this.i1LIL11l;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }

    public final void iilLiIIIi11i(int i, int i2) throws ILiliIiI {
        while (true) {
            int i3 = i - 1;
            if (i > 0) {
                SystemClock.sleep((long) i2);
                try {
                    I11lLL1();
                    return;
                } catch (UnsupportedOperationException unused) {
                    if (i3 != 0) {
                        C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("my75YHFjGECyb+N4dXVMFLw69GV7J1tVrTvlfnErGEa4O+J1fWlfGvNh\n", "3U+QDBQHODQ=\n"));
                        i = i3;
                    } else {
                        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("uF0pX3xMSpWRHDNHeFoewZ9JJFp2CAmAjkg1QXw=\n", "/jxAMxkoauE=\n"));
                        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("KBsybyMh/9IOETIffGmt3BIRe0FtJuzNEwBgS20o+M4TVXBLbTb53BUBd0ptLOOdEx13Disq/9gA\nB31bIyGhnQoUeUttNvjPAlVmRiwxrckPEDJKKDPk3gJVe11tMOPRCBZ5Syll+tUCGzJdOST/yQ4b\ndQ4+Jv/eFww8\n", "Z3USLk1Fjb0=\n"));
                        throw new ILiliIiI();
                    }
                }
            } else {
                return;
            }
        }
    }

    @TargetApi(24)
    public int il1LilLllii(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return this.illlI1lLIL.iiI1L1iI(byteBuffer, bufferInfo);
    }

    public void illlI1lLIL() throws ILiliIiI {
        if (Build.VERSION.SDK_INT == 30) {
            iLLLILIiLi1Ii();
            try {
                iilLiIIIi11i(5, 100);
            } finally {
                IiIIlIL();
            }
        } else {
            I11lLL1();
        }
    }
}
