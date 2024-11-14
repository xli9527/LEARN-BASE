package cxsj2023_2024_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int hit[] = new int[n];
        int pf = 0;
        int gr = 0;
        int gd = 0;
        int ms = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            hit[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = Math.abs(arr[i] - hit[i]);
            if (temp>30){
                ms++;
            } else if (temp > 20 && temp <= 30){
                gd++;
            } else if (temp > 10 && temp <= 20){
                gr++;
            } else if (temp >= 0 && temp <= 10){
                pf++;
            }
        }

        System.out.println(pf);
        System.out.println(gr);
        System.out.println(gd);
        System.out.println(ms);
    }
}
