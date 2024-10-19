package cxsj2023;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            System.out.println("I have already done " + scan.nextInt() + " questions!");
        }
    }
}
