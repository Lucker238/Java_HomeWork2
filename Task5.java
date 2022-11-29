public class Task5 {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 56;
        int i3 = 5;
        int i4 = 15;

        String s1 = Task4.magic(i1, i2);
        String s2 = Task4.magic(i3, i4);

        System.out.println(conversion(s1));
        System.out.println(conversion(s2));

    }

    public static String conversion(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(sb.indexOf("="), "равно");
        sb.deleteCharAt(sb.indexOf("="));
        sb.insert(sb.indexOf("="), "равно");
        sb.deleteCharAt(sb.indexOf("="));
        sb.insert(sb.indexOf("="), "равно");
        sb.deleteCharAt(sb.indexOf("="));
        return sb.toString();
    }
}
