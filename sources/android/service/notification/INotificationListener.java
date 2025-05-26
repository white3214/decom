package android.service.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.UserHandle;
import android.service.notification.IStatusBarNotificationHolder;
import android.text.TextUtils;
import java.util.List;
import top.tntok.autobot.C0242o00oOoo;
import top.tntok.autobot.o00O0000;

public interface INotificationListener extends IInterface {

    public static class Default implements INotificationListener {
        public IBinder asBinder() {
            return null;
        }

        public void onActionClicked(String str, Notification.Action action, int i) throws RemoteException {
        }

        public void onAllowedAdjustmentsChanged() throws RemoteException {
        }

        public void onInterruptionFilterChanged(int i) throws RemoteException {
        }

        public void onListenerConnected(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
        }

        public void onListenerHintsChanged(int i) throws RemoteException {
        }

        public void onNotificationActionClick(String str, long j, int i) throws RemoteException {
        }

        public void onNotificationChannelGroupModification(String str, UserHandle userHandle, NotificationChannelGroup notificationChannelGroup, int i) throws RemoteException {
        }

        public void onNotificationChannelModification(String str, UserHandle userHandle, NotificationChannel notificationChannel, int i) throws RemoteException {
        }

        public void onNotificationClick(String str, long j) throws RemoteException {
        }

        public void onNotificationClicked(String str) throws RemoteException {
        }

        public void onNotificationDirectReply(String str) throws RemoteException {
        }

        public void onNotificationEnqueued(IStatusBarNotificationHolder iStatusBarNotificationHolder) throws RemoteException {
        }

        public void onNotificationEnqueuedWithChannel(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationChannel notificationChannel, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
        }

        public void onNotificationExpansionChanged(String str, boolean z, boolean z2) throws RemoteException {
        }

        public void onNotificationFeedbackReceived(String str, NotificationRankingUpdate notificationRankingUpdate, Bundle bundle) throws RemoteException {
        }

        public void onNotificationPosted(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
        }

        public void onNotificationRankingUpdate(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
        }

        public void onNotificationRemoved(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate, NotificationStats notificationStats, int i) throws RemoteException {
        }

        public void onNotificationRemovedReason(String str, long j, int i) throws RemoteException {
        }

        public void onNotificationSnoozedUntilContext(IStatusBarNotificationHolder iStatusBarNotificationHolder, String str) throws RemoteException {
        }

        public void onNotificationVisibilityChanged(String str, boolean z) throws RemoteException {
        }

        public void onNotificationsSeen(List<String> list) throws RemoteException {
        }

        public void onPanelHidden() throws RemoteException {
        }

        public void onPanelRevealed(int i) throws RemoteException {
        }

        public void onStatusBarIconsBehaviorChanged(boolean z) throws RemoteException {
        }

        public void onSuggestedReplySent(String str, CharSequence charSequence, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationListener {
        public static final String DESCRIPTOR = "android.service.notification.INotificationListener";
        static final int TRANSACTION_onActionClicked = 14;
        static final int TRANSACTION_onAllowedAdjustmentsChanged = 26;
        static final int TRANSACTION_onInterruptionFilterChanged = 19;
        static final int TRANSACTION_onListenerConnected = 1;
        static final int TRANSACTION_onListenerHintsChanged = 18;
        static final int TRANSACTION_onNotificationActionClick = 5;
        static final int TRANSACTION_onNotificationChannelGroupModification = 9;
        static final int TRANSACTION_onNotificationChannelModification = 8;
        static final int TRANSACTION_onNotificationClick = 4;
        static final int TRANSACTION_onNotificationClicked = 25;
        static final int TRANSACTION_onNotificationDirectReply = 24;
        static final int TRANSACTION_onNotificationEnqueued = 10;
        static final int TRANSACTION_onNotificationEnqueuedWithChannel = 15;
        static final int TRANSACTION_onNotificationExpansionChanged = 23;
        static final int TRANSACTION_onNotificationFeedbackReceived = 16;
        static final int TRANSACTION_onNotificationPosted = 2;
        static final int TRANSACTION_onNotificationRankingUpdate = 3;
        static final int TRANSACTION_onNotificationRemoved = 7;
        static final int TRANSACTION_onNotificationRemovedReason = 6;
        static final int TRANSACTION_onNotificationSnoozedUntilContext = 11;
        static final int TRANSACTION_onNotificationVisibilityChanged = 22;
        static final int TRANSACTION_onNotificationsSeen = 12;
        static final int TRANSACTION_onPanelHidden = 21;
        static final int TRANSACTION_onPanelRevealed = 20;
        static final int TRANSACTION_onStatusBarIconsBehaviorChanged = 17;
        static final int TRANSACTION_onSuggestedReplySent = 13;

        public static class Proxy implements INotificationListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onActionClicked(String str, Notification.Action action, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    iiI1L1iI.il1LilLllii(obtain, action, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(14, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onAllowedAdjustmentsChanged() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(26, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onInterruptionFilterChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(19, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onListenerConnected(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onListenerHintsChanged(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(18, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationActionClick(String str, long j, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationChannelGroupModification(String str, UserHandle userHandle, NotificationChannelGroup notificationChannelGroup, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    iiI1L1iI.il1LilLllii(obtain, userHandle, 0);
                    iiI1L1iI.il1LilLllii(obtain, notificationChannelGroup, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationChannelModification(String str, UserHandle userHandle, NotificationChannel notificationChannel, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    iiI1L1iI.il1LilLllii(obtain, userHandle, 0);
                    iiI1L1iI.il1LilLllii(obtain, notificationChannel, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationClick(String str, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationClicked(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(25, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationDirectReply(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(24, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationEnqueued(IStatusBarNotificationHolder iStatusBarNotificationHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongInterface(iStatusBarNotificationHolder);
                    this.mRemote.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationEnqueuedWithChannel(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationChannel notificationChannel, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongInterface(iStatusBarNotificationHolder);
                    iiI1L1iI.il1LilLllii(obtain, notificationChannel, 0);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    this.mRemote.transact(15, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationExpansionChanged(String str, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.mRemote.transact(23, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationFeedbackReceived(String str, NotificationRankingUpdate notificationRankingUpdate, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    iiI1L1iI.il1LilLllii(obtain, bundle, 0);
                    this.mRemote.transact(16, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationPosted(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongInterface(iStatusBarNotificationHolder);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationRankingUpdate(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    this.mRemote.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationRemoved(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate, NotificationStats notificationStats, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongInterface(iStatusBarNotificationHolder);
                    iiI1L1iI.il1LilLllii(obtain, notificationRankingUpdate, 0);
                    iiI1L1iI.il1LilLllii(obtain, notificationStats, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationRemovedReason(String str, long j, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationSnoozedUntilContext(IStatusBarNotificationHolder iStatusBarNotificationHolder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongInterface(iStatusBarNotificationHolder);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationVisibilityChanged(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(22, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onNotificationsSeen(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    this.mRemote.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onPanelHidden() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(21, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onPanelRevealed(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(20, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onStatusBarIconsBehaviorChanged(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(17, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSuggestedReplySent(String str, CharSequence charSequence, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(13, obtain, (Parcel) null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INotificationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationListener)) {
                return new Proxy(iBinder);
            }
            return (INotificationListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i != 1598968902) {
                boolean z2 = false;
                switch (i) {
                    case 1:
                        onListenerConnected((NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR));
                        break;
                    case 2:
                        onNotificationPosted(IStatusBarNotificationHolder.Stub.asInterface(parcel.readStrongBinder()), (NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR));
                        break;
                    case 3:
                        onNotificationRankingUpdate((NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR));
                        break;
                    case 4:
                        onNotificationClick(parcel.readString(), parcel.readLong());
                        break;
                    case 5:
                        onNotificationActionClick(parcel.readString(), parcel.readLong(), parcel.readInt());
                        break;
                    case 6:
                        onNotificationRemovedReason(parcel.readString(), parcel.readLong(), parcel.readInt());
                        break;
                    case 7:
                        onNotificationRemoved(IStatusBarNotificationHolder.Stub.asInterface(parcel.readStrongBinder()), (NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR), (NotificationStats) iiI1L1iI.illlI1lLIL(parcel, NotificationStats.CREATOR), parcel.readInt());
                        break;
                    case 8:
                        onNotificationChannelModification(parcel.readString(), (UserHandle) iiI1L1iI.illlI1lLIL(parcel, UserHandle.CREATOR), o00O0000.iiI1L1iI(iiI1L1iI.illlI1lLIL(parcel, NotificationChannel.CREATOR)), parcel.readInt());
                        break;
                    case 9:
                        onNotificationChannelGroupModification(parcel.readString(), (UserHandle) iiI1L1iI.illlI1lLIL(parcel, UserHandle.CREATOR), C0242o00oOoo.iiI1L1iI(iiI1L1iI.illlI1lLIL(parcel, NotificationChannelGroup.CREATOR)), parcel.readInt());
                        break;
                    case 10:
                        onNotificationEnqueued(IStatusBarNotificationHolder.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 11:
                        onNotificationSnoozedUntilContext(IStatusBarNotificationHolder.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        break;
                    case 12:
                        onNotificationsSeen(parcel.createStringArrayList());
                        break;
                    case 13:
                        onSuggestedReplySent(parcel.readString(), (CharSequence) iiI1L1iI.illlI1lLIL(parcel, TextUtils.CHAR_SEQUENCE_CREATOR), parcel.readInt());
                        break;
                    case 14:
                        onActionClicked(parcel.readString(), (Notification.Action) iiI1L1iI.illlI1lLIL(parcel, Notification.Action.CREATOR), parcel.readInt());
                        break;
                    case 15:
                        onNotificationEnqueuedWithChannel(IStatusBarNotificationHolder.Stub.asInterface(parcel.readStrongBinder()), o00O0000.iiI1L1iI(iiI1L1iI.illlI1lLIL(parcel, NotificationChannel.CREATOR)), (NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR));
                        break;
                    case 16:
                        onNotificationFeedbackReceived(parcel.readString(), (NotificationRankingUpdate) iiI1L1iI.illlI1lLIL(parcel, NotificationRankingUpdate.CREATOR), (Bundle) iiI1L1iI.illlI1lLIL(parcel, Bundle.CREATOR));
                        break;
                    case 17:
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        onStatusBarIconsBehaviorChanged(z2);
                        break;
                    case 18:
                        onListenerHintsChanged(parcel.readInt());
                        break;
                    case 19:
                        onInterruptionFilterChanged(parcel.readInt());
                        break;
                    case 20:
                        onPanelRevealed(parcel.readInt());
                        break;
                    case 21:
                        onPanelHidden();
                        break;
                    case 22:
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        onNotificationVisibilityChanged(readString, z2);
                        break;
                    case 23:
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        onNotificationExpansionChanged(readString2, z, z2);
                        break;
                    case 24:
                        onNotificationDirectReply(parcel.readString());
                        break;
                    case 25:
                        onNotificationClicked(parcel.readString());
                        break;
                    case 26:
                        onAllowedAdjustmentsChanged();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return true;
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    public static class iiI1L1iI {
        public static <T extends Parcelable> void il1LilLllii(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }

        public static <T> T illlI1lLIL(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onActionClicked(String str, Notification.Action action, int i) throws RemoteException;

    void onAllowedAdjustmentsChanged() throws RemoteException;

    void onInterruptionFilterChanged(int i) throws RemoteException;

    void onListenerConnected(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException;

    void onListenerHintsChanged(int i) throws RemoteException;

    void onNotificationActionClick(String str, long j, int i) throws RemoteException;

    void onNotificationChannelGroupModification(String str, UserHandle userHandle, NotificationChannelGroup notificationChannelGroup, int i) throws RemoteException;

    void onNotificationChannelModification(String str, UserHandle userHandle, NotificationChannel notificationChannel, int i) throws RemoteException;

    void onNotificationClick(String str, long j) throws RemoteException;

    void onNotificationClicked(String str) throws RemoteException;

    void onNotificationDirectReply(String str) throws RemoteException;

    void onNotificationEnqueued(IStatusBarNotificationHolder iStatusBarNotificationHolder) throws RemoteException;

    void onNotificationEnqueuedWithChannel(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationChannel notificationChannel, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException;

    void onNotificationExpansionChanged(String str, boolean z, boolean z2) throws RemoteException;

    void onNotificationFeedbackReceived(String str, NotificationRankingUpdate notificationRankingUpdate, Bundle bundle) throws RemoteException;

    void onNotificationPosted(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate) throws RemoteException;

    void onNotificationRankingUpdate(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException;

    void onNotificationRemoved(IStatusBarNotificationHolder iStatusBarNotificationHolder, NotificationRankingUpdate notificationRankingUpdate, NotificationStats notificationStats, int i) throws RemoteException;

    void onNotificationRemovedReason(String str, long j, int i) throws RemoteException;

    void onNotificationSnoozedUntilContext(IStatusBarNotificationHolder iStatusBarNotificationHolder, String str) throws RemoteException;

    void onNotificationVisibilityChanged(String str, boolean z) throws RemoteException;

    void onNotificationsSeen(List<String> list) throws RemoteException;

    void onPanelHidden() throws RemoteException;

    void onPanelRevealed(int i) throws RemoteException;

    void onStatusBarIconsBehaviorChanged(boolean z) throws RemoteException;

    void onSuggestedReplySent(String str, CharSequence charSequence, int i) throws RemoteException;
}
