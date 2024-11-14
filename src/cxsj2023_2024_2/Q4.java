package cxsj2023_2024_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        System.out.println(func1(func2(func1(n)-n))+func2(n));
    }

    public static long func1(long n){
        long solve = n*n-n+5;

        return solve;
    }

    public static long func2(long n){
        long solve = 2*n*n+n-3;

        return solve;
    }
}
