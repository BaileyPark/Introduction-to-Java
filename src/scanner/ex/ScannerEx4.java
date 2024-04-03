package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();

//        for (int i = 1; i <= 9; i++) {
//            if (n == i) {
//                for (int j = 1; j <= 9; j++) {
//                    System.out.println(i + " x " + j + " = " + i * j);
//                }
//            }
//        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }
}
