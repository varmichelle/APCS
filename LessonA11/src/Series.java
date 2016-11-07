
public interface Series {
	
	// return next number in the series
	int getNext();
	
	// restart the series
	void reset();
	
	// set the starting value of the series
	void setStart(int s);
	
	// set increment
	void setIncrement(int i);

}
