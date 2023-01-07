import java.util.Scanner;

 

public class ClientEmployee {

 

    public static void main(String[] args) {
        //Object creation
        //Job of constructor is to initialize values of object &
        //not creating object.
        
        Scanner scInput = new Scanner(System.in);
        
        int empno = 0;
        String name = null;
        float salary = 0.0f;
        
        Employee employee = null;//1
        Employee emp = null;//2

 

        System.out.print("Enter emp no.: ");
        empno = scInput.nextInt();
                scInput.nextLine();
                
        System.out.print("Enter name: ");
        name = scInput.nextLine();
               
        System.out.print("Enter Salary: ");
        salary = scInput.nextFloat();
        
        employee = new Employee(empno, name, salary);
        
        System.out.print("Enter emp no.: ");
        empno = scInput.nextInt();
                scInput.nextLine();
                
        System.out.print("Enter name: ");
        name = scInput.nextLine();
               
        System.out.print("Enter Salary: ");
        salary = scInput.nextFloat();
        
        emp = new Employee(empno, name, salary);
        
        //Printing object
        employee.output();
        emp.output();
        
        //emp.empno = 10;
        emp.output();
        
        Employee e1 = new Employee();
        e1.output();
        
        System.out.println(employee);
        System.out.println(emp);
        
        scInput.close();
    }

 

}