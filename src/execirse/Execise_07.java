package execirse;

import java.util.Scanner;

public class Execise_07 {
    public static void main(String[] args) {
        //B1: Nhập 3 cạnh tam giác
        //B2: Kiểm tra 3 cạnh có phải tam giác không
        //B3: Nếu là tam giác thì tính diện tích và chu vi tam giác
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất:");
        float firstSide = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào cạnh thứ hai:");
        float secondSide = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào cạnh thứ ba:");
        float thirthSide = Float.parseFloat(scanner.nextLine());
        if ((firstSide + secondSide > thirthSide) && (secondSide + thirthSide > firstSide) && (thirthSide + firstSide > secondSide)) {
            //Tính diện tích và chu vi
            float c = firstSide + secondSide + thirthSide;
            float s = (float) Math.sqrt(c / 2 * (c / 2 - firstSide) * (c / 2 - secondSide) * (c / 2 - thirthSide));
            System.out.printf("Diện tích: %.2f - Chu vi: %.2f\n", s, c);
        } else {
            System.out.printf("%f, %f và %f không phải là 3 cạnh của tam giác\n", firstSide, secondSide, thirthSide);
        }
    }
}
