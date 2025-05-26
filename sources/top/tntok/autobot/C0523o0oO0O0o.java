package top.tntok.autobot;

import java.nio.file.Path;
import java.util.function.Function;

/* renamed from: top.tntok.autobot.o0oO0O0o  reason: case insensitive filesystem */
public final /* synthetic */ class C0523o0oO0O0o implements Function {
    public final /* synthetic */ Path iiI1L1iI;

    public /* synthetic */ C0523o0oO0O0o(Path path) {
        this.iiI1L1iI = path;
    }

    public final Object apply(Object obj) {
        return this.iiI1L1iI.relativize((Path) obj);
    }
}
