package yuekao11_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 2; j < Math.sqrt(num[i]); j++) {
                if (num[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        if (flag){
            System.out.println("QAQ");
        } else {
            int gys[] = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                int tempa = num[i];
                int tempb = num[i+1];
                int temp = 0;
                do {
                    temp = tempa % tempb;
                    tempa =tempb;
                    tempb = temp;
                }while (temp != 0);

                gys[i]=tempa;
            }

            int min = gys[0];
            for (int gy : gys) {
                if (min > gy){
                    min = gy;
                }
            }

            System.out.println(min);
        }


    }
}