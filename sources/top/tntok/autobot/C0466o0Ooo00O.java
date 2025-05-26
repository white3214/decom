package top.tntok.autobot;

import android.os.Build;
import android.os.HandlerThread;
import android.os.MessageQueue;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* renamed from: top.tntok.autobot.o0Ooo00O  reason: case insensitive filesystem */
public final class C0466o0Ooo00O {
    public static final int I11lLL1 = 12;
    public static final int IiIIlIL = 4380;
    public static final short iLLLILIiLi1Ii = 6;
    public static final int iiIliillii = 6;
    public static final /* synthetic */ boolean iilLiIIIi11i = false;
    public static final int iilLil1i11I1 = 11;
    public final ByteBuffer i1LIL11l = ByteBuffer.allocate(IiIIlIL).order(ByteOrder.nativeOrder());
    public final ArrayMap<Integer, FileDescriptor> iiI1L1iI = new ArrayMap<>();
    public final MessageQueue il1LilLllii;
    public final C0014OooOOo0 illlI1lLIL;

    public C0466o0Ooo00O(C0014OooOOo0 oooOOo0) {
        this.illlI1lLIL = oooOOo0;
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread(C0387o0OOoO0o.iiI1L1iI("zw/zUdcZLpX9Iug=\n", "mkeaNZp4QPQ=\n"));
            handlerThread.start();
            this.il1LilLllii = handlerThread.getLooper().getQueue();
            return;
        }
        this.il1LilLllii = null;
    }

    public static byte[] I11lLL1(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4099) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("6GNc6N3GKlLVaB/P+fJmWNR5T/LE\n", "oQ0/h7C2Rjc=\n"));
            return null;
        }
        int i = byteBuffer.getShort(byteBuffer.position() + 4096) & 65535;
        if (i > 4096) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("ngCQP/tdQICjTrsZzQ9KlqMehiSpXEyZslTT\n", "127zUIkvJeM=\n") + i);
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static byte[] i1LIL11l(int i, int i2, String str, byte[] bArr) {
        byte[] bArr2 = new byte[256];
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 280).order(ByteOrder.nativeOrder());
        order.putInt(11);
        if (str.isEmpty()) {
            str = C0387o0OOoO0o.iiI1L1iI("hQYdfTrH\n", "9mVvHkq+X2k=\n");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int iiI1L1iI2 = C0390o0OOoOo.iiI1L1iI(bytes, 127);
        order.put(bytes, 0, iiI1L1iI2);
        order.put(bArr2, 0, 256 - iiI1L1iI2);
        order.putShort((short) bArr.length);
        order.putShort(6);
        order.putInt(i);
        order.putInt(i2);
        order.putInt(0);
        order.putInt(0);
        order.put(bArr);
        return order.array();
    }

    public static void iiIliillii(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e) {
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("e7s54bYIlAtS+jPhvB/RX0iyOenpTA==\n", "PdpQjdNstH8=\n") + e.getMessage());
        }
    }

    public static byte[] illlI1lLIL(byte[] bArr) {
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 6).order(ByteOrder.nativeOrder());
        order.putInt(12);
        order.putShort((short) bArr.length);
        order.put(bArr);
        return order.array();
    }

    public void IiIIlIL(int i, int i2, int i3, String str, byte[] bArr) throws IOException {
        FileDescriptor open;
        try {
            open = Os.open(C0387o0OOoO0o.iiI1L1iI("iBcouurWZYzD\n", "p3NNzMWjDeU=\n"), OsConstants.O_RDWR, 0);
            FileDescriptor put = this.iiI1L1iI.put(Integer.valueOf(i), open);
            if (put != null) {
                C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("DaV0NJulgk4s8FEQu4LDUy3qJA==\n", "SdAEWPLG4zo=\n") + i);
                iiIliillii(put);
            }
            byte[] i1LIL11l2 = i1LIL11l(i2, i3, str, bArr);
            Os.write(open, i1LIL11l2, 0, i1LIL11l2.length);
            iilLiIIIi11i(i, open);
        } catch (Exception e) {
            iiIliillii(open);
            throw e;
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    public final void IiiL1llIIi(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.il1LilLllii.removeOnFileDescriptorEventListener(fileDescriptor);
        }
    }

    public void iILiI1lll(int i, byte[] bArr) throws IOException {
        FileDescriptor fileDescriptor = this.iiI1L1iI.get(Integer.valueOf(i));
        if (fileDescriptor == null) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("wIOyxdHbTRLApZDvnsVHCLU=\n", "le3Zq76sIzI=\n") + i);
            return;
        }
        try {
            byte[] illlI1lLIL2 = illlI1lLIL(bArr);
            Os.write(fileDescriptor, illlI1lLIL2, 0, illlI1lLIL2.length);
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    public final /* synthetic */ int iLLLILIiLi1Ii(int i, FileDescriptor fileDescriptor, int i2) {
        byte[] I11lLL12;
        try {
            this.i1LIL11l.clear();
            int read = Os.read(fileDescriptor, this.i1LIL11l);
            this.i1LIL11l.flip();
            if (read > 0 && this.i1LIL11l.getInt() == 6 && (I11lLL12 = I11lLL1(this.i1LIL11l)) != null) {
                this.illlI1lLIL.iiIliillii(OooOOOO.illlI1lLIL(i, I11lLL12));
            }
            return i2;
        } catch (ErrnoException | InterruptedIOException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("JkFP3Q3T62sPAFTUCdPrSihpYpEHwr9vFVQ=\n", "YCAmsWi3yx8=\n"), e);
            return 0;
        }
    }

    public final void iilLiIIIi11i(int i, FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.il1LilLllii.addOnFileDescriptorEventListener(fileDescriptor, 1, new C0464o0Ooo00(this, i));
        }
    }

    public void iilLil1i11I1() {
        for (FileDescriptor iiIliillii2 : this.iiI1L1iI.values()) {
            iiIliillii(iiIliillii2);
        }
    }

    public void il1LilLllii(int i) {
        FileDescriptor remove = this.iiI1L1iI.remove(Integer.valueOf(i));
        if (remove != null) {
            IiiL1llIIi(remove);
            iiIliillii(remove);
            return;
        }
        C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("3jJgDA5fdavoMGQRCEZ8q8gWRjtHVXf99D1qRUc=\n", "nV4Pf2cxEos=\n") + i);
    }
}
