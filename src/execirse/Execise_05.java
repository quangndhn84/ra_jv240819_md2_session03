package execirse;

public class Execise_05 {
    public static void main(String[] args) {
        //Hiển thị các số nguyên tố nhỏ hơn 100
        //B1: Dùng vòng lặp for (i) chạy từ 2-->100
        //B2. Kiểm tra i có phải số nguyên tố hay không, nguyên tố thì in ra
        //B2.1. Khai báo và khởi tạo biến (cờ): isPrime = true (là số nguyên tố)
        //B2.2. Dùng vòng lặp for (j) chạy từ 2 --> sqrt(i)
        //B2.3. Kiểm tra j có phải là ước của i hay không, nếu j là ước --> isPrime = false (Không phải là số nguyên tố)
        //B2.4. Sau khi kết thúc vòng for j thì kiểm tra isPrime giá trị là gì
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;//(Nguyên tố)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;//Không phải là số nguyên tố
                    break;
                }
            }
            if (isPrime) {
                //Đây là số nguyên tố
                System.out.printf("%d\t", i);
            }
        }
    }
}
