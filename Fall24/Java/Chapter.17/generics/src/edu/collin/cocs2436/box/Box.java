package edu.collin.cocs2436.box;

import java.util.ArrayList;

/**
 * This class represents a box of weighted items.
 * 
 * @author (put your name here, and your class number/section/semester)
 * @param <T> The type of items that can be put into the box. This type has an
 *            upper bound Weighted to restrict Box to only contain weighted
 *            items.
 */
public class Box<T extends Weighted> {
	private String name = "Unnamed";
	private final ArrayList<T> items = new ArrayList<>();

	/**
	 * The getter for the name
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * The setter for the name
	 * 
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A protected getter for the items
	 * 
	 * @return The items in the box
	 */
	protected ArrayList<T> getItems() {
		return items;
	}

	/**
	 * Adds an item to the box
	 * 
	 * @param item
	 */
	public void addItem(T item) {
		items.add(item);
		System.out.println(name + " added " + item + "; " + item.getWeight() + " lb");
	}

	/**
	 * Removes the last item from the box
	 * 
	 * @return The removed item
	 */
	public T removeItem() {
		T toRemove = items.remove(items.size() - 1);
		System.out.println(name + " removed " + toRemove + "; " + toRemove.getWeight() + " lb");
		return toRemove;
	}

	/**
	 * Checks if the box is empty
	 * 
	 * @return true if the box is empty and false otherwise
	 */
	public boolean isEmpty() {
		return items.isEmpty();
	}

	/**
	 * An overridden toString implementation
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (T item : getItems()) {
			builder.append(item).append("\n");
		}
		return builder.toString();
	}
}
