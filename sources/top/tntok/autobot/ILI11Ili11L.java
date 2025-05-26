package top.tntok.autobot;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;
import top.tntok.autobot.ILL1lL1lI;

public class ILI11Ili11L extends IiIlLLLI1L1 {
    public static final CopyOption[] iilLil1i11I1 = new CopyOption[0];
    public final Path iiIliillii;
    public final Path il1LilLllii;
    public final CopyOption[] illlI1lLIL;

    public ILI11Ili11L(ILL1lL1lI.iLLLILIiLi1Ii illliliili1ii, Path path, Path path2, CopyOption... copyOptionArr) {
        super(illliliili1ii);
        CopyOption[] copyOptionArr2;
        this.il1LilLllii = path;
        this.iiIliillii = path2;
        if (copyOptionArr == null) {
            copyOptionArr2 = iilLil1i11I1;
        } else {
            copyOptionArr2 = (CopyOption[]) copyOptionArr.clone();
        }
        this.illlI1lLIL = copyOptionArr2;
    }

    public void I11lLL1(Path path, Path path2) throws IOException {
        Path unused = Files.copy(path, path2, this.illlI1lLIL);
    }

    public Path IiIIlIL() {
        return this.il1LilLllii;
    }

    public FileVisitResult IiiL1llIIi(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path iiI1L1iI = this.iiIliillii.resolve(this.il1LilLllii.relativize(path));
        if (Files.notExists(iiI1L1iI, new LinkOption[0])) {
            Path unused = Files.createDirectory(iiI1L1iI, new FileAttribute[0]);
        }
        return super.preVisitDirectory(path, basicFileAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        ILI11Ili11L iLI11Ili11L = (ILI11Ili11L) obj;
        if (!Arrays.equals(this.illlI1lLIL, iLI11Ili11L.illlI1lLIL) || !Objects.equals(this.il1LilLllii, iLI11Ili11L.il1LilLllii) || !Objects.equals(this.iiIliillii, iLI11Ili11L.iiIliillii)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.illlI1lLIL)) * 31) + Objects.hash(new Object[]{this.il1LilLllii, this.iiIliillii});
    }

    public CopyOption[] iLLLILIiLi1Ii() {
        return (CopyOption[]) this.illlI1lLIL.clone();
    }

    public Path iilLiIIIi11i() {
        return this.iiIliillii;
    }

    public FileVisitResult il1LilLllii(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path iiI1L1iI = this.iiIliillii.resolve(this.il1LilLllii.relativize(path));
        I11lLL1(path, iiI1L1iI);
        return super.il1LilLllii(iiI1L1iI, basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return IiiL1llIIi(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return il1LilLllii(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }
}
