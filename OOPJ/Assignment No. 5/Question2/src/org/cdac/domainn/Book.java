package org.cdac.domainn;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {
		
	}

	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s%-30s%-5d", this.author, this.title, this.publicationYear);
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.getPublicationYear()-o.getPublicationYear();
	}
	

}
