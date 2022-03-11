public class StaticClass {
    public static double PI;

    //    Static block
    static {
        PI = 3.14;
    }

    private double radius;

    public double area() {
        return PI * radius * radius;
    }

    public StaticClass(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {

//        StaticClass circle=new StaticClass(4);
//        System.out.println(circle.area());
        StaticClass circle = new StaticClass(23);
        System.out.println(circle.area());
    }

}


