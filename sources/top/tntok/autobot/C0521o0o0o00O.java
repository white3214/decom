package top.tntok.autobot;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: top.tntok.autobot.o0o0o00O  reason: case insensitive filesystem */
public class C0521o0o0o00O extends ObjectInputStream {
    public final List<IlI1l1i1Ilii> i1LIL11l = new ArrayList();
    public final List<IlI1l1i1Ilii> illlI1lLIL = new ArrayList();

    public C0521o0o0o00O(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    public C0521o0o0o00O I1LiILiLLIl1l(Pattern pattern) {
        this.illlI1lLIL.add(new C0326o0O0oOoO(pattern));
        return this;
    }

    public final void I1lLLLlliILlI(String str) throws InvalidClassException {
        for (IlI1l1i1Ilii iiI1L1iI : this.illlI1lLIL) {
            if (iiI1L1iI.iiI1L1iI(str)) {
                IiIl11II(str);
            }
        }
        for (IlI1l1i1Ilii iiI1L1iI2 : this.i1LIL11l) {
            if (iiI1L1iI2.iiI1L1iI(str)) {
                return;
            }
        }
        IiIl11II(str);
    }

    public C0521o0o0o00O IIL1Ll1I111(Class<?>... clsArr) {
        for (Class<?> name : clsArr) {
            this.illlI1lLIL.add(new C0080o000OO0o(name.getName()));
        }
        return this;
    }

    public void IiIl11II(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    public C0521o0o0o00O i111iLiiIIill(String... strArr) {
        for (String o0o00oo : strArr) {
            this.i1LIL11l.add(new C0506o0o00Oo(o0o00oo));
        }
        return this;
    }

    public C0521o0o0o00O i1LIL11l(IlI1l1i1Ilii ilI1l1i1Ilii) {
        this.i1LIL11l.add(ilI1l1i1Ilii);
        return this;
    }

    public C0521o0o0o00O iiI1L1iI(Pattern pattern) {
        this.i1LIL11l.add(new C0326o0O0oOoO(pattern));
        return this;
    }

    public C0521o0o0o00O il1LilLllii(Class<?>... clsArr) {
        for (Class<?> name : clsArr) {
            this.i1LIL11l.add(new C0080o000OO0o(name.getName()));
        }
        return this;
    }

    public C0521o0o0o00O ilIILlI1l11i(String... strArr) {
        for (String o0o00oo : strArr) {
            this.illlI1lLIL.add(new C0506o0o00Oo(o0o00oo));
        }
        return this;
    }

    public C0521o0o0o00O ilLIlL1ILi(IlI1l1i1Ilii ilI1l1i1Ilii) {
        this.illlI1lLIL.add(ilI1l1i1Ilii);
        return this;
    }

    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        I1lLLLlliILlI(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }
}
