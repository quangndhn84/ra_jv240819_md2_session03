package session03.array;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //1. Khai báo mảng 2 chiều số nguyên gồm 3 dòng và 4 cột
        int[][] numbers = new int[3][4];
        //2. Khai báo và khởi tạo mảng 2 chiều số thực gồm 2 dòng và 3 cột
        float[][] arrFloat = {{1, 2, 3}, {4, 5, 6}};
        //3. In ra giá trị các phần tử của mảng số thực theo ma trận
        System.out.println("Các phần tử mảng số thực theo ma trận:");
        for (int i = 0; i < arrFloat.length; i++) {//Chạy theo dòng
            for (int j = 0; j < arrFloat[i].length; j++) {//chạy theo cột
                System.out.printf("%10.1f", arrFloat[i][j]);
            }
            System.out.printf("\n");
        }
        //4. Nhập giá trị cho các phần tử mảng số nguyên
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d]=", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //5. Tính tổng các phần tử có giá trị lẻ trong mảng
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 != 0) {
                    sumNumbers += numbers[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử lẻ trong mảng là: " + sumNumbers);
    }
}
