
import java.util.*;
import java.util.Scanner;
public class Main{

  void solution(ArrayList<Integer> arrli) {
      
    // Write code here
    // Create new array list named it as narlist
    
    
    System.out.println(); //print arraylist using toString() like: narlist.toString()
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    ArrayList<Integer> arrli = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] array = new int[n]; 
    
    for(int i=0; i<n; i++)  
    {  arrli.add(sc.nextInt());  
    }  
    test.solution(arrli);
  }
}

