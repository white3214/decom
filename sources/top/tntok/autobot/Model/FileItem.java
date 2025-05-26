package top.tntok.autobot.Model;

public class FileItem {
    public final boolean isExecute;
    public final boolean isFile;
    public final boolean isRead;
    public final boolean isWrite;
    private final long lastModified;
    public final String name;
    public final String path;
    public final long size;

    public FileItem(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2) {
        this.path = str;
        this.name = str2;
        this.isFile = z;
        this.isRead = z2;
        this.isWrite = z3;
        this.isExecute = z4;
        this.lastModified = j;
        this.size = j2;
    }
}
