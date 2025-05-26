package top.tntok.autobot;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Scanner;

public final class o00O000 {
    public static boolean i1LIL11l(Exception exc) {
        if (!(exc instanceof IOException) || !iiI1L1iI((IOException) exc)) {
            return false;
        }
        return true;
    }

    public static boolean iiI1L1iI(IOException iOException) {
        Throwable cause = iOException.getCause();
        if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EPIPE) {
            return false;
        }
        return true;
    }

    public static void iiIliillii(FileDescriptor fileDescriptor, ByteBuffer byteBuffer) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            while (byteBuffer.hasRemaining()) {
                il1LilLllii(fileDescriptor, byteBuffer);
            }
            return;
        }
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        while (remaining > 0) {
            int il1LilLllii = il1LilLllii(fileDescriptor, byteBuffer);
            remaining -= il1LilLllii;
            position += il1LilLllii;
            byteBuffer.position(position);
        }
    }

    public static void iilLil1i11I1(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2) throws IOException {
        iiIliillii(fileDescriptor, ByteBuffer.wrap(bArr, i, i2));
    }

    public static int il1LilLllii(FileDescriptor fileDescriptor, ByteBuffer byteBuffer) throws IOException {
        do {
            try {
                return Os.write(fileDescriptor, byteBuffer);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EINTR) {
                    throw new IOException(e);
                }
            }
        } while (e.errno != OsConstants.EINTR);
        throw new IOException(e);
    }

    public static String illlI1lLIL(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
            sb.append(10);
        }
        return sb.toString();
    }
}
