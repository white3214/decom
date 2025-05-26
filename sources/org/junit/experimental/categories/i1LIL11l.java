package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.experimental.categories.Categories;
import top.tntok.autobot.IILliiiLIiL1L;
import top.tntok.autobot.o000O0;
import top.tntok.autobot.o000O00O;
import top.tntok.autobot.o000O0O;

public final class i1LIL11l extends IILliiiLIiL1L {

    public static class iiI1L1iI extends Categories.iiI1L1iI {
        public iiI1L1iI(List<Class<?>> list) {
            this((Set<Class<?>>) new HashSet(list));
        }

        public String i1LIL11l() {
            return "includes " + super.i1LIL11l();
        }

        public iiI1L1iI(Set<Class<?>> set) {
            super(true, set, true, (Set<Class<?>>) null);
        }
    }

    public o000O0O i1LIL11l(List<Class<?>> list) {
        return new iiI1L1iI(list);
    }

    public /* bridge */ /* synthetic */ o000O0O iiI1L1iI(o000O0 o000o0) throws o000O00O.iiI1L1iI {
        return super.iiI1L1iI(o000o0);
    }
}
