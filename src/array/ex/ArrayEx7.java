package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] students = new int[4][3];
        String subject[] = {"국어", "영어", "수학"};
        int[][] sum = new int[4][2];
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수:");
                sum[i][0] += students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.print(i+1 + "번 학생의 총점:" + sum[i][0]);
            double average = (double)sum[i][0]/students[i].length;
            System.out.println(", 평균: " + average);
        }

    }
}
