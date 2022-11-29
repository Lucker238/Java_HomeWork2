public class Task2 {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "avaJ";
        String str4 = "JavaScript";
        String str5 = "java";

        System.out.println(check(str1, str2));
        System.out.println(check(str1, str3));
        System.out.println(check(str1, str4));
        System.out.println(check(str1, str5));
        
    }
    public static int compare(String s1, String s2){
        int val = 0;
        val = s1.compareTo(s2);
        return val;
    }
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static boolean check(String s1, String s2){
        if (compare(s1, reverse(s2)) == 0){
            return true;
        }
        else return false;
    }
}