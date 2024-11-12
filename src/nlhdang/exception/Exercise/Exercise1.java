package nlhdang.exception.Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");

        try {
            int number = Integer.parseInt(scanner.nextLine());
            checkNegativeNumber(number);
            System.out.println("Số bạn nhập là: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkNegativeNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Số âm không hợp lệ.");
        }
    }
}
