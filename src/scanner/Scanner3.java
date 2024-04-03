package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 받기: ");
        int num1 = scanner.nextInt();

        System.out.print("정수 받기: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 수는: " + num1);
        } else if(num1 < num2){
            System.out.println("더 큰 수는: " + num2);
        } else {
            System.out.println("두 수는 같다");
        }

    }
}
