package top.tntok.autobot;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

public class IillLI1llIL1 {
    public static String i1LIL11l(Bundle bundle) {
        return iiI1L1iI(bundle).toString();
    }

    public static JSONObject iiI1L1iI(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                try {
                    jSONObject.put(next, JSONObject.wrap(bundle.get(next)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }
}
