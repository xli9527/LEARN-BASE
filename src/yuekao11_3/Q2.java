package yuekao11_3;

import java.util.Scanner;

public class Q2 {

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