/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class gf3 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int test=sc.nextInt();
      for(int i=0;i<test;i++){
         List<Integer>uniq= new ArrayList<>();
         int inp=sc.nextInt();
         int wins=sc.nextInt();
         int count=0;
         String val=" ";
         int votes[]=new int[inp];
         for(int j=0;j<inp;j++){
            votes[j]=sc.nextInt();;
         }
         Arrays.sort(votes);
         int li[]=new int[10000];
         for(int k=0;k<inp;k++){
            ++li[votes[k]];
            if(!uniq.contains(votes[k])){ 
            uniq.add(votes[k]);
            count++;
            if(count==wins){
                val="JANI";
                break;
          }
            }else{
                  val="RAMYA";
                  }
         }
         System.out.println(val);      }

   }
}
