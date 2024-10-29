package Buoi1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BaiTap3 {
    public static void main(String[] args) {
        //Tính tổng các số từ 1 đến N
        //Viết chương trình yêu cầu người dùng nhập một số nguyên dương N,
        // sau đó tính tổng tất cả các số từ 1 đến N sử dụng vòng lặp.
        int Tong = 0;
        int N;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhap so N: ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Nhap sai, Vui long nhap lai!");
            }

        } while (N <= 0);

        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            //  Tong += i;

        }
        //System.out.println("Tong day so tu 1 den " + N + " la=" + Tong);

    }
}
