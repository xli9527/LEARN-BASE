package com.yyrss.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        int Q = scan.nextInt();
        int K = scan.nextInt();
        int count = P;
        int stu = Q;

        while(stu < N){
            count++;
            stu += K;
        }

        System.out.println(count);

    }
}
