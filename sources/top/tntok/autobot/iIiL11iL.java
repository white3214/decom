package top.tntok.autobot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.os.Build;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class iIiL11iL implements I1i1iiiI {
    public AudioRecord i1LIL11l;
    public final boolean iiI1L1iI;
    public i1L1llI1LlL1l illlI1lLIL;

    public iIiL11iL(boolean z) {
        this.iiI1L1iI = z;
    }

    public void i1LIL11l() throws ILiliIiI {
        if (Build.VERSION.SDK_INT < 33) {
            C0525o0oOO.IiIIlIL(C0387o0OOoO0o.iiI1L1iI("kHn24kyeTAmibfDnRtoSQLB59uJMnlgMsHXw6kDVCAOwfOb+UdsIE7554OhGnkYPpSzh/lPORxKl\nafarQdtOD6NpsspN2loPuGiyuhA=\n", "0QySiyO+KGA=\n"));
            throw new ILiliIiI();
        }
    }

    public void iiI1L1iI() {
        AudioRecord audioRecord = this.i1LIL11l;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }

    @SuppressLint({"PrivateApi"})
    public final AudioRecord iiIliillii() throws ILiliIiI {
        String str;
        String str2;
        try {
            Class<?> cls = Class.forName(C0387o0OOoO0o.iiI1L1iI("g87lSypKTlOPxeVQJA1LCIbJ7kkqT0Mem47ATCFKRTCL2OhXInFfEYc=\n", "4qCBOUUjKn0=\n"));
            Class<?> cls2 = Class.forName(C0387o0OOoO0o.iiI1L1iI("ETOJujhG+cYdOImhNgH8nRQ0grg4Q/SLCXOsvTNG8qUZJYSmMH3ohBV5r70+Q/mNAg==\n", "cF3tyFcvneg=\n"));
            Object newInstance = cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            int i = cls.getField(C0387o0OOoO0o.iiI1L1iI("xUZLBWEhz4LXX18baivRlA==\n", "iA8TWjNug8c=\n")).getInt((Object) null);
            String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("JLof3RonFAQjkgLxKTofBA==\n", "V99riXtVc2E=\n");
            Class cls3 = Integer.TYPE;
            cls2.getMethod(iiI1L1iI2, new Class[]{cls3}).invoke(newInstance, new Object[]{Integer.valueOf(i)});
            AudioAttributes build = new AudioAttributes.Builder().setUsage(1).build();
            int i2 = cls.getField(C0387o0OOoO0o.iiI1L1iI("93tTpQCK9g/mZkChC5PlEud7S6UAkuQa4ms=\n", "pS4f4F/Ht1s=\n")).getInt((Object) null);
            cls2.getMethod(C0387o0OOoO0o.iiI1L1iI("kDFeU1u0euWdMA==\n", "8VU6HjLMKJA=\n"), new Class[]{cls3, Object.class}).invoke(newInstance, new Object[]{Integer.valueOf(i2), build});
            Object invoke = cls2.getMethod(C0387o0OOoO0o.iiI1L1iI("h4ZvHFU=\n", "5fMGcDF+Y8U=\n"), (Class[]) null).invoke(newInstance, (Object[]) null);
            cls2.getMethod(C0387o0OOoO0o.iiI1L1iI("q+uosUNr0Ryw8a+7RUnKGLLqgrNWXMsDuMWtvklf2xU=\n", "3YTB0iYovnE=\n"), new Class[]{Boolean.TYPE}).invoke(newInstance, new Object[]{Boolean.TRUE});
            Class<?> cls4 = Class.forName(C0387o0OOoO0o.iiI1L1iI("oM/56vAq70msxPnx/m3qEqXI8ujwL+IEuI/c7fsq5Cqo2Q==\n", "waGdmJ9Di2c=\n"));
            Class<?> cls5 = Class.forName(C0387o0OOoO0o.iiI1L1iI("yIOE+kkseyfEiIThR2t+fM2Ej/hJKXZq0MOh/UIscETAlcTKUyxzbcyf\n", "qe3giCZFHwk=\n"));
            Object newInstance2 = cls5.getConstructor(new Class[]{cls}).newInstance(new Object[]{invoke});
            newInstance2.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("WXt6+df4Ms1e\n", "Kh4Ov7iKX6w=\n"), new Class[]{AudioFormat.class}).invoke(newInstance2, new Object[]{iLI1L1l1li.iiI1L1iI()});
            if (this.iiI1L1iI) {
                str = "hzs/SYg9X6SUMzVRgi1Jt5c1KVaSMFymkTE4\n";
                str2 = "1XRqHc1iGeg=\n";
            } else {
                str = "oXy3ZdbEnYWydL193NSLlrFyoXo=\n";
                str2 = "8zPiMZOb28k=\n";
            }
            int i3 = cls4.getField(C0387o0OOoO0o.iiI1L1iI(str, str2)).getInt((Object) null);
            newInstance2.getClass().getMethod(C0387o0OOoO0o.iiI1L1iI("GdU6nQml+9ks3C+oFQ==\n", "arBOz2bQj7w=\n"), new Class[]{cls3}).invoke(newInstance2, new Object[]{Integer.valueOf(i3)});
            Object invoke2 = cls5.getMethod(C0387o0OOoO0o.iiI1L1iI("Ft8BAak=\n", "dKpobc2N10Q=\n"), (Class[]) null).invoke(newInstance2, (Object[]) null);
            Class<?> cls6 = Class.forName(C0387o0OOoO0o.iiI1L1iI("Js3XzdCNxj4qxtfW3srDZSPK3M/QiMtzPo3yytuNzUAoz9rcxg==\n", "R6Ozv7/kohA=\n"));
            Class<?> cls7 = Class.forName(C0387o0OOoO0o.iiI1L1iI("FcG/KDigCS4Zyr8zNucMdRDGtCo4pQRjDYGaLzOgAlAbw7I5Lu0vdR3Dvz8l\n", "dK/bWlfJbQA=\n"));
            Object newInstance3 = cls7.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{FakeContext.iiI1L1iI()});
            cls7.getMethod(C0387o0OOoO0o.iiI1L1iI("aK58Pzqf\n", "CcoYclPntLs=\n"), new Class[]{cls4}).invoke(newInstance3, new Object[]{invoke2});
            Object invoke3 = cls7.getMethod(C0387o0OOoO0o.iiI1L1iI("7oHGNY0=\n", "jPSvWekNWT0=\n"), (Class[]) null).invoke(newInstance3, (Object[]) null);
            Method declaredMethod = AudioManager.class.getDeclaredMethod(C0387o0OOoO0o.iiI1L1iI("XtZoaRTbyyhtxmtpCP/BNkXQdlMTztozTw==\n", "LLMPAGevrlo=\n"), new Class[]{cls6});
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{invoke3})).intValue();
            if (intValue == 0) {
                return (AudioRecord) cls6.getMethod(C0387o0OOoO0o.iiI1L1iI("5H9FE6nW9LjjZE8guNDav+NeSRy2\n", "hw0gct2ztc0=\n"), new Class[]{cls4}).invoke(invoke3, new Object[]{invoke2});
            }
            throw new RuntimeException(C0387o0OOoO0o.iiI1L1iI("+NOmrVVLTJ/Lw6WtSW9GgePVuOwPH1uI/sOzqkNbCQ==\n", "irbBxCY/Ke0=\n") + intValue);
        } catch (Exception e) {
            C0525o0oOO.il1LilLllii(C0387o0OOoO0o.iiI1L1iI("eSquEMsfHj5OZbgd30sFI19lugnLVh9xSim6Bc1eEzo=\n", "OkXbfK8/cFE=\n"), e);
            throw new ILiliIiI();
        }
    }

    @TargetApi(24)
    public int il1LilLllii(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return this.illlI1lLIL.iiI1L1iI(byteBuffer, bufferInfo);
    }

    public void illlI1lLIL() throws ILiliIiI {
        AudioRecord iiIliillii = iiIliillii();
        this.i1LIL11l = iiIliillii;
        iiIliillii.startRecording();
        this.illlI1lLIL = new i1L1llI1LlL1l(this.i1LIL11l);
    }
}
