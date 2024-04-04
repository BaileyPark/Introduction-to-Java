package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myAmount = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택:");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                scanner.nextLine();
                myAmount += depositAmount;
                System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + myAmount + "원");
            } else if (choose == 2) {
                System.out.print("입금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                scanner.nextLine();
                if (myAmount >= withdrawAmount) {
                    myAmount -= withdrawAmount;
                    System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + myAmount + "원");
                } else {
                    System.out.println(withdrawAmount + "원을 출금하여 했으나 잔액이 부족합니다.");
                }
            } else if (choose == 3) {
                System.out.println("현재 잔액: " + myAmount);
            } else if (choose == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력하세요.");
            }
        }
    }

    public static void deposit(int number) {


    }
}