package top.tntok.autobot;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: top.tntok.autobot.o000OoOo  reason: case insensitive filesystem */
public final class C0088o000OoOo extends C0078o000O0oO {
    public final Mac il1LilLllii;
    public final MessageDigest illlI1lLIL;

    public C0088o000OoOo(C0370o0OOOooO o0oooooo, String str) {
        super(o0oooooo);
        try {
            this.illlI1lLIL = MessageDigest.getInstance(str);
            this.il1LilLllii = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static C0088o000OoOo I1LiILiLLIl1l(C0370o0OOOooO o0oooooo) {
        return new C0088o000OoOo(o0oooooo, "SHA-1");
    }

    public static C0088o000OoOo IiIl11II(C0370o0OOOooO o0oooooo) {
        return new C0088o000OoOo(o0oooooo, "MD5");
    }

    public static C0088o000OoOo i111iLiiIIill(C0370o0OOOooO o0oooooo, ili11iILI1l ili11iili1l) {
        return new C0088o000OoOo(o0oooooo, ili11iili1l, "HmacSHA256");
    }

    public static C0088o000OoOo il1LilLllii(C0370o0OOOooO o0oooooo, ili11iILI1l ili11iili1l) {
        return new C0088o000OoOo(o0oooooo, ili11iili1l, "HmacSHA1");
    }

    public static C0088o000OoOo ilLIlL1ILi(C0370o0OOOooO o0oooooo) {
        return new C0088o000OoOo(o0oooooo, "SHA-256");
    }

    public long IIlllIIi1ii(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        long IIlllIIi1ii = super.IIlllIIi1ii(iiILIlLLiIL, j);
        if (IIlllIIi1ii != -1) {
            long j2 = iiILIlLLiIL.illlI1lLIL;
            long j3 = j2 - IIlllIIi1ii;
            o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
            while (j2 > j3) {
                o0ooo00 = o0ooo00.I11lLL1;
                j2 -= (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l);
            }
            while (j2 < iiILIlLLiIL.illlI1lLIL) {
                int i = (int) ((((long) o0ooo00.i1LIL11l) + j3) - j2);
                MessageDigest messageDigest = this.illlI1lLIL;
                if (messageDigest != null) {
                    messageDigest.update(o0ooo00.iiI1L1iI, i, o0ooo00.illlI1lLIL - i);
                } else {
                    this.il1LilLllii.update(o0ooo00.iiI1L1iI, i, o0ooo00.illlI1lLIL - i);
                }
                j3 = ((long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l)) + j2;
                o0ooo00 = o0ooo00.iilLil1i11I1;
                j2 = j3;
            }
        }
        return IIlllIIi1ii;
    }

    public final ili11iILI1l i1LIL11l() {
        byte[] bArr;
        MessageDigest messageDigest = this.illlI1lLIL;
        if (messageDigest != null) {
            bArr = messageDigest.digest();
        } else {
            bArr = this.il1LilLllii.doFinal();
        }
        return ili11iILI1l.il1l1IlL(bArr);
    }

    public C0088o000OoOo(C0370o0OOOooO o0oooooo, ili11iILI1l ili11iili1l, String str) {
        super(o0oooooo);
        try {
            Mac instance = Mac.getInstance(str);
            this.il1LilLllii = instance;
            instance.init(new SecretKeySpec(ili11iili1l.i1LiiIlIL1I(), str));
            this.illlI1lLIL = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
