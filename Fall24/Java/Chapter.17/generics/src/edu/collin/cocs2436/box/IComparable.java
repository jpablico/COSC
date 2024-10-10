package edu.collin.cocs2436.box;

/**
 * Any class implementing this interface will have to provide a method that
 * compares instances of this class.
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 * @param <T> The type, instances of which will be compared to each other
 */
public interface IComparable<T> {
	/**
	 * Compares this object with the specified object. Returns
	 * 
	 * @param obj The object to compare this to.
	 * @return A negative integer, zero, or a positive integer as this object is
	 *         less than, equal to, or greater than the specified object.
	 */
	int compareTo(T obj);
}

//  Type-unsafe version
//public interface IComparable {
//	/**
//	 * Compares this object with the specified object. Returns a negative integer,
//	 * zero, or a positive integer as this object is less than, equal to, or greater
//	 * than the specified object.
//	 * 
//	 * @param obj The object to compare this to.
//	 * @return A negative integer, zero, or a positive integer as this object is
//	 *         less than, equal to, or greater than the specified object.
//	 */
//	int compareTo(Object obj);
//}
