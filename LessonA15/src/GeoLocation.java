/**
 * 
 * Class GeoLocation - holds info about a geographical location
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class GeoLocation {

	private String name;
	private double latitude, longitude;
	private final int RADIUS = 3959;
	
	/**
	 * Constructor to initialize instance variables
	 * @param name - name of location
	 * @param latitude - latitude in degrees
	 * @param longitude - longitude in degrees
	 */
	public GeoLocation(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Get name of location
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get latitude (deg) of location
	 * @return latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * Get longitude (deg) of location
	 * @return longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * Return data of GeoLocation in string format
	 * @return data in string format
	 */
	public String toString() {
		return name + "(latitude: " + latitude + ", longitude: " + longitude + ")";
	}
	
	/**
	 * Get distance from another geolocation
	 * @param other - other geolocation
	 * @return distance
	 */
	public double distanceFrom(GeoLocation other) {
		double lat1 = Math.toRadians(latitude);
		double long1 = Math.toRadians(longitude);
		double lat2 = Math.toRadians(other.latitude);
		double long2 = Math.toRadians(other.longitude);
		double theta = Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2);
		double arclength = Math.acos(theta);
		double distance = arclength * RADIUS;
		return distance;
	}
	
}
