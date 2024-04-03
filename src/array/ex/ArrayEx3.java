package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력");
//        int[] numbersReverse = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbersReverse[numbersReverse.length-(i+1)] = numbers[i];
//        }
//        for (int i = 0; i < numbersReverse.length; i++) {
//            System.out.print(numbersReverse[i]);
//            if (i < numbersReverse.length - 1) {
//                System.out.print(", ");
//            }
//        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
    }
}
