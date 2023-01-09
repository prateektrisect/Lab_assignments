import java.util.Scanner;
public class Main{

  void solution(int[] array) {
      
     int len = array.length;
     int[] newarray = new int[len];

    for(int i = 0; i < len; i++) { 
      // Write code here
      // access element from given array
      // each element is multiplied by 10
      // Assign value to the new Array
      
      
    }
    for(int j = 0; j < len; j++) {
      
      System.out.println(); // print elements of new array 
    }
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    App test = new App();
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
