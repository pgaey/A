package homeworkrun;

import homework.Book;

public class Run_Book {

	public static void main(String[] args) {

		
		Book book = new Book();
		
		book.setName("��Űȣ��");
		book.setGenre("����Ҽ�");
		book.setAuthor("�̰� �� �������׽�");
		book.setEditor("����");
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
