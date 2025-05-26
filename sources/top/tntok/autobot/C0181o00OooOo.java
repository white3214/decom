package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import top.tntok.autobot.C0239o00oOoO0;

/* renamed from: top.tntok.autobot.o00OooOo  reason: case insensitive filesystem */
public class C0181o00OooOo extends C0239o00oOoO0 {
    public final MessageDigest illlI1lLIL;

    /* renamed from: top.tntok.autobot.o00OooOo$iiI1L1iI */
    public static class iiI1L1iI extends C0239o00oOoO0.iiI1L1iI {
        public final MessageDigest iiI1L1iI;

        public iiI1L1iI(MessageDigest messageDigest) {
            this.iiI1L1iI = messageDigest;
        }

        public void i1LIL11l(int i) throws IOException {
            this.iiI1L1iI.update((byte) i);
        }

        public void illlI1lLIL(byte[] bArr, int i, int i2) throws IOException {
            this.iiI1L1iI.update(bArr, i, i2);
        }
    }

    public C0181o00OooOo(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.illlI1lLIL = messageDigest;
        i111iLiiIIill(new iiI1L1iI(messageDigest));
    }

    public MessageDigest iIiL11iL() {
        return this.illlI1lLIL;
    }

    public C0181o00OooOo(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }

    public C0181o00OooOo(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance("MD5"));
    }
}
