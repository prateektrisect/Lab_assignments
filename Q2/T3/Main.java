import java.util.Scanner;

public class Main{

  void solution(String str1) {
    // Write your code here
    // Remember the output should match exactly
    // Use if else with For loop
    // Check if character is z then count +1
    int count=0;
    int sum=0;
   for(int i=0;i<str1.length;i++)
   {
     char ch=str1.charAt(i);
     if(ch>='0' && ch<='9')
     {
       int count=count+1;
     }
     if(ch>='A' && ch<='Z')
     {
       int sum=sum+1;
     }
     
   }
    System.out.println("Digits"+"-"+count);
    System.out.println("Alphabet"+"-"+sum);
    
    
     
     
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    String st = sc.nextInt();
    test.solution(st);
  }
}
