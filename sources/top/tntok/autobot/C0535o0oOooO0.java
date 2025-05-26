package top.tntok.autobot;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import java.lang.reflect.Method;

/* renamed from: top.tntok.autobot.o0oOooO0  reason: case insensitive filesystem */
public final class C0535o0oOooO0 {
    public Method i1LIL11l;
    public final IInterface iiI1L1iI;
    public int iiIliillii;
    public Method il1LilLllii;
    public int illlI1lLIL;

    public C0535o0oOooO0(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public final Method i1LIL11l() throws NoSuchMethodException {
        if (this.il1LilLllii == null) {
            try {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("4f22jIz0Vg==\n", "hJPSz+2YOnI=\n"), new Class[]{String.class});
                this.iiIliillii = 2;
            } catch (Exception unused) {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("Dofehi6Z+A==\n", "a+m6xU/1lOs=\n"), (Class[]) null);
                this.iiIliillii = 1;
            }
        }
        return this.il1LilLllii;
    }

    public void iiI1L1iI() throws Exception {
        Method i1LIL11l2 = i1LIL11l();
        if (this.iiIliillii != 2) {
            i1LIL11l2.invoke(this.iiI1L1iI, (Object[]) null);
            return;
        }
        i1LIL11l2.invoke(this.iiI1L1iI, new Object[]{C0387o0OOoO0o.iiI1L1iI("TWOyGGVNbY5BZbsYd0tskEI=\n", "LgzfNgQjCfw=\n")});
    }

    public void il1LilLllii(String str) throws Exception {
        Object[] objArr;
        Method illlI1lLIL2 = illlI1lLIL();
        int i = this.illlI1lLIL;
        if (i == 1) {
            objArr = new Object[]{Uri.parse(C0387o0OOoO0o.iiI1L1iI("3FAnfw==\n", "qDVLRav/+50=\n") + str), new Bundle(), C0387o0OOoO0o.iiI1L1iI("DHeAq9lslgEAcYmry2qXHwM=\n", "bxjthbgC8nM=\n")};
        } else if (i != 2) {
            objArr = new Object[]{Uri.parse(C0387o0OOoO0o.iiI1L1iI("8TenfA==\n", "hVLLRkyX29E=\n") + str), new Bundle(), C0387o0OOoO0o.iiI1L1iI("Nz9YjrUNtPk7OVGOpwu15zg=\n", "VFA1oNRj0Is=\n")};
        } else {
            objArr = new Object[]{Uri.parse(C0387o0OOoO0o.iiI1L1iI("5CP5nQ==\n", "kEaVp2ZA1Q4=\n") + str), new Bundle(), C0387o0OOoO0o.iiI1L1iI("57JFM4aZRNvrtEwzlJ9Fxeg=\n", "hN0oHef3IKk=\n"), null};
        }
        illlI1lLIL2.invoke(this.iiI1L1iI, objArr);
    }

    public final Method illlI1lLIL() throws NoSuchMethodException {
        Class<Bundle> cls = Bundle.class;
        Class<Uri> cls2 = Uri.class;
        Class<String> cls3 = String.class;
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("Gec2pDXw8cQF\n", "aYtXx1CzkKg=\n"), new Class[]{cls2, cls, cls3, cls3});
                this.illlI1lLIL = 2;
            } catch (Exception unused) {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("gKUQECNWmOKc\n", "8Mlxc0YV+Y4=\n"), new Class[]{cls2, cls, cls3});
                this.illlI1lLIL = 1;
            }
        }
        return this.i1LIL11l;
    }
}
