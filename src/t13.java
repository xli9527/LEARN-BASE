public class t13 {
    public double height;
    public double width;
//      长宽作为属性

    public t13(){
        height=10.5;
        width=10;
//      在构造方法初始化
    }

    public double area(){
        return height*width;
//      计算面积
    }


    public static void main(String[] args) {
        t13 tt =new t13();
        System.out.println(tt.area());
    }
//    输出数据
}
