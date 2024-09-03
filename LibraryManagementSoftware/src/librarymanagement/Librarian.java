package librarymanagement;

public class Librarian extends User {
	
	public void add() {
		System.out.println("How many books you wanna add:\n");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the book name");
			books.add(sc.next());
		}
		System.out.println();
	}
	protected void view() {
		System.out.println("Added books are:\n");
		for(String s:books) {
			System.out.println(s);
		}
		System.out.println();
	}
	protected void issueBooks() {
		System.out.println("Enter how many books you want to issue");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the book name to issue: ");
			String issue=sc.next();
			for(String s:books) {
				if(s.equalsIgnoreCase(issue)) {
					issuedBooks.add(s);
					break;
				}
				else {
					System.out.println("The book you entered is not in the list");
				}
			}
		}
		System.out.println();
	}
	protected void viewIssuedBooks() {
		System.out.println("The list of issued books: \n");
		for(String s:issuedBooks) {
			System.out.println(s);
		}
	}
	protected void returnBooks() {
		System.out.println("Enter how many books you want to return");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(String s:books) {
				System.out.println("Enter the book name to return: ");
				String returned=sc.next();
				returnedBooks.add(s);
				break;
			}
		}
	}
	protected void viewReturnedBooks() {
		System.out.println("The list of returned books: \n");
		for(String s:returnedBooks) {
			System.out.println(s);
		}
	}
	protected void logout() {
		System.out.println("You Are Logged Out");
	}
	protected void menu2() {
		String choice="yes";
		while(choice.equalsIgnoreCase("yes")) {
			System.out.println("enter 1 for add books\n2 for view books\n3 for issue books\n4"
					+ " for view issued books\n5 for return books\n6 for view returned books"
					+ "\n7 for logout ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
					add();
					break;
			case 2:
					view();
					break;
			case 3:
					issueBooks();
					break;
			case 4:
					viewIssuedBooks();
					break;
			case 5:
					returnBooks();
					break;
			case 6:
					viewReturnedBooks();
					break;
			case 7:
					logout();
					break;	
			}
			System.out.println("enter yes to continue no for stop");
			choice = sc.next();
		}
	}
	
}
