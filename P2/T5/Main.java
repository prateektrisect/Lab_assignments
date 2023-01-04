public class Main{

  void solution(int n) {

    // Here testing system will provide
    // values to variable n, you don't 
    // need to assign any values to them
    
    // Write your code here
    // Complete the sample code provided below
    for(int i = 0; i <= n; i++) {            
        System.out.println();  //print i here in format given
    }
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    test.solution(n);
  }
}
