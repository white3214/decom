package top.tntok.autobot;

import java.lang.reflect.Modifier;
import org.junit.runner.RunWith;

public class ILllI11 extends C0402o0OOoooO {
    public static final String illlI1lLIL = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    public final C0402o0OOoooO i1LIL11l;

    public ILllI11(C0402o0OOoooO o0oooooo) {
        this.i1LIL11l = o0oooooo;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        return (top.tntok.autobot.C0346o0OO0oOO) r7.getConstructor(new java.lang.Class[]{r3, top.tntok.autobot.C0402o0OOoooO.class}).newInstance(new java.lang.Object[]{r8, r6.i1LIL11l});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r7 = r7.getSimpleName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        throw new top.tntok.autobot.C0136o00O0oo(java.lang.String.format(illlI1lLIL, new java.lang.Object[]{r7, r7}));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public top.tntok.autobot.C0346o0OO0oOO IiIIlIL(java.lang.Class<? extends top.tntok.autobot.C0346o0OO0oOO> r7, java.lang.Class<?> r8) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
            r4[r1] = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
            java.lang.reflect.Constructor r4 = r7.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0018 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
            r5[r1] = r8     // Catch:{ NoSuchMethodException -> 0x0018 }
            java.lang.Object r4 = r4.newInstance(r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
            top.tntok.autobot.o0OO0oOO r4 = (top.tntok.autobot.C0346o0OO0oOO) r4     // Catch:{ NoSuchMethodException -> 0x0018 }
            return r4
        L_0x0018:
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0033 }
            r4[r1] = r3     // Catch:{ NoSuchMethodException -> 0x0033 }
            java.lang.Class<top.tntok.autobot.o0OOoooO> r3 = top.tntok.autobot.C0402o0OOoooO.class
            r4[r2] = r3     // Catch:{ NoSuchMethodException -> 0x0033 }
            java.lang.reflect.Constructor r3 = r7.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0033 }
            top.tntok.autobot.o0OOoooO r4 = r6.i1LIL11l     // Catch:{ NoSuchMethodException -> 0x0033 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0033 }
            r5[r1] = r8     // Catch:{ NoSuchMethodException -> 0x0033 }
            r5[r2] = r4     // Catch:{ NoSuchMethodException -> 0x0033 }
            java.lang.Object r8 = r3.newInstance(r5)     // Catch:{ NoSuchMethodException -> 0x0033 }
            top.tntok.autobot.o0OO0oOO r8 = (top.tntok.autobot.C0346o0OO0oOO) r8     // Catch:{ NoSuchMethodException -> 0x0033 }
            return r8
        L_0x0033:
            java.lang.String r7 = r7.getSimpleName()
            top.tntok.autobot.o00O0oo r8 = new top.tntok.autobot.o00O0oo
            java.lang.String r3 = "Custom runner class %s should have a public constructor with signature %s(Class testClass)"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            r0[r2] = r7
            java.lang.String r7 = java.lang.String.format(r3, r0)
            r8.<init>((java.lang.String) r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.ILllI11.IiIIlIL(java.lang.Class, java.lang.Class):top.tntok.autobot.o0OO0oOO");
    }

    public final Class<?> iilLiIIIi11i(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public C0346o0OO0oOO il1LilLllii(Class<?> cls) throws Exception {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            RunWith runWith = (RunWith) cls2.getAnnotation(RunWith.class);
            if (runWith != null) {
                return IiIIlIL(runWith.value(), cls);
            }
            cls2 = iilLiIIIi11i(cls2);
        }
        return null;
    }
}
