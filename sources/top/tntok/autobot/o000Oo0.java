package top.tntok.autobot;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class o000Oo0 extends Writer {
    public final Collection<Writer> i1LIL11l;
    public final Collection<Writer> illlI1lLIL;

    public o000Oo0(Collection<Writer> collection) {
        List emptyList = Collections.emptyList();
        this.i1LIL11l = emptyList;
        this.illlI1lLIL = collection == null ? emptyList : collection;
    }

    public void close() throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.close();
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public void flush() throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.flush();
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.write(cArr, i, i2);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i3, e));
                }
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public o000Oo0(Writer... writerArr) {
        List emptyList = Collections.emptyList();
        this.i1LIL11l = emptyList;
        this.illlI1lLIL = writerArr != null ? Arrays.asList(writerArr) : emptyList;
    }

    public Writer append(char c) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.append(c);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new o00O00OO(arrayList);
    }

    public void write(char[] cArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.write(cArr);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public Writer append(CharSequence charSequence) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.append(charSequence);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new o00O00OO(arrayList);
    }

    public void write(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.write(i);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i2, e));
                }
            }
            i2++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.append(charSequence, i, i2);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i3, e));
                }
            }
            i3++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new o00O00OO(arrayList);
    }

    public void write(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.write(str);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i, e));
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }

    public void write(String str, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Writer next : this.illlI1lLIL) {
            if (next != null) {
                try {
                    next.write(str, i, i2);
                } catch (IOException e) {
                    arrayList.add(new oo0oOO0(i3, e));
                }
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            throw new o00O00OO(arrayList);
        }
    }
}
