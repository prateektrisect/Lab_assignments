import java.util.Scanner;
public class Main{

  void solution(int[] array) {
      
    // Write code here
   
    
//     print new array here
        System.out.println(Arrays.toString()) // type name of new array inside Arrays.toString()
   
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
