package top.tntok.autobot;

import java.util.Arrays;

public class I1LiliILi1lI1 {
    public static <T> void I11lLL1(String str, T t, C0175o00Ooo00<T> o00ooo00) {
        if (!o00ooo00.i1LIL11l(t)) {
            throw new i1i1111LLILli(str, t, o00ooo00);
        }
    }

    public static void IiIIlIL(boolean z) {
        iilLil1i11I1(Boolean.valueOf(z), I1i1LilILi.i1iiLIil1ILi(Boolean.TRUE));
    }

    public static void i1LIL11l(boolean z) {
        iilLil1i11I1(Boolean.valueOf(z), I1i1LilILi.i1iiLIil1ILi(Boolean.FALSE));
    }

    public static void iLLLILIiLi1Ii(String str, boolean z) {
        if (!z) {
            throw new i1i1111LLILli(str);
        }
    }

    public static void iiI1L1iI(String str, boolean z) {
        iLLLILIiLi1Ii(str, !z);
    }

    public static void iiIliillii(Object... objArr) {
        iilLil1i11I1(objArr, I1i1LilILi.IIlL1llI1());
        iilLil1i11I1(Arrays.asList(objArr), I1i1LilILi.i111iLiiIIill(I1i1LilILi.IIlL1llI1()));
    }

    public static <T> void iilLil1i11I1(T t, C0175o00Ooo00<T> o00ooo00) {
        if (!o00ooo00.i1LIL11l(t)) {
            throw new i1i1111LLILli(t, o00ooo00);
        }
    }

    public static void il1LilLllii(Throwable th) {
        iilLil1i11I1(th, I1i1LilILi.il1l1IlL());
    }

    public static void illlI1lLIL(String str, Throwable th) {
        I11lLL1(str, th, I1i1LilILi.il1l1IlL());
    }
}
