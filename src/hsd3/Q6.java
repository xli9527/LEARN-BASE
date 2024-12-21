package hsd3;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int people = scan.nextInt();
        String arr[][] = new String[num][8];
        String finarr[][] = new String[num][8];
        int score[] = new int[num];
        int indexarr[] = new int[num];
        String stemp[] = new String[8];
        int temp = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = scan.next();
            }
        }
//      输入

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < 7; j++) {
                if (arr[i][j].equals("+")){
                    score[i]++;
                }
            }
        }
//      计分

        for (int i = 0; i < indexarr.length; i++) {
            indexarr[i]=i;
        }
//      记录元素索引

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i-1; j++) {
                if (score[j] < score[j+1]){
                    temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                    temp = indexarr[j];
                    indexarr[j] = indexarr[j+1];
                    indexarr[j+1] = temp;
                }
            }
        }
//      通过分数排序
        for (int j = 0; j< num; j++) {
            for (int i = 0; i < num-j-1; i++) {
                if(Integer.parseInt(arr[indexarr[i]][7]) > Integer.parseInt(arr[indexarr[i+1]][7]) && score[i] == score[i+1]){
                    temp = score[i];
                    score[i] = score[i+1];
                    score[i+1] = temp;
                    temp = indexarr[i];
                    indexarr[i] = indexarr[i+1];
                    indexarr[i+1] = temp;
                }
            }
        }

//      分数排完的基础上通过罚时排序


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 7; j++) {
                finarr[i][j] = arr[indexarr[i]][j];
            }
        }
//      通过索引重组数组

        for (int i = 0; i < people; i++) {
            if (i != people-1){
                System.out.println(finarr[i][0]);
            } else {
                System.out.print(finarr[i][0]);
            }
        }
//       输出

    }

}
