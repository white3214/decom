package top.tntok.autobot;

import java.util.Iterator;

/* renamed from: top.tntok.autobot.o0OO00o  reason: case insensitive filesystem */
public final /* synthetic */ class C0340o0OO00o {
    public static /* synthetic */ String iiI1L1iI(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
