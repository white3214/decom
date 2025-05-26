package top.tntok.autobot;

import android.annotation.TargetApi;
import android.content.AttributionSource;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IContentProvider;
import android.os.Binder;

public final class FakeContext extends ContextWrapper {
    public static final String i1LIL11l = C0387o0OOoO0o.iiI1L1iI("UMPoz42p391cxeHPn6/ew18=\n", "M6yF4ezHu68=\n");
    public static final FakeContext il1LilLllii = new FakeContext();
    public static final int illlI1lLIL = 0;
    public final ContentResolver iiI1L1iI = new MyContentResolver(this);

    public static class MyContentResolver extends ContentResolver {
        public MyContentResolver(Context context) {
            super(context);
        }

        public IContentProvider acquireProvider(Context context, String str) {
            return o0OOOO0o.iiI1L1iI().iilLil1i11I1(str, new Binder());
        }

        public IContentProvider acquireUnstableProvider(Context context, String str) {
            return null;
        }

        public boolean releaseProvider(IContentProvider iContentProvider) {
            return false;
        }

        public boolean releaseUnstableProvider(IContentProvider iContentProvider) {
            return false;
        }

        public void unstableProviderDied(IContentProvider iContentProvider) {
        }
    }

    public FakeContext() {
        super(C0510o0o00o.iilLil1i11I1());
    }

    public static FakeContext iiI1L1iI() {
        return il1LilLllii;
    }

    public Context getApplicationContext() {
        return this;
    }

    @TargetApi(31)
    public AttributionSource getAttributionSource() {
        AttributionSource.Builder iiI1L1iI2 = C0269o00ooo.iiI1L1iI(2000);
        AttributionSource.Builder unused = iiI1L1iI2.setPackageName(i1LIL11l);
        return iiI1L1iI2.build();
    }

    public ContentResolver getContentResolver() {
        return this.iiI1L1iI;
    }

    public int getDeviceId() {
        return 0;
    }

    public String getOpPackageName() {
        return i1LIL11l;
    }

    public String getPackageName() {
        return i1LIL11l;
    }
}
