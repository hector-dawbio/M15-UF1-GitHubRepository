package enterprisegithub;
/**
 * That class contains all the atributes about Employee
 * @author hector
 */
public class Employee{
    // Variables
    public static final double BASESALARY=800;    
    private String name;
    private double complement;
    private double salary;
    // Constructors
    public Employee(){}
    public Employee(String name, double complement) {
        this.name = name;
        this.complement = complement;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getComplement() {
        return complement;
    }
    public void setComplement(double complement) {
        this.complement = complement;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}