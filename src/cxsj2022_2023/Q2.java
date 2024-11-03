package cxsj2022_2023;

import java.util.Scanner;

public class Q2 {




    public static int[] split(String str){
        int num[] = new int[2];
        String temp[] = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
             num[i]=Integer.parseInt(temp[i]);
        }
        return num;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1[] = split(scan.nextLine());
        int n2[] = split(scan.nextLine());

        int mhd =Math.abs(n1[0]-n2[0])+Math.abs(n1[1]-n2[1]);
        int qbxf =Math.max(Math.abs(n1[0]-n2[0]),Math.abs(n1[1]-n2[1]));

        System.out.println(mhd + " " + qbxf);

        scan.close();
    }
}