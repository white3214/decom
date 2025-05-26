package top.tntok.autobot;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class o0O0O00 {
    public final Collection<i1LIL11l> i1LIL11l = Collections.synchronizedSet(new HashSet());
    public ReferenceQueue<Object> iiI1L1iI = new ReferenceQueue<>();
    public Thread iiIliillii;
    public volatile boolean il1LilLllii = false;
    public final List<String> illlI1lLIL = Collections.synchronizedList(new ArrayList());

    public static final class i1LIL11l extends PhantomReference<Object> {
        public final C0081o000OOo i1LIL11l;
        public final String iiI1L1iI;

        public i1LIL11l(String str, C0081o000OOo o000ooo, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.iiI1L1iI = str;
            this.i1LIL11l = o000ooo == null ? C0081o000OOo.i1LIL11l : o000ooo;
        }

        public String i1LIL11l() {
            return this.iiI1L1iI;
        }

        public boolean iiI1L1iI() {
            return this.i1LIL11l.i1LIL11l(new File(this.iiI1L1iI));
        }
    }

    public final class iiI1L1iI extends Thread {
        public iiI1L1iI() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        public void run() {
            while (true) {
                if (!o0O0O00.this.il1LilLllii || o0O0O00.this.i1LIL11l.size() > 0) {
                    try {
                        i1LIL11l i1lil11l = (i1LIL11l) o0O0O00.this.iiI1L1iI.remove();
                        o0O0O00.this.i1LIL11l.remove(i1lil11l);
                        if (!i1lil11l.iiI1L1iI()) {
                            o0O0O00.this.illlI1lLIL.add(i1lil11l.i1LIL11l());
                        }
                        i1lil11l.clear();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void I11lLL1(String str, Object obj) {
        iLLLILIiLi1Ii(str, obj, (C0081o000OOo) null);
    }

    public synchronized void i1LIL11l() {
        this.il1LilLllii = true;
        Thread thread = this.iiIliillii;
        if (thread != null) {
            synchronized (thread) {
                this.iiIliillii.interrupt();
            }
        }
    }

    public void iLLLILIiLi1Ii(String str, Object obj, C0081o000OOo o000ooo) {
        Objects.requireNonNull(str, "path");
        iiI1L1iI(str, obj, o000ooo);
    }

    public final synchronized void iiI1L1iI(String str, Object obj, C0081o000OOo o000ooo) {
        try {
            if (!this.il1LilLllii) {
                if (this.iiIliillii == null) {
                    iiI1L1iI iii1l1ii = new iiI1L1iI();
                    this.iiIliillii = iii1l1ii;
                    iii1l1ii.start();
                }
                this.i1LIL11l.add(new i1LIL11l(str, o000ooo, obj, this.iiI1L1iI));
            } else {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void iiIliillii(File file, Object obj) {
        iilLil1i11I1(file, obj, (C0081o000OOo) null);
    }

    public void iilLil1i11I1(File file, Object obj, C0081o000OOo o000ooo) {
        Objects.requireNonNull(file, "file");
        iiI1L1iI(file.getPath(), obj, o000ooo);
    }

    public int il1LilLllii() {
        return this.i1LIL11l.size();
    }

    public List<String> illlI1lLIL() {
        return this.illlI1lLIL;
    }
}
