package hackerRank;

public class Employee{
 
	 private String name;
      private String dept;
      private Integer empid;

      
      public Employee(String name, String dept, Integer empid) {
        super();
        this.name = name;
        this.dept = dept;
        this.empid = empid;
    }
      
       public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDept() {
        return dept;
    }
 
    public void setDept(String dept) {
        this.dept = dept;
    }
 
    public Integer getEmpid() {
        return empid;
    }
 
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", empid=" + empid + "]";
	}
    
    }