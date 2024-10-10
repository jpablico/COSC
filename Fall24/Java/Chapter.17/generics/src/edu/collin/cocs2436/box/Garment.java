package edu.collin.cocs2436.box;

/**
 * This class represents a garment. Garments can be put into a box, but not into
 * a SortedBox
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class Garment extends Weighted {
	private final String name;
	
	/**
	 * Constructs a garment with a given name and weight
	 * 
	 * @param name   The name of the garment
	 * @param weight The weight of the garment
	 */
	public Garment(String name, double weight) {
		super(weight);
		this.name = name;
	}

	/**
	 * An overridden toString implementation
	 */
	@Override
	public String toString() {
		return name;
	}
}
