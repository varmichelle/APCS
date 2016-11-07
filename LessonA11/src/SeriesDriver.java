
public class SeriesDriver {
	
	public static void main(String[] args) {
		
		Arithmetic aSeries = new ByTwos();
		System.out.println("Arithmetic sequence by twos");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.println(aSeries.getNext());
		
		aSeries = new ByThrees();
		System.out.println("Arithmetic sequence by threes");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.print(aSeries.getNext() + ", ");
		System.out.println(aSeries.getNext());
		
		Geometric gSeries = new MultiplesOfThree();
		System.out.println("Geometric sequence by threes");
		System.out.print(gSeries.getNext() + ", ");
		System.out.print(gSeries.getNext() + ", ");
		System.out.print(gSeries.getNext() + ", ");
		System.out.print(gSeries.getNext() + ", ");
		System.out.print(gSeries.getNext() + ", ");
		System.out.println(gSeries.getNext());
		
	}

}
