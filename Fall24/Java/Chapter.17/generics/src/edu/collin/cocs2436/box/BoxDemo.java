package edu.collin.cocs2436.box;

/**
 * This class demonstrates the functionality of generic Box classes, both sorted
 * and unsorted.
 * 
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class BoxDemo {

	public static void main(String[] args) {
		Box<Book> bookBox = new Box<>();
		bookBox.setName("Books");
		Box<Garment> garmentBox = new Box<>();
		garmentBox.setName("Clothes");

		System.out.println();
		bookBox.addItem(new Book("Sapiens", 1));
		bookBox.addItem(new Book("The Catcher in the Rye", 1.2));

		System.out.println();
		garmentBox.addItem(new Garment("Jill's shirt", .5));
		garmentBox.addItem(new Garment("Jack's pants", .75));

		System.out.println();
		Person jack = new Person("Jack");
		jack.unpack(garmentBox);

		System.out.println();
		Person jill = new Person("Jill");
		jill.unpack(bookBox);

		SortedBox<FileFolder> fileBox = new SortedBox<>();
		fileBox.setName("Files");

		System.out.println();
		System.out.println("Adding items to a SortedBox of FileFolder");
		fileBox.addItem(new FileFolder("Insurance", .25));
		fileBox.addItem(new FileFolder("Bills", .25));
		fileBox.addItem(new FileFolder("Medical", .25));
		fileBox.addItem(new FileFolder("Taxes", .25));
		fileBox.addItem(new FileFolder("Internet", .25));
		fileBox.addItem(new FileFolder("School", .25));

		System.out.println();
		System.out.println("SortetBox content:");
		System.out.println(fileBox);

		jill.unpack(fileBox);
	}
}
