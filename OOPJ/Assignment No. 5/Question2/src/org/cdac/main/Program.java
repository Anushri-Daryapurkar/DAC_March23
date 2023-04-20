package org.cdac.main;

import java.util.Arrays;
import java.util.Collections;

import org.cdac.domainn.Book;

public class Program {

	private static Book[] getBook() {
		// TODO Auto-generated method stub
		Book[] b = new Book[5];
		b[0] = new Book("War and Peace", "Leo Tolstoy", 2021);
		b[1] = new Book("A Women's Life", "Guy da Maupassant", 1880);
		b[2] = new Book("Death of a City", "Amrita Pritam", 1876);
		b[3] = new Book("Oliver Twist", "Charles Darwin", 1881);
		b[4] = new Book("A Tale of Two Cities", "Charles Darwin", 2000);
		return b;
	}
	
	private static void sortBooks(Book[] b) {
		// TODO Auto-generated method stub
		b = Program.getBook();
		Arrays.sort(b);
		Program.printBooks(b);
	}
	
	private static void printBooks(Book[] b) {
		// TODO Auto-generated method stub
		if(b != null) {
			for(Book book : b)
				System.out.println(book);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = Program.getBook();
		Program.sortBooks(b);

	}




	
	

	

	

	

	

}
