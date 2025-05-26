package top.tntok.autobot;

import android.os.MessageQueue;
import java.io.FileDescriptor;

/* renamed from: top.tntok.autobot.o0Ooo00  reason: case insensitive filesystem */
public final /* synthetic */ class C0464o0Ooo00 implements MessageQueue.OnFileDescriptorEventListener {
    public final /* synthetic */ int i1LIL11l;
    public final /* synthetic */ C0466o0Ooo00O iiI1L1iI;

    public /* synthetic */ C0464o0Ooo00(C0466o0Ooo00O o0ooo00o, int i) {
        this.iiI1L1iI = o0ooo00o;
        this.i1LIL11l = i;
    }

    public final int onFileDescriptorEvents(FileDescriptor fileDescriptor, int i) {
        return this.iiI1L1iI.iLLLILIiLi1Ii(this.i1LIL11l, fileDescriptor, i);
    }
}
