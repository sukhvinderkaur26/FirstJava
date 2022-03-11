public class Constructor {
    private String name;
    private int age;
    private Double balance;

    public Constructor(String name) {
        this.name = name;
    }
    public Constructor()
    {
        this("sukhvinder");//calling a constructor from constructor
    }

    public Constructor(int age, Double balance) {
        this.age = age;
        this.balance = balance;
    }

//to ask from GOD father
    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Constructor cn=new Constructor();
        System.out.println(cn);

    }
}
