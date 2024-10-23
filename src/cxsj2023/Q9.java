package cxsj2023;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        if (scan.hasNext()){
            int n = scan.nextInt();
            if (n % 2 != 0){
                n--;
            }

            for (int i = -n+1; i < n; i++) {
                String a[] = new String[7*n];

                for (int j = 0; j < a.length; j++) {
                    a[j]=" ";
                }

                int index = ( n - 1 ) - Math.abs(i) ;

                a[index]="*";
                a[a.length-1-index]="*";

                for (int j = 0; j < a.length; j++) {
                    if ((i == -n+1 || i == n-1) && (j<3*n || j>=4*n) ){
                        a[j]="*";
                    }
                }

                if (i <= - ( n/2 ) || i >= ( n/2 ) ){
                    a[index+(3*n-1)]="*";
                    a[a.length-index-3*n]="*";
                }
                for (String string : a) {
                    System.out.print(string);
                }

                System.out.println();
            }
        }
        scan.close();
    }
}
