
public class FinalsPrepClass {

	protected int n;
	
	public FinalsPrepClass(int new_n) {
		System.out.println("constructor called");
		n = new_n;
	}
	
	public void set_n(int new_n) {
		n = new_n;
		System.out.println("super");
	}
	
	public void print() {
		System.out.println("Hi"+n);
	}
	
}
