package homeworkrun;

import homework.Book;

public class Run_Book {

	public static void main(String[] args) {

		
		Book book = new Book();
		
		book.setName("돈키호테");
		book.setGenre("장편소설");
		book.setAuthor("미겔 데 세르반테스");
		book.setEditor("김경식");
		book.setPublication(1605);
		
		String name = book.getName();
		String genre = book.getGenre();
		String author = book.getAuthor();
		String moodo = book.getEditor();
		int pub = book.getPublication();
		
		String info = book.information();
		
		
		System.out.println(info);
				
		
		
	}

}
