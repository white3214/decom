package top.tntok.autobot;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.concurrent.Semaphore;

/* renamed from: top.tntok.autobot.o00oo0o  reason: case insensitive filesystem */
public final class C0254o00oo0o {
    public static Handler IiiL1llIIi;
    public static boolean iILiI1lll;
    public static HandlerThread iilLiIIIi11i;
    public Surface I11lLL1;
    public boolean IiIIlIL;
    public EGLContext i1LIL11l;
    public int iLLLILIiLi1Ii;
    public EGLDisplay iiI1L1iI;
    public final float[] iiIliillii;
    public SurfaceTexture iilLil1i11I1;
    public final C0251o00oo0O0 il1LilLllii;
    public EGLSurface illlI1lLIL;

    public C0254o00oo0o(C0251o00oo0O0 o00oo0o0, float[] fArr) {
        this.il1LilLllii = o00oo0o0;
        this.iiIliillii = fArr;
    }

    public static void IiIIlIL() {
        HandlerThread handlerThread;
        synchronized (C0254o00oo0o.class) {
            handlerThread = iilLiIIIi11i;
            iILiI1lll = true;
        }
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public static void iiIliillii() throws InterruptedException {
        HandlerThread handlerThread;
        synchronized (C0254o00oo0o.class) {
            handlerThread = iilLiIIIi11i;
        }
        if (handlerThread != null) {
            handlerThread.join();
        }
    }

    public static synchronized void il1LilLllii() {
        synchronized (C0254o00oo0o.class) {
            try {
                if (iilLiIIIi11i == null) {
                    if (!iILiI1lll) {
                        HandlerThread handlerThread = new HandlerThread(C0387o0OOoO0o.iiI1L1iI("zdgi8GovS5/sxiLs\n", "gqhHni1jGeo=\n"));
                        iilLiIIIi11i = handlerThread;
                        handlerThread.start();
                        IiiL1llIIi = new Handler(iilLiIIIi11i.getLooper());
                    } else {
                        throw new IllegalStateException(C0387o0OOoO0o.iiI1L1iI("bZ2GJSKVjnla0ponL8HAWV6XnQ4K55V4QJeBaSfTlHNc0po9ZtyTNl+Hmj0=\n", "LvLzSUa14BY=\n"));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ void I11lLL1(C0363o0OOOo0O o0oooo0o, C0363o0OOOo0O o0oooo0o2, Surface surface, Throwable[] thArr, Semaphore semaphore) {
        try {
            IiiL1llIIi(o0oooo0o, o0oooo0o2, surface);
        } catch (Throwable th) {
            semaphore.release();
            throw th;
        }
        semaphore.release();
    }

    public void I1iIiIi() {
        Semaphore semaphore = new Semaphore(0);
        IiiL1llIIi.post(new C0250o00oo0O(this, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void IiiL1llIIi(C0363o0OOOo0O o0oooo0o, C0363o0OOOo0O o0oooo0o2, Surface surface) throws C0252o00oo0OO {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.iiI1L1iI = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGL14.eglChooseConfig(this.iiI1L1iI, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (iArr2[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.iiI1L1iI, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    this.i1LIL11l = eglCreateContext;
                    if (eglCreateContext != null) {
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.iiI1L1iI, eGLConfig, surface, new int[]{12344}, 0);
                        this.illlI1lLIL = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            EGL14.eglDestroyContext(this.iiI1L1iI, this.i1LIL11l);
                            EGL14.eglTerminate(this.iiI1L1iI);
                            throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("SFyMVFiPoelhHYZKWIr1+C54onQdnOjzalKSGE6e8/tvXoA=\n", "Dj3lOD3rgZ0=\n"));
                        } else if (EGL14.eglMakeCurrent(this.iiI1L1iI, eglCreateWindowSurface, eglCreateWindowSurface, this.i1LIL11l)) {
                            int[] iArr3 = new int[1];
                            GLES20.glGenTextures(1, iArr3, 0);
                            o000OOO.iiI1L1iI();
                            this.iLLLILIiLi1Ii = iArr3[0];
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            o000OOO.iiI1L1iI();
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            o000OOO.iiI1L1iI();
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            o000OOO.iiI1L1iI();
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            o000OOO.iiI1L1iI();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.iLLLILIiLi1Ii);
                            this.iilLil1i11I1 = surfaceTexture;
                            surfaceTexture.setDefaultBufferSize(o0oooo0o.illlI1lLIL(), o0oooo0o.iiI1L1iI());
                            this.I11lLL1 = new Surface(this.iilLil1i11I1);
                            this.il1LilLllii.i1LIL11l();
                            this.iilLil1i11I1.setOnFrameAvailableListener(new C0253o00oo0Oo(this, o0oooo0o2), IiiL1llIIi);
                        } else {
                            EGL14.eglDestroySurface(this.iiI1L1iI, this.illlI1lLIL);
                            EGL14.eglDestroyContext(this.iiI1L1iI, this.i1LIL11l);
                            EGL14.eglTerminate(this.iiI1L1iI);
                            throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("Roww+n9NYPRvzTT3cUxgxUehefV1RzTleJl59W9bMuVumQ==\n", "AO1ZlhopQIA=\n"));
                        }
                    } else {
                        EGL14.eglTerminate(this.iiI1L1iI);
                        throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("Y8Fz9lh8KOhKgHnoWHl8+QXlXdYde2fyUcVi7g==\n", "JaAamj0YCJw=\n"));
                    }
                } else {
                    EGL14.eglTerminate(this.iiI1L1iI);
                    throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("TogYdF5Pj0Z0xh9/XE6Pd0jUWVN1Zo9RdIgff1U=\n", "G+Z5FjIqrzI=\n"));
                }
            } else {
                throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("vNXdtWUyUZSGm9W5YCMYgYXSxrIpEjas2I8=\n", "6bu81wlXceA=\n"));
            }
        } else {
            throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("d4ndIGBmEYJNx9sneCN0sW7WiGJoakKGTobF\n", "Iue8QgwDMfY=\n"));
        }
    }

    public Surface iILiI1lll(C0363o0OOOo0O o0oooo0o, C0363o0OOOo0O o0oooo0o2, Surface surface) throws C0252o00oo0OO {
        il1LilLllii();
        Semaphore semaphore = new Semaphore(0);
        Throwable[] thArr = new Throwable[1];
        IiiL1llIIi.post(new C0255o00oo0o0(this, o0oooo0o, o0oooo0o2, surface, thArr, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Throwable th = thArr[0];
        if (th == null) {
            return this.I11lLL1;
        }
        if (th instanceof C0252o00oo0OO) {
            throw ((C0252o00oo0OO) th);
        }
        throw new C0252o00oo0OO(C0387o0OOoO0o.iiI1L1iI("dokNmP5N3SlZlQGFvWrfI1m9ONbvUMEoUohUn/NM22ZRmx2a+EE=\n", "N/p09p0lr0Y=\n"), th);
    }

    public final /* synthetic */ void iLLLILIiLi1Ii(Semaphore semaphore) {
        this.IiIIlIL = true;
        this.iilLil1i11I1.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null, IiiL1llIIi);
        this.il1LilLllii.iiI1L1iI();
        GLES20.glDeleteTextures(1, new int[]{this.iLLLILIiLi1Ii}, 0);
        o000OOO.iiI1L1iI();
        EGL14.eglDestroySurface(this.iiI1L1iI, this.illlI1lLIL);
        EGL14.eglDestroyContext(this.iiI1L1iI, this.i1LIL11l);
        EGL14.eglTerminate(this.iiI1L1iI);
        this.iiI1L1iI = EGL14.EGL_NO_DISPLAY;
        this.i1LIL11l = EGL14.EGL_NO_CONTEXT;
        this.illlI1lLIL = EGL14.EGL_NO_SURFACE;
        this.iilLil1i11I1.release();
        this.I11lLL1.release();
        semaphore.release();
    }

    public final void iilLiIIIi11i(C0363o0OOOo0O o0oooo0o) {
        GLES20.glViewport(0, 0, o0oooo0o.illlI1lLIL(), o0oooo0o.iiI1L1iI());
        o000OOO.iiI1L1iI();
        this.iilLil1i11I1.updateTexImage();
        float[] fArr = this.iiIliillii;
        if (fArr == null) {
            fArr = new float[16];
            this.iilLil1i11I1.getTransformMatrix(fArr);
        }
        this.il1LilLllii.illlI1lLIL(this.iLLLILIiLi1Ii, fArr);
        EGLExt.eglPresentationTimeANDROID(this.iiI1L1iI, this.illlI1lLIL, this.iilLil1i11I1.getTimestamp());
        EGL14.eglSwapBuffers(this.iiI1L1iI, this.illlI1lLIL);
    }

    public final /* synthetic */ void iilLil1i11I1(C0363o0OOOo0O o0oooo0o, SurfaceTexture surfaceTexture) {
        if (!this.IiIIlIL) {
            iilLiIIIi11i(o0oooo0o);
        }
    }

    public C0254o00oo0o(C0251o00oo0O0 o00oo0o0) {
        this(o00oo0o0, (float[]) null);
    }
}
