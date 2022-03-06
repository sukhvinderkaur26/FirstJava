public class Constructor {
    private String name;
    private int age;
    private Double balance;

    public Constructor(String name) {
        this.name = name;
    }
    public Constructor()
    {
        this("sukhvinder");
    }

    public Constructor(int age, Double balance) {
        this.age = age;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

    }
}
