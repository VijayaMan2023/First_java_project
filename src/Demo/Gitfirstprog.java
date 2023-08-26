package Demo;

public class Gitfirstprog {
	int a=10;
	int b=20;
	int sum;
	
	void sum() {
		sum = a + b;
		System.out.println("Sum is : " + sum);
		
	}
	
	void sum(int c, int d) {
		c = a;
		d = b;
		sum = c + d;
		System.out.println("updated sum : " +sum);
	}

	public static void main(String[] args) {
		System.out.println("Hello Vijaya");
		Gitfirstprog obj = new Gitfirstprog();
		
		obj.sum();
		obj.sum(0, 0);
		
		
		
		

	}
}
