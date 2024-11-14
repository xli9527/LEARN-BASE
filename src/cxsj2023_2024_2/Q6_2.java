package cxsj2023_2024_2;

import java.util.Scanner;

public class Q6_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }


        int map[][]=new int[max][n];

        for (int i = 0; i < n; i++) {
            for (int j = min-1; j < max; j++) {
                if (j < arr[i]){
                    map[j][i]=1;
                }
            }
        }

        int answer[] = new int[max];

        for (int i = 0; i < min; i++) {
            answer[i] = n;
        }



        for (int i = min-1; i < max; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1){
                    count++;
                }
            }
            answer[i] = count;
        }

        int temp = 0;

        for (int i = 0; i < max-1; i++) {
            for (int j = 0; j < max-1-i; j++) {
                if (answer[j] < answer[j+1]){
                    temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }


        System.out.println(max);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
