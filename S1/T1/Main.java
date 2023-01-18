public class Main {
  
  public void square(int n) {
	int squaren=n*n;
	System.out.println(squaren);
	}

  public static void main(String[] args) {		
	S1T1 obj=new S1T1();
    	Scanner sc=new Scanner(System.in);
    	int x=sc.NextInt();
    	obj.square(x);

	}

}

