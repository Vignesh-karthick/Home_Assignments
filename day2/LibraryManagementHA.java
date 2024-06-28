package week1.day2;

public class LibraryManagementHA {

	public static void main(String[] args) {
		
		LibraryHA lm = new LibraryHA();
		String str2 = lm.addBook("Harry potter");
		System.out.println(str2);
		lm.issueBook();

	}

}
