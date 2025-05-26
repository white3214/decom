package top.tntok.autobot;

import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o0OOOO0 {
    public static final Logger iiI1L1iI = Logger.getLogger(o0OOOO0.class.getName());

    public static <T extends C0222o00oO00O> void i1LIL11l(Class<T> cls) {
        try {
            iiI1L1iI((C0222o00oO00O) cls.newInstance());
        } catch (Exception e) {
            iiI1L1iI.log(Level.SEVERE, "Could not create server", e);
        }
    }

    public static void iiI1L1iI(C0222o00oO00O o00oo00o) {
        try {
            o00oo00o.il1l1IlL(C0222o00oO00O.iL1LIlIlI, false);
        } catch (IOException e) {
            PrintStream printStream = System.err;
            printStream.println("Couldn't start server:\n" + e);
            System.exit(-1);
        }
        System.out.println("Server started, Hit Enter to stop.\n");
        try {
            System.in.read();
        } catch (Throwable unused) {
        }
        o00oo00o.I1IIIi1i1ILl();
        System.out.println("Server stopped.\n");
    }
}
