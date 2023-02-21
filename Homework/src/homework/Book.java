package homework;

public class Book {

	// 책 이름, 장르, 저자, 엮은이, 출판년
	
	
	// [ 필드부 ] 
	private String name;
	private String genre;
	private String author;
	private String editor;
	private int publication;

	
	
	// [생성자부] 
	

	// [메소드부] 
	public void setName(String name) {
		this.name = name;
	}
	public void setGenre (String genre ) {
		this.genre = genre ;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public void setPublication(int publication) {
		this.publication = publication;
	}
	
	
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public String getAuthor() {
		return author;
	}
	public String getEditor() {
		return editor;
	}
	public int getPublication() {
		return publication;
	}
	
	
	public String information() {
		return "이 책의 이름은 " +  name + "이고, " + genre + "이며, 작가는 " + author + "입니다. " 
				+ "엮은이는 " + editor + "씨며, " + publication + "년도에 출판되었습니다.";
	}
	
	
	
	
}
