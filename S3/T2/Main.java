import java.util.*;
import java.util.Scanner;


public class Main{
  
	
  //write code here
  //create the function.
	
	
	
	
	
// Given function
public static String evenOdd(int ele){
  if(ele%2==0){
    return ele + ":even";
  }
  else{    
	  
    return ele + ":odd";
  }
	
// Test code
  public static void main(String[] args){
    Main test = new Main();		//created an object of the main class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int [] array1=new int[n];
    for(int i=0;i<n;i++){
	 array1[i]=sc.nextInt();
    }
   //Write here to Call the Function

  }

}

