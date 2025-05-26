package top.tntok.autobot;

import java.io.File;
import java.io.IOException;

public class o000000O extends IOException {
    private static final long serialVersionUID = 1;

    public o000000O() {
    }

    public o000000O(String str) {
        super(str);
    }

    public o000000O(File file) {
        super("File " + file + " exists");
    }
}
