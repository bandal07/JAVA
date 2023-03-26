package Lecture20230326;

import java.util.Scanner;

public class Lecture07 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print("가로를 입력하시오" + ":");
        a = scan.nextInt();
        System.out.print("세로를 입력하시오" + ":");
        b = scan.nextInt();

        if (a == b){
            System.out.println("정사각형입니다");
        }
        else{
            System.out.println("직사각형입니다");
        }

        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
