package top.tntok.autobot;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: top.tntok.autobot.o000OoOO  reason: case insensitive filesystem */
public final class C0087o000OoOO extends C0077o000O0o0 {
    @Nullable
    public final Mac il1LilLllii;
    @Nullable
    public final MessageDigest illlI1lLIL;

    public C0087o000OoOO(C0361o0OOOo0 o0oooo0, String str) {
        super(o0oooo0);
        try {
            this.illlI1lLIL = MessageDigest.getInstance(str);
            this.il1LilLllii = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static C0087o000OoOO I1LiILiLLIl1l(C0361o0OOOo0 o0oooo0) {
        return new C0087o000OoOO(o0oooo0, "MD5");
    }

    public static C0087o000OoOO IIL1Ll1I111(C0361o0OOOo0 o0oooo0) {
        return new C0087o000OoOO(o0oooo0, "SHA-256");
    }

    public static C0087o000OoOO IiIl11II(C0361o0OOOo0 o0oooo0, ili11iILI1l ili11iili1l) {
        return new C0087o000OoOO(o0oooo0, ili11iili1l, "HmacSHA512");
    }

    public static C0087o000OoOO i111iLiiIIill(C0361o0OOOo0 o0oooo0, ili11iILI1l ili11iili1l) {
        return new C0087o000OoOO(o0oooo0, ili11iili1l, "HmacSHA256");
    }

    public static C0087o000OoOO il1LilLllii(C0361o0OOOo0 o0oooo0, ili11iILI1l ili11iili1l) {
        return new C0087o000OoOO(o0oooo0, ili11iili1l, "HmacSHA1");
    }

    public static C0087o000OoOO ilIILlI1l11i(C0361o0OOOo0 o0oooo0) {
        return new C0087o000OoOO(o0oooo0, "SHA-512");
    }

    public static C0087o000OoOO ilLIlL1ILi(C0361o0OOOo0 o0oooo0) {
        return new C0087o000OoOO(o0oooo0, "SHA-1");
    }

    public void I1iIiIi(IiILIlLLiIL iiILIlLLiIL, long j) throws IOException {
        C0485o0Ooooo.i1LIL11l(iiILIlLLiIL.illlI1lLIL, 0, j);
        o0OOO00 o0ooo00 = iiILIlLLiIL.i1LIL11l;
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (o0ooo00.illlI1lLIL - o0ooo00.i1LIL11l));
            MessageDigest messageDigest = this.illlI1lLIL;
            if (messageDigest != null) {
                messageDigest.update(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
            } else {
                this.il1LilLllii.update(o0ooo00.iiI1L1iI, o0ooo00.i1LIL11l, min);
            }
            j2 += (long) min;
            o0ooo00 = o0ooo00.iilLil1i11I1;
        }
        super.I1iIiIi(iiILIlLLiIL, j);
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

    public C0087o000OoOO(C0361o0OOOo0 o0oooo0, ili11iILI1l ili11iili1l, String str) {
        super(o0oooo0);
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
