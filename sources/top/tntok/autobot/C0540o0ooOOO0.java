package top.tntok.autobot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: top.tntok.autobot.o0ooOOO0  reason: case insensitive filesystem */
public class C0540o0ooOOO0 {
    public final C0418o0Oo0Oo0 i1LIL11l;
    public final String iiI1L1iI;
    public final List<Object> illlI1lLIL;

    public C0540o0ooOOO0(String str, C0418o0Oo0Oo0 o0oo0oo0, List<Object> list) {
        i1liLLILiLil1.i1LIL11l(str, "The name is missing.");
        i1liLLILiLil1.i1LIL11l(o0oo0oo0, "The test class is missing.");
        i1liLLILiLil1.i1LIL11l(list, "The parameters are missing.");
        this.iiI1L1iI = str;
        this.i1LIL11l = o0oo0oo0;
        this.illlI1lLIL = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0540o0ooOOO0 o0ooooo0 = (C0540o0ooOOO0) obj;
        if (!this.iiI1L1iI.equals(o0ooooo0.iiI1L1iI) || !this.illlI1lLIL.equals(o0ooooo0.illlI1lLIL) || !this.i1LIL11l.equals(o0ooooo0.i1LIL11l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.iiI1L1iI.hashCode() + 14747) * 14747) + this.i1LIL11l.hashCode()) * 14747) + this.illlI1lLIL.hashCode();
    }

    public List<Object> i1LIL11l() {
        return this.illlI1lLIL;
    }

    public String iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public C0418o0Oo0Oo0 illlI1lLIL() {
        return this.i1LIL11l;
    }

    public String toString() {
        return this.i1LIL11l.IL1lILLLL1L() + " '" + this.iiI1L1iI + "' with parameters " + this.illlI1lLIL;
    }
}
