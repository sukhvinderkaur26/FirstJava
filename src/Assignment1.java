public class Assignment1 {
    public static void main(String[] args) {
        int square = square(4);
        System.out.println("Square of given number is :"+square);
        float rectangle = areaOfRectangle(5.6f, 6);
        System.out.println("Area of rectangle is :"+ rectangle);
        float circle = areaOfCircle(3.14f, 4);
        System.out.println("Area of circle is :"+ circle);
        String fullName = printFullName("sukhvinder", "kaur");
        System.out.println("Full name is :"+fullName);
        int sum = sumOfThree(2, 1, 3);
        System.out.println("Sum of three numbers are :"+sum);
    }

        public static int square(int a)
    {
        return a*a;
    }
    public static float areaOfRectangle(float length,float breadth)

    {
        return length*breadth;
    }
    public static float areaOfCircle(float pi, int r)

    {
        return pi*r*r;
    }
    public static String printFullName(String firstName, String lastName)
    {
       return firstName + " " + lastName;
    }
    public static int sumOfThree(int a,int b,int c)
    {
        return a+b+c;
    }

}
