import java.util.*;

public class CarRentalDriver {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Make: ");
		String make = in.nextLine();
		System.out.println("Model: ");
		String model = in.nextLine();
		System.out.println("License plate: ");
		String licensePlate = in.nextLine();
		CarRental cr = new CarRental(make, model, licensePlate);
		cr.setCode();
		System.out.println(cr.toString());
		
		System.out.println("Make: ");
		String make2 = in.nextLine();
		System.out.println("Model: ");
		String model2 = in.nextLine();
		System.out.println("License plate: ");
		String licensePlate2 = in.nextLine();
		CarRental cr2 = new CarRental(make2, model2, licensePlate2);
		cr2.setCode();
		System.out.println(cr2.toString());
		
	}

}
