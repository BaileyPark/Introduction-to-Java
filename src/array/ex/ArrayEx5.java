package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int idx = scanner.nextInt();
        System.out.println(idx + "개의 정수를 입력하세요:");
        int[] numbers = new int[idx];
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += scanner.nextInt();
        }
        System.out.println("입력한 정수의 합계: " + sum);
        average = (double) sum/numbers.length;
        System.out.println("입력한 정수의 평균: " + average);

    }
}
