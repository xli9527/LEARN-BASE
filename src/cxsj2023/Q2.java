package cxsj2023;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int count=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int num = scan.nextInt();
            while(num>0){
                int temp=num;
                if(temp%10%2==0){
                    count++;
                }
                num/=10;
            }
        }
        scan.close();
        System.out.println(count);

//        Have some problem TAT
    }
}
