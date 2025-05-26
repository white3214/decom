package top.tntok.autobot;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class iliI1lL1L extends IiIIlIL implements Serializable {
    public static final Comparator<?>[] i1LIL11l = new Comparator[0];
    public static final Comparator<?>[] illlI1lLIL = new Comparator[0];
    private static final long serialVersionUID = -2224170307287243428L;
    private final Comparator<File>[] delegates;

    public iliI1lL1L(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.delegates = (Comparator[]) illlI1lLIL;
            return;
        }
        Comparator<File>[] comparatorArr2 = (Comparator[]) new Comparator[comparatorArr.length];
        this.delegates = comparatorArr2;
        System.arraycopy(comparatorArr, 0, comparatorArr2, 0, comparatorArr.length);
    }

    public /* bridge */ /* synthetic */ File[] i1LIL11l(File[] fileArr) {
        return super.i1LIL11l(fileArr);
    }

    public /* bridge */ /* synthetic */ List iiI1L1iI(List list) {
        return super.iiI1L1iI(list);
    }

    /* renamed from: illlI1lLIL */
    public int compare(File file, File file2) {
        int i = 0;
        for (Comparator<File> compare : this.delegates) {
            i = compare.compare(file, file2);
            if (i != 0) {
                break;
            }
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i = 0; i < this.delegates.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.delegates[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public iliI1lL1L(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.delegates = (Comparator[]) illlI1lLIL;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Comparator<File> add : iterable) {
            arrayList.add(add);
        }
        this.delegates = (Comparator[]) arrayList.toArray(i1LIL11l);
    }
}
