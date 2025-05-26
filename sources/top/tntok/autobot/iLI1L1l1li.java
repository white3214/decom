package top.tntok.autobot;

import android.media.AudioFormat;

public final class iLI1L1l1li {
    public static final int I11lLL1 = 4096;
    public static final int i1LIL11l = 12;
    public static final int iiI1L1iI = 48000;
    public static final int iiIliillii = 2;
    public static final int iilLil1i11I1 = 2;
    public static final int il1LilLllii = 12;
    public static final int illlI1lLIL = 2;

    public static AudioFormat iiI1L1iI() {
        AudioFormat.Builder builder = new AudioFormat.Builder();
        builder.setEncoding(2);
        builder.setSampleRate(48000);
        builder.setChannelMask(12);
        return builder.build();
    }
}
