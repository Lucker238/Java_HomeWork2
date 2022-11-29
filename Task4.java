public class Task4 {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 56;
        int i3 = 5;
        int i4 = 15;

        System.out.println(magic(i1, i2));
        System.out.println(magic(i3, i4));
    }

    public static String magic(int num1, int num2){
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(num1+num2) + "; ");
        sb.append(Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + Integer.toString(num1-num2) + "; ");
        sb.append(Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + Integer.toString(num1*num2));
        return sb.toString();
    }
}
