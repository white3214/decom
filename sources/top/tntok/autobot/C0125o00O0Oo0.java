package top.tntok.autobot;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
/* renamed from: top.tntok.autobot.o00O0Oo0  reason: case insensitive filesystem */
public interface C0125o00O0Oo0<T, R> {
    <V> C0125o00O0Oo0<T, V> andThen(Function<? super R, ? extends V> function);

    oOO00O<T> andThen(Consumer<? super R> consumer);

    R apply(T t) throws IOException;

    <V> C0125o00O0Oo0<V, R> compose(Function<? super V, ? extends T> function);

    C0124o00O0Oo<R> i1LIL11l(C0124o00O0Oo<? extends T> o00o0oo);

    oOO00O<T> iiI1L1iI(oOO00O<? super R> ooo00o);

    <V> C0125o00O0Oo0<V, R> iiIliillii(C0125o00O0Oo0<? super V, ? extends T> o00o0oo0);

    <V> C0125o00O0Oo0<T, V> il1LilLllii(C0125o00O0Oo0<? super R, ? extends V> o00o0oo0);

    C0124o00O0Oo<R> illlI1lLIL(Supplier<? extends T> supplier);
}
