import java.util.Scanner;
public class App{

  void solution(int[] array) {
      
    // Use For loop to get every element 
    // Use if else 
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
