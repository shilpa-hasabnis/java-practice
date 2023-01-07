package recursions;
import java.io.*;
import java.util.*;

public class max {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println( maxnum(arr,0));
    }

    public static int maxnum(int[] arr, int idx) {
      if(idx>=arr.length-1){
        return arr[idx];
      }
      

       int misa= maxnum(arr,idx+1);
        
       if(arr[idx]<misa){
         return misa;
       }
       else{
         return arr[idx];
        }
               

    }

}