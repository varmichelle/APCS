/**
 * 
 * Class RoadTrip - calculates the number of miles from a list of locations
 * @author Michelle Li
 * Period 1
 *
 */

import java.io.*;
import java.util.*;

public class RoadTrip {

	ArrayList<GeoLocation> locations;
	
	/**
	 * Constructor to read in locations
	 * @param fileName - name of location file
	 */
	public RoadTrip(String fileName) {
		try {
			Scanner in = new Scanner(new File(fileName));
			locations = new ArrayList<GeoLocation>();
			while (in.hasNext()) {
				String name = in.next();
				double latitude = in.nextDouble();
				double longitude = in.nextDouble();
				addStop(name, latitude, longitude);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Add a location to list of locations
	 * @param name - name of geolocation
	 * @param latitude - latitude of geolocation (deg)
	 * @param longitude - longitude of geolocation (deg)
	 */
	public void addStop(String name, double latitude, double longitude) {
		GeoLocation city = new GeoLocation(name, latitude, longitude);
		locations.add(city);
	}
	
	/**
	 * Get the number of locations in the list
	 * @return size of list
	 */
	public int getNumberOfStops() {
		return locations.size();
	}
	
	/**
	 * Get the total distance for the trip
	 * @return distance
	 */
	public double getTripLength() {
		double distance = 0;
		for (int i = 1; i < this.getNumberOfStops(); i++) {
			GeoLocation current = locations.get(i);
			GeoLocation previous = locations.get(i-1);
			distance += current.distanceFrom(previous);
		}
		return distance;
	}
	
	/**
	 * Return data in string format
	 * (Each stop, total number of stops, total distance)
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < this.getNumberOfStops(); i++) {
			s += locations.get(i).toString() + "\n";
		}
		s += "Stops: " + this.getNumberOfStops() + "\n";
		s += "Total miles: " + this.getTripLength() + " miles\n";
		return s;
	}
	
}
