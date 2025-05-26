package top.tntok.autobot;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* renamed from: top.tntok.autobot.o00oO0O0  reason: case insensitive filesystem */
public class C0225o00oO0O0 {
    public final Method iiI1L1iI;

    public C0225o00oO0O0(Method method) {
        this.iiI1L1iI = method;
    }

    public final void i1LIL11l(GenericArrayType genericArrayType, List<Throwable> list) {
        il1LilLllii(genericArrayType.getGenericComponentType(), list);
    }

    public void iiI1L1iI(List<Throwable> list) {
        for (Type il1LilLllii : this.iiI1L1iI.getGenericParameterTypes()) {
            il1LilLllii(il1LilLllii, list);
        }
    }

    public final void iiIliillii(WildcardType wildcardType, List<Throwable> list) {
        for (Type il1LilLllii : wildcardType.getUpperBounds()) {
            il1LilLllii(il1LilLllii, list);
        }
        for (Type il1LilLllii2 : wildcardType.getLowerBounds()) {
            il1LilLllii(il1LilLllii2, list);
        }
    }

    public final void il1LilLllii(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.iiI1L1iI.getName() + "() contains unresolved type variable " + type));
        } else if (type instanceof ParameterizedType) {
            illlI1lLIL((ParameterizedType) type, list);
        } else if (type instanceof WildcardType) {
            iiIliillii((WildcardType) type, list);
        } else if (type instanceof GenericArrayType) {
            i1LIL11l((GenericArrayType) type, list);
        }
    }

    public final void illlI1lLIL(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type il1LilLllii : parameterizedType.getActualTypeArguments()) {
            il1LilLllii(il1LilLllii, list);
        }
    }
}
