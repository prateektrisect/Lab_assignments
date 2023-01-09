
import java.util.Scanner;

public class Main{

  void solution(String str1) {
    // Write your code here
    // Remember the output should match exactly
    // Use if else with For loop
    // Check if character is z then count +1
    Int count=0;
    for(int i=0;i<str1.length;i++)
    {
      char ch=str1.charAt(i);
      if(ch=='x' || ch=='y')
      {
        int count=count+1;
      System.out.println(ch+"#"+count);
      System.ount.println(ch+"#"+count);
      }
      

  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    test.solution(st);
  }
}
