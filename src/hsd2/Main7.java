package hsd2;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        int other = scan.nextInt();
        int hx = scan.nextInt();
        int hy = scan.nextInt();
        int ground[][] = new int[50][50] ;
        int count =0;

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                ground[i][j] = -1;
            }
        }

        for (int i = 0; i < other; i++) {
            ground[scan.nextInt()][scan.nextInt()]= scan.nextInt();
        }

        int jump[][] = new int[8][2];

        jump[0][0] = hx+2;
        jump[0][1] = hy-1;
        jump[1][0] = hx+2;
        jump[1][1] = hy+1;
        jump[2][0] = hx+1;
        jump[2][1] = hy+2;
        jump[3][0] = hx-1;
        jump[3][1] = hy+2;
        jump[4][0] = hx-2;
        jump[4][1] = hy+1;
        jump[5][0] = hx-2;
        jump[5][1] = hy-1;
        jump[6][0] = hx-1;
        jump[6][1] = hy-2;
        jump[7][0] = hx+1;
        jump[7][1] = hy-2;

        if (ground[hx+1][hy] == -1 && width - hx >= 2){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (ground[i][j] == -1 || ground[i][j] == 0){
                        count++;
                    }
                }
            }
        } else if (ground[hx][hy + 1] == -1  && hy >= 2) {
            for (int i = 2; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    if (ground[i][j] == -1 || ground[i][j] == 0){
                        count++;
                    }
                }
            }
        } else if (ground[hx - 1][hy] == -1 && hx >= 2) {
            for (int i = 4; i < 6; i++) {
                for (int j = 0; j < 2; j++) {
                    if (ground[i][j] == -1 || ground[i][j] == 0){
                        count++;
                    }
                }
            }
        } else if (ground[hx][hy - 1] == -1 && height - hy >= 2) {
            for (int i = 6; i < 8; i++) {
                for (int j = 0; j < 2; j++) {
                    if (ground[i][j] == -1 || ground[i][j] == 0){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
