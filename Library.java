/*Raymond Luu
 *TCSS143
 *John Mayor
 *10/21/11
 */
import java.util.ArrayList;
public class Library {
	private ArrayList<Book> myBookList = new ArrayList<Book>();
	public Library() {
	}
	public Library(ArrayList<Book> otherBookList) {
		for(int i = 0; i < otherBookList.size(); i++) {
			myBookList.add(otherBookList.get(i));
		}
	}
	public boolean add(Book newBook) {
		myBookList.add(newBook);
		return newBook != null;
	}
	public ArrayList<Book> titleSearch(String title) {
		ArrayList<Book> tempList = new ArrayList<Book>();
		tempList.addAll(myBookList);
		for(int i = tempList.size() - 1; i >= 0; i--) {
			if(!tempList.get(i).getTitle().equals(title)) {
				tempList.remove(i);
			}
		}
		return tempList;
	}
	public void sort() {
		for(int i = 0; i < myBookList.size(); i++) {
			for( int j = 0; j < myBookList.size(); j++) {
				if( myBookList.size() - 1 == j) {
					break;
				}
				if(myBookList.get(i).compareTo(myBookList.get(j)) < 0) {
					Book temp = myBookList.get(j);
					myBookList.set(j, myBookList.get(i));
					myBookList.set(i, temp);
				}
			}
		}
	}
	public String toString() {
		String bookList = "";
		for( int i = 0; i < myBookList.size(); i++) {
			bookList += "\n" + myBookList.get(i);
		}
		return bookList;
	}
}
