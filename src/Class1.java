import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
//        int a=10;
//        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
//        emp.id=1;
//        emp.name="sukhvinder";
//        emp.address="edmonton";
//        emp.salary=20000;
//
//
//        Employee emp1=new Employee();
//        emp1.id=1;
//        emp1.name="sukhvinder";
//        emp1.address="edmonton";
//        emp1.salary=20000;
//emp.setId();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        Employee emp2=new Employee(22,"sukh",20000,"edmonton");
        Employee emp3=new Employee(12,"baaj",56000,"edmonton");
        System.out.println(emp3.getId()+emp3.getSalary());
        System.out.println(emp2);
    }


}
