package top.tntok.autobot;

public final class IL1IiLI {
    public static final float i1LIL11l = -1.0f;
    public float iiI1L1iI;

    public IL1IiLI(float f) {
        this.iiI1L1iI = f;
    }

    public static IL1IiLI i1LIL11l(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return new IL1IiLI(((float) i) / ((float) i2));
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("P924ugNrq84XwL6+DHbvnBfHp7RVIg==\n", "drPO228Cz+4=\n") + i + C0387o0OOoO0o.iiI1L1iI("YA==\n", "WqkCaAt87Oc=\n") + i2);
    }

    public static IL1IiLI iiI1L1iI(float f) {
        if (f >= 0.0f) {
            return new IL1IiLI(f);
        }
        throw new IllegalArgumentException(C0387o0OOoO0o.iiI1L1iI("ytvgu7ghNHPixua/tzxwIeLB/7XuaA==\n", "g7WW2tRIUFM=\n") + f);
    }

    public static IL1IiLI iiIliillii() {
        return new IL1IiLI(-1.0f);
    }

    public boolean il1LilLllii() {
        if (this.iiI1L1iI == -1.0f) {
            return true;
        }
        return false;
    }

    public float illlI1lLIL() {
        return this.iiI1L1iI;
    }
}
