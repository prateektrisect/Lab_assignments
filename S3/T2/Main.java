import java.util.*;
import java.util.Scanner;


public class Main{
  
	
	
// Given function
void evenOdd(int ele){
  if(n%2==0){
    System.out.println(ele + ":even");
  }
  else{    
	  System.out.println(ele + ":odd");
  }
	
  //write code here
  //create the function.
	
// Test code
  public static void main(String[] args){
    Main test = new Main();		//created an object of the main class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    int [] array1=new int[n];
    for(int i=0;i<n;i++){
	 array1[i]=sc1.nextInt();
    }
   //Call the Function here

  }

}

