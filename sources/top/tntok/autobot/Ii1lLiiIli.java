package top.tntok.autobot;

import java.io.Serializable;
import java.util.Locale;

public class Ii1lLiiIli implements Serializable {
    public static final char I11lLL1 = '﻿';
    public static final Ii1lLiiIli i1LIL11l = new Ii1lLiiIli(C0514o0o00oO.iilLil1i11I1, 239, 187, 191);
    public static final Ii1lLiiIli iiIliillii = new Ii1lLiiIli(C0514o0o00oO.iilLiIIIi11i, 0, 0, 254, 255);
    public static final Ii1lLiiIli iilLil1i11I1 = new Ii1lLiiIli(C0514o0o00oO.IiiL1llIIi, 255, 254, 0, 0);
    public static final Ii1lLiiIli il1LilLllii = new Ii1lLiiIli(C0514o0o00oO.IiIIlIL, 255, 254);
    public static final Ii1lLiiIli illlI1lLIL = new Ii1lLiiIli(C0514o0o00oO.iLLLILIiLi1Ii, 254, 255);
    private static final long serialVersionUID = 1;
    private final int[] bytes;
    private final String charsetName;

    public Ii1lLiiIli(String str, int... iArr) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("No charsetName specified");
        } else if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        } else {
            this.charsetName = str;
            int[] iArr2 = new int[iArr.length];
            this.bytes = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Ii1lLiiIli)) {
            return false;
        }
        Ii1lLiiIli ii1lLiiIli = (Ii1lLiiIli) obj;
        if (this.bytes.length != ii1lLiiIli.il1LilLllii()) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return true;
            }
            if (iArr[i] != ii1lLiiIli.iiI1L1iI(i)) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int hashCode = getClass().hashCode();
        for (int i : this.bytes) {
            hashCode += i;
        }
        return hashCode;
    }

    public byte[] i1LIL11l() {
        byte[] bArr = new byte[this.bytes.length];
        int i = 0;
        while (true) {
            int[] iArr = this.bytes;
            if (i >= iArr.length) {
                return bArr;
            }
            bArr[i] = (byte) iArr[i];
            i++;
        }
    }

    public int iiI1L1iI(int i) {
        return this.bytes[i];
    }

    public int il1LilLllii() {
        return this.bytes.length;
    }

    public String illlI1lLIL() {
        return this.charsetName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.charsetName);
        sb.append(": ");
        for (int i = 0; i < this.bytes.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("0x");
            sb.append(Integer.toHexString(this.bytes[i] & 255).toUpperCase(Locale.ROOT));
        }
        sb.append(']');
        return sb.toString();
    }
}
