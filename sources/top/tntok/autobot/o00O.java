package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.hardware.input.InputManager;
import android.view.InputEvent;
import android.view.MotionEvent;
import java.lang.reflect.Method;

@SuppressLint({"PrivateApi,DiscouragedPrivateApi"})
public final class o00O {
    public static Method I11lLL1 = null;
    public static final int iiIliillii = 2;
    public static Method iilLil1i11I1 = null;
    public static final int il1LilLllii = 1;
    public static final int illlI1lLIL = 0;
    public Method i1LIL11l;
    public final Object iiI1L1iI;

    public o00O(Object obj) {
        this.iiI1L1iI = obj;
    }

    public static boolean I11lLL1(MotionEvent motionEvent, int i) {
        try {
            il1LilLllii().invoke(motionEvent, new Object[]{Integer.valueOf(i)});
            return true;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("sg5DpXmpb1uUGw2qdakmR59PT75iqSBG0QBD61uyO0GeAWi9c7M7\n", "8W8tyxbdTyg=\n"), e);
            return false;
        }
    }

    public static boolean iLLLILIiLi1Ii(InputEvent inputEvent, int i) {
        try {
            iiIliillii().invoke(inputEvent, new Object[]{Integer.valueOf(i)});
            return true;
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("8CwmVE2vOS3APidZS7ptKZMsaF5LqGkg0jRoU0b7bSOTOSBfArJ3PMY5aF9Uvnc4\n", "s01IOiLbGUw=\n"), e);
            return false;
        }
    }

    public static o00O iiI1L1iI() {
        try {
            return new o00O(illlI1lLIL().getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("tfkUDUqNqHq8/wU=\n", "0pxgRCT+3Bs=\n"), (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        }
    }

    public static Method iiIliillii() throws NoSuchMethodException {
        if (iilLil1i11I1 == null) {
            iilLil1i11I1 = InputEvent.class.getMethod(C0387o0OOoO0o.iiI1L1iI("3plRm95oJCLMhWy7\n", "rfwl37cbVE4=\n"), new Class[]{Integer.TYPE});
        }
        return iilLil1i11I1;
    }

    public static Method il1LilLllii() throws NoSuchMethodException {
        if (I11lLL1 == null) {
            I11lLL1 = MotionEvent.class.getMethod(C0387o0OOoO0o.iiI1L1iI("tLbm/mmxg9ipkefLfqqE\n", "x9OSvwrF6rc=\n"), new Class[]{Integer.TYPE});
        }
        return I11lLL1;
    }

    public static Class<?> illlI1lLIL() {
        try {
            return Class.forName(C0387o0OOoO0o.iiI1L1iI("SJr4HR7R3i9Ble4LBtnIZAed8h8EzJRIR4TpGzzZ1GBOke4oHdfYYEU=\n", "KfScb3G4ugE=\n"));
        } catch (ClassNotFoundException unused) {
            return InputManager.class;
        }
    }

    public final Method i1LIL11l() throws NoSuchMethodException {
        if (this.i1LIL11l == null) {
            this.i1LIL11l = this.iiI1L1iI.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("ESk8M6vnb10IMiITvvZIRw==\n", "eEdWVsiTJjM=\n"), new Class[]{InputEvent.class, Integer.TYPE});
        }
        return this.i1LIL11l;
    }

    public boolean iilLil1i11I1(InputEvent inputEvent, int i) {
        try {
            return ((Boolean) i1LIL11l().invoke(this.iiI1L1iI, new Object[]{inputEvent, Integer.valueOf(i)})).booleanValue();
        } catch (ReflectiveOperationException e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("Y3YtHvH/5sxUOTEc47DjxgB0PQb9sOw=\n", "IBlYcpXfiKM=\n"), e);
            return false;
        }
    }
}
