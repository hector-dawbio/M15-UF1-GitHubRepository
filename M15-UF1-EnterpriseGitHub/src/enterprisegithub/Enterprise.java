package enterprisegithub;
import java.util.ArrayList;
/**
 * That class contains all the atributes and metods about Enterprise
 * @author hector
 */
public class Enterprise {
    // Variables
    public static final int MAXEMPLOYEES=10;
    private String enterpriseName;
    public static ArrayList employeeList=new ArrayList(MAXEMPLOYEES);
    // Constructors
    public Enterprise(){}
    public Enterprise(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    // Getters and setters
    public String getEnterpriseName() {
        return enterpriseName;
    }
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    /**
     * Insert an employee
     * @param name
     * @param complement
     * @return the information about the employee
     */
    public static Employee addEmployee(String name,double complement){
        double salary=Employee.BASESALARY+complement;
        Employee employee = new Employee();
        employee.setName(name);
        employee.setComplement(complement);
        employee.setSalary(salary);
        return employee;
    }
    /**
     * List all the employees included into employeeList
     * @param employeeList 
     */
    public static void listEmployees(ArrayList employeeList){
        System.out.println("================== EMPLOYEES ==================");
	for (int i=0;i<employeeList.size();i++){
            System.out.println(i);
            Employee employee=(Employee)employeeList.get(i);          
            printData(employee);
	}
    }
    /**
     * Print data cointained into variable employee
     * @param employee 
     */
    public static void printData(Employee employee){
        System.out.println("================================================");
        System.out.println("Name: "+employee.getName());
        System.out.println("Salary: "+employee.getSalary());	
        System.out.println("================================================");
    }    
}   