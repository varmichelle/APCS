
public class Arithmetic implements Series {
	
	private int start, val, increment;
	
	public Arithmetic(int s, int i) {
		start = s;
		val = s;
		increment = i;
	}

	@Override
	public int getNext() {
		val += increment;
		return val;
	}

	@Override
	public void reset() {
		start = 0;
		val = 0;
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
