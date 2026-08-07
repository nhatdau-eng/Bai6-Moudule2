package TechCorp;
abstract class Employee {
   protected String name;
   public Employee(String name){
    this.name = name;
   }
   public String getName(){
    return name ; 
   }
   public abstract double calculateSalary();
}
  class FullTimeEmployee extends Employee{
    private double baseSalary ;
    public FullTimeEmployee(String name ,double baseSalary){
        super(name);
        this.baseSalary = baseSalary; 
    }
    @Override
    public double calculateSalary(){
        return baseSalary;
    }
}
class PartTimeEmployee extends Employee{
    private int workingHours;
    private static final double HOURLY_RATE  = 100000; 
    public PartTimeEmployee(String name ,int workingHours){
        super(name);
        this.workingHours = workingHours; 
    }
    @Override 
    public double calculateSalary(){
        return workingHours * HOURLY_RATE; 
    }
}
class Intern extends Employee{
    private static final double ALLOWANCE = 3000000;
    public Intern(String name){
        super(name);
    }
    @Override
    public double calculateSalary(){
        return ALLOWANCE; 
    }
}
class Freelancer extends Employee{ 
    private int numberOfProjects; 
    private static final double PAYMENT_PER_PROJECT= 5000000; 
    public Freelancer(String name ,int numberOfProjects){
        super(name);
        this.numberOfProjects = numberOfProjects;
    }
    @Override 
    public double calculateSalary(){
        return numberOfProjects * PAYMENT_PER_PROJECT; 
    }
}
public class PayrollSystem{
    public static void main(String[]args) {
        Employee[] empList = {
            new FullTimeEmployee("Alice", 20000000),
            new PartTimeEmployee("long",45),
            new Intern("nhat"),
            new Freelancer("phong",6 )
        };
        System.out.println("Bang luong thang nay");
        double totalSalary = 0 ; 
        for(Employee emp : empList){
            double salary = emp.calculateSalary();
          totalSalary += salary;

            System.out.printf("Nhan vien: %-10s | Lương: %,.0f VNĐ%n",
                    emp.getName(), salary);
        }

        System.out.println("------------------------------------------");
        System.out.printf("TONG QUY LUONG : %,.0f VNĐ%n", totalSalary);
    }
}

  