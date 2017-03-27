/**
 * 
 * Class Item - simulates an item in a store
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class Item {

	private int myId, myInv;
	
	/**
	 * Constructor to initialize ID and inventory amount
	 * @param id - ID of item
	 * @param inv - number of that item
	 */
	public Item(int id, int inv) {
		myId = id;
		myInv = inv;
	}
	
	/**
	 * Return ID
	 * @return ID of item
	 */
	public int getId() {
		return myId;
	}
	
	/**
	 * Return inventory
	 * @return inv of item
	 */
	public int getInv() {
		return myInv;
	}
	
	/**
	 * Comparison function for sorting order
	 * @param other - other item to compare to
	 * @return this item's id minus the other item's id
	 */
	public int compareTo(Item other) {
		return this.myId - other.getId();
	}
	
	/**
	 * Function to determine if two Items are equal
	 * @param other - other item to determine equality with
	 * @return whether the two items are equal
	 */
	public boolean equals(Item other) {
		return myId == other.getId();
	}
	
	/**
	 * Convert Item data to string format
	 * @return item data in string format
	 */
	public String toString() {
		return String.format("%10d", myId) + String.format("%10d", myInv);
	}
	
}
