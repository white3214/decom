package top.tntok.autobot;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import top.tntok.autobot.ILL1lL1lI;

public class IiIlLLLI1L1 extends C0362o0OOOo00 {
    public static final String[] i1LIL11l = new String[0];
    public final ILL1lL1lI.iLLLILIiLi1Ii iiI1L1iI;

    public IiIlLLLI1L1(ILL1lL1lI.iLLLILIiLi1Ii illliliili1ii) {
        Objects.requireNonNull(illliliili1ii, "pathCounter");
        this.iiI1L1iI = illliliili1ii;
    }

    public static IiIlLLLI1L1 iiIliillii() {
        return new IiIlLLLI1L1(ILL1lL1lI.i1LIL11l());
    }

    public static IiIlLLLI1L1 iilLil1i11I1() {
        return new IiIlLLLI1L1(ILL1lL1lI.il1LilLllii());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IiIlLLLI1L1)) {
            return false;
        }
        return Objects.equals(this.iiI1L1iI, ((IiIlLLLI1L1) obj).iiI1L1iI);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.iiI1L1iI});
    }

    public FileVisitResult i1LIL11l(Path path, IOException iOException) throws IOException {
        this.iiI1L1iI.i1LIL11l().iiI1L1iI();
        return FileVisitResult.CONTINUE;
    }

    public ILL1lL1lI.iLLLILIiLi1Ii iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public FileVisitResult il1LilLllii(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (Files.exists(path, new LinkOption[0])) {
            illlI1lLIL(path, basicFileAttributes);
        }
        return FileVisitResult.CONTINUE;
    }

    public void illlI1lLIL(Path path, BasicFileAttributes basicFileAttributes) {
        this.iiI1L1iI.iiI1L1iI().iiI1L1iI();
        this.iiI1L1iI.illlI1lLIL().il1LilLllii(basicFileAttributes.size());
    }

    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
        return i1LIL11l(iL1LIlIlI.iiI1L1iI(obj), iOException);
    }

    public String toString() {
        return this.iiI1L1iI.toString();
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return il1LilLllii(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }
}
