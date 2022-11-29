public class Task3 {
    public static void main(String[] args) {
        String str1 = "Javas";
        String str2 = "Java";
        String str3 = "avaJ";
        String str4 = "JavaScript";
        String str5 = "java";

        System.out.println(recursRevers(str1));
        System.out.println(recursRevers(str2));
        System.out.println(recursRevers(str3));
        System.out.println(recursRevers(str4));
        System.out.println(recursRevers(str5));

    }

    public static String recursRevers(String input){
        if (input.length() == 0){
            return input;
        }
        else {
            return Character.toString(input.charAt(input.length()-1)) + recursRevers(input.substring(0, input.length()-1));
        }
    }
}
