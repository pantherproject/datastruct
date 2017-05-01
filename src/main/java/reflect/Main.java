package reflect;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by panther on 17-4-24.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Map<String, String> stringStringMap = new HashMap<String, String>();
        stringStringMap.put("height", "1136");
        stringStringMap.put("width", "640");
        stringStringMap.put("image", "n_v1bj3gzr5vxd6vqo464jda.jpg");

        Gson gson = new Gson();
        String result = gson.toJson(stringStringMap);

        System.out.println(result);
        result = result.replaceAll("\"\\s*image\\s*\"\\s*:\\s*\"\\s*[^\"]*\"", "");
//        result = result.replaceAll("image","");
        System.out.println(result);

    }
}
