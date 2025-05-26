package top.tntok.autobot;

import android.os.Build;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: top.tntok.autobot.o0ooOOOO  reason: case insensitive filesystem */
public final class C0541o0ooOOOO {
    public int I11lLL1;
    public int IiIIlIL;
    public Method i1LIL11l;
    public Method iLLLILIiLi1Ii;
    public final IInterface iiI1L1iI;
    public int iiIliillii;
    public Method iilLil1i11I1;
    public Method il1LilLllii;
    public int illlI1lLIL;

    public C0541o0ooOOOO(IInterface iInterface) {
        this.iiI1L1iI = iInterface;
    }

    public final Method I11lLL1() throws NoSuchMethodException {
        Class<String> cls = String.class;
        if (this.i1LIL11l == null) {
            try {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("0H+YVB27tj7YaL9xH6o=\n", "txrsHXDe33g=\n"), new Class[]{Integer.TYPE, cls, cls});
            } catch (NoSuchMethodException unused) {
                this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("tPvThQF/Hym87PSgA24=\n", "056nzGwadm8=\n"), new Class[]{Integer.TYPE, cls});
                this.illlI1lLIL = 1;
            }
        }
        return this.i1LIL11l;
    }

    public final Method IiIIlIL() throws NoSuchMethodException {
        Class<String> cls = String.class;
        if (this.il1LilLllii == null) {
            try {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("XGJyZ9Z5845UdVVG3GQ=\n", "OwcGKrMQl8g=\n"), new Class[]{Integer.TYPE, cls, cls});
            } catch (NoSuchMethodException unused) {
                this.il1LilLllii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("+QwaA9+FfZ3xGz0i1Zg=\n", "nmluTrrsGds=\n"), new Class[]{Integer.TYPE, cls});
                this.iiIliillii = 1;
            }
        }
        return this.il1LilLllii;
    }

    public final Method i1LIL11l() throws NoSuchMethodException {
        if (this.iLLLILIiLi1Ii == null) {
            try {
                Class<String> cls = String.class;
                this.iLLLILIiLi1Ii = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("t79YYw==\n", "1N40D7UMyok=\n"), new Class[]{cls, cls});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return this.iLLLILIiLi1Ii;
    }

    public String iLLLILIiLi1Ii() {
        Object[] objArr;
        try {
            Method IiIIlIL2 = IiIIlIL();
            if (this.iiIliillii != 0) {
                objArr = new Object[]{Integer.MAX_VALUE, C0387o0OOoO0o.iiI1L1iI("sBXqVgyXapS8E+NWHpFrir8=\n", "03qHeG35DuY=\n")};
            } else {
                objArr = new Object[]{Integer.MAX_VALUE, C0387o0OOoO0o.iiI1L1iI("cF8NVqB1MRB8WQRWsnMwDn8=\n", "EzBgeMEbVWI=\n"), null};
            }
            return (String) IiIIlIL2.invoke(this.iiI1L1iI, objArr);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("a9iKLsKbxrJcl5Ys0NTDuAjamjbO1Mw=\n", "KLf/Qqa7qN0=\n"), e);
            return "";
        }
    }

    public void iiI1L1iI(String str) {
        try {
            i1LIL11l().invoke(this.iiI1L1iI, this.IiIIlIL != 0 ? new Object[]{C0387o0OOoO0o.iiI1L1iI("p4cyRr/BcFirgTtGrcdxRqg=\n", "xOhfaN6vFCo=\n"), str} : new Object[]{C0387o0OOoO0o.iiI1L1iI("ADNKjvmSJKcMNUOO65QluQ8=\n", "Y1wnoJj8QNU=\n"), str});
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Bcf2cUtOosIyiOpzWQGnyGbF5mlHAag=\n", "RqiDHS9uzK0=\n"), e);
        }
    }

    public Map<String, String> iiIliillii() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("vXlk/g==\n", "1BQBl+Anc2U=\n"), iilLil1i11I1());
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("e69XFw==\n", "Fso+c2UwjGs=\n"), iLLLILIiLi1Ii());
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("IbXhJLlLKWY=\n", "RdCXTdouYAI=\n"), illlI1lLIL());
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("DP+wjtYfYJE=\n", "fIzV+7JwKdU=\n"), OooOOO.iiI1L1iI());
        hashMap.put(C0387o0OOoO0o.iiI1L1iI("ih/XkJJKds2P\n", "63Gz4v0jEoQ=\n"), o0OOOOO.iiIliillii());
        return hashMap;
    }

    public String iilLil1i11I1() {
        Object[] objArr;
        try {
            Method I11lLL12 = I11lLL1();
            if (this.illlI1lLIL != 0) {
                objArr = new Object[]{Integer.MAX_VALUE, C0387o0OOoO0o.iiI1L1iI("1xsO7wAckEnbHQfvEhqRV9g=\n", "tHRjwWFy9Ds=\n")};
            } else {
                objArr = new Object[]{Integer.MAX_VALUE, C0387o0OOoO0o.iiI1L1iI("nVstG9cQmYuRXSQbxRaYlZI=\n", "/jRANbZ+/fk=\n"), null};
            }
            return (String) I11lLL12.invoke(this.iiI1L1iI, objArr);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("M4J/3NXEvewEzWPex4u45lCAb8TZi7c=\n", "cO0KsLHk04M=\n"), e);
            return "";
        }
    }

    public final Method il1LilLllii() throws NoSuchMethodException {
        String str;
        String str2;
        Class<String> cls = String.class;
        if (this.iilLil1i11I1 == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                str = "Utdi5cXzsjVQ+3L2yfGzEFDTYtTS4A==\n";
                str2 = "NbIWoaCF21Y=\n";
            } else {
                str = "MpWS13tZ4XEwuYI=\n";
                str2 = "VfDmkx4viBI=\n";
            }
            String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI(str, str2);
            try {
                this.iilLil1i11I1 = this.iiI1L1iI.getClass().getMethod(iiI1L1iI2, new Class[]{cls, cls});
            } catch (NoSuchMethodException unused) {
                this.iilLil1i11I1 = this.iiI1L1iI.getClass().getMethod(iiI1L1iI2, new Class[]{cls});
                this.I11lLL1 = 1;
            }
        }
        return this.iilLil1i11I1;
    }

    public String illlI1lLIL() {
        Object[] objArr;
        try {
            Method il1LilLllii2 = il1LilLllii();
            if (this.I11lLL1 != 0) {
                objArr = new Object[]{C0387o0OOoO0o.iiI1L1iI("cZR61BmuJbR9knPUC6gkqn4=\n", "EvsX+njAQcY=\n")};
            } else {
                objArr = new Object[]{C0387o0OOoO0o.iiI1L1iI("bsG7YGoi/Htix7JgeCT9ZWE=\n", "Da7WTgtMmAk=\n"), null};
            }
            return (String) il1LilLllii2.invoke(this.iiI1L1iI, objArr);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("7cmTsrYMHDTaho+wpEMZPo7Lg6q6QxY=\n", "rqbm3tIscls=\n"), e);
            return "";
        }
    }
}
