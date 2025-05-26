package android.service.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService;

public class NotificationRankingUpdate implements Parcelable {
    public static final Parcelable.Creator<NotificationRankingUpdate> CREATOR = new iiI1L1iI();
    public final NotificationListenerService.RankingMap iiI1L1iI;

    public class iiI1L1iI implements Parcelable.Creator<NotificationRankingUpdate> {
        /* renamed from: i1LIL11l */
        public NotificationRankingUpdate[] newArray(int i) {
            return new NotificationRankingUpdate[i];
        }

        /* renamed from: iiI1L1iI */
        public NotificationRankingUpdate createFromParcel(Parcel parcel) {
            return new NotificationRankingUpdate(parcel);
        }
    }

    public NotificationRankingUpdate(Parcel parcel) {
        this.iiI1L1iI = (NotificationListenerService.RankingMap) parcel.readParcelable(getClass().getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.iiI1L1iI.equals(((NotificationRankingUpdate) obj).iiI1L1iI);
    }

    public NotificationListenerService.RankingMap iiI1L1iI() {
        return this.iiI1L1iI;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.iiI1L1iI, i);
    }
}
