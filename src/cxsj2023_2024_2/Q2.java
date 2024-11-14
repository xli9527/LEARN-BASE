package cxsj2023_2024_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 2; i < n - 1; i++) {
            if (arr[i - 2] < arr[i - 1] && arr[i - 1] < arr[i] && arr[i + 2] < arr[i + 1] && arr[i + 1] < arr[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
