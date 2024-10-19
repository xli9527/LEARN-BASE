package cxsj2023;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int count=0;
        int temp=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int n=scan.nextInt();
            int a=0;
            int b=0;
            int c=0;
            while(true){

                while (b<c){

                    while (a<b){

                        if (a+b+c==n && a*a+b*b==c*c){
                            count++;
                            temp=a*b*c;
                        }
                        a++;
                        if (a+b+c>n){
                            break;
                        }
                    }
                    b++;
                    a=0;
                    if (a+b+c>n){
                        break;
                    }
                }
                c++;
                b=0;
                if (a+b+c>n){
                    break;
                }
            }
        }
        scan.close();
        if (count==1){
            System.out.println(temp);
        } else if (count==0) {
            System.out.println("No Joyfine");
        } else if (count>1) {
            System.out.println("Many " + count);
        }
    }
}
