
public class FinalsPrep extends FinalsPrepClass {

	public FinalsPrep(int new_n) {
		super(new_n);
	}	
	
	public void set_n(int new_n) {
		n = new_n;
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		FinalsPrep f = new FinalsPrep(2);
		f.set_n(3);
	}

}
