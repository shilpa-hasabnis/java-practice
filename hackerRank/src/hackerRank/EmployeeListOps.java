package hackerRank;
import java.util.*;
import java.util.stream.Collectors;


public class EmployeeListOps {

	
	   
	   
	    public static void main(String[] args) {
	        ArrayList<Employee> emp=new ArrayList<>();
	        emp.add(new Employee("Shilpa","ENTC",123));
	        emp.add(new Employee("Pranav","BBA",134));
	        emp.add(new Employee("kedar","ENTC",60));
	        emp.add(new Employee("Rohit","Ele",006));
	       
	       emp.stream().forEach(System.out::println);
	       System.out.println("---------------------filter salary----------------------------");
	       emp.stream().filter(e->e.getEmpid() > 100).forEach(System.out::println);
	       System.out.println("---------------------display name----------------------------");
	       emp.stream().map(e->e.getName()).forEach(System.out::println);
	       System.out.println("---------------------display name starting with S----------------------------");
	       emp.stream().filter(e->e.getName().startsWith("S")).forEach(System.out::println);
	       System.out.println("---------------------display Dept----------------------------");
	       emp.stream().filter(e->e.getDept()=="ENTC").forEach(System.out::println);
	       System.out.println("---------------------display count----------------------------");
	       long empl=emp.stream().map(e->e.getEmpid()).count();
	       System.out.println(empl);
	       System.out.println("---------------------display max salary----------------------------");
	       Employee maxx=emp.stream().max(Comparator.comparing(e->e.getEmpid())).get() ;
	       System.out.println(maxx);
	       System.out.println("---------------------display min salary----------------------------");
	       Employee minn=emp.stream().min(Comparator.comparing(e->e.getEmpid())).get() ;
	       System.out.println(minn);
	    }


	     
	    
	}