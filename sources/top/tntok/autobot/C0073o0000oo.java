package top.tntok.autobot;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: top.tntok.autobot.o0000oo  reason: case insensitive filesystem */
public final class C0073o0000oo {
    public final FileChannel iiI1L1iI;

    public C0073o0000oo(FileChannel fileChannel) {
        this.iiI1L1iI = fileChannel;
    }

    public void i1LIL11l(long j, IiILIlLLiIL iiILIlLLiIL, long j2) throws IOException {
        if (j2 < 0 || j2 > iiILIlLLiIL.iLLi1LIi()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.iiI1L1iI.transferFrom(iiILIlLLiIL, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }

    public void iiI1L1iI(long j, IiILIlLLiIL iiILIlLLiIL, long j2) throws IOException {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.iiI1L1iI.transferTo(j, j2, iiILIlLLiIL);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
