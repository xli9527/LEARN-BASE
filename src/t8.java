import java.util.Scanner;

public class t8 {

    public static void main(String[] args) {
        System.out.println("请输入二维数组空间大小（用空格隔开,先长后宽）");
        Scanner scan = new Scanner(System.in);
        int height = 0;     //数组长
        int width = 0;      //数组宽
        int enter= 0;       //输出换行计算
        if (scan.hasNextLine()) {
            boolean temp = true;

            String str = scan.nextLine();
            String []num = str.split(" ");  //切割

            for (String s : num) {

                if (temp) {
                    height = Integer.parseInt(s);
                    temp = false;
                } else {
                    width = Integer.parseInt(s);
                }

            }
        }
        //收集切割字符转换为数字分配进变量
        int [][]arr=new int[width][height];

        //新建数组
        if (scan.hasNext()) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    System.out.println("现在可以输入" + (i+1) + "行" + (j+1) + "列的数字");
                    arr[i][j]= Integer.parseInt(scan.next());
                }
            }
        }
        scan.close();
        System.out.println("下面是您规划的数组");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
                enter++;
                if (enter % height==0) {
                    System.out.println();
                }
            }
        }
    }




}
