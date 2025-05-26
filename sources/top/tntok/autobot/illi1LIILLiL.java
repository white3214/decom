package top.tntok.autobot;

import java.util.concurrent.ConcurrentHashMap;
import org.junit.validator.ValidateWith;

public class illi1LIILLiL {
    public static final ConcurrentHashMap<ValidateWith, i1iLlIill1I> iiI1L1iI = new ConcurrentHashMap<>();

    public i1iLlIill1I iiI1L1iI(ValidateWith validateWith) {
        ConcurrentHashMap<ValidateWith, i1iLlIill1I> concurrentHashMap = iiI1L1iI;
        i1iLlIill1I i1illiill1i = concurrentHashMap.get(validateWith);
        if (i1illiill1i != null) {
            return i1illiill1i;
        }
        Class<? extends i1iLlIill1I> value = validateWith.value();
        try {
            concurrentHashMap.putIfAbsent(validateWith, (i1iLlIill1I) value.newInstance());
            return concurrentHashMap.get(validateWith);
        } catch (Exception e) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class " + value.getName(), e);
        }
    }
}
