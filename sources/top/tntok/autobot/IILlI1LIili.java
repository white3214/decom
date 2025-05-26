package top.tntok.autobot;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import top.tntok.autobot.ILL1lL1lI;

public class IILlI1LIili extends IiIlLLLI1L1 {
    public final boolean il1LilLllii;
    public final String[] illlI1lLIL;

    public IILlI1LIili(ILL1lL1lI.iLLLILIiLi1Ii illliliili1ii, ILi1lIlLliLI[] iLi1lIlLliLIArr, String... strArr) {
        super(illliliili1ii);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : IiIlLLLI1L1.i1LIL11l;
        Arrays.sort(strArr2);
        this.illlI1lLIL = strArr2;
        this.il1LilLllii = C0372o0OOo00.iiI1L1iI(iLi1lIlLliLIArr);
    }

    public static IiIlLLLI1L1 iiIliillii() {
        return new IILlI1LIili(ILL1lL1lI.i1LIL11l(), new String[0]);
    }

    public static IiIlLLLI1L1 iilLil1i11I1() {
        return new IILlI1LIili(ILL1lL1lI.il1LilLllii(), new String[0]);
    }

    public final boolean I11lLL1(Path path) {
        if (Arrays.binarySearch(this.illlI1lLIL, Objects.toString(path.getFileName(), (String) null)) < 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IILlI1LIili iILlI1LIili = (IILlI1LIili) obj;
        if (this.il1LilLllii != iILlI1LIili.il1LilLllii || !Arrays.equals(this.illlI1lLIL, iILlI1LIili.illlI1lLIL)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.illlI1lLIL)) * 31) + Objects.hash(new Object[]{Boolean.valueOf(this.il1LilLllii)});
    }

    public FileVisitResult iLLLILIiLi1Ii(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        super.preVisitDirectory(path, basicFileAttributes);
        if (I11lLL1(path)) {
            return FileVisitResult.CONTINUE;
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    public FileVisitResult il1LilLllii(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (I11lLL1(path)) {
            if (Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                if (this.il1LilLllii) {
                    C0331o0O0oo0o.i1iI1iiLL1(path, false, LinkOption.NOFOLLOW_LINKS);
                }
                boolean unused = Files.deleteIfExists(path);
            }
        }
        illlI1lLIL(path, basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return iLLLILIiLi1Ii(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return il1LilLllii(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }

    public IILlI1LIili(ILL1lL1lI.iLLLILIiLi1Ii illliliili1ii, String... strArr) {
        this(illliliili1ii, C0331o0O0oo0o.iiI1L1iI, strArr);
    }
}
