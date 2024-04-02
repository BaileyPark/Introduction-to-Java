package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 1;
        while (count <= 10) {
            int average = num % 2;
            if (average == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
