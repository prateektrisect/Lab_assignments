import java.util.Scanner;
import java.io.*; 
import java.util.*; 
public class Main{

  void solution(int[] array) {
      
     int len = array.length;
    for(int i = 0; i < len; i++) { 
    
    
      // Write code here
      // access element from given array
      // Print the number which is nearest to 1000.
      
    }
    System.out.println(); // print max value here
   
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
    test.solution(array);
  }
}
