package top.tntok.autobot;

import java.util.ArrayList;
import java.util.List;

public class i1LiiIlIL1I extends AssertionError {
    private static final long serialVersionUID = 1;
    private final AssertionError fCause;
    private final List<Integer> fIndices = new ArrayList();
    private final String fMessage;

    public i1LiiIlIL1I(String str, AssertionError assertionError, int i) {
        this.fMessage = str;
        this.fCause = assertionError;
        initCause(assertionError);
        iiI1L1iI(i);
    }

    public synchronized Throwable getCause() {
        Throwable th;
        try {
            if (super.getCause() == null) {
                th = this.fCause;
            } else {
                th = super.getCause();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return th;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.fMessage;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        for (Integer intValue : this.fIndices) {
            int intValue2 = intValue.intValue();
            sb.append("[");
            sb.append(intValue2);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    public void iiI1L1iI(int i) {
        this.fIndices.add(0, Integer.valueOf(i));
    }

    public String toString() {
        return getMessage();
    }
}
