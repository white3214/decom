package top.tntok.autobot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import top.tntok.autobot.C0333o0O0ooO0;

public class IIllIIi1lliL1 {
    public static final C0240o00oOoOO i1LIL11l = new C0240o00oOoOO();
    public static final List<String> iiI1L1iI;

    static {
        ArrayList arrayList = new ArrayList();
        iiI1L1iI = arrayList;
        arrayList.add(C0387o0OOoO0o.iiI1L1iI("V2dZe798gtZSfE9ioCODjVFnQmDiMsKJEHJYf6Mkwo0=\n", "PxMtC8xGrfk=\n"));
        arrayList.add(C0387o0OOoO0o.iiI1L1iI("nY79Xg40JwyAjuZDVXUmC4ef7ABXYTlfzdTqQVk0aRiBletBQA==\n", "9fqJLjQbCG0=\n"));
        arrayList.add(C0387o0OOoO0o.iiI1L1iI("0ACVd/0Az2LZAZVo41uOYNoblSnpU5QlzRbPbuEVgTjMG4No+g==\n", "uHThB4464E0=\n"));
    }

    /* JADX INFO: finally extract failed */
    public static String i1LIL11l() {
        List<String> list = iiI1L1iI;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(list.size());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
        for (String iliililli : list) {
            executorCompletionService.submit(new iLIilIllI(iliililli));
        }
        try {
            String str = (String) executorCompletionService.take().get();
            newFixedThreadPool.shutdown();
            return str;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            newFixedThreadPool.shutdown();
            return null;
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    public static /* synthetic */ String illlI1lLIL(String str) throws Exception {
        try {
            i1LIL11l.iiIliillii(new C0333o0O0ooO0.iiI1L1iI().i111iLiiIIill(str).i1LIL11l()).il1LilLllii().IL11lll11();
            return str;
        } catch (IOException e) {
            return C0387o0OOoO0o.iiI1L1iI("F7iH8kD8K3AhvpzzVfwscCC8kO8S\n", "Usr1nTLcXxU=\n") + str + C0387o0OOoO0o.iiI1L1iI("Zlg=\n", "XHjDy3fOdh0=\n") + e.getMessage();
        }
    }
}
