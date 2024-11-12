package nlhdang.exception.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());
            checkAge(age);
            System.out.println("Tuổi hợp lệ: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên cho tuổi.");
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Tuổi phải từ 18 trở lên.");
        }
    }

}

