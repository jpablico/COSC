package edu.collin.cocs2436.box;

import java.util.ArrayList;

public class SortedBox<T extends Weighted & Comparable<T>> extends Box<T> {

	/**
	 * Adds an item to the sorted box. This method overrides the addItem method of
	 * Box. It inserts the item being added at the position of the sorted list of
	 * items such that the sorted order is maintained. Since we start with no items
	 * and since there is no other way to add items to the list, the list will
	 * always be sorted.
	 * 
	 * @param item The item to be added to the box
	 */
	@Override
	public void addItem(T item) {
		System.out.println("adding " + item);
		int position = searchRec(getItems(), item);
		getItems().add(position, item);
	}

	/**
	 * A helper method that does binary search to find the position at which to
	 * insert a given target to preserve a sorted invariant. This is a recursive
	 * implementation of the binary search.
	 * 
	 * @param <T>    The type of the list elements. Since elements need to be
	 *               compared to each other the upper bound for this type is
	 *               Comparable<T>
	 * @param items  The list of items where the position needs to be found
	 * @param target The target element for the search.
	 * @return The found position.
	 */
	private static <T extends Comparable<T>> int searchRec(ArrayList<T> items, T target) {
		return searchRec(items, target, 0, items.size() - 1);
	}

	/**
	 * A helper method for the actual recursion
	 * 
	 * @param <T>    The type of the list elements. Since elements need to be
	 *               compared to each other the upper bound for this type is
	 *               Comparable<T>
	 * @param items  The list of items where the position needs to be found
	 * @param target The target element for the search.
	 * @param lo     The lower bound of the range to search
	 * @param hi     The upper bound of the range to search
	 * @return The found position.
	 */
	private static <T extends Comparable<T>> int searchRec(ArrayList<T> items, T target, int lo, int hi) {
		if (lo > hi) {
			return lo;
		}

		int mid = lo + (hi - lo) / 2;

		if (items.get(mid).compareTo(target) == 0) {
			return mid;
		} else if (target.compareTo(items.get(mid)) > 0) {
			return searchRec(items, target, mid + 1, hi);
		} else {
			return searchRec(items, target, lo, mid - 1);
		}
	}
}
