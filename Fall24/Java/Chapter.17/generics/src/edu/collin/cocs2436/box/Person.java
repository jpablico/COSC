package edu.collin.cocs2436.box;

/**
 * This class represents a person that can unpack a box.
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class Person {
	private final String name;

	/**
	 * Constructs a person with a given name
	 * 
	 * @param name The name of the person
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * This method unpacks a given box
	 * 
	 * @param <T> The type of the box to unpack. This type has an upper bound Named
	 *            since Box can only contain named items.
	 * @param box The box to unpack
	 */
	public <T extends Weighted> void unpack(Box<T> box) {
		System.out.println(name + " Unpacking " + box.getName());
		double totalWeight = 0;
		while (!box.isEmpty()) {
			T item = box.removeItem();
			totalWeight += item.getWeight();
		}
		System.out.println("Total weight = " + totalWeight);
	}

	/**
	 * An overridden toString implementation
	 */
	@Override
	public String toString() {
		return name;
	}
}
