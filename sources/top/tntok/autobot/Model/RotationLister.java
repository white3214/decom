package top.tntok.autobot.Model;

import android.os.RemoteException;
import android.view.IRotationWatcher;

public class RotationLister extends IRotationWatcher.Stub {
    private final iiI1L1iI mListener;

    public interface iiI1L1iI {
        void onRotationChanged(int i);
    }

    public RotationLister(iiI1L1iI iii1l1ii) {
        this.mListener = iii1l1ii;
    }

    public void onRotationChanged(int i) throws RemoteException {
        iiI1L1iI iii1l1ii = this.mListener;
        if (iii1l1ii != null) {
            iii1l1ii.onRotationChanged(i);
        }
    }
}
