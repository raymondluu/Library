/*Raymond Luu
 *TCSS143
 *John Mayor
 *10/21/11
 */
import java.util.ArrayList;
public class Book implements Comparable<Book> {
	private final String myTitle;
	private final ArrayList<String> myAuthor = new ArrayList<String>();
	//Book constructor, throws Exception for books being blank
	public Book(String title, ArrayList<String> authors) {
		if(title == null || authors == null || title == "" || authors.size() == 0) {
			throw new IllegalArgumentException();
		}
		myTitle = title;
		myAuthor.addAll(authors);
	}
	public String getTitle() {
		return myTitle;
	}
	public ArrayList<String> getAuthors() {
		return myAuthor;
	}
	public String toString() {
		String authors = "";
		for( int i = 0; i < myAuthor.size(); i++) {
			authors += " by " + myAuthor.get(i);
		}
		return myTitle + authors;
	}
	//compares book titles
	public int compareTo(Book other) {
		int k = 0;
		//see which title is smaller
		if( getTitle().length() >= other.getTitle().length()) {
			k = other.getTitle().length();
		}
		else {
			k = getTitle().length();
		}
		for( int j = 0; j < k; j++) {
			if(getTitle().charAt(j) - other.getTitle().charAt(j) != 0) {
				return getTitle().charAt(j) - other.getTitle().charAt(j);
			}
		}
		return 0;
	}
	//compares to see if the book is exact identical
	public boolean equals(Object o) {
		// if there aren't the same amount of authors in both books return false
		if(getAuthors().size() != ((Book) o).getAuthors().size()) {
			return false;
		}
		//if the authors do not match or the book doesn't match return false
		for(int i = 0; i < getAuthors().size(); i++) {
			if(this.getAuthors().get(i) != getAuthors().get(i)){
				return false;
			}
		}
		//book and authors match so just return that the title matches
		return compareTo((Book) o) == 0;
	}
}
