public class Task7 {
    public static void main(String[] args) {
        
        String s = "";
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++){
            s += "=";
        }
        // System.out.println(s);
        System.out.println(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            sb.append("=");
        }
        // System.out.println(sb);
        System.out.println(System.currentTimeMillis() - start);
        
    }

}
