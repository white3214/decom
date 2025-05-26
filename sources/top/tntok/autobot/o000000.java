package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;

public class o000000 implements Serializable {
    public static final o000000[] i1LIL11l = new o000000[0];
    private static final long serialVersionUID = -2505664948818681153L;
    private o000000[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private long lastModified;
    private long length;
    private String name;
    private final o000000 parent;

    public o000000(File file2) {
        this((o000000) null, file2);
    }

    public o000000 I11lLL1() {
        return this.parent;
    }

    public void I1iIiIi(boolean z) {
        this.directory = z;
    }

    public void IL1lILLLL1L(long j) {
        this.lastModified = j;
    }

    public boolean IiIIlIL() {
        return this.exists;
    }

    public boolean IiiL1llIIi(File file2) {
        boolean z;
        long j;
        boolean z2 = this.exists;
        long j2 = this.lastModified;
        boolean z3 = this.directory;
        long j3 = this.length;
        this.name = file2.getName();
        boolean exists2 = file2.exists();
        this.exists = exists2;
        if (!exists2 || !file2.isDirectory()) {
            z = false;
        } else {
            z = true;
        }
        this.directory = z;
        long j4 = 0;
        if (this.exists) {
            j = file2.lastModified();
        } else {
            j = 0;
        }
        this.lastModified = j;
        if (this.exists && !this.directory) {
            j4 = file2.length();
        }
        this.length = j4;
        if (this.exists == z2 && this.lastModified == j2 && this.directory == z3 && j4 == j3) {
            return false;
        }
        return true;
    }

    public void i111iLiiIIill(String str) {
        this.name = str;
    }

    public void i1L1lLllLLlIi(boolean z) {
        this.exists = z;
    }

    public File i1LIL11l() {
        return this.file;
    }

    public void iILiI1lll(o000000... o000000Arr) {
        this.children = o000000Arr;
    }

    public void iL1LIlIlI(long j) {
        this.length = j;
    }

    public boolean iLLLILIiLi1Ii() {
        return this.directory;
    }

    public o000000[] iiI1L1iI() {
        o000000[] o000000Arr = this.children;
        if (o000000Arr != null) {
            return o000000Arr;
        }
        return i1LIL11l;
    }

    public int iiIliillii() {
        o000000 o000000 = this.parent;
        if (o000000 == null) {
            return 0;
        }
        return o000000.iiIliillii() + 1;
    }

    public o000000 iilLiIIIi11i(File file2) {
        return new o000000(this, file2);
    }

    public String iilLil1i11I1() {
        return this.name;
    }

    public long il1LilLllii() {
        return this.length;
    }

    public long illlI1lLIL() {
        return this.lastModified;
    }

    public o000000(o000000 o000000, File file2) {
        if (file2 != null) {
            this.file = file2;
            this.parent = o000000;
            this.name = file2.getName();
            return;
        }
        throw new IllegalArgumentException("File is missing");
    }
}
