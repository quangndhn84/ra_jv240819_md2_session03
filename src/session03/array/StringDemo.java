package session03.array;

public class StringDemo {
    public static void main(String[] args) {
        //1. Khai báo và khởi tạo chuỗi String Literal --> Nguyên thủy --> immutable --> String Pool (trong heap)
        String str1 = "Rikkei Academy";
        String str2 = "Rikkeisoft";
        //2. Khai báo và khởi tạo chuỗi với new (khởi tạo đối tượng) --> tham chiếu  --> trong heap
        String str3 = new String("Rikkei Education");
        //3. So sánh chuỗi
        //3.1. str1.equals(str2): So sánh giá trị của str1 và str2, bằng --> true, không bằng --> false
        String str4 = new String("Rikkei Academy");
        String str5 = "Rikkei Academy";
        System.out.println("So sánh str1 và str4 với equals: " + str1.equals(str4));//true
        System.out.println("So sánh str1 và str5 với equals: " + str1.equals(str5));//true
        //3.2. str1==str2: So sánh tuyệt đối cả giá trị và địa chỉ ô nhó của str1 và str2, bằng --> true, không bằng --> false
        System.out.println("So sánh str1 và str4 với ==: " + (str1 == str4));//false
        System.out.println("So sánh str1 và str5 với ==: " + (str1 == str5));//true
        //4. int str.length(): trả về độ dài của chuỗi
        System.out.println("Độ dài của chuỗi str1 là: " + str1.length());
        //5. char str.chartAt(index): trả ra ký tự tại chỉ số index của chuỗi
        System.out.println("Ký tự có chỉ số 2 trong chuỗi str1 là: " + str1.charAt(2));
        //6. String str1.concat(str2): Trả ra chuỗi mới bằng cách cộng 2 chuỗi str1 và str2
        System.out.println("Cộng 2 chuỗi str1 và str2: " + str1.concat(str2));
        //7. String str.toUpperCase(): trả ra chuỗi mới bằng cách viết hoa các ký tự
        System.out.println("Viết hoa chuỗi str1: " + str1.toUpperCase());
        //8. String str.toLowerCase(): trả ra chuỗi mới bằng cách viết thường các ký tự
        System.out.println("Viết thường chuỗi str1: " + str1.toLowerCase());
        //9. String str.trim(): Cắt khoảng trắng 2 đầu chuỗi
        String str6 = "           HỌC VIỆN RIKKEI            ";
        System.out.println("Cắt khoảng trắng 2 đầu chuỗi str6: " + str6.trim());
        //10. boolean str1.equalIgnoreCase(str2): so sánh không phân biệt hoa thường
        String str7 = "RIKKei aCaDemy";
        System.out.printf("So sánh không phân biệt hoa thường chuỗi str1 và str7: " + str1.equalsIgnoreCase(str7));
        //11. int str1.compareTo(str2): Trả ra giá trị lệch của 2 chuỗi theo bảng mã ASCCI
        String str8 = "ABCEDF";
        String str9 = "ABCDEFG";
        String str10 = "ABCDEFG";
        System.out.println("So sánh str8 và str9: " + str8.compareTo(str9));
        System.out.printf("So sánh str9 và str10:" + str9.compareTo(str10));
        //12. boolean str1.contains(str2): Kiểm tra str2 có trong str1 hay không
        String str11 = "Academy";
        System.out.println("Kiểm tra str11 có trong str1 hay không: " + str1.contains(str11));
        //13. int str1.indexOf(str2): trả ra chỉ số của chuỗi str2 trong chuôi str1
        String str12 = "kkei";
        //Rikkei Academy Rikkei
        System.out.println("Kiểm tra str12 nằm ở chỉ số nào trong str1: " + str1.indexOf(str12));
        //14. String str1.replace(oldStr, newStr): Thay thế chuỗi oldStr bằng chuỗi newStr trong str1
        System.out.println("Thay thế chuỗi Academy thành Học viện trong str1: " + str1.replace("Academy", "Học viện"));
        //15. boolean str1.startWith(str2): Kiểm tra chuỗi str1 có phải bắt đầu là str2 hay không
        System.out.println("Kiểm tra chuỗi str1 có phải bắt đầu là Rikk: " + str1.startsWith("Rikk"));
        //16. boolean str1.endWith(str2): kiểm tra chuỗi str1 kết thúc là chuỗi str2 hay không
        System.out.println("Kiểm tra chuỗi str1 kết thúc là chuỗi demy: " + str1.endsWith("demy"));
        //17: String[] str.split(regex): Cắt chuỗi theo regex
        String[] arrStr = str1.split(" ");
        System.out.println("Các phần tử trong mảng arrStr là: ");
        for (String element : arrStr) {
            System.out.println(element);
        }
        //18: String str.subString(int beginIndex): Cắt chuỗi từ chỉ số beginIndex đến cuối
        System.out.println("Cắt chuỗi str1 từ chỉ số 7 đến cuối: " + str1.substring(7));
        //19. String str.subString(int beginIndex, int endIndex): cắt chuỗi từ chỉ số beginIndex đến endIndex-1
        System.out.println("Cắt chuỗi str1 từ chỉ số 7 đến 10: " + str1.substring(7, 10));

    }
}
