import java.util.*;
import java.util.Scanner;


public class Main{
	
	// Write code here
  	//create the function here.
  
	
// Given function
public static String drinks(ele){
  if((ele%2==0) && (ele%3!=0)){
    return "Pepsi";
    }
  else if((ele%2!=0) && (ele%3==0)){
    return "Coke";
    }
  else if((ele%2==0) && (ele%3==0)){
     return "PepsiCoke";
     }
  else(ele%2==0){
	return "Pepsi";
     }
 }
	
	
//   Test code
 public static void main(String[] args){
    Main test = new Main();	//created an object of the main class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int [] array1=new int[n];
    for(int i=0;i<n;i++)
    {
	    array1[i]=sc.nextInt();
    }
   //Call the Function with object.
  
  }
  
}

