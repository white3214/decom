package android.service.notification;

import android.os.Parcel;
import android.os.Parcelable;

public class NotificationStats implements Parcelable {
    public static final Parcelable.Creator<NotificationStats> CREATOR = new iiI1L1iI();

    public class iiI1L1iI implements Parcelable.Creator<NotificationStats> {
        /* renamed from: i1LIL11l */
        public NotificationStats[] newArray(int i) {
            return new NotificationStats[i];
        }

        /* renamed from: iiI1L1iI */
        public NotificationStats createFromParcel(Parcel parcel) {
            return new NotificationStats(parcel);
        }
    }

    public NotificationStats(Parcel parcel) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
