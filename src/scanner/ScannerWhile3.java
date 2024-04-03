package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 종료");
        while (true) {
            System.out.print("수를 입력해주세요: ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println("모든 수의 합계는 " + sum);

    }
}
