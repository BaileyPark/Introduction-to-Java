package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요 (나가시려면 exit를 입력하세요): ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            } else {
                System.out.println("입력한 문자열은 = " + str);
            }
        }
    }
}
