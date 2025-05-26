package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOoOO  reason: case insensitive filesystem */
public final class C0388o0OOoOO implements C0129o00O0o0 {
    public final C0129o00O0o0 iiI1L1iI;

    public C0388o0OOoOO(String str) {
        try {
            this.iiI1L1iI = (C0129o00O0o0) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("Stringfog implementation class not found: " + str);
        } catch (InstantiationException e) {
            String message = e.getMessage();
            throw new IllegalArgumentException("Stringfog implementation class new instance failed: " + message);
        } catch (IllegalAccessException e2) {
            String message2 = e2.getMessage();
            throw new IllegalArgumentException("Stringfog implementation class access failed: " + message2);
        }
    }

    public boolean i1LIL11l(String str) {
        C0129o00O0o0 o00o0o0 = this.iiI1L1iI;
        if (o00o0o0 == null || !o00o0o0.i1LIL11l(str)) {
            return false;
        }
        return true;
    }

    public String iiI1L1iI(byte[] bArr, byte[] bArr2) {
        C0129o00O0o0 o00o0o0 = this.iiI1L1iI;
        if (o00o0o0 == null) {
            return new String(bArr);
        }
        return o00o0o0.iiI1L1iI(bArr, bArr2);
    }

    public byte[] illlI1lLIL(String str, byte[] bArr) {
        C0129o00O0o0 o00o0o0 = this.iiI1L1iI;
        if (o00o0o0 == null) {
            return str.getBytes();
        }
        return o00o0o0.illlI1lLIL(str, bArr);
    }
}
