package top.tntok.autobot;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.RunListener;

public class o0OO000 implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(illlI1lLIL.class).getFields();
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final AtomicInteger assumptionFailureCount;
    /* access modifiers changed from: private */
    public final AtomicInteger count;
    /* access modifiers changed from: private */
    public final CopyOnWriteArrayList<o00O0O> failures;
    /* access modifiers changed from: private */
    public final AtomicInteger ignoreCount;
    /* access modifiers changed from: private */
    public final AtomicLong runTime;
    private illlI1lLIL serializedForm;
    /* access modifiers changed from: private */
    public final AtomicLong startTime;

    @RunListener.ThreadSafe
    public class i1LIL11l extends RunListener {
        public i1LIL11l() {
        }

        public void i1LIL11l(o00O0O o00o0o) throws Exception {
            o0OO000.this.failures.add(o00o0o);
        }

        public void iiI1L1iI(o00O0O o00o0o) {
            o0OO000.this.assumptionFailureCount.getAndIncrement();
        }

        public void iiIliillii(o0OO000 o0oo000) throws Exception {
            o0OO000.this.runTime.addAndGet(System.currentTimeMillis() - o0OO000.this.startTime.get());
        }

        public void iilLil1i11I1(C0009OooO0oO oooO0oO) throws Exception {
            o0OO000.this.startTime.set(System.currentTimeMillis());
        }

        public void il1LilLllii(C0009OooO0oO oooO0oO) throws Exception {
            o0OO000.this.ignoreCount.getAndIncrement();
        }

        public void illlI1lLIL(C0009OooO0oO oooO0oO) throws Exception {
            o0OO000.this.count.getAndIncrement();
        }
    }

    public o0OO000() {
        this.count = new AtomicInteger();
        this.ignoreCount = new AtomicInteger();
        this.assumptionFailureCount = new AtomicInteger();
        this.failures = new CopyOnWriteArrayList<>();
        this.runTime = new AtomicLong();
        this.startTime = new AtomicLong();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.serializedForm = illlI1lLIL.I11lLL1(objectInputStream);
    }

    private Object readResolve() {
        return new o0OO000(this.serializedForm);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        new illlI1lLIL(this).iLLLILIiLi1Ii(objectOutputStream);
    }

    public RunListener I11lLL1() {
        return new i1LIL11l();
    }

    public long I1iIiIi() {
        return this.runTime.get();
    }

    public int IiIIlIL() {
        return this.failures.size();
    }

    public int IiiL1llIIi() {
        return this.ignoreCount.get();
    }

    public boolean i1L1lLllLLlIi() {
        if (IiIIlIL() == 0) {
            return true;
        }
        return false;
    }

    public int iILiI1lll() {
        return this.count.get();
    }

    public int iLLLILIiLi1Ii() {
        AtomicInteger atomicInteger = this.assumptionFailureCount;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        throw new UnsupportedOperationException("Result was serialized from a version of JUnit that doesn't support this method");
    }

    public List<o00O0O> iilLiIIIi11i() {
        return this.failures;
    }

    public static class illlI1lLIL implements Serializable {
        private static final long serialVersionUID = 1;
        /* access modifiers changed from: private */
        public final AtomicInteger assumptionFailureCount;
        /* access modifiers changed from: private */
        public final AtomicInteger fCount;
        /* access modifiers changed from: private */
        public final List<o00O0O> fFailures;
        /* access modifiers changed from: private */
        public final AtomicInteger fIgnoreCount;
        /* access modifiers changed from: private */
        public final long fRunTime;
        /* access modifiers changed from: private */
        public final long fStartTime;

        public illlI1lLIL(o0OO000 o0oo000) {
            this.fCount = o0oo000.count;
            this.fIgnoreCount = o0oo000.ignoreCount;
            this.assumptionFailureCount = o0oo000.assumptionFailureCount;
            this.fFailures = Collections.synchronizedList(new ArrayList(o0oo000.failures));
            this.fRunTime = o0oo000.runTime.longValue();
            this.fStartTime = o0oo000.startTime.longValue();
        }

        public static illlI1lLIL I11lLL1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            return new illlI1lLIL(objectInputStream.readFields());
        }

        public void iLLLILIiLi1Ii(ObjectOutputStream objectOutputStream) throws IOException {
            ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
            putFields.put("fCount", this.fCount);
            putFields.put("fIgnoreCount", this.fIgnoreCount);
            putFields.put("fFailures", this.fFailures);
            putFields.put("fRunTime", this.fRunTime);
            putFields.put("fStartTime", this.fStartTime);
            putFields.put("assumptionFailureCount", this.assumptionFailureCount);
            objectOutputStream.writeFields();
        }

        public illlI1lLIL(ObjectInputStream.GetField getField) throws IOException {
            this.fCount = (AtomicInteger) getField.get("fCount", (Object) null);
            this.fIgnoreCount = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.assumptionFailureCount = (AtomicInteger) getField.get("assumptionFailureCount", (Object) null);
            this.fFailures = (List) getField.get("fFailures", (Object) null);
            this.fRunTime = getField.get("fRunTime", 0);
            this.fStartTime = getField.get("fStartTime", 0);
        }
    }

    public o0OO000(illlI1lLIL illli1llil) {
        this.count = illli1llil.fCount;
        this.ignoreCount = illli1llil.fIgnoreCount;
        this.assumptionFailureCount = illli1llil.assumptionFailureCount;
        this.failures = new CopyOnWriteArrayList<>(illli1llil.fFailures);
        this.runTime = new AtomicLong(illli1llil.fRunTime);
        this.startTime = new AtomicLong(illli1llil.fStartTime);
    }
}
