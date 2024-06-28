package week1.day2;

public class LibraryHA {

	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issues successfully");
	}
	public static void main(String[] args) {
		LibraryHA ha = new LibraryHA();
		String str = ha.addBook("Harry Potter and the goblet of fire");
		System.out.println(str);
		ha.issueBook();

	}
	

}
