import java.util.Scanner;
public class App{

  void solution(int[] array) {
      
      int len=array.length;
      int[] array = new int[len]; 

   
    for(int i = 0; i < len; i++) { 
      
      // Assign value to the new Array
    }
    for(int j=0;j<len;j++) {
      
      System.out.println( );  // each element is multiplied by 10
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
