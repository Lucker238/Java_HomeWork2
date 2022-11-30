import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder("kfp");
        String result = "";
        ArrayList<Integer> in = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (str.charAt(i) == sb.charAt(j) ){
                    in.add(i);
                    sb.delete(j, j+1);
                }
            }
        }
        result = str.substring(Collections.min(in), Collections.max(in)+1);
        System.out.println(result);
    }
}
