package Assignment_5;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book total[] = new Book[3];
		total[0] = new Book("Daniel deofoe", "Robinson Crusoe", 15.50, 1719);
		total[1] = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		total[2] = new Book("Pat Conroy", "Beach Music", 9.50, 1996);

		for (int i = 0; i < total.length; i++) {
			System.out.println("Book title:" + total[i].getBtitle() + "\t Book author:" + total[i].getBauthor()
					+ "\t Book price in dollars:" + total[i].getBprice() + "\t Year Published: " + total[i].getYop());
		}

	}

}

class Book {
	String btitle;
	double bprice;
	int yop;
	String bauthor;

	public Book(String btitle, String bauthor, double bprice, int yop) {
		// super();
		this.btitle = btitle;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.yop = yop;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

}
