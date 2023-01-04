import java.util.Scanner;
public class App{

  void solution(int[] array) {
      
      int len=array.length;
    
    for(int i = 0; i < len; i++) { 
      
      //  Find gratest number
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
