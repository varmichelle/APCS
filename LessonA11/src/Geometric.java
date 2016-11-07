
public class Geometric implements Series {
	
	private int start, val, increment;
	
	public Geometric(int s, int i) {
		start = s;
		val = s;
		increment = i;
	}

	@Override
	public int getNext() {
		val *= increment;
		return val;
	}

	@Override
	public void reset() {
		start = 1;
		val = 1;
	}

	@Override
	public void setStart(int s) {
		start = s;
		// val = s;
	}

	@Override
	public void setIncrement(int i) {
		increment = i;
	}

}
