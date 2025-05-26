package top.tntok.autobot.Model;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.UserHandle;
import android.service.notification.INotificationListener;
import android.service.notification.IStatusBarNotificationHolder;
import android.service.notification.NotificationRankingUpdate;
import android.service.notification.NotificationStats;
import android.service.notification.StatusBarNotification;
import java.util.List;

public class NotificationListener extends INotificationListener.Stub {
    private final iiI1L1iI mListener;

    public interface iiI1L1iI {
        void i1LIL11l(StatusBarNotification statusBarNotification);

        void iiI1L1iI();
    }

    public NotificationListener(iiI1L1iI iii1l1ii) {
        this.mListener = iii1l1ii;
    }

    public void onActionClicked(String str, Notification.Action action, int i) throws RemoteException {
    }

    public void onAllowedAdjustmentsChanged() throws RemoteException {
    }

    public void onInterruptionFilterChanged(int i) throws RemoteException {
    }

    public void onListenerConnected(NotificationRankingUpdate notificationRankingUpdate) throws RemoteException {
        iiI1L1iI iii1l1ii = this.mListener;
        if (iii1l1ii != null) {
            iii1l1ii.iiI1L1iI();
        }
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
        iiI1L1iI iii1l1ii;
        try {
            StatusBarNotification statusBarNotification = iStatusBarNotificationHolder.get();
            if (statusBarNotification != null && (iii1l1ii = this.mListener) != null) {
                iii1l1ii.i1LIL11l(statusBarNotification);
            }
        } catch (RemoteException unused) {
        }
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
