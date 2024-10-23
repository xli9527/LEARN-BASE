package cxsj2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();

        while( t > 0 ){
            int n= scanner.nextInt();
            int num = 0;
            int f = 0;
            scanner.nextLine();
            String chars =scanner.nextLine();
            for (int i = 0; i < n; i++) {
                char ch = chars.charAt(i*2);
                if (ch=='C'){
                    num++;
                }  else {
                   if (f > 0){
                       System.out.print(" ");
                   } else {
                       f++;
                   }
                   System.out.print(ch);
                }
            }
            for (int i = 0; i < num ; i++) {
                if(f > 0){
                    System.out.print(" ");
                } else {
                    f++;
                }
                System.out.print("A");
            }
            System.out.println();
            t--;
        }
        scanner.close();
    }
}
