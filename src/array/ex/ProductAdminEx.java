package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10;
        int idx = 0;
        String[] productNames = new String[max];
        int[] productPrices = new int[max];
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (idx >= max) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요:");
                productNames[idx] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[idx] = scanner.nextInt();

                idx++;
            } else if (menu == 2) {
                if (idx == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < idx; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("종료");
                break;

            } else {
                System.out.println("메뉴를 제대로 선택해주세요.");
            }
        }
    }
}
