package arrays;
/**
 * 
 */

/**
 * @author Shilpa
 *
 */
import java.util.*;

public class PossibleTriangle {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     int[] arr=new int[a];
     for(int i=0;i<a;i++){
     arr[i]=sc.nextInt();
     }
      int count=numTriangle(arr,a);
      System.out.println(count);;
     }
     
     public static int numTriangle(int[] arr,int a){
       Arrays.sort(arr);
       int count=0;
       for(int i=0;i<a;i++){
         for(int j=i+1;j<a;j++){
           for(int k=j+1;k<a;k++){
             if(arr[i]+arr[j]>arr[k]&&arr[k]+arr[j]>arr[i]&&arr[i]+arr[k]>arr[j]){
               count++;
             }
           }
       }
     }
            return count;

    }
}

//input 4  4 3 6 7