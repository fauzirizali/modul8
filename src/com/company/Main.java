package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah deret Fibonacci : ");
        int x = scan.nextInt();
        long fibon[] = new long[x];

        fibon[0] = 0;
        fibon[1] = 1;

        for (int i = 2; i < x; i++) {
            fibon[i] = fibon[i-1] + fibon [i-2];

        }
        for (int i = 0; i < x; i++) {
            System.out.print(fibon[i] + " ");

        }
    }
}
