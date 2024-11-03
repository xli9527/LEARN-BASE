package yuekao11_3;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fn = 1;
        int sn = 1;
        int tn = 2;

        for (int i = 3; i < n; i++) {
            fn = sn;
            sn = tn;
            tn = fn +sn;
        }
        if (tn % 3 == 0){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}