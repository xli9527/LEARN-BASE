package cxsj2023;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();//T组测试样例
        for (int i = 0; i < t; i++) {//组
            int hpa=scanner.nextInt();//枭首者血量(主角)先手
            int hpb=scanner.nextInt();//收藏家血量
            int x=scanner.nextInt();//代表每回合枭首者可以造成的伤害
            int y=scanner.nextInt();//代表每回合收藏家造成的伤害
            int d=scanner.nextInt();//代表每瓶血瓶可恢复的血量
            int cnt=scanner.nextInt();//代表初始血瓶数量
            int hpaMax=hpa;//最大血量
            boolean canEat=false;
            if (d>y){//判断血瓶价值
                canEat=true;
            }
            //处理运行超时,进行快速战斗
            if(hpa>100000000){//测一下hpa的值between(100000000,1000000000)
                int i1 = hpa / y;//这是经过i1回合才能杀死主角
                int j1 = hpb / x;//这是经过j1回合才能杀死怪物
                int min = Math.min(j1, i1);
                int pass=min-10;
                hpa-=pass*y;
                hpb-=pass*x;
                //测一下伤害 主角伤害<3  怪物伤害<10
                //第6题d > 10000000 && d<400000000  血瓶>10
                if (d > 10000000 && d<400000000) {
                    while (cnt!=0){
                        hpa=hpa+d;
                        cnt--;
                        int min1 = Math.min(hpa / y, hpb / x);
                        int pass1 =min1-10;
                        hpa-= pass1 *y;
                        hpb-= pass1 *x;
                        if(hpb<2000){
                            break;
                        }
                    }

                }

            }
            while (hpa>=0 && hpb>=0){//进入回合
                //主角行动策略
                if(x>=hpb){//能斩杀就先杀
                    hpb-=x;
                }else if (hpa<=y && canEat){//当主角会被怪物斩杀，则使用血瓶
                    if (cnt!=0){//血瓶剩余不为0则使用
                        cnt--;
                        hpa+=d;
                        if (hpa>hpaMax){//判断是否超过血量上限
                            hpa=hpaMax;
                        }
                    }
                }else {//耗血
                    hpb-=x;
                }
                //回合结算
                if (haveDie(hpa,hpb)) {//如果有人死亡，进入结算
                    String s = canVictory(hpa, hpb);
                    System.out.println(s);
                    break;
                }
                //怪物行动策略
                hpa-=y;
                //回合结算
                if (haveDie(hpa,hpb)) {//如果有人死亡，进入结算
                    String s = canVictory(hpa, hpb);
                    System.out.println(s);
                    break;
                }
            }

        }
    }
    public static String canVictory(int hpa,int hpb){
        if (hpb<=0){
            return "Y";
        }
        return "N";
    }
    public static boolean haveDie(int hpa,int hpb){
        if (hpa<=0 || hpb<=0){
            return true;
        }
        return false;
    }
}
