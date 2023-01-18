import java.util.*;
import java.util.Scanner;


public class Main{
  void solution(int x) {
    // Write your code here
    // Remember the output should match exactly
	
    
  }
  //Test code
  //Don't change anything below this line
    public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    int[] array1=new int[n];
    for(int i=0;i<n;i++)
    {
        array1[i]=sc1.nextInt();     
    }
    for(int i=0;i<n;i++)
    {
    	test.solution(array1[i]);   
    }
  }
}
