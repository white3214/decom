package top.tntok.autobot;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import top.tntok.autobot.ILL1lL1lI;

/* renamed from: top.tntok.autobot.o0O0oo0o  reason: case insensitive filesystem */
public final class C0331o0O0oo0o {
    public static final FileVisitOption[] i1LIL11l = new FileVisitOption[0];
    public static final ILi1lIlLliLI[] iiI1L1iI = new ILi1lIlLliLI[0];
    public static final OpenOption[] il1LilLllii = new OpenOption[0];
    public static final LinkOption[] illlI1lLIL = new LinkOption[0];

    /* renamed from: top.tntok.autobot.o0O0oo0o$i1LIL11l */
    public static class i1LIL11l {
        public final List<Path> i1LIL11l;
        public final boolean iiI1L1iI;
        public final List<Path> illlI1lLIL;

        public i1LIL11l(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
            List<Path> list;
            boolean z = true;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.iiI1L1iI = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.iiI1L1iI = false;
                } else {
                    boolean iiI1L1iI2 = Files.exists(path, linkOptionArr);
                    boolean iiI1L1iI3 = Files.exists(path2, linkOptionArr);
                    if (!iiI1L1iI2 || !iiI1L1iI3) {
                        this.iiI1L1iI = (iiI1L1iI2 || iiI1L1iI3) ? false : z;
                    } else {
                        i111iLiiIIill iiI1L1iI4 = C0331o0O0oo0o.i1LIL11l(path, i, fileVisitOptionArr);
                        i111iLiiIIill iiI1L1iI5 = C0331o0O0oo0o.i1LIL11l(path2, i, fileVisitOptionArr);
                        if (iiI1L1iI4.I11lLL1().size() != iiI1L1iI5.I11lLL1().size() || iiI1L1iI4.iLLLILIiLi1Ii().size() != iiI1L1iI5.iLLLILIiLi1Ii().size()) {
                            this.iiI1L1iI = false;
                        } else if (!iiI1L1iI4.IiIIlIL(path, true, (Comparator<? super Path>) null).equals(iiI1L1iI5.IiIIlIL(path2, true, (Comparator<? super Path>) null))) {
                            this.iiI1L1iI = false;
                        } else {
                            List<Path> iilLiIIIi11i = iiI1L1iI4.iilLiIIIi11i(path, true, (Comparator<? super Path>) null);
                            List<Path> iilLiIIIi11i2 = iiI1L1iI5.iilLiIIIi11i(path2, true, (Comparator<? super Path>) null);
                            this.iiI1L1iI = iilLiIIIi11i.equals(iilLiIIIi11i2);
                            List<Path> list3 = iilLiIIIi11i2;
                            list2 = iilLiIIIi11i;
                            list = list3;
                            this.i1LIL11l = list2;
                            this.illlI1lLIL = list;
                        }
                    }
                }
            }
            list = null;
            this.i1LIL11l = list2;
            this.illlI1lLIL = list;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r1.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.file.Path I11lLL1(java.net.URL r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
        /*
            java.io.InputStream r0 = r1.openStream()
            java.lang.String r1 = r1.getFile()     // Catch:{ all -> 0x0015 }
            java.nio.file.Path r1 = r2.resolve(r1)     // Catch:{ all -> 0x0015 }
            long unused = java.nio.file.Files.copy(r0, r1, r3)     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0014
            r0.close()
        L_0x0014:
            return r2
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            if (r0 == 0) goto L_0x0022
            r0.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r3 = move-exception
            r1.addSuppressed(r3)
        L_0x0022:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0331o0O0oo0o.I11lLL1(java.net.URL, java.nio.file.Path, java.nio.file.CopyOption[]):java.nio.file.Path");
    }

    public static List<Path> I1I11Il1(Collection<Path> collection, Path path, boolean z, Comparator<? super Path> comparator) {
        Stream iiI1L1iI2 = collection.stream();
        path.getClass();
        Stream iiI1L1iI3 = iiI1L1iI2.map(new C0523o0oO0O0o(path));
        if (z) {
            if (comparator == null) {
                iiI1L1iI3 = iiI1L1iI3.sorted();
            } else {
                iiI1L1iI3 = iiI1L1iI3.sorted(comparator);
            }
        }
        return (List) iiI1L1iI3.collect(Collectors.toList());
    }

    public static <T extends FileVisitor<? super Path>> T I1IIIi1i1ILl(T t, Path path) throws IOException {
        Path unused = Files.walkFileTree(path, t);
        return t;
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii I1iIiIi(Path path, ILi1lIlLliLI... iLi1lIlLliLIArr) throws IOException {
        return ((OooO00o) I1IIIi1i1ILl(new OooO00o(ILL1lL1lI.il1LilLllii(), iLi1lIlLliLIArr, new String[0]), path)).iiI1L1iI();
    }

    public static boolean I1l1iIll1lIi1(Path path, Path path2) throws IOException {
        return iiLIIiIli(path, path2, illlI1lLIL, il1LilLllii);
    }

    public static Set<FileVisitOption> IIlL1llI1(FileVisitOption... fileVisitOptionArr) {
        if (fileVisitOptionArr == null) {
            return EnumSet.noneOf(o0O000.iiI1L1iI());
        }
        return (Set) Arrays.stream(fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static <T extends FileVisitor<? super Path>> T IL111l1(T t, String str, String... strArr) throws IOException {
        return I1IIIi1i1ILl(t, Paths.get(str, strArr));
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii IL1lILLLL1L(Path path, ILi1lIlLliLI... iLi1lIlLliLIArr) throws IOException {
        long j;
        if (!Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            ILL1lL1lI.iLLLILIiLi1Ii il1LilLllii2 = ILL1lL1lI.il1LilLllii();
            boolean iiI1L1iI2 = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if (iiI1L1iI2) {
                j = Files.size(path);
            } else {
                j = 0;
            }
            if (IliiLiLliIl(iLi1lIlLliLIArr) && iiI1L1iI2) {
                i1iI1iiLL1(path, false, LinkOption.NOFOLLOW_LINKS);
            }
            if (Files.deleteIfExists(path)) {
                il1LilLllii2.iiI1L1iI().iiI1L1iI();
                il1LilLllii2.illlI1lLIL().il1LilLllii(j);
            }
            return il1LilLllii2;
        }
        C0285o0O00OoO.iiI1L1iI();
        throw C0524o0oO0Ooo.iiI1L1iI(path.toString());
    }

    public static List<AclEntry> ILl1iII11Ll1(Path path) throws IOException {
        AclFileAttributeView iiI1L1iI2 = C0287o0O00o.iiI1L1iI(Files.getFileAttributeView(path, C0289o0O00o0O.iiI1L1iI(), new LinkOption[0]));
        if (iiI1L1iI2 == null) {
            return null;
        }
        return iiI1L1iI2.getAcl();
    }

    public static boolean Ii1liIIIiLi(Path path, Path path2) throws IOException {
        return IilL11ii1I1Il(path, path2, Integer.MAX_VALUE, illlI1lLIL, i1LIL11l);
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii IiIIlIL(Path path) throws IOException {
        return ((IiIlLLLI1L1) I1IIIi1i1ILl(new IiIlLLLI1L1(ILL1lL1lI.il1LilLllii()), path)).iiI1L1iI();
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii IiiL1llIIi(Path path, ILi1lIlLliLI... iLi1lIlLliLIArr) throws IOException {
        if (Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            return I1iIiIi(path, iLi1lIlLliLIArr);
        }
        return IL1lILLLL1L(path, iLi1lIlLliLIArr);
    }

    public static boolean IilL11ii1I1Il(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new i1LIL11l(path, path2, i, linkOptionArr, fileVisitOptionArr).iiI1L1iI;
    }

    public static <T extends FileVisitor<? super Path>> T IilliIIIlI1ll(T t, Path path, Set<FileVisitOption> set, int i) throws IOException {
        Path unused = Files.walkFileTree(path, set, i, t);
        return t;
    }

    public static boolean IliiLiLliIl(ILi1lIlLliLI[] iLi1lIlLliLIArr) {
        if (iLi1lIlLliLIArr == null) {
            return false;
        }
        for (C0372o0OOo00 o0ooo00 : iLi1lIlLliLIArr) {
            if (o0ooo00 == C0372o0OOo00.OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }

    public static boolean i111iLiiIIill(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        boolean z;
        boolean z2;
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null) {
            z = true;
        } else {
            z = false;
        }
        if (path2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (!Files.exists(path, new LinkOption[0]) && !Files.exists(path2, new LinkOption[0])) {
            return true;
        }
        i1LIL11l i1lil11l = new i1LIL11l(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!i1lil11l.iiI1L1iI) {
            return false;
        }
        List<Path> list = i1lil11l.i1LIL11l;
        List<Path> list2 = i1lil11l.illlI1lLIL;
        for (Path iiI1L1iI2 : list) {
            Path iiI1L1iI3 = iL1LIlIlI.iiI1L1iI(iiI1L1iI2);
            if (Collections.binarySearch(list2, iiI1L1iI3) <= -1) {
                throw new IllegalStateException("Unexpected mismatch.");
            } else if (!iiLIIiIli(path.resolve(iiI1L1iI3), path2.resolve(iiI1L1iI3), linkOptionArr, openOptionArr)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r2 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        top.tntok.autobot.C0545o0ooOoOO.iiI1L1iI(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i11liIIl11Ii1(java.nio.file.Path r2) throws java.io.IOException {
        /*
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2)
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x001c }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0015
            if (r2 == 0) goto L_0x0013
            r2.close()
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            if (r2 == 0) goto L_0x001a
            r2.close()
        L_0x001a:
            r2 = 1
            return r2
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            r0.addSuppressed(r2)
        L_0x0029:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0331o0O0oo0o.i11liIIl11Ii1(java.nio.file.Path):boolean");
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii i1L1lLllLLlIi(Path path) throws IOException {
        return IL1lILLLL1L(path, iiI1L1iI);
    }

    public static i111iLiiIIill i1LIL11l(Path path, int i, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return (i111iLiiIIill) IilliIIIlI1ll(i111iLiiIIill.iILiI1lll(), path, IIlL1llI1(fileVisitOptionArr), i);
    }

    public static Path i1iI1iiLL1(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        DosFileAttributeView iiI1L1iI2 = C0279o00ooooO.iiI1L1iI(Files.getFileAttributeView(path, C0275o00oooOO.iiI1L1iI(), linkOptionArr));
        if (iiI1L1iI2 != null) {
            iiI1L1iI2.setReadOnly(z);
            return path;
        }
        PosixFileAttributeView iiI1L1iI3 = o0O00000.iiI1L1iI(Files.getFileAttributeView(path, o0.iiI1L1iI(), linkOptionArr));
        if (iiI1L1iI3 != null) {
            Set iiI1L1iI4 = iiI1L1iI3.readAttributes().permissions();
            iiI1L1iI4.remove(PosixFilePermission.OWNER_WRITE);
            iiI1L1iI4.remove(PosixFilePermission.GROUP_WRITE);
            iiI1L1iI4.remove(PosixFilePermission.OTHERS_WRITE);
            return Files.setPosixFilePermissions(path, iiI1L1iI4);
        }
        throw new IOException("No DosFileAttributeView or PosixFileAttributeView for " + path);
    }

    public static boolean i1iiLIil1ILi(Path path) throws IOException {
        if (Files.isDirectory(path, new LinkOption[0])) {
            return i11liIIl11Ii1(path);
        }
        return iiiiI1iILL11I(path);
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii iILiI1lll(Path path) throws IOException {
        return I1iIiIi(path, iiI1L1iI);
    }

    public static boolean iL1LIlIlI(Path path, Path path2) throws IOException {
        return i111iLiiIIill(path, path2, illlI1lLIL, il1LilLllii, i1LIL11l);
    }

    public static Path iLLLILIiLi1Ii(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        return Files.copy(path, path2.resolve(path.getFileName()), copyOptionArr);
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii iiIliillii(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        return ((ILI11Ili11L) I1IIIi1i1ILl(new ILI11Ili11L(ILL1lL1lI.il1LilLllii(), path, path2, copyOptionArr), path)).iiI1L1iI();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0069, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006a, code lost:
        if (r9 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r10.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0074, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0076, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0077, code lost:
        if (r8 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x007d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x007e, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0081, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean iiLIIiIli(java.nio.file.Path r8, java.nio.file.Path r9, java.nio.file.LinkOption[] r10, java.nio.file.OpenOption[] r11) throws java.io.IOException {
        /*
            r0 = 1
            if (r8 != 0) goto L_0x0006
            if (r9 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r8 != 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r9 != 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0015
            return r1
        L_0x0015:
            java.nio.file.Path r2 = r8.normalize()
            java.nio.file.Path r3 = r9.normalize()
            boolean r4 = java.nio.file.Files.exists(r2, r10)
            boolean r5 = java.nio.file.Files.exists(r3, r10)
            if (r4 == r5) goto L_0x0028
            return r1
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r0
        L_0x002b:
            boolean r4 = java.nio.file.Files.isDirectory(r2, r10)
            java.lang.String r5 = "Can't compare directories, only files: "
            if (r4 != 0) goto L_0x0097
            boolean r10 = java.nio.file.Files.isDirectory(r3, r10)
            if (r10 != 0) goto L_0x0082
            long r4 = java.nio.file.Files.size(r2)
            long r6 = java.nio.file.Files.size(r3)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0046
            return r1
        L_0x0046:
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x004d
            return r0
        L_0x004d:
            java.io.InputStream r8 = java.nio.file.Files.newInputStream(r2, r11)
            java.io.InputStream r9 = java.nio.file.Files.newInputStream(r3, r11)     // Catch:{ all -> 0x005f }
            boolean r10 = top.tntok.autobot.C0130o00O0o00.i11liIIl11Ii1(r8, r9)     // Catch:{ all -> 0x0067 }
            if (r9 == 0) goto L_0x0061
            r9.close()     // Catch:{ all -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r9 = move-exception
            goto L_0x0075
        L_0x0061:
            if (r8 == 0) goto L_0x0066
            r8.close()
        L_0x0066:
            return r10
        L_0x0067:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r11 = move-exception
            if (r9 == 0) goto L_0x0074
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch:{ all -> 0x005f }
        L_0x0074:
            throw r11     // Catch:{ all -> 0x005f }
        L_0x0075:
            throw r9     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r10 = move-exception
            if (r8 == 0) goto L_0x0081
            r8.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r8 = move-exception
            r9.addSuppressed(r8)
        L_0x0081:
            throw r10
        L_0x0082:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0097:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0331o0O0oo0o.iiLIIiIli(java.nio.file.Path, java.nio.file.Path, java.nio.file.LinkOption[], java.nio.file.OpenOption[]):boolean");
    }

    public static boolean iiiiI1iILL11I(Path path) throws IOException {
        if (Files.size(path) <= 0) {
            return true;
        }
        return false;
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii iilLiIIIi11i(Path path) throws IOException {
        return IiiL1llIIi(path, iiI1L1iI);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.file.Path iilLil1i11I1(java.net.URL r0, java.nio.file.Path r1, java.nio.file.CopyOption... r2) throws java.io.IOException {
        /*
            java.io.InputStream r0 = r0.openStream()
            long unused = java.nio.file.Files.copy(r0, r1, r2)     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000c
            r0.close()
        L_0x000c:
            return r1
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r2 = move-exception
            if (r0 == 0) goto L_0x001a
            r0.close()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x001a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0331o0O0oo0o.iilLil1i11I1(java.net.URL, java.nio.file.Path, java.nio.file.CopyOption[]):java.nio.file.Path");
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii il1LilLllii(Path path, ILi1lIlLliLI... iLi1lIlLliLIArr) throws IOException {
        return ((IILlI1LIili) I1IIIi1i1ILl(new IILlI1LIili(ILL1lL1lI.il1LilLllii(), iLi1lIlLliLIArr, new String[0]), path)).iiI1L1iI();
    }

    public static <T extends FileVisitor<? super Path>> T il1l1IlL(T t, URI uri) throws IOException {
        return I1IIIi1i1ILl(t, Paths.get(uri));
    }

    public static ILL1lL1lI.iLLLILIiLi1Ii illlI1lLIL(Path path) throws IOException {
        return il1LilLllii(path, iiI1L1iI);
    }
}
