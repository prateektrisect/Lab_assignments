import java.util.*;
import java.util.Scanner;
public class Main{

  void solution(int[] array, int[] array1) {
      
    // Write code here
    // print new array here with this statment
    System.out.println(Arrays.toString(); // type name of new array inside Arrays.toString()
   
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n]; 
    for(int i=0; i<n; i++)  
    {  
         
        array[i]=sc.nextInt();  
    }  
     Scanner ss = new Scanner(System.in);
    int x = ss.nextInt();
    int[] array1 = new int[x]; 
    for(int i=0; i<x; i++)  
    {  
         
        array1[i]=sc.nextInt();  
    }  
    test.solution(array,array1);
  }
}
