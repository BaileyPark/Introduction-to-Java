package method.ex;
public class MethodEx1Ref {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = add(a, b, c);
//        double average = average(sum, 3.0);
        System.out.println("평균값: " + average(1,2,3));

//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = add(x, y, z);
//        average = average(sum, 3.0);
        System.out.println("평균값: " + average(15,25,35));

    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int a, double b) {
        return a / b;
    }
}