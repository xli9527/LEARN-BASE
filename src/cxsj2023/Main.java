package cxsj2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int time;
        String answer;
        if (scan.hasNext()){
            time = scan.nextInt();
            while ( time > 0 ){
                int hpa = scan.nextInt();
                int hpb = scan.nextInt();
                int x = scan.nextInt();
                int y = scan.nextInt();
                int d = scan.nextInt();
                int cnt = scan.nextInt();

                int rh = hpa;
                if ( d < y ){//如果血药的效果低于boss伤害，则血药无用
                    if (hpb / x <= hpa / y){
                        answer = "Y";
                    } else {
                        answer = "N";
                    }
                    //比较player与boss的击杀所需攻击次数

                }else {
                    answer = "N";
                    while (rh > 0){     //判断实际生命值是否大于零
                        if (cnt > 0 && rh <= hpa - d){      //血药使用判断
                            cnt--;
                            rh += d;
                        } else {        //满足条件加血，不满足就攻击
                            hpb-=x;
                        }
                        if (hpb <= 0){
                            answer = "Y";
                            break;
                        }
                        rh-=y;
                    }
                }
                time--;

                System.out.println(answer);
            }

        }
        scan.close();

    }
}
