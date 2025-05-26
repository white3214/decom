package top.tntok.autobot;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class i11liIIl11Ii1 implements C0251o00oo0O0 {
    public static final /* synthetic */ boolean iilLiIIIi11i = false;
    public int I11lLL1;
    public int IiIIlIL;
    public FloatBuffer i1LIL11l;
    public int iLLLILIiLi1Ii;
    public int iiI1L1iI;
    public int iiIliillii;
    public int iilLil1i11I1;
    public final float[] il1LilLllii;
    public FloatBuffer illlI1lLIL;

    public i11liIIl11Ii1(i1iiLIil1ILi i1iiliil1ili) {
        this.il1LilLllii = i1iiliil1ili.IL1lILLLL1L();
    }

    public void i1LIL11l() throws C0252o00oo0OO {
        int illlI1lLIL2 = o000OOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("VxYpfN3LHR9UUXw+pMMGBQYJLnvax1IHEQN4LtjHAAURGBN+wdFJexUUOHzHwAcFEUA6a82WUgUR\nGBNtwc0AFQc/JWCVqAQQBhklYMmCBBQXUmx6y9otEhsPPmrdmXgEGgkqYdzPUhwVFHgu2scKLhkB\nOHzH2kl7AQ4laMHQH1EZATg6jtcBFAY/IW/a0BsJT2o6YcfGUhwVCSImh4IJe1RAbC7Jzi0hGxMl\nesfNHFFJQDpr3NYXCSsQI32VqFJRVEA4a9b9ER4bEih9jp9SWQAFNFHDwwYDHRhsJI7XARQGPyFv\n2tAbCVRKbHrL2i0SGw8+at39Gx9dTjR3lagP\n", "dGBMDq6icnE=\n"), C0387o0OOoO0o.iiI1L1iI("hEgTQASzEmOHD0YCffkYddNbGEEetRMt4HIpfTKJIkjgcilbGrsaaPhbDkYSqBNsyx5MEgW/DHjO\nTBM4B6gYbs5NH10Z+hVkwFYGEhG2EmzTBXxHGbMbYtVTVkEWtw1hwkwzSgO/D2PGUjl3JPoJaN8F\nfEQWqARkyVlWRBK5Ty3TWw5tFLUSf8NNTTgBtRRph1MXWxnyVC3cNFYSV/oUa4cWAlcPhR5iyEwS\nQVmiXTOaHkYcR/pbK4dKE0oouRJi1VoFHA/6QTCHD1gCffpdLYceVhJX+l0thxhQEgO/BVLEURlA\nE6lTdIcASxJH9E0tgRhWRhKiIm7IUQRWBPQELZsDVgNZ6lQt3DRWElf6XS2HHhFeKJwPbMB9GV4Y\nqF0wh0oTSgOvD2iVel5GEqJRLdNbDm0UtRJ/w01fCX36XS2HQ1ZXG6kYLdw0VhJX+l0thx4RXiic\nD2zAfRleGKhdMIdIE1FD8k0jlxdNOFf6XS3aNAs=\n", "pz52MnfafQ0=\n"));
        this.iiI1L1iI = illlI1lLIL2;
        if (illlI1lLIL2 != 0) {
            this.i1LIL11l = o000OOO.i1LIL11l(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            this.illlI1lLIL = o000OOO.i1LIL11l(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
            this.iiIliillii = GLES20.glGetAttribLocation(this.iiI1L1iI, C0387o0OOoO0o.iiI1L1iI("mqnuE0VfJfqDvw==\n", "7MycZyAneoo=\n"));
            this.iilLil1i11I1 = GLES20.glGetAttribLocation(this.iiI1L1iI, C0387o0OOoO0o.iiI1L1iI("sxWpWJuYw92jA45ulg==\n", "x3DRB/j3rK8=\n"));
            this.I11lLL1 = GLES20.glGetUniformLocation(this.iiI1L1iI, C0387o0OOoO0o.iiI1L1iI("c6ii\n", "B83a8Ej+Ms0=\n"));
            this.iLLLILIiLi1Ii = GLES20.glGetUniformLocation(this.iiI1L1iI, C0387o0OOoO0o.iiI1L1iI("crN52kK/trVvrg==\n", "BtYBhS/ewsc=\n"));
            this.IiIIlIL = GLES20.glGetUniformLocation(this.iiI1L1iI, C0387o0OOoO0o.iiI1L1iI("HJ863C1u9CMbhSc=\n", "aexfrnIDlVc=\n"));
            return;
        }
        throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("uT2tx7DgwnOIOaLdurStYJ8yhOX/5JB/nS6ixA==\n", "+lzDqd+U4hA=\n"));
    }

    public void iiI1L1iI() {
        GLES20.glDeleteProgram(this.iiI1L1iI);
        o000OOO.iiI1L1iI();
    }

    public void illlI1lLIL(int i, float[] fArr) {
        GLES20.glUseProgram(this.iiI1L1iI);
        o000OOO.iiI1L1iI();
        GLES20.glEnableVertexAttribArray(this.iiIliillii);
        o000OOO.iiI1L1iI();
        GLES20.glEnableVertexAttribArray(this.iilLil1i11I1);
        o000OOO.iiI1L1iI();
        GLES20.glVertexAttribPointer(this.iiIliillii, 2, 5126, false, 0, this.i1LIL11l);
        o000OOO.iiI1L1iI();
        GLES20.glVertexAttribPointer(this.iilLil1i11I1, 2, 5126, false, 0, this.illlI1lLIL);
        o000OOO.iiI1L1iI();
        GLES20.glActiveTexture(33984);
        o000OOO.iiI1L1iI();
        GLES20.glBindTexture(36197, i);
        o000OOO.iiI1L1iI();
        GLES20.glUniform1i(this.I11lLL1, 0);
        o000OOO.iiI1L1iI();
        GLES20.glUniformMatrix4fv(this.iLLLILIiLi1Ii, 1, false, fArr, 0);
        o000OOO.iiI1L1iI();
        GLES20.glUniformMatrix4fv(this.IiIIlIL, 1, false, this.il1LilLllii, 0);
        o000OOO.iiI1L1iI();
        GLES20.glClear(16384);
        o000OOO.iiI1L1iI();
        GLES20.glDrawArrays(5, 0, 4);
        o000OOO.iiI1L1iI();
    }
}
