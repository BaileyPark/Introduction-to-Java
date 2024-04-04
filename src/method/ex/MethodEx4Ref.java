package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myAmount = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택:");
            int choise = scanner.nextInt();
            scanner.nextLine();
//            if (choise == 1) {
//                myAmount = deposit(scanner, myAmount);
//            } else if (choise == 2) {
//                myAmount = withdraw(scanner, myAmount);
//            } else if (choise == 3) {
//                System.out.println("현재 잔액: " + myAmount + "원");
//            } else if (choise == 4) {
//                System.out.println("시스템을 종료합니다.");
//                break;
//            } else {
//                System.out.println("잘못 입력하셨습니다.\n다시 입력하세요.");
//            }

            switch (choise) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    myAmount = deposit(myAmount, depositAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    myAmount = withdraw(myAmount, withdrawAmount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + myAmount + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.\n다시 입력하세요.");
            }
        }
    }
    public static int deposit(Scanner scanner, int myAmount) {
        System.out.print("입금액을 입력하세요: ");
        int depositAmount = scanner.nextInt();
        myAmount += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + myAmount + "원");

        return myAmount;
    }

    public static int deposit(int myAmount, int depositAmount) {

        myAmount += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + myAmount + "원");

        return myAmount;
    }

    public static int withdraw(Scanner scanner, int myAmount) {
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = scanner.nextInt();
        if (myAmount >= withdrawAmount) {
            myAmount -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + myAmount + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하여 했으나 잔액이 부족합니다.");
        }
        return myAmount;
    }

    public static int withdraw(int myAmount, int withdrawAmount) {
        if (myAmount >= withdrawAmount) {
            myAmount -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + myAmount + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하여 했으나 잔액이 부족합니다.");
        }
        return myAmount;
    }
}