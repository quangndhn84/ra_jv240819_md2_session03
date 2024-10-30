package session03.array;

import java.util.Scanner;

public class OneDimensionArray {
    public static void main(String[] args) {
        /*
         * 1. Khai báo mảng
         *       Datatype[] arrayName = new Datatype[size]
         * 2. Khai báo và khởi tạo mảng
         *       Datatype[] arrayName = {value1,...,valueN}
         * 3. Truy cập phần tử mảng: arrayName[index]
         * 4. Duyệt mảng 1 chiều: dùng 1 vòng lặp
         * 5. Lấy kích cỡ (số phần tử của mảng): length
         * */
        //1. Khai báo mảng số nguyên gồm 5 phần tử
        int[] numbers = new int[5];
        //2. Khai báo mảng số thực gồm 3 phần tử
        float[] arrFloat = new float[3];
        //3. Khai báo và khởi tạo mảng chuỗi gồm 3 phần tử có giá trị là "Nguyễn Văn A","Nguyễn Văn B" và "Nguyễn Văn C"
        String[] arrStudentNames = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        //4. In ra số phần tử của mảng
        System.out.println("Số phần tử của mảng arrStudentNames là: " + arrStudentNames.length);
        //5. Khởi tạo giá trị các phần tử của mảng arrFloat
        arrFloat[0] = 3.2F;
        arrFloat[1] = -5.6F;
        arrFloat[2] = 7.9F;
//        arrFloat[3] = 5.8F; --> error: ArrayIndexOutOfBoundsException --> dừng luôn
        //6. Duyệt các phần tử của mảng arrFloat và in giá trị các phần tử ra màn hình console
        System.out.println("Các phần tủ trong mảng arrFloat là:");
        for (float element : arrFloat) {
            System.out.printf("%.1f\t", element);
        }
        System.out.printf("\n");
        //7. Nhập giá trị cho các phần tử của mảng numbers
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //8. In ra tổng các phần tủ của manảng numbers
        int sumArr = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumArr += numbers[i];
        }
        System.out.println("Tổng các phần tử trong mảng numbers là: " + sumArr);
        /*
        * 1. Khai báo mảng 1 chiều số nguyên gồm 10 phần tử
        * 2. In menu và thực hiên các chức năng theo menu
        * *************MENU*****************
        * 1. Nhập giá trị các phần tử
        * 2. In giá trị các phần tử
        * 3. In ra các phần tử có giá trị chẵn
        * 4. Tính tổng các phần tử
        * 5. Thoát
        * */
    }
}
