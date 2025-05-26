package top.tntok.autobot;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;

/* renamed from: top.tntok.autobot.Oooo0oO  reason: case insensitive filesystem */
public class C0033Oooo0oO {
    public static String iiI1L1iI(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 70, byteArrayOutputStream);
        return Ilili11iLIl.iiIliillii(byteArrayOutputStream.toByteArray());
    }
}
