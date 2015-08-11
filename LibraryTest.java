/*Raymond Luu
 *TCSS143
 *John Mayor
 *10/21/11
 */
import java.util.ArrayList;
public class LibraryTest {
	public static void main(String[] args) {
		Book A = warHorse();
		Book B = sonOfNeptune();
		Book C = giraffesCantDance();
		ArrayList<Book> bookList = createBookList(A, B);
		Library lib = createLibrary(bookList);
		sort(lib);
		addBook(C, lib);
		sort(lib);
		search(lib);
		Book D = noTitle(); // this should throw exception.
		addBook(D, lib);
	}
	//create a list for the books
	public static ArrayList<Book> createBookList(Book a, Book b) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(a);
		bookList.add(b);
		return bookList;
	}
	//Creates the library by passing the booklist to the library constructor
	//and displays the library
	public static Library createLibrary(ArrayList<Book> bookList) {
		Library lib = new Library(bookList);
		System.out.println("\nCreated Library:" + lib);
		return lib;
	}
	//sorts library and displays
	public static void sort(Library lib) {
		lib.sort();
		System.out.println("\nSorted Library: " + lib);
	}
	//add book to library and displays
	public static void addBook(Book newBook, Library lib) {
		lib.add(newBook);
		System.out.println("\nAdded new book: " + lib);
	}
	//search for a book title and displays results
	public static void search(Library lib) {
		System.out.println("\nSearched List: " + lib.titleSearch("The Son of Neptune"));
	}
	//Create War Horse book
	public static Book warHorse() {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Michael Morpurgo");
		Book A = new Book("War Horse", authors);
		System.out.println("New Book has been created: " + A);
		return A;
	}
	//Create The Son of Neptune book
	public static Book sonOfNeptune() {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Rick Riordan");
		Book B = new Book("The Son of Neptune", authors);
		System.out.println("New Book has been created: " + B);
		return B;
	}
	//Create Giraffes Can't Dance book
	public static Book giraffesCantDance() {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Giles Andreae");
		Book C = new Book("Giraffes Can't Dance", authors);
		System.out.println("New Book has been created: " + C);
		return C;
	}
	//Create a book with no title
	public static Book noTitle() {
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("");
		Book D = new Book("", authors);
		System.out.println("New Book has been created: " + D);
		return D;
	}
}
