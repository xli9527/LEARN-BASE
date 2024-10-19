package cxsj2023;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String answer="No";
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int a= scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            if(a+b+c<1000 && a%12==0 && a!=0 && a-b>b-c){
                answer="Yes";
            }
        }
        scan.close();
        System.out.println(answer);
    }
}
