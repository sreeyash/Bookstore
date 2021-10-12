import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> arrangeBooksNumber(List<Book> booklist) {

		Collections.sort(booklist, (o1, o2) -> o1.getBooknumber() - o2.getBooknumber());

		return booklist;

	}

	public List<Book> arrangeBooksTile(List<Book> booklist) {

		Collections.sort(booklist, (o1, o2) -> o1.getBooktitle().compareTo(o2.getBooktitle()));

		return booklist;

	}

	public List<Book> arrangeBooksAuthor(List<Book> booklist) {

		Collections.sort(booklist, (o1, o2) -> o1.getBookauthor().compareTo(o2.getBookauthor()));
		return booklist;

	}

}
