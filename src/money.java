import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền USD cần quy đổi: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double rate = 23000;
        System.out.println("Số tiền VNĐ là: " + usd*rate);
    }
}
