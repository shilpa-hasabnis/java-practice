package hackerRank;
import java.util.*;

public class ArrayListOPs {
    public static void main(String[] args) {
      ArrayList<Integer> trial = new ArrayList<>();
      trial.add(10);
      trial.add(40);
      trial.add(45);
      trial.add(15);
      trial.add(17);
      
      System.out.println(trial+"As an ArrayList");
      for(Integer i:trial){
        System.out.print(i +" \n   As normal printing what can i say");
      }
      
      System.out.println("==========================Print===============================");
      //trial.remove(2); to remove
      
      ArrayList<Integer>trialClone=(ArrayList<Integer>) trial.clone();
      
     trialClone.forEach(name -> System.out.println(name+10));
      trialClone.forEach(name -> System.out.println(name*10));

      //Using foreach with lambda expression
      System.out.println("============================Clone=============================");

      
       Collections.sort(trial);   
      for(int i = 0; i < trial.size(); i++) 
      {
          System.out.println(trial.get(i));
      }   
      
      
        System.out.println(trialClone.subList(2, trialClone.size())); 
        
      System.out.println("============================Sort=============================");

      System.out.println(Collections.min(trial));   
      
      System.out.println("==========================min===============================");

      System.out.println(Collections.max(trial));   

      System.out.println("==========================max===============================");

//Using Stream
    //Min Value
    Integer minn=trial.stream().min(Comparator.comparing(Integer::valueOf)).get() ;
    System.out.println("By Stream min"+ minn);
  
     //Max Value
    Integer maxx=trial.stream().max(Comparator.comparing(Integer::valueOf)).get() ;
    System.out.println("By Stream max"+ maxx);
    
    //filter
    
    ArrayList<Integer> nums=new ArrayList<>();
    System.out.println("using stream num could be divided by 10 with scope printing");
    trialClone.stream().filter(n->n%10==0).forEach(System.out::println);
    
    
    }
}
