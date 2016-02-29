import java.util.HashSet;

class Book{
	int id;
	String name;
	String category;
	Book(int id, String name, String category){
		this.id = id;
		this.name = name;
		this.category = category;
	}
	void print(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Category "+category);
	}
	@Override
	public boolean equals(Object o){
		Book book = (Book)o;
		if(this.id==book.id && this.name.equals(book.name) && this.category.equals(book.category)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		if(category.equalsIgnoreCase("programming")){
			return 100;
		}
		else{
			return 200;
		}
	}
}
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.add(new Book(101,"Let Us C","Programming"));
		bookSet.add(new Book(101,"Let Us C","Programming"));
		bookSet.add(new Book(102,"Java","Programming"));
		bookSet.add(new Book(102,"Java","Programming"));
		bookSet.add(new Book(102,"LAN","Networking"));
		for(Book b : bookSet){
			System.out.println(b.hashCode());
			b.print();
		}
		System.out.println(bookSet);
	}

}
