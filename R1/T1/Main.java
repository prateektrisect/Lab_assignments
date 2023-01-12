import java.util.*;
import java.util.Scanner;
public class Main{

  void solution(int[] array) {
      
      
    // Write code here
    // Print all those numbers from this array that are multiples of 4 and fall in the range of 100 to 200 
   
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
