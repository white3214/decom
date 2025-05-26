package top.tntok.autobot;

import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import top.tntok.autobot.Model.FileItem;

/* renamed from: top.tntok.autobot.o0000OoO  reason: case insensitive filesystem */
public class C0063o0000OoO {
    public static boolean i1LIL11l(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    i1LIL11l(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    public static boolean iiI1L1iI(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory()) {
            return i1LIL11l(file);
        }
        return false;
    }

    public static JSONArray illlI1lLIL(File file) throws Exception {
        long j;
        if (!file.exists()) {
            throw new Exception(C0387o0OOoO0o.iiI1L1iI("a3aukytLWmk0BJH6dVAnKBFI\n", "jeApd5D9v80=\n"));
        } else if (file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return new JSONArray(arrayList);
            }
            for (File file2 : listFiles) {
                String absolutePath = file2.getAbsolutePath();
                String name = file2.getName();
                boolean isFile = file2.isFile();
                boolean canRead = file2.canRead();
                boolean canWrite = file2.canWrite();
                boolean canExecute = file2.canExecute();
                long lastModified = file2.lastModified();
                if (file2.isFile()) {
                    j = file2.length();
                } else {
                    j = 0;
                }
                arrayList.add(new FileItem(absolutePath, name, isFile, canRead, canWrite, canExecute, lastModified, j));
            }
            return new JSONArray(new Gson().toJson((Object) arrayList));
        } else {
            throw new Exception(C0387o0OOoO0o.iiI1L1iI("UngKt+/ce18AORHWj/wxPQRaYs/5rQhfXmU9t8Py\n", "ut6LUmdLntg=\n"));
        }
    }
}
