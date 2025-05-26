package top.tntok.autobot;

import java.io.File;

public abstract class iilLiIIIi11i implements o00O00o0 {
    public boolean accept(File file) {
        return accept(file.getParentFile(), file.getName());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public boolean accept(File file, String str) {
        return accept(new File(file, str));
    }
}
