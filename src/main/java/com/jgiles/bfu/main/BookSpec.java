package com.jgiles.bfu.main; 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookSpec extends AuthoredTxtSpec {
	private String isbn;

	public BookSpec(String isbn, Language language, int pages, String audience,
			String condition, String location, String status, String genre, String subgenre,
			String title) {

		super(language, pages, audience, condition, location, genre, subgenre,
			title, status);

		this.isbn = isbn;
	}	


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//This search is seriously broken
	public boolean matches(BookSpec otherSpec) {
		
			if(!super.matches(otherSpec)) return false;
			if(!(otherSpec instanceof BookSpec)) return false;
			//Include the check for null for multiple matches
			BookSpec spec = (BookSpec)otherSpec;
			if(isbn != spec.getIsbn()) return false;

			return true;
	}

}
