package edu.collin.cocs2436.box;

/**
 * This class represents a file folder. File folders can be put both into a box
 * and into a SortedBox
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class FileFolder extends Weighted implements Comparable<FileFolder> {
	private final String name;

	/**
	 * Constructs a file folder with a given name
	 * 
	 * @param name   The name of the file folder
	 * @param weight The weight of the file folder
	 */
	public FileFolder(String name, double weight) {
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

	/**
	 * Overrides the compareTo() method of Comparable interface to compare
	 * FileFolder instances
	 */
	@Override
	public int compareTo(FileFolder fileFolder) {
		return name.compareTo(fileFolder.name);
	}
}
