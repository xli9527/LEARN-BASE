package cxsj2022_2023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a*2==b){
            System.out.println("AC");
        }  else {
            System.out.println("RE");
        }
    }
}