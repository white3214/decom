package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

@SuppressLint({"PrivateApi,BlockedPrivateApi,SoonBlockedPrivateApi,DiscouragedPrivateApi"})
/* renamed from: top.tntok.autobot.o0o00o  reason: case insensitive filesystem */
public final class C0510o0o00o {
    public static final Object i1LIL11l;
    public static final Class<?> iiI1L1iI;

    static {
        I11lLL1();
        try {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("0D78aUHLhL7QIOg1b8GU+cc57GJ6ypL10DQ=\n", "sVCYGy6i4JA=\n"));
            iiI1L1iI = cls;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance((Object[]) null);
            i1LIL11l = newInstance;
            Field declaredField = cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("spLbFRJOGrOAstoOFkIAvpW53AIBTw==\n", "wdGuZ2ArdMc=\n"));
            declaredField.setAccessible(true);
            declaredField.set((Object) null, newInstance);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void I11lLL1() {
        Looper.prepareMainLooper();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant,MissingPermission"})
    @android.annotation.TargetApi(30)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.AudioRecord i1LIL11l(int r22, int r23, int r24, int r25, int r26, int r27) throws top.tntok.autobot.ILiliIiI {
        /*
            java.lang.Class<android.os.Parcel> r1 = android.os.Parcel.class
            java.lang.Class<int[]> r2 = int[].class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r11 = 8
            r12 = 2
            r13 = 3
            r14 = 0
            r15 = 1
            java.lang.Class<android.media.AudioRecord> r0 = android.media.AudioRecord.class
            java.lang.Class r17 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x004c }
            java.lang.Class[] r4 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x004c }
            r4[r14] = r17     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Constructor r4 = r0.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x004c }
            r4.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            r18 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r18)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x004c }
            r5[r14] = r20     // Catch:{ Exception -> 0x004c }
            java.lang.Object r4 = r4.newInstance(r5)     // Catch:{ Exception -> 0x004c }
            android.media.AudioRecord r4 = (android.media.AudioRecord) r4     // Catch:{ Exception -> 0x004c }
            java.lang.String r5 = "euhMb2XE+sZ53Xp4a8L7\n"
            java.lang.String r6 = "F7opDAq2nq8=\n"
            java.lang.String r5 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r5, r6)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r5 = r0.getDeclaredField(r5)     // Catch:{ Exception -> 0x004c }
            r5.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x004c }
            r5.set(r4, r6)     // Catch:{ Exception -> 0x004c }
            android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x004c }
            if (r5 != 0) goto L_0x004f
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x004c }
            goto L_0x004f
        L_0x004c:
            r0 = move-exception
            goto L_0x03a8
        L_0x004f:
            java.lang.String r6 = "3GDfFWxOBuvYU9AIcUgJy95GwRlq\n"
            java.lang.String r7 = "sSmxfBgnZ4c=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r6 = r0.getDeclaredField(r6)     // Catch:{ Exception -> 0x004c }
            r6.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            r6.set(r4, r5)     // Catch:{ Exception -> 0x004c }
            android.media.AudioAttributes$Builder r5 = new android.media.AudioAttributes$Builder     // Catch:{ Exception -> 0x004c }
            r5.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.Class<android.media.AudioAttributes$Builder> r6 = android.media.AudioAttributes.Builder.class
            java.lang.String r7 = "2bnLVmH/BRzEvdNcbvsUG9i5721q+AUa\n"
            java.lang.String r8 = "qty/Hw+LYG4=\n"
            java.lang.String r7 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r7, r8)     // Catch:{ Exception -> 0x004c }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004c }
            java.lang.Class[] r9 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x004c }
            r9[r14] = r8     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r9)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x004c }
            r9[r14] = r7     // Catch:{ Exception -> 0x004c }
            r6.invoke(r5, r9)     // Catch:{ Exception -> 0x004c }
            android.media.AudioAttributes r5 = r5.build()     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = "kZhMbgQZ0sKIq1BoGAL2xQ==\n"
            java.lang.String r7 = "/Nk5Cm12k7Y=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r6 = r0.getDeclaredField(r6)     // Catch:{ Exception -> 0x004c }
            r6.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            r6.set(r4, r5)     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = "DRuhOMsqamINA4Y5wRlg\n"
            java.lang.String r7 = "bG7FUaR6CxA=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x004c }
            r7[r14] = r8     // Catch:{ Exception -> 0x004c }
            r7[r15] = r8     // Catch:{ Exception -> 0x004c }
            r7[r12] = r8     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x004c }
            r6.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x004c }
            r10[r14] = r7     // Catch:{ Exception -> 0x004c }
            r10[r15] = r9     // Catch:{ Exception -> 0x004c }
            r10[r12] = r21     // Catch:{ Exception -> 0x004c }
            r6.invoke(r4, r10)     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = "49dWL9iEWPjN+0sgwg==\n"
            java.lang.String r7 = "jpQ+TrbqPZQ=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r6 = r0.getDeclaredField(r6)     // Catch:{ Exception -> 0x004c }
            r6.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x004c }
            r6.set(r4, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = "CxNfKITq6sorMUQi\n"
            java.lang.String r7 = "ZlA3SeqEj6Y=\n"
            java.lang.String r6 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r6, r7)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r6 = r0.getDeclaredField(r6)     // Catch:{ Exception -> 0x004c }
            r6.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)     // Catch:{ Exception -> 0x004c }
            r6.set(r4, r7)     // Catch:{ Exception -> 0x004c }
            r6 = r23
            r7 = r24
            r9 = r27
            int r7 = android.media.AudioRecord.getMinBufferSize(r6, r7, r9)     // Catch:{ Exception -> 0x004c }
            int r7 = r7 * 8
            java.lang.String r9 = "8x17EUEm9aD0O3YCSyfoo/ED\n"
            java.lang.String r10 = "kmgfeC5kgMY=\n"
            java.lang.String r9 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r9, r10)     // Catch:{ Exception -> 0x004c }
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x004c }
            r10[r14] = r8     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r9 = r0.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x004c }
            r9.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x004c }
            r11[r14] = r10     // Catch:{ Exception -> 0x004c }
            r9.invoke(r4, r11)     // Catch:{ Exception -> 0x004c }
            int[] r6 = new int[]{r23}     // Catch:{ Exception -> 0x004c }
            int[] r9 = new int[]{r14}     // Catch:{ Exception -> 0x004c }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x004c }
            r11 = 31
            if (r10 >= r11) goto L_0x01b0
            java.lang.String r1 = "8bRxBjv6Tu/6oXAf\n"
            java.lang.String r10 = "n9UFb02fEZw=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r10)     // Catch:{ Exception -> 0x004c }
            r10 = 10
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x004c }
            r11[r14] = r3     // Catch:{ Exception -> 0x004c }
            r11[r15] = r3     // Catch:{ Exception -> 0x004c }
            r11[r12] = r2     // Catch:{ Exception -> 0x004c }
            r11[r13] = r8     // Catch:{ Exception -> 0x004c }
            r3 = 4
            r11[r3] = r8     // Catch:{ Exception -> 0x004c }
            r3 = 5
            r11[r3] = r8     // Catch:{ Exception -> 0x004c }
            r3 = 6
            r11[r3] = r8     // Catch:{ Exception -> 0x004c }
            r3 = 7
            r11[r3] = r2     // Catch:{ Exception -> 0x004c }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 8
            r11[r3] = r2     // Catch:{ Exception -> 0x004c }
            r2 = 9
            r11[r2] = r17     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r11)     // Catch:{ Exception -> 0x004c }
            r1.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x004c }
            r2.<init>(r4)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x004c }
            int r10 = r4.getAudioFormat()     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x004c }
            top.tntok.autobot.FakeContext r11 = top.tntok.autobot.FakeContext.iiI1L1iI()     // Catch:{ Exception -> 0x004c }
            java.lang.String r11 = r11.getOpPackageName()     // Catch:{ Exception -> 0x004c }
            java.lang.Long r16 = java.lang.Long.valueOf(r18)     // Catch:{ Exception -> 0x004c }
            r13 = 10
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x004c }
            r13[r14] = r2     // Catch:{ Exception -> 0x004c }
            r13[r15] = r5     // Catch:{ Exception -> 0x004c }
            r13[r12] = r6     // Catch:{ Exception -> 0x004c }
            r2 = 3
            r13[r2] = r3     // Catch:{ Exception -> 0x004c }
            r2 = 4
            r13[r2] = r8     // Catch:{ Exception -> 0x004c }
            r2 = 5
            r13[r2] = r10     // Catch:{ Exception -> 0x004c }
            r2 = 6
            r13[r2] = r7     // Catch:{ Exception -> 0x004c }
            r2 = 7
            r13[r2] = r9     // Catch:{ Exception -> 0x004c }
            r2 = 8
            r13[r2] = r11     // Catch:{ Exception -> 0x004c }
            r2 = 9
            r13[r2] = r16     // Catch:{ Exception -> 0x004c }
            java.lang.Object r1 = r1.invoke(r4, r13)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x004c }
            goto L_0x031b
        L_0x01b0:
            top.tntok.autobot.FakeContext r11 = top.tntok.autobot.FakeContext.iiI1L1iI()     // Catch:{ Exception -> 0x004c }
            android.content.AttributionSource r11 = r11.getAttributionSource()     // Catch:{ Exception -> 0x004c }
            java.lang.Class r13 = top.tntok.autobot.C0513o0o00o0O.iiI1L1iI()     // Catch:{ Exception -> 0x004c }
            java.lang.String r12 = "SKoVxEkoVdl5uDTEQzRjyUitIw==\n"
            java.lang.String r14 = "KdlGpyZYML0=\n"
            java.lang.String r12 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r12, r14)     // Catch:{ Exception -> 0x004c }
            r14 = 0
            java.lang.reflect.Method r12 = r13.getDeclaredMethod(r12, r14)     // Catch:{ Exception -> 0x004c }
            r12.setAccessible(r15)     // Catch:{ Exception -> 0x004c }
            java.lang.Object r11 = r12.invoke(r11, r14)     // Catch:{ Exception -> 0x004c }
            java.lang.AutoCloseable r11 = (java.lang.AutoCloseable) r11     // Catch:{ Exception -> 0x004c }
            java.lang.Class r12 = r11.getClass()     // Catch:{ all -> 0x027b }
            java.lang.String r13 = "k3qNiiix9VaY\n"
            java.lang.String r15 = "9B/52knDljM=\n"
            java.lang.String r13 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r13, r15)     // Catch:{ all -> 0x027b }
            java.lang.reflect.Method r12 = r12.getDeclaredMethod(r13, r14)     // Catch:{ all -> 0x027b }
            java.lang.Object r12 = r12.invoke(r11, r14)     // Catch:{ all -> 0x027b }
            android.os.Parcel r12 = (android.os.Parcel) r12     // Catch:{ all -> 0x027b }
            r13 = 34
            if (r10 >= r13) goto L_0x027f
            java.lang.String r10 = "vWaGzuTC19S2c4fX\n"
            java.lang.String r13 = "0wfyp5KniKc=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r13)     // Catch:{ all -> 0x027b }
            r13 = 11
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x027b }
            r13 = 0
            r14[r13] = r3     // Catch:{ all -> 0x027b }
            r13 = 1
            r14[r13] = r3     // Catch:{ all -> 0x027b }
            r3 = 2
            r14[r3] = r2     // Catch:{ all -> 0x027b }
            r3 = 3
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 4
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 5
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 6
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 7
            r14[r3] = r2     // Catch:{ all -> 0x027b }
            r2 = 8
            r14[r2] = r1     // Catch:{ all -> 0x027b }
            r1 = 9
            r14[r1] = r17     // Catch:{ all -> 0x027b }
            r1 = 10
            r14[r1] = r8     // Catch:{ all -> 0x027b }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r10, r14)     // Catch:{ all -> 0x027b }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ all -> 0x027b }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027b }
            r2.<init>(r4)     // Catch:{ all -> 0x027b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x027b }
            r8 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x027b }
            int r13 = r4.getAudioFormat()     // Catch:{ all -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x027b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x027b }
            java.lang.Long r14 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x027b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x027b }
            r8 = 11
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x027b }
            r16 = 0
            r8[r16] = r2     // Catch:{ all -> 0x027b }
            r2 = 1
            r8[r2] = r5     // Catch:{ all -> 0x027b }
            r2 = 2
            r8[r2] = r6     // Catch:{ all -> 0x027b }
            r2 = 3
            r8[r2] = r3     // Catch:{ all -> 0x027b }
            r2 = 4
            r8[r2] = r10     // Catch:{ all -> 0x027b }
            r2 = 5
            r8[r2] = r13     // Catch:{ all -> 0x027b }
            r2 = 6
            r8[r2] = r7     // Catch:{ all -> 0x027b }
            r2 = 7
            r8[r2] = r9     // Catch:{ all -> 0x027b }
            r2 = 8
            r8[r2] = r12     // Catch:{ all -> 0x027b }
            r2 = 9
            r8[r2] = r14     // Catch:{ all -> 0x027b }
            r2 = 10
            r8[r2] = r15     // Catch:{ all -> 0x027b }
            java.lang.Object r1 = r1.invoke(r4, r8)     // Catch:{ all -> 0x027b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x027b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x027b }
            goto L_0x0318
        L_0x027b:
            r0 = move-exception
            r1 = r0
            goto L_0x039c
        L_0x027f:
            java.lang.String r10 = "0JUcutEuRYHbgB2j\n"
            java.lang.String r13 = "vvRo06dLGvI=\n"
            java.lang.String r10 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r10, r13)     // Catch:{ all -> 0x027b }
            r13 = 12
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x027b }
            r13 = 0
            r14[r13] = r3     // Catch:{ all -> 0x027b }
            r13 = 1
            r14[r13] = r3     // Catch:{ all -> 0x027b }
            r3 = 2
            r14[r3] = r2     // Catch:{ all -> 0x027b }
            r3 = 3
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 4
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 5
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 6
            r14[r3] = r8     // Catch:{ all -> 0x027b }
            r3 = 7
            r14[r3] = r2     // Catch:{ all -> 0x027b }
            r2 = 8
            r14[r2] = r1     // Catch:{ all -> 0x027b }
            r1 = 9
            r14[r1] = r17     // Catch:{ all -> 0x027b }
            r1 = 10
            r14[r1] = r8     // Catch:{ all -> 0x027b }
            r1 = 11
            r14[r1] = r8     // Catch:{ all -> 0x027b }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r10, r14)     // Catch:{ all -> 0x027b }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ all -> 0x027b }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x027b }
            r2.<init>(r4)     // Catch:{ all -> 0x027b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x027b }
            r8 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x027b }
            int r13 = r4.getAudioFormat()     // Catch:{ all -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x027b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x027b }
            java.lang.Long r14 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x027b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x027b }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x027b }
            r8 = 12
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x027b }
            r16 = 0
            r8[r16] = r2     // Catch:{ all -> 0x027b }
            r2 = 1
            r8[r2] = r5     // Catch:{ all -> 0x027b }
            r2 = 2
            r8[r2] = r6     // Catch:{ all -> 0x027b }
            r2 = 3
            r8[r2] = r3     // Catch:{ all -> 0x027b }
            r2 = 4
            r8[r2] = r10     // Catch:{ all -> 0x027b }
            r2 = 5
            r8[r2] = r13     // Catch:{ all -> 0x027b }
            r2 = 6
            r8[r2] = r7     // Catch:{ all -> 0x027b }
            r2 = 7
            r8[r2] = r9     // Catch:{ all -> 0x027b }
            r2 = 8
            r8[r2] = r12     // Catch:{ all -> 0x027b }
            r2 = 9
            r8[r2] = r14     // Catch:{ all -> 0x027b }
            r2 = 10
            r8[r2] = r15     // Catch:{ all -> 0x027b }
            r2 = 11
            r8[r2] = r17     // Catch:{ all -> 0x027b }
            java.lang.Object r1 = r1.invoke(r4, r8)     // Catch:{ all -> 0x027b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x027b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x027b }
        L_0x0318:
            r11.close()     // Catch:{ Exception -> 0x004c }
        L_0x031b:
            if (r1 != 0) goto L_0x0369
            java.lang.String r1 = "vVmi9TZPXN+xfqY=\n"
            java.lang.String r2 = "0ArDmEYjOY0=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x004c }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x004c }
            r2 = 0
            r3 = r6[r2]     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x004c }
            r1.set(r4, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "azPw0rIZxL5PBA==\n"
            java.lang.String r2 = "BmCVocFwq9A=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x004c }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x004c }
            r2 = 0
            r2 = r9[r2]     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x004c }
            r1.set(r4, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "nnnOjlWS\n"
            java.lang.String r2 = "8yq67yH3VE8=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x004c }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x004c }
            r0.set(r4, r1)     // Catch:{ Exception -> 0x004c }
            return r4
        L_0x0369:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r0.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = "xFUkcOML6APlQnY=\n"
            java.lang.String r3 = "gSdWH5Eri2w=\n"
            java.lang.String r2 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r2, r3)     // Catch:{ Exception -> 0x004c }
            r0.append(r2)     // Catch:{ Exception -> 0x004c }
            r0.append(r1)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "WC3bdDnpn2gRLtpwO6CMbxY9k382vZ9wHXryZDOgmVQdOdxjM+mZZBI/0GV5\n"
            java.lang.String r2 = "eFqzEVfJ9gY=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)     // Catch:{ Exception -> 0x004c }
            r0.append(r1)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x004c }
            top.tntok.autobot.C0525o0oOO.illlI1lLIL(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "T2Quo/qFrpJ+YCG58NHPhGhsL5/wkuGDaA==\n"
            java.lang.String r2 = "DAVAzZXxjvE=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)     // Catch:{ Exception -> 0x004c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x004c }
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x039c:
            if (r11 == 0) goto L_0x03a7
            r11.close()     // Catch:{ all -> 0x03a2 }
            goto L_0x03a7
        L_0x03a2:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ Exception -> 0x004c }
        L_0x03a7:
            throw r1     // Catch:{ Exception -> 0x004c }
        L_0x03a8:
            java.lang.String r1 = "3V8DZT4QziTsWwx/NESvMvpXAlk0B4E1+g==\n"
            java.lang.String r2 = "nj5tC1Fk7kc=\n"
            java.lang.String r1 = top.tntok.autobot.C0387o0OOoO0o.iiI1L1iI(r1, r2)
            top.tntok.autobot.C0525o0oOO.il1LilLllii(r1, r0)
            top.tntok.autobot.ILiliIiI r0 = new top.tntok.autobot.ILiliIiI
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0510o0o00o.i1LIL11l(int, int, int, int, int, int):android.media.AudioRecord");
    }

    public static void iiI1L1iI() {
        if (Build.VERSION.SDK_INT >= 31) {
            iiIliillii();
        }
        if (!Build.BRAND.equalsIgnoreCase(C0387o0OOoO0o.iiI1L1iI("A8EXKA==\n", "TI9OcGKZKnw=\n"))) {
            il1LilLllii();
        }
        illlI1lLIL();
    }

    public static void iiIliillii() {
        try {
            Constructor<?> declaredConstructor = Class.forName(C0387o0OOoO0o.iiI1L1iI("qsVwEGnLXVqq22RMRc1XEqLMYRBn1lAbpeh7DHLQVhinzmY=\n", "y6sUYgaiOXQ=\n")).getDeclaredConstructor(new Class[]{Class.forName(C0387o0OOoO0o.iiI1L1iI("9nnYAXfljTb2Z8xdWe+dceF+yApM5Jt99nP1HWzpm3b2ew==\n", "lxe8cxiM6Rg=\n"))});
            declaredConstructor.setAccessible(true);
            Object obj = i1LIL11l;
            Object newInstance = declaredConstructor.newInstance(new Object[]{obj});
            Field declaredField = iiI1L1iI.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("O7n/F6EUMkAkm+QQqBMWWjiO4harETBH\n", "VvqQecd9VTU=\n"));
            declaredField.setAccessible(true);
            declaredField.set(obj, newInstance);
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("WVXl44T0m/RuGvbmjLjV+HVU9uaHoYf6blP/4dr0\n", "GjqQj+DU9Zs=\n") + th.getMessage());
        }
    }

    public static Context iilLil1i11I1() {
        try {
            return (Context) iiI1L1iI.getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("whFW5UC2fHXIN03YTaBwZA==\n", "pXQitjnFCBA=\n"), (Class[]) null).invoke(i1LIL11l, (Object[]) null);
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("Js84krvf8B4RgCqbq9/tCBbUKJP/nPEfEcU1iuXf\n", "ZaBN/t//nnE=\n") + th.getMessage());
            return null;
        }
    }

    public static void il1LilLllii() {
        try {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("/fuqcGiZ/AX95b4sRpPsQur8untTmOpO/fHqQ3eA2kLy8Ypjc5E=\n", "nJXOAgfwmCs=\n"));
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance((Object[]) null);
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.packageName = C0387o0OOoO0o.iiI1L1iI("HpQWtHJNAKsSkh+0YEsBtRE=\n", "fft7mhMjZNk=\n");
            Field declaredField = cls.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("fqQPgMfTLg==\n", "H9R/yam1Qa4=\n"));
            declaredField.setAccessible(true);
            declaredField.set(newInstance, applicationInfo);
            Field declaredField2 = iiI1L1iI.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("hQJCN+cg8XWYLEQh6DDZaoY=\n", "6EAtQolEsAU=\n"));
            declaredField2.setAccessible(true);
            declaredField2.set(i1LIL11l, newInstance);
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("0GiytTLrcgfnJ6GwOqc8CeN357A4rXNSsw==\n", "kwfH2VbLHGg=\n") + th.getMessage());
        }
    }

    public static void illlI1lLIL() {
        try {
            Application application = new Application();
            Field declaredField = ContextWrapper.class.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("xrA/+DU=\n", "q/Jei1BQ0Wc=\n"));
            declaredField.setAccessible(true);
            declaredField.set(application, FakeContext.iiI1L1iI());
            Field declaredField2 = iiI1L1iI.getDeclaredField(C0387o0OOoO0o.iiI1L1iI("jBTQe+7VBRygLc5+898FBIgy0A==\n", "4V2+Epq8ZHA=\n"));
            declaredField2.setAccessible(true);
            declaredField2.set(i1LIL11l, application);
        } catch (Throwable th) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("2mpD7DCOrVbtJVDpOMLjWOl1FuM7wLdc4XEMoA==\n", "mQU2gFSuwzk=\n") + th.getMessage());
        }
    }
}
