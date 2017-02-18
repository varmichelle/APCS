public class LifeDriver2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Life2 l = new Life2("life100.txt");
		l.printMatrix();
		//System.out.println("Neighbors of 3, 1 = " + l.numberOfNeighbors(2, 0));
		for (int i = 0; i < 5; i++) {
			l.generation();
			l.printMatrix();
		}
		//l.printStatistics();
		for (int i = 0; i < 10; i++){
			l.generation();
			l.printMatrix();
		}
		l.printStatistics();
	}

}