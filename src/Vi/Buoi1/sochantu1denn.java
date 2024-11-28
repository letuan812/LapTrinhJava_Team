package Buoi1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sochantu1denn {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        int sum=0;
        int N;
        Scanner scanner=new Scanner(System.in);
        // đối tượng đc đặt tên scanner, phần new ở phía sau là lấy đối tợng java gán vào biến scanner của mình
        //N=scanner.nextInt();
        do{
            System.out.println("Nhap so N:");
            N=scanner.nextInt();
            if(N<=0){
                System.out.println("Nhap lai");
            }
        }while (N<=0);
        System.out.println("cac so chan tu 1 den "+N+" la");
        for(int i=0;i<=N;i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i + "" );
            }
        }
        }
    }