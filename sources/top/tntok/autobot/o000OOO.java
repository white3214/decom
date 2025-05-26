package top.tntok.autobot;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class o000OOO {
    public static final boolean iiI1L1iI = false;

    public static String I11lLL1(int i) {
        String gluErrorString = GLU.gluErrorString(i);
        return C0387o0OOoO0o.iiI1L1iI("XW3wLZIuskoKeQ==\n", "OgG1X+BBwGo=\n") + Integer.toHexString(i) + " " + gluErrorString;
    }

    public static FloatBuffer i1LIL11l(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static String iiIliillii(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return str;
        }
        return str + C0387o0OOoO0o.iiI1L1iI("3mE=\n", "/km3lEJsCuo=\n") + I11lLL1(glGetError) + C0387o0OOoO0o.iiI1L1iI("Vw==\n", "fjAoLvUG5D0=\n");
    }

    public static String iilLil1i11I1(int i) {
        switch (i) {
            case 35632:
                return C0387o0OOoO0o.iiI1L1iI("l2F/PF0nH9TRYHY6VCcD\n", "8RMeWzBCcaA=\n");
            case 35633:
                return C0387o0OOoO0o.iiI1L1iI("HQaJJOcghCgDAp818A==\n", "a2P7UIJYpFs=\n");
            default:
                return C0387o0OOoO0o.iiI1L1iI("pYxg9lI4\n", "1uQBkjdKqA0=\n");
        }
    }

    public static int il1LilLllii(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            C0525o0oOO.illlI1lLIL(iiIliillii(C0387o0OOoO0o.iiI1L1iI("98briWDOTYDAif2XYY9XipTa9oRgi1E=\n", "tKme5QTuI+8=\n")));
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("iuCmvPUUuUe9r7C//ES+RKyv\n", "yY/T0JE01yg=\n") + iilLil1i11I1(i) + C0387o0OOoO0o.iiI1L1iI("Y44=\n", "Wa4ahMOQQVc=\n") + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int illlI1lLIL(String str, String str2) {
        int il1LilLllii = il1LilLllii(35633, str);
        if (il1LilLllii == 0) {
            return 0;
        }
        int il1LilLllii2 = il1LilLllii(35632, str2);
        if (il1LilLllii2 == 0) {
            GLES20.glDeleteShader(il1LilLllii);
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            GLES20.glDeleteShader(il1LilLllii2);
            GLES20.glDeleteShader(il1LilLllii);
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, il1LilLllii);
        iiI1L1iI();
        GLES20.glAttachShader(glCreateProgram, il1LilLllii2);
        iiI1L1iI();
        GLES20.glLinkProgram(glCreateProgram);
        iiI1L1iI();
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("ILUFPnfcf0IX+hw7fZcxXRG1FyBykSsN\n", "Y9pwUhP8ES0=\n") + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        GLES20.glDeleteShader(il1LilLllii2);
        GLES20.glDeleteShader(il1LilLllii);
        return 0;
    }

    public static void iiI1L1iI() {
    }
}
