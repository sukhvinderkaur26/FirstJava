public class Employee {
    int empId;
    String name;
//    double hourlyRate;
//    double bonus;
//    int hourWorked;
//    int overTimeHours;

    public double calWages(double hourlyRate, int hourWorked)
    {
       return hourlyRate*hourWorked;
    }
    public double calWages(double hourlyRate, int hourWorked,int overTimeHours)
    {
        return calWages(hourlyRate,hourWorked)+1.25*hourlyRate*overTimeHours;
    }
    public  double calWages(double hourlyRate, int hourWorked, double bonus)
    {
        return calWages(hourlyRate,hourWorked)+bonus;
    }


}

