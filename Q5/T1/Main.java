import java.util.Scanner;
import java.io.*; 
import java.util.*; 
public class Main{

  void solution(int[] array) {
      
     int len = array.length;
     int[] newarray = new int[len];

    for(int i = 0; i < len; i++) { 
    
    
      // Write code here
      // access element from given array
      // each element is multiplied by 10
      // Insert value to the new Array
      
      
    }
    System.out.println(Arrays.toString();// type name of new array inside Arrays.toString()
   
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
