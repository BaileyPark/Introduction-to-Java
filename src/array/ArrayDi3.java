package array;

public class ArrayDi3 {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3]; // 행2, 열3

//        int[][] arr = new int[][]{{1,2,3},{4,5,6}}; // 행2, 열3

//        int[][] arr = new int[][]{
//                {1,2,3},
//                {4,5,6}
//        }; // 행2, 열3

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9} // 추가
        }; // 행2, 열3

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);
    }
}
