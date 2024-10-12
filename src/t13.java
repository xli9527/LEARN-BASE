public class t13 {
    public double height;
    public double width;

    public t13(){
        height=10.5;
        width=10;
    }

    public double area(){
        return height*width;
    }


    public static void main(String[] args) {
        t13 tt =new t13();
        System.out.println(tt.area());
    }
}
