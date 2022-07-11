public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
	    
	    this(id,name,title,department);
	    this.books=books;
	    
		// your code
	}
	
	public Instructor(long id, String name, String title, String department) {
	    this(id,name,title);
	    this.department=department;
		// your code
	}
	
	public Instructor(long id, String name, String title) {
		// your code
        this(id,name);
        this.title=title;
		
	}
	
	public Instructor(long id, String name) {
		// your code
		this.id=id;
		this.name=name;
	}
	
	public String getMostRecentBookTitle() {
	    
		return books[books.length-1].getTitle();
	}
	
	public Book updateBook(int index, String title) {
	    Book oldbook= new Book();
	    oldbook.setTitle(books[index].getTitle());
	    books[index].setTitle(title);
	    return oldbook;
		// your code
	}
	
	public Book updateBook(int index, Book book) {
	    
	   Book oldbook=books[index];
	   books[index]=book;
	   return oldbook;
		// your code
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}