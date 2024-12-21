package hsd3;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        char arr[] = new char[num];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            int add = 0;
            if (arr[i] != '(' && arr[i] != ')' && (arr[i] == 'A' || arr[i] == 'B')){
                if (i == 0){
                    if (arr[i+1] == arr[i]){
                        add += 2;
                    } else if (arr[i+1] == 'B') {
                        add += 1;
                    } else if (arr[i+1] == 'A') {
                        add += 1;
                    }
                } else if (i < arr.length-1) {
                    if (arr[i-1] == arr[i]){
                        add += 2;
                    } else if (arr[i-1] == 'B') {
                        add += 1;
                    } else if (arr[i-1] == 'A') {
                        add += 1;
                    }

                    if (arr[i+1] == arr[i]){
                        add += 2;
                    } else if (arr[i+1] == 'B') {
                        add += 1;
                    } else if (arr[i+1] == 'A') {
                        add += 1;
                    }
                } else {
                    if (arr[i-1] == arr[i]){
                        add += 2;
                    } else if (arr[i-1] == 'B') {
                        add += 1;
                    } else if (arr[i-1] == 'A') {
                        add += 1;
                    }
                }
            }

//            增值判定
            if (arr[i] == 'A'){
                add += 2;
            } else if (arr[i] == 'B') {
                add +=1;
            } else if (arr[i] == '(') {
                flag = true;
            } else if (arr[i] == ')') {
                flag = false;
            }
//            本体判断

            if (flag){
                add *= 2;
            }

            count += add;
        }
        System.out.println(count);
    }

}
