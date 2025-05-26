package top.tntok.autobot;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: top.tntok.autobot.OoooO0O  reason: case insensitive filesystem */
public class C0038OoooO0O {
    public static int I11lLL1(byte[] bArr, int i) {
        return (bArr[i] & i1IL1lILl1L1I.iiI1L1iI) + ((bArr[i + 1] & i1IL1lILl1L1I.iiI1L1iI) << 8) + ((bArr[i + 2] & i1IL1lILl1L1I.iiI1L1iI) << 16) + ((bArr[i + 3] & i1IL1lILl1L1I.iiI1L1iI) << 24);
    }

    public static void I1I11Il1(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j & 255)));
        outputStream.write((byte) ((int) ((j >> 8) & 255)));
        outputStream.write((byte) ((int) ((j >> 16) & 255)));
        outputStream.write((byte) ((int) ((j >> 24) & 255)));
        outputStream.write((byte) ((int) ((j >> 32) & 255)));
        outputStream.write((byte) ((int) ((j >> 40) & 255)));
        outputStream.write((byte) ((int) ((j >> 48) & 255)));
        outputStream.write((byte) ((int) ((j >> 56) & 255)));
    }

    public static long I1iIiIi(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & i1IL1lILl1L1I.iiI1L1iI)) << 24) + (((long) ((bArr[i] & i1IL1lILl1L1I.iiI1L1iI) + ((bArr[i + 1] & i1IL1lILl1L1I.iiI1L1iI) << 8) + ((bArr[i + 2] & i1IL1lILl1L1I.iiI1L1iI) << 16))) & 4294967295L);
    }

    public static short I1l1iIll1lIi1(short s) {
        return (short) (((s & 255) << 8) + ((s >> 8) & 255));
    }

    public static void IIlL1llI1(OutputStream outputStream, short s) throws IOException {
        outputStream.write((byte) (s & 255));
        outputStream.write((byte) ((s >> 8) & 255));
    }

    public static void IL111l1(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static int IL1lILLLL1L(byte[] bArr, int i) {
        return (bArr[i] & i1IL1lILl1L1I.iiI1L1iI) + ((bArr[i + 1] & i1IL1lILl1L1I.iiI1L1iI) << 8);
    }

    public static void ILl1iII11Ll1(byte[] bArr, int i, double d) {
        i1iI1iiLL1(bArr, i, Double.doubleToLongBits(d));
    }

    public static int Ii1liIIIiLi(int i) {
        return ((i & 255) << 24) + (((i >> 8) & 255) << 16) + (((i >> 16) & 255) << 8) + ((i >> 24) & 255);
    }

    public static long IiIIlIL(byte[] bArr, int i) {
        return (((long) I11lLL1(bArr, i + 4)) << 32) + (((long) I11lLL1(bArr, i)) & 4294967295L);
    }

    public static short IiiL1llIIi(byte[] bArr, int i) {
        return (short) ((bArr[i] & i1IL1lILl1L1I.iiI1L1iI) + ((bArr[i + 1] & i1IL1lILl1L1I.iiI1L1iI) << 8));
    }

    public static long IilL11ii1I1Il(long j) {
        return ((j & 255) << 56) + (((j >> 8) & 255) << 48) + (((j >> 16) & 255) << 40) + (((j >> 24) & 255) << 32) + (((j >> 32) & 255) << 24) + (((j >> 40) & 255) << 16) + (((j >> 48) & 255) << 8) + ((j >> 56) & 255);
    }

    public static void IliiLiLliIl(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static float i111iLiiIIill(float f) {
        return Float.intBitsToFloat(Ii1liIIIiLi(Float.floatToIntBits(f)));
    }

    public static void i11liIIl11Ii1(byte[] bArr, int i, float f) {
        IliiLiLliIl(bArr, i, Float.floatToIntBits(f));
    }

    public static int i1L1lLllLLlIi(InputStream inputStream) throws IOException {
        return (iiI1L1iI(inputStream) & 255) + ((iiI1L1iI(inputStream) & 255) << 8);
    }

    public static double i1LIL11l(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(iLLLILIiLi1Ii(inputStream));
    }

    public static void i1iI1iiLL1(byte[] bArr, int i, long j) {
        bArr[i] = (byte) ((int) (j & 255));
        bArr[i + 1] = (byte) ((int) ((j >> 8) & 255));
        bArr[i + 2] = (byte) ((int) ((j >> 16) & 255));
        bArr[i + 3] = (byte) ((int) ((j >> 24) & 255));
        bArr[i + 4] = (byte) ((int) ((j >> 32) & 255));
        bArr[i + 5] = (byte) ((int) ((j >> 40) & 255));
        bArr[i + 6] = (byte) ((int) ((j >> 48) & 255));
        bArr[i + 7] = (byte) ((int) ((j >> 56) & 255));
    }

    public static void i1iiLIil1ILi(OutputStream outputStream, float f) throws IOException {
        iiiiI1iILL11I(outputStream, Float.floatToIntBits(f));
    }

    public static long iILiI1lll(InputStream inputStream) throws IOException {
        return (((long) (iiI1L1iI(inputStream) & 255)) << 24) + (((long) ((iiI1L1iI(inputStream) & 255) + ((iiI1L1iI(inputStream) & 255) << 8) + ((iiI1L1iI(inputStream) & 255) << 16))) & 4294967295L);
    }

    public static double iL1LIlIlI(double d) {
        return Double.longBitsToDouble(IilL11ii1I1Il(Double.doubleToLongBits(d)));
    }

    public static long iLLLILIiLi1Ii(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) iiI1L1iI(inputStream);
        }
        return IiIIlIL(bArr, 0);
    }

    public static int iiI1L1iI(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static float iiIliillii(byte[] bArr, int i) {
        return Float.intBitsToFloat(I11lLL1(bArr, i));
    }

    public static void iiLIIiIli(OutputStream outputStream, double d) throws IOException {
        I1I11Il1(outputStream, Double.doubleToLongBits(d));
    }

    public static void iiiiI1iILL11I(OutputStream outputStream, int i) throws IOException {
        outputStream.write((byte) (i & 255));
        outputStream.write((byte) ((i >> 8) & 255));
        outputStream.write((byte) ((i >> 16) & 255));
        outputStream.write((byte) ((i >> 24) & 255));
    }

    public static short iilLiIIIi11i(InputStream inputStream) throws IOException {
        return (short) ((iiI1L1iI(inputStream) & 255) + ((iiI1L1iI(inputStream) & 255) << 8));
    }

    public static int iilLil1i11I1(InputStream inputStream) throws IOException {
        return (iiI1L1iI(inputStream) & 255) + ((iiI1L1iI(inputStream) & 255) << 8) + ((iiI1L1iI(inputStream) & 255) << 16) + ((iiI1L1iI(inputStream) & 255) << 24);
    }

    public static float il1LilLllii(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(iilLil1i11I1(inputStream));
    }

    public static double illlI1lLIL(byte[] bArr, int i) {
        return Double.longBitsToDouble(IiIIlIL(bArr, i));
    }
}
