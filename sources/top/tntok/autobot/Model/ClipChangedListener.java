package top.tntok.autobot.Model;

import android.content.IOnPrimaryClipChangedListener;
import android.os.RemoteException;

public class ClipChangedListener extends IOnPrimaryClipChangedListener.Stub {
    private final iiI1L1iI mListener;

    public interface iiI1L1iI {
        void iiI1L1iI();
    }

    public ClipChangedListener(iiI1L1iI iii1l1ii) {
        this.mListener = iii1l1ii;
    }

    public void dispatchPrimaryClipChanged() throws RemoteException {
        iiI1L1iI iii1l1ii = this.mListener;
        if (iii1l1ii != null) {
            iii1l1ii.iiI1L1iI();
        }
    }
}
