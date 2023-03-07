import java.util.*;
import java.util.Scanner;


public class Main{
  
# Given function
void grades(int marks){
  if(marks>=90){System.out.println("Grade A");
    }
  else if(marks>=75){System.out.println("Grade B");
    }
  else if((marks>=40){System.out.println("Grade C");
  }
  else{System.out.println("Fail");
    }
    }
  //create the function and write code here.
	  
	  
	  
//    test code	  
  public static void main(String[] args){
  //create the object of the main class
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Scanner sc1 = new Scanner(System.in);
    int [] array1=new int[n];
    for(int i=0;i<n;i++)
    {
	    array1[i]=sc1.nextInt();
    }
   //Call the Function with object.
  //test.function_name()  using format.
  }
}

