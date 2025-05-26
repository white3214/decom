package android.view;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDisplayFoldListener extends IInterface {
    public static final String DESCRIPTOR = "android.view.IDisplayFoldListener";

    public static class Default implements IDisplayFoldListener {
        public IBinder asBinder() {
            return null;
        }

        public void onDisplayFoldChanged(int i, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDisplayFoldListener {
        static final int TRANSACTION_onDisplayFoldChanged = 1;

        public static class Proxy implements IDisplayFoldListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDisplayFoldListener.DESCRIPTOR;
            }

            public void onDisplayFoldChanged(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayFoldListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDisplayFoldListener.DESCRIPTOR);
        }

        public static IDisplayFoldListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IDisplayFoldListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDisplayFoldListener)) {
                return new Proxy(iBinder);
            }
            return (IDisplayFoldListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDisplayFoldListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDisplayFoldListener.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                onDisplayFoldChanged(readInt, z);
                return true;
            }
        }
    }

    void onDisplayFoldChanged(int i, boolean z) throws RemoteException;
}
