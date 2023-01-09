import java.util.Scanner;

public class Main{

  void solution(String str1) {
    // Write your code here
    // Remember the output should match exactly
   
  
    For(int i=0;i<str1.length();i++)
  {
    Char ch=str1.charAt(i);
    if(ch>='a' && ch<='z')
    {
      System.out.println(ch+":"+"small")
    }
    
   if( ch>='A' && ch<='Z')
    {
      System.out.println(ch+":"+"capital")
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
