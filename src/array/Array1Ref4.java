package array;

public class Array1Ref4 {
    public static void main(String[] args) {
//        int[] students; // 배열 변수 선언
//        students = new int[5]; // 배열 생성
//        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 선언과 생성과 초기화
//        int[] students = {90, 80, 70, 60, 50}; // 배열 선언과 생성과 초기화(생략)
        // 생략 버전은 선언과 생성 및 초기화를 분리시키면 안됨
//        int[] students;
//        students = {90, 80, 70, 60, 50}; // java: illegal start of expression
        int[] students = {90, 80, 70, 60, 50};


        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 = " + students[i]);
        }
    }
}
