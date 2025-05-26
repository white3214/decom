package top.tntok.autobot;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import top.tntok.autobot.ILL1lL1lI;

public class i111iLiiIIill extends IiIlLLLI1L1 {
    public final List<Path> il1LilLllii = new ArrayList();
    public final List<Path> illlI1lLIL = new ArrayList();

    public i111iLiiIIill(ILL1lL1lI.iLLLILIiLi1Ii illliliili1ii) {
        super(illliliili1ii);
    }

    public static i111iLiiIIill IiiL1llIIi() {
        return new i111iLiiIIill(ILL1lL1lI.i1LIL11l());
    }

    public static i111iLiiIIill iILiI1lll() {
        return new i111iLiiIIill(ILL1lL1lI.il1LilLllii());
    }

    public List<Path> I11lLL1() {
        return this.illlI1lLIL;
    }

    public List<Path> IiIIlIL(Path path, boolean z, Comparator<? super Path> comparator) {
        return C0331o0O0oo0o.I1I11Il1(I11lLL1(), path, z, comparator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof i111iLiiIIill)) {
            return false;
        }
        i111iLiiIIill i111iliiiiill = (i111iLiiIIill) obj;
        if (!Objects.equals(this.illlI1lLIL, i111iliiiiill.illlI1lLIL) || !Objects.equals(this.il1LilLllii, i111iliiiiill.il1LilLllii)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(new Object[]{this.illlI1lLIL, this.il1LilLllii});
    }

    public List<Path> iLLLILIiLi1Ii() {
        return this.il1LilLllii;
    }

    public List<Path> iilLiIIIi11i(Path path, boolean z, Comparator<? super Path> comparator) {
        return C0331o0O0oo0o.I1I11Il1(iLLLILIiLi1Ii(), path, z, comparator);
    }

    public FileVisitResult il1LilLllii(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        List<Path> list;
        if (Files.isDirectory(path, new LinkOption[0])) {
            list = this.illlI1lLIL;
        } else {
            list = this.il1LilLllii;
        }
        list.add(path.normalize());
        return super.il1LilLllii(path, basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
        return il1LilLllii(iL1LIlIlI.iiI1L1iI(obj), basicFileAttributes);
    }
}
