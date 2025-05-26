package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

public class o0OO00OO extends IiIIlIL implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> delegate;

    public o0OO00OO(Comparator<File> comparator) {
        if (comparator != null) {
            this.delegate = comparator;
            return;
        }
        throw new IllegalArgumentException("Delegate comparator is missing");
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }

    public String toString() {
        return super.toString() + "[" + this.delegate.toString() + "]";
    }
}
