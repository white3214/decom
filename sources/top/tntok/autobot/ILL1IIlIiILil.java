package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class ILL1IIlIiILil extends C0396o0OOooO {
    public static final float[] ILl1iII11Ll1 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public static final /* synthetic */ boolean i1iiLIil1ILi = false;
    public final int I11lLL1;
    public C0363o0OOOo0O I1iIiIi;
    public Executor I1l1iIll1lIi1;
    public i1iiLIil1ILi IL1lILLLL1L;
    public Handler Ii1liIIIiLi;
    public final Rect IiIIlIL;
    public final float IiiL1llIIi;
    public CameraDevice IilL11ii1I1Il;
    public HandlerThread i111iLiiIIill;
    public C0363o0OOOo0O i1L1lLllLLlIi;
    public final String i1LIL11l;
    public String iILiI1lll;
    public C0254o00oo0o iL1LIlIlI;
    public final boolean iLLLILIiLi1Ii;
    public int iiIliillii;
    public final AtomicBoolean iiLIIiIli = new AtomicBoolean();
    public final C0263o00ooOO0 iilLiIIIi11i;
    public final IL1IiLI iilLil1i11I1;
    public final C0363o0OOOo0O il1LilLllii;
    public final IIiILIi1L illlI1lLIL;

    public class i1LIL11l extends CameraCaptureSession.StateCallback {
        public final /* synthetic */ CompletableFuture iiI1L1iI;

        public i1LIL11l(CompletableFuture completableFuture) {
            this.iiI1L1iI = completableFuture;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            boolean unused = this.iiI1L1iI.completeExceptionally(new CameraAccessException(3));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            boolean unused = this.iiI1L1iI.complete(cameraCaptureSession);
        }
    }

    public class iiI1L1iI extends CameraDevice.StateCallback {
        public final /* synthetic */ CompletableFuture iiI1L1iI;

        public iiI1L1iI(CompletableFuture completableFuture) {
            this.iiI1L1iI = completableFuture;
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("WyWqhli7+9NxN6SMRLS+1Gwhow==\n", "GETH4yra27c=\n"));
            ILL1IIlIiILil.this.iiLIIiIli.set(true);
            ILL1IIlIiILil.this.il1LilLllii();
        }

        public void onError(CameraDevice cameraDevice, int i) {
            int i2 = 1;
            if (i == 1) {
                i2 = 4;
            } else if (i == 2) {
                i2 = 5;
            } else if (i != 3) {
                i2 = 3;
            }
            boolean unused = this.iiI1L1iI.completeExceptionally(new CameraAccessException(i2));
        }

        public void onOpened(CameraDevice cameraDevice) {
            C0525o0oOO.iiI1L1iI(C0387o0OOoO0o.iiI1L1iI("ysv69cpXTcf5z/n13BYe3erJ8uPLUBjE5dM=\n", "iaqXkLg2bag=\n"));
            boolean unused = this.iiI1L1iI.complete(cameraDevice);
        }
    }

    public ILL1IIlIiILil(o0O0o o0o0o) {
        this.i1LIL11l = o0o0o.I1iIiIi();
        this.illlI1lLIL = o0o0o.iilLiIIIi11i();
        this.il1LilLllii = o0o0o.i1L1lLllLLlIi();
        this.iiIliillii = o0o0o.il1l1IlL();
        this.iilLil1i11I1 = o0o0o.IiIIlIL();
        this.I11lLL1 = o0o0o.IiiL1llIIi();
        this.iLLLILIiLi1Ii = o0o0o.iILiI1lll();
        this.IiIIlIL = o0o0o.I1l1iIll1lIi1();
        this.iilLiIIIi11i = o0o0o.IL1lILLLL1L();
        this.IiiL1llIIi = o0o0o.iiI1L1iI();
    }

    public static /* synthetic */ int I1l1iIll1lIi1(Float f, Size size, Size size2) {
        int compare;
        int compare2 = Integer.compare(size.getWidth(), size2.getWidth());
        if (compare2 != 0) {
            return compare2;
        }
        if (f == null || (compare = Float.compare(Math.abs(1.0f - ((((float) size2.getWidth()) / ((float) size2.getHeight())) / f.floatValue())), Math.abs(1.0f - ((((float) size.getWidth()) / ((float) size.getHeight())) / f.floatValue())))) == 0) {
            return Integer.compare(size.getHeight(), size2.getHeight());
        }
        return compare;
    }

    public static Float ILl1iII11Ll1(IL1IiLI iL1IiLI, CameraCharacteristics cameraCharacteristics) {
        if (iL1IiLI == null) {
            return null;
        }
        if (!iL1IiLI.il1LilLllii()) {
            return Float.valueOf(iL1IiLI.illlI1lLIL());
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return Float.valueOf(((float) rect.width()) / ((float) rect.height()));
    }

    public static /* synthetic */ boolean Ii1liIIIiLi(int i, Size size) {
        if (size.getWidth() > i || size.getHeight() > i) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean IilL11ii1I1Il(Float f, Size size) {
        float width = (((float) size.getWidth()) / ((float) size.getHeight())) / f.floatValue();
        if (width < 0.9f || width > 1.1f) {
            return false;
        }
        return true;
    }

    @TargetApi(24)
    public static C0363o0OOOo0O i11liIIl11Ii1(String str, C0363o0OOOo0O o0oooo0o, int i, IL1IiLI iL1IiLI, boolean z) throws CameraAccessException {
        Size[] sizeArr;
        if (o0oooo0o != null) {
            return o0oooo0o;
        }
        CameraCharacteristics cameraCharacteristics = o0OOOO0o.i1LIL11l().getCameraCharacteristics(str);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (z) {
            sizeArr = streamConfigurationMap.getHighSpeedVideoSizes();
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(MediaCodec.class);
        }
        if (sizeArr == null) {
            return null;
        }
        Stream iiI1L1iI2 = Arrays.stream(sizeArr);
        if (i > 0) {
            iiI1L1iI2 = iiI1L1iI2.filter(new ILiIlILiL(i));
        }
        Float ILl1iII11Ll12 = ILl1iII11Ll1(iL1IiLI, cameraCharacteristics);
        if (ILl1iII11Ll12 != null) {
            iiI1L1iI2 = iiI1L1iI2.filter(new IIlLI1lii1(ILl1iII11Ll12));
        }
        Optional iiI1L1iI3 = iiI1L1iI2.max(new IlIIi1I1i(ILl1iII11Ll12));
        if (!iiI1L1iI3.isPresent()) {
            return null;
        }
        Size size = (Size) iiI1L1iI3.get();
        return new C0363o0OOOo0O(size.getWidth(), size.getHeight());
    }

    public static String i1iiLIil1ILi(String str, IIiILIi1L iIiILIi1L) throws CameraAccessException, i1iliIlLli {
        CameraManager i1LIL11l2 = o0OOOO0o.i1LIL11l();
        String[] cameraIdList = i1LIL11l2.getCameraIdList();
        if (str != null) {
            if (Arrays.asList(cameraIdList).contains(str)) {
                return str;
            }
            C0525o0oOO.illlI1lLIL(C0387o0OOoO0o.iiI1L1iI("W6a47N08hgVxs72pxjmG\n", "GMfVia9dpnI=\n") + str + C0387o0OOoO0o.iiI1L1iI("pZZ0HwKKiUHrnBE=\n", "hfgbayLs5jQ=\n") + C0167o00OoOOO.iiIliillii(false));
            throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("0M0AtL6n3Iv3jAO+uOaajebCCQ==\n", "k6xt0czG/OI=\n"));
        } else if (iIiILIi1L != null) {
            for (String str2 : cameraIdList) {
                if (iIiILIi1L.illlI1lLIL() == ((Integer) i1LIL11l2.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING)).intValue()) {
                    return str2;
                }
            }
            return null;
        } else if (cameraIdList.length > 0) {
            return cameraIdList[0];
        } else {
            return null;
        }
    }

    public void I11lLL1() {
        CameraDevice cameraDevice = this.IilL11ii1I1Il;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        HandlerThread handlerThread = this.i111iLiiIIill;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public boolean IiIIlIL(int i) {
        if (this.il1LilLllii != null) {
            return false;
        }
        this.iiIliillii = i;
        return true;
    }

    public void IiiL1llIIi() {
        C0254o00oo0o o00oo0o = this.iL1LIlIlI;
        if (o00oo0o != null) {
            o00oo0o.I1iIiIi();
            this.iL1LIlIlI = null;
        }
    }

    @TargetApi(31)
    public final CameraCaptureSession i111iLiiIIill(CameraDevice cameraDevice, Surface surface) throws CameraAccessException, InterruptedException {
        CompletableFuture iiI1L1iI2 = IL1i1iLI1l.iiI1L1iI();
        List asList = Arrays.asList(new OutputConfiguration[]{IIll1lIL.iiI1L1iI(surface)});
        boolean z = this.iLLLILIiLi1Ii;
        IIli11LiiIl.iiI1L1iI();
        cameraDevice.createCaptureSession(iIi1LiiIIl1.iiI1L1iI(z ? 1 : 0, asList, this.I1l1iIll1lIi1, new i1LIL11l(iiI1L1iI2)));
        try {
            return (CameraCaptureSession) iiI1L1iI2.get();
        } catch (ExecutionException e) {
            throw ((CameraAccessException) e.getCause());
        }
    }

    public void i1LIL11l() throws i1iliIlLli, IOException {
        HandlerThread handlerThread = new HandlerThread(C0387o0OOoO0o.iiI1L1iI("rPFXoX30\n", "z5A6xA+VAlQ=\n"));
        this.i111iLiiIIill = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.i111iLiiIIill.getLooper());
        this.Ii1liIIIiLi = handler;
        this.I1l1iIll1lIi1 = new C0085o000Oo0o(handler);
        try {
            String i1iiLIil1ILi2 = i1iiLIil1ILi(this.i1LIL11l, this.illlI1lLIL);
            this.iILiI1lll = i1iiLIil1ILi2;
            if (i1iiLIil1ILi2 != null) {
                C0525o0oOO.iiIliillii(C0387o0OOoO0o.iiI1L1iI("g80dtNrgoR+72wa7nec=\n", "1r502r3Awn4=\n") + this.iILiI1lll + C0387o0OOoO0o.iiI1L1iI("Aw==\n", "JPh6qf5b7J8=\n"));
                this.IilL11ii1I1Il = iiLIIiIli(this.iILiI1lll);
                return;
            }
            throw new i1iliIlLli(C0387o0OOoO0o.iiI1L1iI("ppuSfvq2WGWBmtUz+KNWaJqVknX0t1Vp\n", "6PSyE5vCOw0=\n"));
        } catch (CameraAccessException e) {
            e = e;
            throw new IOException(e);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException(e);
        }
    }

    public final CaptureRequest iL1LIlIlI(Surface surface) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest = this.IilL11ii1I1Il.createCaptureRequest(3);
        createCaptureRequest.addTarget(surface);
        if (this.I11lLL1 > 0) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.I11lLL1), Integer.valueOf(this.I11lLL1)));
        }
        return createCaptureRequest.build();
    }

    public C0363o0OOOo0O iiI1L1iI() {
        return this.i1L1lLllLLlIi;
    }

    public boolean iiIliillii() {
        return this.iiLIIiIli.get();
    }

    @SuppressLint({"MissingPermission"})
    @TargetApi(31)
    public final CameraDevice iiLIIiIli(String str) throws CameraAccessException, InterruptedException {
        CompletableFuture iiI1L1iI2 = IL1i1iLI1l.iiI1L1iI();
        o0OOOO0o.i1LIL11l().openCamera(str, new iiI1L1iI(iiI1L1iI2), this.Ii1liIIIiLi);
        try {
            return (CameraDevice) iiI1L1iI2.get();
        } catch (ExecutionException e) {
            throw ((CameraAccessException) e.getCause());
        }
    }

    @TargetApi(31)
    public final void iiiiI1iILL11I(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest) throws CameraAccessException, InterruptedException {
        illlI1lLIL illli1llil = new illlI1lLIL();
        if (this.iLLLILIiLi1Ii) {
            CameraConstrainedHighSpeedCaptureSession iiI1L1iI2 = I1lLI1lLiLL.iiI1L1iI(cameraCaptureSession);
            int unused = iiI1L1iI2.setRepeatingBurst(iiI1L1iI2.createHighSpeedRequestList(captureRequest), illli1llil, this.Ii1liIIIiLi);
            return;
        }
        cameraCaptureSession.setRepeatingRequest(captureRequest, illli1llil, this.Ii1liIIIiLi);
    }

    public void iilLiIIIi11i(Surface surface) throws IOException {
        if (this.IL1lILLLL1L != null) {
            C0254o00oo0o o00oo0o = new C0254o00oo0o(new i11liIIl11Ii1(this.IL1lILLLL1L), ILl1iII11Ll1);
            this.iL1LIlIlI = o00oo0o;
            surface = o00oo0o.iILiI1lll(this.I1iIiIi, this.i1L1lLllLLlIi, surface);
        }
        try {
            iiiiI1iILL11I(i111iLiiIIill(this.IilL11ii1I1Il, surface), iL1LIlIlI(surface));
        } catch (CameraAccessException | InterruptedException e) {
            IiiL1llIIi();
            throw new IOException(e);
        }
    }

    public void iilLil1i11I1() throws IOException {
        try {
            C0363o0OOOo0O i11liIIl11Ii1 = i11liIIl11Ii1(this.iILiI1lll, this.il1LilLllii, this.iiIliillii, this.iilLil1i11I1, this.iLLLILIiLi1Ii);
            this.I1iIiIi = i11liIIl11Ii1;
            if (i11liIIl11Ii1 != null) {
                C0494o0o000Oo o0o000oo = new C0494o0o000Oo(i11liIIl11Ii1);
                Rect rect = this.IiIIlIL;
                if (rect != null) {
                    o0o000oo.i1LIL11l(rect, false);
                }
                C0263o00ooOO0 o00oooo0 = this.iilLiIIIi11i;
                if (o00oooo0 != C0263o00ooOO0.i1LIL11l) {
                    o0o000oo.il1LilLllii(o00oooo0);
                }
                o0o000oo.iiI1L1iI((double) this.IiiL1llIIi);
                this.IL1lILLLL1L = o0o000oo.I11lLL1();
                this.i1L1lLllLLlIi = o0o000oo.iLLLILIiLi1Ii().iiIliillii(this.iiIliillii).I11lLL1();
                return;
            }
            throw new IOException(C0387o0OOoO0o.iiI1L1iI("63HmQUr6Ta7cPuBIQr9AtYh98kBLqELh23fpSA==\n", "qB6TLS7aI8E=\n"));
        } catch (CameraAccessException e) {
            throw new IOException(e);
        }
    }

    public void iLLLILIiLi1Ii() {
    }

    public class illlI1lLIL extends CameraCaptureSession.CaptureCallback {
        public illlI1lLIL() {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("HV0d0BcdY6M/TATAFxljpj9VHNABRmOmLF0d0EU=\n", "XjxwtWV8Q8A=\n") + captureFailure.getFrameNumber());
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }
    }
}
