package android.view;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

public interface IDisplayWindowListener extends IInterface {
    public static final String DESCRIPTOR = "android.view.IDisplayWindowListener";

    public static class Default implements IDisplayWindowListener {
        public IBinder asBinder() {
            return null;
        }

        public void onDisplayAdded(int i) throws RemoteException {
        }

        public void onDisplayConfigurationChanged(int i, Configuration configuration) throws RemoteException {
        }

        public void onDisplayRemoved(int i) throws RemoteException {
        }

        public void onFixedRotationFinished(int i) throws RemoteException {
        }

        public void onFixedRotationStarted(int i, int i2) throws RemoteException {
        }

        public void onKeepClearAreasChanged(int i, List<Rect> list, List<Rect> list2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDisplayWindowListener {
        static final int TRANSACTION_onDisplayAdded = 1;
        static final int TRANSACTION_onDisplayConfigurationChanged = 2;
        static final int TRANSACTION_onDisplayRemoved = 3;
        static final int TRANSACTION_onFixedRotationFinished = 5;
        static final int TRANSACTION_onFixedRotationStarted = 4;
        static final int TRANSACTION_onKeepClearAreasChanged = 6;

        public static class Proxy implements IDisplayWindowListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDisplayWindowListener.DESCRIPTOR;
            }

            public void onDisplayAdded(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onDisplayConfigurationChanged(int i, Configuration configuration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    iiI1L1iI.iilLil1i11I1(obtain, configuration, 0);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onDisplayRemoved(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onFixedRotationFinished(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onFixedRotationStarted(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onKeepClearAreasChanged(int i, List<Rect> list, List<Rect> list2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IDisplayWindowListener.DESCRIPTOR);
                    obtain.writeInt(i);
                    iiI1L1iI.iiIliillii(obtain, list, 0);
                    iiI1L1iI.iiIliillii(obtain, list2, 0);
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDisplayWindowListener.DESCRIPTOR);
        }

        public static IDisplayWindowListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IDisplayWindowListener.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDisplayWindowListener)) {
                return new Proxy(iBinder);
            }
            return (IDisplayWindowListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDisplayWindowListener.DESCRIPTOR);
            }
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        onDisplayAdded(parcel.readInt());
                        break;
                    case 2:
                        onDisplayConfigurationChanged(parcel.readInt(), (Configuration) iiI1L1iI.il1LilLllii(parcel, Configuration.CREATOR));
                        break;
                    case 3:
                        onDisplayRemoved(parcel.readInt());
                        break;
                    case 4:
                        onFixedRotationStarted(parcel.readInt(), parcel.readInt());
                        break;
                    case 5:
                        onFixedRotationFinished(parcel.readInt());
                        break;
                    case 6:
                        int readInt = parcel.readInt();
                        Parcelable.Creator creator = Rect.CREATOR;
                        onKeepClearAreasChanged(readInt, parcel.createTypedArrayList(creator), parcel.createTypedArrayList(creator));
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return true;
            }
            parcel2.writeString(IDisplayWindowListener.DESCRIPTOR);
            return true;
        }
    }

    public static class iiI1L1iI {
        public static <T extends Parcelable> void iiIliillii(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                iilLil1i11I1(parcel, (Parcelable) list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void iilLil1i11I1(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }

        public static <T> T il1LilLllii(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onDisplayAdded(int i) throws RemoteException;

    void onDisplayConfigurationChanged(int i, Configuration configuration) throws RemoteException;

    void onDisplayRemoved(int i) throws RemoteException;

    void onFixedRotationFinished(int i) throws RemoteException;

    void onFixedRotationStarted(int i, int i2) throws RemoteException;

    void onKeepClearAreasChanged(int i, List<Rect> list, List<Rect> list2) throws RemoteException;
}
