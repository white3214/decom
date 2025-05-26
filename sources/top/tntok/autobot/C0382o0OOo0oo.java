package top.tntok.autobot;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: top.tntok.autobot.o0OOo0oo  reason: case insensitive filesystem */
public class C0382o0OOo0oo extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder;

    public C0382o0OOo0oo() {
        this.builder = new StringBuilder();
    }

    public StringBuilder iiI1L1iI() {
        return this.builder;
    }

    public String toString() {
        return this.builder.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    public C0382o0OOo0oo(int i) {
        this.builder = new StringBuilder(i);
    }

    public Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    public C0382o0OOo0oo(StringBuilder sb) {
        this.builder = sb == null ? new StringBuilder() : sb;
    }

    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }
}
