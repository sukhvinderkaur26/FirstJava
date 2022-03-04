public class Employee {
    private String name;
   private int id;
    private int salary;
    private String address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    // default constructor
    public Employee(){
        System.out.println("Default constructor is called");
    }
    //parameterized constructor
    public Employee(int id,String name,int salary,String address){
        System.out.println("parameterized constructor");
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
