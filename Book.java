
public class Book {

	private int booknumber;

	private String booktitle;

	private String bookauthor;

	public Book() {

	}

	public Book(int booknumber, String booktitle, String bookauthor) {
		super();
		this.booknumber = booknumber;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
	}

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	@Override
	public String toString() {
		return "booknumber:" + booknumber + "\tbooktitle:" + booktitle + "\tbookauthor:" + bookauthor;
	}

}
