package LeTuan.Buoi1;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        //Viế́t chương trình yêu cầ ̀ u người dùng nhậ ̣̂ p mộ ̣̂t số́ nguyên dương N, sau đó tính tổng tấ́t
        //cả các số́ từ 1 đế́n N sử dụ ̣ ng vòng lặ ̣ ̆p.

        int n =0;
        double tong=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("TÍNH TỔNG TỪ 1 ĐẾN N \n(N được người dùng nhập)");
        System.out.print("Nhap vao so nguyen dương:");
        n = scanner.nextInt();
        while (n<=0){
            System.out.print("Nhap lai so nguyen duong:");
            n = scanner.nextInt();
        }

        for (int i =1 ; i<=n; i++) {
            tong = tong + i;
        }
System.out.printf("Tổng dãy số nguyên từ 1 đến %d là %f", n , tong);

    }
}
