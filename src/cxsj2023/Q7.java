package cxsj2023;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int time = 0;
        int freechair =0 ;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int a[] = new int [n];

            for (int i = 0; i < a.length ; i++) {
                if (i < m){
                    a[i] = scan.nextInt();
                }else{
                    a[i] = 0;
                    freechair++;
                }
            }       //置入等候时间，计算空余凳子数

            if (freechair >= 2){
                time = 20;
                //凳子多于两个时

            } else if (freechair == 1) {
                time = 20;
                int min = a[0];

                for (int i = 0; i < a.length ; i++) {
                    if (a[i] == 0){
                        a[i] = 99999;
                    }
                    if (a[i] < min){
                        min = a[i];
                    }
                }
                time+= min;
                //凳子只有一把时，获得除朋友外最短等候时间

            } else if (freechair == 0) {
                int index = 0;
                time = 20;
                int min = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (a[i]<min){
                        min=a[i];
                        index=i;
                    }
                }
                a[index]=99999;
                min=a[0];
                for (int i : a) {
                    if (i<min){
                        min = i;
                    }
                }
                time+=min;
                //没有凳子时，排除最少时间，取第二短时间为目标值
            }

        }
        scan.close();
        System.out.println(time);
    }
}
