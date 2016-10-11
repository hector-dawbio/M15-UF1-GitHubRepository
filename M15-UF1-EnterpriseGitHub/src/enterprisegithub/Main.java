package enterprisegithub;
import java.util.Scanner;
/**
 *
 * @author hector
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int option=0;
        String name;
        double complement=0;
        while(option!=3){
            int lenght=Enterprise.employeeList.size();
            System.out.println("================ MENU ================");
            System.out.println("1 - Insert new employee");
            System.out.println("2 - List all employees");
            System.out.println("3 - Salir");
            System.out.print("Introduzca una opcion: ");
            option=scan.nextInt();
            switch(option){
                case 1: 
                    if(lenght<10){
                         System.out.print("Name: ");
                        name=scan.next();
                        System.out.print("Complement: ");
                        complement=scan.nextInt();
                        Enterprise.employeeList.add(Enterprise.addEmployee(name,complement));                       
                    }
                    else {
                        System.out.println("Employee list is complete (10 eployee max)");
                    }
                    break;
                case 2: Enterprise.listEmployees(Enterprise.employeeList);
                    break;
                case 3: System.out.println("Exit");
                    break;
                default: System.out.println("Wrong option, please choose a correct oprion");
                    break; 
            }
        }
    }
}