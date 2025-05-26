package top.tntok.autobot;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/* renamed from: top.tntok.autobot.o00Oo000  reason: case insensitive filesystem */
public class C0152o00Oo000 implements ServletContextListener {
    public static final String iiI1L1iI = (C0152o00Oo000.class.getName() + ".FileCleaningTracker");

    public static void il1LilLllii(ServletContext servletContext, o0O0O00 o0o0o00) {
        servletContext.setAttribute(iiI1L1iI, o0o0o00);
    }

    public static o0O0O00 illlI1lLIL(ServletContext servletContext) {
        return (o0O0O00) servletContext.getAttribute(iiI1L1iI);
    }

    public void i1LIL11l(ServletContextEvent servletContextEvent) {
        il1LilLllii(servletContextEvent.getServletContext(), new o0O0O00());
    }

    public void iiI1L1iI(ServletContextEvent servletContextEvent) {
        illlI1lLIL(servletContextEvent.getServletContext()).i1LIL11l();
    }
}
