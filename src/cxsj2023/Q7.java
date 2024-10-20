package cxsj2023;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int time=0;
        int freechair=0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int n= scan.nextInt();
            int m= scan.nextInt();
            int a[] =new int[n];
            for (int i = 0; i < a.length; i++) {
                if (i<m){
                    a[i]= scan.nextInt();
                }else{
                    a[i]=0;
                    freechair++;
                }
            }
            if (freechair>=2){
                time=20;

            } else if (freechair==1) {
                time=20;
                int min=a[0];
                for (int i = 0; i < a.length; i++) {
                    if (a[i]==0){
                        a[i]=999;
                    }
                    if (a[i]<min){
                        min=a[i];
                    }
                }
                time+=min;
            } else if (freechair==0) {
                int index=0;
                time=20;
                int min=a[0];
                for (int i = 0; i < a.length; i++) {
                    if (a[i]<min){
                        min=a[i];
                        index=i;
                    }
                }
                a[index]=999;
                min=a[0];
                for (int i : a) {
                    if (i<min){
                        min = i;
                    }
                }
                time+=min;
            }

        }
        scan.close();
        System.out.println(time);
    }
}
