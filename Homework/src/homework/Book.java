package homework;

public class Book {

	// å �̸�, �帣, ����, ������, ���ǳ�
	
	
	// [ �ʵ�� ] 
	private String name;
	private String genre;
	private String author;
	private String editor;
	private int publication;

	
	
	// [�����ں�] 
	

	// [�޼ҵ��] 
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
		return "�� å�� �̸��� " +  name + "�̰�, " + genre + "�̸�, �۰��� " + author + "�Դϴ�. " 
				+ "�����̴� " + editor + "����, " + publication + "�⵵�� ���ǵǾ����ϴ�.";
	}
	
	
	
	
}
