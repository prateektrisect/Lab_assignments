import java.util.*;
import java.util.Scanner;


public class Main{
  
  public static void main(String[] args){
  //create the object of the main class
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    String[] array1=new String[n];
    for(int i=0;i<n;i++)
    {
	    array1[i]=sc1.nextLine();
    }
   //Call the Function with object.
  //test.function_name()  using format.
  }

//Given function
String countLowerCase(String m):
  int count = 0;
  for(int i = 0; i< m.length(); i++){
    if(m.charAt(i)>='a' and m.charAt(i)<='z'){
      {count = count + 1;
      }
  return ("LowerCase=" + count);
  

  // Write code here 
  //create the function and write code here.
}

