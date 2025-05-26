package top.tntok.autobot;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import top.tntok.autobot.C0094o000o000;

/* renamed from: top.tntok.autobot.o0O0ooO0  reason: case insensitive filesystem */
public final class C0333o0O0ooO0 {
    public final String i1LIL11l;
    public final C0109o000oo00 iiI1L1iI;
    public final Map<Class<?>, Object> iiIliillii;
    @Nullable
    public volatile i1I1l11IL iilLil1i11I1;
    @Nullable
    public final C0334o0O0ooOO il1LilLllii;
    public final C0094o000o000 illlI1lLIL;

    public C0333o0O0ooO0(iiI1L1iI iii1l1ii) {
        this.iiI1L1iI = iii1l1ii.iiI1L1iI;
        this.i1LIL11l = iii1l1ii.i1LIL11l;
        this.illlI1lLIL = iii1l1ii.illlI1lLIL.IiIIlIL();
        this.il1LilLllii = iii1l1ii.il1LilLllii;
        this.iiIliillii = C0487o0OooooO.i1iiLIil1ILi(iii1l1ii.iiIliillii);
    }

    public String I11lLL1() {
        return this.i1LIL11l;
    }

    @Nullable
    public Object IiIIlIL() {
        return iilLiIIIi11i(Object.class);
    }

    public C0109o000oo00 IiiL1llIIi() {
        return this.iiI1L1iI;
    }

    public i1I1l11IL i1LIL11l() {
        i1I1l11IL i1i1l11il = this.iilLil1i11I1;
        if (i1i1l11il != null) {
            return i1i1l11il;
        }
        i1I1l11IL I1iIiIi = i1I1l11IL.I1iIiIi(this.illlI1lLIL);
        this.iilLil1i11I1 = I1iIiIi;
        return I1iIiIi;
    }

    public iiI1L1iI iLLLILIiLi1Ii() {
        return new iiI1L1iI(this);
    }

    @Nullable
    public C0334o0O0ooOO iiI1L1iI() {
        return this.il1LilLllii;
    }

    public C0094o000o000 iiIliillii() {
        return this.illlI1lLIL;
    }

    @Nullable
    public <T> T iilLiIIIi11i(Class<? extends T> cls) {
        return cls.cast(this.iiIliillii.get(cls));
    }

    public boolean iilLil1i11I1() {
        return this.iiI1L1iI.i111iLiiIIill();
    }

    public List<String> il1LilLllii(String str) {
        return this.illlI1lLIL.iL1LIlIlI(str);
    }

    @Nullable
    public String illlI1lLIL(String str) {
        return this.illlI1lLIL.il1LilLllii(str);
    }

    public String toString() {
        return "Request{method=" + this.i1LIL11l + ", url=" + this.iiI1L1iI + ", tags=" + this.iiIliillii + '}';
    }

    /* renamed from: top.tntok.autobot.o0O0ooO0$iiI1L1iI */
    public static class iiI1L1iI {
        public String i1LIL11l;
        @Nullable
        public C0109o000oo00 iiI1L1iI;
        public Map<Class<?>, Object> iiIliillii;
        @Nullable
        public C0334o0O0ooOO il1LilLllii;
        public C0094o000o000.iiI1L1iI illlI1lLIL;

        public iiI1L1iI() {
            this.iiIliillii = Collections.emptyMap();
            this.i1LIL11l = "GET";
            this.illlI1lLIL = new C0094o000o000.iiI1L1iI();
        }

        public iiI1L1iI I11lLL1() {
            return iilLiIIIi11i("HEAD", (C0334o0O0ooOO) null);
        }

        public iiI1L1iI I1iIiIi(C0334o0O0ooOO o0o0oooo) {
            return iilLiIIIi11i("PUT", o0o0oooo);
        }

        public <T> iiI1L1iI IL1lILLLL1L(Class<? super T> cls, @Nullable T t) {
            if (cls != null) {
                if (t == null) {
                    this.iiIliillii.remove(cls);
                } else {
                    if (this.iiIliillii.isEmpty()) {
                        this.iiIliillii = new LinkedHashMap();
                    }
                    this.iiIliillii.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public iiI1L1iI Ii1liIIIiLi(URL url) {
            if (url != null) {
                return IilL11ii1I1Il(C0109o000oo00.I1iIiIi(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public iiI1L1iI IiIIlIL(C0094o000o000 o000o000) {
            this.illlI1lLIL = o000o000.iilLiIIIi11i();
            return this;
        }

        public iiI1L1iI IiiL1llIIi(C0334o0O0ooOO o0o0oooo) {
            return iilLiIIIi11i("PATCH", o0o0oooo);
        }

        public iiI1L1iI IilL11ii1I1Il(C0109o000oo00 o000oo00) {
            if (o000oo00 != null) {
                this.iiI1L1iI = o000oo00;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public iiI1L1iI i111iLiiIIill(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                return IilL11ii1I1Il(C0109o000oo00.I1iIiIi(str));
            }
            throw new NullPointerException("url == null");
        }

        public iiI1L1iI i1L1lLllLLlIi(String str) {
            this.illlI1lLIL.IiiL1llIIi(str);
            return this;
        }

        public C0333o0O0ooO0 i1LIL11l() {
            if (this.iiI1L1iI != null) {
                return new C0333o0O0ooO0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public iiI1L1iI iILiI1lll(C0334o0O0ooOO o0o0oooo) {
            return iilLiIIIi11i(o00Oo00.IL1lILLLL1L, o0o0oooo);
        }

        public iiI1L1iI iL1LIlIlI(@Nullable Object obj) {
            return IL1lILLLL1L(Object.class, obj);
        }

        public iiI1L1iI iLLLILIiLi1Ii(String str, String str2) {
            this.illlI1lLIL.iILiI1lll(str, str2);
            return this;
        }

        public iiI1L1iI iiI1L1iI(String str, String str2) {
            this.illlI1lLIL.i1LIL11l(str, str2);
            return this;
        }

        public iiI1L1iI iiIliillii(@Nullable C0334o0O0ooOO o0o0oooo) {
            return iilLiIIIi11i("DELETE", o0o0oooo);
        }

        public iiI1L1iI iilLiIIIi11i(String str, @Nullable C0334o0O0ooOO o0o0oooo) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (o0o0oooo != null && !C0106o000oOoo.i1LIL11l(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (o0o0oooo != null || !C0106o000oOoo.iiIliillii(str)) {
                this.i1LIL11l = str;
                this.il1LilLllii = o0o0oooo;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public iiI1L1iI iilLil1i11I1() {
            return iilLiIIIi11i("GET", (C0334o0O0ooOO) null);
        }

        public iiI1L1iI il1LilLllii() {
            return iiIliillii(C0487o0OooooO.iiIliillii);
        }

        public iiI1L1iI illlI1lLIL(i1I1l11IL i1i1l11il) {
            String i1i1l11il2 = i1i1l11il.toString();
            if (i1i1l11il2.isEmpty()) {
                return i1L1lLllLLlIi("Cache-Control");
            }
            return iLLLILIiLi1Ii("Cache-Control", i1i1l11il2);
        }

        public iiI1L1iI(C0333o0O0ooO0 o0o0ooo0) {
            Map<Class<?>, Object> map;
            this.iiIliillii = Collections.emptyMap();
            this.iiI1L1iI = o0o0ooo0.iiI1L1iI;
            this.i1LIL11l = o0o0ooo0.i1LIL11l;
            this.il1LilLllii = o0o0ooo0.il1LilLllii;
            if (o0o0ooo0.iiIliillii.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(o0o0ooo0.iiIliillii);
            }
            this.iiIliillii = map;
            this.illlI1lLIL = o0o0ooo0.illlI1lLIL.iilLiIIIi11i();
        }
    }
}
