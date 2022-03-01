public class Assignment2 {
    public static void main(String[] args) {
       square(4);
       areaOfRectangle(2.3f,5.6f);
       areaOfCircle(3.14f,5);
       printFullName("Sukhvinder","Kaur");
       sumOfThree(3,5,2);

    }
    public static void square(int a)
    {
        System.out.println("Square of a number is :"+a*a);
    }
    public static void areaOfRectangle(float length,float breadth)
    {
        System.out.println("Area of rectangle is :"+length*breadth);
    }
    public static void areaOfCircle(float pi,int r)
    {
        System.out.println("Area of circle is :"+pi*r*r);
    }
    public static void printFullName(String firstname, String lastname)
    {
        System.out.println("Full name is :"+firstname+" "+lastname);
    }
    public static void sumOfThree(int a,int b, int c)
    {
        System.out.println("Sum of three numbers are :"+(a+b+c));
    }
}
