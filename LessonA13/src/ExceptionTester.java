
public class ExceptionTester {

	public static void main(String[] args) {
		
		int x = 1;
		try {
			x = 2;
			System.out.println("before divison: " + x);
			System.out.println(0/0);
			x = 3;
			System.out.println("right after: " + x);
		} catch (Exception e) {
			System.out.println("catch: " + x);
			x = 4;
			System.out.println("last: " + x);
		}
		System.out.println("out: " + x);

	}
	

}
