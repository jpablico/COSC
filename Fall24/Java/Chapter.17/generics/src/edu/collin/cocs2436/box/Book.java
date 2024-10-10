package edu.collin.cocs2436.box;

/**
 * This class represents a book. Books can be put into a box, but not into a
 * SortedBox
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class Book extends Weighted {
	private final String name;

	/**
	 * Constructs a book with a given name and weight
	 * 
	 * @param name   The name of the book
	 * @param weight The weight of the book
	 */
	public Book(String name, double weight) {
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
