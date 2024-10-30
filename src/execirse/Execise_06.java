package execirse;

import java.util.Scanner;

public class Execise_06 {
    public static void main(String[] args) {
        //B1. Nhập vào 1 số nguyên
        //B2. In menu và thực hiện các chức năng theo menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("**************MENU******************");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra chia hết cho 3");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chẵn\n", number);
                    } else {
                        System.out.printf("%d là số lẻ\n", number);
                    }
                    break;
                case 2:
                    boolean isPrime = true;
                    for (int i = 2; i < Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.printf("%d là số nguyên tố\n", number);
                    } else {
                        System.out.printf("%d không phải là số nguyên tố\n", number);
                    }
                    break;
                case 3:
                    if (number % 3 == 0) {
                        System.out.printf("%d chia hết cho 3\n", number);
                    } else {
                        System.out.printf("%d không chia hết cho 3\n", number);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        } while (true);
    }
}
