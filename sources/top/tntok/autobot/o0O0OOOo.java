package top.tntok.autobot;

public abstract class o0O0OOOo {

    public static class i1LIL11l extends Exception {
        private static final long serialVersionUID = 1;

        public i1LIL11l() {
        }

        public i1LIL11l(Throwable th) {
            super(th);
        }
    }

    public class iiI1L1iI extends o0O0OOOo {
        public final /* synthetic */ String i1LIL11l;
        public final /* synthetic */ Object iiI1L1iI;

        public iiI1L1iI(Object obj, String str) {
            this.iiI1L1iI = obj;
            this.i1LIL11l = str;
        }

        public String i1LIL11l() {
            String str;
            Object obj = this.iiI1L1iI;
            if (obj == null) {
                str = "null";
            } else {
                try {
                    str = String.format("\"%s\"", new Object[]{obj});
                } catch (Throwable th) {
                    str = String.format("[toString() threw %s: %s]", new Object[]{th.getClass().getSimpleName(), th.getMessage()});
                }
            }
            return String.format("%s <from %s>", new Object[]{str, this.i1LIL11l});
        }

        public Object illlI1lLIL() {
            return this.iiI1L1iI;
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.iiI1L1iI});
        }
    }

    public static o0O0OOOo iiI1L1iI(String str, Object obj) {
        return new iiI1L1iI(obj, str);
    }

    public abstract String i1LIL11l() throws i1LIL11l;

    public abstract Object illlI1lLIL() throws i1LIL11l;
}
