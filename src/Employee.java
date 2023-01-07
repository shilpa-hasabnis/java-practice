
public class Employee {
	    /**
	     * char = '\u0000'
	     * byte, short, int, long = 0
	     * float = 0.0f
	     * double = 0.0
	     * boolean = false
	     * reference variable = null
	     */
	    //attributes
	    private int empno;
	    private String name;
	    private float salary;
	   
	    //Constructor
	   
	    public Employee() {
	        this.empno = 1;
	        this.name = "Ram";
	        this.salary = 90000;
	    }
	   
	    public Employee(int empno, String name, float salary) {
	        this.empno = empno;
	        this.name = name;
	        this.salary = salary;
	    }
	   
	    //methods
	       
	    public void output() {
	        System.out.println("Employee no. " + empno);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}

