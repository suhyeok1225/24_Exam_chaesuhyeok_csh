package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1, num2, sum;
        num1 = 0;
        num2 = 1;
        sum = 1;
        for (int i = 0; i < n -1; i++) {
            System.out.print(sum +" ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    sc.close();
    }
}