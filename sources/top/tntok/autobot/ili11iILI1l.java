package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class ili11iILI1l implements Serializable, Comparable<ili11iILI1l> {
    public static final ili11iILI1l iiIliillii = il1l1IlL(new byte[0]);
    public static final char[] il1LilLllii = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 1;
    final byte[] data;
    public transient int i1LIL11l;
    public transient String illlI1lLIL;

    public ili11iILI1l(byte[] bArr) {
        this.data = bArr;
    }

    public static ili11iILI1l I11lLL1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((iLLLILIiLi1Ii(str.charAt(i2)) << 4) + iLLLILIiLi1Ii(str.charAt(i2 + 1)));
            }
            return il1l1IlL(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    public static ili11iILI1l I1IIIi1i1ILl(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C0485o0Ooooo.i1LIL11l((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new ili11iILI1l(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ili11iILI1l IL111l1(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ili11iILI1l(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ili11iILI1l IL1IiilLlLI(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new ili11iILI1l(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
    }

    public static ili11iILI1l IiiL1llIIi(String str) {
        if (str != null) {
            ili11iILI1l ili11iili1l = new ili11iILI1l(str.getBytes(C0485o0Ooooo.iiI1L1iI));
            ili11iili1l.illlI1lLIL = str;
            return ili11iili1l;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static int iLLLILIiLi1Ii(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static ili11iILI1l iilLiIIIi11i(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new ili11iILI1l(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    @Nullable
    public static ili11iILI1l iilLil1i11I1(String str) {
        if (str != null) {
            byte[] iiI1L1iI = iL1lL1LL.iiI1L1iI(str);
            if (iiI1L1iI != null) {
                return new ili11iILI1l(iiI1L1iI);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static int il1LilLllii(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static ili11iILI1l il1l1IlL(byte... bArr) {
        if (bArr != null) {
            return new ili11iILI1l((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        ili11iILI1l IL1IiilLlLI = IL1IiilLlLI(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = ili11iILI1l.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, IL1IiilLlLI.data);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public final int I1I11Il1(byte[] bArr) {
        return i1iI1iiLL1(bArr, illiiliIILI());
    }

    public final boolean I1iIiIi(byte[] bArr) {
        return IIIlll1lll(illiiliIILI() - bArr.length, bArr, 0, bArr.length);
    }

    public final int I1l1iIll1lIi1(ili11iILI1l ili11iili1l) {
        return i1iiLIil1ILi(ili11iili1l.i11liIIl11Ii1(), 0);
    }

    public boolean IIIlll1lll(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C0485o0Ooooo.iiI1L1iI(bArr2, i, bArr, i2, i3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ili11iILI1l IILiIL1i11Li() {
        return IiIIlIL("SHA-1");
    }

    public ili11iILI1l IIi1l1i(int i) {
        return IIllllLiIlIl(i, this.data.length);
    }

    public ili11iILI1l IIlL1llI1() {
        return IiIIlIL("MD5");
    }

    public ili11iILI1l IIlLill() {
        return IiIIlIL("SHA-256");
    }

    public ili11iILI1l IIllllLiIlIl(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new ili11iILI1l(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.data.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public String IL1lILLLL1L() {
        byte[] bArr = this.data;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = il1LilLllii;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public String ILiLII1ILi() {
        String str = this.illlI1lLIL;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, C0485o0Ooooo.iiI1L1iI);
        this.illlI1lLIL = str2;
        return str2;
    }

    public final int ILl1iII11Ll1(byte[] bArr) {
        return i1iiLIil1ILi(bArr, 0);
    }

    public final boolean ILllI11(ili11iILI1l ili11iili1l) {
        return IilliIIIlI1ll(0, ili11iili1l, 0, ili11iili1l.illiiliIILI());
    }

    public ili11iILI1l Ii1liIIIiLi(ili11iILI1l ili11iili1l) {
        return iL1LIlIlI("HmacSHA256", ili11iili1l);
    }

    public final ili11iILI1l IiIIlIL(String str) {
        try {
            return il1l1IlL(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void IiIl11II(IiILIlLLiIL iiILIlLLiIL) {
        byte[] bArr = this.data;
        iiILIlLLiIL.iLLLILIiLi1Ii(bArr, 0, bArr.length);
    }

    public ili11iILI1l IiiIlLl1il1i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new ili11iILI1l(bArr2);
            }
        }
    }

    public ili11iILI1l IilL11ii1I1Il(ili11iILI1l ili11iili1l) {
        return iL1LIlIlI("HmacSHA512", ili11iili1l);
    }

    public boolean IilliIIIlI1ll(int i, ili11iILI1l ili11iili1l, int i2, int i3) {
        return ili11iili1l.IIIlll1lll(i2, this.data, i, i3);
    }

    public void Il1llillili(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.data);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final int IliiLiLliIl(ili11iILI1l ili11iili1l, int i) {
        return i1iI1iiLL1(ili11iili1l.i11liIIl11Ii1(), i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ili11iILI1l) {
            ili11iILI1l ili11iili1l = (ili11iILI1l) obj;
            int illiiliIILI = ili11iili1l.illiiliIILI();
            byte[] bArr = this.data;
            if (illiiliIILI != bArr.length || !ili11iili1l.IIIlll1lll(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.i1LIL11l;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.i1LIL11l = hashCode;
        return hashCode;
    }

    public ili11iILI1l i111iLiiIIill(ili11iILI1l ili11iili1l) {
        return iL1LIlIlI("HmacSHA1", ili11iili1l);
    }

    public byte[] i11liIIl11Ii1() {
        return this.data;
    }

    public byte i1L1lLllLLlIi(int i) {
        return this.data[i];
    }

    public String i1LIL11l() {
        return iL1lL1LL.i1LIL11l(this.data);
    }

    public byte[] i1LiiIlIL1I() {
        return (byte[]) this.data.clone();
    }

    public int i1iI1iiLL1(byte[] bArr, int i) {
        for (int min = Math.min(i, this.data.length - bArr.length); min >= 0; min--) {
            if (C0485o0Ooooo.iiI1L1iI(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final boolean i1iLlIill1I(byte[] bArr) {
        return IIIlll1lll(0, bArr, 0, bArr.length);
    }

    public int i1iiLIil1ILi(byte[] bArr, int i) {
        int length = this.data.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (C0485o0Ooooo.iiI1L1iI(this.data, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public final boolean iILiI1lll(ili11iILI1l ili11iili1l) {
        return IilliIIIlI1ll(illiiliIILI() - ili11iili1l.illiiliIILI(), ili11iili1l, 0, ili11iili1l.illiiliIILI());
    }

    public final ili11iILI1l iL1LIlIlI(String str, ili11iILI1l ili11iili1l) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(ili11iili1l.i1LiiIlIL1I(), str));
            return il1l1IlL(instance.doFinal(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public ili11iILI1l iLlIllll() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 97 || b > 122) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new ili11iILI1l(bArr2);
            }
        }
    }

    public ByteBuffer iiI1L1iI() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    /* renamed from: iiIliillii */
    public int compareTo(ili11iILI1l ili11iili1l) {
        int illiiliIILI = illiiliIILI();
        int illiiliIILI2 = ili11iili1l.illiiliIILI();
        int min = Math.min(illiiliIILI, illiiliIILI2);
        int i = 0;
        while (i < min) {
            byte i1L1lLllLLlIi = i1L1lLllLLlIi(i) & i1IL1lILl1L1I.iiI1L1iI;
            byte i1L1lLllLLlIi2 = ili11iili1l.i1L1lLllLLlIi(i) & i1IL1lILl1L1I.iiI1L1iI;
            if (i1L1lLllLLlIi == i1L1lLllLLlIi2) {
                i++;
            } else if (i1L1lLllLLlIi < i1L1lLllLLlIi2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (illiiliIILI == illiiliIILI2) {
            return 0;
        }
        if (illiiliIILI < illiiliIILI2) {
            return -1;
        }
        return 1;
    }

    public final int iiLIIiIli(ili11iILI1l ili11iili1l, int i) {
        return i1iiLIil1ILi(ili11iili1l.i11liIIl11Ii1(), i);
    }

    public final int iiiiI1iILL11I(ili11iILI1l ili11iili1l) {
        return i1iI1iiLL1(ili11iili1l.i11liIIl11Ii1(), illiiliIILI());
    }

    public ili11iILI1l iliilLllIl1() {
        return IiIIlIL("SHA-512");
    }

    public String illi1LIILLiL(Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public int illiiliIILI() {
        return this.data.length;
    }

    public String illlI1lLIL() {
        return iL1lL1LL.il1LilLllii(this.data);
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String ILiLII1ILi = ILiLII1ILi();
        int il1LilLllii2 = il1LilLllii(ILiLII1ILi, 64);
        if (il1LilLllii2 != -1) {
            String replace = ILiLII1ILi.substring(0, il1LilLllii2).replace("\\", "\\\\").replace(C0130o00O0o00.iLLLILIiLi1Ii, "\\n").replace("\r", "\\r");
            if (il1LilLllii2 < ILiLII1ILi.length()) {
                return "[size=" + this.data.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.data.length <= 64) {
            return "[hex=" + IL1lILLLL1L() + "]";
        } else {
            return "[size=" + this.data.length + " hex=" + IIllllLiIlIl(0, 64).IL1lILLLL1L() + "…]";
        }
    }
}
