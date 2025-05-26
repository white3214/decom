package top.tntok.autobot;

import android.media.MediaCodec;

public final /* synthetic */ class iilL1lILLL {
    public static String iiI1L1iI(MediaCodec mediaCodec) {
        String[] supportedTypes = mediaCodec.getCodecInfo().getSupportedTypes();
        if (supportedTypes.length > 0) {
            return supportedTypes[0];
        }
        return null;
    }
}
