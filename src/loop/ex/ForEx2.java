package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        int count = 2;
//        for (int num = 1; num <= 10; num++) {
//            System.out.println(count);
//            count += 2;
//        }
        for (int num = 1, count = 2; num <= 10; count += 2, num++) {
            System.out.println(count);
        }
    }
}
