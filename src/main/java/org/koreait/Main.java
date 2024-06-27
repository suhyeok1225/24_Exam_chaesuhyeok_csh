package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
           System.out.print(fun(i)+ " ");
       }
        sc.close();
    }

    private static int fun(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fun(n - 2) + fun(n - 1);
        }
    }
}