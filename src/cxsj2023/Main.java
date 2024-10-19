package cxsj2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
        int a= scan.nextInt();
        int m= scan.nextInt();
        int  step=a+1;
        answer=m%step;
        }
        scan.close();
        System.out.println(answer);
    }
}
